package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class LexisNexisPriorCarrierInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public LexisNexisPriorCarrierInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Current/Prior Carrier']/../../../..//input")
    WebElement currentPriorCarrier;
    @FindBy(xpath = "//div[text()='Lapse in Coverage?']/../../../..//input")
    WebElement lapseInCoverage;


    public void fillLexisNexisPriorCarrierInformationDetails_PA(Map<String, String> data) throws Throwable {
        verifyBlockExists("LexisNexis prior carrier information");
        verifyCurrentPriorCarrier(data.get("Lexis_Nexis_Prior_Carrier_Information_Current_Prior_Carrier"));
        verifyLapseInCoverage(data.get("Lexis_Nexis_Prior_Carrier_Information_Lapse_In_Coverage"));
    }

    public void fillLexisNexisPriorCarrierInformationDetails_PA_END(Map<String, String> data) {
        verifyCurrentPriorCarrier(data.get("Lexis_Nexis_Prior_Carrier_Information_Current_Prior_Carrier_END"));
        verifyLapseInCoverage(data.get("Lexis_Nexis_Prior_Carrier_Information_Lapse_In_Coverage_END"));
    }

    public void fillLexisNexisPriorCarrierInformationDetails_PA_OOS_END(Map<String, String> data) {
        verifyCurrentPriorCarrier(data.get("Lexis_Nexis_Prior_Carrier_Information_Current_Prior_Carrier_OOS_END"));
        verifyLapseInCoverage(data.get("Lexis_Nexis_Prior_Carrier_Information_Lapse_In_Coverage_OOS_END"));
    }

    public void fillLexisNexisPriorCarrierInformationDetails_PA_RNW(Map<String, String> data) {
        verifyCurrentPriorCarrier(data.get("Lexis_Nexis_Prior_Carrier_Information_Current_Prior_Carrier_RNW"));
        verifyLapseInCoverage(data.get("Lexis_Nexis_Prior_Carrier_Information_Lapse_In_Coverage_RNW"));
    }

    public void verifyCurrentPriorCarrier(String value) {
        assertCellValue(currentPriorCarrier, value, "Current Prior Carrier");
    }

    public void verifyLapseInCoverage(String value) {
        assertCellValue(lapseInCoverage, value, "Lapse in Coverage");
    }

}
