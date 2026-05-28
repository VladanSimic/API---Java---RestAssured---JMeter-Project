package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class RMSOtherAALsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public RMSOtherAALsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='RMS other AALs']/../../../../../../..//table//tr[1]/td[2]//div[@aria-readonly='true']")
    WebElement nextHigherWindDeductible;
    @FindBy(xpath = "//div[text()='RMS other AALs']/../../../../../../..//table//tr[2]/td[2]//div[@aria-readonly='true']")
    WebElement nextHigherWindDeductible2;
    @FindBy(xpath = "//div[text()='RMS other AALs']/../../../../../../..//table//tr[3]/td[2]//div[@aria-readonly='true']")
    WebElement floodAAL;

    public void fillRMSOtherAALsCC(Map<String, String> data) {
        verifyNextHigherWindDeductible(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible"));
        verifyNextHigherWindDeductible_2(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_2"));
        verifyFloodAAL(data.get("RMS_Other_AALs_Flood_AAL"));
    }

    public void fillRMSOtherAALsCC_END(Map<String, String> data) {
        verifyNextHigherWindDeductible(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_END"));
        verifyNextHigherWindDeductible_2(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_2_END"));
        verifyFloodAAL(data.get("RMS_Other_AALs_Flood_AAL_END"));
    }

    public void verifyNextHigherWindDeductible(String value) {
        if (hasValue(value))
            assertEquals(nextHigherWindDeductible.getText(), value, "RMS Other AALs Next Higher Wind Deductible");
    }

    public void verifyNextHigherWindDeductible_2(String value) {
        if (hasValue(value))
            assertEquals(nextHigherWindDeductible2.getText(), value, "RMS Other AALs Next Higher Wind Deductible 2");
    }

    public void verifyFloodAAL(String value) {
        if (hasValue(value))
            assertEquals(floodAAL.getText(), value, "RMS Other AALs Flood AAL");
    }

    public void fillRMSOtherAALsHS(Map<String, String> data) throws Throwable {
        verifyNextHigherWindDeductible(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible"));
        verifyNextHigherWindDeductible_2(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_2"));
        verifyFloodAAL(data.get("RMS_Other_AALs_Flood_AAL"));
    }

    public void fillRMSOtherAALsHS_END(Map<String, String> data) {
        verifyNextHigherWindDeductible(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_END"));
        verifyNextHigherWindDeductible_2(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_2_END"));
        verifyFloodAAL(data.get("RMS_Other_AALs_Flood_AAL_END"));
    }

    public void fillRMSOtherAALsHS_OOS_END(Map<String, String> data) {
        verifyNextHigherWindDeductible(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_OOS_END"));
        verifyNextHigherWindDeductible_2(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_2_OOS_END"));
        verifyFloodAAL(data.get("RMS_Other_AALs_Flood_AAL_OOS_END"));
    }

    public void fillRMSOtherAALsHS_RNW(Map<String, String> data) {
        verifyNextHigherWindDeductible(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_RNW"));
        verifyNextHigherWindDeductible_2(data.get("RMS_Other_AALs_Next_Higher_Wind_Deductible_2_RNW"));
        verifyFloodAAL(data.get("RMS_Other_AALs_Flood_AAL_RNW"));
    }

}