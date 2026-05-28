package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WatercraftLossHistoryBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WatercraftLossHistoryBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='watercraft loss history']/../../../../../..//div[contains(text(),'watercraft losses?')]/../../../..//label[text()='No']/..//input")
    WebElement priorWatercraftLossesNo;
    @FindBy(xpath = "//div[text()='watercraft loss history']/../../../../../..//div[contains(text(),'watercraft losses?')]/../../../..//label[text()='Yes']/..//input")
    WebElement priorWatercraftLossesYes;
    @FindBy(xpath = "//div[text()='Select Watercraft']/../../../..//input")
    WebElement selectWatercraftField;
    @FindBy(xpath = "//div[text()='Select Watercraft']/../../../../../../../../../../..//span[text()='Add']")
    WebElement addWatercraftLoss;

    public void fillWatercraftLossHistoryDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("watercraft loss history");
        setPriorWatercraftLosses(data);
        if (hasValue(data.get("watercraft_incident_num")) && !data.get("watercraft_incident_num").isEmpty()) {
            for (int i = 0; i < Integer.parseInt(data.get("watercraft_incident_num")); i++) {
                pause(1000);
                setSelectedVesselWithSheetData(data);
                clickElement(addWatercraftLoss, "Add button for watercraft loss history");
                pause(1000);
                clickFooter();
                setWatercraftIncidentSource(data.get("watercraft_incident_source_" + i), i);
                setWatercraftIncidentLossType(data.get("watercraft_incident_loss_type_" + i), i);
                if (data.get("watercraft_incident_loss_date_" + i).equalsIgnoreCase("Today")) {
                    setWatercraftIncidentLossDate(data.get("Effective_Date"), i);
                } else {
                    setWatercraftIncidentLossDate(data.get("watercraft_incident_loss_date_" + i), i);
                }
                setWatercraftIncidentLossAmount(data.get("watercraft_incident_loss_amount_" + i), i);
            }
        }
    }

    private void setPriorWatercraftLosses(Map<String, String> data) throws Throwable {
        choose(priorWatercraftLossesYes, priorWatercraftLossesNo, data.get("Prior_Watercraft_Losses"));
    }

    public void setSelectedVesselWithSheetData(Map<String, String> data) {
        typeTextEnter(selectWatercraftField, data.get("Year"), "Select Watercraft");
    }

    public void setWatercraftIncidentSource(String value, int index) throws Throwable {
        WebElement source = driver.findElement(By.xpath("//div[text()='watercraft loss history']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[2]/div"));
        if (hasValue(value)) {
            clickFooter();
            clickElement(source, "Incident Source");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

    public void setWatercraftIncidentLossType(String value, int index) throws Throwable {
        WebElement lossType = driver.findElement(By.xpath("//div[text()='watercraft loss history']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[3]/div"));
        if (hasValue(value)) {
            clickElement(lossType, "Incident Loss Type");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

    public void setWatercraftIncidentLossDate(String value, int index) throws Throwable {
        WebElement lossDate = driver.findElement(By.xpath("//div[text()='watercraft loss history']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[4]/div"));
        if (hasValue(value)) {
            clickElement(lossDate, "Incident Loss Date");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

    public void setWatercraftIncidentLossAmount(String value, int index) throws Throwable {
        WebElement lossAmount = driver.findElement(By.xpath("//div[text()='watercraft loss history']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[5]/div"));
        if (hasValue(value)) {
            clickElement(lossAmount, "Incident Loss Amount");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

}