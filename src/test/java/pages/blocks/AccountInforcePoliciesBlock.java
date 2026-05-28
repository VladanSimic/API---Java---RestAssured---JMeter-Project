package pages.blocks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;
import pages.utils.SoftAssertion;

import java.util.List;

public class AccountInforcePoliciesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AccountInforcePoliciesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[text()='account inforce policies']/../../../../../../..//table)[2]//td[4]//div")
    WebElement riskGrade;
    @FindBy(xpath = "//div[contains(text(),'Home Model V3')]/../../../../../..//td[6]//div")
    WebElement homeModelV3RiskGrade;

    public String getRiskGrade() {
        return riskGrade.getText();
    }

    public String getHomeModelV3RiskGrade() {
        return homeModelV3RiskGrade.getText();
    }

    public void verifyRiskGrade(String value) {
        if (!value.equalsIgnoreCase(getRiskGrade()))
            failAssertion("Account Summary Grade does not match! Expected " + value + ", but returned " + getRiskGrade());
        else
            successLog("Account Grade summary is matching expected value");
    }

    public void verifyHomeModelV3RiskGrade(String value) {
        if (!value.equalsIgnoreCase(getHomeModelV3RiskGrade()))
            failAssertion("Account Summary v3 Grade does not match! Expected " + value + ", but returned " + getHomeModelV3RiskGrade());
        else
            successLog("Account v3 Grade summary is matching expected value");
    }

}