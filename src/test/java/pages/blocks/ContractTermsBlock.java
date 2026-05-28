package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ContractTermsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ContractTermsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Will the insured have a signed contract with the general contractor?']/../../../..//input")
    WebElement signedContractWithTheGeneralContractor;
    @FindBy(xpath = "//div[text()='Has the member waived their right of subrogation against the general contractor?']/../../../..//input")
    WebElement memberWaivedRightOfSubrogation;

    public void fillContractTermsDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("contract terms");
        setSignedContractWithTheGeneralContractor(data.get("Contract_Terms_Signed_Contract_With_The_General_Contractor"));
        setMemberWaivedRightOfSubrogation(data.get("Contract_Terms_Member_Waived_Right_Of_Subrogation"));
        saveChanges();
    }

    public void fillContractTermsDetailsCC_END(Map<String, String> data) throws Throwable {
        setSignedContractWithTheGeneralContractor(data.get("Contract_Terms_Signed_Contract_With_The_General_Contractor_END"));
        setMemberWaivedRightOfSubrogation(data.get("Contract_Terms_Member_Waived_Right_Of_Subrogation_END"));
        saveChanges();
    }

    public void setSignedContractWithTheGeneralContractor(String value) {
        typeTextEnter(signedContractWithTheGeneralContractor, value, "Signed Contract With The General Contractor");
    }

    public void setMemberWaivedRightOfSubrogation(String value) {
        typeTextEnter(memberWaivedRightOfSubrogation, value, "Member Waived Right Of Subrogation");
    }

}