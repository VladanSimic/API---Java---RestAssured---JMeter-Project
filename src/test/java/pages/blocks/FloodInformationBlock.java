package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class FloodInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public FloodInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'PURE NFIP Flood')]/../../../../div//label[text()='Yes']/..//input")
    WebElement pureNFIPYes;
    @FindBy(xpath = "//div[contains(text(),'PURE NFIP Flood')]/../../../../div//label[text()='No']/..//input")
    WebElement pureNFIPNo;
    @FindBy(xpath = "//div[contains(text(),'purchase an NFIP')]/../../../../div//label[text()='Yes']/..//input")
    WebElement purchaseNFIPYes;
    @FindBy(xpath = "//div[contains(text(),'purchase an NFIP')]/../../../../div//label[text()='No']/..//input")
    WebElement purchaseNFIPNo;
    @FindBy(xpath = "//div[text()='Manager Flood Zone Override']/../../../..//input | //div[text()='Manager Flood Zone override']/../../../..//input")
    WebElement managerFloodZoneOverride;
    @FindBy(xpath = "//div[text()='RiskMeter Flood Zone']/../../../..//input")
    WebElement riskMeterFloodZone;
    @FindBy(xpath = "//div[text()='Panel Number']/../../../..//input")
    WebElement panelNumber;
    @FindBy(xpath = "//div[text()='Panel Date']/../../../..//input")
    WebElement panelDate;
    @FindBy(xpath = "//div[contains(text(),'Is the home in CBRA Zone?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isHomeInCBRAZoneYes;
    @FindBy(xpath = "//div[contains(text(),'Is the home in CBRA Zone?')]/../../../../div//label[text()='No']/..//input")
    WebElement isHomeInCBRAZoneNo;
    @FindBy(xpath = "//div[text()='primary flood coverage']/../../../../../..//div[contains(text(),'Is the home in CBRA Zone?')]/../../../../../div//label[text()='Yes']/..//input")
    WebElement isHomeInCBRAZoneYesFlood;
    @FindBy(xpath = "//div[text()='primary flood coverage']/../../../../../..//div[contains(text(),'Is the home in CBRA Zone?')]/../../../../../div//label[text()='No']/..//input")
    WebElement isHomeInCBRAZoneNoFlood;
    @FindBy(xpath = "//div[contains(text(),'NFIP policy with maximum limits required?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement NFIPPolicyWithMaxLimitsRequiredYes;
    @FindBy(xpath = "//div[contains(text(),'NFIP policy with maximum limits required?')]/../../../../div//label[text()='No']/..//input")
    WebElement NFIPPolicyWithMaxLimitsRequiredNo;
    @FindBy(xpath = "//div[contains(text(),'Do you purchase an NFIP policy with maximum limits?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement doYouPurchaseNFIPPolicyYes;
    @FindBy(xpath = "//div[contains(text(),'Do you purchase an NFIP policy with maximum limits?')]/../../../../div//label[text()='No']/..//input")
    WebElement doYouPurchaseNFIPPolicyNo;
    @FindBy(xpath = "//div[text()='Flood Zone']/../../../..//input")
    WebElement floodZone;
    @FindBy(xpath = "//div[text()='Flood ID' and @style='display:inline']/../../../..//div[@role='textbox']")
    WebElement floodID;
    @FindBy(xpath = "//div[text()='Would you like a Non-Admitted Primary Flood quote?']/../../../../../../../../../../../..//label[text()='Yes']/..//input")
    List<WebElement> wouldYouLikeNonAdmittedPFQuoteYes;
    @FindBy(xpath = "//div[text()='Would you like a Non-Admitted Primary Flood quote?']/../../../../../../../../../../../..//label[text()='No']/..//input")
    List<WebElement> wouldYouLikeNonAdmittedPFQuoteNo;
    @FindBy(xpath = "(//div[text()='Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?']/../../../../div//label[text()='Yes']/..//input)[last()]")
    WebElement basementYes;
    @FindBy(xpath = "(//div[text()='Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?']/../../../../div//label[text()='No']/..//input)[last()]")
    WebElement basementNo;

    public void fillOutFloodInformationDetails(Map<String, String> data) throws Throwable {
        checkManagerFloodZoneOverride(data.get("Manager_Flood_Zone_Override"));

        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if (isFloodDate2(data.get("Effective_Date"))) {
                        //block is removed after 10/20/2025
                    } else {
                        verifyBlockExists("flood information");
                        setFloodZone(data.get("Flood_Information_Flood_Zone"));
                        setPureNFIP(data.get("Flood_Pure_NFIP"));
                        pause(2000);
                        setPurchaseNFIP(data.get("Flood_Pure_NFIP"), data.get("Purchase_NFIP"));
                        saveChanges();
                    }
                } else {
                    verifyBlockExists("flood information");
                    setFloodZone(data.get("Flood_Information_Flood_Zone"));
                    setPureNFIP(data.get("Flood_Pure_NFIP"));
                    pause(2000);
                    setPurchaseNFIP(data.get("Flood_Pure_NFIP"), data.get("Purchase_NFIP"));
                    saveChanges();
                }
            }
        } else {
            verifyBlockExists("flood information");
            setFloodZone(data.get("Flood_Information_Flood_Zone"));
            setPureNFIP(data.get("Flood_Pure_NFIP"));
            pause(2000);
            setPurchaseNFIP(data.get("Flood_Pure_NFIP"), data.get("Purchase_NFIP"));
            saveChanges();
        }
    }

    public void fillOutFloodInformationDetails_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("flood information");
        checkManagerFloodZoneOverride(data.get("Manager_Flood_Zone_Override_END"));
        setFloodZone(data.get("Flood_Information_Flood_Zone_END"));

        if (isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if (isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                        //block is removed after 10/20/2025
                    } else {
                        setFloodZone(data.get("Flood_Information_Flood_Zone_END"));
                        setPureNFIP(data.get("Flood_Pure_NFIP_END"));
                        pause(2000);
                        setPurchaseNFIP(data.get("Flood_Pure_NFIP_END"), data.get("Purchase_NFIP_END"));
                        saveChanges();
                    }
                } else {
                    setFloodZone(data.get("Flood_Information_Flood_Zone_END"));
                    setPureNFIP(data.get("Flood_Pure_NFIP_END"));
                    pause(2000);
                    setPurchaseNFIP(data.get("Flood_Pure_NFIP_END"), data.get("Purchase_NFIP_END"));
                    saveChanges();
                }
            }
        } else {
            setFloodZone(data.get("Flood_Information_Flood_Zone_END"));
            setPureNFIP(data.get("Flood_Pure_NFIP_END"));
            pause(2000);
            setPurchaseNFIP(data.get("Flood_Pure_NFIP_END"), data.get("Purchase_NFIP_END"));
            saveChanges();
        }
    }

    public void fillOutFloodInformationDetails_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("flood information");
        setFloodZone(data.get("Flood_Information_Flood_Zone_OOS_END"));

        if (isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if (isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                        //block is removed after 10/20/2025
                    } else {
                        setFloodZone(data.get("Flood_Information_Flood_Zone_OOS_END"));
                        setPureNFIP(data.get("Flood_Pure_NFIP_OOS_END"));
                        pause(2000);
                        setPurchaseNFIP(data.get("Flood_Pure_NFIP_OOS_END"), data.get("Purchase_NFIP_OOS_END"));
                        saveChanges();
                    }
                } else {
                    setFloodZone(data.get("Flood_Information_Flood_Zone_OOS_END"));
                    setPureNFIP(data.get("Flood_Pure_NFIP_OOS_END"));
                    pause(2000);
                    setPurchaseNFIP(data.get("Flood_Pure_NFIP_OOS_END"), data.get("Purchase_NFIP_OOS_END"));
                    saveChanges();
                }
            }
        } else {
            setFloodZone(data.get("Flood_Information_Flood_Zone_OOS_END"));
            setPureNFIP(data.get("Flood_Pure_NFIP_OOS_END"));
            pause(2000);
            setPurchaseNFIP(data.get("Flood_Pure_NFIP_OOS_END"), data.get("Purchase_NFIP_OOS_END"));
            saveChanges();
        }
    }

    public void fillOutFloodInformationDetails_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("flood information");
        setFloodZone(data.get("Flood_Information_Flood_Zone_RNW"));

        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if (isFloodDate2(data.get("Effective_Date"))) {
                        //block is removed after 10/20/2025
                    } else {
                        setFloodZone(data.get("Flood_Information_Flood_Zone_RNW"));
                        setPureNFIP(data.get("Flood_Pure_NFIP_RNW"));
                        pause(2000);
                        setPurchaseNFIP(data.get("Flood_Pure_NFIP_RNW"), data.get("Purchase_NFIP_RNW"));
                        saveChanges();
                    }
                } else {
                    setFloodZone(data.get("Flood_Information_Flood_Zone_RNW"));
                    setPureNFIP(data.get("Flood_Pure_NFIP_RNW"));
                    pause(2000);
                    setPurchaseNFIP(data.get("Flood_Pure_NFIP_RNW"), data.get("Purchase_NFIP_RNW"));
                    saveChanges();
                }
            }
        } else {
            setFloodZone(data.get("Flood_Information_Flood_Zone_RNW"));
            setPureNFIP(data.get("Flood_Pure_NFIP_RNW"));
            pause(2000);
            setPurchaseNFIP(data.get("Flood_Pure_NFIP_RNW"), data.get("Purchase_NFIP_RNW"));
            saveChanges();
        }
    }

    public void fillOutFloodInformationDetails(Map<String, String> data, int i) throws Throwable {
        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if (isFloodDate2(data.get("Effective_Date"))) {
                        //block is removed after 10/20/2025
                    } else {
                        setFloodZone(data.get("Flood_Information_Flood_Zone_" + i));
                        setPureNFIP(data.get("Flood_Pure_NFIP_" + i));
                        setPurchaseNFIP(data.get("Flood_Pure_NFIP_" + i), data.get("Purchase_NFIP_" + i));
                        saveChanges();
                        pause(5000);
                    }
                } else {
                    setFloodZone(data.get("Flood_Information_Flood_Zone_" + i));
                    setPureNFIP(data.get("Flood_Pure_NFIP_" + i));
                    setPurchaseNFIP(data.get("Flood_Pure_NFIP_" + i), data.get("Purchase_NFIP_" + i));
                    saveChanges();
                    pause(5000);
                }
            }
        } else {
            setFloodZone(data.get("Flood_Information_Flood_Zone_" + i));
            setPureNFIP(data.get("Flood_Pure_NFIP_" + i));
            setPurchaseNFIP(data.get("Flood_Pure_NFIP_" + i), data.get("Purchase_NFIP_" + i));
            saveChanges();
            pause(5000);
        }
    }

    public void fillFloodInformationDetailsCC(Map<String, String> data) throws Throwable {
        String floodZoneText;
        verifyBlockExists("flood information");
        if (floodZone.getAttribute("aria-readonly").equalsIgnoreCase("true")) {
            floodZoneText = getFloodZone();
        } else {
            floodZoneText = data.get("Flood_Information_Flood_Zone");
            setFloodZone(floodZoneText);
        }

        pause(3000);

        if (hasValue(floodZoneText)) {
            switch (floodZoneText) {
                case "AE/A1-A30/A Unnumbered":
                case "V1-V30/VE": {
                    setIsHomeInCBRAZone(data.get("Flood_Information_Is_The_Home_In_CBRA_Zone"), data.get("User_Role"));
                    setNFIPPolicyWithMaxLimitsRequired(data.get("Flood_Information_NFIP_Policy_With_Maximum_Limits_Required"), data.get("Flood_Information_Purchase_NFIP_Policy"));
                }
                break;
                case "AO/AH Certified":
                case "AO/AH Not Certified":
                case "A99/B/C/X":
                case "D":
                case "PRP - B/C/X": {
                    setNFIPPolicyWithMaxLimitsRequired(data.get("Flood_Information_NFIP_Policy_With_Maximum_Limits_Required"), data.get("Flood_Information_Purchase_NFIP_Policy"));
                }
                break;
                default: {
                    warningLog("No case for flood zone" + floodZone);
                }
                break;
            }
        }
        checkManagerFloodZoneOverride(data.get("Flood_Information_Manager_Flood_Zone_Override"), data.get("User_Role"));
        verifyRiskMeterFloodZone(data.get("Flood_Information_RiskMeter_Flood_Zone"));
        verifyPanelNumber(data.get("Flood_Information_Panel_Number"));
        verifyPanelDate(data.get("Flood_Information_Panel_Date"));
        saveChanges();
    }

    public void fillFloodInformationDetailsCC_END(Map<String, String> data) throws Throwable {
        String floodZone = getFloodZone();

        setFloodZone(floodZone);
        pause(3000);

        switch (floodZone) {
            case "AE/A1-A30/A Unnumbered":
            case "V1-V30/VE": {
                setIsHomeInCBRAZone(data.get("Flood_Information_Is_The_Home_In_CBRA_Zone_END"), data.get("User_Role"));
                setNFIPPolicyWithMaxLimitsRequired(data.get("Flood_Information_NFIP_Policy_With_Maximum_Limits_Required_END"), data.get("Flood_Information_Purchase_NFIP_Policy_END"));
            }
            break;
            case "AO/AH Certified":
            case "AO/AH Not Certified":
            case "A99/B/C/X":
            case "D":
            case "PRP - B/C/X": {
                setNFIPPolicyWithMaxLimitsRequired(data.get("Flood_Information_NFIP_Policy_With_Maximum_Limits_Required_END"), data.get("Flood_Information_Purchase_NFIP_Policy_END"));
            }
            break;
        }
        checkManagerFloodZoneOverride(data.get("Flood_Information_Manager_Flood_Zone_Override_END"));
        verifyRiskMeterFloodZone(data.get("Flood_Information_RiskMeter_Flood_Zone_END"));
        verifyPanelNumber(data.get("Flood_Information_Panel_Number_END"));
        verifyPanelDate(data.get("Flood_Information_Panel_Date_END"));
        saveChanges();
    }

    public void setFloodZone(String value) throws Throwable {
        pause(3000);
        typeTextEnter(floodZone, value, "Flood Zone");
        saveChanges();
        try {
            if (!floodZone.getAttribute("value").equalsIgnoreCase(value)) {
                pause(3000);
                typeTextEnter(floodZone, value, "Flood Zone");
                saveChanges();
            }
        } catch (Exception e) {

        }
    }

    public String getFloodZone() {
        return floodZone.getAttribute("value");
    }

    public void setIsHomeInCBRAZone(String value, String userRole) throws Throwable {
        try {
            choose(isHomeInCBRAZoneYes, isHomeInCBRAZoneNo, value, "Is Home In CBRA Zone");
        } catch (Exception e) {
            //TODO CC
        }
    }

    public void setIsHomeInCBRAZone(String value) throws Throwable {
        choose(isHomeInCBRAZoneYesFlood, isHomeInCBRAZoneNoFlood, value, "Is Home In CBRA Zone");
    }

    public void setNFIPPolicyWithMaxLimitsRequired(String limitRequired, String doYouPurchase) throws Throwable {
        choose(NFIPPolicyWithMaxLimitsRequiredYes, NFIPPolicyWithMaxLimitsRequiredNo, limitRequired, "NFIP Policy With Max Limits Required");
        pause(3000);
        if (hasValue(limitRequired) && limitRequired.equalsIgnoreCase("No")) {
            setDoYouPurchaseNFIPPolicy(doYouPurchase);
        }
    }

    public void setDoYouPurchaseNFIPPolicy(String value) throws Throwable {
        try {
            choose(doYouPurchaseNFIPPolicyYes, doYouPurchaseNFIPPolicyNo, value, "Do You Purchase NFIP Policy");
        } catch (Exception e) {
        }
    }

    public void setPureNFIP(String nfip) throws Throwable {
        try {
            clickFooter();
            choose(pureNFIPYes, pureNFIPNo, nfip, "Pure NFIP");
            clickFooter();
        } catch (Exception e) {
        }
    }

    public void setPurchaseNFIP(String nfip, String purchase) throws Throwable {
        if (hasValue(nfip) && nfip.equalsIgnoreCase("No")) {
            if (isVisibleOnly(By.xpath("//div[contains(text(),'purchase an NFIP')]/../../../../div//label[text()='Yes']/..//input")))
                choose(purchaseNFIPYes, purchaseNFIPNo, purchase, "Purchase NFIP");
        }
    }

    public void verifyPanelDate(String value) {
        assertCellValue(panelDate, value, "Panel Date");
    }

    public void verifyPanelNumber(String value) {
        assertCellValue(panelNumber, value, "Panel Number");
    }

    public void verifyRiskMeterFloodZone(String value) {
        assertCellValue(riskMeterFloodZone, value, "RiskMeter Flood Zone");
    }

    public void checkManagerFloodZoneOverride(String value) throws Throwable {
        checkCheckbox(managerFloodZoneOverride, value, "Manager Flood Zone Override");
        saveChanges();
    }

    public void checkManagerFloodZoneOverride(String value, String userRole) throws Throwable {
        if (hasValue(userRole)) {
            if (!userRole.equalsIgnoreCase("Analyst")) {
                checkCheckbox(managerFloodZoneOverride, value, "Manager Flood Zone Override");
            }
        } else {
            checkCheckbox(managerFloodZoneOverride, value, "Manager Flood Zone Override");
        }
    }

    public void fillFloodInformationDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("flood information");
        setPureNFIP(data.get("Flood_Flood_Pure_NFIP"));
        pause(2000);
        setPurchaseNFIP(data.get("Flood_Flood_Pure_NFIP"), data.get("Flood_Purchase_NFIP"));
        saveChanges();
        if (hasValue(data.get("Flood_Flood_Zone"))) {
            checkManagerFloodZoneOverride("Yes");
            pause(2000);
            setFloodZone(data.get("Flood_Flood_Zone"));
            pause(2000);
            if (!getFloodZone().equalsIgnoreCase(data.get("Flood_Flood_Zone"))) {
                setFloodZone(data.get("Flood_Flood_Zone"));
            }
        }
        pause(2000);
        setIsHomeInCBRAZoneHS();
        pause(5000);
        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1b(data.get("State"))) {
                setWouldYouLikeNonAdmittedPFQuote(data.get("Would_You_Like_Non_Admitted_PF_Quote"));
                pause(3000);
                setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level"));
            }
        }

        if (isFloodDate2(data.get("Effective_Date"))) {
            if ((data.get("State").equalsIgnoreCase("RI"))) {
                setWouldYouLikeNonAdmittedPFQuote(data.get("Would_You_Like_Non_Admitted_PF_Quote"));
                pause(3000);
                setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level"));
            }
        }
    }

    public void setIsBasementOrAreaDwellingBelowGroundLevel(String basement) throws Throwable {
        if (isElementDisplayed(basementNo)) {
            choose(basementYes, basementNo, basement, "Is basement or any area of dwelling below ground level");
        }
    }

    public void setIsHomeInCBRAZoneHS() throws Throwable {
        if (isVisibleOnly(By.xpath("//div[contains(text(),'Is the home in CBRA Zone?')]/../../../../div//label[text()='Yes']/..//input")))
            choose(isHomeInCBRAZoneYes, isHomeInCBRAZoneNo, "Yes");
    }

    public String getFloodID() {
        return floodID.getText();
    }

    public void verifyFloodID(String value) {
        if (value.equalsIgnoreCase("NotEmpty")) {
            if (getFloodID().equalsIgnoreCase(""))
                failAssertion("Flood ID is empty");
        }
    }

    public void verifyFloodZone(String value) {
        assertCellValue(floodZone, value, "Flood Zone");
    }

    public void verifyElevationCertificateNode(String value) {
        boolean isPresent = driver.findElements(By.xpath("//a[text()='Elevation Certificate']")).size() > 0;

        if (value.equalsIgnoreCase("Present")) {
            if (!isPresent)
                failAssertion("Elevation Certificate Node is not present");
        } else {
            if (isPresent)
                failAssertion("Elevation Certificate Node is present");
        }
    }

    public void verifyFloodInformationBasedOnFloodZone(String value) {
        switch (value) {
            case "AE/A1-A30/A Unnumbered":
            case "V1-V30/VE": {
                verifyFloodZone(value);
                verifyElevationCertificateNode("Present");
            }
            break;
            case "AO/AH Certified":
            case "AO/AH Not Certified":
            case "A99/B/C/X":
            case "D":
            case "PRP - B/C/X": {
                verifyFloodZone(value);
                verifyElevationCertificateNode("Not Present");
            }
            break;
        }
        reportScreenshot("FloodIntegration_" + System.currentTimeMillis(), "Flood Integration");
        verifyRiskMeterFloodZone("NotEmpty");
        verifyFloodID("NotEmpty");
        verifyPanelNumber("NotEmpty");
        verifyPanelDate("NotEmpty");
    }

    public void fillFloodInformationDetailsHS_END(Map<String, String> data) throws Throwable {
        setPureNFIP(data.get("Flood_Flood_Pure_NFIP_END"));
        setPurchaseNFIP(data.get("Flood_Flood_Pure_NFIP_END"), data.get("Flood_Purchase_NFIP_END"));
        saveChanges();
        pause(5000);
    }

    public void fillFloodInformationDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        setPureNFIP(data.get("Flood_Flood_Pure_NFIP_OOS_END"));
        setPurchaseNFIP(data.get("Flood_Flood_Pure_NFIP_OOS_END"), data.get("Flood_Purchase_NFIP_OOS_END"));
        saveChanges();
        pause(5000);
    }

    public void fillFloodInformationDetailsHS_RNW(Map<String, String> data) throws Throwable {
        setPureNFIP(data.get("Flood_Flood_Pure_NFIP_RNW"));
        setPurchaseNFIP(data.get("Flood_Flood_Pure_NFIP_RNW"), data.get("Flood_Purchase_NFIP_RNW"));
        saveChanges();
        pause(5000);
    }

    public void fillFloodInformationDetailsFS(Map<String, String> data) throws Throwable {
        setFloodZone(data.get("Flood_Zone"));
    }

    public void setWouldYouLikeNonAdmittedPFQuote(String quote) throws Throwable {
        if (!wouldYouLikeNonAdmittedPFQuoteYes.isEmpty() && wouldYouLikeNonAdmittedPFQuoteYes.get(0).isDisplayed()) {
            choose(wouldYouLikeNonAdmittedPFQuoteYes.get(0), wouldYouLikeNonAdmittedPFQuoteNo.get(0), quote, "Would you like a Non-Admitted Primary Flood quote?");
            pause(2000);
        }
    }

}