package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class NamedInsuredBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public NamedInsuredBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='named insured']/../../../../../../div[2]//span[text()='add']")
    WebElement addAddresses;
    @FindBy(xpath = "")
    List<WebElement> deleteAddresses;
    @FindBy(xpath = "//span[text()='add']")
    WebElement addNamedInsured;
    @FindBy(xpath = "//div[text()='named insured']")
    WebElement block;
    @FindBy(xpath = "//span[text()='Prefix']/../../../../../../../../..//tr/td[2]/div")
    List<WebElement> prefix;
    @FindBy(xpath = "//span[text()='First Name']/../../../../../../../../..//tr/td[3]/div")
    List<WebElement> firstName;
    @FindBy(xpath = "//span[text()='MI']/../../../../../../../../..//tr/td[4]/div")
    List<WebElement> mi;
    @FindBy(xpath = "//span[text()='Last Name']/../../../../../../../../..//tr/td[5]/div")
    List<WebElement> lastName;
    @FindBy(xpath = "//span[text()='Suffix']/../../../../../../../../..//tr/td[6]/div")
    List<WebElement> suffix;
    @FindBy(xpath = "//span[text()='Social Security Number']/../../../../../../../../..//tr/td[7]/div")
    List<WebElement> socialSecurityNumber;
    @FindBy(xpath = "//span[text()='Named Insured']/../../../../../../../../..//tr/td[1]/div")
    List<WebElement> namedInsured;

    public void fillNamedInsuredDetailsCC(Map<String, String> data) throws Throwable {
        setPrefix(data.get("Named_Insured_Prefix"), 0);
        setFirstName(data.get("Named_Insured_First_Name"), 0);
        setMI(data.get("Named_Insured_MI"), 0);
        setLastName(data.get("Named_Insured_Last_Name"), 0);
        setSuffix(data.get("Named_Insured_Suffix"), 0);

        String insuredType = data.get("Policy_Information_Named_Insured_Type");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured");

        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual")) {
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                verifyBlockExists("named insured");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        setPrefix(data.get("Additional_Named_Insured_Prefix_" + i), i);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_" + i), i);
                        setMI(data.get("Additional_Named_Insured_MI_" + i), i);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_" + i), i);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_" + i), i);
                        saveChanges();
                    }
                } else if (namedInsured.length == 1) {
                    clickBlock();
                    clickAddNamedInsured();
                    setPrefix(data.get("Additional_Named_Insured_Prefix_1"), 1);
                    setFirstName(data.get("Additional_Named_Insured_First_Name_1"), 1);
                    setMI(data.get("Additional_Named_Insured_MI_1"), 1);
                    setLastName(data.get("Additional_Named_Insured_Last_Name_1"), 1);
                    setSuffix(data.get("Additional_Named_Insured_Suffix_1"), 1);
                    saveChanges();
                }
            }
        }
    }

    public void fillNamedInsuredDetailsCC_END(Map<String, String> data) throws Throwable {
        setPrefix(data.get("Named_Insured_Prefix_END"), 0);
        setFirstName(data.get("Named_Insured_First_Name_END"), 0);
        setMI(data.get("Named_Insured_MI_END"), 0);
        setLastName(data.get("Named_Insured_Last_Name_END"), 0);
        setSuffix(data.get("Named_Insured_Suffix_END"), 0);

        String insuredType = data.get("Policy_Information_Named_Insured_Type");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured");

        String insuredTypeEND = data.get("Policy_Information_Named_Insured_Type_END");
        String additionalNamedInsuredEND = data.get("Named_Insured_Additional_Named_Insured_END");

        if ((hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual")) ||
                (hasValue(insuredTypeEND) && insuredTypeEND.equalsIgnoreCase("Individual"))) {
            if (hasValue(additionalNamedInsuredEND)) {
                int namedInsuredNum = 0;
                if (hasValue(additionalNamedInsured)) {
                    namedInsuredNum = additionalNamedInsured.split(",").length;
                }
                String[] namedInsuredEND = additionalNamedInsuredEND.split(",");
                if (namedInsuredEND.length > 1) {
                    for (int i = 1; i <= namedInsuredEND.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        setPrefix(data.get("Additional_Named_Insured_Prefix_END_" + i), i + namedInsuredNum);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_END_" + i), i + namedInsuredNum);
                        setMI(data.get("Additional_Named_Insured_MI_END_" + i), i + namedInsuredNum);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_END_" + i), i + namedInsuredNum);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_END_" + i), i + namedInsuredNum);
                        saveChanges();
                    }
                } else if (namedInsuredEND.length == 1) {
                    clickBlock();
                    clickAddNamedInsured();
                    setPrefix(data.get("Additional_Named_Insured_Prefix_END_1"), 1 + namedInsuredNum);
                    setFirstName(data.get("Additional_Named_Insured_First_Name_END_1"), 1 + namedInsuredNum);
                    setMI(data.get("Additional_Named_Insured_MI_END_1"), 1 + namedInsuredNum);
                    setLastName(data.get("Additional_Named_Insured_Last_Name_END_1"), 1 + namedInsuredNum);
                    setSuffix(data.get("Additional_Named_Insured_Suffix_END_1"), 1 + namedInsuredNum);
                    saveChanges();
                }
            }
        }
    }

    public void clickBlock() {
        clickElement(block, "Named Insured Block");
    }

    public void addNamedInsured(Map<String, String> data) throws Throwable {
        verifyBlockExists("named insured");
        //grids default count / label name / additional rows count
        if (data.get("NI_Count") != null && !data.get("NI_Count").equalsIgnoreCase("")) {
            int len = data.get("NI_Count") != null ? Integer.parseInt(data.get("NI_Count")) : 0;

            for (int i = 0; i < len; i++) {
                clickElement(addAddresses);
                pause(3000);
            }

            //fill in the ui
            for (int i = 1; i <= len; i++) {
                String tempNI = "//span[text()='Named Insured']/../../../../../../../../../div[3]//table[" + (i + 1) + "]//tr/td[1]/div";
                String tempFN = "//span[text()='Named Insured']/../../../../../../../../../div[3]//table[" + (i + 1) + "]//tr/td[3]/div";
                String tempLN = "//span[text()='Named Insured']/../../../../../../../../../div[3]//table[" + (i + 1) + "]//tr/td[5]/div";

                WebElement NI = driver.findElements(By.xpath(tempNI)).get(0);
                clickElement(NI);
                typeText(driver.switchTo().activeElement(), data.get("NI_Name_Insured").split(",")[i - 1].trim());
                pause(3000);

                WebElement FN = driver.findElements(By.xpath(tempFN)).get(0);
//            clickElement(FN);
                typeText(driver.switchTo().activeElement(), data.get("NI_First_Name").split(",")[i - 1].trim());
                pause(3000);

                WebElement LN = driver.findElements(By.xpath(tempLN)).get(0);
                clickElement(LN);
                typeText(driver.switchTo().activeElement(), data.get("NI_Last_Name").split(",")[i - 1].trim());
                pause(3000);
            }
        }

    }

    public void deleteAddresses(int index) throws Throwable {
        clickElement(deleteAddresses.get(index));
    }

    public void addAddresses() throws Throwable {
        clickElement(addAddresses);
    }

    public void setPrefix(String value, int i) {
        if (hasValue(value)) {
            clickElement(prefix.get(i), "Prefix_" + i);
            typeText(driver.switchTo().activeElement(), value, "Prefix_" + i);
        }
    }

    public void setFirstName(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(firstName.get(i), "First Name_" + i);
            typeText(driver.switchTo().activeElement(), value, "First Name_" + i);
        }
    }

    public void setMI(String value, int i) {
        if (hasValue(value)) {
            clickElement(mi.get(i), "MI_" + i);
            typeText(driver.switchTo().activeElement(), value, "MI_" + i);
        }
    }

    public void setLastName(String value, int i) {
        if (hasValue(value)) {
            clickElement(lastName.get(i), "Last Name_" + i);
            typeText(driver.switchTo().activeElement(), value, "Last Name_" + i);
        }
    }

    public void setSuffix(String value, int i) {
        if (hasValue(value)) {
            clickElement(suffix.get(i), "Suffix_" + i);
            typeText(driver.switchTo().activeElement(), value, "Suffix_" + i);
        }
    }

    public void setSocialSecurityNumber(String value, int i) {
        if (hasValue(value)) {
            clickElement(socialSecurityNumber.get(i), "SSN_" + i);
            typeText(driver.switchTo().activeElement(), value, "SSN_" + i);
        }
    }

    public void clickAddNamedInsured() throws Throwable {
        clickElement(addNamedInsured, "Add Named Insured");
        pause(2000);
        clickFooter();
    }

    public void fillNamedInsuredDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("named insured");
        setPrefix(data.get("Named_Insured_Prefix"), 0);
        setFirstName(data.get("Named_Insured_First_Name"), 0);
        setMI(data.get("Named_Insured_MI"), 0);
        setLastName(data.get("Named_Insured_Last_Name"), 0);
        setSuffix(data.get("Named_Insured_Suffix"), 0);

        String insuredType = data.get("Policy_Information_Named_Insured_Type");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured");

        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual")) {
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        setPrefix(data.get("Additional_Named_Insured_Prefix_" + i), i);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_" + i), i);
                        setMI(data.get("Additional_Named_Insured_MI_" + i), i);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_" + i), i);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_" + i), i);
                        saveChanges();
                    }
                } else if (namedInsured.length == 1) {
                    clickBlock();
                    clickAddNamedInsured();
                    setPrefix(data.get("Additional_Named_Insured_Prefix_1"), 1);
                    setFirstName(data.get("Additional_Named_Insured_First_Name_1"), 1);
                    setMI(data.get("Additional_Named_Insured_MI_1"), 1);
                    setLastName(data.get("Additional_Named_Insured_Last_Name_1"), 1);
                    setSuffix(data.get("Additional_Named_Insured_Suffix_1"), 1);
                    saveChanges();
                }
            }
        }
    }

    public void fillNamedInsuredDetailsHS_END(Map<String, String> data) throws Throwable {
        setPrefix(data.get("Named_Insured_Prefix_END"), 0);
        setFirstName(data.get("Named_Insured_First_Name_END"), 0);
        setMI(data.get("Named_Insured_MI_END"), 0);
        setLastName(data.get("Named_Insured_Last_Name_END"), 0);
        setSuffix(data.get("Named_Insured_Suffix_END"), 0);

        String insuredType = data.get("Policy_Information_Named_Insured_Type_END");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured_END");

        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual_END")) {
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        setPrefix(data.get("Additional_Named_Insured_Prefix_END_" + i), i);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_END_" + i), i);
                        setMI(data.get("Additional_Named_Insured_MI_END_" + i), i);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_END_" + i), i);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_END_" + i), i);
                        saveChanges();
                    }
                } else if (namedInsured.length == 1) {
                    clickBlock();
                    clickAddNamedInsured();
                    setPrefix(data.get("Additional_Named_Insured_Prefix_END_1"), 1);
                    setFirstName(data.get("Additional_Named_Insured_First_END_Name_1"), 1);
                    setMI(data.get("Additional_Named_Insured_MI_END_1"), 1);
                    setLastName(data.get("Additional_Named_Insured_Last_Name_END_1"), 1);
                    setSuffix(data.get("Additional_Named_Insured_Suffix_END_1"), 1);
                    saveChanges();
                }
            }
        }
    }

    public void fillNamedInsuredDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        setPrefix(data.get("Named_Insured_Prefix_OOS_END"), 0);
        setFirstName(data.get("Named_Insured_First_Name_OOS_END"), 0);
        setMI(data.get("Named_Insured_MI_OOS_END"), 0);
        setLastName(data.get("Named_Insured_Last_Name_OOS_END"), 0);
        setSuffix(data.get("Named_Insured_Suffix_OOS_END"), 0);

        String insuredType = data.get("Policy_Information_Named_Insured_Type_OOS_END");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured_OOS_END");

        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual_OOS_END")) {
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        setPrefix(data.get("Additional_Named_Insured_Prefix_OOS_END_" + i), i);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_OOS_END_" + i), i);
                        setMI(data.get("Additional_Named_Insured_MI_OOS_END_" + i), i);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_OOS_END_" + i), i);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_OOS_END_" + i), i);
                        saveChanges();
                    }
                } else if (namedInsured.length == 1) {
                    clickBlock();
                    clickAddNamedInsured();
                    setPrefix(data.get("Additional_Named_Insured_Prefix_OOS_END_1"), 1);
                    setFirstName(data.get("Additional_Named_Insured_First_OOS_END_Name_1"), 1);
                    setMI(data.get("Additional_Named_Insured_MI_OOS_END_1"), 1);
                    setLastName(data.get("Additional_Named_Insured_Last_Name_OOS_END_1"), 1);
                    setSuffix(data.get("Additional_Named_Insured_Suffix_OOS_END_1"), 1);
                    saveChanges();
                }
            }
        }
    }

    public void fillNamedInsuredDetailsHS_RNW(Map<String, String> data) throws Throwable {
        setPrefix(data.get("Named_Insured_Prefix_RNW"), 0);
        setFirstName(data.get("Named_Insured_First_Name_RNW"), 0);
        setMI(data.get("Named_Insured_MI_OOS_END"), 0);
        setLastName(data.get("Named_Insured_Last_Name_RNW"), 0);
        setSuffix(data.get("Named_Insured_Suffix_RNW"), 0);

        String insuredType = data.get("Policy_Information_Named_Insured_Type_RNW");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured_RNW");

        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual_RNW")) {
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        setPrefix(data.get("Additional_Named_Insured_Prefix_RNW_" + i), i);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_RNW_" + i), i);
                        setMI(data.get("Additional_Named_Insured_MI_RNW_" + i), i);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_RNW_" + i), i);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_RNW_" + i), i);
                        saveChanges();
                    }
                } else if (namedInsured.length == 1) {
                    clickBlock();
                    clickAddNamedInsured();
                    setPrefix(data.get("Additional_Named_Insured_Prefix_RNW_1"), 1);
                    setFirstName(data.get("Additional_Named_Insured_First_RNW_Name_1"), 1);
                    setMI(data.get("Additional_Named_Insured_MI_RNW_1"), 1);
                    setLastName(data.get("Additional_Named_Insured_Last_Name_RNW_1"), 1);
                    setSuffix(data.get("Additional_Named_Insured_Suffix_RNW_1"), 1);
                    saveChanges();
                }
            }
        }
    }

    public void fillNamedInsuredDetailsHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("named insured");
        String insuredType = data.get("Policy_Information_Named_Insured_Type");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured");
        String state = data.get("State");

        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual")) {
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        if (state.equalsIgnoreCase("CO"))
                            setNamedInsured("New Person", i);
                        setPrefix(data.get("Additional_Named_Insured_Prefix_" + i), i);
                        pause(1000);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_" + i), i);
                        pause(1000);
                        setMI(data.get("Additional_Named_Insured_MI_" + i), i);
                        pause(1000);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_" + i), i);
                        pause(1000);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_" + i), i);
                        pause(1000);
                        setSocialSecurityNumber(data.get("Additional_Named_Insured_SSN_" + i), i);
                        saveChanges();
                        pause(3000);
                    }
                }
            }
        }
    }

    public void fillNamedInsuredDetailsHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("named insured");
        String insuredType = data.get("Policy_Information_Named_Insured_Type_END");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured_END");
        String state = data.get("State");

        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual")) {
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        if (state.equalsIgnoreCase("CO"))
                            setNamedInsured("New Person", i);
                        setPrefix(data.get("Additional_Named_Insured_Prefix_END_" + i), i);
                        pause(1000);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_END_" + i), i);
                        pause(1000);
                        setMI(data.get("Additional_Named_Insured_MI_END_" + i), i);
                        pause(1000);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_END_" + i), i);
                        pause(1000);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_END_" + i), i);
                        pause(1000);
                        setSocialSecurityNumber(data.get("Additional_Named_Insured_SSN_END_" + i), i);
                        saveChanges();
                        pause(3000);
                    }
                }
            }
        }
    }

    public void fillNamedInsuredDetailsHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("named insured");
        String insuredType = data.get("Policy_Information_Named_Insured_Type_OOS_END");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured_OOS_END");
        String state = data.get("State");

        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual")) {
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        if (state.equalsIgnoreCase("CO"))
                            setNamedInsured("New Person", i);
                        setPrefix(data.get("Additional_Named_Insured_Prefix_OOS_END_" + i), i);
                        pause(1000);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_OOS_END_" + i), i);
                        pause(1000);
                        setMI(data.get("Additional_Named_Insured_MI_OOS_END_" + i), i);
                        pause(1000);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_OOS_END_" + i), i);
                        pause(1000);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_OOS_END_" + i), i);
                        pause(1000);
                        setSocialSecurityNumber(data.get("Additional_Named_Insured_SSN_OOS_END_" + i), i);
                        saveChanges();
                        pause(3000);
                    }
                }
            }
        }
    }

    public void fillNamedInsuredDetailsHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("named insured");
        String insuredType = data.get("Policy_Information_Named_Insured_Type_RNW");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured_RNW");
        String state = data.get("State");

        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual")) {
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        if (state.equalsIgnoreCase("CO"))
                            setNamedInsured("New Person", i);
                        setPrefix(data.get("Additional_Named_Insured_Prefix_RNW_" + i), i);
                        pause(1000);
                        setFirstName(data.get("Additional_Named_Insured_First_Name_RNW_" + i), i);
                        pause(1000);
                        setMI(data.get("Additional_Named_Insured_MI_RNW_" + i), i);
                        pause(1000);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_RNW_" + i), i);
                        pause(1000);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_RNW_" + i), i);
                        pause(1000);
                        setSocialSecurityNumber(data.get("Additional_Named_Insured_SSN_RNW_" + i), i);
                        saveChanges();
                        pause(3000);
                    }
                }
            }
        }
    }

    public void fillNamedInsuredDetailsCO(Map<String, String> data) throws Throwable {
        String insuredType = data.get("Named_Insured_Type");
        String additionalNamedInsured = data.get("Named_Insured_Additional_Named_Insured");
        if (hasValue(insuredType) && insuredType.equalsIgnoreCase("Individual")) {
            verifyBlockExists("named insured");
            if (hasValue(additionalNamedInsured)) {
                String[] namedInsured = additionalNamedInsured.split(",");
                if (namedInsured.length > 1) {
                    for (int i = 1; i <= namedInsured.length; i++) {
                        clickBlock();
                        clickAddNamedInsured();
                        setNamedInsured("New Person", i);
                        setPrefix(data.get("Additional_Named_Insured_Prefix_" + i), i);
                        clickFooter();
                        setFirstName(data.get("Additional_Named_Insured_First_Name_" + i), i);
                        pause(1000);
                        setMI(data.get("Additional_Named_Insured_MI_" + i), i);
                        pause(1000);
                        setLastName(data.get("Additional_Named_Insured_Last_Name_" + i), i);
                        pause(1000);
                        setSuffix(data.get("Additional_Named_Insured_Suffix_" + i), i);
                        pause(1000);
                        setSocialSecurityNumber(data.get("Additional_Named_Insured_SSN_" + i), i);
                    }
                    saveChanges();
                }
            }
        }
    }

    public void setNamedInsured(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(namedInsured.get(i), "NamedInsured_" + i);
            typeTextEnter(driver.switchTo().activeElement(), value, "NamedInsured_" + i);
            clickFooter();
        }
    }

    public void fillNamedInsuredDetailsFS(Map<String, String> data) throws Throwable {
        // TODO FS
        verifyBlockExists("named insured");
    }

}