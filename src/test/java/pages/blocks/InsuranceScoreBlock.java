package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class InsuranceScoreBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public InsuranceScoreBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Member']/../../../..//input")
    WebElement member;
    @FindBy(xpath = "//div[text()='Insurance Score Model']/../../../..//input")
    WebElement insuranceScoreModel;
    @FindBy(xpath = "//div[text()='Insurance Score']/../../../..//input")
    WebElement insuranceScore;
    @FindBy(xpath = "//*[text()='Comments']/..//..//..//..//div//textarea")
    WebElement comments;

    public void setInsuranceScore(Map<String, String> data, String score) throws Throwable {
        setMember(data.get("First_Name"));
        setInsuranceScoreModel(data.get("State"), data.get("Admitted_Line"));
        setScore(score);
        setComment("comment");
        clickFooter();
        saveChanges();
    }

    public void setMember(String firstName) {
        typeTextEnter(member, firstName, "Member");
    }

    public void setScore(String score) {
        if (hasValue(score)) {
            typeText(insuranceScore, score, "Insurance Score");
        } else {
            typeText(insuranceScore, "600", "Insurance Score - {Entering default value}");
        }
    }

    public void setComment(String value) {
        typeTextEnter(comments, value, "Comments");
    }

    public void setInsuranceScoreModel(String state, String lob) throws Throwable {
        if (lob.equalsIgnoreCase("Homeowner")) {
            typeTextEnter(insuranceScoreModel, "Attract One - " + state, "Insurance Score Model");
            clickFooter();
            if (!insuranceScoreModel.getAttribute("value").equalsIgnoreCase("Attract One - " + state))
                typeTextEnter(insuranceScoreModel, "Attract One - CW", "Insurance Score Model");
        }else if(lob.equalsIgnoreCase("Personal Auto")) {
            typeTextEnter(insuranceScoreModel, "Attract One - " + state, "Insurance Score Model");
            clickFooter();
            if (!insuranceScoreModel.getAttribute("value").equalsIgnoreCase("Attract One - " + state))
                typeTextEnter(insuranceScoreModel, "Attract One - CW", "Insurance Score Model");
        }
        else if(lob.equalsIgnoreCase("Excess Liability")) {
            typeTextEnter(insuranceScoreModel, "Attract One - " + state, "Insurance Score Model");
            clickFooter();
            if (!insuranceScoreModel.getAttribute("value").equalsIgnoreCase("Attract One - " + state))
                typeTextEnter(insuranceScoreModel, "Attract One - CW", "Insurance Score Model");
        }
    }

}
