package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.HomeUnderlyingPolicyBlock;
import pages.blocks.OptionalCoveragesExclusionsESBlock;
import pages.utils.CommonComponentsAndActions;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Map;

public class CoverageInformationPage extends CommonComponentsAndActions {
    WebDriver driver;

    OptionalCoveragesExclusionsESBlock optionalCoveragesExclusionsESBlock;
    HomeUnderlyingPolicyBlock homeUnderlyingPolicyBlock;

    public CoverageInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        optionalCoveragesExclusionsESBlock = new OptionalCoveragesExclusionsESBlock(driver);
        homeUnderlyingPolicyBlock = new HomeUnderlyingPolicyBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Coinsurance Clause')]/../../../..//label[text()='Yes']/..//input")
    WebElement equineLiabilityCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Coinsurance Clause')]/../../../..//label[text()='No']/..//input")
    WebElement equineLiabilityCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Does the member have excess policy')]/../../../..//label[text()='Yes']/..//input")
    WebElement doesTheMemberHaveExcessPolicyYes;
    @FindBy(xpath = "//div[contains(text(),'Does the member have excess policy')]/../../../..//label[text()='No']/..//input")
    WebElement doesTheMemberHaveExcessPolicyNo;

    public void fillOutCoverageInformationPage(Map<String, String> data) throws Throwable {
        goToPage("Coverage Information");
        verifyCoverageInformationPageBlocks();
        homeUnderlyingPolicyBlock.fillHomeUnderlyingPolicyBlock(data);
        setDoesTheMemberHaveExcessPolicy(data.get("Excess_Underlying_Policies_Does_The_Member_Have_Excess_Policy"));
        setEquineLiabilityCoverage(data.get("Optional_Coverages_Exclusions_Equine_Liability_Coverage"));
        optionalCoveragesExclusionsESBlock.fillOptionalCoveragesExclusionsESBlock(data);
    }

    public void setDoesTheMemberHaveExcessPolicy(String value) throws Throwable {
        choose(doesTheMemberHaveExcessPolicyYes,doesTheMemberHaveExcessPolicyNo,value);
    }

    public void setEquineLiabilityCoverage(String value) throws Throwable {
        choose(equineLiabilityCoverageYes,equineLiabilityCoverageNo, value);
    }

    public void verifyCoverageInformationPageBlocks() throws Throwable {
        verifyBlockExists("home underlying policy");
        verifyBlockExists("excess underlying policies");
        verifyBlockExists("optional coverages/exclusions");
    }
}
