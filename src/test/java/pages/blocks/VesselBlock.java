package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class VesselBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public VesselBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Hull and Machinery Limit - Agreed Value']/../../../..//input")
    WebElement hullAndMachineryLimitAgreedValue;
    @FindBy(xpath = "//div[text()='AOP Deductible']/../../../..//input")
    WebElement aopDeductible;

    public void fillVesselDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("vessel");
        setHullAndMachineryLimitAgreedValue(data.get("Hull_And_Machinery_Limit_Agreed_Value"));
    }

    public void setHullAndMachineryLimitAgreedValue(String value) throws Throwable {
        typeText(hullAndMachineryLimitAgreedValue, value);
    }

    public void setAOPDeductible(String aop_deductible) throws Throwable {
        typeText(aopDeductible, aop_deductible);
    }
}



