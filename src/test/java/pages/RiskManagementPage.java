package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.utils.CustomFileUtils;
import selenium.DriverManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RiskManagementPage extends CommonComponentsAndActions {
    WebDriver driver;

    public RiskManagementPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[text()='Inspection Details']/../../../../../..//tr)[2]//td[4]//div")
    List<WebElement> inspectionStatus;
    @FindBy(xpath = "(//div[text()='Inspection Details']/../../../../../..//tr)[2]//td[7]//div")
    List<WebElement> inspectionStatusNew;
    @FindBy(xpath = "//div[text()='Select Policy']/../../../../../../../../../../../..//input[@class=\"x-form-field x-form-text x-form-text-default   \"]")
    WebElement selectPolicyDropdown;
    @FindBy(xpath = "//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box\"]//li[@role=\"option\"]")
    List<WebElement> dropDownOptions;

    public void verifyInspectionStatus(String value, int index) throws InterruptedException {
        if (ENV.equalsIgnoreCase("AWS_QA")) {
            selectFirstDropdownOptionFromPolicy();
            if (value.equalsIgnoreCase("Scheduled"))
                value = "Not Scheduled";
            if (!inspectionStatusNew.get(index).getText().equalsIgnoreCase(value))
                failAssertion("Skedulo Inspection Status is incorrect. Expected: " + value + ", found: " + inspectionStatusNew.get(index).getText());
        } else {
            if (!inspectionStatus.get(index).getText().equalsIgnoreCase(value))
                failAssertion("Skedulo Inspection Status is incorrect. Expected: " + value + ", found: " + inspectionStatus.get(index).getText());
        }
    }

    public void selectFirstDropdownOptionFromPolicy() throws InterruptedException {
        clickElement(selectPolicyDropdown, "Clicked select Policy dropdown");
        pause(500);
        clickElement(dropDownOptions.get(1), "Clicked first valid dropdown option");
        pause(500);
    }


}
