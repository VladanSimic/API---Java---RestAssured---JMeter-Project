package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class WindMitigationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WindMitigationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Roof Shape']/../../../..//input")
    WebElement roofShapeSelect;
    @FindBy(xpath = "//font[text()='Roof Shape']/../../../../../..//input")
    List<WebElement> roofShapeFont;
    @FindBy(xpath = "//font[text()='Roof Shape']/../../../../../../..//input")
    List<WebElement> roofShapeFontGREEN;
    @FindBy(xpath = "//div[text()='Roof Covering']/../../../..//input")
    WebElement roofCovering;
    @FindBy(xpath = "//div[text()='Hurricane Fortification']/../../../..//input")
    WebElement hurricaneFortification;
    @FindBy(xpath = "//font[text()='Roof Covering']/../../../../../..//input")
    List<WebElement> roofCoveringFont;
    @FindBy(xpath = "//font[text()='Roof Covering']/../../../../../../..//input")
    List<WebElement> roofCoveringFontGREEN;
    @FindBy(xpath = "//div[text()='Secondary Water Resistance']/../../../..//input")
    WebElement secondaryWaterResistanceSelect;
    @FindBy(xpath = "//div[text()='Opening Protection']/../../../..//input")
    WebElement openingProtectionSelect;
    @FindBy(xpath = "//div[text()='Roof Covering Type']/../../../..//input")
    WebElement roofCoveringType;
    @FindBy(xpath = "//div[text()='Roof Deck']/../../../..//input")
    WebElement roofDeckSelect;
    @FindBy(xpath = "//div[text()='Wall Construction Type']/../../../..//input")
    WebElement wallConstructionType;
    @FindBy(xpath = "//div[text()='Roof Deck Attachment']/../../../..//input")
    WebElement roofDeckAttachment;
    @FindBy(xpath = "//div[text()='What type of Opening Protection?']/../../../..//input")
    WebElement whatTypeOfOpeningProtection;
    @FindBy(xpath = "//div[text()='Roof Wall Connection']/../../../..//input")
    WebElement roofWallConnection;
    @FindBy(xpath = "//div[text()='Roof Covering Credit']/../../../..//input")
    WebElement roofCoveringCredit;
    @FindBy(xpath = "//div[text()='Roof Covering Material']/../../../..//input")
    WebElement roofCoveringMaterial;
    @FindBy(xpath = "//font[text()='Roof Covering Material']/../../../../../..//input")
    WebElement roofCoveringMaterialFont;
    @FindBy(xpath = "//div[text()='roof characteristics' or text()='wind mitigation']")
    WebElement roofWindBlock;
    @FindBy(xpath = "//div[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = 'year roof replaced']/../../../..//input\n")
    WebElement yearRoofReplaced;
    @FindBy(xpath = "//div[text()='FORTIFIED Designation']/../../../..//input")
    WebElement fortifiedDesignation;
    @FindBy(xpath = "//div[text()='Designation Expiration Date']/../../../..//input")
    WebElement designationExpirationDate;

    public void fillBasicWindMitigationDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("wind mitigation");
        setRoofShape(data.get("Wind_Mitigation_Roof_Shape"));
        setRoofCovering(data.get("Wind_Mitigation_Roof_Covering"));
        setSecondaryWaterResistance(data.get("Wind_Mitigation_Secondary_Water_Resistance"));
        setRoofWallConnection(data.get("Wind_Mitigation_Roof_Wall_Connection"));
        setOpeningProtection(data.get("Wind_Mitigation_Opening_Protection"));
        setRoofDeckAttachment(data.get("Wind_Mitigation_Roof_Deck_Attachment"));
        saveChanges();
    }

    public void fillBasicWindMitigationDetailsCC_END(Map<String, String> data) throws Throwable {
        setRoofShape(data.get("Wind_Mitigation_Roof_Shape_END"));
        setRoofCovering(data.get("Wind_Mitigation_Roof_Covering_END"));
        setSecondaryWaterResistance(data.get("Wind_Mitigation_Secondary_Water_Resistance_END"));
        setRoofWallConnection(data.get("Wind_Mitigation_Roof_Wall_Connection_END"));
        setOpeningProtection(data.get("Wind_Mitigation_Opening_Protection_END"));
        setRoofDeckAttachment(data.get("Wind_Mitigation_Roof_Deck_Attachment_END"));
        saveChanges();
    }

    public void setYearRoofReplaced(String value) {
        typeTextEnter(yearRoofReplaced, value, "Year Roof Replaced");
    }

    public void fillBasicWindMitigationDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("wind mitigation");
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                            case "DC": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                            }
                            break;
                            case "RI":
                            case "CT":
                            case "MA":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                            }
                            break;
                            case "AL": {
                                if (isElementDisplayed(hurricaneFortification))
                                    setHurricaneFortification(data.get("Hurricane_Fortification"));
                                else
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCovering(data.get("Roof_Covering"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setWallConstructionType(data.get("Wall_Construction_Type"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                pause(1000);
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setHurricaneFortification(data.get("Hurricane_Fortification"));
                            }
                            break;
                            case "MS": {
                                if (isElementDisplayed(hurricaneFortification))
                                    setHurricaneFortification(data.get("Hurricane_Fortification"));
                                else
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofShapeFont(data.get("Roof_Shape"));
                                if (isElementDisplayed(secondaryWaterResistanceSelect)) {
                                    //Required due to Zone 4 to 5 Read-Only fields MS Specific
                                    if (!isReadOnly(secondaryWaterResistanceSelect)) {
                                        setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                        setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                        setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                                        setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection"));
                                    }
                                }
                            }
                            break;
                            case "NC": {
                                if (isElementDisplayed(hurricaneFortification))
                                    setHurricaneFortification(data.get("Hurricane_Fortification"));
                                else
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setRoofShapeFont(data.get("Roof_Shape"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape"));
                                try {
                                    setRoofCoveringFont(data.get("Roof_Covering"));
                                } catch (Exception e) {
                                    //
                                }
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringType(data.get("Roof_Covering_Type"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                                    setRoofDeck(data.get("Roof_Deck"));
                                } catch (Exception e) {
                                    //todo see which fields show which fields HO
                                }
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCoveringMaterial(data.get("Roof_Covering"));
                            }
                            break;
                            case "GA": {
                                if (isElementDisplayed(fortifiedDesignation))
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofShape(data.get("Roof_Shape"));
                            }
                            break;
                            case "MI": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCoveringMaterial(data.get("Roof_Covering"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringMaterial(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                            case "MD": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                            case "MA":
                            case "RI": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setWallConstructionType(data.get("Wall_Construction_Type"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                //setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofDeck(data.get("Roof_Deck"));
                                setRoofCoveringType(data.get("Roof_Covering_Type"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                                } catch (Exception e) {
                                    //todo see which fields show which fields HO
                                }
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringMaterial(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                            case "MD":
                            case "DE":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                            case "MA":
                            case "DC":
                            case "CT":
                            case "RI":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setWallConstructionType(data.get("Wall_Construction_Type"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setRoofDeck(data.get("Roof_Deck"));
                                setRoofCoveringType(data.get("Roof_Covering_Type"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setOpeningProtection(data.get("Opening_Protection"));
                            }
                            break;
                        }
                    }
                    break;
                }
                setYearRoofReplaced(data.get("Wind_Mitigation_Year_Roof_Replaced"));
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK":
                            case "DC":
                            case "PA":
                            case "RI":
                            case "CT":
                            case "MA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "NJ": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "NY":
                            case "AL": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA":
                            case "HI":
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "MS": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "NC": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));

                            }
                            break;
                            case "GA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                            }
                            break;
                            case "MI":
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "RI":
                            case "MD":
                            case "MA":
                            case "TX":
                            case "HI":
                            case "LA":
                            case "SC":
                                break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance"));
                                setOpeningProtection(data.get("Opening_Protection"));
//                                setRoofCoveringType(data.get("Roof_Covering_Type"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment"));
                                    setRoofDeck(data.get("Roof_Deck"));
                                } catch (Exception e) {
                                    //todo see which fields show which fields
                                }
                                break;
                            }
                        }
                    }
                }
            }
            break;
        }
        saveChanges();
        pause(2000);
    }

    public void fillBasicWindMitigationDetails_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("wind mitigation");
        switch (data.get("Admitted_Line_END")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_END")) {
                    case "Homeowner": {
                        switch (data.get("State_END")) {
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                            case "DC": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                            }
                            break;
                            case "RI":
                            case "CT":
                            case "MA":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                            }
                            break;
                            case "AL": {
                                if (isElementDisplayed(hurricaneFortification))
                                    setHurricaneFortification(data.get("Hurricane_Fortification_END"));
                                else
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation_END"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setWallConstructionType(data.get("Wall_Construction_Type_END"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                pause(1000);
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setHurricaneFortification(data.get("Hurricane_Fortification_END"));
                            }
                            break;
                            case "MS": {
                                if (isElementDisplayed(hurricaneFortification))
                                    setHurricaneFortification(data.get("Hurricane_Fortification_END"));
                                else
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation_END"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                            }
                            break;
                            case "NC": {
                                setHurricaneFortification(data.get("Hurricane_Fortification_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                try {
                                    setRoofCoveringFont(data.get("Roof_Covering_END"));
                                } catch (Exception e) {
                                    //
                                }
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringType(data.get("Roof_Covering_Type_END"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                                    setRoofDeck(data.get("Roof_Deck_END"));
                                } catch (Exception e) {
                                    //todo see which fields show which fields HO
                                }
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_END"));
                            }
                            break;
                            case "GA": {
                                if (isElementDisplayed(fortifiedDesignation))
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation_END"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofShape(data.get("Roof_Shape_END"));
                            }
                            break;
                            case "MI": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State_END")) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                            case "MD": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                            case "MA":
                            case "RI": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setWallConstructionType(data.get("Wall_Construction_Type_END"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_END"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                //setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofDeck(data.get("Roof_Deck_END"));
                                setRoofCoveringType(data.get("Roof_Covering_Type_END"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                                } catch (Exception e) {
                                    //todo see which fields show which fields HO
                                }
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_END")) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                            case "MD":
                            case "DE":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                            case "MA":
                            case "DC":
                            case "CT":
                            case "RI":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setWallConstructionType(data.get("Wall_Construction_Type_END"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_END"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setRoofDeck(data.get("Roof_Deck_END"));
                                setRoofCoveringType(data.get("Roof_Covering_Type_END"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                            }
                            break;
                        }
                    }
                    break;
                }
                setYearRoofReplaced(data.get("Wind_Mitigation_Year_Roof_Replaced_END"));
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type_END")) {
                    case "Homeowner": {
                        switch (data.get("State_END")) {
                            case "AK":
                            case "DC":
                            case "PA":
                            case "RI":
                            case "CT":
                            case "MA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "NJ": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "NY":
                            case "AL": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA":
                            case "HI":
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "MS": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "NC": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));

                            }
                            break;
                            case "GA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                            }
                            break;
                            case "MI":
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "RI":
                            case "MD":
                            case "MA":
                            case "TX":
                            case "HI":
                            case "LA":
                            case "SC":
                                break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_END"));
                                setOpeningProtection(data.get("Opening_Protection_END"));
//                                setRoofCoveringType(data.get("Roof_Covering_Type_END"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_END"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_END"));
                                    setRoofDeck(data.get("Roof_Deck"));
                                } catch (Exception e) {
                                    //todo see which fields show which fields
                                }
                                break;
                            }
                        }
                    }
                }
            }
            break;
        }
        saveChanges();
        pause(2000);
    }

    public void fillBasicWindMitigationDetails_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("wind mitigation");
        switch (data.get("Admitted_Line_OOS_END")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_OOS_END")) {
                    case "Homeowner": {
                        switch (data.get("State_OOS_END")) {
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                            case "DC": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                            case "RI":
                            case "CT":
                            case "MA":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                            case "AL": {
                                if (isElementDisplayed(hurricaneFortification))
                                    setHurricaneFortification(data.get("Hurricane_Fortification_OOS_END"));
                                else
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation_OOS_END"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setWallConstructionType(data.get("Wall_Construction_Type_OOS_END"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                pause(1000);
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setHurricaneFortification(data.get("Hurricane_Fortification_OOS_END"));
                            }
                            break;
                            case "MS": {
                                if (isElementDisplayed(hurricaneFortification))
                                    setHurricaneFortification(data.get("Hurricane_Fortification_OOS_END"));
                                else
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation_OOS_END"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                            }
                            break;
                            case "NC": {
                                setHurricaneFortification(data.get("Hurricane_Fortification_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                try {
                                    setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                } catch (Exception e) {
//
                                }
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringType(data.get("Roof_Covering_Type_OOS_END"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                                    setRoofDeck(data.get("Roof_Deck_OOS_END"));
                                } catch (Exception e) {
//todo see which fields show which fields HO
                                }
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                            case "GA": {
                                if (isElementDisplayed(fortifiedDesignation))
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation_OOS_END"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                            }
                            break;
                            case "MI": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State_OOS_END")) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                            case "MD": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                            case "MA":
                            case "RI": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setWallConstructionType(data.get("Wall_Construction_Type_OOS_END"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_OOS_END"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
//setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofDeck(data.get("Roof_Deck_OOS_END"));
                                setRoofCoveringType(data.get("Roof_Covering_Type_OOS_END"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                                } catch (Exception e) {
//todo see which fields show which fields HO
                                }
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_OOS_END")) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                            case "MD":
                            case "DE":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                            case "MA":
                            case "DC":
                            case "CT":
                            case "RI":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setWallConstructionType(data.get("Wall_Construction_Type_OOS_END"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_OOS_END"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setRoofDeck(data.get("Roof_Deck_OOS_END"));
                                setRoofCoveringType(data.get("Roof_Covering_Type_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;
                }
                setYearRoofReplaced(data.get("Wind_Mitigation_Year_Roof_Replaced_OOS_END"));
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type_OOS_END")) {
                    case "Homeowner": {
                        switch (data.get("State_OOS_END")) {
                            case "AK":
                            case "DC":
                            case "PA":
                            case "RI":
                            case "CT":
                            case "MA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "NJ": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "NY":
                            case "AL": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA":
                            case "HI":
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "MS": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "NC": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));

                            }
                            break;
                            case "GA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                            }
                            break;
                            case "MI":
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "RI":
                            case "MD":
                            case "MA":
                            case "TX":
                            case "HI":
                            case "LA":
                            case "SC":
                                break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_OOS_END"));
                                setOpeningProtection(data.get("Opening_Protection_OOS_END"));
//                                setRoofCoveringType(data.get("Roof_Covering_Type_OOS_END"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_OOS_END"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_OOS_END"));
                                    setRoofDeck(data.get("Roof_Deck"));
                                } catch (Exception e) {
//todo see which fields show which fields
                                }
                                break;
                            }
                        }
                    }
                }
            }
            break;
        }
        saveChanges();
        pause(2000);
    }

    public void fillBasicWindMitigationDetails_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("wind mitigation");
        switch (data.get("Admitted_Line_RNW")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_RNW")) {
                    case "Homeowner": {
                        switch (data.get("State_RNW")) {
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                            case "DC": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                            }
                            break;
                            case "RI":
                            case "CT":
                            case "MA":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                            }
                            break;
                            case "AL": {
                                if (isElementDisplayed(hurricaneFortification))
                                    setHurricaneFortification(data.get("Hurricane_Fortification_RNW"));
                                else
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation_RNW"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setWallConstructionType(data.get("Wall_Construction_Type_RNW"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                pause(1000);
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setHurricaneFortification(data.get("Hurricane_Fortification_RNW"));
                            }
                            break;
                            case "MS": {
                                if (isElementDisplayed(hurricaneFortification))
                                    setHurricaneFortification(data.get("Hurricane_Fortification_RNW"));
                                else
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation_RNW"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                            }
                            break;
                            case "NC": {
                                setHurricaneFortification(data.get("Hurricane_Fortification_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                try {
                                    setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                } catch (Exception e) {
//
                                }
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringType(data.get("Roof_Covering_Type_RNW"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                                    setRoofDeck(data.get("Roof_Deck_RNW"));
                                } catch (Exception e) {
//todo see which fields show which fields HO
                                }
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_RNW"));
                            }
                            break;
                            case "GA": {
                                if (isElementDisplayed(fortifiedDesignation))
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation_RNW"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofShape(data.get("Roof_Shape_RNW"));
                            }
                            break;
                            case "MI": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State_RNW")) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                            case "MD": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                            case "MA":
                            case "RI": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setWallConstructionType(data.get("Wall_Construction_Type_RNW"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_RNW"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
//setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofDeck(data.get("Roof_Deck_RNW"));
                                setRoofCoveringType(data.get("Roof_Covering_Type_RNW"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                                } catch (Exception e) {
//todo see which fields show which fields HO
                                }
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_RNW")) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                            case "MD":
                            case "DE":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                            case "MA":
                            case "DC":
                            case "CT":
                            case "RI":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setWallConstructionType(data.get("Wall_Construction_Type_RNW"));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_RNW"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setRoofDeck(data.get("Roof_Deck_RNW"));
                                setRoofCoveringType(data.get("Roof_Covering_Type_RNW"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                            }
                            break;
                        }
                    }
                    break;
                }
                setYearRoofReplaced(data.get("Wind_Mitigation_Year_Roof_Replaced_RNW"));
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type_RNW")) {
                    case "Homeowner": {
                        switch (data.get("State_RNW")) {
                            case "AK":
                            case "DC":
                            case "PA":
                            case "RI":
                            case "CT":
                            case "MA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "NJ": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "NY":
                            case "AL": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA":
                            case "HI":
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "MS": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "NC": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));

                            }
                            break;
                            case "GA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                            }
                            break;
                            case "MI":
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "RI":
                            case "MD":
                            case "MA":
                            case "TX":
                            case "HI":
                            case "LA":
                            case "SC":
                                break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_RNW"));
                                setOpeningProtection(data.get("Opening_Protection_RNW"));
//                                setRoofCoveringType(data.get("Roof_Covering_Type_RNW"));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_RNW"));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_RNW"));
                                    setRoofDeck(data.get("Roof_Deck"));
                                } catch (Exception e) {
//todo see which fields show which fields
                                }
                                break;
                            }
                        }
                    }
                }
            }
            break;
        }
        saveChanges();
        pause(2000);
    }

    public void fillBasicWindMitigationDetails(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        switch (data.get("State_" + i)) {
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                            }
                            break;
                            case "DC": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "RI":
                            case "CT":
                            case "MA":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "AL": {
                                setHurricaneFortification(data.get("Hurricane_Fortification_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setWallConstructionType(data.get("Wall_Construction_Type_" + i));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                pause(1000);
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setHurricaneFortification(data.get("Hurricane_Fortification_" + i));
                            }
                            break;
                            case "MS": {
                                pause(5000);
                                setHurricaneFortification(data.get("Hurricane_Fortification_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_" + i));
                            }
                            break;
                            case "NC": {
                                pause(5000);
                                setHurricaneFortification(data.get("Hurricane_Fortification_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringType(data.get("Roof_Covering_Type_" + i));
                                try {
                                    setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                    setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                                    setRoofDeck(data.get("Roof_Deck_" + i));
                                } catch (Exception e) {
                                    //todo see which fields show which fields HO
                                }
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterial(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "GA": {
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofShape(data.get("Roof_Shape_" + i));
                            }
                            break;
                            case "MI": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCoveringMaterial(data.get("Roof_Covering_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State_" + i)) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringMaterial(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                            }
                            break;
                            case "MD": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                            }
                            break;
                            case "MA":
                            case "RI": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setWallConstructionType(data.get("Wall_Construction_Type_" + i));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_" + i));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setRoofDeck(data.get("Roof_Deck_" + i));
                                setRoofCoveringType(data.get("Roof_Covering_Type_" + i));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_" + i)) {
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringMaterial(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                            }
                            break;
                            case "MD":
                            case "DE":
                            case "VA": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                            }
                            break;
                            case "MA":
                            case "DC":
                            case "CT":
                            case "RI":
                            case "NJ":
                            case "NY": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                            }
                            break;
                            case "HI": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setWallConstructionType(data.get("Wall_Construction_Type_" + i));
                            }
                            break;
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                                setWhatTypeOfOpeningProtection(data.get("What_Type_Of_Opening_Protection_" + i));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setRoofDeck(data.get("Roof_Deck_" + i));
                                setRoofCoveringType(data.get("Roof_Covering_Type_" + i));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "AK": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                            }
                            break;
                            case "PA": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
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
                        switch (data.get("State_" + i)) {
                            case "AK":
                            case "DC":
                            case "PA":
                            case "RI":
                            case "CT":
                            case "MA": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "NJ": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "SC": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "NY":
                            case "AL": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "DE":
                            case "MD":
                            case "VA":
                            case "HI":
                            case "LA": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "MS": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "NC": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "FL": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "TX": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));

                            }
                            break;
                            case "GA": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setSecondaryWaterResistance(data.get("Secondary_Water_Resistance_" + i));
                                setOpeningProtection(data.get("Opening_Protection_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofWallConnection(data.get("Roof_Wall_Connection_" + i));
                                setRoofDeckAttachment(data.get("Roof_Deck_Attachment_" + i));
                            }
                            break;
                            case "MI":
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State_" + i)) {
                            case "RI":
                            case "MD":
                            case "MA":
                            case "TX":
                            case "HI":
                            case "LA":
                            case "FL":
                            case "SC":
                        }
                    }
                }
            }
            break;
        }

        saveChanges();
    }

    public void setWhatTypeOfOpeningProtection(String openingProtection) throws Throwable {
        clickElement(roofWindBlock);
        clickElement(whatTypeOfOpeningProtection);
        pause(500);
        typeText(whatTypeOfOpeningProtection, openingProtection);
    }

    public void setRoofWallConnection(String roofWallConnectionValue) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(roofWallConnection, roofWallConnectionValue, "Roof Wall Connection");
    }

    public void setRoofShapeFont(String roofShapeValue) throws Throwable {
        clickElement(roofWindBlock);
        if (roofShapeFont.size() > 0) {
            clickElement(roofShapeFont.get(0));
            pause(500);
            typeText(roofShapeFont.get(0), roofShapeValue);
        } else {
            clickElement(roofShapeFontGREEN.get(0));
            pause(500);
            typeText(roofShapeFontGREEN.get(0), roofShapeValue);
        }
    }

    public void setRoofShape(String roofShapeValue) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(roofShapeSelect, roofShapeValue, "Roof Shape Value");
    }

    public void setRoofCovering(String covering) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(roofCovering, covering, "Roof Covering");
    }

    public void setHurricaneFortification(String hurricaneFortificationValue) throws Throwable {
        clickElement(roofWindBlock);
        clickElement(hurricaneFortification);
        pause(500);
        typeTextEnter(hurricaneFortification, hurricaneFortificationValue, "Hurricane Fortification");
        saveChanges();
    }

    public void setRoofCoveringFont(String covering) throws Throwable {
        clickElement(roofWindBlock);
        if (roofCoveringFont.size() > 0) {
            clickElement(roofCoveringFont.get(0));
            pause(500);
            typeText(roofCoveringFont.get(0), covering);
        } else {
            clickElement(roofCoveringFontGREEN.get(0));
            pause(500);
            typeText(roofCoveringFontGREEN.get(0), covering);
        }
    }

    public void setSecondaryWaterResistance(String secondaryWaterResistanceValue) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(secondaryWaterResistanceSelect, secondaryWaterResistanceValue, "Secondary Water Resistance");
    }

    public void setOpeningProtection(String openingProtectionValue) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(openingProtectionSelect, openingProtectionValue, "Opening Protection");
    }

    public void setRoofCoveringType(String value) throws Throwable {
        clickElement(roofWindBlock);
        clickElement(roofCoveringType);
        pause(500);
        typeText(roofCoveringType, value);
    }

    public void setRoofDeck(String roofDeckValue) throws Throwable {
        clickElement(roofWindBlock);
        clickElement(roofDeckSelect);
        pause(500);
        typeText(roofDeckSelect, roofDeckValue);
    }

    public void setWallConstructionType(String wallConstructionTypeValue) throws Throwable {
        clickElement(roofWindBlock);
        clickElement(wallConstructionType);
        pause(500);
        typeText(wallConstructionType, wallConstructionTypeValue);
    }

    public void setRoofDeckAttachment(String roofDeck) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(roofDeckAttachment, roofDeck, "Roof Deck Attachment");
    }

    public void setCoveringCredit(String coveringCredit) throws Throwable {
        clickElement(roofWindBlock);
        clickElement(roofCoveringCredit);
        pause(500);
        typeText(roofCoveringCredit, coveringCredit);
    }

    public void setRoofCoveringMaterial(String roofCoveringText) throws Throwable {
        clickElement(roofWindBlock);
        if (isElementDisplayed(roofCoveringMaterialFont))
            typeTextEnter(roofCoveringMaterialFont, roofCoveringText, "Roof Covering Material - Font");
        else
            typeTextEnter(roofCoveringMaterial, roofCoveringText, "Roof Covering Material");
    }

    public void fillBasicWindMitigationDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("wind mitigation");
        setRoofShapeFontHS(data.get("Wind_Mitigation_Roof_Shape"));
        setRoofCoveringFontHS(data.get("Wind_Mitigation_Roof_Covering"));
        setYearRoofReplaced(data.get("Wind_Mitigation_Year_Roof_Replaced"));
        setSecondaryWaterResistance(data.get("Wind_Mitigation_Secondary_Water_Resistance"));
        setOpeningProtection(data.get("Wind_Mitigation_Opening_Protection"));
        setRoofWallConnection(data.get("Wind_Mitigation_Roof_Wall_Connection"));
        setRoofDeckAttachment(data.get("Wind_Mitigation_Roof_Deck_Attachment"));
        saveChanges();
    }

    public void fillBasicWindMitigationDetailsHS_END(Map<String, String> data) throws Throwable {
        setRoofShapeFontHS(data.get("Wind_Mitigation_Roof_Shape_END"));
        setRoofCoveringFontHS(data.get("Wind_Mitigation_Roof_Covering_END"));
        setYearRoofReplaced(data.get("Wind_Mitigation_Year_Roof_Replaced_END"));
        setSecondaryWaterResistance(data.get("Wind_Mitigation_Secondary_Water_Resistance_END"));
        setOpeningProtection(data.get("Wind_Mitigation_Opening_Protection_END"));
        setRoofWallConnection(data.get("Wind_Mitigation_Roof_Wall_Connection_END"));
        setRoofDeckAttachment(data.get("Wind_Mitigation_Roof_Deck_Attachment_END"));
        saveChanges();
    }

    public void fillBasicWindMitigationDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        setRoofShapeFontHS(data.get("Wind_Mitigation_Roof_Shape_OOS_END"));
        setRoofCoveringFontHS(data.get("Wind_Mitigation_Roof_Covering_OOS_END"));
        setYearRoofReplaced(data.get("Wind_Mitigation_Year_Roof_Replaced_OOS_END"));
        setSecondaryWaterResistance(data.get("Wind_Mitigation_Secondary_Water_Resistance_OOS_END"));
        setOpeningProtection(data.get("Wind_Mitigation_Opening_Protection_OOS_END"));
        setRoofWallConnection(data.get("Wind_Mitigation_Roof_Wall_Connection_OOS_END"));
        setRoofDeckAttachment(data.get("Wind_Mitigation_Roof_Deck_Attachment_OOS_END"));
        saveChanges();
    }

    public void fillBasicWindMitigationDetailsHS_RNW(Map<String, String> data) throws Throwable {
        setRoofShapeFontHS(data.get("Wind_Mitigation_Roof_Shape_RNW"));
        setRoofCoveringFontHS(data.get("Wind_Mitigation_Roof_Covering_RNW"));
        setYearRoofReplaced(data.get("Wind_Mitigation_Year_Roof_Replaced_RNW"));
        setSecondaryWaterResistance(data.get("Wind_Mitigation_Secondary_Water_Resistance_RNW"));
        setOpeningProtection(data.get("Wind_Mitigation_Opening_Protection_RNW"));
        setRoofWallConnection(data.get("Wind_Mitigation_Roof_Wall_Connection_RNW"));
        setRoofDeckAttachment(data.get("Wind_Mitigation_Roof_Deck_Attachment_RNW"));
        saveChanges();
    }

    public void setRoofShapeFontHS(String roofShapeValue) throws Throwable {
        if (hasValue(roofShapeValue)) {
            clickElement(roofWindBlock);
            if (roofShapeFont.size() > 0) {
                clickElement(roofShapeFont.get(0));
                pause(500);
                typeTextEnter(roofShapeFont.get(0), roofShapeValue, "Roof Shape Value");
            } else if (roofShapeFontGREEN.size() > 0) {
                typeTextEnter(roofShapeFontGREEN.get(0), roofShapeValue, "Roof Shape Value");
            } else {
                clickElement(roofWindBlock);
                typeTextEnter(roofShapeSelect, roofShapeValue, "Roof Shape Value");
            }
        }
    }

    public void setRoofCoveringFontHS(String covering) throws Throwable {
        if (hasValue(covering)) {
            clickElement(roofWindBlock);
            if (roofCoveringFont.size() > 0) {
                clickElement(roofCoveringFont.get(0));
                pause(500);
                typeText(roofCoveringFont.get(0), covering);
            } else if (roofCoveringFontGREEN.size() > 0) {
                typeTextEnter(roofCoveringFontGREEN.get(0), covering, "Roof Covering");
            } else {
                clickElement(roofWindBlock);
                typeTextEnter(roofCovering, covering, "Roof Covering");
            }
        }
    }

    public void setFortifiedDesignation(String value, String expDate) {
        clickElement(roofWindBlock, "wind block");
        typeTextEnter(fortifiedDesignation, value, "FORTIFIED Designation");
        if (!value.equalsIgnoreCase("None"))
            typeTextEnter(designationExpirationDate, expDate, "Designation Expiration Date");
    }

    public void fillBasicWindMitigationDetailsFS(Map<String, String> data) {

    }



}