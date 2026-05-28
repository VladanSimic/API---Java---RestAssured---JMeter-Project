package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WatercraftLossHistoryForPriorVesselsNotListedOnTheQuoteBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WatercraftLossHistoryForPriorVesselsNotListedOnTheQuoteBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'watercraft loss history for prior vessels')]/../../../../../..//div[text()='Have there been any prior watercraft losses?']/../../../..//label[text()='No']/..//input")
    WebElement watercraftPriorLossesNo;
    @FindBy(xpath = "//div[contains(text(),'watercraft loss history for prior vessels')]/../../../../../..//div[text()='Have there been any prior watercraft losses?']/../../../..//label[text()='Yes']/..//input")
    WebElement watercraftPriorLossesYes;
    @FindBy(xpath = "//div[text()='watercraft loss history for prior vessels not listed on the quote (policy)']/ancestor::div[1]//following::table[3]//td[2]//span[text()='Add']")
    WebElement addWatercraftPriorLosses;

    public void fillWatercraftLossHistoryForPriorVesselsNotListedOnTheQuoteComponent(Map<String, String> data) throws Throwable {
        verifyBlockExists("watercraft loss history for prior vessels");
        setWatercraftPriorLosses(data);
        if (hasValue(data.get("watercraft_prior_vessel_incident_num")) && !data.get("watercraft_prior_vessel_incident_num").isEmpty()) {
            for (int i = 0; i < Integer.parseInt(data.get("watercraft_prior_vessel_incident_num")); i++) {
                pause(1000);
                clickElement(addWatercraftPriorLosses, "Add watercraft losses for prior vessels");
                pause(1000);
                clickFooter();
                setWatercraftPriorVesselIncidentSource(data.get("watercraft_prior_vessel_incident_source_" + i), i);
                setWatercraftPriorVesselIncidentLossType(data.get("watercraft_prior_vessel_incident_loss_type_" + i), i);
                if (data.get("watercraft_prior_vessel_incident_loss_date_" + i).equalsIgnoreCase("Today")) {
                    setWatercraftPriorVesselIncidentLossDate(data.get("Effective_Date"), i);
                } else {
                    setWatercraftPriorVesselIncidentLossDate(data.get("watercraft_prior_vessel_incident_loss_date_" + i), i);
                }
                setWatercraftPriorVesselIncidentLossAmount(data.get("watercraft_prior_vessel_incident_amount_" + i), i);
            }
        }
    }

    private void setWatercraftPriorLosses(Map<String, String> data) throws Throwable {
        choose(watercraftPriorLossesYes, watercraftPriorLossesNo, data.get("Watercraft_Prior_Losses_For_Not_Listed_Vessels"));
    }

    public void setWatercraftPriorVesselIncidentSource(String value, int index) throws Throwable {
        WebElement source = driver.findElement(By.xpath("//div[text()='watercraft loss history for prior vessels not listed on the quote (policy)']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[1]/div"));
        if (hasValue(value)) {
            clickFooter();
            clickElement(source, "Prior Vessel Incident Source");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

    public void setWatercraftPriorVesselIncidentLossType(String value, int index) throws Throwable {
        WebElement lossType = driver.findElement(By.xpath("//div[text()='watercraft loss history for prior vessels not listed on the quote (policy)']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[2]/div"));
        if (hasValue(value)) {
            clickElement(lossType, "Prior Vessel Incident Loss Type");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

    public void setWatercraftPriorVesselIncidentLossDate(String value, int index) throws Throwable {
        WebElement lossDate = driver.findElement(By.xpath("//div[text()='watercraft loss history for prior vessels not listed on the quote (policy)']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[3]/div"));
        if (hasValue(value)) {
            clickElement(lossDate, "Prior Vessel Incident Loss Date");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

    public void setWatercraftPriorVesselIncidentLossAmount(String value, int index) throws Throwable {
        WebElement lossAmount = driver.findElement(By.xpath("//div[text()='watercraft loss history for prior vessels not listed on the quote (policy)']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[4]/div"));
        if (hasValue(value)) {
            clickElement(lossAmount, "Prior Vessel Incident Loss Amount");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }
}