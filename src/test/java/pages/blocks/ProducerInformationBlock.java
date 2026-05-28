package pages.blocks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ProducerInformationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ProducerInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Licensed Producer']/../../../..//input")
    List<WebElement> licensedProducer;
    @FindBy(xpath = "//div[text()='Advisor / Servicer']/../../../..//input")
    List<WebElement> advisorServicer;

    public void fillOutProducerInformationDetails(Map<String, String> data, String ENV) throws Throwable {
        selectLicensedProducer(data, ENV);
        selectAdvisorServicer(data, ENV);
    }

    public void selectLicensedProducer(Map<String, String> data, String ENV) throws Throwable {
        String licensedProducerValue = "";
        switch (ENV) {
            case "DEV": {
                licensedProducerValue = data.get("Licensed_Producer_DEV");
                typeTexts(licensedProducer, 0, data.get("Licensed_Producer_DEV"));
            }
            break;
            case "DEV2": {
                licensedProducerValue = data.get("Licensed_Producer_DEV2");
                typeTexts(licensedProducer, 0, data.get("Licensed_Producer_DEV2"));
            }
            break;
            case "AWS_DEV": {
                licensedProducerValue = data.get("Licensed_Producer_AWS_DEV");
                typeTexts(licensedProducer, 0, data.get("Licensed_Producer_AWS_DEV"));
            }
            break;
            case "QA": {
                licensedProducerValue = data.get("Licensed_Producer_QA");
                typeTexts(licensedProducer, 0, data.get("Licensed_Producer_QA"));
            }
            break;
            case "QA2": {
                licensedProducerValue = data.get("Licensed_Producer_QA2");
                typeTexts(licensedProducer, 0, data.get("Licensed_Producer_QA2"));
            }
            break;
            case "AWS_QA": {
                licensedProducerValue = data.get("Licensed_Producer_AWS_QA");
                typeTexts(licensedProducer, 0, data.get("Licensed_Producer_AWS_QA"));
            }
            break;
            case "STG": {
                licensedProducerValue = data.get("Licensed_Producer_STG");
                typeTexts(licensedProducer, 0, data.get("Licensed_Producer_STG"));
            }
            break;
            case "AWS_STG": {
                licensedProducerValue = data.get("Licensed_Producer_AWS_STG");
                if (hasValue(licensedProducerValue))
                    typeTextEnter(licensedProducer.get(0), data.get("Licensed_Producer_AWS_STG"), "Licensed producer");
                else
                    selectFirstLicensedProducer();
            }
            break;
            case "PROD":
            case "PRE_PROD":
            case "DR_PROD": {
                licensedProducerValue = data.get("Licensed_Producer_PROD");
                if (hasValue(licensedProducerValue))
                    typeTexts(licensedProducer, 0, data.get("Licensed_Producer_PROD"));
                else
                    selectFirstLicensedProducer();
            }
            break;
        }
        reportTextAttachment("Licensed producer: " + licensedProducerValue, licensedProducerValue);
        clickFooter();
    }

    public void selectAdvisorServicer(Map<String, String> data, String ENV) throws Throwable {
        String advisorServicerValue = "";
        switch (ENV) {
            case "DEV": {
                advisorServicerValue = data.get("Advisor_Servicer_DEV");
                typeTexts(advisorServicer, 0, data.get("Advisor_Servicer_DEV"));
            }
            break;
            case "DEV2": {
                advisorServicerValue = data.get("Advisor_Servicer_DEV2");
                typeTexts(advisorServicer, 0, data.get("Advisor_Servicer_DEV2"));
            }
            break;
            case "AWS_DEV": {
                advisorServicerValue = data.get("Advisor_Servicer_AWS_DEV");
                typeTexts(advisorServicer, 0, data.get("Advisor_Servicer_AWS_DEV"));
            }
            break;
            case "QA": {
                advisorServicerValue = data.get("Advisor_Servicer_QA");
                typeTexts(advisorServicer, 0, data.get("Advisor_Servicer_QA"));
            }
            break;
            case "QA2": {
                advisorServicerValue = data.get("Advisor_Servicer_QA2");
                typeTexts(advisorServicer, 0, data.get("Advisor_Servicer_QA2"));
            }
            break;
            case "AWS_QA": {
                advisorServicerValue = data.get("Advisor_Servicer_AWS_QA");
                typeTexts(advisorServicer, 0, data.get("Advisor_Servicer_AWS_QA"));
            }
            break;
            case "STG": {
                advisorServicerValue = data.get("Advisor_Servicer_STG");
                typeTexts(advisorServicer, 0, data.get("Advisor_Servicer_STG"));
            }
            break;
            case "AWS_STG": {
                advisorServicerValue = data.get("Advisor_Servicer_AWS_STG");
                if (hasValue(advisorServicerValue))
                    typeTextEnter(advisorServicer.get(0), data.get("Advisor_Servicer_AWS_STG"), "Advisor servicer");
                else
                    selectFirstAdvisorServicer();
            }
            break;
            case "PROD":
            case "PRE_PROD":
            case "DR_PROD": {
                advisorServicerValue = data.get("Advisor_Servicer_PROD");
                if (hasValue(advisorServicerValue))
                    typeTexts(advisorServicer, 0, data.get("Advisor_Servicer_PROD"));
                else
                    selectFirstAdvisorServicer();
            }
            break;
        }
        reportTextAttachment("Advisor servicer: " + advisorServicerValue, advisorServicerValue);
        clickFooter();
    }

    public void setLicensedProducer(String producer) throws InterruptedException {
        typeText(licensedProducer.get(0), producer, "Licensed producer");
        licensedProducer.get(0).sendKeys(Keys.ENTER);
        pause(2000);
    }

    public void setAdvisorServicer(String advisor) throws InterruptedException {
        pause(5000);
        typeText(advisorServicer.get(0), advisor, "Advisor Servicer");
    }

    public void selectFirstAdvisorServicer() throws Throwable {
        if (!advisorServicer.get(0).getAttribute("value").equalsIgnoreCase("- Select -")) {
            typeTextEnter(advisorServicer.get(0), "- Select -", "Advisor Servicer");
            clickFooter();
        }
        clickElement(advisorServicer.get(0), "Advisor Servicer");
        pause(500);
        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        clickFooter();
    }

    public void selectFirstLicensedProducer() throws Throwable {
        if (!licensedProducer.get(0).getAttribute("value").equalsIgnoreCase("- Select -")) {
            typeTextEnter(licensedProducer.get(0), "- Select -", "Advisor Servicer");
            clickFooter();
        }
        clickElement(licensedProducer.get(0), "Advisor Servicer");
        pause(500);
        driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        clickFooter();
    }
}