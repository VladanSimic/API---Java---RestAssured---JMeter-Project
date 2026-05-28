package pages;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;
import pages.utils.SoftAssertion;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PremiumDetailPage extends CommonComponentsAndActions {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'External Rate Details')]")
    List<WebElement> errorElements;

    public PremiumDetailPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyBaseRate(String baseRate) {
        if (!baseRate.equalsIgnoreCase("/")) {
            String[] baseRateText = baseRate.split("/");
            String baseRateName = baseRateText[0];
            String baseRateValue = baseRateText[1];

            scrollToWebElement(driver.findElement(By.xpath(generateXpath("//td[6]//div[text()=$]", baseRateName))));

            Assert.assertTrue(driver.findElement(By.xpath(generateXpath("//td[6]//div[text()=$]", baseRateName))).isDisplayed());
            Assert.assertEquals(driver.findElement(By.xpath(generateXpath("//td[6]//div[text()=$]/../../td[7]/div", baseRateName))).getText(), baseRateValue);
            reportScreenshot(baseRateName, "Base rate: " + baseRateName + " value: " + baseRateValue);
        }
    }

    public void verifyBaseRates(String baseRates) {
        if (hasValue(baseRates)) {
            String[] rates = baseRates.split(",");

            for (int i = 0; i < rates.length; i++) {

                String[] baseRateText = rates[i].split("/");
                String baseRateName = baseRateText[0];
                String baseRateValue = baseRateText[1];

                scrollToWebElement(driver.findElements(By.xpath(generateXpath("//td[6]//div[text()=$]", baseRateName))).get(i));

                Assert.assertTrue(driver.findElements(By.xpath(generateXpath("//td[6]//div[text()=$]", baseRateName))).get(i).isDisplayed());
                Assert.assertEquals(driver.findElements(By.xpath(generateXpath("//td[6]//div[text()=$]/../../td[7]/div", baseRateName))).get(i).getText(), baseRateValue);
                reportScreenshot(baseRateName, "Base rate: " + baseRateName + " value: " + baseRateValue);
            }
        }
    }

    public void verifyBaseRate(String coverage, String factor, String value) {
        WebElement element = driver.findElement(By.xpath("//div[text()=\"" + coverage + "\"]/../..//td[6]/div[text()=\"" + factor + "\"]/../../td[7]/div"));
        scrollToWebElement(element);

        Assert.assertTrue(element.isDisplayed(), "Coverage: " + coverage + " Factor: " + factor + " Value: " + value);
        Assert.assertEquals(element.getText(), value, "Coverage: " + coverage + " Factor: " + factor + " Value: " + value);
    }

    public void verifyBaseRateNotPresent(String coverage, String factor) {
        List<WebElement> elements = driver.findElements(By.xpath("//div[text()=\"" + coverage + "\"]/../..//td[6]/div[text()=\"" + factor + "\"]/../../td[7]/div"));
        Assert.assertEquals(elements.size(), 0);
    }

    public void verifyBaseRateLocation(String location, String coverage, String factor, String value) {
        WebElement element = driver.findElement(By.xpath("//div[text()=\"" + location + "\"]/../..//td//div[text()=\"" + coverage + "\"]/../..//td[6]/div[text()=\"" + factor + "\"]/../../td[7]/div"));
        scrollToWebElement(element);

        Assert.assertTrue(element.isDisplayed(), "Coverage: " + coverage + " Factor: " + factor + " Value: " + value + " for: " + location);
        Assert.assertEquals(element.getText(), value, "Coverage: " + coverage + " Factor: " + factor + " Value: " + value + " for: " + location);
    }

    public String[] getCoverageFactorValue() {
        List<WebElement> rows = driver.findElements(By.xpath("//div[text()='quote premium debug information']/../../../../../..//*[contains(@class, 'x-grid-with-row-lines')]/div[contains(@class,'x-grid-item-container')]/table"));

        String[] values = new String[rows.size()];

        for (int i = 0; i < rows.size(); i++) {
            String coverage = driver.findElement(By.xpath("//div[text()='quote premium debug information']/../../../../../..//*[contains(@class, 'x-grid-with-row-lines')]/div[contains(@class,'x-grid-item-container')]/table[" + (i + 1) + "]//tr/td[4]")).getText();
            String factor = driver.findElement(By.xpath("//div[text()='quote premium debug information']/../../../../../..//*[contains(@class, 'x-grid-with-row-lines')]/div[contains(@class,'x-grid-item-container')]/table[" + (i + 1) + "]//tr/td[6]")).getText();
            String value = driver.findElement(By.xpath("//div[text()='quote premium debug information']/../../../../../..//*[contains(@class, 'x-grid-with-row-lines')]/div[contains(@class,'x-grid-item-container')]/table[" + (i + 1) + "]//tr/td[7]")).getText();

            String combined = coverage + "#@#" + factor + "#@#" + value;
            values[i] = combined;
        }

        return values;
    }

    public void validateFactor(String relatedObject, String coverage, String factor, String factorValue, String method) {
        setImplicitWaitTo(1);
        if (factor.startsWith("!")) {
            factor = factor.substring(1);
            if (!driver.findElements(By.xpath("//div[contains(text(), '" + relatedObject + "')]/../..//td[4]//div[normalize-space(text())='" + coverage + "']/../..//td[6]//div[normalize-space(text())='" + factor + "']")).isEmpty())
                failAssertion("Factor " + factor + " is present on the UI. Value: " + driver.findElement(By.xpath("//div[contains(text(), '" + relatedObject + "')]/../..//td[4]//div[normalize-space(text())='" + coverage + "']/../..//td[6]//div[normalize-space(text())='" + factor + "']/../..//td[7]//div")).getText());
        } else {
            if (!factorValue.equalsIgnoreCase("/")) {
                scrollToWebElement(driver.findElement(By.xpath("//div[contains(text(), '" + relatedObject + "')]/../..//td[4]//div[normalize-space(text())='" + coverage + "']/../..//td[6]//div[normalize-space(text())='" + factor + "']/../..//td[7]")));
                takeScreenshot("Factor_" + factor);
                if (factorValue.startsWith("!")) {
                    String uiValue = driver.findElement(By.xpath("//div[contains(text(), '" + relatedObject + "')]/../..//td[4]//div[normalize-space(text())='" + coverage + "']/../..//td[6]//div[normalize-space(text())='" + factor + "']/../..//td[7]//div")).getText().trim();
                    if (uiValue.equalsIgnoreCase(factorValue.substring(1).trim()))
                        failAssertion("Factor value matching when it shouldn't for coverage: " + coverage + ", factor: " + factor + ", value: " + factorValue.substring(1));
                } else {
                    String actualValue = driver.findElement(By.xpath("//div[contains(text(), '" + relatedObject + "')]/../..//td[4]//div[normalize-space(text())='" + coverage + "']/../..//td[6]//div[normalize-space(text())='" + factor + "']/../..//td[7]//div")).getText();
                    iCompareTheExpectedAndActualValues(relatedObject, coverage, factor, factorValue, actualValue);
                    SoftAssertion.assertEquals(driver.findElement(By.xpath("//div[contains(text(), '" + relatedObject + "')]/../..//td[4]//div[normalize-space(text())='" + coverage + "']/../..//td[6]//div[normalize-space(text())='" + factor + "']/../..//td[7]//div")).getText(), factorValue, "Factor: " + factor + " expected " + factorValue + " for object " + relatedObject);
                }
                if (hasValue(method))
                    SoftAssertion.assertEquals(driver.findElement(By.xpath("//div[contains(text(), '" + relatedObject + "')]/../..//td[4]//div[normalize-space(text())='" + coverage + "']/../..//td[6]//div[normalize-space(text())='" + factor + "']/../..//td[8]//div")).getText(), method, "Factor " + factor + " expected method " + method);
            } else {
                if (driver.findElements(By.xpath("//div[contains(text(), '" + relatedObject + "')]/../..//td[4]//div[text()='" + coverage + "']/../..//td[6]//div[normalize-space(text())='" + factor + "']")).isEmpty())
                    failAssertion("Factor " + factor + " is not visible.");
                if (hasValue(method))
                    SoftAssertion.assertEquals(driver.findElement(By.xpath("//div[contains(text(), '" + relatedObject + "')]/../..//td[4]//div[text()='" + coverage + "']/../..//td[6]//div[normalize-space(text())='" + factor + "']/../..//td[8]//div")).getText(), method, "Factor " + factor + " expected method " + method);
            }
        }
        setImplicitWaitToDefault();
    }

    @Step("I compare the expected and actual values")
    public void iCompareTheExpectedAndActualValues(String object, String coverage, String factor, String expected, String actual) {
        Allure.attachment("Test Results for :" + object + "  " + coverage + "   " + factor, " [Expected:" + expected + "][ Actual:" + actual + "]");
    }

    public void iVerifyDragonRating(String scenarioNumber) {
        if (errorElements.isEmpty()) {
            reportScreenshot(scenarioNumber + "GenericFL" + System.currentTimeMillis(), "Generic scenarios");
        } else {
            Assert.fail("New rating is being used");
            reportScreenshot(scenarioNumber + "GenericFL" + System.currentTimeMillis(), "Generic scenarios");
        }
    }

    public void iVerifyCoherentRating(String scenarioNumber) {
        if (errorElements.isEmpty()) {
            Assert.fail("Old rating is being used");
            reportScreenshot(scenarioNumber + "Coherent" + System.currentTimeMillis(), "Generic scenarios");
        } else {
            reportScreenshot(scenarioNumber + "Coherent" + System.currentTimeMillis(), "Generic scenarios");
        }
    }

    public void iVerifyFactorShouldNOTBeRated(String factor) {
        if(isElementPresentByXPath("//div[contains(text(), '" + factor + "')]")){
            failAssertion("Excluded Driver Should Not Be Rated");
            reportScreenshot(factor + "_" + System.currentTimeMillis(), "Excluded Driver Rated");
        }else {
            reportScreenshot(factor + "_" + System.currentTimeMillis(), "Excluded Driver Not Rated");
        }
    }
}