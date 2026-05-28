package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class WhatIsTheAddressOfLocationLegalEntityOwnsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WhatIsTheAddressOfLocationLegalEntityOwnsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'the Legal Entity owns')]/../../../../../..//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[contains(text(),'the Legal Entity owns')]/../../../../../..//span[text()='delete']")
    List<WebElement> deleteAddress;
    @FindBy(xpath = "//div[contains(text(),'the Legal Entity owns')]/../../../../../..//span[text()='add']")
    WebElement addAddressOfLocationLegalEntity;
    @FindBy(xpath = "//div[contains(text(),'the Legal Entity owns')]")
    WebElement block;
    @FindBy(xpath = "//div[contains(text(),'the Legal Entity owns')]/../../../../../..//div[text()='Address line 1']/../../../..//input")
    List<WebElement> address1;
    @FindBy(xpath = "//div[contains(text(),'the Legal Entity owns')]/../../../../../..//div[text()='Address line 2']/../../../..//input")
    List<WebElement> address2;
    @FindBy(xpath = "//div[contains(text(),'the Legal Entity owns')]/../../../../../..//div[text()='City']/../../../..//input")
    List<WebElement> city;
    @FindBy(xpath = "//div[contains(text(),'the Legal Entity owns')]/../../../../../..//div[text()='State']/../../../..//input")
    List<WebElement> state;
    @FindBy(xpath = "//div[contains(text(),'the Legal Entity owns')]/../../../../../..//div[text()='ZIP']/../../../..//input")
    List<WebElement> zip;

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("What is the address(es) of the location the Legal Entity owns");
        if (hasValue(data.get("Household_Entity_Locations"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_1"), 0);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockCC_END(Map<String, String> data) throws Throwable {
        //TODO count entries from NB, enable removing entries CC
        if (hasValue(data.get("Household_Entity_Locations_END")) && !data.get("Household_Entity_Locations_END").equalsIgnoreCase(",")) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations_END").split(",");

            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_END_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_END_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_END_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_END_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_END_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_END"), 1);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_END"), 1);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_END"), 1);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_END"), 1);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_END"), 1);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHS(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Household_Entity_Locations"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_1"), 0);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Legal_Entity_Locations"))) {
            String[] legalEntityLocations = data.get("Legal_Entity_Locations").split(",");
            for (int i = 1; i <= legalEntityLocations.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAddAddressOfLocationLegalEntity();
                }
                pause(3000);
                setAddressLine1(data.get("Legal_Entity_Locations_Address_Line_1_" + i), i - 1);
                setAddressLine2(data.get("Legal_Entity_Locations_Address_Line_2_" + i), i - 1);
                setCity(data.get("Legal_Entity_Locations_City_" + i), i - 1);
                setState(data.get("Legal_Entity_Locations_State_" + i), i - 1);
                setZIP(data.get("Legal_Entity_Locations_ZIP_" + i), i - 1);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Legal_Entity_Locations_END")) && data.get("Legal_Entity_Locations_END").contains(",")) {
            String[] addressesNB = data.get("Legal_Entity_Locations").split(",");
            String[] addressesEND = data.get("Legal_Entity_Locations_END").split(",");

            //Modify addresses
            for (int i = 1; i <= addressesEND.length; i++) {
                if (addressesEND[i - 1].contains("_MOD")) {
                    for (int j = 0; j < addressesNB.length; j++) {
                        if (addressesNB[j].equalsIgnoreCase(addressesEND[i - 1].split("_MOD")[0])) {
                            setAddressLine1(data.get("Legal_Entity_Locations_Address_Line_1_END_" + i), j);
                            setAddressLine2(data.get("Legal_Entity_Locations_Address_Line_2_END_" + i), j);
                            setCity(data.get("Legal_Entity_Locations_City_END_" + i), j);
                            setState(data.get("Legal_Entity_Locations_State_END_" + i), j);
                            setZIP(data.get("Legal_Entity_Locations_ZIP_END_" + i), j);
                            saveChanges();
                        }
                    }
                }
            }

            int totalCount = addressesNB.length;
            //Add addresses
            for (int i = 1; i <= addressesEND.length; i++) {
                if (addressesEND[i - 1].contains("_ADD")) {
                    clickAddAddressOfLocationLegalEntity();
                    pause(3000);
                    setAddressLine1(data.get("Legal_Entity_Locations_Address_Line_1_END_" + i), totalCount);
                    setAddressLine2(data.get("Legal_Entity_Locations_Address_Line_2_END_" + i), totalCount);
                    setCity(data.get("Legal_Entity_Locations_City_END_" + i), totalCount);
                    setState(data.get("Legal_Entity_Locations_State_END_" + i), totalCount);
                    setZIP(data.get("Legal_Entity_Locations_ZIP_END_" + i), totalCount);
                    saveChanges();
                }
            }

            //Delete addresses
            for (int i = 0; i < addressesEND.length; i++) {
                if (addressesEND[i].contains("_DEL")) {
                    for (int j = 0; j < addressesNB.length; j++) {
                        if (addressesNB[j].equalsIgnoreCase(addressesEND[i].split("_DEL")[0])) {
                            clickElement(deleteAddress.get(j));
                        }
                    }
                }
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Legal_Entity_Locations_OOS_END"))) {
            String[] legalEntityLocations = data.get("Legal_Entity_Locations_OOS_END").split(",");
            if (legalEntityLocations.length > 1) {
                for (int i = 1; i <= legalEntityLocations.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAddAddressOfLocationLegalEntity();
                    }
                    pause(3000);
                    setAddressLine1(data.get("Legal_Entity_Locations_Address_Line_1_OOS_END_" + i), i - 1);
                    setAddressLine2(data.get("Legal_Entity_Locations_Address_Line_2_OOS_END_" + i), i - 1);
                    setCity(data.get("Legal_Entity_Locations_City_OOS_END_" + i), i - 1);
                    setState(data.get("Legal_Entity_Locations_State_OOS_END_" + i), i - 1);
                    setZIP(data.get("Legal_Entity_Locations_ZIP_OOS_END_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("Legal_Entity_Locations_Address_Line_1_OOS_END_1"), 0);
                setAddressLine2(data.get("Legal_Entity_Locations_Address_Line_2_OOS_END_1"), 0);
                setCity(data.get("Legal_Entity_Locations_City_OOS_END_1"), 0);
                setState(data.get("Legal_Entity_Locations_State_OOS_END_1"), 0);
                setZIP(data.get("Legal_Entity_Locations_ZIP_OOS_END_1"), 0);
                saveChanges();
            }
        }
        //TODO PA OOS - Other legal entity address - Mid
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Legal_Entity_Locations_RNW")) && data.get("Legal_Entity_Locations_RNW").contains(",")) {
            String[] addressesNB = data.get("Legal_Entity_Locations").split(",");
            String[] addressesEND = data.get("Legal_Entity_Locations_END").split(",");
            String[] addressesRNW = data.get("Legal_Entity_Locations_RNW").split(",");

            //Modify addresses
            for (int i = 1; i <= addressesEND.length; i++) {
                if (addressesEND[i - 1].contains("_MOD")) {
                    for (int j = 0; j < addressesNB.length; j++) {
                        if (addressesNB[j].equalsIgnoreCase(addressesEND[i - 1].split("_MOD")[0])) {
                            setAddressLine1(data.get("Legal_Entity_Locations_Address_Line_1_RNW_" + i), j);
                            setAddressLine2(data.get("Legal_Entity_Locations_Address_Line_2_RNW_" + i), j);
                            setCity(data.get("Legal_Entity_Locations_City_RNW_" + i), j);
                            setState(data.get("Legal_Entity_Locations_State_RNW_" + i), j);
                            setZIP(data.get("Legal_Entity_Locations_ZIP_RNW_" + i), j);
                            saveChanges();
                        }
                    }
                }
            }

            int totalCount = addressesNB.length;
            //Add addresses
            for (int i = 1; i <= addressesEND.length; i++) {
                if (addressesEND[i - 1].contains("_ADD")) {
                    clickAddAddressOfLocationLegalEntity();
                    pause(3000);
                    setAddressLine1(data.get("Legal_Entity_Locations_Address_Line_1_RNW_" + i), totalCount);
                    setAddressLine2(data.get("Legal_Entity_Locations_Address_Line_2_RNW_" + i), totalCount);
                    setCity(data.get("Legal_Entity_Locations_City_RNW_" + i), totalCount);
                    setState(data.get("Legal_Entity_Locations_State_RNW_" + i), totalCount);
                    setZIP(data.get("Legal_Entity_Locations_ZIP_RNW_" + i), totalCount);
                    saveChanges();
                }
            }

            //Delete addresses
            for (int i = 0; i < addressesEND.length; i++) {
                if (addressesEND[i].contains("_DEL")) {
                    for (int j = 0; j < addressesNB.length; j++) {
                        if (addressesNB[j].equalsIgnoreCase(addressesEND[i].split("_DEL")[0])) {
                            clickElement(deleteAddress.get(j));
                        }
                    }
                }
            }
        }
        //TODO PA RNW - Other legal entity address - Mid
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Household_Entity_Locations_END"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations_END").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_END_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_END_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_END_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_END_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_END_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_END_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_END_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_END_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_END_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_END_1"), 0);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Household_Entity_Locations_OOS_END"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations_OOS_END").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_OOS_END_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_OOS_END_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_OOS_END_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_OOS_END_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_OOS_END_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_OOS_END_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_OOS_END_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_OOS_END_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_OOS_END_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_OOS_END_1"), 0);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHS_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Household_Entity_Locations_RNW"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations_RNW").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_RNW_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_RNW_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_RNW_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_RNW_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_RNW_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_RNW_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_RNW_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_RNW_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_RNW_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_RNW_1"), 0);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("What is the address(es) of the location the Legal Entity owns");
        if (hasValue(data.get("Household_Entity_Locations"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_1"), 0);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("What is the address(es) of the location the Legal Entity owns");
        if (hasValue(data.get("Household_Entity_Locations_END"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations_END").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_END_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_END_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_END_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_END_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_END_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_END_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_END_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_END_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_END_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_END_1"), 0);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("What is the address(es) of the location the Legal Entity owns");
        if (hasValue(data.get("Household_Entity_Locations_OOS_END"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations_OOS_END").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_OOS_END_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_OOS_END_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_OOS_END_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_OOS_END_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_OOS_END_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_OOS_END_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_OOS_END_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_OOS_END_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_OOS_END_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_OOS_END_1"), 0);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("What is the address(es) of the location the Legal Entity owns");
        if (hasValue(data.get("Household_Entity_Locations_RNW"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations_RNW").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_RNW_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_RNW_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_RNW_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_RNW_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_RNW_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_RNW_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_RNW_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_RNW_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_RNW_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_RNW_1"), 0);
                saveChanges();
            }
        }
    }

    public void clickBlock() {
        if(isElementDisplayed(block)) {
            clickElement(block, "Block");
        }
    }

    public void clickAdd() throws InterruptedException {
        clickElement(add, "Add");
        pause(2000);
    }

    public void clickAddAddressOfLocationLegalEntity() {
        clickElement(addAddressOfLocationLegalEntity, "Add");
    }

    public void setAddressLine1(String value, int i) {
        typeText(address1.get(i), value, "Address1_" + i);
    }

    public void setAddressLine2(String value, int i) {
        typeText(address2.get(i), value, "Address2_" + i);
    }

    public void setCity(String value, int i) {
        typeText(city.get(i), value, "City_" + i);
    }

    public void setState(String value, int i) {
        typeText(state.get(i), value, "State_" + i);
    }

    public void setZIP(String value, int i) {
        typeText(zip.get(i), value, "ZIP_" + i);
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC(Map<String, String> data, int index) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_LLC_" + index).split(",");
        if (householdEntityLocation.length >= 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_" + index + "_" + i), i - 1);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_" + index + "_" + i), i - 1);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_" + index + "_" + i), i - 1);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_" + index + "_" + i), i - 1);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_" + index + "_" + i), i - 1);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC_END(Map<String, String> data, int index) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_LLC_END_" + index).split(",");
        if (householdEntityLocation.length >= 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_END_" + index + "_" + i), i - 1);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_END_" + index + "_" + i), i - 1);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_END_" + index + "_" + i), i - 1);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_END_" + index + "_" + i), i - 1);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_END_" + index + "_" + i), i - 1);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC_OOS_END(Map<String, String> data, int index) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_LLC_OOS_END_" + index).split(",");
        if (householdEntityLocation.length >= 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_OOS_END_" + index + "_" + i), i - 1);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_OOS_END_" + index + "_" + i), i - 1);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_OOS_END_" + index + "_" + i), i - 1);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_OOS_END_" + index + "_" + i), i - 1);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_OOS_END_" + index + "_" + i), i - 1);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC_RNW(Map<String, String> data, int index) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_LLC_RNW_" + index).split(",");
        if (householdEntityLocation.length >= 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_RNW_" + index + "_" + i), i - 1);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_RNW_" + index + "_" + i), i - 1);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_RNW_" + index + "_" + i), i - 1);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_RNW_" + index + "_" + i), i - 1);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_RNW_" + index + "_" + i), i - 1);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockPF(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Household_Entity_Locations"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_1"), 0);
                saveChanges();
            }
        }
    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockFS(Map<String, String> data) {

    }

    public void fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockES(Map<String, String> data) throws Throwable {
        verifyBlockExists("What is the address(es) of the location the Legal Entity owns");
        if (hasValue(data.get("Household_Entity_Locations"))) {
            String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");
            if (householdEntityLocation.length > 1) {
                for (int i = 1; i <= householdEntityLocation.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_" + i), i - 1);
                    setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_" + i), i - 1);
                    setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_" + i), i - 1);
                    setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_" + i), i - 1);
                    setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setAddressLine1(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_1_1"), 0);
                setAddressLine2(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_Address_Line_2_1"), 0);
                setCity(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_City_1"), 0);
                setState(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_State_1"), 0);
                setZIP(data.get("What_Is_The_Address_Of_Location_Legal_Entity_Owns_ZIP_1"), 0);
                saveChanges();
            }
        }
    }
}