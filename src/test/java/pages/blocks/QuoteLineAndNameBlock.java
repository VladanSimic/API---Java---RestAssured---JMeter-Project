package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class QuoteLineAndNameBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public QuoteLineAndNameBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Insurance Line']/../../../..//input")
    WebElement insuranceLine;
    @FindBy(xpath = "//div[text()='Risk State']/../../../../../../../../../..//input[@aria-hidden='false']")
    WebElement state;
    @FindBy(xpath = "//div[text()='Quote Name']/../../../..//input")
    WebElement quoteName;

    public void fillOutQuoteLineAndNameBlock(Map<String, String> data) throws Throwable {
        setInsuranceLine(data.get("Quote_Line_And_Name_Block_Insurance_Line"));
        setState(data.get("Quote_Line_And_Name_Block_State"));
        pause(2000);
        setQuoteName(data.get("Quote_Line_And_Name_Block_Name"));
    }

    public void setInsuranceLine(String value) throws InterruptedException {
        typeTextEnter(insuranceLine, value, "Insurance line");
        pause(2000);
    }

    public void setState(String value) throws InterruptedException {
        if (value.contains("TC_"))
            value = value.substring(0, 2);
        try {
            driver.findElement(By.xpath("(//div[text()='Risk State']/../../../..//input)[4]")).sendKeys(value);
            pause(2000);
        } catch (Exception e) {
            try {
                driver.findElement(By.xpath("(//div[text()='Risk State']/../../../..//input)[2]")).sendKeys(value);
                pause(2000);
            } catch (Exception ee) {
                //
            }
            typeTextEnter(state, value, "State");
        }
    }

    public void setQuoteName(String value) throws InterruptedException {
        typeTextEnter(quoteName, value, "Quote name");
        setAttributeValue(quoteName, "value", value);
    }

}