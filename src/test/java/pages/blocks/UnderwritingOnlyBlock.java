package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class UnderwritingOnlyBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public UnderwritingOnlyBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Is the general contractor approved?']/../../../..//input")
    WebElement isTheGeneralContractorApproved;
    @FindBy(xpath = "//div[text()='Comments']/../../../..//textarea")
    WebElement comments;
    @FindBy(xpath = "//div[text()='GC Project Size Authority']/../../../..//input")
    WebElement gcProjectSizeAuthority;
    @FindBy(xpath = "//div[text()='PURE Preferred Contractor']/../../../..//input")
    WebElement purePreferredContractor;

    public void fillUnderwritingOnlyDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("underwriting only");
        setIsTheGeneralContractorApproved(data.get("Underwriting_Only_Is_The_General_Contractor_Approved"));
        setComments(data.get("Underwriting_Only_Comments"));
        setGCProjectSizeAuthority(data.get("Underwriting_Only_GC_Project_Size_Authority"));
        setPUREPreferredContractor(data.get("Underwriting_Only_PURE_Preferred_Contractor"));
        saveChanges();
    }

    public void fillUnderwritingOnlyDetailsCC_END(Map<String, String> data) throws Throwable {
        setIsTheGeneralContractorApproved(data.get("Underwriting_Only_Is_The_General_Contractor_Approved_END"));
        setComments(data.get("Underwriting_Only_Comments_END"));
        setGCProjectSizeAuthority(data.get("Underwriting_Only_GC_Project_Size_Authority_END"));
        setPUREPreferredContractor(data.get("Underwriting_Only_PURE_Preferred_Contractor_END"));
        saveChanges();
    }

    public void setIsTheGeneralContractorApproved(String value) {
        typeTextEnter(isTheGeneralContractorApproved, value, "Is The General Contractor Approved");
    }

    public void setComments(String value) {
        typeText(comments, value, "Comments");
    }

    public void setGCProjectSizeAuthority(String value) {
        typeTextEnter(gcProjectSizeAuthority, value, "GC Project Size Authority");
    }

    public void setPUREPreferredContractor(String value) {
        typeTextEnter(purePreferredContractor, value, "PURE Preferred Contractor");
    }

}