package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperatorsAndVehiclePage extends CommonComponentsAndActions {
    WebDriver driver;

    OperatorsObtainedThroughOnlineReportsBlock operatorsObtainedThroughOnlineReportsBlock;
    AdditionalOperatorsBlock additionalOperatorsBlock;
    VehiclesObtainedThroughOnlineReportsBlock vehiclesObtainedThroughOnlineReportsBlock;
    AdditionalVehiclesBlock additionalVehiclesBlock;
    DriverStatusBlock driverStatusBlock;


    public OperatorsAndVehiclePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        operatorsObtainedThroughOnlineReportsBlock = new OperatorsObtainedThroughOnlineReportsBlock(driver);
        additionalOperatorsBlock = new AdditionalOperatorsBlock(driver);
        vehiclesObtainedThroughOnlineReportsBlock = new VehiclesObtainedThroughOnlineReportsBlock(driver);
        additionalVehiclesBlock = new AdditionalVehiclesBlock(driver);
        driverStatusBlock = new DriverStatusBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public Map<String, String> fillOperatorsAndVehiclesPagePA(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("HI")) {
            new CommonComponentsAndActions(driver).clickPlusInTree();
        }

        goToPage("Operators & Vehicles");

        pause(3000);

        additionalVehiclesBlock.fillAdditionalVehiclesDetailsPA(data);
        additionalOperatorsBlock.fillAdditionalOperatorsDetailsPA(data);

        data.putAll(getObtainedOperatorsAndVehiclesData());

        setObtainedVehiclesTrimLevel();
        setObtainedDriversData(data);
        saveChanges();

        return data;
    }

    private void setObtainedDriversData(Map<String, String> data) throws Throwable {
        for (int i = 0; i < Integer.parseInt(data.get("Obtained_Operators_Num")); i++) {
            operatorsObtainedThroughOnlineReportsBlock.setOperatorDOB("07/20/1991", i);
            operatorsObtainedThroughOnlineReportsBlock.setOperatorStatus("Active", data.get("State"), i);
            operatorsObtainedThroughOnlineReportsBlock.setOperatorGender("Male", i);
            operatorsObtainedThroughOnlineReportsBlock.setOperatorLicenseState("AK", i);
            operatorsObtainedThroughOnlineReportsBlock.setOperatorLicenseNumber("12312" + i, i);
            operatorsObtainedThroughOnlineReportsBlock.setRelationshipToInsured("Cousin", i);
        }
    }

    public void fillOperatorsAndVehiclePagePA_END(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("HI")) {
            new CommonComponentsAndActions(driver).clickPlusInTree();
        }

        goToPage("Operators & Vehicles");
        pause(3000);

        additionalVehiclesBlock.fillAdditionalVehiclesDetailsPA_END(data);
        additionalOperatorsBlock.fillAdditionalOperatorsDetailsPA_END(data);
        saveChanges();
    }

    public void fillOperatorsAndVehiclePagePA_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("HI")) {
            new CommonComponentsAndActions(driver).clickPlusInTree();
        }

        goToPage("Operators & Vehicles");
        pause(3000);

        additionalVehiclesBlock.fillAdditionalVehiclesDetailsPA_OOS_END(data);
        additionalOperatorsBlock.fillAdditionalOperatorsDetailsPA_OOS_END(data);
        saveChanges();
    }

    public void fillOperatorsAndVehiclePagePA_RNW(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("HI")) {
            new CommonComponentsAndActions(driver).clickPlusInTree();
        }

        goToPage("Operators & Vehicles");
        pause(3000);

        additionalVehiclesBlock.fillAdditionalVehiclesDetailsPA_RNW(data);
        additionalOperatorsBlock.fillAdditionalOperatorsDetailsPA_RNW(data);
        saveChanges();
    }

    public Map<String, String> getObtainedOperatorsAndVehiclesData() {
        Map<String, String> data = new HashMap<>();
        data.putAll(operatorsObtainedThroughOnlineReportsBlock.getOperatorData());
        data.putAll(vehiclesObtainedThroughOnlineReportsBlock.getVehicleData());
        return data;
    }

    public void setObtainedVehiclesTrimLevel() throws Throwable {
        List<WebElement> trims = driver.findElements(By.xpath("//div[contains(text(),'vehicles obtained')]/../../../../../..//*[contains(@class,'yellowMandatory')]/div"));
        for (WebElement trim : trims) {
            driver.findElement(By.xpath("//div[contains(text(),'vehicles obtained')]")).click();
            pause(3000);
            try {
                clickElementWithOffset(trim, 30, 30);
                pause(3000);
                driver.switchTo().activeElement().sendKeys(Keys.DOWN);
                driver.switchTo().activeElement().sendKeys(Keys.DOWN);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            } catch (Exception e) {
                //
            }
        }
        saveChanges();
    }

    public void setObtainedVehiclesTrimLevel_END() throws Throwable {
        List<WebElement> trims = driver.findElements(By.xpath("//div[contains(text(),'vehicles obtained')]/../../../../../..//*[contains(@class,'yellowMandatory')]/div"));
        for (int i = 0; i < trims.size(); i++) {
            driver.findElement(By.xpath("//div[contains(text(),'vehicles obtained')]")).click();
            pause(3000);
            trims.get(i).click();
            pause(3000);
            driver.switchTo().activeElement().sendKeys(Keys.DOWN);
            driver.switchTo().activeElement().sendKeys(Keys.DOWN);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        }
        saveChanges();
    }

}
