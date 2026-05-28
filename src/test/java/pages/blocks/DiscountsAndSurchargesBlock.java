package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class DiscountsAndSurchargesBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public DiscountsAndSurchargesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[text()='covid mileage credit']/../..//input")
    WebElement covidMileageCredit;
    @FindBy(xpath = "//div[text()='Trx Number']/../../../..//input")
    WebElement trxNumber;
    @FindBy(xpath = "//div[text()='Is this Original Covid19 transaction']/../../../..//input")
    WebElement isThisOriginalCovid19Transaction;

    public void fillDiscountsAndSurchargesDetailsPA(Map<String, String> data) throws Throwable {
        setDiscountsAndSurchargesCovidMileageCredit(data.get("Discounts_And_Surcharges_Covid_Mileage_Credit"));
        setDiscountsAndSurchargesTrxNumber(data.get("Discounts_And_Surcharges_Trx_Number"));
        setDiscountsAndSurchargesIsThisOriginalCovid19Transaction(data.get("Discounts_And_Surcharges_Is_This_Original_Covid19_Transaction"));
    }

    public void fillDiscountsAndSurchargesDetailsPA_END(Map<String, String> data) throws Throwable {
        setDiscountsAndSurchargesCovidMileageCredit(data.get("Discounts_And_Surcharges_Covid_Mileage_Credit_END"));
        setDiscountsAndSurchargesTrxNumber(data.get("Discounts_And_Surcharges_Trx_Number_END"));
        setDiscountsAndSurchargesIsThisOriginalCovid19Transaction(data.get("Discounts_And_Surcharges_Is_This_Original_Covid19_Transaction_END"));
    }

    public void fillDiscountsAndSurchargesDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        setDiscountsAndSurchargesCovidMileageCredit(data.get("Discounts_And_Surcharges_Covid_Mileage_Credit_OOS_END"));
        setDiscountsAndSurchargesTrxNumber(data.get("Discounts_And_Surcharges_Trx_Number_OOS_END"));
        setDiscountsAndSurchargesIsThisOriginalCovid19Transaction(data.get("Discounts_And_Surcharges_Is_This_Original_Covid19_Transaction_OOS_END"));
    }

    public void fillDiscountsAndSurchargesDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setDiscountsAndSurchargesCovidMileageCredit(data.get("Discounts_And_Surcharges_Covid_Mileage_Credit_RNW"));
        setDiscountsAndSurchargesTrxNumber(data.get("Discounts_And_Surcharges_Trx_Number_RNW"));
        setDiscountsAndSurchargesIsThisOriginalCovid19Transaction(data.get("Discounts_And_Surcharges_Is_This_Original_Covid19_Transaction_RNW"));
    }

    public void setDiscountsAndSurchargesCovidMileageCredit(String s) throws Throwable {
        checkCheckbox(covidMileageCredit, s, "Covid Mileage Credit");
    }

    public void setDiscountsAndSurchargesTrxNumber(String s) {
        typeText(trxNumber, s, "Trx Number");
    }

    public void setDiscountsAndSurchargesIsThisOriginalCovid19Transaction(String s) {
        typeTextEnter(isThisOriginalCovid19Transaction, s, "Is This Original Covid19 Transaction");
    }
}