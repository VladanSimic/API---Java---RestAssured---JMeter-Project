package pages.blocks;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class SymbolsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public SymbolsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Liability Symbol']/../../../..//input")
    List<WebElement> liabilitySymbol;
    @FindBy(xpath = "//div[text()='MP Symbol']/../../../..//input")
    List<WebElement> MPSymbol;
    @FindBy(xpath = "//div[text()='PIP/MP Symbol']/../../../..//input")
    List<WebElement> PIPMPSymbol;
    @FindBy(xpath = "//div[text()='OTC Symbol']/../../../..//input")
    List<WebElement> OTCSymbol;
    @FindBy(xpath = "//div[text()='COLL Symbol']/../../../..//input")
    List<WebElement> COLLSymbol;
    @FindBy(xpath = "//div[text()='COMP Symbol']/../../../..//input")
    List<WebElement> COMPSymbol;
    @FindBy(xpath = "//div[text()='LPMP Rate Plan']/../../../../div/div[text()]")
    List<WebElement> LPMPRatePlan;

    public void fillSymbolDetailsPA(Map<String, String> data, int i) throws Throwable {
        verifyLiabilitySymbol(data.get("Symbols_Liability_Symbol_" + i));
        verifyCOLLSymbol(data.get("Symbols_COLL_Symbol_" + i));

        if (data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Private Passenger")) {
            verifyLPMPRatePlan(data.get("Symbols_LPMP_Rate_Plan_" + i));
        }

        setLiabilitySymbol(data.get("Symbols_Underwriter_Symbol_Override_Liability_Symbol_" + i));
        setCOLLSymbol(data.get("Symbols_Underwriter_Symbol_Override_COLL_Symbol_" + i));

        if (data.get("State").equalsIgnoreCase("NC")) {
            verifyMPSymbol(data.get("Symbols_MP_Symbol_" + i));
            verifyOTCSymbol(data.get("Symbols_OTC_Symbol_" + i));
            setMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_MP_Symbol_" + i));
            setOTCSymbol(data.get("Symbols_Underwriter_Symbol_Override_OTC_Symbol_" + i));
        } else if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("PA")) {
            verifyPIPMPSymbol(data.get("Symbols_PIP_MP_Symbol_" + i));
            verifyOTCSymbol(data.get("Symbols_OTC_Symbol_" + i));
            setPIPMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_PIP_MP_Symbol_" + i));
            setOTCSymbol(data.get("Symbols_Underwriter_Symbol_Override_OTC_Symbol_" + i));
        } else {
            verifyMPSymbol(data.get("Symbols_MP_Symbol_" + i));
            verifyCOMPSymbol(data.get("Symbols_COMP_Symbol_" + i));
            setMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_MP_Symbol_" + i));
            setCOMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_COMP_Symbol_" + i));
        }

        saveChanges();
    }

    public void fillSymbolDetailsPA_END(Map<String, String> data, int i) throws Throwable {
        verifyLiabilitySymbol(data.get("Symbols_Liability_Symbol_END_" + i));
        verifyCOLLSymbol(data.get("Symbols_COLL_Symbol_END_" + i));

        if (data.get("Vehicle_Details_Vehicle_Type_END_" + i).equalsIgnoreCase("Private Passenger")) {
            verifyLPMPRatePlan(data.get("Symbols_LPMP_Rate_Plan_END_" + i));
        }

        setLiabilitySymbol(data.get("Symbols_Underwriter_Symbol_Override_Liability_Symbol_END_" + i));
        setCOLLSymbol(data.get("Symbols_Underwriter_Symbol_Override_COLL_Symbol_END_" + i));

        if (data.get("State").equalsIgnoreCase("NC")) {
            verifyMPSymbol(data.get("Symbols_MP_Symbol_END_" + i));
            verifyOTCSymbol(data.get("Symbols_OTC_Symbol_END_" + i));
            setMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_MP_Symbol_END_" + i));
            setOTCSymbol(data.get("Symbols_Underwriter_Symbol_Override_OTC_Symbol_END_" + i));
        } else if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("PA")) {
            verifyPIPMPSymbol(data.get("Symbols_PIP_MP_Symbol_END_" + i));
            verifyOTCSymbol(data.get("Symbols_OTC_Symbol_END_" + i));
            setPIPMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_PIP_MP_Symbol_END_" + i));
            setOTCSymbol(data.get("Symbols_Underwriter_Symbol_Override_OTC_Symbol_END_" + i));
        } else {
            verifyMPSymbol(data.get("Symbols_MP_Symbol_END_" + i));
            verifyCOMPSymbol(data.get("Symbols_COMP_Symbol_END_" + i));
            setMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_MP_Symbol_END_" + i));
            setCOMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_COMP_Symbol_END_" + i));
        }

        saveChanges();
    }

    public void fillSymbolDetailsPA_OOS_END(Map<String, String> data, int i) throws Throwable {
        verifyLiabilitySymbol(data.get("Symbols_Liability_Symbol_OOS_END_" + i));
        verifyCOLLSymbol(data.get("Symbols_COLL_Symbol_OOS_END_" + i));

        if (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i).equalsIgnoreCase("Private Passenger")) {
            verifyLPMPRatePlan(data.get("Symbols_LPMP_Rate_Plan_END_" + i));
        }

        setLiabilitySymbol(data.get("Symbols_Underwriter_Symbol_Override_Liability_Symbol_OOS_END_" + i));
        setCOLLSymbol(data.get("Symbols_Underwriter_Symbol_Override_COLL_Symbol_OOS_END_" + i));

        if (data.get("State").equalsIgnoreCase("NC")) {
            verifyMPSymbol(data.get("Symbols_MP_Symbol_OOS_END_" + i));
            verifyOTCSymbol(data.get("Symbols_OTC_Symbol_OOS_END_" + i));
            setMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_MP_Symbol_OOS_END_" + i));
            setOTCSymbol(data.get("Symbols_Underwriter_Symbol_Override_OTC_Symbol_OOS_END_" + i));
        } else if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("PA")) {
            verifyPIPMPSymbol(data.get("Symbols_PIP_MP_Symbol_OOS_END_" + i));
            verifyOTCSymbol(data.get("Symbols_OTC_Symbol_OOS_END_" + i));
            setPIPMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_PIP_MP_Symbol_OOS_END_" + i));
            setOTCSymbol(data.get("Symbols_Underwriter_Symbol_Override_OTC_Symbol_OOS_END_" + i));
        } else {
            verifyMPSymbol(data.get("Symbols_MP_Symbol_OOS_END_" + i));
            verifyCOMPSymbol(data.get("Symbols_COMP_Symbol_OOS_END_" + i));
            setMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_MP_Symbol_OOS_END_" + i));
            setCOMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_COMP_Symbol_OOS_END_" + i));
        }

        saveChanges();
    }

    public void fillSymbolDetailsPA_RNW(Map<String, String> data, int i) throws Throwable {
        verifyLiabilitySymbol(data.get("Symbols_Liability_Symbol_RNW_" + i));
        verifyCOLLSymbol(data.get("Symbols_COLL_Symbol_RNW_" + i));

        if (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i).equalsIgnoreCase("Private Passenger")) {
            verifyLPMPRatePlan(data.get("Symbols_LPMP_Rate_Plan_RNW_" + i));
        }

        setLiabilitySymbol(data.get("Symbols_Underwriter_Symbol_Override_Liability_Symbol_RNW_" + i));
        setCOLLSymbol(data.get("Symbols_Underwriter_Symbol_Override_COLL_Symbol_RNW_" + i));

        if (data.get("State").equalsIgnoreCase("NC")) {
            verifyMPSymbol(data.get("Symbols_MP_Symbol_RNW_" + i));
            verifyOTCSymbol(data.get("Symbols_OTC_Symbol_RNW_" + i));
            setMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_MP_Symbol_RNW_" + i));
            setOTCSymbol(data.get("Symbols_Underwriter_Symbol_Override_OTC_Symbol_RNW_" + i));
        } else if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("AL") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("NY") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("GA") ||
                data.get("State").equalsIgnoreCase("MI") ||
                data.get("State").equalsIgnoreCase("PA")) {
            verifyPIPMPSymbol(data.get("Symbols_PIP_MP_Symbol_RNW_" + i));
            verifyOTCSymbol(data.get("Symbols_OTC_Symbol_RNW_" + i));
            setPIPMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_PIP_MP_Symbol_RNW_" + i));
            setOTCSymbol(data.get("Symbols_Underwriter_Symbol_Override_OTC_Symbol_RNW_" + i));
        } else {
            verifyMPSymbol(data.get("Symbols_MP_Symbol_RNW_" + i));
            verifyCOMPSymbol(data.get("Symbols_COMP_Symbol_RNW_" + i));
            setMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_MP_Symbol_RNW_" + i));
            setCOMPSymbol(data.get("Symbols_Underwriter_Symbol_Override_COMP_Symbol_RNW_" + i));
        }

        saveChanges();
    }

    public void setLiabilitySymbol(String value) throws Throwable {
        typeText(liabilitySymbol.get(1), value);
    }

    public void setMPSymbol(String value) throws Throwable {
        typeText(MPSymbol.get(1), value);
    }

    public void setPIPMPSymbol(String value) throws Throwable {
        typeText(PIPMPSymbol.get(1), value);
    }

    public void setOTCSymbol(String value) throws Throwable {
        typeText(OTCSymbol.get(1), value);
    }

    public void verifyPIPMPSymbol(String value) throws Throwable {
        typeText(PIPMPSymbol.get(0), value);
    }

    public void verifyOTCSymbol(String value) throws Throwable {
        typeText(OTCSymbol.get(0), value);
    }

    public void setCOLLSymbol(String value) throws Throwable {
        typeText(COLLSymbol.get(1), value);
    }

    public void setCOMPSymbol(String value) throws Throwable {
        typeText(COMPSymbol.get(1), value);
    }

    public void verifyLiabilitySymbol(String value) {
        assertCellValue(liabilitySymbol.get(0), value, "Liability Symbol");
    }

    public void verifyMPSymbol(String value) {
        assertCellValue(MPSymbol.get(0), value, "MP Symbol");
    }

    public void verifyCOLLSymbol(String value) {
        assertCellValue(COLLSymbol.get(0), value, "COLL Symbol");
    }

    public void verifyCOMPSymbol(String value) {
        assertCellValue(COMPSymbol.get(0), value, "COMP Symbol");
    }

    public void verifyLPMPRatePlan(String value) {
        assertCellValue(LPMPRatePlan.get(0), value, "LPMP Rate Plan");
    }

    public void verifySymbolsBlock(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String liabilitySymbolVal = columns.get(0);
            String MPSymbolVal = columns.get(1);
            String COLLSymbolVal = columns.get(2);
            String COMPSymbolVal = columns.get(3);

            assertCellValue(liabilitySymbol.get(0), liabilitySymbolVal, "Liability Symbol");
            try {
                assertCellValue(PIPMPSymbol.get(0), MPSymbolVal, "PIP MP Symbol");
            } catch (Exception e) {
                assertCellValue(MPSymbol.get(0), MPSymbolVal, "MP Symbol");
            }
            assertCellValue(COLLSymbol.get(0), COLLSymbolVal, "COLL Symbol");
            try {
                assertCellValue(OTCSymbol.get(0), COMPSymbolVal, "OTC Symbol");
            } catch (Exception r) {
                assertCellValue(COMPSymbol.get(0), COMPSymbolVal, "COMP Symbol");
            }
        }
        reportScreenshot("Symbols" + System.currentTimeMillis(), "Symbols");
    }

}