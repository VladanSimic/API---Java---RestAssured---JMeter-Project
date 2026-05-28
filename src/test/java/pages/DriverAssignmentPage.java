package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class DriverAssignmentPage extends CommonComponentsAndActions {
    WebDriver driver;

    public DriverAssignmentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//td[2]//div")
    List<WebElement> vehicleRows;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//td[1]//div")
    List<WebElement> driverRows;

    public void fillDriverAssignmentPagePA(Map<String, String> data) throws Throwable {
        if (goToPage("Driver Assignment")) {
            pause(5000);
            verifyBlockExists("driver");
            verifyBlockExists("xxx-driver Violations");

            int i = 0;
            while (i < driverRows.size()) {
                clickFooter();
                clickElement(vehicleRows.get(i));
                pause(500);
                driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
                pause(500);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
                pause(5000);

                driverRows = getUpdatedDriverRows();
                pause(1000);
                i++;
            }
        }
    }

    public List<WebElement> getUpdatedDriverRows() {
        return driver.findElements(By.xpath("//span[text()='Vehicle']/../../../../../../../../..//td[1]//div"));
    }

    public void fillDriverAssignmentPagePA_END(Map<String, String> data) throws Throwable {
        if (goToPage("Driver Assignment")) {
            pause(5000);
            verifyBlockExists("driver");
            verifyBlockExists("xxx-driver Violations");

            int i = 0;
            while (i < driverRows.size()) {
                clickFooter();
                clickElement(vehicleRows.get(i));
                pause(500);
                driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
                pause(500);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
                pause(5000);

                driverRows = getUpdatedDriverRows();
                i++;
            }
        }
    }

    public void assignDrivers(Map<String, String> data) throws Throwable {
        goToPage("Driver Assignment");
        pause(3000);

        for (int y = 0; y < vehicleRows.size(); y++) {
            clickFooter();
            pause(2500);
            //Used to avoid staleElement
            vehicleRows = driver.findElements(By.xpath("//span[text()='Vehicle']/../../../../../../../../..//td[2]//div"));
            clickFooter();
            clickElement(vehicleRows.get(y), "Vehicle");
            for (int i = 0; i < data.get("Additional_Vehicles").split(",").length; i++) {
                if (data.get("Vehicle_Details_Vehicle_Type_" + (i + 1)).equalsIgnoreCase("Private Passenger")) {
                    pause(2000);
                    driver.findElement(By.xpath("//li[text()='" + data.get("Vehicle_Details_Year_" + (i + 1)) + " " + data.get("Vehicle_Details_Make_" + (i + 1)) + " " + data.get("Vehicle_Details_Model_" + (i + 1)) + "']")).click();
                }
                saveChanges();
                pause(2000);
            }
        }
        //TODO PA END - Driver assignment - Mid
    }

    public void fillDriverAssignmentPagePA_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Driver Assignment")) {
            pause(5000);
            for (int i = 0; i < data.get("Additional_Vehicles_OOS_END").split(",").length; i++) {
                if (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + (i + 1)).equalsIgnoreCase("Private Passenger")) {
                    pause(3000);
                    driver.findElement(By.xpath("//li[text()='" + data.get("Vehicle_Details_Year_OOS_END_" + (i + 1)) + " " + data.get("Vehicle_Details_Make_OOS_END_" + (i + 1)) + " " + data.get("Vehicle_Details_Model_OOS_END_" + (i + 1)) + "']")).click();
                    saveChanges();
                    pause(2000);
                }
            }
        }
        //TODO PA OOS - Driver assignment - Mid
    }

    public void fillDriverAssignmentPagePA_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Driver Assignment")) {
            pause(5000);
            int i = 0;
            while (i < driverRows.size()) {
                clickFooter();
                clickElement(vehicleRows.get(i));
                pause(500);
                driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
                pause(500);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
                pause(5000);

                driverRows = getUpdatedDriverRows();
                i++;
            }
        }
    }

    public void assignDrivers_END(Map<String, String> data) throws Throwable {
        //todo add nb vehicles
        goToPage("Driver Assignment");
        pause(2000);

        for (int y = 0; y < vehicleRows.size(); y++) {
            clickFooter();
            pause(2500);
            //Used to avoid staleElement
            vehicleRows = driver.findElements(By.xpath("//div[contains(text(),'driver') and not(contains(text(),'xxx-driver'))]/../../../../../..//table//tr/td[2]/div"));
            clickElement(vehicleRows.get(y));
            for (int i = 0; i < data.get("Additional_Vehicles").split(",").length; i++) {
                pause(2000);
                driver.findElement(By.xpath("//li[text()='" + data.get("Vehicle_Year_" + (i + 1)) + " " + data.get("Vehicle_Make_" + (i + 1)) + " " + data.get("Vehicle_Model_" + (i + 1)) + "']")).click();
                saveChanges();
                pause(2000);
            }
        }
        //TODO PA RNW - Driver assignment - Mid
    }
}
