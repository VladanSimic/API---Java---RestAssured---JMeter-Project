package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class TerritoryFactorsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public TerritoryFactorsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Garaging Location Terr']/../../../..//input")
    WebElement garagingLocationTerr;
    @FindBy(xpath = "//div[text()='PD Terr Factor']/../../../..//input")
    WebElement PDTerrFactor;
    @FindBy(xpath = "//div[text()='BI Terr Factor']/../../../..//input")
    WebElement BITerrFactor;
    @FindBy(xpath = "//div[text()='COMP Terr Factor']/../../../..//input")
    WebElement COMPTerrFactor;
    @FindBy(xpath = "//div[text()='COLL Terr Factor']/../../../..//input")
    WebElement COLLTerrFactor;
    @FindBy(xpath = "//div[text()='MED Terr Factor']/../../../..//input")
    WebElement MEDTerrFactor;
    @FindBy(xpath = "//div[text()='UIM']/../../../..//input")
    WebElement UIM;
    @FindBy(xpath = "//div[text()='UM Terr Factor']/../../../..//input")
    WebElement UMTerrFactor;
    @FindBy(xpath = "//div[text()='MP']/../../../..//input")
    WebElement MP;
    @FindBy(xpath = "//div[text()='UMBI/UIMBI']/../../../..//input")
    WebElement UMBIUIMBI;
    @FindBy(xpath = "//div[text()='UMPD']/../../../..//input")
    WebElement UMPD;
    @FindBy(xpath = "//div[text()='UMBI']/../../../..//input")
    WebElement UMBI;
    @FindBy(xpath = "//div[text()='PIP']/../../../..//input")
    WebElement PIP;
    @FindBy(xpath = "//div[text()='UIMBI']/../../../..//input")
    WebElement UIMBI;
    @FindBy(xpath = "//div[text()='UM BI Terr Factor']/../../../..//input")
    WebElement UMBITerrFactor;
    @FindBy(xpath = "//div[text()='UM PD Terr Factor']/../../../..//input")
    WebElement UMPDTerrFactor;
    @FindBy(xpath = "//div[text()='UM UIM Terr Factor']/../../../..//input")
    WebElement UMUIMTerrFactor;
    @FindBy(xpath = "//div[text()='MP Terr Factor']/../../../..//input")
    WebElement MPTerrFactor;
    @FindBy(xpath = "//div[text()='UIMBI Terr Factor']/../../../..//input")
    WebElement UIMBITerrFactor;
    @FindBy(xpath = "//div[text()='UMBI UIM']/../../../..//input")
    WebElement UMBIUIM;
    @FindBy(xpath = "//div[text()='Basic FPB']/../../../..//input")
    WebElement BasicFPB;
    @FindBy(xpath = "//div[text()='Added FPB MP']/../../../..//input")
    WebElement AddedFPBMP;
    @FindBy(xpath = "//div[text()='Non Stacked UMBI']/../../../..//input")
    WebElement NonStackedUMBI;
    @FindBy(xpath = "//div[text()='Non Stacked UIMBI']/../../../..//input")
    WebElement NonStackedUIMBI;
    @FindBy(xpath = "//div[text()='Stacked UIMBI']/../../../..//input")
    WebElement StackedUIMBI;
    @FindBy(xpath = "//div[text()='Stacked UMBI']/../../../..//input")
    WebElement StackedUMBI;
    @FindBy(xpath = "//div[text()='UIMPD']/../../../..//input")
    WebElement UIMPD;
    @FindBy(xpath = "//div[text()='Tow']/../../../..//input")
    WebElement Tow;
    @FindBy(xpath = "//div[text()='Rental']/../../../..//input")
    WebElement Rental;
    @FindBy(xpath = "//div[text()='UIM BI']/../../../..//input")
    WebElement UIM_BI;
    @FindBy(xpath = "//div[text()='Garaging Zipcode']/../../../..//input")
    WebElement GaragingZipcode;
    @FindBy(xpath = "//div[text()='COMP Factor']/../../../..//input")
    WebElement COMPFactor;
    @FindBy(xpath = "//div[text()='BI Factor']/../../../..//input")
    WebElement BIFactor;
    @FindBy(xpath = "//div[text()='COLL Factor']/../../../..//input")
    WebElement COLLFactor;
    @FindBy(xpath = "//div[text()='PD Factor']/../../../..//input")
    WebElement PDFactor;
    @FindBy(xpath = "//div[text()='UMBI Factor']/../../../..//input")
    WebElement UMBIFactor;
    @FindBy(xpath = "//div[text()='MP Factor']/../../../..//input")
    WebElement MPFactor;
    @FindBy(xpath = "//div[text()='UMPD Factor']/../../../..//input")
    WebElement UMPDFactor;
    @FindBy(xpath = "//div[text()='Comp Endorsement Fctr']/../../../..//input")
    WebElement CompEndorsementFctr;
    @FindBy(xpath = "//div[text()='Col Endorsement Fctr']/../../../..//input")
    WebElement ColEndorsementFctr;
    @FindBy(xpath = "//div[text()='UMBI/UIMBI Terr Factor']/../../../..//input")
    WebElement UMBIUIMBITerrFactor;
    @FindBy(xpath = "//div[text()='UM/UIM Terr Factor']/../../../..//input")
    WebElement UM_UIMTerrFactor;
    @FindBy(xpath = "//div[text()='APIP']/../../../..//input")
    WebElement APIP;
    @FindBy(xpath = "//div[text()='BI']/../../../..//input")
    WebElement BI;
    @FindBy(xpath = "//div[text()='MEDPAY']/../../../..//input")
    WebElement MEDPAY;
    @FindBy(xpath = "//div[text()='LIMCOLL']/../../../..//input")
    WebElement LIMCOLL;
    @FindBy(xpath = "//div[text()='COLL']/../../../..//input")
    WebElement COLL;
    @FindBy(xpath = "//div[text()='COMP']/../../../..//input")
    WebElement COMP;
    @FindBy(xpath = "//div[text()='PD']/../../../..//input")
    WebElement PD;
    @FindBy(xpath = "//div[text()='UM']/../../../..//input")
    WebElement UM;
    @FindBy(xpath = "//div[text()='OBEL']/../../../..//input")
    WebElement OBEL;
    @FindBy(xpath = "//div[text()='PIP Terr Factor']/../../../..//input")
    WebElement PIPTerrFactor;
    @FindBy(xpath = "//div[text()='ME']/../../../..//input")
    WebElement ME;
    @FindBy(xpath = "//div[text()='PPI']/../../../..//input")
    WebElement PPI;

    public void fillTerritoryFactorsDetailsPA(Map<String, String> data, int i) {
        if (!data.get("State").equalsIgnoreCase("CA")) {
            verifyGaragingLocationTerr(data.get("Territory_Factors_Garaging_Location_Terr_" + i));
        } else {
            verifyGaragingZipcode(data.get("Territory_Factors_Garaging_Zipcode_" + i));
        }

        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("VA")) {
            verifyPDTerrFactor(data.get("Territory_Factors_PD_Terr_Factor_" + i));
        }

        if (!data.get("State").equalsIgnoreCase("CA") && !data.get("State").equalsIgnoreCase("MA")) {
            verifyCOMPTerrFactor(data.get("Territory_Factors_COMP_Terr_Factor_" + i));
            verifyCOLLTerrFactor(data.get("Territory_Factors_COLL_Terr_Factor_" + i));
        } else {
            verifyCOMPFactor(data.get("Territory_Factors_COMP_Factor_" + i));
            verifyCOLLFactor(data.get("Territory_Factors_COLL_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("NV") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("LA") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("NS")) {
            verifyBITerrFactor(data.get("Territory_Factors_BI_Terr_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("NV") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyMEDTerrFactor(data.get("Territory_Factors_MED_Terr_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyUIM(data.get("Territory_Factors_UIM_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyUMTerrFactor(data.get("Territory_Factors_UM_Terr_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("OH") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("MS") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("CA") ||
                data.get("State").equalsIgnoreCase("AR")) {
            verifyMP(data.get("Territory_Factors_MP_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("OH") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("LA") ||
                data.get("State").equalsIgnoreCase("AR")) {
            verifyUMBIUIMBI(data.get("Territory_Factors_UMBI_UIMBI_" + i));
        }

        if (data.get("State").equalsIgnoreCase("AR") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("CA") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MS")) {
            verifyUMPD(data.get("Territory_Factors_UMPD_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MS")) {
            verifyUMBI(data.get("Territory_Factors_UMBI_" + i));
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("DC")) {
            verifyPIP(data.get("Territory_Factors_PIP_" + i));
        }

        if (data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("UT")) {
            verifyUIMBI(data.get("Territory_Factors_UIMBI_" + i));
        }

        if (data.get("State").equalsIgnoreCase("AK")) {
            verifyUMPDTerrFactor(data.get("Territory_Factors_UM_PD_Terr_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MO")) {
            verifyUMUIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI")) {
            verifyUMBITerrFactor(data.get("Territory_Factors_UMBI_Terr_Factor_" + i));
            verifyUIMBITerrFactor(data.get("Territory_Factors_UIMBI_Terr_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NV")) {
            verifyUMBIUIM(data.get("Territory_Factors_UMBI_UIM_" + i));
        }

        if (data.get("State").equalsIgnoreCase("PA")) {
            verifyBasicFPB(data.get("Territory_Factors_Basic_FPB_" + i));
            verifyAddedFPBMP(data.get("Territory_Factors_Added_FPB_MP_" + i));
            verifyNonStackedUMBI(data.get("Territory_Factors_Non_Stacked_UMBI_" + i));
            verifyNonStackedUIMBI(data.get("Territory_Factors_Non_Stacked_UIMBI_" + i));
            verifyStackedUMBI(data.get("Territory_Factors_Stacked_UMBI_" + i));
            verifyStackedUIMBI(data.get("Territory_Factors_Stacked_UIMBI_" + i));
        }

        if (data.get("State").equalsIgnoreCase("WA")) {
            verifyUIMPD(data.get("Territory_Factors_UIMPD_" + i));
            verifyTow(data.get("Territory_Factors_Tow_" + i));
            verifyRental(data.get("Territory_Factors_Rental_" + i));
        }

        if (data.get("State").equalsIgnoreCase("WV")) {
            verifyUIM_BI(data.get("Territory_Factors_UIM_BI_" + i));
            verifyUIMPD(data.get("Territory_Factors_UIMPD_" + i));
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            verifyBIFactor(data.get("Territory_Factors_BI_Factor_" + i));
            verifyPDFactor(data.get("Territory_Factors_PD_Factor_" + i));
            verifyUMBIFactor(data.get("Territory_Factors_UMBI_Factor_" + i));
            verifyUMPDFactor(data.get("Territory_Factors_UMPD_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("CT")) {
            verifyCompEndorsementFctr(data.get("Territory_Factors_Comp_Endorsement_Fctr_" + i));
            verifyColEndorsementFctr(data.get("Territory_Factors_Col_Endorsement_Fctr_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NC")) {
            verifyUM_UIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NJ")) {
            verifyAPIP(data.get("Territory_Factors_APIP_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            verifyPD(data.get("Territory_Factors_PD_" + i));
            verifyBI(data.get("Territory_Factors_BI_" + i));
            verifyMEDPAY(data.get("Territory_Factors_MED_PAY_" + i));
            verifyLIMCOLL(data.get("Territory_Factors_LIM_COLL_" + i));
        }

        if (data.get("State").equalsIgnoreCase("ME")) {
            verifyUM(data.get("Territory_Factors_UM_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NY")) {
            verifyAPIP(data.get("Territory_Factors_APIP_" + i));
            verifyOBEL(data.get("Territory_Factors_OBEL_" + i));
            verifyPIPTerrFactor(data.get("Territory_Factors_PIP_Terr_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("VA")) {
            verifyPDFactor(data.get("Territory_Factors_PD_Terr_Factor_" + i));
            verifyME(data.get("Territory_Factors_ME_" + i));
        }

        if (data.get("State").equalsIgnoreCase("FL")) {
            verifyPIPTerrFactor(data.get("Territory_Factors_PIP_Terr_Factor_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MI")) {
            verifyPPI(data.get("Territory_Factors_PPI_" + i));
            verifyUM_UIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_" + i));
        }

    }

    public void fillTerritoryFactorsDetailsPA_END(Map<String, String> data, int i) {
        if (!data.get("State").equalsIgnoreCase("CA")) {
            verifyGaragingLocationTerr(data.get("Territory_Factors_Garaging_Location_Terr_END_" + i));
        } else {
            verifyGaragingZipcode(data.get("Territory_Factors_Garaging_Zipcode_END_" + i));
        }

        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("VA")) {
            verifyPDTerrFactor(data.get("Territory_Factors_PD_Terr_Factor_END_" + i));
        }

        if (!data.get("State").equalsIgnoreCase("CA") && !data.get("State").equalsIgnoreCase("MA")) {
            verifyCOMPTerrFactor(data.get("Territory_Factors_COMP_Terr_Factor_END_" + i));
            verifyCOLLTerrFactor(data.get("Territory_Factors_COLL_Terr_Factor_END_" + i));
        } else {
            verifyCOMPFactor(data.get("Territory_Factors_COMP_Factor_END_" + i));
            verifyCOLLFactor(data.get("Territory_Factors_COLL_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("NV") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("LA") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("NS")) {
            verifyBITerrFactor(data.get("Territory_Factors_BI_Terr_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("NV") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyMEDTerrFactor(data.get("Territory_Factors_MED_Terr_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyUIM(data.get("Territory_Factors_UIM_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyUMTerrFactor(data.get("Territory_Factors_UM_Terr_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("OH") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("MS") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("CA") ||
                data.get("State").equalsIgnoreCase("AR")) {
            verifyMP(data.get("Territory_Factors_MP_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("OH") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("LA") ||
                data.get("State").equalsIgnoreCase("AR")) {
            verifyUMBIUIMBI(data.get("Territory_Factors_UMBI_UIMBI_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("AR") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("CA") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MS")) {
            verifyUMPD(data.get("Territory_Factors_UMPD_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MS")) {
            verifyUMBI(data.get("Territory_Factors_UMBI_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("DC")) {
            verifyPIP(data.get("Territory_Factors_PIP_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("UT")) {
            verifyUIMBI(data.get("Territory_Factors_UIMBI_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("AK")) {
            verifyUMPDTerrFactor(data.get("Territory_Factors_UM_PD_Terr_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MO")) {
            verifyUMUIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI")) {
            verifyUMBITerrFactor(data.get("Territory_Factors_UMBI_Terr_Factor_END_" + i));
            verifyUIMBITerrFactor(data.get("Territory_Factors_UIMBI_Terr_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NV")) {
            verifyUMBIUIM(data.get("Territory_Factors_UMBI_UIM_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("PA")) {
            verifyBasicFPB(data.get("Territory_Factors_Basic_FPB_END_" + i));
            verifyAddedFPBMP(data.get("Territory_Factors_Added_FPB_MP_END_" + i));
            verifyNonStackedUMBI(data.get("Territory_Factors_Non_Stacked_UMBI_END_" + i));
            verifyNonStackedUIMBI(data.get("Territory_Factors_Non_Stacked_UIMBI_END_" + i));
            verifyStackedUMBI(data.get("Territory_Factors_Stacked_UMBI_END_" + i));
            verifyStackedUIMBI(data.get("Territory_Factors_Stacked_UIMBI_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("WA")) {
            verifyUIMPD(data.get("Territory_Factors_UIMPD_END_" + i));
            verifyTow(data.get("Territory_Factors_Tow_END_" + i));
            verifyRental(data.get("Territory_Factors_Rental_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("WV")) {
            verifyUIM_BI(data.get("Territory_Factors_UIM_BI_END_" + i));
            verifyUIMPD(data.get("Territory_Factors_UIMPD_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            verifyBIFactor(data.get("Territory_Factors_BI_Factor_END_" + i));
            verifyPDFactor(data.get("Territory_Factors_PD_Factor_END_" + i));
            verifyUMBIFactor(data.get("Territory_Factors_UMBI_Factor_END_" + i));
            verifyUMPDFactor(data.get("Territory_Factors_UMPD_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("CT")) {
            verifyCompEndorsementFctr(data.get("Territory_Factors_Comp_Endorsement_Fctr_END_" + i));
            verifyColEndorsementFctr(data.get("Territory_Factors_Col_Endorsement_Fctr_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NC")) {
            verifyUM_UIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NJ")) {
            verifyAPIP(data.get("Territory_Factors_APIP_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            verifyPD(data.get("Territory_Factors_PD_END_" + i));
            verifyBI(data.get("Territory_Factors_BI_END_" + i));
            verifyMEDPAY(data.get("Territory_Factors_MED_PAY_END_" + i));
            verifyLIMCOLL(data.get("Territory_Factors_LIM_COLL_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("ME")) {
            verifyUM(data.get("Territory_Factors_UM_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NY")) {
            verifyAPIP(data.get("Territory_Factors_APIP_END_" + i));
            verifyOBEL(data.get("Territory_Factors_OBEL_END_" + i));
            verifyPIPTerrFactor(data.get("Territory_Factors_PIP_Terr_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("VA")) {
            verifyPDFactor(data.get("Territory_Factors_PD_Terr_Factor_END_" + i));
            verifyME(data.get("Territory_Factors_ME_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("FL")) {
            verifyPIPTerrFactor(data.get("Territory_Factors_PIP_Terr_Factor_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MI")) {
            verifyPPI(data.get("Territory_Factors_PPI_END_" + i));
            verifyUM_UIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_END_" + i));
        }

    }

    public void fillTerritoryFactorsDetailsPA_OOS_END(Map<String, String> data, int i) {
        if (!data.get("State").equalsIgnoreCase("CA")) {
            verifyGaragingLocationTerr(data.get("Territory_Factors_Garaging_Location_Terr_OOS_END" + i));
        } else {
            verifyGaragingZipcode(data.get("Territory_Factors_Garaging_Zipcode_OOS_END_" + i));
        }

        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("VA")) {
            verifyPDTerrFactor(data.get("Territory_Factors_PD_Terr_Factor_OOS_END_" + i));
        }

        if (!data.get("State").equalsIgnoreCase("CA") && !data.get("State").equalsIgnoreCase("MA")) {
            verifyCOMPTerrFactor(data.get("Territory_Factors_COMP_Terr_Factor_OOS_END_" + i));
            verifyCOLLTerrFactor(data.get("Territory_Factors_COLL_Terr_Factor_OOS_END_" + i));
        } else {
            verifyCOMPFactor(data.get("Territory_Factors_COMP_Factor_OOS_END_" + i));
            verifyCOLLFactor(data.get("Territory_Factors_COLL_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("NV") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("LA") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("NS")) {
            verifyBITerrFactor(data.get("Territory_Factors_BI_Terr_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("NV") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyMEDTerrFactor(data.get("Territory_Factors_MED_Terr_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyUIM(data.get("Territory_Factors_UIM_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyUMTerrFactor(data.get("Territory_Factors_UM_Terr_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("OH") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("MS") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("CA") ||
                data.get("State").equalsIgnoreCase("AR")) {
            verifyMP(data.get("Territory_Factors_MP_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("OH") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("LA") ||
                data.get("State").equalsIgnoreCase("AR")) {
            verifyUMBIUIMBI(data.get("Territory_Factors_UMBI_UIMBI_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("AR") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("CA") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MS")) {
            verifyUMPD(data.get("Territory_Factors_UMPD_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MS")) {
            verifyUMBI(data.get("Territory_Factors_UMBI_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("DC")) {
            verifyPIP(data.get("Territory_Factors_PIP_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("UT")) {
            verifyUIMBI(data.get("Territory_Factors_UIMBI_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("AK")) {
            verifyUMPDTerrFactor(data.get("Territory_Factors_UM_PD_Terr_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MO")) {
            verifyUMUIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI")) {
            verifyUMBITerrFactor(data.get("Territory_Factors_UMBI_Terr_Factor_OOS_END_" + i));
            verifyUIMBITerrFactor(data.get("Territory_Factors_UIMBI_Terr_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NV")) {
            verifyUMBIUIM(data.get("Territory_Factors_UMBI_UIM_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("PA")) {
            verifyBasicFPB(data.get("Territory_Factors_Basic_FPB_OOS_END_" + i));
            verifyAddedFPBMP(data.get("Territory_Factors_Added_FPB_MP_OOS_END_" + i));
            verifyNonStackedUMBI(data.get("Territory_Factors_Non_Stacked_UMBI_OOS_END_" + i));
            verifyNonStackedUIMBI(data.get("Territory_Factors_Non_Stacked_UIMBI_OOS_END_" + i));
            verifyStackedUMBI(data.get("Territory_Factors_Stacked_UMBI_OOS_END_" + i));
            verifyStackedUIMBI(data.get("Territory_Factors_Stacked_UIMBI_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("WA")) {
            verifyUIMPD(data.get("Territory_Factors_UIMPD_OOS_END_" + i));
            verifyTow(data.get("Territory_Factors_Tow_OOS_END_" + i));
            verifyRental(data.get("Territory_Factors_Rental_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("WV")) {
            verifyUIM_BI(data.get("Territory_Factors_UIM_BI_OOS_END_" + i));
            verifyUIMPD(data.get("Territory_Factors_UIMPD_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            verifyBIFactor(data.get("Territory_Factors_BI_Factor_OOS_END_" + i));
            verifyPDFactor(data.get("Territory_Factors_PD_Factor_OOS_END_" + i));
            verifyUMBIFactor(data.get("Territory_Factors_UMBI_Factor_OOS_END_" + i));
            verifyUMPDFactor(data.get("Territory_Factors_UMPD_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("CT")) {
            verifyCompEndorsementFctr(data.get("Territory_Factors_Comp_Endorsement_Fctr_OOS_END_" + i));
            verifyColEndorsementFctr(data.get("Territory_Factors_Col_Endorsement_Fctr_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NC")) {
            verifyUM_UIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NJ")) {
            verifyAPIP(data.get("Territory_Factors_APIP_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            verifyPD(data.get("Territory_Factors_PD_OOS_END_" + i));
            verifyBI(data.get("Territory_Factors_BI_OOS_END_" + i));
            verifyMEDPAY(data.get("Territory_Factors_MED_PAY_OOS_END_" + i));
            verifyLIMCOLL(data.get("Territory_Factors_LIM_COLL_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("ME")) {
            verifyUM(data.get("Territory_Factors_UM_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NY")) {
            verifyAPIP(data.get("Territory_Factors_APIP_OOS_END_" + i));
            verifyOBEL(data.get("Territory_Factors_OBEL_OOS_END_" + i));
            verifyPIPTerrFactor(data.get("Territory_Factors_PIP_Terr_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("VA")) {
            verifyPDFactor(data.get("Territory_Factors_PD_Terr_Factor_OOS_END_" + i));
            verifyME(data.get("Territory_Factors_ME_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("FL")) {
            verifyPIPTerrFactor(data.get("Territory_Factors_PIP_Terr_Factor_OOS_END_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MI")) {
            verifyPPI(data.get("Territory_Factors_PPI_" + i));
            verifyUM_UIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_OOS_END_" + i));
        }

    }

    public void fillTerritoryFactorsDetailsPA_RNW(Map<String, String> data, int i) {
        if (!data.get("State").equalsIgnoreCase("CA")) {
            verifyGaragingLocationTerr(data.get("Territory_Factors_Garaging_Location_Terr_RNW_" + i));
        } else {
            verifyGaragingZipcode(data.get("Territory_Factors_Garaging_Zipcode_RNW_" + i));
        }

        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("VA")) {
            verifyPDTerrFactor(data.get("Territory_Factors_PD_Terr_Factor_RNW_" + i));
        }

        if (!data.get("State").equalsIgnoreCase("CA") && !data.get("State").equalsIgnoreCase("MA")) {
            verifyCOMPTerrFactor(data.get("Territory_Factors_COMP_Terr_Factor_RNW_" + i));
            verifyCOLLTerrFactor(data.get("Territory_Factors_COLL_Terr_Factor_RNW_" + i));
        } else {
            verifyCOMPFactor(data.get("Territory_Factors_COMP_Factor_RNW_" + i));
            verifyCOLLFactor(data.get("Territory_Factors_COLL_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("NV") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("LA") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("NS")) {
            verifyBITerrFactor(data.get("Territory_Factors_BI_Terr_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("NV") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyMEDTerrFactor(data.get("Territory_Factors_MED_Terr_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyUIM(data.get("Territory_Factors_UIM_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IA") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("WY") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("ID") ||
                data.get("State").equalsIgnoreCase("AZ")) {
            verifyUMTerrFactor(data.get("Territory_Factors_UM_Terr_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("OH") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("MS") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("CA") ||
                data.get("State").equalsIgnoreCase("AR")) {
            verifyMP(data.get("Territory_Factors_MP_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("OH") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("LA") ||
                data.get("State").equalsIgnoreCase("AR")) {
            verifyUMBIUIMBI(data.get("Territory_Factors_UMBI_UIMBI_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("AR") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("CA") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MS")) {
            verifyUMPD(data.get("Territory_Factors_UMPD_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("NM") ||
                data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("NE") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WV") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MS")) {
            verifyUMBI(data.get("Territory_Factors_UMBI_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("OR") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("MN") ||
                data.get("State").equalsIgnoreCase("UT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("DC")) {
            verifyPIP(data.get("Territory_Factors_PIP_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("UT")) {
            verifyUIMBI(data.get("Territory_Factors_UIMBI_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("AK")) {
            verifyUMPDTerrFactor(data.get("Territory_Factors_UM_PD_Terr_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MO")) {
            verifyUMUIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("WI")) {
            verifyUMBITerrFactor(data.get("Territory_Factors_UMBI_Terr_Factor_RNW_" + i));
            verifyUIMBITerrFactor(data.get("Territory_Factors_UIMBI_Terr_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NV")) {
            verifyUMBIUIM(data.get("Territory_Factors_UMBI_UIM_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("PA")) {
            verifyBasicFPB(data.get("Territory_Factors_Basic_FPB_RNW_" + i));
            verifyAddedFPBMP(data.get("Territory_Factors_Added_FPB_MP_RNW_" + i));
            verifyNonStackedUMBI(data.get("Territory_Factors_Non_Stacked_UMBI_RNW_" + i));
            verifyNonStackedUIMBI(data.get("Territory_Factors_Non_Stacked_UIMBI_RNW_" + i));
            verifyStackedUMBI(data.get("Territory_Factors_Stacked_UMBI_RNW_" + i));
            verifyStackedUIMBI(data.get("Territory_Factors_Stacked_UIMBI_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("WA")) {
            verifyUIMPD(data.get("Territory_Factors_UIMPD_RNW_" + i));
            verifyTow(data.get("Territory_Factors_Tow_RNW_" + i));
            verifyRental(data.get("Territory_Factors_Rental_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("WV")) {
            verifyUIM_BI(data.get("Territory_Factors_UIM_BI_RNW_" + i));
            verifyUIMPD(data.get("Territory_Factors_UIMPD_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            verifyBIFactor(data.get("Territory_Factors_BI_Factor_RNW_" + i));
            verifyPDFactor(data.get("Territory_Factors_PD_Factor_RNW_" + i));
            verifyUMBIFactor(data.get("Territory_Factors_UMBI_Factor_RNW_" + i));
            verifyUMPDFactor(data.get("Territory_Factors_UMPD_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("CT")) {
            verifyCompEndorsementFctr(data.get("Territory_Factors_Comp_Endorsement_Fctr_RNW_" + i));
            verifyColEndorsementFctr(data.get("Territory_Factors_Col_Endorsement_Fctr_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NC")) {
            verifyUM_UIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NJ")) {
            verifyAPIP(data.get("Territory_Factors_APIP_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            verifyPD(data.get("Territory_Factors_PD_RNW_" + i));
            verifyBI(data.get("Territory_Factors_BI_RNW_" + i));
            verifyMEDPAY(data.get("Territory_Factors_MED_PAY_RNW_" + i));
            verifyLIMCOLL(data.get("Territory_Factors_LIM_COLL_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("ME")) {
            verifyUM(data.get("Territory_Factors_UM_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("NY")) {
            verifyAPIP(data.get("Territory_Factors_APIP_RNW_" + i));
            verifyOBEL(data.get("Territory_Factors_OBEL_RNW_" + i));
            verifyPIPTerrFactor(data.get("Territory_Factors_PIP_Terr_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("VA")) {
            verifyPDFactor(data.get("Territory_Factors_PD_Terr_Factor_RNW_" + i));
            verifyME(data.get("Territory_Factors_ME_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("FL")) {
            verifyPIPTerrFactor(data.get("Territory_Factors_PIP_Terr_Factor_RNW_" + i));
        }

        if (data.get("State").equalsIgnoreCase("MI")) {
            verifyPPI(data.get("Territory_Factors_PPI_RNW_" + i));
            verifyUM_UIMTerrFactor(data.get("Territory_Factors_UM_UIM_Terr_Factor_RNW_" + i));
        }
    }

    public void verifyPPI(String value) {
        assertCellValue(PPI, value, "PPI");
    }

    public void verifyME(String value) {
        assertCellValue(ME, value, "ME");
    }

    public void verifyPIPTerrFactor(String value) {
        assertCellValue(PIPTerrFactor, value, "PIP Terr Factor");
    }

    public void verifyOBEL(String value) {
        assertCellValue(OBEL, value, "OBEL");
    }

    public void verifyUM(String value) {
        assertCellValue(UM, value, "UM");
    }

    public void verifyPD(String value) {
        assertCellValue(PD, value, "PD");
    }

    public void verifyCOMP(String value) {
        assertCellValue(COMP, value, "COMP");
    }

    public void verifyCOLL(String value) {
        assertCellValue(COLL, value, "COLL");
    }

    public void verifyBI(String value) {
        assertCellValue(BI, value, "BI");
    }

    public void verifyMEDPAY(String value) {
        assertCellValue(MEDPAY, value, "MEDPAY");
    }

    public void verifyLIMCOLL(String value) {
        assertCellValue(LIMCOLL, value, "LIMCOLL");
    }

    public void verifyAPIP(String value) {
        assertCellValue(APIP, value, "APIP");
    }

    public void verifyUM_UIMTerrFactor(String value) {
        assertCellValue(UM_UIMTerrFactor, value, "UM UIM Terr Factor");
    }

    public void verifyUMBIUIMBITerrFactor(String value) {
        assertCellValue(UMBIUIMBITerrFactor, value, "UMBI UIMBI Terr Factor");
    }

    public void verifyCompEndorsementFctr(String value) {
        assertCellValue(CompEndorsementFctr, value, "Comp Endorsement Fctr");
    }

    public void verifyColEndorsementFctr(String value) {
        assertCellValue(ColEndorsementFctr, value, "Col Endorsement Fctr");
    }

    public void verifyGaragingZipcode(String value) {
        assertCellValue(GaragingZipcode, value, "Garaging Zipcode");
    }

    public void verifyBIFactor(String value) {
        assertCellValue(BIFactor, value, "BI Factor");
    }

    public void verifyPDFactor(String value) {
        assertCellValue(PDFactor, value, "PD Factor");
    }

    public void verifyMPFactor(String value) {
        assertCellValue(MPFactor, value, "MP Factor");
    }

    public void verifyCOMPFactor(String value) {
        assertCellValue(COMPFactor, value, "COMP Factor");
    }

    public void verifyCOLLFactor(String value) {
        assertCellValue(COLLFactor, value, "COLL Factor");
    }

    public void verifyUMBIFactor(String value) {
        assertCellValue(UMBIFactor, value, "UMBI Factor");
    }

    public void verifyUMPDFactor(String value) {
        assertCellValue(UMPDFactor, value, "UMPD Factor");
    }

    public void verifyUIMPD(String value) {
        assertCellValue(UIMPD, value, "UIMPD");
    }

    public void verifyTow(String value) {
        assertCellValue(Tow, value, "Tow");
    }

    public void verifyRental(String value) {
        assertCellValue(Rental, value, "Rental");
    }

    public void verifyBasicFPB(String value) {
        assertCellValue(BasicFPB, value, "Basic FPB");
    }

    public void verifyAddedFPBMP(String value) {
        assertCellValue(AddedFPBMP, value, "Added FPBMP");
    }

    public void verifyNonStackedUMBI(String value) {
        assertCellValue(NonStackedUMBI, value, "Non Stacked UMBI");
    }

    public void verifyUIM_BI(String value) {
        assertCellValue(UIM_BI, value, "Non Stacked UIM_BI");
    }

    public void verifyNonStackedUIMBI(String value) {
        assertCellValue(NonStackedUIMBI, value, "Non Stacked UIMBI");
    }

    public void verifyStackedUMBI(String value) {
        assertCellValue(StackedUMBI, value, "Stacked UMBI");
    }

    public void verifyStackedUIMBI(String value) {
        assertCellValue(StackedUIMBI, value, "Stacked UIMBI");
    }

    public void verifyUMBIUIM(String value) {
        assertCellValue(UMBIUIM, value, "UMBI UIM");
    }

    public void verifyUIMBITerrFactor(String value) {
        assertCellValue(UIMBITerrFactor, value, "UIMBI Terr Factor");
    }

    public void verifyMPTerrFactor(String value) {
        assertCellValue(MPTerrFactor, value, "MP Terr Factor");
    }

    public void verifyUMUIMTerrFactor(String value) {
        assertCellValue(UMUIMTerrFactor, value, "UM UIM Terr Factor");
    }

    public void verifyUMBITerrFactor(String value) {
        assertCellValue(UMBITerrFactor, value, "UM BI Terr Factor");
    }

    public void verifyUMPDTerrFactor(String value) {
        assertCellValue(UMPDTerrFactor, value, "UM PD Terr Factor");
    }

    public void verifyUIMBI(String value) {
        assertCellValue(UIMBI, value, "UIMBI");
    }

    public void verifyPIP(String value) {
        assertCellValue(PIP, value, "PIP");
    }

    public void verifyUMBI(String value) {
        assertCellValue(UMBI, value, "UMBI");
    }

    public void verifyUMPD(String value) {
        assertCellValue(UMPD, value, "UMPD");
    }

    public void verifyMP(String value) {
        assertCellValue(MP, value, "MP");
    }

    public void verifyUMBIUIMBI(String value) {
        assertCellValue(UMBIUIMBI, value, "UMBI UIMBI");
    }

    public void verifyMEDTerrFactor(String value) {
        assertCellValue(MEDTerrFactor, value, "MED Terr Factor");
    }

    public void verifyUIM(String value) {
        assertCellValue(UIM, value, "UIM");
    }

    public void verifyUMTerrFactor(String value) {
        assertCellValue(UMTerrFactor, value, "UM Terr Factor");
    }

    public void verifyGaragingLocationTerr(String value) {
        assertCellValue(garagingLocationTerr, value, "Garaging Location Terr");
    }

    public void verifyPDTerrFactor(String value) {
        assertCellValue(PDTerrFactor, value, "PD Terr Factor");
    }

    public void verifyBITerrFactor(String value) {
        assertCellValue(BITerrFactor, value, "BITerr  Factor");
    }

    public void verifyCOMPTerrFactor(String value) {
        assertCellValue(COMPTerrFactor, value, "COMP Terr Factor");
    }

    public void verifyCOLLTerrFactor(String value) {
        assertCellValue(COLLTerrFactor, value, "COLL Terr Factor");
    }

}