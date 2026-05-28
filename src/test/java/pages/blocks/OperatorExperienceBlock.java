package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class OperatorExperienceBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OperatorExperienceBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Who is the primary operator of the vessel?']/../../../..//input")
    WebElement primaryOperatorOfTheVessel;
    @FindBy(xpath = "//div[text()='Does the primary operator of the vessel have at least 3 years experience owning & operating similar sized vessels?']/../../../..//input/../..//label[text()='No']/..//input")
    WebElement operatorHas3YrsExpYes;
    @FindBy(xpath = "//div[text()='Does the primary operator of the vessel have at least 3 years experience owning & operating similar sized vessels?']/../../../..//input/../..//label[text()='No']/..//input")
    WebElement operatorHas3YrsExpNo;

    public void fillOperatorExperienceComponent(Map<String, String> data) throws Throwable {
        setPrimaryOperatorOfTheVessel(data);
        setOperatorHas3YrsExp(data);
    }

    private void setOperatorHas3YrsExp(Map<String, String> data) throws Throwable {
        choose(operatorHas3YrsExpYes, operatorHas3YrsExpNo, data.get("Operator_Has3Yrs_Exp"));
    }

    private void setPrimaryOperatorOfTheVessel(Map<String, String> data) throws Throwable {
        typeText(primaryOperatorOfTheVessel, data.get("First_Name") + " " + data.get("Last_Name"));
    }
}