package pages.blocks;

import excel.DataManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class MunicipalityTaxReportBlock extends CommonComponentsAndActions {
    Map<String,String> data = DataManager.getInstance().getData();

    public MunicipalityTaxReportBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Tax code']/following::input[@type='text'][1]")
    WebElement taxCode;
    @FindBy(xpath = "//div[text()='City Code']/following::input[@type='text'][1]")
    WebElement cityCode;
    @FindBy(xpath = "//div[text()='Min tax']/following::input[@type='text'][1]")
    WebElement minTax;
    @FindBy(xpath = "(//div[text()='Eff. date low']/following::input[@type='text'])[1]")
    WebElement effDateLow;
    @FindBy(xpath = "(//div[text()='Eff. date high']/following::input[@type='text'])[1]")
    WebElement effDateHigh;
    @FindBy(xpath = "//div[text()='County name']/following::input[@type='text'][1]")
    WebElement countyName;
    @FindBy(xpath = "//div[text()='FIPS']/following::input[@type='text'][1]")
    WebElement FIPS;
    @FindBy(xpath = "//div[text()='City name']/following::input[@type='text'][1]")
    WebElement cityName;
    @FindBy(xpath = "//div[text()='Underwriting tax override']/following::input[@type='text'][1]")
    WebElement underwritingTaxOverride;
    @FindBy(xpath = "//div[text()='Underwriting tax override']/following::input[@type='text'][2]")
    WebElement underwritingTaxOverrideInput;
    @FindBy(xpath = "//div[text()='Underwriting tax override']/following::input[@type='text'][3]")
    WebElement underwritingTaxOverrideInputAdditional;
    @FindBy(xpath = "//div[text()='Date ordered']/following::input[@type='text'][1]")
    WebElement dateOrdered;


    public void verifyTaxCode(String value) {
        assertCellValue(taxCode, value, "Tax Code");
    }

    public void verifyCityCode(String value) {
        assertCellValue(cityCode, value, "City Code");
    }

    public void verifyMinTax(String value) {
        assertCellValue(minTax, value, "Min tax");
    }

    public void verifyEffDateLow(String value) {
        assertCellValue(effDateLow, value, "Eff Date Low");
    }

    public void verifyEffDateHigh(String value) {
        assertCellValue(effDateHigh, value, "Eff Date High");
    }

    public void verifyCountyName(String value) {
        assertCellValue(countyName, value, "County Name");
    }

    public void verifyFIPS(String value) {
        assertCellValue(FIPS, value, "FIPS");
    }

    public void setCityName(String value) {
        typeText(cityName, value, "City Name");
    }

    public void setCountyName(String value) {
        typeText(countyName, value, "County Name");
    }

    public void setCityCode(String value) {
        typeText(cityCode, value, "City Code");
    }

    public void setUnderwritingTaxOverride(String value, String input) {
        typeTextEnter(underwritingTaxOverride, value, "Underwriting Tax Override");
        typeText(underwritingTaxOverrideInput, input, "Underwriting Tax Override Input");
    }

    public void setDateOrdered(String value) throws Throwable {
        typeTextEnter(dateOrdered, value, "Date Ordered");
        clickFooter();
    }


    public void fillKYTaxReportDummyData(String lob) throws Throwable {
        if (!isCityNameReturned()) {
            setCityName("Larue County");
            setCountyName("Larue County");
            setCityCode("9999");
            setDateOrdered(data.get("Effective_Date"));
            setUnderwritingTaxOverride("City Tax", "0");
            if (lob.equalsIgnoreCase("HO") || lob.equalsIgnoreCase("Homeowners"))
                setUnderwritingTaxOverrideInputAdditional("0");
        }
    }

    public boolean isCityNameReturned() {
        return hasValue(returnElementAttributeValue(cityName));
    }

    public void setUnderwritingTaxOverrideInputAdditional(String value) throws Throwable {
        typeText(underwritingTaxOverrideInputAdditional, value, "Additional Tax Input");
        clickFooter();
    }

}
