package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class OperatorIncidentsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OperatorIncidentsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='incidents']/../../../../../..//span[text()='add']")
    WebElement addIncident;
    @FindBy(xpath = "//div[text()='incidents']")
    WebElement incidentsBlock;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[2]/div")
    List<WebElement> source;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[3]/div")
    List<WebElement> accidentOrViolation;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[4]/div")
    List<WebElement> incidentDate;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[1]/div")
    List<WebElement> incidentDriver;


    public void setIncidentDate(String value, int i) throws Throwable {
        clickElement(incidentDate.get(i));
        pause(1000);
        typeTextEnter(driver.switchTo().activeElement(), value, "Incident Date");
        clickFooter();
    }

    public void setAccidentOrViolation(String value, int i) throws Throwable {
        clickElement(accidentOrViolation.get(i));
        pause(1000);
        typeTextEnter(driver.switchTo().activeElement(), value, "Accident Or Violation");
        clickFooter();
    }

    public void setIncidentSource(String value, int i) throws Throwable {
        clickElement(source.get(i));
        pause(1000);
        typeTextEnter(driver.switchTo().activeElement(), value, "Incident Source");
        clickFooter();
    }

    public void clickAdd() throws Throwable {
        clickElement(addIncident, "Add Incident");
        pause(2000);
        clickFooter();
    }

    public void setIncidentDriver(String value, int i) throws Throwable {
        clickElement(source.get(i));
        pause(1000);
        typeTextEnter(driver.switchTo().activeElement(), value, "Incident Driver");
        clickFooter();
    }
}

