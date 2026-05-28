package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class OwnershipBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public OwnershipBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Vehicle Titled in the Name of')]/../../../..//input")
    WebElement vehicleTitledInTheName;
    @FindBy(xpath = "//div[contains(text(),'Vehicle Titled/Registered in the Name of')]/../../../..//input")
    WebElement vehicleTitledRegisteredInTheName;
    @FindBy(xpath = "//div[contains(text(),'Additional Name on the ID')]/../../../..//input")
    WebElement additionalNameOnTheID;
    @FindBy(xpath = "//div[contains(text(),'Ownership')]/../../../..//input")
    WebElement ownership;
    @FindBy(xpath = "//div[contains(text(),'Is there an Additional Insured or Trust that needs to be listed on this vehicle?')]/../../../..//label[text()='No']/..//input")
    WebElement isThereAnAdditionalInsuredNo;
    @FindBy(xpath = "//div[contains(text(),'Is there an Additional Insured or Trust that needs to be listed on this vehicle?')]/../../../..//label[text()='Yes']/..//input")
    WebElement isThereAnAdditionalInsuredYes;

    public void fillOwnershipDetailsPA(Map<String, String> data, int i) throws Throwable {
        verifyBlockExists("ownership");
        setOwnership(data.get("Ownership_Ownership_" + i));
        clickElement(saveChanges);
        if (data.get("Ownership_Ownership_" + i).equalsIgnoreCase("Owned")) {
            if (!data.get("State").equalsIgnoreCase("ND") &&
                    !data.get("State").equalsIgnoreCase("NH") &&
                    !data.get("State").equalsIgnoreCase("OR") &&
                    !data.get("State").equalsIgnoreCase("WT") &&
                    !data.get("State").equalsIgnoreCase("HI") &&
                    !data.get("State").equalsIgnoreCase("WV") &&
                    !data.get("State").equalsIgnoreCase("DE") &&
                    !data.get("State").equalsIgnoreCase("ME") &&
                    !data.get("State").equalsIgnoreCase("SD") &&
                    !data.get("State").equalsIgnoreCase("NC") &&
                    !data.get("State").equalsIgnoreCase("VT") &&
                    !data.get("State").equalsIgnoreCase("ID") &&
                    !data.get("State").equalsIgnoreCase("NE") &&
                    !data.get("State").equalsIgnoreCase("IA") &&
                    !data.get("State").equalsIgnoreCase("CA") &&
                    !data.get("State").equalsIgnoreCase("MS") &&
                    !data.get("State").equalsIgnoreCase("WA") &&
                    !data.get("State").equalsIgnoreCase("MT") &&
                    !data.get("State").equalsIgnoreCase("OK"))
                setIsThereAnAdditionalInsured(data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_" + i));
        }
        setVehicleTitledWrapped(data, i);
        if (data.get("Additional_Operators").split(",").length >= 1) {
            setAdditionalNameOnTheIDWrapped(data, i);
        }
    }

    public void fillOwnershipDetailsPA_END(Map<String, String> data, int i) throws Throwable {
        setOwnership(data.get("Ownership_Ownership_END_" + i));
        clickElement(saveChanges);
        if (data.get("Ownership_Ownership_END_" + i).equalsIgnoreCase("Owned")) {
            if (!data.get("State").equalsIgnoreCase("ND") &&
                    !data.get("State").equalsIgnoreCase("NH") &&
                    !data.get("State").equalsIgnoreCase("OR") &&
                    !data.get("State").equalsIgnoreCase("WT") &&
                    !data.get("State").equalsIgnoreCase("HI") &&
                    !data.get("State").equalsIgnoreCase("WV") &&
                    !data.get("State").equalsIgnoreCase("DE") &&
                    !data.get("State").equalsIgnoreCase("ME") &&
                    !data.get("State").equalsIgnoreCase("SD") &&
                    !data.get("State").equalsIgnoreCase("NC") &&
                    !data.get("State").equalsIgnoreCase("VT") &&
                    !data.get("State").equalsIgnoreCase("ID") &&
                    !data.get("State").equalsIgnoreCase("NE") &&
                    !data.get("State").equalsIgnoreCase("IA") &&
                    !data.get("State").equalsIgnoreCase("CA") &&
                    !data.get("State").equalsIgnoreCase("MS") &&
                    !data.get("State").equalsIgnoreCase("WA") &&
                    !data.get("State").equalsIgnoreCase("MT") &&
                    !data.get("State").equalsIgnoreCase("OK"))
                setIsThereAnAdditionalInsured(data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_END_" + i));
        }
        setVehicleTitledWrapped_END(data, i);
        if (data.get("Additional_Operators").split(",").length >= 1 || data.get("Additional_Operators_END").split(",").length >= 1) {
            setAdditionalNameOnTheIDWrapped_END(data, i);
        }
    }

    public void fillOwnershipDetailsPA_OOS_END(Map<String, String> data, int i) throws Throwable {
        setOwnership(data.get("Ownership_Ownership_OOS_END_" + i));
        clickElement(saveChanges);
        if (data.get("Ownership_Ownership_OOS_END_" + i).equalsIgnoreCase("Owned")) {
            if (!data.get("State").equalsIgnoreCase("ND") &&
                    !data.get("State").equalsIgnoreCase("NH") &&
                    !data.get("State").equalsIgnoreCase("OR") &&
                    !data.get("State").equalsIgnoreCase("WT") &&
                    !data.get("State").equalsIgnoreCase("HI") &&
                    !data.get("State").equalsIgnoreCase("WV") &&
                    !data.get("State").equalsIgnoreCase("DE") &&
                    !data.get("State").equalsIgnoreCase("ME") &&
                    !data.get("State").equalsIgnoreCase("SD") &&
                    !data.get("State").equalsIgnoreCase("NC") &&
                    !data.get("State").equalsIgnoreCase("VT") &&
                    !data.get("State").equalsIgnoreCase("ID") &&
                    !data.get("State").equalsIgnoreCase("NE") &&
                    !data.get("State").equalsIgnoreCase("IA") &&
                    !data.get("State").equalsIgnoreCase("CA") &&
                    !data.get("State").equalsIgnoreCase("MS") &&
                    !data.get("State").equalsIgnoreCase("WA") &&
                    !data.get("State").equalsIgnoreCase("MT") &&
                    !data.get("State").equalsIgnoreCase("OK"))
                setIsThereAnAdditionalInsured(data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_OOS_END_" + i));
        }
        setVehicleTitledWrapped_OOS_END(data, i);
        if (data.get("Additional_Operators").split(",").length >= 1 || data.get("Additional_Operators_OOS_END").split(",").length >= 1) {
            setAdditionalNameOnTheIDWrapped_OOS_END(data, i);
        }
    }

    public void fillOwnershipDetailsPA_RNW(Map<String, String> data, int i) throws Throwable {
        setOwnership(data.get("Ownership_Ownership_RNW_" + i));
        clickElement(saveChanges);
        if (data.get("Ownership_Ownership_RNW_" + i).equalsIgnoreCase("Owned")) {
            if (!data.get("State").equalsIgnoreCase("ND") &&
                    !data.get("State").equalsIgnoreCase("NH") &&
                    !data.get("State").equalsIgnoreCase("OR") &&
                    !data.get("State").equalsIgnoreCase("WT") &&
                    !data.get("State").equalsIgnoreCase("HI") &&
                    !data.get("State").equalsIgnoreCase("WV") &&
                    !data.get("State").equalsIgnoreCase("DE") &&
                    !data.get("State").equalsIgnoreCase("ME") &&
                    !data.get("State").equalsIgnoreCase("SD") &&
                    !data.get("State").equalsIgnoreCase("NC") &&
                    !data.get("State").equalsIgnoreCase("VT") &&
                    !data.get("State").equalsIgnoreCase("ID") &&
                    !data.get("State").equalsIgnoreCase("NE") &&
                    !data.get("State").equalsIgnoreCase("IA") &&
                    !data.get("State").equalsIgnoreCase("CA") &&
                    !data.get("State").equalsIgnoreCase("MS") &&
                    !data.get("State").equalsIgnoreCase("WA") &&
                    !data.get("State").equalsIgnoreCase("MT") &&
                    !data.get("State").equalsIgnoreCase("OK"))
                setIsThereAnAdditionalInsured(data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_RNW_" + i));
        }
        setVehicleTitledWrapped_RNW(data, i);
        if (data.get("Additional_Operators").split(",").length >= 1 || data.get("Additional_Operators_RNW").split(",").length >= 1) {
            setAdditionalNameOnTheIDWrapped_RNW(data, i);
        }
    }


    public void setIsThereAnAdditionalInsured(String value) throws Throwable {
        pause(1000);
        choose(isThereAnAdditionalInsuredYes, isThereAnAdditionalInsuredNo, value, "Is There An Additional Insured");
    }

    public void setVehicleTitledInTheName(String value) throws Throwable {
        try {
            typeTextEnter(vehicleTitledInTheName, value, value);
        } catch (Exception e) {
            typeTextEnter(vehicleTitledRegisteredInTheName, value, value);
        }

    }

    public void setAdditionalNameOnTheIDWrapped(Map<String, String> data, int i) throws Throwable {
        try {
            if (data.get("Optional_For_Quote_Required_To_Bind_Additional_Name_On_The_ID_Card_" + i).equalsIgnoreCase("Driver")) {
                if (hasValue(data.get("MI"))) {
                    setAdditionalNameOnTheID(data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name"));
                } else {
                    setAdditionalNameOnTheID(data.get("First_Name") + " " + data.get("Last_Name"));
                }
            } else {
                setAdditionalNameOnTheID(data.get("Optional_For_Quote_Required_To_Bind_Additional_Name_On_The_ID_Card_" + i));
            }
        } catch (Exception e) {

        }
    }

    public void setAdditionalNameOnTheIDWrapped_END(Map<String, String> data, int i) throws Throwable {
        try {
            if (data.get("Optional_For_Quote_Required_To_Bind_Additional_Name_On_The_ID_Card_END_" + i).equalsIgnoreCase("Driver")) {
                if (hasValue(data.get("MI"))) {
                    setAdditionalNameOnTheID(data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name"));
                } else {
                    setAdditionalNameOnTheID(data.get("First_Name") + " " + data.get("Last_Name"));
                }
            } else {
                setAdditionalNameOnTheID(data.get("Optional_For_Quote_Required_To_Bind_Additional_Name_On_The_ID_Card_END_" + i));
            }
        } catch (Exception e) {

        }
    }

    public void setAdditionalNameOnTheIDWrapped_OOS_END(Map<String, String> data, int i) {
        try {
            if (data.get("Optional_For_Quote_Required_To_Bind_Additional_Name_On_The_ID_Card_OOS_END_" + i).equalsIgnoreCase("Driver")) {
                if (hasValue(data.get("MI"))) {
                    setAdditionalNameOnTheID(data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name"));
                } else {
                    setAdditionalNameOnTheID(data.get("First_Name") + " " + data.get("Last_Name"));
                }
            } else {
                setAdditionalNameOnTheID(data.get("Optional_For_Quote_Required_To_Bind_Additional_Name_On_The_ID_Card_OOS_END_" + i));
            }
        } catch (Exception e) {

        }
    }

    public void setAdditionalNameOnTheIDWrapped_RNW(Map<String, String> data, int i) {
        try {
            if (data.get("Optional_For_Quote_Required_To_Bind_Additional_Name_On_The_ID_Card_RNW_" + i).equalsIgnoreCase("Driver")) {
                if (hasValue(data.get("MI"))) {
                    setAdditionalNameOnTheID(data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name"));
                } else {
                    setAdditionalNameOnTheID(data.get("First_Name") + " " + data.get("Last_Name"));
                }
            } else {
                setAdditionalNameOnTheID(data.get("Optional_For_Quote_Required_To_Bind_Additional_Name_On_The_ID_Card_RNW_" + i));
            }
        } catch (Exception e) {

        }
    }

    public void setAdditionalNameOnTheID(String value) {
        typeTextEnter(additionalNameOnTheID, value, "Additional Name on the ID");
    }

    public void setOwnership(String value) throws Throwable {
        typeText(ownership, value);
    }

    public void setVehicleTitledWrapped(Map<String, String> data, int i) throws Throwable {
        pause(3000);
        try {
            if (data.get("Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_" + i).equalsIgnoreCase("Driver")) {
                if (hasValue(data.get("MI"))) {
                    setVehicleTitledInTheName(data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name"));
                } else {
                    setVehicleTitledInTheName(data.get("First_Name") + " " + data.get("Last_Name"));
                }
            } else {
                setVehicleTitledInTheName(data.get("Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_" + i));
            }
        } catch (Exception e) {

        }
    }

    public void setVehicleTitledWrapped_END(Map<String, String> data, int i) throws Throwable {
        try {
            if (data.get("Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_END_" + i).equalsIgnoreCase("Driver")) {
                if (hasValue(data.get("MI"))) {
                    setVehicleTitledInTheName(data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name"));
                } else {
                    setVehicleTitledInTheName(data.get("First_Name") + " " + data.get("Last_Name"));
                }
            } else {
                setVehicleTitledInTheName(data.get("Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_END_" + i));
            }
        } catch (Exception e) {

        }
    }

    public void setVehicleTitledWrapped_OOS_END(Map<String, String> data, int i) {
        try {
            if (data.get("Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_OOS_END_" + i).equalsIgnoreCase("Driver")) {
                if (hasValue(data.get("MI"))) {
                    setVehicleTitledInTheName(data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name"));
                } else {
                    setVehicleTitledInTheName(data.get("First_Name") + " " + data.get("Last_Name"));
                }
            } else {
                setVehicleTitledInTheName(data.get("Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_OOS_END_" + i));
            }
        } catch (Exception e) {

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void setVehicleTitledWrapped_RNW(Map<String, String> data, int i) {
        try {
            if (data.get("Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_RNW_" + i).equalsIgnoreCase("Driver")) {
                if (hasValue(data.get("MI"))) {
                    setVehicleTitledInTheName(data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name"));
                } else {
                    setVehicleTitledInTheName(data.get("First_Name") + " " + data.get("Last_Name"));
                }
            } else {
                setVehicleTitledInTheName(data.get("Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_RNW_" + i));
            }
        } catch (Exception e) {

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}