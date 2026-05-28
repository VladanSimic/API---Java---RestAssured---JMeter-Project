package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.LocationCoveragePage;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class LocationDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public LocationDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Manager BCEG override']/../../../../div/..//input")
    WebElement managerDTCOverride;
    @FindBy(xpath = "//div[text()='Manager PPC override']/../../../..//input")
    WebElement managerPPCOverride;
    @FindBy(xpath = "//div[text()='Extreme 10 Protection Class']/../../../..//input")
    WebElement extremeProtectionClassOverride;
    @FindBy(xpath = "//div[text()='County']/../../../../div/div[@role='textbox']")
    WebElement county;
    @FindBy(xpath = "//div[text()='Protection Class']/../../../..//input[contains(@aria-hidden,'false')]")
    WebElement protectionClass;
    @FindBy(xpath = "//div[text()='Protection Class Override']/../../../..//input[contains(@aria-hidden,'false')]")
    WebElement protectionClassOverride;
    @FindBy(xpath = "//div[text()='Distance to Coast override']/../../../..//input[contains(@aria-hidden,'false')]")
    WebElement distanceToCoastOverride;
    @FindBy(xpath = "(//div[text()='Distance to Coast']/../../../../div/div)[1]")
    WebElement distanceToCoast;
    @FindBy(xpath = "(//div[text()='Distance to Coast'])[1]/../../../../div/div")
    WebElement distanceToCoastReadOnly;
    @FindBy(xpath = "//div[text()='ZIP']/../../../../div//input")
    WebElement zip;
    @FindBy(xpath = "//div[text()='Risk Address 1']/../../../../div//input")
    WebElement riskAddress1;
    @FindBy(xpath = "//div[text()='Risk Address 2']/../../../../div//input")
    WebElement riskAddress2;
    @FindBy(xpath = "//div[text()='City']/../../../../div//input")
    WebElement city;
    @FindBy(xpath = "(//div[text()='State']/../../../../div//input)[1]")
    WebElement state;

    public void fillLocationDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("location details");
        setProtectionClass(data.get("Location_Details_Protection_Class"));
        checkExtremeProtectionClassOverride(data.get("Location_Details_Extreme_10_Protection_Class"));
        verifyCounty(data.get("Location_Details_County"));
        checkManagerPPCOverride(data.get("Location_Details_Manager_PPC_Override"), data.get("User_Role"));
        checkManagerDTCOverride(data.get("Location_Details_Manager_DTC_Override"), data.get("User_Role"));
        setProtectionClassOverride(data.get("Location_Details_Protection_Class_Override"));
        verifyDistanceToCoast(data.get("Location_Details_Distance_To_Coast"));
        setDistanceToCoastOverride(data.get("Location_Details_Distance_To_Coast_Override"));
    }

    private void verifyDistanceToCoast(String s) {
        if (hasValue(s))
            assertEquals(distanceToCoast.getText(), s, "Distance to Coast");
    }

    public void fillLocationDetailsCC_END(Map<String, String> data) throws Throwable {
        setProtectionClass(data.get("Location_Details_Protection_Class_END"));
        checkExtremeProtectionClassOverride(data.get("Location_Details_Extreme_10_Protection_Class_END"));
        verifyCounty(data.get("Location_Details_County_END"));
        checkManagerPPCOverride(data.get("Location_Details_Manager_PPC_Override_END"));
        checkManagerDTCOverride(data.get("Location_Details_Manager_DTC_Override_END"));
        setProtectionClassOverride(data.get("Location_Details_Protection_Class_Override_END"));
        verifyDistanceToCoast(data.get("Location_Details_Distance_To_Coast_END"));
        setDistanceToCoastOverride(data.get("Location_Details_Distance_To_Coast_Override_END"));
        saveChanges();
    }

    public void setProtectionClassOverride(String value) {
        typeTextEnter(protectionClassOverride, value, "Protection Class Override");
    }

    public void setDistanceToCoastOverride(String value) throws InterruptedException {
        pause(2000);
        typeTextEnter(distanceToCoastOverride, value, "Distance to Coast Override");
    }

    public void verifyCounty(String value) {
        assertEquals(county.getText(), value, "County");
    }

    public void checkManagerDTCOverride(String value) throws Throwable {
        checkCheckbox(managerDTCOverride, value, "Manager DTC Override");
        pause(3000);
    }

    public void checkManagerDTCOverride(String value, String userRole) throws Throwable {
        if (hasValue(userRole)) {
            if (!userRole.equalsIgnoreCase("Analyst")) {
                checkCheckbox(managerDTCOverride, value, "Manager DTC Override");
                pause(3000);
            }
        } else {
            checkCheckbox(managerDTCOverride, value, "Manager DTC Override");
            pause(3000);
        }
    }

    public void checkManagerPPCOverride(String value, String userRole) throws Throwable {
        if (hasValue(userRole)) {
            if (!userRole.equalsIgnoreCase("Analyst")) {
                checkCheckbox(managerPPCOverride, value, "Manager PPC Override");
                pause(3000);
            }
        } else {
            checkCheckbox(managerPPCOverride, value, "Manager PPC Override");
            pause(3000);
        }
    }

    public void checkManagerPPCOverride(String value) throws Throwable {
        checkCheckbox(managerPPCOverride, value, "Manager PPC Override");
        pause(3000);
    }

    public void checkExtremeProtectionClassOverride(String value) throws Throwable {
        checkCheckbox(extremeProtectionClassOverride, value, "Extreme 10 Protection Override");
        pause(3000);
    }

    public void setProtectionClass(String protectionClassValue) throws Throwable {
        if (!hasValue(protectionClassValue)) {
            clickElement(protectionClass, "Protection class");
            pause(3000);
            try {
                clickElement(driver.findElements(By.xpath("//li[@role=\"option\"]")).get(1), "First option under protection class");
                pause(3000);
            } catch (Exception e) {
                protectionClass.sendKeys(Keys.ARROW_DOWN);
                protectionClass.sendKeys(Keys.ENTER);
                pause(3000);
            }
        } else {
            typeText(protectionClass, protectionClassValue, "Protection class");
            pause(3000);
        }

        pause(5000);

        if (hasValue(protectionClass.getAttribute("value")) && !protectionClass.getAttribute("value").contains("Select")) {
            //Do nothing
        } else {
            try {
                clickElement(driver.findElements(By.xpath("//li[@role=\"option\"]")).get(1), "First option under protection class");
                pause(3000);
            } catch (Exception e) {
                protectionClass.sendKeys(Keys.ARROW_DOWN);
                protectionClass.sendKeys(Keys.ENTER);
                pause(3000);
            }
        }
        saveChanges();
    }

    public void verifyDistanceToCoastOverride(String distanceToCoast) {
        reportScreenshot("Distance to coast", "Distance to coast");
        assertEquals(distanceToCoastOverride.getAttribute("value"), distanceToCoast, "Distance to coast override");
    }

    public void verifyDistanceToCoastReadOnly(String dtc) {
        if (dtc.equalsIgnoreCase("NotEmpty")) {
            Assert.assertTrue(hasValue(distanceToCoastReadOnly.getText()));
        } else {
            //TODO
        }
    }

    public void verifyProtectionClassDropdownValue(String value) {
        assertCellValue(protectionClass, value, "Protection class");
    }

    public void verifyProtectionClassReadOnlyValue(String value) {
        assertCellValue(protectionClassOverride, value, "Protection class override");
    }

    public boolean verifyIfReportFailed() {
        scrollToWebElement(zip);
        return driver.findElements(By.xpath("//*[contains(text(),'One or more reports were not received')]")).size() != 0;
    }

    public boolean verifyIfSuccessfulReports() {
        return driver.findElements(By.xpath("//*[contains(text(),'All reports were successfully received')]")).size() != 0;
    }

    public void fillLocationDetailsHS(Map<String, String> data) throws Throwable {
        clickFooter();
        verifyBlockExists("location details");
        setRiskAddress1(data.get("Location_Details_Risk_Address_1"));
        setRiskAddress2(data.get("Location_Details_Risk_Address_2"));
        setCity(data.get("Location_Details_City"));
        setState(data.get("Location_Details_State"));
        setZip(data.get("Location_Details_Zip"));
    }

    public void setRiskAddress1(String value) throws InterruptedException {
        typeTextEnter(riskAddress1, value, "RiskAddress1");
    }

    public void setCity(String value) throws InterruptedException {
        typeTextEnter(city, value, "City");
    }

    public void setState(String value) throws InterruptedException {
        typeTextEnter(state, value, "State");
    }

    public void setRiskAddress2(String value) throws InterruptedException {
        typeTextEnter(riskAddress2, value, "RiskAddress2");
    }

    public void setZip(String value) throws InterruptedException {
        typeTextEnter(zip, value, "State");
    }

    public void fillLocationDetailsHS_END(Map<String, String> data) throws Throwable {
        clickFooter();
        verifyBlockExists("location details");
        setRiskAddress1(data.get("Location_Details_Risk_Address_1_END"));
        setRiskAddress2(data.get("Location_Details_Risk_Address_2_END"));
        setCity(data.get("Location_Details_City_END"));
        setState(data.get("Location_Details_State_END"));
        setZip(data.get("Location_Details_Zip_END"));

        if (hasValue(data.get("Location_Details_Risk_Address_1_END"))) {
            orderPropertyDetails();
        }
    }

    public void fillLocationDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        clickFooter();
        verifyBlockExists("locationdetails");
        setRiskAddress1(data.get("Location_Details_Risk_Address_1_OOS_END"));
        setRiskAddress2(data.get("Location_Details_Risk_Address_2_OOS_END"));
        setCity(data.get("Location_Details_City_OOS_END"));
        setState(data.get("Location_Details_State_OOS_END"));
        setZip(data.get("Location_Details_Zip_OOS_END"));
    }

    public void fillLocationDetailsHS_RNW(Map<String, String> data) throws Throwable {
        clickFooter();
        verifyBlockExists("locationdetails");
        setRiskAddress1(data.get("Location_Details_Risk_Address_1_RNW"));
        setRiskAddress2(data.get("Location_Details_Risk_Address_2_RNW"));
        setCity(data.get("Location_Details_City_RNW"));
        setState(data.get("Location_Details_State_RNW"));
        setZip(data.get("Location_Details_Zip_RNW"));
    }

    public void fillLocationDetailsFS(Map<String, String> data) {

    }
}