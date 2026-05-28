package pages.blocks;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class HailAssessmentBlock extends CommonComponentsAndActions {
    public HailAssessmentBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Likelihood of')]/../../../..//div[@role='textbox']")
    WebElement likelihoodOfPreExistingDamage;
    @FindBy(xpath = "//div[contains(text(),'Data received on')]/../../../..//div[@role='textbox']")
    WebElement dataReceivedOn;
    @FindBy(xpath = "//span[text()='Refresh Hail Assessment']")
    WebElement refreshBtn;
    @FindBy(xpath = "//span[text()='Refresh Hail Assessment']")
    List<WebElement> refreshBtnList;

    public void verifyLikelihoodCell(String value) {
        setAttributeValue(likelihoodOfPreExistingDamage, "value", likelihoodOfPreExistingDamage.getText());
        assertCellValue(likelihoodOfPreExistingDamage, value, "Likelihood of Pre-Existing Damage");
    }

    public void verifyDataReceivedOn(String value) {
        setAttributeValue(dataReceivedOn, "value", dataReceivedOn.getText());
        assertCellValue(dataReceivedOn, value, "Data Received On");
    }

    public void clickRefreshBtn() throws Throwable {
        clickElement(refreshBtn, "Refresh Button");
        pause(8000);
    }

    public void insertWeatherAnalyticsIntoData(String cityState, String trx) {
        Map<String, String> data = DataManager.getInstance().getData();
        data.put(cityState.trim() + "_WeatherAnalytics_Likelihood_" + trx, likelihoodOfPreExistingDamage.getText().trim());
        data.put(cityState.trim() + "_WeatherAnalytics_DataReceived_" + trx, dataReceivedOn.getText().trim());
    }

    public void verifyWeatherAnalyticsFromData(String cityState, String trx, String option) throws Throwable {
        Map<String, String> data = DataManager.getInstance().getData();
        String likelihood = data.get(cityState.trim() + "_WeatherAnalytics_Likelihood_" + trx);
        String dataReceived = data.get(cityState.trim() + "_WeatherAnalytics_DataReceived_" + trx);

        goToPage(cityState);
        boolean matches = likelihoodOfPreExistingDamage.getText().trim().equalsIgnoreCase(likelihood) &&
                dataReceivedOn.getText().trim().equalsIgnoreCase(dataReceived);

        if (option.equalsIgnoreCase("same") || option.equalsIgnoreCase("equal")) {
            if (!matches) {
                failAssertion("Weather Analytics does not match based on " + trx + " transaction data");
            }
        } else {
            if (matches) {
                failAssertion("Weather Analytics matches when it shouldn't based on " + trx + " transaction data");
            }
        }
        scrollToWebElement(likelihoodOfPreExistingDamage);
        reportScreenshot("WeatherAnalytics", "Weather Analytics report");
    }

    public void verifyIfRefreshButtonIsDisplayed(String value) {
        boolean isDisplayed = refreshBtnList.size() > 0;

        if (value.equalsIgnoreCase("displayed") && !isDisplayed) {
            failAssertion("Refresh button is not visible");
        } else if (value.equalsIgnoreCase("not displayed") && isDisplayed) {
            failAssertion("Refresh button is visible when it shouldn't be");
        }
        scrollToWebElement(likelihoodOfPreExistingDamage);
        reportScreenshot("WeatherAnalytics_Refresh_Btn", "Refresh Button for Weather Analytics");
    }

}
