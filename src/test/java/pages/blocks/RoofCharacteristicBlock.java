package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class RoofCharacteristicBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public RoofCharacteristicBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//font[text()='Roof Shape']/../../../../../..//input")
    List<WebElement> roofShapeFont;
    @FindBy(xpath = "//font[text()='Roof Shape']/../../../../../../..//input")
    List<WebElement> roofShapeFontGREEN;
    @FindBy(xpath = "//div[text()='Roof Shape']/../../../..//input")
    WebElement roofShape;
    @FindBy(xpath = "//font[text()='Roof Covering']/../../../../../..//input")
    List<WebElement> roofCoveringFont;
    @FindBy(xpath = "//font[text()='Roof Covering']/../../../../../../..//input")
    List<WebElement> roofCoveringFontGREEN;
    @FindBy(xpath = "//div[text()='Roof Covering']/../../../..//input")
    WebElement roofCovering;
    @FindBy(xpath = "//*[text()='Roof Covering Material']/../../../../../../div//input")
    List<WebElement> roofCoveringMaterialFont;
    @FindBy(xpath = "//*[text()='Roof Covering Material']/../../../../../../../div//input")
    List<WebElement> roofCoveringMaterialFontGREEN;
    @FindBy(xpath = "//div[text()='Roof Covering Material']/../../../..//input")
    WebElement roofCoveringMaterial;
    @FindBy(xpath = "//div[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = 'year roof replaced']/../../../..//input\n")
    WebElement yearRoofReplaced;
    @FindBy(xpath = "//div[text()='Roof Covering Credit']/../../../..//input")
    WebElement roofCoveringCredit;
    @FindBy(xpath = "//div[text()='roof characteristics' or text()='wind mitigation']")
    WebElement roofWindBlock;
    @FindBy(xpath = "//div[text()='Roof Age Confidence']/../../../..//input")
    WebElement roofAgeConfidence;
    @FindBy(xpath = "//div[text()='3rd Party Roof Replacement Year']/../../../..//input")
    WebElement thirdPartyRoofReplacementYear;
    @FindBy(xpath = "//div[text()='Home Fortification']/../../../..//input")
    WebElement homeFortification;
    @FindBy(xpath = "//div[text()='FORTIFIED Designation']/../../../..//input")
    WebElement fortifiedDesignation;
    @FindBy(xpath = "//div[text()='Designation Expiration Date']/../../../..//input")
    WebElement designationExpirationDate;


    public void setRoofShapeFont(String roofShapeText) throws Throwable {
        clickElement(roofWindBlock);
        if (roofShapeFontGREEN.size() > 0) {
            typeTextEnter(roofShapeFontGREEN.get(0), roofShapeText, "Roof Shape");
        } else {
            typeTextEnter(roofShapeFont.get(0), roofShapeText, "Roof Shape");
        }
    }

    public void setRoofShape(String roofShapeText) throws Throwable {
        try {
            clickElement(roofWindBlock);
        } catch (Exception e) {}
        typeTextEnter(roofShape, roofShapeText, "Roof Shape");
    }

    public void setCoveringCredit(String coveringCredit) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(roofCoveringCredit, coveringCredit, "Roof Covering Credit");
    }

    public void setRoofCoveringFont(String roofCoveringText) throws Throwable {
        clickElement(roofWindBlock);
        if (roofCoveringFontGREEN.size() > 0) {
            typeTextEnter(roofCoveringFontGREEN.get(0), roofCoveringText, "Roof Covering");
        } else {
            typeTextEnter(roofCoveringFont.get(0), roofCoveringText, "Roof Covering");
        }
    }

    public void setRoofCovering(String roofCoveringText) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(roofCovering, roofCoveringText, "Roof Covering");
    }

    public void setRoofCoveringMaterialFont(String roofCoveringText) throws Throwable {
        clickElement(roofWindBlock);
        if (roofCoveringMaterialFontGREEN.size() > 0) {
            typeTextEnter(roofCoveringMaterialFontGREEN.get(0), roofCoveringText, "Roof Covering Material");
        } else {
            typeTextEnter(roofCoveringMaterialFont.get(0), roofCoveringText, "Roof Covering Material");
        }
    }

    public void setRoofCoveringMaterial(String roofCoveringText) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(roofCoveringMaterial, roofCoveringText, "Roof Covering Material");
    }

    public void setYearRoofReplaced(String yearRoofReplacedText) throws Throwable {
        clickElement(roofWindBlock);
        typeTextEnter(yearRoofReplaced, yearRoofReplacedText, "year roof replaced");
    }

    public void fillInRoofCharacteristics(Map<String, String> data) throws Throwable {
        verifyBlockExists("roof characteristics");
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AR":
                            case "TX":
                            case "GA":
                            case "PA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "WV":
                            case "CA": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "AZ": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "CO":
                            case "IL":
                            case "IN":
                            case "ID": {
                                setRoofShape(data.get("Roof_Shape"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            case "KS": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "MT":
                            case "IA":
                            case "NV": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "KY": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCovering(data.get("Roof_Covering"));
                                if (isElementDisplayed(fortifiedDesignation))
                                    setFortifiedDesignation(data.get("Wind_Mitigation_Fortified_Designation"), data.get("Wind_Mitigation_Fortified_Designation_Exp_Date"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "MN": {
                                setRoofShape(data.get("Roof_Shape"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering"));
                                setHomeFortification(data.get("Roof_Characteristics_Home_Fortification"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "MO":
                            case "OH":
                            case "WY": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCoveringMaterial(data.get("Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "ND": {
                                setRoofCovering(data.get("Roof_Covering"));
                                setRoofShape(data.get("Roof_Shape"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "NE":
                            case "OK":
                            case "UT": {
                                setRoofShape(data.get("Roof_Shape"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCoveringMaterial(data.get("Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "NH": {
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "NM": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "OR": {
                                setRoofShape(data.get("Roof_Shape"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "SD": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "TN": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setRoofCoveringCredit(data.get("Roof_Covering_Credit"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "VT":
                            case "ME": {
                                setRoofCoveringFont(data.get("Roof_Covering"));
                                setRoofShape(data.get("Roof_Shape"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "WA": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                            case "WI": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
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
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AR":
                            case "NH":
                            case "SD": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                            }
                            break;
                            case "ME":
                            case "VT": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Covering"));
                            }
                            break;
                            case "CA":
                            case "WV":
                            case "TN":
                            case "ND": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                            }
                            break;
                            case "KY": {
                                setRoofShapeFont(data.get("Roof_Shape"));
                                setRoofCovering(data.get("Roof_Covering"));
                            }
                            break;
                            case "MI": {
                                setRoofShape(data.get("Roof_Shape"));
                                setRoofCoveringMaterial(data.get("Roof_Covering"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                            }
                            break;
                            case "IN": {

                                setRoofShape(data.get("Roof_Shape"));
                                setCoveringCredit(data.get("Roof_Covering_Credit"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Risk_Addresses_Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "CA": {
                                setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                        switch (data.get("State")) {
                            case "CA": {
                                setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape"));
                                setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
                            }
                            break;
                        }
                        break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillInRoofCharacteristics_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("roof characteristics");
        switch (data.get("Admitted_Line_END")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_END")) {
                    case "Homeowner": {
                        switch (data.get("State_END")) {
                            case "AR":
                            case "TX":
                            case "GA":
                            case "PA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "WV":
                            case "CA": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "AZ": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "CO":
                            case "IL":
                            case "IN":
                            case "ID": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            case "KS": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "MT":
                            case "IA":
                            case "NV": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "KY": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "MN": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_END"));
                                setHomeFortification(data.get("Roof_Characteristics_Home_Fortification_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "MO":
                            case "OH":
                            case "WY": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "ND": {
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setRoofShape(data.get("Roof_Shape_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "NE":
                            case "OK":
                            case "UT": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "NH": {
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "NM": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "OR": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "SD": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "TN": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setRoofCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "VT":
                            case "ME": {
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                                setRoofShape(data.get("Roof_Shape_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "WA": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                            case "WI": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
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
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State_END")) {
                            case "AR":
                            case "NH":
                            case "SD": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                            }
                            break;
                            case "ME":
                            case "VT": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_END"));
                            }
                            break;
                            case "CA":
                            case "WV":
                            case "TN":
                            case "ND": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                            }
                            break;
                            case "KY": {
                                setRoofShapeFont(data.get("Roof_Shape_END"));
                                setRoofCovering(data.get("Roof_Covering_END"));
                            }
                            break;
                            case "MI": {
                                setRoofShape(data.get("Roof_Shape_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                            }
                            break;
                            case "IN": {

                                setRoofShape(data.get("Roof_Shape_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_END"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Risk_Addresses_Residence_Type_END")) {
                    case "Homeowner": {
                        switch (data.get("State_END")) {
                            case "CA": {
                                setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                        switch (data.get("State_END")) {
                            case "CA": {
                                setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape_END"));
                                setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
                            }
                            break;
                        }
                        break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillInRoofCharacteristics_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("roof characteristics");
        switch (data.get("Admitted_Line_OOS_END")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_OOS_END")) {
                    case "Homeowner": {
                        switch (data.get("State_OOS_END")) {
                            case "AR":
                            case "TX":
                            case "GA":
                            case "PA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "WV":
                            case "CA": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "AZ": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "CO":
                            case "IL":
                            case "IN":
                            case "ID": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            case "KS": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "MT":
                            case "IA":
                            case "NV": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "KY": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "MN": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_OOS_END"));
                                setHomeFortification(data.get("Roof_Characteristics_Home_Fortification_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "MO":
                            case "OH":
                            case "WY": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "ND": {
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "NE":
                            case "OK":
                            case "UT": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "NH": {
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "NM": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "OR": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "SD": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "TN": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setRoofCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "VT":
                            case "ME": {
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "WA": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                            case "WI": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
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
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State_OOS_END")) {
                            case "AR":
                            case "NH":
                            case "SD": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                            case "ME":
                            case "VT": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                            case "CA":
                            case "WV":
                            case "TN":
                            case "ND": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                            case "KY": {
                                setRoofShapeFont(data.get("Roof_Shape_OOS_END"));
                                setRoofCovering(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                            case "MI": {
                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                            }
                            break;
                            case "IN": {

                                setRoofShape(data.get("Roof_Shape_OOS_END"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_OOS_END"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Risk_Addresses_Residence_Type_OOS_END")) {
                    case "Homeowner": {
                        switch (data.get("State_OOS_END")) {
                            case "CA": {
                                setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                        switch (data.get("State_OOS_END")) {
                            case "CA": {
                                setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape_OOS_END"));
                                setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering_OOS_END"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
                            }
                            break;
                        }
                        break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillInRoofCharacteristics_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("roof characteristics");
        switch (data.get("Admitted_Line_RNW")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_RNW")) {
                    case "Homeowner": {
                        switch (data.get("State_RNW")) {
                            case "AR":
                            case "TX":
                            case "GA":
                            case "PA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "WV":
                            case "CA": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "AZ": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "CO":
                            case "IL":
                            case "IN":
                            case "ID": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            case "KS": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "MT":
                            case "IA":
                            case "NV": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "KY": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "MN": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_RNW"));
                                setHomeFortification(data.get("Roof_Characteristics_Home_Fortification_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "MO":
                            case "OH":
                            case "WY": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "ND": {
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "NE":
                            case "OK":
                            case "UT": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "NH": {
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "NM": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "OR": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "SD": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "TN": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setRoofCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "VT":
                            case "ME": {
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "WA": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                            case "WI": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
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
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State_RNW")) {
                            case "AR":
                            case "NH":
                            case "SD": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                            }
                            break;
                            case "ME":
                            case "VT": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Covering_RNW"));
                            }
                            break;
                            case "CA":
                            case "WV":
                            case "TN":
                            case "ND": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                            }
                            break;
                            case "KY": {
                                setRoofShapeFont(data.get("Roof_Shape_RNW"));
                                setRoofCovering(data.get("Roof_Covering_RNW"));
                            }
                            break;
                            case "MI": {
                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setRoofCoveringMaterial(data.get("Roof_Covering_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                            }
                            break;
                            case "IN": {

                                setRoofShape(data.get("Roof_Shape_RNW"));
                                setCoveringCredit(data.get("Roof_Covering_Credit_RNW"));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_RNW"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Risk_Addresses_Residence_Type_RNW")) {
                    case "Homeowner": {
                        switch (data.get("State_RNW")) {
                            case "CA": {
                                setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                        switch (data.get("State_RNW")) {
                            case "CA": {
                                setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape_RNW"));
                                setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering_RNW"));
                                setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
                            }
                            break;
                        }
                        break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillInRoofCharacteristics(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        switch (data.get("State_" + i)) {
                            case "AR":
                            case "TX":
                            case "GA":
                            case "PA":
                            case "MI": {
                                pause(3000);
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                            }
                            break;
                            case "WV": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "AZ": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                            }
                            break;
                            case "CO":
                            case "IL":
                            case "IN":
                            case "ID": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_" + i));
                            }
                            case "KS": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                            }
                            break;
                            case "MT":
                            case "IA": {
                                pause(3000);
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "KY": {
                                pause(3000);
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "MN": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "MO": {
                                pause(3000);
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterial(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "ND": {
                                pause(3000);
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                setRoofShape(data.get("Roof_Shape_" + i));
                            }
                            break;
                            case "NE": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterial(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "NH": {
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                            }
                            break;
                            case "NM": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "OH":
                            case "WY": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterial(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "NV": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "OK":
                            case "UT": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterial(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "OR": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "SD": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                typeText(roofCoveringFont.get(0), data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "TN":
                            case "CA": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "VT":
                            case "ME": {
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                                setRoofShape(data.get("Roof_Shape_" + i));
                            }
                            break;
                            case "WA": {
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                typeText(roofShapeFont.get(0), data.get("Roof_Covering_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                                typeText(roofCovering, data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "WI": {
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State_" + i)) {
                            case "AR":
                            case "NH":
                            case "SD": {
                                pause(3000);
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "ME":
                            case "VT": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "CA":
                            case "WV":
                            case "TN":
                            case "ND": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "KY": {
                                pause(3000);
                                setRoofShapeFont(data.get("Roof_Shape_" + i));
                                setRoofCovering(data.get("Roof_Covering_" + i));
                            }
                            break;
                            case "MI": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setRoofCoveringMaterial(data.get("Roof_Covering_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                            }
                            break;
                            case "IN": {
                                pause(3000);
                                setRoofShape(data.get("Roof_Shape_" + i));
                                setCoveringCredit(data.get("Roof_Covering_Credit_" + i));
                                setRoofCoveringMaterialFont(data.get("Roof_Covering_" + i));
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
                            case "CA": {
                                setRoofShapeFont(data.get("Roof_Shape_RS_" + i));
                                setRoofCoveringFont(data.get("Roof_Covering_RS_" + i));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants":
                        break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillInRoofCharacteristicsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("roof characteristics");
        setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape"));
        setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering"));
        setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced"));
        saveChanges();
    }

    public void fillInRoofCharacteristicsHS_END(Map<String, String> data) throws Throwable {
        setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape_END"));
        setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering_END"));
        setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_END"));
        saveChanges();
    }

    public void fillInRoofCharacteristicsHS_OOS_END(Map<String, String> data) throws Throwable {
        setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape_OOS_END"));
        setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering_OOS_END"));
        setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_OOS_END"));
        saveChanges();
    }

    public void fillInRoofCharacteristicsHS_RNW(Map<String, String> data) throws Throwable {
        setRoofShapeFont(data.get("Roof_Characteristics_Roof_Shape_RNW"));
        setRoofCoveringFont(data.get("Roof_Characteristics_Roof_Covering_RNW"));
        setYearRoofReplaced(data.get("Roof_Characteristics_Year_Roof_Replaced_RNW"));
        saveChanges();
    }

    public void verifyRoofAgeConfidence(String value) {
        assertCellValue(roofAgeConfidence, value, "Roof Age Confidence");
    }

    public void verifyThirdPartyRoofReplacementYear(String value) {
        assertCellValue(thirdPartyRoofReplacementYear, value, "3rd Party Roof Replacement Year");
    }

    public void setHomeFortification(String value) {
        typeTextEnter(homeFortification, value, "Home Fortification");
    }

    public void setRoofCoveringCredit(String value) {
        typeTextEnter(roofCoveringCredit, value, "Roof Covering Credit");
    }

    public void fillInRoofCharacteristicsFS(Map<String, String> data) {

    }

    public void setFortifiedDesignation(String value, String expDate) throws Throwable {
        typeTextEnter(fortifiedDesignation, value, "FORTIFIED Designation");
        clickFooter();
        if (!value.equalsIgnoreCase("None"))
            typeTextEnter(designationExpirationDate, expDate, "Designation Expiration Date");
    }


}



