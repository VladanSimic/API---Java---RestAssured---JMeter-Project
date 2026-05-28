package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[contains(text(),'Principal/Beneficial Owners')]/../../../../../..//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='Individual(s)']/../../../../../..//span[text()='add']")
    WebElement addIndividuals;
    @FindBy(xpath = "//div[text()='Legal Entity(ies)']/../../../../../..//span[text()='add']")
    WebElement addLegalEntities;
    @FindBy(xpath = "//div[contains(text(),'Principal/Beneficial Owners')]")
    WebElement block;
    @FindBy(xpath = "//div[contains(text(),'Principal/Beneficial Owners')]/../../../../../../../../../..//div[text()='First Name']/../../../..//input")
    List<WebElement> nameOrEmployeesFirstName;
    @FindBy(xpath = "//div[contains(text(),'Principal/Beneficial Owners')]/../../../../../../../../../..//div[text()='Last Name']/../../../..//input")
    List<WebElement> nameOrEmployeesLastName;
    @FindBy(xpath = "//div[contains(text(),'Principal/Beneficial Owners')]/../../../../../../../../../..//div[text()='DOB']/../../../..//input")
    List<WebElement> nameOrEmployeesDOB;
    @FindBy(xpath = "//div[contains(text(),'Principal/Beneficial Owners')]/../../../../../../../../../..//div[text()='Type']/../../../..//input")
    List<WebElement> nameOrEmployeesType;
    @FindBy(xpath = "//div[contains(text(),'Principal/Beneficial Owners')]/../../../../../../../../../..//div[text()='Relationship to named insured']/../../../..//input")
    List<WebElement> relationshipToNamedInsured;
    @FindBy(xpath = "//div[contains(text(),'Principal/Beneficial Owners')]/../../../../../../../../../..//div[text()='Occupation']/../../../..//input")
    List<WebElement> nameOrEmployeesOccupation;
    @FindBy(xpath = "//div[contains(text(),'Individual(s)')]/../../../../../..//div[text()='First Name']/../../../..//input")
    List<WebElement> nameOrEmployeesFirstNamePA;
    @FindBy(xpath = "//div[contains(text(),'Individual(s)')]/../../../../../..//div[text()='Last Name']/../../../..//input")
    List<WebElement> nameOrEmployeesLastNamePA;
    @FindBy(xpath = "//div[contains(text(),'Individual(s)')]/../../../../../..//div[text()='DOB']/../../../..//input")
    List<WebElement> nameOrEmployeesDOBPA;
    @FindBy(xpath = "//div[contains(text(),'Individual(s)')]/../../../../../..//div[text()='Type']/../../../..//input")
    List<WebElement> nameOrEmployeesTypePA;
    @FindBy(xpath = "//div[contains(text(),'Individual(s)')]/../../../../../..//div[text()='Relationship to named insured']/../../../..//input")
    List<WebElement> relationshipToNamedInsuredPA;
    @FindBy(xpath = "//div[contains(text(),'Individual(s)')]/../../../../../..//div[text()='Occupation']/../../../..//input")
    List<WebElement> nameOrEmployeesOccupationPA;
    @FindBy(xpath = "//div[contains(text(),'Legal Entity(ies)')]/../../../../../..//div[text()='Entity Name']/../../../..//input")
    List<WebElement> entityNamePA;
    @FindBy(xpath = "//div[contains(text(),'Legal Entity(ies)')]/../../../../../..//div[text()='Address Line 1']/../../../..//input")
    List<WebElement> address1PA;
    @FindBy(xpath = "//div[contains(text(),'Legal Entity(ies)')]/../../../../../..//div[text()='Address Line 2']/../../../..//input")
    List<WebElement> address2PA;
    @FindBy(xpath = "//div[contains(text(),'Legal Entity(ies)')]/../../../../../..//div[text()='City']/../../../..//input")
    List<WebElement> cityPA;
    @FindBy(xpath = "//div[contains(text(),'Legal Entity(ies)')]/../../../../../..//div[text()='State']/../../../..//input")
    List<WebElement> statePA;
    @FindBy(xpath = "//div[contains(text(),'Legal Entity(ies)')]/../../../../../..//div[text()='Zip']/../../../..//input")
    List<WebElement> zipPA;
    @FindBy(xpath = "//div[text()='Individual(s)']/../../../../../..//span[text()='add']")
    WebElement addIndividual;
    @FindBy(xpath = "//div[text()='Legal Entity(ies)']/../../../../../..//span[text()='add']")
    WebElement addLegalEntity;
    @FindBy(xpath = "//div[text()='Legal Entity(ies)']/../../../../../..//div[text()='Entity Name']/../../../..//input")
    List<WebElement> entityName;
    @FindBy(xpath = "//div[text()='Legal Entity(ies)']/../../../../../..//div[text()='Address Line 1']/../../../..//input")
    List<WebElement> entityAddressLine1;
    @FindBy(xpath = "//div[text()='Legal Entity(ies)']/../../../../../..//div[text()='Address Line 2']/../../../..//input")
    List<WebElement> entityAddressLine2;
    @FindBy(xpath = "//div[text()='Legal Entity(ies)']/../../../../../..//div[text()='City']/../../../..//input")
    List<WebElement> entityCity;
    @FindBy(xpath = "//div[text()='Legal Entity(ies)']/../../../../../..//div[text()='State']/../../../..//input")
    List<WebElement> entityState;
    @FindBy(xpath = "//div[text()='Legal Entity(ies)']/../../../../../..//div[text()='Zip']/../../../..//input")
    List<WebElement> entityZIP;
    @FindBy(xpath = "//div[text()='Individual(s)']/../../../../../..//span[text()='delete']")
    List<WebElement> deletePrincipalBeneficialOwner;
    @FindBy(xpath = "//div[text()='Legal Entity(ies)']/../../../../../..//span[text()='delete']")
    List<WebElement> deleteLegalEntities;

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocCC(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");
        verifyBlockExists("Please provide the Principal/Beneficial Owners Name(s) or Employees");
        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_" + i), i - 1);
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_" + i), i - 1);
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_" + i), i - 1);
                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_1"), 0);
            setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_1"), 0);
            setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_1"), 0);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocCC_END(Map<String, String> data) throws Throwable {
        //TODO count entries from NB, enable removing entries CC
        if (hasValue(data.get("Principal_Beneficial_Owners_END")) && !data.get("Principal_Beneficial_Owners_END").equalsIgnoreCase(",")) {
            String[] principalBeneficialOwners = data.get("Principal_Beneficial_Owners_END").split(",");

            if (principalBeneficialOwners.length > 1) {
                for (int i = 1; i <= principalBeneficialOwners.length; i++) {
                    clickBlock();
                    if (i != 1) {
                        clickAdd();
                    }
                    pause(3000);
                    setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_END_" + i), i - 1);
                    setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_END_" + i), i - 1);
                    setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_END_" + i), i - 1);
                    setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END_" + i), i - 1);
                    setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_END_" + i), i - 1);
                    setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_END_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_END"), 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_END"), 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_END"), 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END"), 1);
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_END"), 1);
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_END"), 1);
                saveChanges();
            }
        }
    }

    public void clickAddIndividual() throws InterruptedException {
        pause(2000);
        clickElement(addIndividual, "Add Individual");
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocHS(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_" + i), i - 1);
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_" + i), i - 1);
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_" + i), i - 1);
                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_1"), 0);
            setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_1"), 0);
            setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_1"), 0);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA(Map<String, String> data) throws Throwable {
        String[] principalBeneficialOwners = data.get("Principal_Beneficial_Owners").split(",");

        for (int i = 1; i <= principalBeneficialOwners.length; i++) {
            clickBlock();
            if (i != 1) {
                clickAddIndividuals();
            }
            pause(3000);
            setNameOrEmployeesFirstNamePA(data.get("Principal_Beneficial_Owner_First_Name_" + i), i - 1);
            setNameOrEmployeesLastNamePA(data.get("Principal_Beneficial_Owner_Last_Name_" + i), i - 1);
            setNameOrEmployeesDOBPA(data.get("Principal_Beneficial_Owner_DOB_" + i), i - 1);
            setNameOrEmployeesTypePA(data.get("Principal_Beneficial_Owner_Type_" + i), i - 1);
            setRelationshipToNamedInsuredPA(data.get("Principal_Beneficial_Relationship_To_Named_Insured_" + i), i - 1);
            setNameOrEmployeesOccupationPA(data.get("Principal_Beneficial_Occupation_" + i), i - 1);
            saveChanges();
        }

        String[] legalEntities = data.get("Legal_Entities").split(",");

        for (int i = 1; i <= legalEntities.length; i++) {
            clickBlock();
            clickAddLegalEntities();
            pause(3000);
            setEntityName(data.get("Legal_Entities_Entity_Name_" + i), i - 1);
            setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_" + i), i - 1);
            setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_" + i), i - 1);
            setCityPA(data.get("Legal_Entities_City_" + i), i - 1);
            setStatePA(data.get("Legal_Entities_State_" + i), i - 1);
            setZIPPA(data.get("Legal_Entities_Zip_" + i), i - 1);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA_END(Map<String, String> data) throws Throwable {
        String[] principalBeneficialOwnersNB = data.get("Principal_Beneficial_Owners").split(",");
        String[] principalBeneficialOwnersEND = data.get("Principal_Beneficial_Owners_END").split(",");

        //Modify beneficial owner
        for (int i = 1; i <= principalBeneficialOwnersEND.length; i++) {
            if (principalBeneficialOwnersEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < principalBeneficialOwnersNB.length; j++) {
                    if (principalBeneficialOwnersNB[j].equalsIgnoreCase(principalBeneficialOwnersEND[i - 1].split("_MOD")[0])) {
                        setNameOrEmployeesFirstNamePA(data.get("Principal_Beneficial_Owner_First_Name_END_" + i), j);
                        setNameOrEmployeesLastNamePA(data.get("Principal_Beneficial_Owner_Last_Name_END_" + i), j);
                        setNameOrEmployeesDOBPA(data.get("Principal_Beneficial_Owner_DOB_END_" + i), j);
                        setNameOrEmployeesTypePA(data.get("Principal_Beneficial_Owner_Type_END_" + i), j);
                        setRelationshipToNamedInsuredPA(data.get("Principal_Beneficial_Relationship_To_Named_Insured_END_" + i), j);
                        setNameOrEmployeesOccupationPA(data.get("Principal_Beneficial_Occupation_END_" + i), j);
                        saveChanges();
                    }
                }
            }
        }

        int totalCount = principalBeneficialOwnersNB.length;
        //Add beneficial owner
        for (int i = 1; i <= principalBeneficialOwnersEND.length; i++) {
            if (principalBeneficialOwnersEND[i - 1].contains("_ADD")) {
                clickAddIndividuals();
                pause(3000);
                setNameOrEmployeesFirstNamePA(data.get("Principal_Beneficial_Owner_First_Name_END_" + i), totalCount);
                setNameOrEmployeesLastNamePA(data.get("Principal_Beneficial_Owner_Last_Name_END_" + i), totalCount);
                setNameOrEmployeesDOBPA(data.get("Principal_Beneficial_Owner_DOB_END_" + i), totalCount);
                setNameOrEmployeesTypePA(data.get("Principal_Beneficial_Owner_Type_END_" + i), totalCount);
                setRelationshipToNamedInsuredPA(data.get("Principal_Beneficial_Relationship_To_Named_Insured_END_" + i), totalCount);
                setNameOrEmployeesOccupationPA(data.get("Principal_Beneficial_Occupation_END_" + i), totalCount);
                saveChanges();
            }
        }

        //Delete beneficial owner
        for (int i = 0; i < principalBeneficialOwnersEND.length; i++) {
            if (principalBeneficialOwnersEND[i].contains("_DEL")) {
                for (int j = 0; j < principalBeneficialOwnersNB.length; j++) {
                    if (principalBeneficialOwnersNB[j].equalsIgnoreCase(principalBeneficialOwnersEND[i].split("_DEL")[0])) {
                        clickElement(deletePrincipalBeneficialOwner.get(j));
                    }
                }
            }
        }

        String[] legalEntitiesNB = data.get("Legal_Entities").split(",");
        String[] legalEntitiesEND = data.get("Legal_Entities_END").split(",");

        //Modify legal entity
        for (int i = 1; i <= legalEntitiesEND.length; i++) {
            if (legalEntitiesEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < legalEntitiesNB.length; j++) {
                    if (legalEntitiesNB[j].equalsIgnoreCase(legalEntitiesEND[i - 1].split("_MOD")[0])) {
                        setEntityName(data.get("Legal_Entities_Entity_Name_END_" + i), j);
                        setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_END_" + i), j);
                        setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_END_" + i), j);
                        setCityPA(data.get("Legal_Entities_City_END_" + i), j);
                        setStatePA(data.get("Legal_Entities_State_END_" + i), j);
                        setZIPPA(data.get("Legal_Entities_Zip_END_" + i), j);
                        saveChanges();
                    }
                }
            }
        }

        int totalCountLE = legalEntitiesNB.length;
        //Add legal entity
        for (int i = 1; i <= legalEntitiesEND.length; i++) {
            if (legalEntitiesEND[i - 1].contains("_ADD")) {
                clickAddLegalEntities();
                pause(3000);
                setEntityName(data.get("Legal_Entities_Entity_Name_END_" + i), totalCountLE);
                setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_END_" + i), totalCountLE);
                setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_END_" + i), totalCountLE);
                setCityPA(data.get("Legal_Entities_City_END_" + i), totalCountLE);
                setStatePA(data.get("Legal_Entities_State_END_" + i), totalCountLE);
                setZIPPA(data.get("Legal_Entities_Zip_END_" + i), totalCountLE);
                saveChanges();
            }
        }

        //Delete legal entity
        for (int i = 0; i < legalEntitiesEND.length; i++) {
            if (legalEntitiesEND[i].contains("_DEL")) {
                for (int j = 0; j < legalEntitiesNB.length; j++) {
                    if (legalEntitiesNB[j].equalsIgnoreCase(legalEntitiesEND[i].split("_DEL")[0])) {
                        clickElement(deleteLegalEntities.get(j));
                    }
                }
            }
        }

    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        String[] principalBeneficialOwners = data.get("Principal_Beneficial_Owners_OOS_END").split(",");

        if (principalBeneficialOwners.length > 1) {
            for (int i = 1; i <= principalBeneficialOwners.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAddIndividuals();
                }
                pause(3000);
                setNameOrEmployeesFirstNamePA(data.get("Principal_Beneficial_Owner_First_Name_OOS_END_" + i), i - 1);
                setNameOrEmployeesLastNamePA(data.get("Principal_Beneficial_Owner_Last_Name_OOS_END_" + i), i - 1);
                setNameOrEmployeesDOBPA(data.get("Principal_Beneficial_Owner_DOB_OOS_END_" + i), i - 1);
                setNameOrEmployeesTypePA(data.get("Principal_Beneficial_Owner_Type_OOS_END_" + i), i - 1);
                setRelationshipToNamedInsuredPA(data.get("Principal_Beneficial_Relationship_To_Named_Insured_OOS_END_" + i), i - 1);
                setNameOrEmployeesOccupationPA(data.get("Principal_Beneficial_Occupation_OOS_END_" + i), i - 1);
                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstNamePA(data.get("Principal_Beneficial_Owner_First_Name_OOS_END_1"), 0);
            setNameOrEmployeesLastNamePA(data.get("Principal_Beneficial_Owner_Last_Name_OOS_END_1"), 0);
            setNameOrEmployeesDOBPA(data.get("Principal_Beneficial_Owner_DOB_OOS_END_1"), 0);
            setNameOrEmployeesTypePA(data.get("Principal_Beneficial_Owner_Type_OOS_END_1"), 0);
            setRelationshipToNamedInsuredPA(data.get("Principal_Beneficial_Relationship_To_Named_Insured_OOS_END_1"), 0);
            setNameOrEmployeesOccupationPA(data.get("Principal_Beneficial_Occupation_OOS_END_1"), 0);
            saveChanges();
        }

        if (hasValue(data.get("Legal_Entities_OOS_END"))) {
            String[] legalEntities = data.get("Legal_Entities_OOS_END").split(",");
            if (legalEntities.length > 1) {
                for (int i = 1; i <= legalEntities.length; i++) {
                    clickBlock();
                    clickAddLegalEntities();
                    pause(3000);
                    setEntityName(data.get("Legal_Entities_Entity_Name_OOS_END_" + i), i - 1);
                    setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_OOS_END_" + i), i - 1);
                    setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_OOS_END_" + i), i - 1);
                    setCityPA(data.get("Legal_Entities_City_OOS_END_" + i), i - 1);
                    setStatePA(data.get("Legal_Entities_State_OOS_END_" + i), i - 1);
                    setZIPPA(data.get("Legal_Entities_Zip_OOS_END_" + i), i - 1);
                    saveChanges();
                }
            } else {
                clickBlock();
                clickAddLegalEntities();
                pause(3000);
                setEntityName(data.get("Legal_Entities_Entity_Name_OOS_END_1"), 0);
                setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_OOS_END_1"), 0);
                setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_OOS_END_1"), 0);
                setCityPA(data.get("Legal_Entities_City_OOS_END_1"), 0);
                setStatePA(data.get("Legal_Entities_State_OOS_END_1"), 0);
                setZIPPA(data.get("Legal_Entities_Zip_OOS_END_1"), 0);
                saveChanges();
            }
        }
        //TODO PA OOS - PleaseProvideThePrincipalBeneficialOwnersNameOrEmployees - Mid
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA_RNW(Map<String, String> data) throws Throwable {
        String[] principalBeneficialOwnersNB = data.get("Principal_Beneficial_Owners").split(",");
        String[] principalBeneficialOwnersEND = data.get("Principal_Beneficial_Owners_END").split(",");
        String[] principalBeneficialOwnersRNW = data.get("Principal_Beneficial_Owners_RNW").split(",");


        //Modify beneficial owner
        for (int i = 1; i <= principalBeneficialOwnersEND.length; i++) {
            if (principalBeneficialOwnersEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < principalBeneficialOwnersNB.length; j++) {
                    if (principalBeneficialOwnersNB[j].equalsIgnoreCase(principalBeneficialOwnersEND[i - 1].split("_MOD")[0])) {
                        setNameOrEmployeesFirstNamePA(data.get("Principal_Beneficial_Owner_First_Name_RNW_" + i), j);
                        setNameOrEmployeesLastNamePA(data.get("Principal_Beneficial_Owner_Last_Name_RNW_" + i), j);
                        setNameOrEmployeesDOBPA(data.get("Principal_Beneficial_Owner_DOB_RNW_" + i), j);
                        setNameOrEmployeesTypePA(data.get("Principal_Beneficial_Owner_Type_RNW_" + i), j);
                        setRelationshipToNamedInsuredPA(data.get("Principal_Beneficial_Relationship_To_Named_Insured_RNW_" + i), j);
                        setNameOrEmployeesOccupationPA(data.get("Principal_Beneficial_Occupation_RNW_" + i), j);
                        saveChanges();
                    }
                }
            }
        }

        int totalCount = principalBeneficialOwnersNB.length;
        //Add beneficial owner
        for (int i = 1; i <= principalBeneficialOwnersEND.length; i++) {
            if (principalBeneficialOwnersEND[i - 1].contains("_ADD")) {
                clickAddIndividuals();
                pause(3000);
                setNameOrEmployeesFirstNamePA(data.get("Principal_Beneficial_Owner_First_Name_RNW_" + i), totalCount);
                setNameOrEmployeesLastNamePA(data.get("Principal_Beneficial_Owner_Last_Name_RNW_" + i), totalCount);
                setNameOrEmployeesDOBPA(data.get("Principal_Beneficial_Owner_DOB_RNW_" + i), totalCount);
                setNameOrEmployeesTypePA(data.get("Principal_Beneficial_Owner_Type_RNW_" + i), totalCount);
                setRelationshipToNamedInsuredPA(data.get("Principal_Beneficial_Relationship_To_Named_Insured_RNW_" + i), totalCount);
                setNameOrEmployeesOccupationPA(data.get("Principal_Beneficial_Occupation_RNW_" + i), totalCount);
                saveChanges();
            }
        }

        //Delete beneficial owner
        for (int i = 0; i < principalBeneficialOwnersEND.length; i++) {
            if (principalBeneficialOwnersEND[i].contains("_DEL")) {
                for (int j = 0; j < principalBeneficialOwnersNB.length; j++) {
                    if (principalBeneficialOwnersNB[j].equalsIgnoreCase(principalBeneficialOwnersEND[i].split("_DEL")[0])) {
                        clickElement(deletePrincipalBeneficialOwner.get(j));
                    }
                }
            }
        }

        String[] legalEntitiesNB = data.get("Legal_Entities").split(",");
        String[] legalEntitiesEND = data.get("Legal_Entities_RNW").split(",");

        //Modify legal entity
        for (int i = 1; i <= legalEntitiesEND.length; i++) {
            if (legalEntitiesEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < legalEntitiesNB.length; j++) {
                    if (legalEntitiesNB[j].equalsIgnoreCase(legalEntitiesEND[i - 1].split("_MOD")[0])) {
                        setEntityName(data.get("Legal_Entities_Entity_Name_RNW_" + i), j);
                        setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_RNW_" + i), j);
                        setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_RNW_" + i), j);
                        setCityPA(data.get("Legal_Entities_City_RNW_" + i), j);
                        setStatePA(data.get("Legal_Entities_State_RNW_" + i), j);
                        setZIPPA(data.get("Legal_Entities_Zip_RNW_" + i), j);
                        saveChanges();
                    }
                }
            }
        }

        int totalCountLE = legalEntitiesNB.length;
        //Add legal entity
        for (int i = 1; i <= legalEntitiesEND.length; i++) {
            if (legalEntitiesEND[i - 1].contains("_ADD")) {
                clickAddLegalEntities();
                pause(3000);
                setEntityName(data.get("Legal_Entities_Entity_Name_RNW_" + i), totalCountLE);
                setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_RNW_" + i), totalCountLE);
                setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_RNW_" + i), totalCountLE);
                setCityPA(data.get("Legal_Entities_City_RNW_" + i), totalCountLE);
                setStatePA(data.get("Legal_Entities_State_RNW_" + i), totalCountLE);
                setZIPPA(data.get("Legal_Entities_Zip_RNW_" + i), totalCountLE);
                saveChanges();
            }
        }

        //Delete legal entity
        for (int i = 0; i < legalEntitiesEND.length; i++) {
            if (legalEntitiesEND[i].contains("_DEL")) {
                for (int j = 0; j < legalEntitiesNB.length; j++) {
                    if (legalEntitiesNB[j].equalsIgnoreCase(legalEntitiesEND[i].split("_DEL")[0])) {
                        clickElement(deleteLegalEntities.get(j));
                    }
                }
            }
        }
//        TODO PA RNW - PleaseProvideThePrincipalBeneficialOwnersNameOrEmployees - Mid
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocHS_END(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_END").split(",");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_END_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_END_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_END_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END_" + i), i - 1);
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_END_" + i), i - 1);
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_END_" + i), i - 1);
                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_END_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_END_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_END_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END_1"), 0);
            setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_END_1"), 0);
            setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_END_1"), 0);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocHS_OOS_END(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_OOS_END").split(",");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_OOS_END_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_OOS_END_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_OOS_END_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_OOS_END_" + i), i - 1);
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_OOS_END_" + i), i - 1);
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_OOS_END_" + i), i - 1);
                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_OOS_END_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_OOS_END_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_OOS_END_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_OOS_END_1"), 0);
            setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_OOS_END_1"), 0);
            setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_OOS_END_1"), 0);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocHS_RNW(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_RNW").split(",");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_RNW_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_RNW_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_RNW_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_RNW_" + i), i - 1);
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_RNW_" + i), i - 1);
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_RNW_" + i), i - 1);
                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_RNW_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_RNW_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_RNW_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_RNW_1"), 0);
            setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_RNW_1"), 0);
            setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_RNW_1"), 0);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockHO(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");
        verifyBlockExists("Please provide the Principal/Beneficial Owners Name(s) or Employees");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAddIndividual();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_" + i), i - 1);
                if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_" + i).equalsIgnoreCase("Employee"))
                    setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_" + i), i - 1);
                else
                    setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_" + i), i - 1);

                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_1"), 0);
            if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_1").equalsIgnoreCase("Employee"))
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_1"), 0);
            else
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_1"), 0);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockHO_END(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_END").split(",");
        verifyBlockExists("Please provide the Principal/Beneficial Owners Name(s) or Employees");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAddIndividual();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_END_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_END_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_END_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END_" + i), i - 1);
                if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END_" + i).equalsIgnoreCase("Employee"))
                    setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_END_" + i), i - 1);
                else
                    setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_END_" + i), i - 1);

                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_END_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_END_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_END_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END_1"), 0);
            if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END_1").equalsIgnoreCase("Employee"))
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_END_1"), 0);
            else
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_END_1"), 0);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockHO_OOS_END(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_OOS_END").split(",");
        verifyBlockExists("Please provide the Principal/Beneficial Owners Name(s) or Employees");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAddIndividual();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_OOS_END_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_OOS_END_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_OOS_END_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_OOS_END_" + i), i - 1);
                if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_OOS_END_" + i).equalsIgnoreCase("Employee"))
                    setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_OOS_END_" + i), i - 1);
                else
                    setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_OOS_END_" + i), i - 1);

                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_OOS_END_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_OOS_END_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_OOS_END_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_OOS_END_1"), 0);
            if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_OOS_END_1").equalsIgnoreCase("Employee"))
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_OOS_END_1"), 0);
            else
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_OOS_END_1"), 0);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockHO_RNW(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations_RNW").split(",");
        verifyBlockExists("Please provide the Principal/Beneficial Owners Name(s) or Employees");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAddIndividual();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_RNW_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_RNW_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_RNW_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_RNW_" + i), i - 1);
                if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_RNW_" + i).equalsIgnoreCase("Employee"))
                    setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_RNW_" + i), i - 1);
                else
                    setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_RNW_" + i), i - 1);

                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_RNW_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_RNW_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_RNW_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_RNW_1"), 0);
            if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_RNW_1").equalsIgnoreCase("Employee"))
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_RNW_1"), 0);
            else
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_RNW_1"), 0);
            saveChanges();
        }
    }

    public void clickBlock() {
        clickElement(block, "Block");
    }

    public void clickAdd() throws InterruptedException {
        pause(2000);
        clickElement(add, "Add");
    }

    public void clickAddIndividuals() throws InterruptedException {
        pause(2000);
        clickElement(addIndividuals, "Add");
    }

    public void clickAddLegalEntities() throws InterruptedException {
        pause(2000);
        clickElement(addLegalEntities, "Add");
    }

    public void setNameOrEmployeesFirstName(String value, int i) {
        typeText(nameOrEmployeesFirstName.get(i), value, "Name Or Employees First Name_" + i);
    }

    public void setNameOrEmployeesLastName(String value, int i) {
        typeText(nameOrEmployeesLastName.get(i), value, "Name Or Employees Last Name_" + i);
    }

    public void setNameOrEmployeesDOB(String value, int i) {
        typeText(nameOrEmployeesDOB.get(i), value, "Name Or Employees DOB_" + i);
    }

    public void setNameOrEmployeesType(String value, int i) {
        typeTextEnter(nameOrEmployeesType.get(i), value, "Name Or Employees Type_" + i);
    }

    public void setRelationshipToNamedInsured(String value, int i) {
        typeTextEnter(relationshipToNamedInsured.get(i), value, "Relationship To Named Insured_" + i);
    }

    public void setNameOrEmployeesOccupation(String value, int i) {
        typeText(nameOrEmployeesOccupation.get(i), value, "Name Or Employees Occupation_" + i);
    }

    public void setNameOrEmployeesFirstNamePA(String value, int i) {
        typeText(nameOrEmployeesFirstNamePA.get(i), value, "Name Or Employees First Name_" + i);
    }

    public void setNameOrEmployeesLastNamePA(String value, int i) {
        typeText(nameOrEmployeesLastNamePA.get(i), value, "Name Or Employees Last Name_" + i);
    }

    public void setNameOrEmployeesDOBPA(String value, int i) {
        typeText(nameOrEmployeesDOBPA.get(i), value, "Name Or Employees DOB_" + i);
    }

    public void setNameOrEmployeesTypePA(String value, int i) {
        typeTextEnter(nameOrEmployeesTypePA.get(i), value, "Name Or Employees Type_" + i);
    }

    public void setRelationshipToNamedInsuredPA(String value, int i) {
        typeTextEnter(relationshipToNamedInsuredPA.get(i), value, "Relationship To Named Insured_" + i);
    }

    public void setNameOrEmployeesOccupationPA(String value, int i) {
        typeText(nameOrEmployeesOccupationPA.get(i), value, "Name Or Employees Occupation_" + i);
    }

    public void setEntityName(String value, int i) {
        typeText(entityNamePA.get(i), value, "Entity Name_" + i);
    }

    public void setAddressLine1PA(String value, int i) {
        typeText(address1PA.get(i), value, "Address1_" + i);
    }

    public void setAddressLine2PA(String value, int i) {
        typeText(address2PA.get(i), value, "Address2_" + i);
    }

    public void setCityPA(String value, int i) {
        typeText(cityPA.get(i), value, "City_" + i);
    }

    public void setStatePA(String value, int i) {
        typeText(statePA.get(i), value, "State_" + i);
    }

    public void setZIPPA(String value, int i) {
        typeText(zipPA.get(i), value, "ZIP_" + i);
    }

    public void clickAddEntity() {
        clickElement(addLegalEntity, "Add Legal Entity");
    }

    public void setLegalEntityName(String value, int i) {
        typeText(entityName.get(i), value, "Legal Entity name");
    }

    public void setLegalEntityAddressLine1(String value, int i) {
        typeText(entityAddressLine1.get(i), value, "Legal Entity Address Line 1");
    }

    public void setLegalEntityAddressLine2(String value, int i) {
        typeText(entityAddressLine2.get(i), value, "Legal Entity Address Line 2");
    }

    public void setLegalEntityCity(String value, int i) {
        typeText(entityCity.get(i), value, "Legal Entity City");
    }

    public void setLegalEntityState(String value, int i) {
        typeText(entityState.get(i), value, "Legal Entity State");
    }

    public void setLegalEntityZIP(String value, int i) {
        typeTextEnter(entityZIP.get(i), value, "Legal Entity ZIP");
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC(Map<String, String> data, int index) throws Throwable {
        String[] size = data.get("Beneficial_Owners_LLC_" + index).split(",");

        if (size.length >= 1) {
            int counter = 0;
            int beneficialOwnerCounter = 0;
            deletePrincipalBeneficialOwner(0);
            for (int i = 1; i <= size.length; i++) {
                clickBlock();
                if (data.get("Legal_Entity_" + index + "_" + i).equalsIgnoreCase("Yes")) {
                    clickAddLegalEntities();
                    pause(3000);
                    setEntityName(data.get("Legal_Entities_Entity_Name_" + index + "_" + i), counter);
                    setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_" + index + "_" + i), counter);
                    setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_" + index + "_" + i), counter);
                    setCityPA(data.get("Legal_Entities_City_" + index + "_" + i), counter);
                    setStatePA(data.get("Legal_Entities_State_" + index + "_" + i), counter);
                    setZIPPA(data.get("Legal_Entities_Zip_" + index + "_" + i), counter);
                    clickFooter();
                    saveChanges();
                    counter++;
                } else {
                    clickAddIndividual();
                    pause(3000);
                    setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_" + index + "_" + i), beneficialOwnerCounter);
                    if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_" + index + "_" + i).equalsIgnoreCase("Employee"))
                        setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_" + index + "_" + i), beneficialOwnerCounter);
                    else
                        setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_" + index + "_" + i), beneficialOwnerCounter);
                    saveChanges();
                    beneficialOwnerCounter++;
                }
            }
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC_END(Map<String, String> data, int index) throws Throwable {
        String[] size = data.get("Beneficial_Owners_LLC_" + index).split(",");

        if (size.length >= 1) {
            int counter = 0;
            int beneficialOwnerCounter = 0;
            deletePrincipalBeneficialOwner(0);
            for (int i = 1; i <= size.length; i++) {
                clickBlock();
                if (data.get("Legal_Entity_" + index + "_" + i).equalsIgnoreCase("Yes")) {
                    clickAddLegalEntities();
                    pause(3000);
                    setEntityName(data.get("Legal_Entities_Entity_Name_END_" + index + "_" + i), counter);
                    setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_END_" + index + "_" + i), counter);
                    setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_END_" + index + "_" + i), counter);
                    setCityPA(data.get("Legal_Entities_City_END_" + index + "_" + i), counter);
                    setStatePA(data.get("Legal_Entities_State_END_" + index + "_" + i), counter);
                    setZIPPA(data.get("Legal_Entities_Zip_END_" + index + "_" + i), counter);
                    clickFooter();
                    saveChanges();
                    counter++;
                } else {
                    clickAddIndividual();
                    pause(3000);
                    setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_END_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_END_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_END_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END_" + index + "_" + i), beneficialOwnerCounter);
                    if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_END_" + index + "_" + i).equalsIgnoreCase("Employee"))
                        setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_END_" + index + "_" + i), beneficialOwnerCounter);
                    else
                        setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_END_" + index + "_" + i), beneficialOwnerCounter);
                    saveChanges();
                    beneficialOwnerCounter++;
                }
            }
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC_OOS_END(Map<String, String> data, int index) throws Throwable {
        String[] size = data.get("Beneficial_Owners_LLC_" + index).split(",");

        if (size.length >= 1) {
            int counter = 0;
            int beneficialOwnerCounter = 0;
            deletePrincipalBeneficialOwner(0);
            for (int i = 1; i <= size.length; i++) {
                clickBlock();
                if (data.get("Legal_Entity_" + index + "_" + i).equalsIgnoreCase("Yes")) {
                    clickAddLegalEntities();
                    pause(3000);
                    setEntityName(data.get("Legal_Entities_Entity_Name_OOS_END_" + index + "_" + i), counter);
                    setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_OOS_END_" + index + "_" + i), counter);
                    setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_OOS_END_" + index + "_" + i), counter);
                    setCityPA(data.get("Legal_Entities_City_OOS_END_" + index + "_" + i), counter);
                    setStatePA(data.get("Legal_Entities_State_OOS_END_" + index + "_" + i), counter);
                    setZIPPA(data.get("Legal_Entities_Zip_OOS_END_" + index + "_" + i), counter);
                    clickFooter();
                    saveChanges();
                    counter++;
                } else {
                    clickAddIndividual();
                    pause(3000);
                    setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_OOS_END_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_OOS_END_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_OOS_END_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_OOS_END_" + index + "_" + i), beneficialOwnerCounter);
                    if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_OOS_END_" + index + "_" + i).equalsIgnoreCase("Employee"))
                        setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_OOS_END_" + index + "_" + i), beneficialOwnerCounter);
                    else
                        setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_OOS_END_" + index + "_" + i), beneficialOwnerCounter);
                    saveChanges();
                    beneficialOwnerCounter++;
                }
            }
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC_RNW(Map<String, String> data, int index) throws Throwable {
        String[] size = data.get("Beneficial_Owners_LLC_" + index).split(",");

        if (size.length >= 1) {
            int counter = 0;
            int beneficialOwnerCounter = 0;
            deletePrincipalBeneficialOwner(0);
            for (int i = 1; i <= size.length; i++) {
                clickBlock();
                if (data.get("Legal_Entity_" + index + "_" + i).equalsIgnoreCase("Yes")) {
                    clickAddLegalEntities();
                    pause(3000);
                    setEntityName(data.get("Legal_Entities_Entity_Name_RNW_" + index + "_" + i), counter);
                    setAddressLine1PA(data.get("Legal_Entities_Address_Line_1_RNW_" + index + "_" + i), counter);
                    setAddressLine2PA(data.get("Legal_Entities_Address_Line_2_RNW_" + index + "_" + i), counter);
                    setCityPA(data.get("Legal_Entities_City_RNW_" + index + "_" + i), counter);
                    setStatePA(data.get("Legal_Entities_State_RNW_" + index + "_" + i), counter);
                    setZIPPA(data.get("Legal_Entities_Zip_RNW_" + index + "_" + i), counter);
                    clickFooter();
                    saveChanges();
                    counter++;
                } else {
                    clickAddIndividual();
                    pause(3000);
                    setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_RNW_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_RNW_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_RNW_" + index + "_" + i), beneficialOwnerCounter);
                    setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_RNW_" + index + "_" + i), beneficialOwnerCounter);
                    if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_RNW_" + index + "_" + i).equalsIgnoreCase("Employee"))
                        setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_RNW_" + index + "_" + i), beneficialOwnerCounter);
                    else
                        setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_RNW_" + index + "_" + i), beneficialOwnerCounter);
                    saveChanges();
                    beneficialOwnerCounter++;
                }
            }
        }
    }

    public void deletePrincipalBeneficialOwner(int index) throws Throwable {
        clickElement(deletePrincipalBeneficialOwner.get(index));
        pause(2000);
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocPF(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAdd();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_" + i), i - 1);
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_" + i), i - 1);
//                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_" + i), i - 1);
                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_1"), 0);
            setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_1"), 0);
//            setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_1"), 0);
            saveChanges();
        }
    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockFS(Map<String, String> data) {

    }

    public void fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockES(Map<String, String> data) throws Throwable {
        String[] householdEntityLocation = data.get("Household_Entity_Locations").split(",");
        verifyBlockExists("Please provide the Principal/Beneficial Owners Name(s) or Employees");

        if (householdEntityLocation.length > 1) {
            for (int i = 1; i <= householdEntityLocation.length; i++) {
                clickBlock();
                if (i != 1) {
                    clickAddIndividual();
                }
                pause(3000);
                setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_" + i), i - 1);
                setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_" + i), i - 1);
                setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_" + i), i - 1);
                setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_" + i), i - 1);
                if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_" + i).equalsIgnoreCase("Employee"))
                    setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_" + i), i - 1);
                else
                    setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_" + i), i - 1);

                saveChanges();
            }
        } else {
            clickBlock();
            setNameOrEmployeesFirstName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_1"), 0);
            setNameOrEmployeesLastName(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_1"), 0);
            setNameOrEmployeesDOB(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_1"), 0);
            setNameOrEmployeesType(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_1"), 0);
            if (data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Type_1").equalsIgnoreCase("Employee"))
                setNameOrEmployeesOccupation(data.get("Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Occupation_1"), 0);
            else
                setRelationshipToNamedInsured(data.get("Please_Provide_The_Principal_Beneficial_Owners_Relationship_To_Named_Insured_1"), 0);
            saveChanges();
        }
    }
}