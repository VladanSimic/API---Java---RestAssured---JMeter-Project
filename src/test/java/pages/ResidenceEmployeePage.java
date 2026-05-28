package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ResidenceEmployeePage extends CommonComponentsAndActions {
    WebDriver driver;

    public ResidenceEmployeePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Employee Description']")
    WebElement employeeDescriptionLabel;
    @FindBy(xpath = "//div[text()='How many residence employees are there?']/../../../..//input")
    WebElement howManyResidenceEmployees;
    @FindBy(xpath = "(//div[text()='Residence Employees']/../../../../../../../../../..//table)[2]//tr//td[1]//div")
    List<WebElement> employeeDescription;
    @FindBy(xpath = "(//div[text()='Residence Employees']/../../../../../../../../../..//table)[2]//tr//td[2]//div")
    List<WebElement> hoursPerWeek;
    @FindBy(xpath = "(//div[text()='Residence Employees']/../../../../../../../../../..//table)[2]//tr//td[3]//div//input[@type='radio'][1]")
    List<WebElement> inside;
    @FindBy(xpath = "(//div[text()='Residence Employees']/../../../../../../../../../..//table)[2]//tr//td[3]//div//input[@type='radio'][2]")
    List<WebElement> outside;
    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//span[text()='delete']")
    List<WebElement> delete;




    public void fillResidenceEmployeeDetails(Map<String, String> data) throws Throwable {
        if (goToPage("Residence Employees")) {
            setHowManyResidenceEmployees("1");
            if (hoursPerWeek.isEmpty()) {
                clickElement(add, "add");
                pause(1000);
                clickFooter();
            }
            if (getHowManyHoursPerWeek(0).equalsIgnoreCase("- Select -")) {
                setEmployeeDescription("Housekeeper", 0);
                setHoursPerWeek("Less than 10 hours", 0);
                setInsideOrOutside("Inside", 0);
                saveChanges();
            }
        }
    }

    public void fillResidenceEmployeeDetails_END(Map<String, String> data) {
        //TODO IMPLEMENT METHOD ??
    }

    public void fillResidenceEmployeeDetails_OOS_END(Map<String, String> data) {
//TODO IMPLEMENT METHOD ??
    }

    public void fillResidenceEmployeeDetails_RNW(Map<String, String> data) {
//TODO IMPLEMENT METHOD ??
    }

    public void fillResidenceEmployeeDetails(Map<String, String> data, int i) throws Throwable {
        //TODO IMPLEMENT METHOD ??
    }

    public void setHowManyResidenceEmployees(String num) throws Throwable {
        typeTextEnter(howManyResidenceEmployees, num, "How Many Residence Employees");
        clickFooter();
    }

    public String getHowManyHoursPerWeek(int index) {
        return hoursPerWeek.get(index).getText();
    }

    public void setHoursPerWeek(String value, int index) throws Throwable {
        clickElement(hoursPerWeek.get(index), "Hours Per Week");
        pause(600);
        typeTextEnter(driver.switchTo().activeElement(), value, "Hours Per Week");
        clickFooter();
    }

    public void setEmployeeDescription(String value, int index) throws Throwable {
        clickElement(employeeDescription.get(index), "Employee Description");
        pause(600);
        typeTextEnter(driver.switchTo().activeElement(), value, "Employee Description");
        clickFooter();
    }

    public void setInsideOrOutside(String value, int index) {
        if (value.equalsIgnoreCase("Inside"))
            clickElement(inside.get(index), "Inside");
        else if (value.equalsIgnoreCase("Outside"))
            clickElement(outside.get(index), "Outside");
    }



}
