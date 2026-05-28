package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.blocks.AdditionalInsuredAndInterestBlock;
import pages.blocks.AdditionalInsuredBlock;
import pages.blocks.AdditionalInterestsBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class AdditionalInsuredPageSteps extends BaseTest {

    public AdditionalInsuredPageSteps() {
        super.driver = this.driver;
    }

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();


    @And("I set the additional insured {int} type to {string}")
    public void setType(int index, String value) throws Throwable {
        new AdditionalInsuredBlock(driver).setType(value, index);
    }

    @And("I set the additional insured {int} LLC trust to {string}")
    public void setLLCTrust(int index, String value) throws Throwable {
        new AdditionalInsuredBlock(driver).setLLCTrust(value, index);
    }

    @And("I set the additional insured {int} name to {string}")
    public void setName(int index, String value) throws Throwable {
        new AdditionalInsuredBlock(driver).setName(value, index);
    }

    @And("I set the additional insured {int} address Line1 to {string}")
    public void setAddressLine1(int index, String value) throws Throwable {
        new AdditionalInsuredBlock(driver).setAddressLine1(value, index);
    }

    @And("I set the additional insured {int} city to {string}")
    public void setCity(int index, String value) throws Throwable {
        new AdditionalInsuredBlock(driver).setCity(value, index);
    }

    @And("I set the additional insured {int} state to {string}")
    public void setState(int index, String value) throws Throwable {
        new AdditionalInsuredBlock(driver).setState(value, index);
    }

    @And("I set the additional insured {int} ZIP to {string}")
    public void setZIP(int index, String value) throws Throwable {
        new AdditionalInsuredBlock(driver).setZIP(value, index);
    }

    @And("I delete all additional insured on a page")
    public void deleteAllInterests() {
        new AdditionalInsuredBlock(driver).deleteAllInterests();
    }

    @And("I click add additional insured")
    public void iClickAddButton() throws Throwable {
        new AdditionalInsuredBlock(driver).clickAdd();
    }

    @And("I set the additional insured or interest {int} Applicable Class to {string}")
    public void iSetInsuredApplicableClassTo(int index, String value) throws Throwable {
        new AdditionalInsuredAndInterestBlock(driver).setApplicableClass(value, index);
    }

}
