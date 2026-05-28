package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.utils.SoftAssertion;

import java.util.List;
import java.util.Map;

public class AdditionalOperatorsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public AdditionalOperatorsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='additional operators']/../../../../../..//span[text()='add'] | //div[contains(text(),'Operators manually added')]/../../../../../..//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='additional operators']  |  //div[contains(text(),'Operators manually added')]")
    WebElement additionalOperatorsBlock;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='Prefix']/../../../../div//input")
    List<WebElement> prefix;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='First Name']/../../../../div//input")
    List<WebElement> firstName;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='MI']/../../../../div//input")
    List<WebElement> mi;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='Last Name']/../../../../div//input")
    List<WebElement> lastName;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='Suffix']/../../../../div//input")
    List<WebElement> suffix;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='Date of Birth']/../../../../div//input")
    List<WebElement> dob;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='Driver Status']/../../../../div//input")
    List<WebElement> driverStatus;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//label[text()='Exclude']/..//input")
    List<WebElement> exclude;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='Non-Driver Reason']/../../../../div//input")
    List<WebElement> nonDriverReason;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='Gender']/../../../../div//input")
    List<WebElement> gender;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='License State']/../../../../div//input")
    List<WebElement> licenseState;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='License Number']/../../../../div//input")
    List<WebElement> licenseNumber;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//td//div[text()='Relationship to Insured' or text()='Relationship to insured']/../../../../div//input")
    List<WebElement> relationshipToInsured;
    @FindBy(xpath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'operators')]/../../../../../..//span[text()='delete']")
    List<WebElement> deleteOperator;
    @FindBy(xpath = "//div[contains(text(),\"resided at the policy location\")]/../../../..//label[text()='No']")
    List<WebElement> residedAtPolicyLocationNo;
    @FindBy(xpath = "//div[contains(text(),\"resided at the policy location\")]/../../../..//label[text()='Yes']")
    List<WebElement> residedAtPolicyLocationYes;

    public void fillAdditionalOperatorsDetailsPA(Map<String, String> data) throws Throwable {
        //verifyBlockExists("additional operators");
        String[] additionalOperators = data.get("Additional_Operators").split(",");

        for (int i = 1; i <= additionalOperators.length; i++) {
            addAdditionalOperator();
            clickElement(additionalOperatorsBlock);
            pause(3000);
        }

        setDriverStatus(data.get("Additional_Operators_Driver_Driver_Status"), data.get("State"));
        if (data.get("Additional_Operators_Driver_Driver_Status").equalsIgnoreCase("Non-Driver")) {
            setNonDriverReason(data.get("Additional_Operators_Driver_Non_Driver_Reason"));
        }
        setDriverPrefix(data.get("Additional_Operators_Driver_Prefix"));
        setDriverFirstName(data.get("Additional_Operators_First_Name"));
        setDriverMI(data.get("Additional_Operators_Driver_MI"));
        setDriverLastName(data.get("Additional_Operators_Driver_Last_Name"));
        setDriverSuffix(data.get("Additional_Operators_Driver_Suffix"));
        setDriverDOB(data.get("Additional_Operators_Driver_Date_Of_Birth"));
//        if (data.get("State").equalsIgnoreCase("AZ") ||
//                data.get("State").equalsIgnoreCase("IL") ||
//                data.get("State").equalsIgnoreCase("MO")) {
//            setExclude(data.get("Additional_Operators_Driver_Exclude"));
//        }
        setExclude(data.get("Additional_Operators_Driver_Exclude"));
        setDriverGender(data.get("Additional_Operators_Driver_Gender"));
        setDriverLicenseState(data.get("Additional_Operators_Driver_License_State"));
        setDriverLicenseNumber(data.get("Additional_Operators_Driver_License_Number"));
        setRelationshipToInsured(data.get("Additional_Operators_Driver_Relationship_To_Insured"));

        saveChanges();

        for (int i = 1; i <= additionalOperators.length; i++) {
            setAdditionalOperatorDriverStatus(data.get("Additional_Operators_Additional_Driver_Driver_Status_" + i), data.get("State"), i);
            if (data.get("Additional_Operators_Additional_Driver_Driver_Status_" + i).equalsIgnoreCase("Non-Driver")) {
                setAdditionalOperatorNonDriverReason(data.get("Additional_Operators_Additional_Driver_Non_Driver_Reason_" + i), i);
            }
            setAdditionalOperatorPrefix(data.get("Additional_Operators_Additional_Driver_Prefix_" + i), i);
            setAdditionalOperatorFirstName(data.get("Additional_Operators_Additional_Driver_First_Name_" + i), i);
            setAdditionalOperatorMI(data.get("Additional_Operators_Additional_Driver_MI_" + i), i);
            setAdditionalOperatorLastName(data.get("Additional_Operators_Additional_Driver_Last_Name_" + i), i);
            setAdditionalOperatorSuffix(data.get("Additional_Operators_Additional_Driver_Suffix_" + i), i);
            setAdditionalOperatorDOB(data.get("Additional_Operators_Additional_Driver_Date_Of_Birth_" + i), i);
//            if (data.get("State").equalsIgnoreCase("AZ") ||
//                    data.get("State").equalsIgnoreCase("IL") ||
//                    data.get("State").equalsIgnoreCase("MO") ||
//                    data.get("State").equalsIgnoreCase("SC") ||
//                    data.get("State").equalsIgnoreCase("FL") ||
//                    data.get("State").equalsIgnoreCase("MI") ||
//                    data.get("State").equalsIgnoreCase("AR") ||
//                    data.get("State").equalsIgnoreCase("NM") ||
//                    data.get("State").equalsIgnoreCase("IN")) {
//                setAdditionalDriverExclude(data.get("Additional_Operators_Additional_Driver_Exclude_" + i), i);
//            }
            setAdditionalDriverExclude(data.get("Additional_Operators_Additional_Driver_Exclude_" + i), i);
            setAdditionalDriverGender(data.get("Additional_Operators_Additional_Driver_Gender_" + i), i);
            setAdditionalDriverLicenseState(data.get("Additional_Operators_Additional_Driver_License_State_" + i), i);
            setAdditionalDriverLicenseNumber(data.get("Additional_Operators_Additional_Driver_License_Number_" + i), i);
            setAdditionalRelationshipToInsured(data.get("Additional_Operators_Additional_Driver_Relationship_To_Insured_" + i), i);

            saveChanges();
        }
    }

    public void fillAdditionalOperatorsDetailsPA_END(Map<String, String> data) throws Throwable {
        if (firstName.size() > 0) {
            clickElement(additionalOperatorsBlock);
            setDriverGender(data.get("Driver_Gender_END"));
            setDriverLicenseState(data.get("Drivers_License_State_END"));
            setDriverLicenseNumber(data.get("Drivers_License_Number_END"));
            setDriverStatus(data.get("Operator_Driver_Status_END"), data.get("State"));
            saveChanges();
            if (hasValue(data.get("Operator_Driver_Status_END")) && data.get("Operator_Driver_Status_END").equalsIgnoreCase("Non-Driver")) {
                setNonDriverReason(data.get("Driver_NonDriver_Reason_END"));
            }
        }

        saveChanges();

        //Will work only when END is the first transaction after NB
        String[] additionalOperatorsNB = data.get("Additional_Operators").split(",");
        String[] additionalOperatorsEND = data.get("Additional_Operators_END").split(",");

        //Modify NB additional operators
        for (int i = 1; i <= additionalOperatorsEND.length; i++) {
            if (additionalOperatorsEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < additionalOperatorsNB.length; j++) {
                    if (additionalOperatorsNB[j].equalsIgnoreCase(additionalOperatorsEND[i - 1].split("_MOD")[0])) {
                        setAdditionalOperatorPrefix(data.get("Additional_Operators_Additional_Driver_Prefix_END_" + i), j + 1);
                        setAdditionalOperatorFirstName(data.get("Additional_Operators_Additional_Driver_First_Name_END_" + i), j + 1);
                        setAdditionalOperatorMI(data.get("Additional_Operators_Additional_Driver_MI_END_" + i), j + 1);
                        setAdditionalOperatorLastName(data.get("Additional_Operators_Additional_Driver_Last_Name_END_" + i), j + 1);
                        setAdditionalOperatorSuffix(data.get("Additional_Operators_Additional_Driver_Suffix_END_" + i), j + 1);
                        setAdditionalOperatorDOB(data.get("Additional_Operators_Additional_Driver_Date_Of_Birth_END_" + i), j + 1);
                        setAdditionalOperatorDriverStatus(data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i), data.get("State"), j + 1);
                        setAdditionalDriverGender(data.get("Additional_Operators_Additional_Driver_Gender_END_" + i), j + 1);
                        setAdditionalDriverLicenseState(data.get("Additional_Operators_Additional_Driver_License_State_END_" + i), j + 1);
                        setAdditionalDriverLicenseNumber(data.get("Additional_Operators_Additional_Driver_License_Number_END_" + i), j + 1);
                        if (data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Non-Driver")) {
                            setAdditionalOperatorNonDriverReason(data.get("Additional_Operators_Additional_Driver_Non_Driver_Reason_END_" + i), j + 1);
                        }
                        saveChanges();
                    }
                }
            }
        }

        int totalCount = additionalOperatorsNB.length;

        //Add additional operators
        for (int i = 1; i <= additionalOperatorsEND.length; i++) {
            if (additionalOperatorsEND[i - 1].contains("_ADD")) {
                totalCount++;

                addAdditionalOperator();
                clickElement(additionalOperatorsBlock);
                pause(5000);

                setAdditionalOperatorPrefix(data.get("Additional_Operators_Additional_Driver_Prefix_END_" + i), totalCount);
                setAdditionalOperatorFirstName(data.get("Additional_Operators_Additional_Driver_First_Name_END_" + i), totalCount);
                setAdditionalOperatorMI(data.get("Additional_Operators_Additional_Driver_MI_END_" + i), totalCount);
                setAdditionalOperatorLastName(data.get("Additional_Operators_Additional_Driver_Last_Name_END_" + i), totalCount);
                setAdditionalOperatorSuffix(data.get("Additional_Operators_Additional_Driver_Suffix_END_" + i), totalCount);
                setAdditionalOperatorDOB(data.get("Additional_Operators_Additional_Driver_Date_Of_Birth_END_" + i), totalCount);
                setAdditionalOperatorDriverStatus(data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i), data.get("State"), totalCount);
                if (!data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Not in Household") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Deceased") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Duplicate") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Driver Unknown") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("LLC/Trust/Corp")) {
                    setAdditionalDriverGender(data.get("Additional_Operators_Additional_Driver_Gender_END_" + i), totalCount);
                    setAdditionalDriverLicenseState(data.get("Additional_Operators_Additional_Driver_License_State_END_" + i), totalCount);
                    setAdditionalDriverLicenseNumber(data.get("Additional_Operators_Additional_Driver_License_Number_END_" + i), totalCount);
                    setRelationshipToInsured(data.get("Additional_Operators_Additional_Driver_Relationship_To_Insured_END_" + i), totalCount);
                }
                if (data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Non-Driver")) {
                    setAdditionalOperatorNonDriverReason(data.get("Additional_Operators_Additional_Driver_Non_Driver_Reason_END_" + i), totalCount);
                }
                saveChanges();
            }
        }

        //Delete additional operators
        for (int i = 0; i < additionalOperatorsEND.length; i++) {
            if (additionalOperatorsEND[i].contains("_DEL")) {
                for (int j = 0; j < additionalOperatorsNB.length; j++) {
                    if (additionalOperatorsNB[j].equalsIgnoreCase(additionalOperatorsEND[i].split("_DEL")[0])) {
                        clickElement(deleteOperator.get(j + 1));
                    }
                }
            }
        }

    }

    public void fillAdditionalOperatorsDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        if (firstName.size() > 0) {
            clickElement(additionalOperatorsBlock);
            setDriverGender(data.get("Driver_Gender_OOS_END"));
            setDriverLicenseState(data.get("Drivers_License_State_OOS_END"));
            setDriverLicenseNumber(data.get("Drivers_License_Number_OOS_END"));
            setDriverStatus(data.get("Operator_Driver_Status_OOS_END"), data.get("State"));
            saveChanges();
            if (hasValue(data.get("Operator_Driver_Status_OOS_END")) && data.get("Operator_Driver_Status_OOS_END").equalsIgnoreCase("Non-Driver")) {
                setNonDriverReason(data.get("Driver_NonDriver_Reason_OOS_END"));
            }
        }

        saveChanges();

        String[] transactions = data.get("Transactions").split(",");

        String[] additionalOperatorsNB = data.get("Additional_Operators").split(",");
        String[] additionalOperatorsEND = data.get("Additional_Operators_END").split(",");
        String[] additionalOperatorsRNW = data.get("Additional_Operators_RNW").split(",");
        String[] additionalOperatorsOOSEND = data.get("Additional_Operators_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = additionalOperatorsNB.length;

        //If there was END transaction and it happened before OOS add END to the total count
        if (endPosition > -1 && endPosition < oosPosition) {
            for (String s : additionalOperatorsEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was RNW transaction and it happened before OOS add RNW to the total count
        if (rnwPosition > -1 && rnwPosition < oosPosition) {
            for (String s : additionalOperatorsRNW) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //Add additional operators
        for (int i = 1; i <= additionalOperatorsOOSEND.length; i++) {
            if (additionalOperatorsOOSEND[i - 1].contains("_ADD")) {
                totalCount++;

                addAdditionalOperator();
                clickElement(additionalOperatorsBlock);
                pause(5000);

                setAdditionalOperatorPrefix(data.get("Additional_Operators_Additional_Driver_Prefix_OOS_END_" + i), totalCount);
                setAdditionalOperatorFirstName(data.get("Additional_Operators_Additional_Driver_First_Name_OOS_END_" + i), totalCount);
                setAdditionalOperatorMI(data.get("Additional_Operators_Additional_Driver_MI_OOS_END_" + i), totalCount);
                setAdditionalOperatorLastName(data.get("Additional_Operators_Additional_Driver_Last_Name_OOS_END_" + i), totalCount);
                setAdditionalOperatorSuffix(data.get("Additional_Operators_Additional_Driver_Suffix_OOS_END_" + i), totalCount);
                setAdditionalOperatorDOB(data.get("Additional_Operators_Additional_Driver_Date_Of_Birth_OOS_END_" + i), totalCount);
                setAdditionalOperatorDriverStatus(data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i), data.get("State"), totalCount);
                setAdditionalDriverGender(data.get("Additional_Operators_Additional_Driver_Gender_OOS_END_" + i), totalCount);
                setAdditionalDriverLicenseState(data.get("Additional_Operators_Additional_Driver_License_State_OOS_END_" + i), totalCount);
                setAdditionalDriverLicenseNumber(data.get("Additional_Operators_Additional_Driver_License_Number_OOS_END_" + i), totalCount);
                if (data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Non-Driver")) {
                    setAdditionalOperatorNonDriverReason(data.get("Additional_Operators_Additional_Driver_Non_Driver_Reason_OOS_END_" + i), totalCount);
                }
                saveChanges();
            }
        }

//        Modify NB additional operators
//        Will not take into the account entries that were deleted/added on END/RNW
//        for (int i = 1; i <= additionalOperatorsOOSEND.length; i++) {
//            if (additionalOperatorsOOSEND[i-1].contains("_MOD")) {
//                for(int j = 0; j < additionalOperatorsNB.length; j++){
//                    if(additionalOperatorsNB[j].equalsIgnoreCase(additionalOperatorsOOSEND[i-1].split("_MOD")[0])){
//                        setAdditionalOperatorPrefix(data.get("Additional_Operators_Additional_Driver_Prefix_OOS_END_" + i), j + 1);
//                        setAdditionalOperatorFirstName(data.get("Additional_Operators_Additional_Driver_First_Name_OOS_END_" + i), j + 1);
//                        setAdditionalOperatorMI(data.get("Additional_Operators_Additional_Driver_MI_OOS_END_" + i), j + 1);
//                        setAdditionalOperatorLastName(data.get("Additional_Operators_Additional_Driver_Last_Name_OOS_END_" + i), j + 1);
//                        setAdditionalOperatorSuffix(data.get("Additional_Operators_Additional_Driver_Suffix_OOS_END_" + i), j + 1);
//                        setAdditionalOperatorDOB(data.get("Additional_Operators_Additional_Driver_Date_Of_Birth_OOS_END_" + i), j + 1);
//                        setAdditionalOperatorDriverStatus(data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i), data.get("State"), j + 1);
//                        setAdditionalDriverGender(data.get("Additional_Operators_Additional_Driver_Gender_OOS_END_" + i), j + 1);
//                        setAdditionalDriverLicenseState(data.get("Additional_Operators_Additional_Driver_License_State_OOS_END_" + i), j + 1);
//                        setAdditionalDriverLicenseNumber(data.get("Additional_Operators_Additional_Driver_License_Number_OOS_END_" + i), j + 1);
//                        if (data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Non-Driver")) {
//                            setAdditionalOperatorNonDriverReason(data.get("Additional_Operators_Additional_Driver_Non_Driver_Reason_OOS_END_" + i), j + 1);
//                        }
//                        saveChanges();
//                    }
//                }
//            }
//        }

//        Delete additional operators
//        for (int i = 0; i < additionalOperatorsOOSEND.length; i++) {
//            if (additionalOperatorsOOSEND[i].contains("_DEL")) {
//                for (int j = 0; j < additionalOperatorsNB.length; j++) {
//                    if (additionalOperatorsNB[j].equalsIgnoreCase(additionalOperatorsOOSEND[i].split("_DEL")[0])) {
//                        clickElement(deleteOperator.get(j+1));
//                    }
//                }
//            }
//        }

        //TODO PA OOS - Additional operators - Deletion and Modification - Mid
    }

    public void fillAdditionalOperatorsDetailsPA_RNW(Map<String, String> data) throws Throwable {
        if (firstName.size() > 0) {
            clickElement(additionalOperatorsBlock);
            setDriverGender(data.get("Driver_Gender_RNW"));
            setDriverLicenseState(data.get("Drivers_License_State_RNW"));
            setDriverLicenseNumber(data.get("Drivers_License_Number_RNW"));
            setDriverStatus(data.get("Operator_Driver_Status_RNW"), data.get("State"));
            saveChanges();
            if (hasValue(data.get("Operator_Driver_Status_RNW")) && data.get("Operator_Driver_Status_RNW").equalsIgnoreCase("Non-Driver")) {
                setNonDriverReason(data.get("Driver_NonDriver_Reason_RNW"));
            }
        }

        saveChanges();

        String[] transactions = data.get("Transactions").split(",");

        String[] additionalOperatorsNB = data.get("Additional_Operators").split(",");
        String[] additionalOperatorsEND = data.get("Additional_Operators_END").split(",");
        String[] additionalOperatorsRNW = data.get("Additional_Operators_RNW").split(",");
        String[] additionalOperatorsOOSEND = data.get("Additional_Operators_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = additionalOperatorsNB.length;

        //If there was END transaction and it happened before RNW add END to the total count
        if (endPosition > -1 && endPosition < rnwPosition) {
            for (String s : additionalOperatorsEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was OOS transaction and it happened before RNW add OOS to the total count
        if (oosPosition > -1 && oosPosition < rnwPosition) {
            for (String s : additionalOperatorsOOSEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //Add operators
        for (int i = 1; i <= additionalOperatorsRNW.length; i++) {
            if (additionalOperatorsRNW[i - 1].contains("_ADD")) {
                totalCount++;

                addAdditionalOperator();
                clickElement(additionalOperatorsBlock);
                pause(5000);

                setAdditionalOperatorPrefix(data.get("Additional_Operators_Additional_Driver_Prefix_RNW_" + i), totalCount);
                setAdditionalOperatorFirstName(data.get("Additional_Operators_Additional_Driver_First_Name_RNW_" + i), totalCount);
                setAdditionalOperatorMI(data.get("Additional_Operators_Additional_Driver_MI_RNW_" + i), totalCount);
                setAdditionalOperatorLastName(data.get("Additional_Operators_Additional_Driver_Last_Name_RNW_" + i), totalCount);
                setAdditionalOperatorSuffix(data.get("Additional_Operators_Additional_Driver_Suffix_RNW_" + i), totalCount);
                setAdditionalOperatorDOB(data.get("Additional_Operators_Additional_Driver_Date_Of_Birth_RNW_" + i), totalCount);
                setAdditionalOperatorDriverStatus(data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i), data.get("State"), totalCount);
                setAdditionalDriverGender(data.get("Additional_Operators_Additional_Driver_Gender_RNW_" + i), totalCount);
                setAdditionalDriverLicenseState(data.get("Additional_Operators_Additional_Driver_License_State_RNW_" + i), totalCount);
                setAdditionalDriverLicenseNumber(data.get("Additional_Operators_Additional_Driver_License_Number_RNW_" + i), totalCount);
                if (data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Non-Driver")) {
                    setAdditionalOperatorNonDriverReason(data.get("Additional_Operators_Additional_Driver_Non_Driver_Reason_RNW_" + i), totalCount);
                }
                saveChanges();
            }
        }

//        Modify operators
//        for (int i = 1; i <= additionalOperatorsEND.length; i++) {
//            if (additionalOperatorsEND[i-1].contains("_MOD")) {
//                for(int j = 0; j < additionalOperatorsNB.length; j++){
//                    if(additionalOperatorsNB[j].equalsIgnoreCase(additionalOperatorsEND[i-1].split("_MOD")[0])){
//                        setAdditionalOperatorPrefix(data.get("Additional_Operators_Additional_Driver_Prefix_RNW_" + i), j + 1);
//                        setAdditionalOperatorFirstName(data.get("Additional_Operators_Additional_Driver_First_Name_RNW_" + i), j + 1);
//                        setAdditionalOperatorMI(data.get("Additional_Operators_Additional_Driver_MI_RNW_" + i), j + 1);
//                        setAdditionalOperatorLastName(data.get("Additional_Operators_Additional_Driver_Last_Name_RNW_" + i), j + 1);
//                        setAdditionalOperatorSuffix(data.get("Additional_Operators_Additional_Driver_Suffix_RNW_" + i), j + 1);
//                        setAdditionalOperatorDOB(data.get("Additional_Operators_Additional_Driver_Date_Of_Birth_RNW_" + i), j + 1);
//                        setAdditionalOperatorDriverStatus(data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i), data.get("State"), j + 1);
//                        setAdditionalDriverGender(data.get("Additional_Operators_Additional_Driver_Gender_RNW_" + i), j + 1);
//                        setAdditionalDriverLicenseState(data.get("Additional_Operators_Additional_Driver_License_State_RNW_" + i), j + 1);
//                        setAdditionalDriverLicenseNumber(data.get("Additional_Operators_Additional_Driver_License_Number_RNW_" + i), j + 1);
//                        if (data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Non-Driver")) {
//                            setAdditionalOperatorNonDriverReason(data.get("Additional_Operators_Additional_Driver_Non_Driver_Reason_RNW_" + i), j + 1);
//                        }
//                        saveChanges();
//                    }
//                }
//            }
//        }

//        Delete operators
//        for (int i = 0; i < additionalOperatorsEND.length; i++) {
//            if (additionalOperatorsEND[i].contains("_DEL")) {
//                for (int j = 0; j < additionalOperatorsNB.length; j++) {
//                    if (additionalOperatorsNB[j].equalsIgnoreCase(additionalOperatorsEND[i].split("_DEL")[0])) {
//                        clickElement(deleteOperator.get(j+1));
//                    }
//                }
//            }
//        }
//        TODO PA RNW - Additional operators - Modification and Deletion - Mid
    }

    public void addAdditionalOperator() throws Throwable {
        clickElement(add);
        pause(1000);
    }

    public void setExclude(String value) throws Throwable {
        if (!exclude.isEmpty()) {
            checkCheckbox(exclude.get(0), value, "Exclude");
        }
    }

    public void setAdditionalDriverExclude(String value, int i) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("Yes") && !exclude.isEmpty()) {
                checkCheckbox(exclude.get(i), value, "Exclude");
            }
        }
    }

    public void setDriverPrefix(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(prefix.get(0), "Prefix");
            typeText(driver.switchTo().activeElement(), value, "Prefix");
            pause(2000);
            clickElement(additionalOperatorsBlock, "Additional operators block");
        }
    }

    public void setDriverFirstName(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(firstName.get(0), "First Name");
            typeText(driver.switchTo().activeElement(), value, "First Name");
            pause(2000);
            clickElement(additionalOperatorsBlock, "Additional operators block");
        }
    }

    public void setDriverMI(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(mi.get(0), "MI");
            typeText(driver.switchTo().activeElement(), value, "MI");
            pause(2000);
            clickElement(additionalOperatorsBlock, "Additional operators block");
        }
    }

    public void setDriverLastName(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(lastName.get(0), "Last Name");
            typeText(driver.switchTo().activeElement(), value, "Last Name");
            pause(2000);
            clickElement(additionalOperatorsBlock, "Additional operators block");
        }
    }

    public void setDriverSuffix(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(suffix.get(0), "Suffix");
            typeText(driver.switchTo().activeElement(), value, "Suffix");
            pause(2000);
            clickElement(additionalOperatorsBlock, "Additional operators block");
        }
    }

    public void setDriverDOB(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(dob.get(0), "DOB");
            typeText(driver.switchTo().activeElement(), value, "DOB");
            pause(2000);
            clickElement(additionalOperatorsBlock, "Additional operators block");
        }
    }

    public void setAdditionalOperatorPrefix(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(additionalOperatorsBlock);
            clickElement(prefix.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setAdditionalOperatorFirstName(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(additionalOperatorsBlock);
            clickElement(firstName.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setAdditionalOperatorMI(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(mi.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setAdditionalOperatorLastName(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(lastName.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setAdditionalOperatorSuffix(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(suffix.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setAdditionalOperatorDOB(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(dob.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setAdditionalDriverGender(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(gender.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);

        }
    }

    public void setAdditionalDriverLicenseNumber(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(licenseNumber.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setAdditionalRelationshipToInsured(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(relationshipToInsured.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setAdditionalDriverLicenseState(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(licenseState.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setAdditionalOperatorDriverStatus(String driverStatusValue, String state, int i) throws Throwable {
        if (hasValue(driverStatusValue) && !driverStatusValue.equalsIgnoreCase("Excluded")) {
            pause(5000);
            clickElement(driverStatus.get(i));
            typeText(driver.switchTo().activeElement(), driverStatusValue);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        } else if (hasValue(driverStatusValue)) {
            switch (state) {
                case "KS":
                case "KY":
                case "MN":
                case "MO":
                case "MT":
                case "ND":
                case "AZ": {
                    clickElement(exclude.get(i));
                    saveChanges();
                }
                break;
                case "CO": {
                    clickElement(driverStatus.get(i));
                    clickElement(driver.findElement(By.xpath("//li[contains(text(),'Excluded Driver')]")));
                    pause(2000);
                    saveChanges();
                    clickElement(additionalOperatorsBlock);
                }
                break;
            }
        }
    }

    public void setAdditionalOperatorNonDriverReason(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(nonDriverReason.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setDriverStatus(String value, String state) throws Throwable {
        clickElement(additionalOperatorsBlock);
        if (hasValue(value) && !value.equalsIgnoreCase("Excluded")) {
            if (elementExists(driverStatus)) {
                clickElement(driverStatus.get(0));
                if (isVisibleOnly(By.xpath("//li[contains(text(),'" + value + "')]"))) {
                    clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + value + "')]")));
                }
                pause(5000);
            } else {
                pause(5000);
                clickElement(additionalOperatorsBlock);
                clickElement(driverStatus.get(0));
                clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + value + "')]")));
            }

            saveChanges();
            pause(2000);
            try {
                clickElement(additionalOperatorsBlock);
            } catch (Exception e) {
                clickElementWithOffset(additionalOperatorsBlock, 30, 30);
            }

        } else if (hasValue(value)) {
            switch (state) {
                case "AZ": {
                    clickElement(exclude.get(0));
                    saveChanges();
                }
                break;
                case "CO": {
                    clickElement(driverStatus.get(0));
                    clickElement(driver.findElement(By.xpath("//li[contains(text(),'Excluded Driver')]")));
                    pause(2000);
                    saveChanges();
                    clickElement(additionalOperatorsBlock);
                }
                break;
            }
        }
    }

    public void setNonDriverReason(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(nonDriverReason.get(0));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setDriverGender(String value) throws Throwable {
        if (hasValue(value)) {
            if (elementExists(gender)) {
                clickElement(additionalOperatorsBlock);
                clickElement(gender.get(0));
                pause(3000);
            } else {
                pause(2000);
                clickElement(additionalOperatorsBlock);
                clickElement(gender.get(0));
                pause(2000);
            }

            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setDriverLicenseState(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(licenseState.get(0));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setDriverLicenseNumber(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(licenseNumber.get(0));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setRelationshipToInsured(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(relationshipToInsured.get(0));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(additionalOperatorsBlock);
        }
    }

    public void setOperatorFirstName(String value, int index) throws Throwable {
        clickElement(additionalOperatorsBlock);
        clickElement(firstName.get(index));
        typeText(driver.switchTo().activeElement(), value, "First Name");
        pause(2000);
        clickElement(additionalOperatorsBlock);
    }

    public void setOperatorMI(String value, int index) throws Throwable {
        clickElement(mi.get(index));
        typeText(driver.switchTo().activeElement(), value, "MI");
        pause(2000);
        clickElement(additionalOperatorsBlock);
    }

    public void setOperatorLastName(String value, int index) throws Throwable {
        clickElement(lastName.get(index));
        typeText(driver.switchTo().activeElement(), value, "Last Name");
        pause(2000);
        clickElement(additionalOperatorsBlock);
    }

    public void setOperatorDOB(String value, int index) throws Throwable {
        clickElement(dob.get(index));
        typeText(driver.switchTo().activeElement(), value, "DOB");
        pause(2000);
        clickElement(additionalOperatorsBlock);
    }

    public void setDriverGender(String value, int index) throws Throwable {
        clickElement(gender.get(index));
        typeText(driver.switchTo().activeElement(), value, "Gender");
        pause(2000);
        clickElement(additionalOperatorsBlock);
    }

    public void setRelationshipToInsured(String value, int index) throws Throwable {
        clickElement(relationshipToInsured.get(index));
        typeText(driver.switchTo().activeElement(), value, "Relationship to Insured");
        pause(2000);
        clickElement(additionalOperatorsBlock);
    }

    public void setDriverStatus(String value, int index, String state) throws Throwable {
        if (hasValue(value) && !value.equalsIgnoreCase("Excluded")) {
            if (elementExists(driverStatus)) {
                clickElement(driverStatus.get(index));
                if (isVisibleOnly(By.xpath("//li[contains(text(),'" + value + "')]"))) {
                    clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + value + "')]")));
                }
                pause(5000);
            } else {
                pause(5000);
                clickElement(additionalOperatorsBlock);
                clickElement(driverStatus.get(index));
                clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + value + "')]")));
            }

            saveChanges();
            pause(2000);
            try {
                clickElement(additionalOperatorsBlock);
            } catch (Exception e) {
                clickElementWithOffset(additionalOperatorsBlock, 30, 30);
            }

        } else if (hasValue(value)) {
            switch (state) {
                case "AZ": {
                    clickElement(exclude.get(index));
                    saveChanges();
                }
                break;
                case "CO": {
                    clickElement(driverStatus.get(index));
                    clickElement(driver.findElement(By.xpath("//li[contains(text(),'Excluded Driver')]")));
                    pause(2000);
                    saveChanges();
                    clickElement(additionalOperatorsBlock);
                }
                break;
            }
        }
    }

    public void setDriverLicenseState(String value, int index) throws Throwable {
        clickElement(licenseState.get(index));
        typeText(driver.switchTo().activeElement(), value, "License State");
        pause(2000);
        clickElement(additionalOperatorsBlock);
    }

    public void setDriverLicenseNumber(String value, int index) throws Throwable {
        clickElement(licenseNumber.get(index));
        typeText(driver.switchTo().activeElement(), value, "License Number");
        pause(2000);
        clickElement(additionalOperatorsBlock);
    }

    public void setDriverExcluded(int index) throws Throwable {
        clickElement(exclude.get(index));
        pause(2000);
    }

    public void setResidedAtPolicyLocation(String value, int index) throws Throwable {
        choose(residedAtPolicyLocationYes.get(index), residedAtPolicyLocationNo.get(index), value);
    }

    public void verifyExcludeDriverField(String text, String displayedOrNot) throws Throwable {
        goToPage("Operators & Vehicles");
        new CommonComponentsAndActions(driver).verifyElementOnUI(text, displayedOrNot);
    }

}