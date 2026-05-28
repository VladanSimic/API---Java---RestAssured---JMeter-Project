package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ProjectAddressBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ProjectAddressBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Risk Address 1']/../../../../div//input")
    WebElement riskAddress1;
    @FindBy(xpath = "//div[text()='Risk Address 2']/../../../../div//input")
    WebElement riskAddress2;
    @FindBy(xpath = "//div[text()='City']/../../../../div//input")
    WebElement city;
    @FindBy(xpath = "//div[text()='State']/../../../../div//input")
    WebElement state;
    @FindBy(xpath = "//div[text()='ZIP']/../../../../div//input")
    WebElement zip;
    @FindBy(xpath = "//div[text()='project address']")
    WebElement projectAddressBlock;

    public void fillProjectAddressCC(Map<String, String> data) throws Throwable {
        riskAddress1(data.get("Project_Address_Risk_Address_1"));
        riskAddress2(data.get("Project_Address_Risk_Address_2"));
        city(data.get("Project_Address_City"));
        verifyState(data.get("Project_Address_State"));
        pause(500);
        zip(data.get("Project_Address_ZIP"));
        verifyBlockExists("project address");
        saveChanges();
    }

    private void verifyState(String project_address_state) {
        assertCellValue(state, project_address_state, "State");
    }

    public void fillProjectAddressCC_END(Map<String, String> data) throws Throwable {
        riskAddress1(data.get("Project_Address_Risk_Address_1_END"));
        riskAddress2(data.get("Project_Address_Risk_Address_2_END"));
        city(data.get("Project_Address_City_END"));
        verifyState(data.get("Project_Address_State_END"));
        zip(data.get("Project_Address_ZIP_END"));
        saveChanges();
    }

    public void riskAddress1(String value) throws Throwable {
        typeText(riskAddress1, value, "Risk address 1");
    }

    public void riskAddress2(String value) throws Throwable {
        typeText(riskAddress2, value, "Risk address 2");
    }

    public void city(String value) throws Throwable {
        typeTextEnter(city, value, "City");
        clickProjectAddressBlock();
        pause(3000);
    }

    public void state(String value) throws Throwable {
        typeText(state, value, "State");
        pause(3000);
    }

    public void zip(String value) throws Throwable {
//        if (!hasValue(zip.getAttribute("value"))) {
            pause(3000);
            typeTextEnter(zip, value, "ZIP");
            clickProjectAddressBlock();
            pause(3000);
//        }
    }

    private void clickProjectAddressBlock() {
        clickElement(projectAddressBlock, "Project Address Block");
    }

}