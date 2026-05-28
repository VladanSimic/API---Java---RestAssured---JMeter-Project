package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class AccountLevelCharacteristicsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public AccountLevelCharacteristicsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Non-CAT')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement nonCATYes;
    @FindBy(xpath = "//div[contains(text(),'Non-CAT')]/../../../../div//label[text()='No']/../span/input")
    WebElement nonCATNo;
    @FindBy(xpath = "//div[contains(text(),'2 or more properties')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement twoOrMorePropertiesYes;
    @FindBy(xpath = "//div[contains(text(),'2 or more properties')]/../../../../div//label[text()='No']/../span/input")
    WebElement twoOrMorePropertiesNo;
    @FindBy(xpath = "//div[text()='Number of Non-CAT losses (internal only)']/../../../..//input")
    WebElement numberOfNonCATLosses;

    public void fillAccountLevelCharacteristicsDetailsPA(Map<String, String> data) throws Throwable {
        if (!data.get("State").equalsIgnoreCase("AK") &&
                !data.get("State").equalsIgnoreCase("MT") &&
                !data.get("State").equalsIgnoreCase("NH") &&
                !data.get("State").equalsIgnoreCase("NV") &&
                !data.get("State").equalsIgnoreCase("OR") &&
                !data.get("State").equalsIgnoreCase("PA") &&
                !data.get("State").equalsIgnoreCase("SD") &&
                !data.get("State").equalsIgnoreCase("VT") &&
                !data.get("State").equalsIgnoreCase("WA") &&
                !data.get("State").equalsIgnoreCase("WV") &&
                !data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("DE") &&
                !data.get("State").equalsIgnoreCase("HI") &&
                !data.get("State").equalsIgnoreCase("MD") &&
                !data.get("State").equalsIgnoreCase("ME") &&
                !data.get("State").equalsIgnoreCase("NC") &&
                !data.get("State").equalsIgnoreCase("NY") &&
                !data.get("State").equalsIgnoreCase("ND")) {
            verifyBlockExists("account level characteristics");
            setNonCAT(data.get("Account_Level_Characteristics_Have_You_Had_A_Non_CAT_Property_Loss_In_The_Last_3_Years"));
            setTwoOrMoreProperties(data.get("Account_Level_Characteristics_Do_You_Insure_2_Or_More_Properties_With_PURE"));
            verifyNumberOfNonCATLosses(data.get("Account_Level_Characteristics_Number_Of_Non_CAT_Losses_Internal_Only"));
        }
    }

    public void fillAccountLevelCharacteristicsDetailsPA_END(Map<String, String> data) throws Throwable {
        if (!data.get("State").equalsIgnoreCase("AK") &&
                !data.get("State").equalsIgnoreCase("MT") &&
                !data.get("State").equalsIgnoreCase("NH") &&
                !data.get("State").equalsIgnoreCase("NV") &&
                !data.get("State").equalsIgnoreCase("OR") &&
                !data.get("State").equalsIgnoreCase("PA") &&
                !data.get("State").equalsIgnoreCase("SD") &&
                !data.get("State").equalsIgnoreCase("VT") &&
                !data.get("State").equalsIgnoreCase("WA") &&
                !data.get("State").equalsIgnoreCase("WV") &&
                !data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("DE") &&
                !data.get("State").equalsIgnoreCase("HI") &&
                !data.get("State").equalsIgnoreCase("MD") &&
                !data.get("State").equalsIgnoreCase("ME") &&
                !data.get("State").equalsIgnoreCase("NC") &&
                !data.get("State").equalsIgnoreCase("NY") &&
                !data.get("State").equalsIgnoreCase("ND")) {

            setNonCAT(data.get("Account_Level_Characteristics_Have_You_Had_A_Non_CAT_Property_Loss_In_The_Last_3_Years_END"));
            setTwoOrMoreProperties(data.get("Account_Level_Characteristics_Do_You_Insure_2_Or_More_Properties_With_PURE_END"));
            verifyNumberOfNonCATLosses(data.get("Account_Level_Characteristics_Number_Of_Non_CAT_Losses_Internal_Only_END"));
        }
    }

    public void fillAccountLevelCharacteristicsDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        if (!data.get("State").equalsIgnoreCase("AK") &&
                !data.get("State").equalsIgnoreCase("MT") &&
                !data.get("State").equalsIgnoreCase("NH") &&
                !data.get("State").equalsIgnoreCase("NV") &&
                !data.get("State").equalsIgnoreCase("OR") &&
                !data.get("State").equalsIgnoreCase("PA") &&
                !data.get("State").equalsIgnoreCase("SD") &&
                !data.get("State").equalsIgnoreCase("VT") &&
                !data.get("State").equalsIgnoreCase("WA") &&
                !data.get("State").equalsIgnoreCase("WV") &&
                !data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("DE") &&
                !data.get("State").equalsIgnoreCase("HI") &&
                !data.get("State").equalsIgnoreCase("MD") &&
                !data.get("State").equalsIgnoreCase("ME") &&
                !data.get("State").equalsIgnoreCase("NC") &&
                !data.get("State").equalsIgnoreCase("NY") &&
                !data.get("State").equalsIgnoreCase("ND")) {

            setNonCAT(data.get("Account_Level_Characteristics_Have_You_Had_A_Non_CAT_Property_Loss_In_The_Last_3_Years_OOS_END"));
            setTwoOrMoreProperties(data.get("Account_Level_Characteristics_Do_You_Insure_2_Or_More_Properties_With_PURE_OOS_END"));
            verifyNumberOfNonCATLosses(data.get("Account_Level_Characteristics_Number_Of_Non_CAT_Losses_Internal_Only_OOS_END"));
        }
    }

    public void fillAccountLevelCharacteristicsDetailsPA_RNW(Map<String, String> data) throws Throwable {
        if (!data.get("State").equalsIgnoreCase("AK") &&
                !data.get("State").equalsIgnoreCase("MT") &&
                !data.get("State").equalsIgnoreCase("NH") &&
                !data.get("State").equalsIgnoreCase("NV") &&
                !data.get("State").equalsIgnoreCase("OR") &&
                !data.get("State").equalsIgnoreCase("PA") &&
                !data.get("State").equalsIgnoreCase("SD") &&
                !data.get("State").equalsIgnoreCase("VT") &&
                !data.get("State").equalsIgnoreCase("WA") &&
                !data.get("State").equalsIgnoreCase("WV") &&
                !data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("DE") &&
                !data.get("State").equalsIgnoreCase("HI") &&
                !data.get("State").equalsIgnoreCase("MD") &&
                !data.get("State").equalsIgnoreCase("ME") &&
                !data.get("State").equalsIgnoreCase("NC") &&
                !data.get("State").equalsIgnoreCase("NY") &&
                !data.get("State").equalsIgnoreCase("ND")) {

            setNonCAT(data.get("Account_Level_Characteristics_Have_You_Had_A_Non_CAT_Property_Loss_In_The_Last_3_Years_RNW"));
            setTwoOrMoreProperties(data.get("Account_Level_Characteristics_Do_You_Insure_2_Or_More_Properties_With_PURE_RNW"));
            verifyNumberOfNonCATLosses(data.get("Account_Level_Characteristics_Number_Of_Non_CAT_Losses_Internal_Only_RNW"));
        }
    }

    public void setNonCAT(String value) throws Throwable {
        choose(nonCATYes, nonCATNo, value);
    }

    public void setTwoOrMoreProperties(String value) throws Throwable {
        choose(twoOrMorePropertiesYes, twoOrMorePropertiesNo, value);
    }

    public void verifyNumberOfNonCATLosses(String value) {
        assertCellValue(numberOfNonCATLosses, value, "Number of Non-CAT Losses");
    }
}