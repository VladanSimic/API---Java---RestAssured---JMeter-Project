package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import pages.utils.CommonComponentsAndActions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class ConstructionDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ConstructionDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Year Built']/../../../../../..//input")
    WebElement yearBuiltInput;
    @FindBy(xpath = "//font[text()='Year Built']/../../../../../..//input")
    List<WebElement> yearBuiltInputFont;
    @FindBy(xpath = "//font[text()='Year Built']/../../../../../../..//input")
    List<WebElement> yearBuiltInputFonGREEN;
    @FindBy(xpath = "//div[text()='Year Renovated']/../../../../../..//input")
    WebElement yearRenovated;
    @FindBy(xpath = "//div[text()='Square Footage (Heated)']/../../../..//input")
    WebElement squareFootageHeated;
    @FindBy(xpath = "//div[text()='Protection Class']/../../../..//input[contains(@aria-hidden,'false')]")
    WebElement protectionClass;
    @FindBy(xpath = "//div[text()='BCEG']/../../../..//input[@aria-hidden='false']")
    List<WebElement> bcegSelect;
    @FindBy(xpath = "//div[contains(text(),'Square Footage')]/../../../../div//input")
    WebElement squareFootage;
    @FindBy(xpath = "//font[contains(text(),'Square Footage')]/../../../../../..//input")
    List<WebElement> squareFootageFont;
    @FindBy(xpath = "//font[contains(text(),'Square Footage')]/../../../../../../..//input")
    List<WebElement> squareFootageFontGREEN;
    @FindBy(xpath = "//font[text()='Number of Floors at the Risk Location']/../../../../../..//input")
    List<WebElement> numberOfFloorsAtRiskLocationFont;
    @FindBy(xpath = "//font[text()='Number of Floors at the Risk Location']/../../../../../../..//input")
    List<WebElement> numberOfFloorsAtRiskLocationFontGREEN;
    @FindBy(xpath = "//div[text()='Number of Floors at the Risk Location']/../../../../../..//input")
    WebElement numberOfFloorsAtRiskLocation;
    @FindBy(xpath = "//div[contains(text(),'The floor on which')]/../../../../div//input")
    WebElement riskLocatedFloor;
    @FindBy(xpath = "//*[text()='Construction Type']/../../../..//input")
    WebElement constructionTypeSelect;
    @FindBy(xpath = "//*[text()='Planned Construction Type']/../../../..//input")
    WebElement plannedConstructionType;
    @FindBy(xpath = "//font[contains(text(),'Construction Type')]/../../../../../..//input")
    List<WebElement> constructionTypeFont;
    @FindBy(xpath = "//font[contains(text(),'Construction Type')]/../../../../../../..//input")
    List<WebElement> constructionTypeFontGREEN;
    @FindBy(xpath = "//div[text()='Year HVAC Updated']/../../../..//input")
    WebElement yearHvacUpdated;
    @FindBy(xpath = "//div[text()='Year Plumbing Updated']/../../../..//input")
    WebElement yearPlumbingUpdated;
    @FindBy(xpath = "//div[text()='Year Roof Replaced']/../../../..//input")
    WebElement yearRoofReplaced;
    @FindBy(xpath = "//div[text()='Year Electric Updated']/../../../..//input")
    WebElement yearElectricUpdated;
    @FindBy(xpath = "//div[text()='Manager BCEG override']/../../../../div/..//input")
    WebElement managerBCEGOverrideYes;
    @FindBy(xpath = "//div[text()='Barrier Island Indicator']/../../../../div/..//input")
    WebElement barrierIslandIndicator;
    @FindBy(xpath = "//div[text()='Barrier Island Indicator override']/../../../../div/..//input")
    WebElement barrierIslandIndicatorOverride;
    @FindBy(xpath = "//div[text()='Manager DTC override']/../../../../div/..//input")
    WebElement managerDTCOverride;
    @FindBy(xpath = "//div[text()='Extreme 10 Protection Class']/../../../../div/..//input")
    WebElement extreme10ProtectionClass;
    @FindBy(xpath = "//div[text()='BCEG Override']/../../../..//input")
    WebElement bcegOverride;
    @FindBy(xpath = "//div[text()='Manager PPC override']/../../../..//input")
    WebElement managerPPCOverride;
    @FindBy(xpath = "//div[text()='Protection Class Override']/../../../..//input")
    WebElement protectionClassOverride;
    @FindBy(xpath = "//div[text()='Distance to Coast override']/../../../..//input")
    WebElement distanceToCoastOverride;
    @FindBy(xpath = "//div[text()='Certified Inspection']/../../../..//div//label[text()='Yes']/..//input")
    WebElement certifiedInspectionYes;
    @FindBy(xpath = "//div[text()='Certified Inspection']/../../../..//div//label[text()='No']/..//input")
    WebElement certifiedInspectionNo;
    @FindBy(xpath = "//div[text()='Date']/../../../..//input")
    WebElement certifiedInspectionDate;
    @FindBy(xpath = "//*[text()='Exterior Wall Coverings']/../../../..//input")
    WebElement exteriorWallCoverings;
    @FindBy(xpath = "//div[contains(text(),'Is the home supported')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isHomeSupportedYes;
    @FindBy(xpath = "//div[contains(text(),'Is the home located on a grade that is > 20º in slope?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isHomeLocatedOnAGradeYes;
    @FindBy(xpath = "//div[contains(text(),'Is the home located on a grade that is > 20º in slope?')]/../../../../div//label[text()='No']/..//input")
    WebElement isHomeLocatedOnAGradeNo;
    @FindBy(xpath = "//div[contains(text(),'Is the home supported')]/../../../../div//label[text()='No']/..//input")
    WebElement isHomeSupportedNo;
    @FindBy(xpath = "//div[contains(text(),'Is this a handcrafted')]/../../../../div//label[text()='Yes']/..//input")
    WebElement handcraftedHomeYes;
    @FindBy(xpath = "//div[contains(text(),'Is this a handcrafted')]/../../../../div//label[text()='No']/..//input")
    WebElement handcraftedHomeNo;
    @FindBy(xpath = "//div[contains(text(),'Barrier Island Indicator override')]/../../../../div//input")
    WebElement barrierIslandOverride;
    @FindBy(xpath = "//div[contains(text(),'Is the home retrofitted for Earthquake?')]/../../../../div//label[text()='No']/..//input")
    WebElement isHomeRetrofittedForEarthquakeNo;
    @FindBy(xpath = "//div[contains(text(),'Is the home retrofitted for Earthquake?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isHomeRetrofittedForEarthquakeYes;
    @FindBy(xpath = "//div[contains(text(),'residence have a basement')]/../../../../div//label[text()='No']/..//input")
    WebElement residenceHaveBasementNo;
    @FindBy(xpath = "//div[contains(text(),'residence have a basement')]/../../../../div//label[text()='Yes']/..//input")
    WebElement residenceHaveBasementYes;
    @FindBy(xpath = "//*[text()='Distance to Coast override']/../../../..//input")
    WebElement distanceToCoastWE;
    @FindBy(xpath = "//*[text()='Foundation Type']/../../../..//input")
    List<WebElement> foundationType;
    @FindBy(xpath = "//p[text()='Foundation Type']/../../../../..//input")
    List<WebElement> foundationTypeP;
    @FindBy(xpath = "//div[text()='Territory']/../../../..//input")
    WebElement territory;
    @FindBy(xpath = "//div[text()='Territory']/../../../..//input")
    WebElement ratingZone;
    @FindBy(xpath = "//div[text()='Planned Enclosure Date']/../../../..//input")
    WebElement plannedEnclosureDate;
    @FindBy(xpath = "//div[text()='Planned Completion Date']/../../../..//input")
    WebElement plannedCompletionDate;
    @FindBy(xpath = "//div[text()='Planned Structural Changes (underwriting only)']/../../../..//input")
    WebElement plannedStructuralChanges;
    @FindBy(xpath = "//div[text()='Planned Total Square Footage']/../../../..//input")
    WebElement plannedTotalSquareFootage;
    @FindBy(xpath = "//div[text()='Project Description']/../../../../div")
    WebElement projectDescriptionMandatory;
    @FindBy(xpath = "//div[contains(text(),'Basement Finish is')]/../../../../div/..//input")
    WebElement basementFinishIs;
    @FindBy(xpath = "//div[contains(text(),'Basement Finish Quality')]/../../../../div/..//input")
    WebElement basementFinishQuality;
    @FindBy(xpath = "//font[contains(text(),'Total Basement Square')]/../../../../../../..//input")
    WebElement totalBasementSquareFootageFont;
    @FindBy(xpath = "//div[text()='Project Description']/../../../..//textarea")
    WebElement projectDescription;
    @FindBy(xpath = "//div[contains(text(),'Barrier Island')]/../../../../div//label[text()='Yes']/..//input")
    List<WebElement> barrierIslandYes;
    @FindBy(xpath = "//div[contains(text(),'Barrier Island')]/../../../../div//label[text()='No']/..//input")
    List<WebElement> barrierIslandNo;
    @FindBy(xpath = "//div[contains(text(),'LEED Certified')]/../../../../div//label[text()='Yes']/..//input")
    WebElement leedCertifiedYes;
    @FindBy(xpath = "//div[contains(text(),'LEED Certified')]/../../../../div//label[text()='No']/..//input")
    WebElement leedCertifiedNo;
    @FindBy(xpath = "//div[text()='Manager DTC override']/../../../../div/..//input")
    WebElement managerDTCOverrideHS;
    @FindBy(xpath = "//div[text()='Is the home beachfront (500 feet or less from saltwater)']/../../../../div//label[text()='No']/..//input")
    WebElement beachFrontNo;

    public void fillBasicConstructionDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("construction details");
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                setYearBuilt(data.get("Year_Built"));
                setProtectionClass(data.get("Protection_Class"));
                residenceHaveBasement(data);
                switch (data.get("State")) {
                    case "AK": {
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        setConstructionType(data.get("Construction_Type"));
                        setCertifiedInspection(data.get("Certified_Inspection"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date"));
                    }
                    break;
                    case "AR":
                    case "IL":
                    case "IN":
                    case "KY": {
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        setConstructionType(data.get("Construction_Type"));
                    }
                    break;
                    case "AZ":
                    case "WY": {
                        setSquareFootageFont(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                    }
                    break;
                    case "CO":
                    case "ID": {
                        setSquareFootage(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        setIsHomeSupported(data.get("Is_Home_Supported"));
                    }
                    break;
                    case "IA":
                    case "DC":
                    case "NE":
                    case "NH":
                    case "CT":
                    case "MA":
                    case "NJ":
                    case "NY":
                    case "SC": {
                        setSquareFootage(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        if (!hasValue(USER) || !USER.equalsIgnoreCase("BROKER")) {
                            setBeachFront();
                        }
                    }
                    break;
                    case "MN":
                    case "MO":
                    case "WI": {
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                    }
                    break;
                    case "KS": {
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                    }
                    break;
                    case "MT":
                    case "NM": {
                        setSquareFootage(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                    }
                    break;
                    case "ND": {
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionType(data.get("Construction_Type"));
                    }
                    break;
                    case "NV": {
                        setSquareFootageFont(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                    }
                    break;
                    case "OR": {
                        setSquareFootageFont(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        setIsHomeSupported(data.get("Is_Home_Supported"));
                    }
                    break;
                    case "OH":
                    case "PA":
                    case "VT":
                    case "AL":
                    case "LA":
                    case "MD":
                    case "VA":
                    case "GA":
                    case "MI":
                    case "WV": {
                        setYearRenovated(data.get("Year_Built_Renovated"));
                        setSquareFootage(data.get("Square_Footage"));
                        setConstructionType(data.get("Construction_Type"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                    }
                    break;
                    case "OK": {
                        setSquareFootageFont(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                    }
                    break;
                    case "RI":
                    case "HI":
                    case "FL": {
                        setSquareFootageFont(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                    }
                    break;
                    case "SD": {
                        setSquareFootage(data.get("Square_Footage"));
                        setConstructionType(data.get("Construction_Type"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                    }
                    break;
                    case "TN":
                    case "NC":
                    case "TX": {
                        setSquareFootageFont(data.get("Square_Footage"));
                        setConstructionType(data.get("Construction_Type"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                    }
                    break;
                    case "UT": {
                        setSquareFootageFont(data.get("Square_Footage"));
                        setConstructionType(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setLEEDCertifiedHome(data.get("Construction_Details_Home_LEED_Certified"));
                    }
                    break;
                    case "WA": {
                        setSquareFootageFont(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        setIsHomeSupported(data.get("Is_Home_Supported"));
                    }
                    break;
                    case "CA": {
                        setSquareFootageFont(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        setIsHomeSupported(data.get("Is_Home_Supported"));
                        setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake"));
                    }
                    break;
                    case "DE":
                    case "MS": {
                        setSquareFootage(data.get("Square_Footage"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                    }
                    break;
                    case "ME": {
                        setSquareFootage(data.get("Square_Footage"));
                        setConstructionType(data.get("Construction_Type"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                        setIsThisAHandcraftedHome(data.get("Handcrafted_Home"));
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                setYearBuilt(data.get("Year_Built"));
                setProtectionClass(data.get("Protection_Class"));
                pause(3000);
                clickElement(saveChanges);
                if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                    setSquareFootage(data.get("Square_Footage"));
                } else {
                    setSquareFootageFont(data.get("Square_Footage"));
                }
                if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                    setSquareFootage(data.get("Square_Footage"));
                } else {
                    setSquareFootageFont(data.get("Square_Footage"));
                }
                if (isVisibleOnly(By.xpath("//font[text()='Number of Floors at the Risk Location']/../../../../../..//input"))) {
                    setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors"));
                } else {
                    setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                }
                setTheFloorOnWhichRiskIsLocated(data.get("Risk_Located_Floor"));
                if (isVisibleOnly(By.xpath("//*[text()='Construction Type']/../../../..//input"))) {
                    setConstructionType(data.get("Construction_Type"));
                } else {
                    setConstructionTypeFont(data.get("Construction_Type"));
                }
                if (!hasValue(USER) || !USER.equalsIgnoreCase("BROKER")) {
                    setBeachFront();
                }
                switch (data.get("State")) {
                    case "AZ":
                    case "NV":
                    case "NM":
                    case "MT":
                    case "UT":
                    case "WY": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                    }
                    break;
                    case "OR":
                    case "ID": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        setIsHomeSupported(data.get("Is_Home_Supported"));
                    }
                    break;
                    case "AK": {
                        setCertifiedInspection(data.get("Certified_Inspection"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date"));
                    }
                    break;
                    case "WA": {
                        setIsHomeSupported(data.get("Is_Home_Supported"));
                    }
                    break;
                    case "CA": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        setIsHomeSupported(data.get("Is_Home_Supported"));
                        setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake"));
                    }
                    break;
                    case "FL":
                    case "SC": {
                        setBceg(data.get("BCEG"));
                    }
                    break;
                }
            }
            break;
        }
        setOptionalConstructionDetailsWrapped(data);
        setDistanceToCoastOverride(data.get("Construction_Details_Distance_To_Coast_Override"));
        saveChanges();

        checkProtectionClassIsEntered(data.get("Protection_Class"));
    }

    private void checkProtectionClassIsEntered(String protectionClassValue) throws Throwable {
        try {
            if (!protectionClass.getAttribute("value").equalsIgnoreCase(protectionClassValue)) {
                clickElement(protectionClass, "Protection Class");
                pause(1000);
                typeTextEnter(driver.switchTo().activeElement(), protectionClassValue, "Protection Class");
                clickFooter();
                saveChanges();
                pause(3500);
                if (!protectionClass.getAttribute("value").equalsIgnoreCase(protectionClassValue)) {
                    clickFooter();
                    clickElement(protectionClass);
                    pause(2000);
                    try {
                        clickElement(dropdownOptions.get(1));
                    } catch (Exception e) {
                        clickFooter();
                        clickElement(protectionClass);
                        clickElement(dropdownOptions.get(0));
                    }
                    clickFooter();
                }
                saveChanges();
            }
        } catch (Exception ignored){}
    }

    public void fillBasicConstructionDetails_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("construction details");
        switch (data.get("Residence_Type_END")) {
            case "Homeowner": {
                setYearBuilt(data.get("Year_Built_END"));
                setProtectionClass(data.get("Protection_Class_END"));
                residenceHaveBasement(data);
                switch (data.get("State_END")) {
                    case "AK": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                        setConstructionType(data.get("Construction_Type_END"));
                        setCertifiedInspection(data.get("Certified_Inspection_END"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date_END"));
                    }
                    break;
                    case "AR":
                    case "IL":
                    case "IN":
                    case "KY": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                        setConstructionType(data.get("Construction_Type_END"));
                    }
                    break;
                    case "AZ":
                    case "WY": {
                        setSquareFootageFont(data.get("Square_Footage_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                    }
                    break;
                    case "CO":
                    case "ID": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_END"));
                    }
                    break;
                    case "IA":
                    case "DC":
                    case "NE":
                    case "NH":
                    case "CT":
                    case "MA":
                    case "NJ":
                    case "NY":
                    case "SC": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                    }
                    break;
                    case "MN":
                    case "MO":
                    case "WI": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                    }
                    break;
                    case "KS": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                    }
                    break;
                    case "MT":
                    case "NM": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                    }
                    break;
                    case "ND": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_END"));
                        setConstructionType(data.get("Construction_Type_END"));
                    }
                    break;
                    case "NV": {
                        setSquareFootageFont(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                    }
                    break;
                    case "OR": {
                        setSquareFootageFont(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_END"));
                    }
                    break;
                    case "OH":
                    case "PA":
                    case "VT":
                    case "AL":
                    case "LA":
                    case "MD":
                    case "VA":
                    case "GA":
                    case "MI":
                    case "WV": {
                        setYearRenovated(data.get("Year_Built_Renovated_END"));
                        setSquareFootage(data.get("Square_Footage_END"));
                        setConstructionType(data.get("Construction_Type_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                    }
                    break;
                    case "OK": {
                        setSquareFootageFont(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_END"));
                    }
                    break;
                    case "RI":
                    case "HI":
                    case "FL": {
                        setSquareFootageFont(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                    }
                    break;
                    case "SD": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setConstructionType(data.get("Construction_Type_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_END"));
                    }
                    break;
                    case "TN":
                    case "NC":
                    case "TX": {
                        setSquareFootageFont(data.get("Square_Footage_END"));
                        setConstructionType(data.get("Construction_Type_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                    }
                    break;
                    case "UT": {
                        setSquareFootageFont(data.get("Square_Footage_END"));
                        setConstructionType(data.get("Construction_Type_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_END"));
                        setLEEDCertifiedHome(data.get("Construction_Details_Home_LEED_Certified_END"));
                    }
                    break;
                    case "WA": {
                        setSquareFootageFont(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_END"));
                    }
                    break;
                    case "CA": {
                        setSquareFootageFont(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_END"));
                        setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake_END"));
                    }
                    break;
                    case "DE":
                    case "MS": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setConstructionTypeFont(data.get("Construction_Type_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_END"));
                    }
                    break;
                    case "ME": {
                        setSquareFootage(data.get("Square_Footage_END"));
                        setConstructionType(data.get("Construction_Type_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                        setIsThisAHandcraftedHome(data.get("Handcrafted_Home_END"));
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                setYearBuilt(data.get("Year_Built_END"));
                setProtectionClass(data.get("Protection_Class_END"));
                pause(3000);
                clickElement(saveChanges);
                if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                    setSquareFootage(data.get("Square_Footage_END"));
                } else {
                    setSquareFootageFont(data.get("Square_Footage_END"));
                }
                if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                    setSquareFootage(data.get("Square_Footage_END"));
                } else {
                    setSquareFootageFont(data.get("Square_Footage_END"));
                }
                if (isVisibleOnly(By.xpath("//font[text()='Number of Floors at the Risk Location']/../../../../../..//input"))) {
                    setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_END"));
                } else {
                    setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_END"));
                }
                setTheFloorOnWhichRiskIsLocated(data.get("Risk_Located_Floor_END"));
                if (isVisibleOnly(By.xpath("//*[text()='Construction Type']/../../../..//input"))) {
                    setConstructionType(data.get("Construction_Type_END"));
                } else {
                    setConstructionTypeFont(data.get("Construction_Type_END"));
                }
                switch (data.get("State_END")) {
                    case "AZ":
                    case "NV":
                    case "NM":
                    case "MT":
                    case "UT":
                    case "WY": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                    }
                    break;
                    case "OR":
                    case "ID": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_END"));
                    }
                    break;
                    case "AK": {
                        setCertifiedInspection(data.get("Certified_Inspection_END"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date_END"));
                    }
                    break;
                    case "WA": {
                        setIsHomeSupported(data.get("Is_Home_Supported_END"));
                    }
                    break;
                    case "CA": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_END"));
                        setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake_END"));
                    }
                    break;
                    case "FL":
                    case "SC": {
                        setBceg(data.get("BCEG_END"));
                    }
                    break;
                }
            }
            break;
        }
        setOptionalConstructionDetailsWrapped_END(data);
        setDistanceToCoastOverride(data.get("Construction_Details_Distance_To_Coast_Override_END"));
        saveChanges();
    }

    public void fillBasicConstructionDetails_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("construction details");
        switch (data.get("Residence_Type_OOS_END")) {
            case "Homeowner": {
                setYearBuilt(data.get("Year_Built_OOS_END"));
                setProtectionClass(data.get("Protection_Class_OOS_END"));
                residenceHaveBasement(data);
                switch (data.get("State_OOS_END")) {
                    case "AK": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                        setConstructionType(data.get("Construction_Type_OOS_END"));
                        setCertifiedInspection(data.get("Certified_Inspection_OOS_END"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date_OOS_END"));
                    }
                    break;
                    case "AR":
                    case "IL":
                    case "IN":
                    case "KY": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                        setConstructionType(data.get("Construction_Type_OOS_END"));
                    }
                    break;
                    case "AZ":
                    case "WY": {
                        setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                    }
                    break;
                    case "CO":
                    case "ID": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_OOS_END"));
                    }
                    break;
                    case "IA":
                    case "DC":
                    case "NE":
                    case "NH":
                    case "CT":
                    case "MA":
                    case "NJ":
                    case "NY":
                    case "SC": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                    }
                    break;
                    case "MN":
                    case "MO":
                    case "WI": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                    }
                    break;
                    case "KS": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                    }
                    break;
                    case "MT":
                    case "NM": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                    }
                    break;
                    case "ND": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_OOS_END"));
                        setConstructionType(data.get("Construction_Type_OOS_END"));
                    }
                    break;
                    case "NV": {
                        setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                    }
                    break;
                    case "OR": {
                        setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_OOS_END"));
                    }
                    break;
                    case "OH":
                    case "PA":
                    case "VT":
                    case "AL":
                    case "LA":
                    case "MD":
                    case "VA":
                    case "GA":
                    case "MI":
                    case "WV": {
                        setYearRenovated(data.get("Year_Built_Renovated_OOS_END"));
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setConstructionType(data.get("Construction_Type_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                    }
                    break;
                    case "OK": {
                        setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_OOS_END"));
                    }
                    break;
                    case "RI":
                    case "HI":
                    case "FL": {
                        setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                    }
                    break;
                    case "SD": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setConstructionType(data.get("Construction_Type_OOS_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_OOS_END"));
                    }
                    break;
                    case "TN":
                    case "NC":
                    case "TX": {
                        setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                        setConstructionType(data.get("Construction_Type_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                    }
                    break;
                    case "UT": {
                        setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                        setConstructionType(data.get("Construction_Type_OOS_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_OOS_END"));
                        setLEEDCertifiedHome(data.get("Construction_Details_Home_LEED_Certified_OOS_END"));
                    }
                    break;
                    case "WA": {
                        setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_OOS_END"));
                    }
                    break;
                    case "CA": {
                        setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_OOS_END"));
                        setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake_OOS_END"));
                    }
                    break;
                    case "DE":
                    case "MS": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_OOS_END"));
                    }
                    break;
                    case "ME": {
                        setSquareFootage(data.get("Square_Footage_OOS_END"));
                        setConstructionType(data.get("Construction_Type_OOS_END"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                        setIsThisAHandcraftedHome(data.get("Handcrafted_Home_OOS_END"));
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                setYearBuilt(data.get("Year_Built_OOS_END"));
                setProtectionClass(data.get("Protection_Class_OOS_END"));
                pause(3000);
                clickElement(saveChanges);
                if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                    setSquareFootage(data.get("Square_Footage_OOS_END"));
                } else {
                    setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                }
                if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                    setSquareFootage(data.get("Square_Footage_OOS_END"));
                } else {
                    setSquareFootageFont(data.get("Square_Footage_OOS_END"));
                }
                if (isVisibleOnly(By.xpath("//font[text()='Number of Floors at the Risk Location']/../../../../../..//input"))) {
                    setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_OOS_END"));
                } else {
                    setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_OOS_END"));
                }
                setTheFloorOnWhichRiskIsLocated(data.get("Risk_Located_Floor_OOS_END"));
                if (isVisibleOnly(By.xpath("//*[text()='Construction Type']/../../../..//input"))) {
                    setConstructionType(data.get("Construction_Type_OOS_END"));
                } else {
                    setConstructionTypeFont(data.get("Construction_Type_OOS_END"));
                }
                switch (data.get("State_OOS_END")) {
                    case "AZ":
                    case "NV":
                    case "NM":
                    case "MT":
                    case "UT":
                    case "WY": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                    }
                    break;
                    case "OR":
                    case "ID": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_OOS_END"));
                    }
                    break;
                    case "AK": {
                        setCertifiedInspection(data.get("Certified_Inspection_OOS_END"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date_OOS_END"));
                    }
                    break;
                    case "WA": {
                        setIsHomeSupported(data.get("Is_Home_Supported_OOS_END"));
                    }
                    break;
                    case "CA": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_OOS_END"));
                        setIsHomeSupported(data.get("Is_Home_Supported_OOS_END"));
                        setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake_OOS_END"));
                    }
                    break;
                    case "FL":
                    case "SC": {
                        setBceg(data.get("BCEG_OOS_END"));
                    }
                    break;
                }
            }
            break;
        }
        setOptionalConstructionDetailsWrapped_OOS_END(data);
        setDistanceToCoastOverride(data.get("Construction_Details_Distance_To_Coast_Override_OOS_END"));
        saveChanges();
    }

    public void fillBasicConstructionDetails_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("construction details");
        switch (data.get("Residence_Type_RNW")) {
            case "Homeowner": {
                setYearBuilt(data.get("Year_Built_RNW"));
                setProtectionClass(data.get("Protection_Class_RNW"));
                residenceHaveBasement(data);
                switch (data.get("State_RNW")) {
                    case "AK": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                        setConstructionType(data.get("Construction_Type_RNW"));
                        setCertifiedInspection(data.get("Certified_Inspection_RNW"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date_RNW"));
                    }
                    break;
                    case "AR":
                    case "IL":
                    case "IN":
                    case "KY": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                        setConstructionType(data.get("Construction_Type_RNW"));
                    }
                    break;
                    case "AZ":
                    case "WY": {
                        setSquareFootageFont(data.get("Square_Footage_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                    }
                    break;
                    case "CO":
                    case "ID": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                        setIsHomeSupported(data.get("Is_Home_Supported_RNW"));
                    }
                    break;
                    case "IA":
                    case "DC":
                    case "NE":
                    case "NH":
                    case "CT":
                    case "MA":
                    case "NJ":
                    case "NY":
                    case "SC": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                    }
                    break;
                    case "MN":
                    case "MO":
                    case "WI": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                    }
                    break;
                    case "KS": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                    }
                    break;
                    case "MT":
                    case "NM": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                    }
                    break;
                    case "ND": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_RNW"));
                        setConstructionType(data.get("Construction_Type_RNW"));
                    }
                    break;
                    case "NV": {
                        setSquareFootageFont(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                    }
                    break;
                    case "OR": {
                        setSquareFootageFont(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                        setIsHomeSupported(data.get("Is_Home_Supported_RNW"));
                    }
                    break;
                    case "OH":
                    case "PA":
                    case "VT":
                    case "AL":
                    case "LA":
                    case "MD":
                    case "VA":
                    case "GA":
                    case "MI":
                    case "WV": {
                        setYearRenovated(data.get("Year_Built_Renovated_RNW"));
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setConstructionType(data.get("Construction_Type_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                    }
                    break;
                    case "OK": {
                        setSquareFootageFont(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_RNW"));
                    }
                    break;
                    case "RI":
                    case "HI":
                    case "FL": {
                        setSquareFootageFont(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                    }
                    break;
                    case "SD": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setConstructionType(data.get("Construction_Type_RNW"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_RNW"));
                    }
                    break;
                    case "TN":
                    case "NC":
                    case "TX": {
                        setSquareFootageFont(data.get("Square_Footage_RNW"));
                        setConstructionType(data.get("Construction_Type_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                    }
                    break;
                    case "UT": {
                        setSquareFootageFont(data.get("Square_Footage_RNW"));
                        setConstructionType(data.get("Construction_Type_RNW"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_RNW"));
                        setLEEDCertifiedHome(data.get("Construction_Details_Home_LEED_Certified_RNW"));
                    }
                    break;
                    case "WA": {
                        setSquareFootageFont(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                        setIsHomeSupported(data.get("Is_Home_Supported_RNW"));
                    }
                    break;
                    case "CA": {
                        setSquareFootageFont(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                        setIsHomeSupported(data.get("Is_Home_Supported_RNW"));
                        setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake_RNW"));
                    }
                    break;
                    case "DE":
                    case "MS": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setConstructionTypeFont(data.get("Construction_Type_RNW"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_RNW"));
                    }
                    break;
                    case "ME": {
                        setSquareFootage(data.get("Square_Footage_RNW"));
                        setConstructionType(data.get("Construction_Type_RNW"));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                        setIsThisAHandcraftedHome(data.get("Handcrafted_Home_RNW"));
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                setYearBuilt(data.get("Year_Built_RNW"));
                setProtectionClass(data.get("Protection_Class_RNW"));
                pause(3000);
                clickElement(saveChanges);
                if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                    setSquareFootage(data.get("Square_Footage_RNW"));
                } else {
                    setSquareFootageFont(data.get("Square_Footage_RNW"));
                }
                if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                    setSquareFootage(data.get("Square_Footage_RNW"));
                } else {
                    setSquareFootageFont(data.get("Square_Footage_RNW"));
                }
                if (isVisibleOnly(By.xpath("//font[text()='Number of Floors at the Risk Location']/../../../../../..//input"))) {
                    setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_RNW"));
                } else {
                    setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_RNW"));
                }
                setTheFloorOnWhichRiskIsLocated(data.get("Risk_Located_Floor_RNW"));
                if (isVisibleOnly(By.xpath("//*[text()='Construction Type']/../../../..//input"))) {
                    setConstructionType(data.get("Construction_Type_RNW"));
                } else {
                    setConstructionTypeFont(data.get("Construction_Type_RNW"));
                }
                switch (data.get("State_RNW")) {
                    case "AZ":
                    case "NV":
                    case "NM":
                    case "MT":
                    case "UT":
                    case "WY": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                    }
                    break;
                    case "OR":
                    case "ID": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                        setIsHomeSupported(data.get("Is_Home_Supported_RNW"));
                    }
                    break;
                    case "AK": {
                        setCertifiedInspection(data.get("Certified_Inspection_RNW"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date_RNW"));
                    }
                    break;
                    case "WA": {
                        setIsHomeSupported(data.get("Is_Home_Supported_RNW"));
                    }
                    break;
                    case "CA": {
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering_RNW"));
                        setIsHomeSupported(data.get("Is_Home_Supported_RNW"));
                        setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake_RNW"));
                    }
                    break;
                    case "FL":
                    case "SC": {
                        setBceg(data.get("BCEG_RNW"));
                    }
                    break;
                }
            }
            break;
        }
        setOptionalConstructionDetailsWrapped_RNW(data);
        setDistanceToCoastOverride(data.get("Construction_Details_Distance_To_Coast_Override_RNW"));
        saveChanges();
    }

    public void fillBasicConstructionDetails(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        setYearBuilt(data.get("Year_Built_" + i));
                        setProtectionClass(data.get("Protection_Class_" + i));
                        setResidenceHaveBasement(data.get("Does_The_Residence_Have_Basement_" + i));

                        switch (data.get("State_" + i)) {
                            case "AK": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setCertifiedInspection(data.get("Certified_Inspection_" + i));
                                setCertifiedInspectionDate(data.get("Certified_Inspection_Date_" + i));
                            }
                            break;
                            case "AR":
                            case "IL":
                            case "IN":
                            case "KY": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                residenceHaveBasement(data, i);
                            }
                            break;
                            case "AZ":
                            case "WY": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                            }
                            break;
                            case "CO": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                                residenceHaveBasement(data, i);
                            }
                            break;
                            case "ID": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                            }
                            break;
                            case "IA":
                            case "DC":
                            case "NE":
                            case "NH":
                            case "CT":
                            case "MA":
                            case "NJ":
                            case "NY": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "MN":
                            case "MO":
                            case "WI": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                            }
                            break;
                            case "KS": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                            }
                            break;
                            case "MT":
                            case "NM": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "ND": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                            }
                            break;
                            case "NV": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "OR": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                            }
                            break;
                            case "OH":
                            case "PA":
                            case "VT":
                            case "AL":
                            case "LA":
                            case "MD":
                            case "VA":
                            case "GA":
                            case "MI":
                            case "WV": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "OK": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "RI":
                            case "HI": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "SD": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "TN":
                            case "NC":
                            case "TX": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "WA": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                            }
                            break;
                            case "CA": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                                setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake_" + i));
                            }
                            break;
                            case "DE":
                            case "MS": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "ME": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsThisAHandcraftedHome(data.get("Handcrafted_Home_" + i));
                            }
                            break;
                            case "SC": {
                                pause(3000);
                                typeText(bcegSelect.get(0), data.get("BCEG_" + i));
                                pause(3000);
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "FL": {
                                pause(3000);
                                typeText(bcegSelect.get(0), data.get("BCEG_" + i));
                                pause(3000);
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        setYearBuilt(data.get("Year_Built_" + i));
                        pause(5000);
                        clickElement(saveChanges);

                        setProtectionClass(data.get("Protection_Class_" + i));

                        pause(3000);
                        clickElement(saveChanges);

                        if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                            setSquareFootage(data.get("Square_Footage_" + i));
                        } else {
                            setSquareFootageFont(data.get("Square_Footage_" + i));
                        }

                        if (isVisibleOnly(By.xpath("//div[contains(text(),'Square Footage')]/../../../../div//input"))) {
                            setSquareFootage(data.get("Square_Footage_" + i));
                        } else {
                            setSquareFootageFont(data.get("Square_Footage_" + i));
                        }

                        if (isVisibleOnly(By.xpath("//font[text()='Number of Floors at the Risk Location']/../../../../../..//input"))) {
                            setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                        } else {
                            setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                        }

                        setTheFloorOnWhichRiskIsLocated(data.get("Risk_Located_Floor_" + i));

                        if (isVisibleOnly(By.xpath("//*[text()='Construction Type']/../../../..//input"))) {
                            setConstructionType(data.get("Construction_Type_" + i));
                        } else {
                            setConstructionTypeFont(data.get("Construction_Type_" + i));
                        }

                        switch (data.get("State_" + i)) {
                            case "AZ":
                            case "NV":
                            case "NM":
                            case "MT":
                            case "UT":
                            case "WY": {
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                            }
                            break;
                            case "OR":
                            case "ID": {
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                            }
                            break;
                            case "AK": {
                                setCertifiedInspection(data.get("Certified_Inspection_" + i));
                                setCertifiedInspectionDate(data.get("Certified_Inspection_Date_" + i));
                            }
                            break;
                            case "WA": {
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                            }
                            break;
                            case "CA": {
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                                setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake_" + i));
                            }
                            break;
                            case "FL":
                            case "SC": {
                                setBceg(data.get("BCEG_" + i));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        pause(3000);
                        setYearBuilt(data.get("Year_Built_" + i));
                        pause(3000);
                        clickElement(saveChanges);

                        setProtectionClass(data.get("Protection_Class_" + i));

                        pause(3000);
                        clickElement(saveChanges);


                        setFoundationType(data.get("Foundation_Type_" + i));
                        pause(3000);
                        clickElement(saveChanges);

                        switch (data.get("State_" + i)) {
                            case "AK": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setCertifiedInspection(data.get("Certified_Inspection_" + i));
                                setCertifiedInspectionDate(data.get("Certified_Inspection_Date_" + i));
                            }
                            break;
                            case "AR":
                            case "IL":
                            case "IN":
                            case "KY": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                            }
                            break;
                            case "AZ":
                            case "WY": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                            }
                            break;
                            case "CO":
                            case "ID": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                            }
                            break;
                            case "IA":
                            case "DC":
                            case "NE":
                            case "NH":
                            case "CT":
                            case "MA":
                            case "NJ":
                            case "NY": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "MN":
                            case "MO":
                            case "WI": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                            }
                            break;
                            case "KS": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                            }
                            break;
                            case "MT":
                            case "NM": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "ND": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                            }
                            break;
                            case "NV":
                            case "OR": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "OH":
                            case "PA":
                            case "VT":
                            case "AL":
                            case "LA":
                            case "MD":
                            case "VA":
                            case "GA":
                            case "MI":
                            case "WV":
                            case "RI":
                            case "HI":
                            case "DE":
                            case "MS":
                            case "TX": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "TN":
                            case "NC": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "OK": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "SD": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "WA": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                            }
                            break;
                            case "CA": {
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
//                                setIsHomeRetrofittedForEarthquake(data.get("Is_Home_Retrofitted_For_Earthquake"));
                            }
                            break;
                            case "ME": {
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionType(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                                setIsThisAHandcraftedHome(data.get("Handcrafted_Home_" + i));
                            }
                            break;
                            case "SC": {
                                pause(3000);
                                setSquareFootage(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                            case "FL": {
                                pause(3000);
                                setSquareFootageFont(data.get("Square_Footage_" + i));
                                setConstructionTypeFont(data.get("Construction_Type_" + i));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        setYearBuilt(data.get("Year_Built_" + i));
                        pause(3000);
                        clickElement(saveChanges);

                        setProtectionClass(data.get("Protection_Class_" + i));

                        pause(3000);
                        clickElement(saveChanges);

                        setSquareFootage(data.get("Square_Footage_" + i));
                        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_" + i));
                        setTheFloorOnWhichRiskIsLocated(data.get("Risk_Located_Floor_" + i));
                        setConstructionType(data.get("Construction_Type_" + i));

                        switch (data.get("State_" + i)) {
                            case "AZ":
                            case "NV":
                            case "NM":
                            case "MT":
                            case "OR":
                            case "UT":
                            case "WY": {
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                            }
                            break;
                            case "AK": {
                                setCertifiedInspection(data.get("Certified_Inspection_" + i));
                            }
                            break;
                            case "WA": {
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                            }
                            break;
                            case "CA":
                            case "ID": {
                                setExteriorWallCoverings(data.get("Exterior_Wall_Covering_" + i));
                                setIsHomeSupported(data.get("Is_Home_Supported_" + i));
                            }
                            break;
                            case "FL":
                            case "SC": {
                                setBceg(data.get("BCEG_" + i));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
        }

        saveChanges();

    }

    public void fillConstructionDetailsCC(Map<String, String> data) throws Throwable {
        String projectType = data.get("Project_Type_Project_Type");
        verifyBlockExists("construction details");
        if (hasValue(projectType) && !projectType.equalsIgnoreCase("Ground Up Construction")) {
            setYearBuilt(data.get("Construction_Details_Year_Built"));
        }
        setPlannedConstructionType(data.get("Construction_Details_Planned_Construction_Type"));
        setPlannedEnclosureDate(data.get("Construction_Details_Planned_Enclosure_Date"));
        setPlannedCompletionDate(data.get("Construction_Details_Planned_Completion_Date"));
        setPlannedStructuralChanges(data.get("Construction_Details_Planned_Structural_Changes"));
        setPlannedTotalSquareFootage(data.get("Construction_Details_Planned_Total_Square_Footage"));
        setProjectDescription(data.get("Construction_Details_Project_Description"));
        saveChanges();
    }

    public void deleteProjectDescription() throws Throwable {
        projectDescription.clear();
        saveChanges();
    }

    public boolean isProjectDescriptionMandatory() {
        return projectDescriptionMandatory.getAttribute("class").contains("fieldMandatory");
    }

    public boolean isProjectDescriptionEmpty() {
        return hasValue(projectDescription.getText());
    }

    public void fillConstructionDetailsCC_END(Map<String, String> data) throws Throwable {
        String projectType = hasValue(data.get("Project_Type_Project_Type_END")) ? data.get("Project_Type_Project_Type_END") : data.get("Project_Type_Project_Type");

        if (!projectType.equalsIgnoreCase("Ground Up Construction")) {
            setYearBuilt(data.get("Construction_Details_Year_Built_END"));
        }
        setPlannedConstructionType(data.get("Construction_Details_Planned_Construction_Type_END"));
        setPlannedEnclosureDate(data.get("Construction_Details_Planned_Enclosure_Date_END"));
        setPlannedCompletionDate(data.get("Construction_Details_Planned_Completion_Date_END"));
        setPlannedStructuralChanges(data.get("Construction_Details_Planned_Structural_Changes_END"));
        setPlannedTotalSquareFootage(data.get("Construction_Details_Planned_Total_Square_Footage_END"));
        setProjectDescription(data.get("Construction_Details_Project_Description_END"));
        saveChanges();
    }

    public void setDistanceToCoast(String distanceToCoast) throws Throwable {
        try {
            if (hasValue(distanceToCoast)) {
                typeText(distanceToCoastWE, distanceToCoast, "Distance to Coast");
            }
        } catch (Exception e) {
            //
        }
        pause(6000);
    }

    private void setProtectionClassOverride(String constructionDetailsManagerPpcOverride) throws Throwable {
        if (!constructionDetailsManagerPpcOverride.equalsIgnoreCase("No")) {
            checkCheckbox(managerPPCOverride, "Yes");
            pause(1000);
            typeTextEnter(protectionClassOverride, constructionDetailsManagerPpcOverride, "PPC Override");
        }
    }

    public void setManagerDTCOverride(String value) throws Throwable {
        checkCheckbox(managerDTCOverrideHS, value, "Manager DTC override checkbox: " + value);
    }

    public void fillBasicConstructionDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("construction details");
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (data.get("Risk_Addresses_Residence_Type")) {
                    case "Homeowner": {
                        setYearBuilt(data.get("Construction_Details_Year_Built"));
                        pause(3000);
                        clickElement(saveChanges);
                        setProtectionClass(data.get("Construction_Details_Protection_Class"));
                        pause(3000);
                        setProtectionClassOverride(data);
                        clickElement(saveChanges);
                        setExtreme10ProtectionClass(data);
                        setDistanceToCoastOverride(data.get("Construction_Details_Distance_To_Coast"));
                        setFoundationType(data.get("Construction_Details_Foundation_Type"));
                        setBarrierIsland(data.get("Construction_Details_Barrier_Island"));
                        switch (data.get("State")) {
                            case "AZ": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                                setBasementFinishIs(data.get("Construction_Details_Basement_Finish_Is"));
                                setBasementFinishQuality(data.get("Construction_Details_Basement_Finish_Quality_Is"));
                            }
                            break;
                            case "WY": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "CO": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "MA": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "NJ": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "NY": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "MT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                            }
                            break;
                            case "AL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "LA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "GA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "HI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                                setBasementFinishIs(data.get("Construction_Details_Basement_Finish_Is"));
                                setBasementFinishQuality(data.get("Construction_Details_Basement_Finish_Quality_Is"));
                            }
                            break;
                            case "MS": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "TX": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "NC": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionType(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                                setBasementFinishIs(data.get("Construction_Details_Basement_Finish_Is"));
                                setBasementFinishQuality(data.get("Construction_Details_Basement_Finish_Quality_Is"));
                            }
                            break;
                            case "CA": {
                                setManagerDTCOverride(data.get("Construction_Details_Distance_To_Coast_Override"));
                                setDistanceToCoast(data.get("Construction_Details_Distance_To_Coast"));
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setIsHomeSupported(data.get("Construction_Details_Is_Home_Supported"));
                                setIsHomeRetrofittedForEarthquake(data.get("Construction_Details_Is_The_Home_Retrofitted_For_Earthquake?"));
                                pause(1000);
                                if (data.get("Construction_Details_Foundation_Type").equalsIgnoreCase("Basement (finished or unfinished)")) {
                                    setBasementFinishIs(data.get("Construction_Details_Basement_Finish_Is"));
                                    setBasementFinishQuality(data.get("Construction_Details_Basement_Finish_Quality_Is"));
                                }
                            }
                            break;
                            case "SC": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "FL": {
                                setManagerDTCOverride(data.get("Construction_Details_Distance_To_Coast_Override"));
                                setDistanceToCoast(data.get("Construction_Details_Distance_To_Coast"));
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "CT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "RI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                        }
                    }
                    break;

                    case "Condo/Co-op": {
                        setYearBuilt(data.get("Construction_Details_Year_Built"));
                        pause(3000);
                        saveChanges();
                        setProtectionClass(data.get("Construction_Details_Protection_Class"));
                        pause(3000);
                        setProtectionClassOverride(data);
                        setDistanceToCoast(data.get("Construction_Details_Distance_To_Coast"));
                        setDistanceToCoastOverride(data.get("Construction_Details_Distance_To_Coast"));
                        saveChanges();
                        setBarrierIsland(data.get("Construction_Details_Barrier_Island"));
                        switch (data.get("State")) {
                            case "AZ": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "WY": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "CO": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "MA": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "NJ": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "NY": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "MT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                            }
                            break;
                            case "AL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "LA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "GA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "HI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "MS": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "TX": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setBarrierIsland(data.get("Construction_Details_Barrier_Island"));
                            }
                            break;
                            case "NC": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionType(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "CA": {
                                setManagerDTCOverride(data.get("Construction_Details_Distance_To_Coast_Override"));
                                setDistanceToCoast(data.get("Construction_Details_Distance_To_Coast"));
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setIsHomeSupported(data.get("Construction_Details_Is_Home_Supported"));
                                setIsTheHomeLocatedOnAGrade(data.get("Construction_Details_Is_The_Home_Located_On_A_Grade_That_Is_20_In_Slope?"));
                                setIsHomeRetrofittedForEarthquake(data.get("Construction_DetailsIs_The_Home_Retrofitted_For_Earthquake?"));
                            }
                            break;
                            case "SC": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "FL": {
                                setManagerDTCOverride(data.get("Construction_Details_Distance_To_Coast_Override"));
                                setDistanceToCoast(data.get("Construction_Details_Distance_To_Coast"));
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "CT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                            case "RI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
                            }
                            break;
                        }
                    }
                    break;
                }
                setProtectionClassOverride(data.get("Construction_Details_Manager_PPC_Override"));
            }
            break;
        }
        saveChanges();
    }

    public void fillBasicConstructionDetailsHS_END(Map<String, String> data) throws Throwable {
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
                        setYearBuilt(data.get("Construction_Details_Year_Built_END"));
                        pause(3000);
                        clickElement(saveChanges);
                        setProtectionClass(data.get("Construction_Details_Protection_Class_END"));
                        pause(3000);
                        clickElement(saveChanges);
                        setDistanceToCoastOverride(data.get("Construction_Details_Distance_To_Coast_END"));
                        setFoundationType(data.get("Construction_Details_Foundation_Type_END"));

                        switch (data.get("State")) {
                            case "AZ": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "WY": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "CO": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "MA": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "NJ": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "NY": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "MT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "AL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "LA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "GA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "HI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                                setBasementFinishIs(data.get("Construction_Details_Basement_Finish_Is_END"));
                                setBasementFinishQuality(data.get("Construction_Details_Basement_Finish_Quality_Is_END"));
                            }
                            break;
                            case "MS": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "TX": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "NC": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionType(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "CA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setIsHomeSupported(data.get("Construction_Details_Is_Home_Supported_END"));
                                setIsTheHomeLocatedOnAGrade(data.get("Construction_Details_Is_The_Home_Located_On_A_Grade_That_Is_20_In_Slope?_END"));
                                setIsHomeRetrofittedForEarthquake(data.get("Construction_DetailsIs_The_Home_Retrofitted_For_Earthquake?_END"));
                            }
                            break;
                            case "SC": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "FL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "CT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "RI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                        }
                    }
                    break;

                    case "Condo/Co-op": {
                        setYearBuilt(data.get("Construction_Details_Year_Built_END"));
                        pause(3000);
                        saveChanges();
                        setProtectionClass(data.get("Construction_Details_Protection_Class_END"));
                        pause(3000);
                        saveChanges();

                        switch (data.get("State")) {
                            case "AZ": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "WY": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "CO": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "MA": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "NJ": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "NY": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "MT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                            }
                            break;
                            case "AL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "LA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "GA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "HI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "MS": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "TX": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated"));
                            }
                            break;
                            case "NC": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionType(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                            }
                            break;
                            case "CA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setIsHomeSupported(data.get("Construction_Details_Is_Home_Supported_END"));
                                setIsTheHomeLocatedOnAGrade(data.get("Construction_Details_Is_The_Home_Located_On_A_Grade_That_Is_20_In_Slope?_END"));
                                setIsHomeRetrofittedForEarthquake(data.get("Construction_DetailsIs_The_Home_Retrofitted_For_Earthquake?_END"));
                            }
                            break;
                            case "SC": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "FL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                            }
                            break;
                            case "RI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                                setBasementFinishIs("Construction_Details_Basement_Finish_Is_END");
                            }
                            break;
                            case "CT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
                                setBasementFinishIs("Construction_Details_Basement_Finish_Is_END");
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillBasicConstructionDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
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
                        setYearBuilt(data.get("Construction_Details_Year_Built_OOS_END"));
                        pause(3000);
                        clickElement(saveChanges);
                        setProtectionClass(data.get("Construction_Details_Protection_Class_OOS_END"));
                        pause(3000);
                        clickElement(saveChanges);
                        setDistanceToCoastOverride(data.get("Construction_Details_Distance_To_Coast_OOS_END"));
                        setFoundationType(data.get("Construction_Details_Foundation_Type_OOS_END"));

                        switch (data.get("State")) {
                            case "AZ": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "WY": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "CO": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "MA": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "NJ": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "NY": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "MT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "AL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "LA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "GA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "HI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                                setBasementFinishIs(data.get("Construction_Details_Basement_Finish_Is_OOS_END"));
                                setBasementFinishQuality(data.get("Construction_Details_Basement_Finish_Quality_Is_OOS_END"));
                            }
                            break;
                            case "MS": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "TX": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "NC": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionType(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "CA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setIsHomeSupported(data.get("Construction_Details_Is_Home_Supported_OOS_END"));
                                setIsTheHomeLocatedOnAGrade(data.get("Construction_Details_Is_The_Home_Located_On_A_Grade_That_Is_20_In_Slope?_OOS_END"));
                                setIsHomeRetrofittedForEarthquake(data.get("Construction_DetailsIs_The_Home_Retrofitted_For_Earthquake?_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "FL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "RI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "CT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;

                    case "Condo/Co-op": {
                        setYearBuilt(data.get("Construction_Details_Year_Built_OOS_END"));
                        pause(3000);
                        saveChanges();
                        setProtectionClass(data.get("Construction_Details_Protection_Class_OOS_END"));
                        pause(3000);
                        saveChanges();

                        switch (data.get("State")) {
                            case "AZ": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "WY": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "CO": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "MA": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "NJ": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "NY": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "MT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                            }
                            break;
                            case "AL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "LA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "GA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "HI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "MS": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "TX": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "NC": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionType(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "CA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setIsHomeSupported(data.get("Construction_Details_Is_Home_Supported_OOS_END"));
                                setIsTheHomeLocatedOnAGrade(data.get("Construction_Details_Is_The_Home_Located_On_A_Grade_That_Is_20_In_Slope?_OOS_END"));
                                setIsHomeRetrofittedForEarthquake(data.get("Construction_DetailsIs_The_Home_Retrofitted_For_Earthquake?_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "FL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                            }
                            break;
                            case "RI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                            case "CT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_OOS_END"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_OOS_END"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_OOS_END"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_OOS_END"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_OOS_END"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_OOS_END"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillBasicConstructionDetailsHS_RNW(Map<String, String> data) throws Throwable {
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
                        setYearBuilt(data.get("Construction_Details_Year_Built_RNW"));
                        pause(3000);
                        clickElement(saveChanges);
                        setProtectionClass(data.get("Construction_Details_Protection_Class_RNW"));
                        pause(3000);
                        clickElement(saveChanges);
                        setDistanceToCoastOverride(data.get("Construction_Details_Distance_To_Coast_RNW"));
                        setFoundationType(data.get("Construction_Details_Foundation_Type_RNW"));

                        switch (data.get("State")) {
                            case "AZ": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "WY": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "CO": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "MA": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "NJ": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "NY": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "MT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "AL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "LA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "GA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "HI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                                setBasementFinishIs(data.get("Construction_Details_Basement_Finish_Is_RNW"));
                                setBasementFinishQuality(data.get("Construction_Details_Basement_Finish_Quality_Is_RNW"));
                            }
                            break;
                            case "MS": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "TX": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "NC": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionType(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "CA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setIsHomeSupported(data.get("Construction_Details_Is_Home_Supported_RNW"));
                                setIsTheHomeLocatedOnAGrade(data.get("Construction_Details_Is_The_Home_Located_On_A_Grade_That_Is_20_In_Slope?_RNW"));
                                setIsHomeRetrofittedForEarthquake(data.get("Construction_DetailsIs_The_Home_Retrofitted_For_Earthquake?_RNW"));
                            }
                            break;
                            case "SC": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "FL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "CT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "RI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                        }
                    }
                    break;

                    case "Condo/Co-op": {
                        setYearBuilt(data.get("Construction_Details_Year_Built_RNW"));
                        pause(3000);
                        saveChanges();
                        setProtectionClass(data.get("Construction_Details_Protection_Class_RNW"));
                        pause(3000);
                        saveChanges();

                        switch (data.get("State")) {
                            case "AZ": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "WY": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "CO": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "MA": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "NJ": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "NY": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "MT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                            }
                            break;
                            case "AL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "LA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "GA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "HI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "MS": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "TX": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "NC": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionType(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "UT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "CA": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setIsHomeSupported(data.get("Construction_Details_Is_Home_Supported_RNW"));
                                setIsTheHomeLocatedOnAGrade(data.get("Construction_Details_Is_The_Home_Located_On_A_Grade_That_Is_20_In_Slope?_RNW"));
                                setIsHomeRetrofittedForEarthquake(data.get("Construction_DetailsIs_The_Home_Retrofitted_For_Earthquake?_RNW"));
                            }
                            break;
                            case "SC": {
                                setSquareFootage(data.get("Construction_Details_Square_Footage_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "FL": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setTheFloorOnWhichRiskIsLocated(data.get("Construction_Details_The_Floor_On_Which_The_Risk_Is_Located_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                            }
                            break;
                            case "RI": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                            case "CT": {
                                setSquareFootageFont(data.get("Construction_Details_Square_Footage_RNW"));
                                setNumberOfFloorsAtRiskLocationFont(data.get("Construction_Details_Number_Of_Floors_RNW"));
                                setConstructionTypeFont(data.get("Construction_Details_Construction_Type_RNW"));
                                setExteriorWallCoverings(data.get("Construction_Details_Exterior_Wall_Covering_RNW"));
                                setYearRenovated(data.get("Construction_Details_Year_Renovated_RNW"));
                                setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
                                setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
                                setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
        }

    }

    public void fillConstructionDetailsCC_EXT(Map<String, String> data) throws Throwable {
        //TODO CC
        setProjectDescription(data.get("Construction_Details_Project_Description_EXT"));
    }

    public void setPlannedConstructionType(String value) throws InterruptedException {
        pause(3000);
        typeTextEnter(plannedConstructionType, value, "Planned Construction Type");
    }

    public void setPlannedEnclosureDate(String value) {
        typeTextEnter(plannedEnclosureDate, value, "Planned Enclosure Date");
    }

    public void setPlannedCompletionDate(String value) {
        typeTextEnter(plannedCompletionDate, value, "Planned Completion Date");
    }

    public void setPlannedStructuralChanges(String value) throws Throwable {
        typeTextEnter(plannedStructuralChanges, value, "Planned Structural Changes");
        clickFooter();
    }

    public void setPlannedTotalSquareFootage(String value) {
        typeText(plannedTotalSquareFootage, value, "Planned Total Square Footage");
    }

    public void setBarrierIslandOverride(String barrier_island_override) throws Throwable {
        checkCheckbox(barrierIslandOverride, barrier_island_override);
    }

    public void setYearBuilt(String yearBuilt) throws Throwable {
        clickFooter();
        if (yearBuiltInputFont.size() > 0) {
            typeTextEnter(yearBuiltInputFont.get(0), yearBuilt, "Year built");
        } else if (driver.findElements(By.xpath("//div[text()='Year Built']/../../../../../..//input")).size() > 0) {
            typeTextEnter(yearBuiltInput, yearBuilt, "Year built");
        } else {
            typeTextEnter(yearBuiltInputFonGREEN.get(0), yearBuilt, "Year built");
        }
        clickFooter();
    }

    public void setProtectionClass(String protectionClassValue) throws Throwable {
        clickElement(protectionClass, "Protection Class");
        pause(1000);
        typeTextEnter(driver.switchTo().activeElement(), protectionClassValue, "Protection Class");
        clickFooter();
        saveChanges();
        pause(3500);
        if (!protectionClass.getAttribute("value").equalsIgnoreCase(protectionClassValue)) {
            clickFooter();
            clickElement(protectionClass);
            pause(2000);
            try {
                clickElement(dropdownOptions.get(1));
            } catch (Exception e) {
                clickFooter();
                clickElement(protectionClass);
                clickElement(dropdownOptions.get(0));
            }
            clickFooter();
        }
        saveChanges();
    }

    public void setBceg(String bcegValue) throws Throwable {
        typeText(bcegSelect.get(0), bcegValue);
    }

    public void setSquareFootage(String squareFootage) throws Throwable {
        typeText(this.squareFootage, squareFootage);
    }

    public void setSquareFootageFont(String squareFootage) {
        if (squareFootageFontGREEN.size() > 0) {
            typeText(squareFootageFontGREEN.get(0), squareFootage, "Square footage");
        } else {
            typeText(squareFootageFont.get(0), squareFootage, "Square footage");
        }
    }

    public void setNumberOfFloorsAtRiskLocationFont(String numberOfFloorsAtRiskLocationValue) {
        if (numberOfFloorsAtRiskLocationFontGREEN.size() > 0) {
            typeText(numberOfFloorsAtRiskLocationFontGREEN.get(0), numberOfFloorsAtRiskLocationValue, "Number of floors");
        } else {
            typeText(numberOfFloorsAtRiskLocationFont.get(0), numberOfFloorsAtRiskLocationValue, "Number of floors");
        }
    }

    public void setNumberOfFloorsAtRiskLocation(String numberOfFloorsAtRiskLocationValue) throws Throwable {
        typeText(numberOfFloorsAtRiskLocation, numberOfFloorsAtRiskLocationValue);
    }

    public void setTheFloorOnWhichRiskIsLocated(String num) throws Throwable {
        try {
            typeText(riskLocatedFloor, num);
        } catch (Exception e) {
        }
    }

    public void setConstructionType(String constructionTypeValue) {
        typeTextEnter(constructionTypeSelect, constructionTypeValue, "Construction Type");
    }

    public void setFoundationType(String foundationTypeValue) throws Throwable {
        if (foundationType.size() > 0) {
            typeText(foundationType.get(0), foundationTypeValue);
        }
    }

    public void setFoundationTypeP(String foundationTypeValue) throws Throwable {
        if (foundationTypeP.size() > 0) {
            typeText(foundationTypeP.get(0), foundationTypeValue);
        }
    }

    public void setConstructionTypeFont(String constructionTypeValue) throws Throwable {
        if (constructionTypeFontGREEN.size() > 0) {
            typeText(constructionTypeFontGREEN.get(0), constructionTypeValue);
        } else {
            typeText(constructionTypeFont.get(0), constructionTypeValue);
        }
        //Retry fill if field got cleared
        try {
            if (!constructionTypeFontGREEN.isEmpty() && !constructionTypeFontGREEN.get(0).getAttribute("value").equalsIgnoreCase(constructionTypeValue)) {
                saveChanges();
                typeText(constructionTypeFontGREEN.get(0), constructionTypeValue);
                saveChanges();
            }
            if (!constructionTypeFont.isEmpty() && !constructionTypeFont.get(0).getAttribute("value").equalsIgnoreCase(constructionTypeValue)) {
                saveChanges();
                typeText(constructionTypeFont.get(0), constructionTypeValue);
                saveChanges();
            }
        } catch (Exception ignored) {
        }
    }

    public void managerBCEGOverrideYes() throws Throwable {
        clickElement(managerBCEGOverrideYes);
    }

    public void barrierIslandIndicator() throws Throwable {
        clickElement(barrierIslandIndicator);
    }

    public void barrierIslandIndicatorOverride() throws Throwable {
        clickElement(barrierIslandIndicatorOverride);
    }

    public void managerDTCOverride() throws Throwable {
        clickElement(managerDTCOverride);
    }

    public void bcegOverride(String value) throws Throwable {
        typeText(bcegOverride, value);
    }

    public void setExtreme10ProtectionClass(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Construction_Details_Extreme_10_Protection_Class")) && data.get("Construction_Details_Extreme_10_Protection_Class").equalsIgnoreCase("Yes")) {
            checkCheckbox(extreme10ProtectionClass, "Yes");
        }
    }

    public void setProtectionClassOverride(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Construction_Details_Protection_Class_Override")) && data.get("Construction_Details_Protection_Class_Override").equalsIgnoreCase("Yes")) {
            checkManagerPPCOverride(data.get("Construction_Details_Protection_Class_Override"));
            fillProtectionClassOverride(data.get("Construction_Details_Protection_Class"));
        }
    }

    public void fillProtectionClassOverride(String fillProtectionClassOverride) throws Throwable {
        typeText(protectionClassOverride, fillProtectionClassOverride);
    }

    public void checkManagerPPCOverride(String protectionClassOverride) throws Throwable {
        clickElement(managerPPCOverride);
    }

    public void managerPPCOverride() throws Throwable {
        clickElement(managerPPCOverride);
    }

    public void protectionClassOverride(String value) throws Throwable {
        typeText(protectionClassOverride, value);
    }

    public void setYearRenovated(String yearRenovatedText) {
        if (hasValue(yearRenovatedText)) {
            typeText(yearRenovated, yearRenovatedText, "Year renovated");
        }
    }

    public void setSquareFootageHeated(String squareFootageHeatedText) throws Throwable {
        typeText(squareFootageHeated, squareFootageHeatedText);
    }

    public void setCertifiedInspection(String choose) throws Throwable {
        choose(certifiedInspectionYes, certifiedInspectionNo, choose);
    }

    public void setCertifiedInspectionDate(String value) throws Throwable {
        typeText(certifiedInspectionDate, value);
    }

    public void setExteriorWallCoverings(String wallCoverings) throws Throwable {
        pause(1000);
        typeTextEnter(exteriorWallCoverings, wallCoverings, "Exterior Wall Coverings");
    }

    public void setIsHomeSupported(String choose) throws Throwable {
        choose(isHomeSupportedYes, isHomeSupportedNo, choose);
    }

    public void setIsTheHomeLocatedOnAGrade(String choose) throws Throwable {
        choose(isHomeLocatedOnAGradeYes, isHomeLocatedOnAGradeNo, choose, "Is the home located on a grade that is > 20º in slope?");
    }

    public void setIsHomeRetrofittedForEarthquake(String choose) throws Throwable {
        saveChanges();
        pause(3000);
        if (isVisibleOnly(By.xpath("//div[contains(text(),'Is the home retrofitted for Earthquake?')]/../../../../div//label[text()='Yes']/..//input"))) {
            choose(isHomeRetrofittedForEarthquakeYes, isHomeRetrofittedForEarthquakeNo, choose);
        }
    }

    public void setResidenceHaveBasement(String choose) throws Throwable {
        saveChanges();
        pause(3000);
        if (isVisibleOnly(By.xpath("//div[contains(text(),'residence have a basement')]/../../../../div//label[text()='No']/..//input"))) {
            choose(residenceHaveBasementYes, residenceHaveBasementNo, choose);
        }
    }

    public void setIsThisAHandcraftedHome(String choose) throws Throwable {
        choose(handcraftedHomeYes, handcraftedHomeNo, choose);
    }

    public void setDistanceToCoastOverride(String distanceToCoast) throws Throwable {
        if (hasValue(distanceToCoast)) {
            managerDTCOverride();
            pause(2000);
            typeTextEnter(distanceToCoastWE, distanceToCoast, "distance to coast");
            clickFooter();
        }
        pause(6000);
    }

    public void verifyRatingZone(String value) {
        assertCellValue(ratingZone, value, "Rating Zone");
    }

    public void verifyTerritory(String value) {
        assertCellValue(territory, value, "Territory");
    }

    public void verifyProtectionClassDropdownValue(String value) throws Throwable {
        clickElement(protectionClass);
        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox' and @aria-hidden='false']//li[@role='option']"));
        if (options.size() == 2) {
            boolean containsValue = false;
            for (WebElement option : options) {
                String text = option.getText();
                if (text.equals(value)) {
                    containsValue = true;
                }
            }
            if (!containsValue) {
                Assert.fail("Value: " + value + " not found in PPC dropdown");
            } else {
                successLog("Expected " + value + " found in the PPC dropdown");
            }
        } else {
            Assert.fail("More than two options found in PPC dropdown");
        }
        //Click footer
        clickElement(driver.findElement(By.cssSelector("#footer-panel-innerCt")));
        pause(1000);
    }

    public void verifyYearBuilt(String value) {
        if (yearBuiltInputFont.size() > 0) {
            assertCellValue(yearBuiltInputFont.get(0), value, "Year Built");
        } else {
            assertCellValue(yearBuiltInputFonGREEN.get(0), value, "Year Built");
        }
    }

    public void verifyProtectionClassDropdownSize(int size) throws Throwable {
        clickElement(protectionClass);
        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox' and @aria-hidden='false']//li[@role='option']"));
        if (options.size() > size + 1) {
            Assert.fail("Size of PPC dropdown greater than: " + size);
        } else {
            successLog("Protection Class dropdown size matches expected input");
        }
    }

    public void setBasementFinishIs(String value) throws Throwable {
        if (isVisibleOnly(By.xpath("//div[contains(text(),'Basement Finish is')]/../../../../div/..//input"))) {
            typeTextEnter(basementFinishIs, value, "Basement Finish Is");
        }
    }

    public void setBasementFinishQuality(String value) throws Throwable {
        if (isVisibleOnly(By.xpath("//div[contains(text(),'Basement Finish Quality')]/../../../../div/..//input"))) {
            typeTextEnter(basementFinishQuality, value, "Basement Finish Quality");
        }
    }

    public void setTotalBasementSquareFootage(String value) {
        typeText(totalBasementSquareFootageFont, value, "Total Basement Square Footage");
    }

    public void residenceHaveBasement(Map<String, String> data) throws Throwable {
        setResidenceHaveBasement(data.get("Residence_Have_Basement"));
        saveChanges();
        if (data.get("Residence_Have_Basement").equalsIgnoreCase("Yes")) {
            setBasementFinishIs(data.get("Basement_Finish_Is"));
            setBasementFinishQuality(data.get("Basement_Finish_Quality"));
            setTotalBasementSquareFootage(data.get("Basement_Total_SQF"));
        }
    }

    public void residenceHaveBasement(Map<String, String> data, int i) throws Throwable {
        setResidenceHaveBasement(data.get("Residence_Have_Basement_" + i));
        if (data.get("Residence_Have_Basement_" + i).equalsIgnoreCase("Yes")) {
            setBasementFinishIs(data.get("Basement_Finish_Is_" + i));
            setBasementFinishQuality(data.get("Basement_Finish_Quality_" + i));
            setTotalBasementSquareFootage(data.get("Basement_Total_SQF_" + i));
        }
    }

    public void setProjectDescription(String value) throws Throwable {
        typeTextEnter(projectDescription, value, "Project Description");
        clickFooter();
        saveChanges();
        if (!projectDescription.getText().equalsIgnoreCase(value)) {
            typeTextEnter(projectDescription, value, "Project Description");
            clickFooter();
            saveChanges();
        }
    }

    public void setYearPlumbingUpdated(String yearPlumbingUpdatedText) {
        if (hasValue(yearPlumbingUpdatedText)) {
            typeText(yearPlumbingUpdated, yearPlumbingUpdatedText, "Year Plumbing Updated");
        }
    }

    public void setOptionalConstructionDetailsWrapped(Map<String, String> data) throws Throwable {
        setImplicitWaitTo(1);
        if (isVisibleOnly(By.xpath("//div[text()='Year Plumbing Updated']/../../../..//input")))
            setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Electric Updated']/../../../..//input")))
            setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated"));
        if (isVisibleOnly(By.xpath("//div[text()='Year HVAC Updated']/../../../..//input")))
            setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Renovated']/../../../../../..//input")))
            setYearRenovated(data.get("Year_Built_Renovated"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Roof Replaced']/../../../..//input")))
            setYearRoofReplaced(data.get("Construction_Details_Year_Roof_Replaced"));
        setImplicitWaitToDefault();
    }

    private void setOptionalConstructionDetailsWrapped_END(Map<String, String> data) throws Throwable {
        setImplicitWaitTo(1);
        if (isVisibleOnly(By.xpath("//div[text()='Year Plumbing Updated']/../../../..//input")))
            setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_END"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Electric Updated']/../../../..//input")))
            setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_END"));
        if (isVisibleOnly(By.xpath("//div[text()='Year HVAC Updated']/../../../..//input")))
            setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_END"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Renovated']/../../../../../..//input")))
            setYearRenovated(data.get("Year_Built_Renovated_END"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Roof Replaced']/../../../..//input")))
            setYearRoofReplaced(data.get("Construction_Details_Year_Roof_Replaced_END"));
        setImplicitWaitToDefault();
    }

    private void setOptionalConstructionDetailsWrapped_OOS_END(Map<String, String> data) throws Throwable {
        setImplicitWaitTo(1);
        if (isVisibleOnly(By.xpath("//div[text()='Year Plumbing Updated']/../../../..//input")))
            setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_OOS_END"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Electric Updated']/../../../..//input")))
            setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_OOS_END"));
        if (isVisibleOnly(By.xpath("//div[text()='Year HVAC Updated']/../../../..//input")))
            setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_OOS_END"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Renovated']/../../../../../..//input")))
            setYearRenovated(data.get("Year_Built_Renovated_OOS_END"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Roof Replaced']/../../../..//input")))
            setYearRoofReplaced(data.get("Construction_Details_Year_Roof_Replaced_OOS_END"));
        setImplicitWaitToDefault();
    }

    private void setOptionalConstructionDetailsWrapped_RNW(Map<String, String> data) throws Throwable {
        setImplicitWaitTo(1);
        if (isVisibleOnly(By.xpath("//div[text()='Year Plumbing Updated']/../../../..//input")))
            setYearPlumbingUpdated(data.get("Construction_Details_Year_Plumbing_Updated_RNW"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Electric Updated']/../../../..//input")))
            setYearElectricUpdated(data.get("Construction_Details_Year_Electric_Updated_RNW"));
        if (isVisibleOnly(By.xpath("//div[text()='Year HVAC Updated']/../../../..//input")))
            setYearHvacUpdated(data.get("Construction_Details_Year_HVAC_Updated_RNW"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Renovated']/../../../../../..//input")))
            setYearRenovated(data.get("Year_Built_Renovated_RNW"));
        if (isVisibleOnly(By.xpath("//div[text()='Year Roof Replaced']/../../../..//input")))
            setYearRoofReplaced(data.get("Construction_Details_Year_Roof_Replaced_RNW"));
        setImplicitWaitToDefault();
    }

    public void setYearHvacUpdated(String yearHvacUpdatedText) {
        if (hasValue(yearHvacUpdatedText)) {
            typeText(yearHvacUpdated, yearHvacUpdatedText, "Year HVAC Updated");
        }
    }

    public void setYearElectricUpdated(String yearElectricUpdatedText) {
        if (hasValue(yearElectricUpdatedText)) {
            typeText(yearElectricUpdated, yearElectricUpdatedText, "Year Electric Updated");
        }
    }

    public void distanceToCoastOverride(String value) throws Throwable {
        typeText(distanceToCoastOverride, value);
    }

    public void setYearRoofReplaced(String value) {
        if (hasValue(value))
            typeText(yearRoofReplaced, value, "Year Roof Replaced");
    }

    public void setBarrierIsland(String value) throws Throwable {
        if (barrierIslandYes.size() > 0)
            choose(barrierIslandYes.get(0), barrierIslandNo.get(0), value);
    }

    public void setLEEDCertifiedHome(String value) throws Throwable {
        choose(leedCertifiedYes, leedCertifiedNo, value, "LEED Certified Home");
    }

    public void fillBasicConstructionDetailsFS(Map<String, String> data) throws Throwable {
        setYearBuilt(data.get("Year_Built"));
        setSquareFootageFont(data.get("Square_Footage_Under_Air"));
        setConstructionTypeFont(data.get("Construction_Type"));
        setNumberOfFloorsAtRiskLocationFont(data.get("Number_Of_Floors_At_The_Risk_Location"));
        setFoundationTypeP(data.get("Foundation_Type"));
    }

    public void setBeachFront() {
        if (isElementDisplayed(beachFrontNo)) {
            clickElement(beachFrontNo, "Is the home beachfront (500 feet or less from saltwater)");
        }
    }

    public void verifyConstructionType(String value) {
        assertCellValue(constructionTypeFont.get(0), value, "Construction Type");
    }

    public void verifySquareFootage(String value) {
        assertCellValue(squareFootageFont.get(0), value, "Square Footage");
    }

    public void verifyFoundationType(String value) {
        assertCellValue(foundationTypeP.get(0), value, "Foundation Type");
    }

}