package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class OptionalToQuoteRequiredToBindBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OptionalToQuoteRequiredToBindBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()=\"Driver's Occupation\"]/../../../..//input")
    List<WebElement> driverOccupation;
    @FindBy(xpath = "//div[text()=\"Occupation\"]/../../../..//input")
    WebElement occupation;

    public void fillOptionalToQuoteRequiredToBindDriverDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("(optional to quote, required to bind)");
        setDriversOccupation(data.get("Optional_To_Quote_Required_To_Bind_Driver_Occupation"));
    }

    public void fillOptionalToQuoteRequiredToBindDriverDetailsPA_END(Map<String, String> data) throws Throwable {
        setDriversOccupation(data.get("Optional_To_Quote_Required_To_Bind_Driver_Occupation_END"));
    }

    public void fillOptionalToQuoteRequiredToBindDriverDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        setDriversOccupation(data.get("Optional_To_Quote_Required_To_Bind_Driver_Occupation_OOS_END"));
    }

    public void fillOptionalToQuoteRequiredToBindDriverDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setDriversOccupation(data.get("Optional_To_Quote_Required_To_Bind_Driver_Occupation_RNW"));
    }

    public void fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA(Map<String, String> data, int i) throws Throwable {
        setDriversOccupation(data.get("Optional_To_Quote_Required_To_Bind_Additional_Driver_Driver_Occupation_" + i));
    }

    public void fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA_END(Map<String, String> data, int i) throws Throwable {
        setDriversOccupation(data.get("Optional_To_Quote_Required_To_Bind_Additional_Driver_Driver_Occupation_END_" + i));
    }

    public void fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA_OOS_END(Map<String, String> data, int i) throws Throwable {
        setDriversOccupation(data.get("Optional_To_Quote_Required_To_Bind_Additional_Driver_Driver_Occupation_OOS_END_" + i));
    }

    public void fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA_RNW(Map<String, String> data, int i) throws Throwable {
        setDriversOccupation(data.get("Optional_To_Quote_Required_To_Bind_Additional_Driver_Driver_Occupation_RNW_" + i));
    }

    public void setDriversOccupation(String value) throws Throwable {
        if (elementExists(driverOccupation)) {
            typeText(driverOccupation.get(0), value);
        } else {
            typeText(occupation, value);
        }
    }

}