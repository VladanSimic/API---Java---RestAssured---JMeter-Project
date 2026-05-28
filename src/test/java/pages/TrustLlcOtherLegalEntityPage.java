package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class TrustLlcOtherLegalEntityPage extends CommonComponentsAndActions {
    WebDriver driver;
    LlcTrustQuestionnaireBlock llcTrustQuestionnaireBlock;
    WhatIsTheAddressOfLocationLegalEntityOwnsBlock whatIsTheAddressOfLocationLegalEntityOwnsBlock;
    PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock;
    PleaseProvideAdditionalDetailsBlock pleaseProvideAdditionalDetailsBlock;
    TrustLlcOtherLegalEntityPolicyInformationBlock trustLlcOtherLegalEntityPolicyInformationBlock;

    public TrustLlcOtherLegalEntityPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        llcTrustQuestionnaireBlock = new LlcTrustQuestionnaireBlock(driver);
        whatIsTheAddressOfLocationLegalEntityOwnsBlock = new WhatIsTheAddressOfLocationLegalEntityOwnsBlock(driver);
        pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock = new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver);
        pleaseProvideAdditionalDetailsBlock = new PleaseProvideAdditionalDetailsBlock(driver);
        trustLlcOtherLegalEntityPolicyInformationBlock = new TrustLlcOtherLegalEntityPolicyInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillTrustLlcOtherLegalEntityPageCC(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type");

        if (hasValue(condition) && !condition.equalsIgnoreCase("Individual")) {
            actionButtonNext();
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockCC(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockCC(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocCC(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockCC(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockCC(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageCC_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type");
        String conditionEND = data.get("Policy_Information_Named_Insured_Type_END");

        if ((hasValue(condition) && !condition.equalsIgnoreCase("Individual"))
                || (hasValue(conditionEND) && !conditionEND.equalsIgnoreCase("Individual"))) {

            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockCC_END(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockCC_END(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocCC_END(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockCC_END(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockCC_END(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillTrustLlcOtherLegalEntityPageHS(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type");

        if (hasValue(condition) && !condition.equalsIgnoreCase("Individual")) {
            actionButtonNext();

            goToPage("Trust, LLC, Other Legal Entity");
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockHS(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHS(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocHS(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockHS(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockHS(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageHS_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type");
        String conditionEND = data.get("Policy_Information_Named_Insured_Type_END");

        if ((hasValue(condition) && !condition.equalsIgnoreCase("Individual"))
                || (hasValue(conditionEND) && !conditionEND.equalsIgnoreCase("Individual"))) {

            goToPage("Trust, LLC, Other Legal Entity");
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockHS_END(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHS_END(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocHS_END(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockHS_END(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockHS_END(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageHS_OOS_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type");
        String conditionEND = data.get("Policy_Information_Named_Insured_Type_OOS_END");

        if ((hasValue(condition) && !condition.equalsIgnoreCase("Individual"))
                || (hasValue(conditionEND) && !conditionEND.equalsIgnoreCase("Individual"))) {

            goToPage("Trust, LLC, Other Legal Entity");
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockHS_OOS_END(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHS_OOS_END(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocHS_OOS_END(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockHS_OOS_END(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockHS_OOS_END(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageHS_RNW(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type");
        String conditionEND = data.get("Policy_Information_Named_Insured_Type_RNW");

        if ((hasValue(condition) && !condition.equalsIgnoreCase("Individual"))
                || (hasValue(conditionEND) && !conditionEND.equalsIgnoreCase("Individual"))) {

            goToPage("Trust, LLC, Other Legal Entity");
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockHS_RNW(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHS_RNW(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocHS_RNW(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockHS_RNW(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockHS_RNW(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPagePA(Map<String, String> data) throws Throwable {
        if (goToPage("Trust, LLC, Other Legal Entity")) {
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireDetailsPA(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsDetailsPA(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPagePA_END(Map<String, String> data) throws Throwable {
        if (goToPage("Trust, LLC, Other Legal Entity")) {
            trustLlcOtherLegalEntityPolicyInformationBlock.clickUpdate();
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireDetailsPA_END(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA_END(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA_END(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsDetailsPA_END(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA_END(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPagePA_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Trust, LLC, Other Legal Entity")) {
            trustLlcOtherLegalEntityPolicyInformationBlock.clickUpdate();
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireDetailsPA_OOS_END(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA_OOS_END(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA_OOS_END(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsDetailsPA_OOS_END(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA_OOS_END(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPagePA_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Trust, LLC, Other Legal Entity")) {
            trustLlcOtherLegalEntityPolicyInformationBlock.clickUpdate();
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireDetailsPA_RNW(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA_RNW(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA_RNW(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsDetailsPA_RNW(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA_RNW(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPage(Map<String, String> data) throws Throwable {
        if (goToPage("Trust, LLC, Other Legal Entity")) {
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireDetailsPA(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHO(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockHO(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockHO(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockHO(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageES(Map<String, String> data) throws Throwable {
        if (goToPage("Trust, LLC, Other Legal Entity")) {
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireDetailsES(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockES(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockES(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockES(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockES(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageHO(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type");

        if (hasValue(condition) && !condition.equalsIgnoreCase("Individual")) {
            actionButtonNext();
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockHO(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHO(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockHO(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockHO(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockHO(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageHO_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type_END");

        if (hasValue(condition) && !condition.equalsIgnoreCase("Individual")) {
            actionButtonNext();
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockHO_END(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHO_END(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockHO_END(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockHO_END(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockHO_END(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageHO_OOS_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type_OOS_END");

        if (hasValue(condition) && !condition.equalsIgnoreCase("Individual")) {
            actionButtonNext();
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockHO_OOS_END(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHO_OOS_END(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockHO_OOS_END(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockHO_OOS_END(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockHO_OOS_END(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageHO_RNW(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type_RNW");

        if (hasValue(condition) && !condition.equalsIgnoreCase("Individual")) {
            actionButtonNext();
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockHO_RNW(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockHO_RNW(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockHO_RNW(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockHO_RNW(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockHO_RNW(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageAdditionalInsured(Map<String, String> data) throws Throwable {
        int condition = data.get("Additional_Insured").split(",").length;

        for (int i = 1; i <= condition; i++) {
            if (data.get("Additional_Insured_Type_" + i).equalsIgnoreCase("Additional Insured - Legal Entity") || data.get("Additional_Insured_LLC_Trust_" + i).equalsIgnoreCase("Yes")) {
                goToPage("Trust, LLC, Other Legal Entity - " + data.get("Additional_Insured_Name_" + i));
                llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlock(data, i);
                whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC(data, i);
                pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC(data, i);
                pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockLLC(data, i);
                trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC(data, i);
            }
        }
    }
    public void fillTrustLlcOtherLegalEntityPageAdditionalInsured_RNW(Map<String, String> data) throws Throwable {
        int condition = data.get("Additional_Insured_RNW").split(",").length;

        for (int i = 1; i <= condition; i++) {
            if (data.get("Additional_Insured_Type_" + i).equalsIgnoreCase("Additional Insured - Legal Entity") || data.get("Additional_Insured_LLC_Trust_" + i).equalsIgnoreCase("Yes")) {
                goToPage("Trust, LLC, Other Legal Entity - " + data.get("Additional_Insured_Name_" + i));
                llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlock(data, i);
                whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC(data, i);
                pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC(data, i);
                pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockLLC(data, i);
                trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC(data, i);
            }
        }
    }

    public void fillTrustLlcOtherLegalEntityPageAdditionalInterest(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Interests"))) {
            int condition = data.get("Additional_Interests").split(",").length;

            for (int i = 1; i <= condition; i++) {
                if (data.get("Additional_Interests_Type_" + i).equalsIgnoreCase("Additional Interests - Legal Entity") || data.get("Additional_Interests_LLC_Trust_" + i).equalsIgnoreCase("Yes") ||
                        data.get("Additional_Interests_Type_" + i).equalsIgnoreCase("LLC/Trust")) {
                    goToPage("Trust, LLC, Other Legal Entity - " + data.get("Additional_Interests_Name_" + i));
                    llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlock(data, i);
                    whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC(data, i);
                    pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC(data, i);
                    pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockLLC(data, i);
                    trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC(data, i);
                }
            }
        }
    }

    public void fillTrustLlcOtherLegalEntityPageAdditionalInterest_END(Map<String, String> data) throws Throwable {
        int condition = data.get("Additional_Interests").split(",").length;

        for (int i = 1; i <= condition; i++) {
            if (data.get("Additional_Interests_Type_END_" + i).equalsIgnoreCase("Additional Interests - Legal Entity") || data.get("Additional_Interests_LLC_Trust_END_" + i).equalsIgnoreCase("Yes") ||
                    data.get("Additional_Interests_Type_END_" + i).equalsIgnoreCase("LLC/Trust")) {
                goToPage("Trust, LLC, Other Legal Entity - " + data.get("Additional_Interests_Name_END_" + i));
                llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlock_END(data, i);
                whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC_END(data, i);
                pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC_END(data, i);
                pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockLLC_END(data, i);
                trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC_END(data, i);
            }
        }
    }

    public void fillTrustLlcOtherLegalEntityPageAdditionalInterest_OOS_END(Map<String, String> data) throws Throwable {
        int condition = data.get("Additional_Interests").split(",").length;

        for (int i = 1; i <= condition; i++) {
            if (data.get("Additional_Interests_Type_OOS_END_" + i).equalsIgnoreCase("Additional Interests - Legal Entity") || data.get("Additional_Interests_LLC_Trust_OOS_END_" + i).equalsIgnoreCase("Yes") ||
                    data.get("Additional_Interests_Type_OOS_END_" + i).equalsIgnoreCase("LLC/Trust")) {
                goToPage("Trust, LLC, Other Legal Entity - " + data.get("Additional_Interests_Name_OOS_END_" + i));
                llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlock_OOS_END(data, i);
                whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC_OOS_END(data, i);
                pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC_OOS_END(data, i);
                pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockLLC_OOS_END(data, i);
                trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC_OOS_END(data, i);
            }
        }
    }

    public void fillTrustLlcOtherLegalEntityPageAdditionalInterest_RNW(Map<String, String> data) throws Throwable {
        int condition = data.get("Additional_Interests").split(",").length;

        for (int i = 1; i <= condition; i++) {
            if (data.get("Additional_Interests_Type_RNW_" + i).equalsIgnoreCase("Additional Interests - Legal Entity") || data.get("Additional_Interests_LLC_Trust_RNW_" + i).equalsIgnoreCase("Yes") ||
                    data.get("Additional_Interests_Type_RNW_" + i).equalsIgnoreCase("LLC/Trust")) {
                goToPage("Trust, LLC, Other Legal Entity - " + data.get("Additional_Interests_Name_RNW_" + i));
                llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlock_RNW(data, i);
                whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC_RNW(data, i);
                pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC_RNW(data, i);
                pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockLLC_RNW(data, i);
                trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC_RNW(data, i);
            }
        }
    }

    public void fillTrustLlcOtherLegalEntityPageAdditionalInterestPW(Map<String, String> data) throws Throwable {
        int condition = data.get("Loss_Payee").split(",").length;

        for (int i = 1; i <= condition; i++) {
            if (data.get("Loss_Payee_Additional_Insured_Interest_Type_" + i).equalsIgnoreCase("LLC") || data.get("Loss_Payee_Additional_Insured_LLC_Trust_" + i).equalsIgnoreCase("Yes") ||
                    data.get("Loss_Payee_Additional_Insured_LLC_Trust_" + i).equalsIgnoreCase("")) {
                goToPage("Trust, LLC, Other Legal Entity - " + data.get("Loss_Payee_Additional_Insured_Name_" + i));
                llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlock(data, i);
                whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockLLC(data, i);
                pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockLLC(data, i);
                pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockLLC(data, i);
                trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC(data, i);
            }
        }
    }

    public void fillTrustLlcOtherLegalEntityPagePF(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type");

        if (hasValue(condition) && !condition.equalsIgnoreCase("Individual")) {
            goToPage("Trust, LLC, Other Legal Entity");
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockPF(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockPF(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocPF(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockPF(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockPF(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageFS(Map<String, String> data) throws Throwable {
        String condition = data.get("Policy_Information_Named_Insured_Type");

        if (hasValue(condition) && !condition.equalsIgnoreCase("Individual")) {
            actionButtonNext();

            goToPage("Trust, LLC, Other Legal Entity");
            llcTrustQuestionnaireBlock.fillLlcTrustQuestionnaireBlockFS(data);
            whatIsTheAddressOfLocationLegalEntityOwnsBlock.fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockFS(data);
            pleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock.fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockFS(data);
            pleaseProvideAdditionalDetailsBlock.fillPleaseProvideAdditionalDetailsBlockFS(data);
            trustLlcOtherLegalEntityPolicyInformationBlock.fillTrustLlcOtherLegalEntityPolicyInformationBlockFS(data);
        }
    }

    public void fillTrustLlcOtherLegalEntityPageAdditionalInterestFS(Map<String, String> data) {

    }


}