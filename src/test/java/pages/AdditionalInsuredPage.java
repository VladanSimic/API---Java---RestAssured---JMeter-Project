package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AdditionalInsuredBlock;
import pages.blocks.SpecificAutomobileInformationBlock;
import pages.blocks.SpecificWatercraftInformationBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdditionalInsuredPage extends CommonComponentsAndActions {
    WebDriver driver;
    AdditionalInsuredBlock additionalInsuredBlock;

    public AdditionalInsuredPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        additionalInsuredBlock = new AdditionalInsuredBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='additional insured']")
    WebElement additionalInsuredBlockElement;
    @FindBy(xpath = "//div[text()='additional insured']/../../../../../..//*[text()='add']")
    WebElement addAdditionalInsuredBtn;
    @FindBy(xpath = "//span[text()='Type']/../../../../../../../../../div[3]//table//tr/td[2]/div")
    List<WebElement> additionalInsuredType;
    @FindBy(xpath = "//span[text()='Name']/../../../../../../../../../div[3]//table//tr/td[3]/div")
    List<WebElement> additionalInsuredName;
    @FindBy(xpath = "//span[text()='Street Address']/../../../../../../../../../div[3]//table//tr/td[4]/div")
    List<WebElement> additionalInsuredStreetAddress;
    @FindBy(xpath = "//span[text()='City']/../../../../../../../../../div[3]//table//tr/td[5]/div")
    List<WebElement> additionalInsuredCity;
    @FindBy(xpath = "//span[text()='State']/../../../../../../../../../div[3]//table//tr/td[6]/div")
    List<WebElement> additionalInsuredState;
    @FindBy(xpath = "//span[text()='Zip']/../../../../../../../../../div[3]//table//tr/td[7]/div")
    List<WebElement> additionalInsuredZip;

    public void fillAdditionalInsuredPage(Map<String, String> data) throws Throwable {
        goToPage("Additional Insured");
        if (hasValue(data.get("Additional_Insured_Num"))) {
            int num = Integer.parseInt(data.get("Additional_Insured_Num"));
            for (int i = 1; i <= num; i++) {
                clickElement(addAdditionalInsuredBtn);
                pause(2000);
                clickElement(additionalInsuredBlockElement);
                setAdditionalInsuredType(data.get("Additional_Insured_Type").split(",")[i - 1], i - 1);
                setAdditionalInsuredName(data.get("Additional_Insured_Name").split(",")[i - 1], i - 1);
                setAdditionalInsuredStreetAddress(data.get("Additional_Insured_Street_Address").split(",")[i - 1], i - 1);
                setAdditionalInsuredCity(data.get("Additional_Insured_City").split(",")[i - 1], i - 1);
                setAdditionalInsuredState(data.get("Additional_Insured_State").split(",")[i - 1], i - 1);
                setAdditionalInsuredZip(data.get("Additional_Insured_Zip").split(",")[i - 1], i - 1);
            }
        }
        try {
            String[] operatorsToDelete = data.get("Delete_Additional_Operators").split(",");
            for (int i = 0; i < operatorsToDelete.length; i++) {
                deleteAdditionalInsured(operatorsToDelete[i]);
            }
        } catch (Exception e) {

        }
    }

    /*public void fillAdditionalInsuredPage_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Insured_Num_END"))) {
            int num = Integer.parseInt(data.get("Additional_Insured_Num_END"));
            for (int i = 1; i <= num; i++) {
                int totalInsured = i - 1 + Integer.parseInt(data.get("Additional_Insured_Num"));
                clickElement(addAdditionalInsuredBtn);
                pause(2000);
                clickElement(additionalInsuredBlockElement);
                setAdditionalInsuredType(data.get("Additional_Insured_Type_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredName(data.get("Additional_Insured_Name_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredStreetAddress(data.get("Additional_Insured_Street_Address_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredCity(data.get("Additional_Insured_City_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredState(data.get("Additional_Insured_State_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredZip(data.get("Additional_Insured_Zip_END").split(",")[i - 1], totalInsured);
            }
        }
        try {
            String[] operatorsToDelete = data.get("Delete_Additional_Operators_END").split(",");
            for (int i = 0; i < operatorsToDelete.length; i++) {
                deleteAdditionalInsured(operatorsToDelete[i]);
            }
        } catch (Exception e) {

        }
    }*/

    public void fillAdditionalInsuredPage_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Insured_Num_END"))) {
            int num = Integer.parseInt(data.get("Additional_Insured_Num_END"));
            for (int i = 1; i <= num; i++) {
                int totalInsured = i - 1 + Integer.parseInt(data.get("Additional_Insured_Num"));
                Set<String> conditional = Set.of("Additional Insured - Premises Liability for Specific Location",
                        "Additional Interest - Premises Liability for Specific Location",
                        "Additional Insured - Premises Liability for Specific Property");
                clickElement(addAdditionalInsuredBtn);
                pause(2000);
                clickElement(additionalInsuredBlockElement);
                additionalInsuredBlock.setType(data.get("Additional_Insured_Type_END").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setLLCTrust(data.get("Additional_Insured_LLC_Trust_END").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setName(data.get("Additional_Insured_Name_END").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setAddressLine1(data.get("Additional_Insured_Street_Address_END").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setCity(data.get("Additional_Insured_City_END").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setState(data.get("Additional_Insured_State_END").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setZIP(data.get("Additional_Insured_Zip_END").split(",")[i - 1], totalInsured);

                if (conditional.contains(data.get("Additional_Insured_Type_END").split(",")[i - 1])) {
                    if (data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_END").split(",")[i - 1].equalsIgnoreCase("Primary Address")) {
                        additionalInsuredBlock.setAddressDropdownForLiabilityCoverage(data.get("Address_Line_1_Txt"), totalInsured);
                    } else {
                        String addressForLiabilityCoverage = data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_END").split(",")[i - 1];
                        if (addressForLiabilityCoverage.contains("-")) {
                            additionalInsuredBlock.setAddressDropdownForLiabilityCoverage(addressForLiabilityCoverage.split("-")[0], totalInsured);
                        } else {
                            additionalInsuredBlock.setAddressDropdownForLiabilityCoverage(data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_END").split(",")[i - 1], totalInsured);
                        }
                    }
                    saveChanges();
                    if (data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_END").split(",")[i - 1].equalsIgnoreCase("Other Location Address")) {
                        additionalInsuredBlock.setAddressFormForLiabilityCoverage(data.get("Additional_Insured_Address_Form_Liability_Coverage_END").split(",")[i - 1], totalInsured);
                    }
                    if (data.get("Additional_Insured_Type_END").split(",")[i - 1].equalsIgnoreCase("Additional Insured - Premises Liability for Specific Property")) {
                        additionalInsuredBlock.setPropertyDescription(data.get("Additional_Insured_Property_Description_END").split(",")[i - 1], totalInsured);
                    }
                }
               /* if (data.get("Additional_Insured_LLC_Trust_END" ).split(",")[i - 1].equalsIgnoreCase("Yes") || data.get("Additional_Insured_LLC_Trust_END").split(",")[i - 1].equalsIgnoreCase(""))
                    additionalInsuredBlock.clickCreateNewEntity();*/
            }

        }
        try {
            String[] operatorsToDelete = data.get("Delete_Additional_Operators_END").split(",");
            for (int i = 0; i < operatorsToDelete.length; i++) {
                deleteAdditionalInsured(operatorsToDelete[i]);
            }
        } catch (Exception e) {

        }
    }

    private void deleteAdditionalInsured(String s) throws Throwable {
        clickElement(driver.findElement(By.xpath("//span[text()='Zip']/../../../../../../../../../div[3]//table[" + s + "]//tr/td[8]/div//button")));
        pause(2000);
        saveChanges();
    }

    public void fillAdditionalInsuredPage_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Insured_Num_OOS_END"))) {
            int num = Integer.parseInt(data.get("Additional_Insured_Num_OOS_END"));
            for (int i = 1; i <= num; i++) {
                int totalInsured = i - 1 + Integer.parseInt(data.get("Additional_Insured_Num"));
                clickElement(addAdditionalInsuredBtn);
                pause(2000);
                clickElement(additionalInsuredBlockElement);
                setAdditionalInsuredType(data.get("Additional_Insured_Type_OOS_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredName(data.get("Additional_Insured_Name_OOS_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredStreetAddress(data.get("Additional_Insured_Street_Address_OOS_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredCity(data.get("Additional_Insured_City_OOS_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredState(data.get("Additional_Insured_State_OOS_END").split(",")[i - 1], totalInsured);
                setAdditionalInsuredZip(data.get("Additional_Insured_Zip_OOS_END").split(",")[i - 1], totalInsured);
            }
        }
        try {
            String[] operatorsToDelete = data.get("Delete_Additional_Operators_OOS_END").split(",");
            for (int i = 0; i < operatorsToDelete.length; i++) {
                deleteAdditionalInsured(operatorsToDelete[i]);
            }
        } catch (Exception e) {

        }
    }

    public void fillAdditionalInsuredPage_RNW(Map<String, String> data) throws Throwable {
        int totalInsured = 0;
        int endorsementTotalInsured = Integer.parseInt(data.get("Additional_Insured_Num_END"));
        if (hasValue(data.get("Additional_Insured_Num_RNW")) && Integer.parseInt(data.get("Additional_Insured_Num_RNW")) > 0) {
            Set<String> conditional = Set.of("Additional Insured - Premises Liability for Specific Location",
                    "Additional Interest - Premises Liability for Specific Location",
                    "Additional Insured - Premises Liability for Specific Property");
            int num = Integer.parseInt(data.get("Additional_Insured_Num_RNW"));
            for (int i = 1; i <= num; i++) {
                if (data.containsKey("Renewal_After_Endorsement") && data.get("Renewal_After_Endorsement").equals("Yes")) {
                    totalInsured = i - 1 + Integer.parseInt(data.get("Additional_Insured_Num")) + endorsementTotalInsured;
                } else {
                    totalInsured = i - 1 + Integer.parseInt(data.get("Additional_Insured_Num"));
                }
                clickElement(addAdditionalInsuredBtn);
                pause(2000);
                clickElement(additionalInsuredBlockElement);
                additionalInsuredBlock.setType(data.get("Additional_Insured_Type_RNW").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setLLCTrust(data.get("Additional_Insured_LLC_Trust_RNW").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setName(data.get("Additional_Insured_Name_RNW").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setAddressLine1(data.get("Additional_Insured_Street_Address_RNW").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setCity(data.get("Additional_Insured_City_RNW").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setState(data.get("Additional_Insured_State_RNW").split(",")[i - 1], totalInsured);
                additionalInsuredBlock.setZIP(data.get("Additional_Insured_Zip_RNW").split(",")[i - 1], totalInsured);
                if (conditional.contains(data.get("Additional_Insured_Type_RNW").split(",")[i - 1])) {
                    if (data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_RNW").split(",")[i - 1].equalsIgnoreCase("Primary Address")) {
                        additionalInsuredBlock.setAddressDropdownForLiabilityCoverage(data.get("Address_Line_1_Txt"), totalInsured);
                    } else {
                        String addressForLiabilityCoverage = data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_RNW").split(",")[i - 1];
                        if (addressForLiabilityCoverage.contains("-")) {
                            additionalInsuredBlock.setAddressDropdownForLiabilityCoverage(addressForLiabilityCoverage.split("-")[0], totalInsured);
                        } else {
                            additionalInsuredBlock.setAddressDropdownForLiabilityCoverage(data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_RNW").split(",")[i - 1], totalInsured);
                        }
                    }
                    saveChanges();
                    if (data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_RNW").split(",")[i - 1].equalsIgnoreCase("Other Location Address")) {
                        additionalInsuredBlock.setAddressFormForLiabilityCoverage(data.get("Additional_Insured_Address_Form_Liability_Coverage_RNW").split(",")[i - 1], totalInsured);
                    }
                    if (data.get("Additional_Insured_Type_RNW").split(",")[i - 1].equalsIgnoreCase("Additional Insured - Premises Liability for Specific Property")) {
                        additionalInsuredBlock.setPropertyDescription(data.get("Additional_Insured_Property_Description_RNW").split(",")[i - 1], totalInsured);
                    }
                }
               /* if (data.get("Additional_Insured_LLC_Trust_RNW" ).split(",")[i - 1].equalsIgnoreCase("Yes") || data.get("Additional_Insured_LLC_Trust_RNW").split(",")[i - 1].equalsIgnoreCase(""))
                    additionalInsuredBlock.clickCreateNewEntity();*/
            }

        }
        try {
            String[] operatorsToDelete = data.get("Delete_Additional_Operators_RNW").split(",");
            for (int i = 0; i < operatorsToDelete.length; i++) {
                deleteAdditionalInsured(operatorsToDelete[i]);
            }
        } catch (Exception e) {

        }
    }

    private void setAdditionalInsuredType(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(additionalInsuredType.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    private void setAdditionalInsuredName(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(additionalInsuredName.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    private void setAdditionalInsuredStreetAddress(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(additionalInsuredStreetAddress.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    private void setAdditionalInsuredCity(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(additionalInsuredCity.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    private void setAdditionalInsuredState(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(additionalInsuredState.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    private void setAdditionalInsuredZip(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(additionalInsuredZip.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void fillAdditionalInsuredPageEX(Map<String, String> data) throws Throwable {
        goToPage("Additional Insured");
        new AdditionalInsuredBlock(driver).fillAdditionalInsuredDetailsEX(data);
        new SpecificWatercraftInformationBlock(driver).fillSpecificWatercraftInformationBlock(data);
        new SpecificAutomobileInformationBlock(driver).fillSpecificAutomobileInformationBlock(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageAdditionalInsured(data);
    }

    public void fillAdditionalInsuredPageCO(Map<String, String> data) throws Throwable {
        goToPage("Additional Insured/Interest");
        verifyBlockExists("additional insured/ additional interest");
        new AdditionalInsuredBlock(driver).fillAdditionalInsuredDetails(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageAdditionalInsured(data);
    }

    public void fillAdditionalInsuredPageES(Map<String, String> data) throws Throwable {
        goToPage("Additional Insured");
        verifyBlockExists("additional insured");
        new AdditionalInsuredBlock(driver).fillAdditionalInsuredDetails(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageAdditionalInsured(data);
    }

}
