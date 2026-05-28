package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class DriverIncidentsIncludedInHouseholdAveragingBlock extends CommonComponentsAndActions {

    public DriverIncidentsIncludedInHouseholdAveragingBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA(Map<String, String> data) {
        int totalIncidents = 0;

        for (int i = 1; i <= data.get("Driver_Incidents").split(",").length; i++) {
            if (data.get("State").equalsIgnoreCase("MO") ||
                    data.get("State").equalsIgnoreCase("AZ") ||
                    data.get("State").equalsIgnoreCase("KY") ||
                    data.get("State").equalsIgnoreCase("MN") ||
                    data.get("State").equalsIgnoreCase("TN") ||
                    data.get("State").equalsIgnoreCase("MD") ||
                    data.get("State").equalsIgnoreCase("MI") ||
                    data.get("State").equalsIgnoreCase("IN")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_" + i), i, 7);
                verifyIND(data.get("Driver_Incidents_Included_In_Household_Averaging_IND_" + i), i, 8);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_" + i), i, 9);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_" + i), i, 10);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_" + i), i, 11);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_" + i), i, 12);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_" + i), i, 13);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_" + i), i, 14);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_" + i), i, 15);
                verifyPUREIND(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_IND_" + i), i, 16);
            } else if (data.get("State").equalsIgnoreCase("CA")) {
                //DO NOTHING THIS BLOCK DOES NOT APPLY TO CA
            } else if (data.get("State").equalsIgnoreCase("KS")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_" + i), i, 7);
                verifyINT(data.get("Driver_Incidents_Included_In_Household_Averaging_INT_" + i), i, 8);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_" + i), i, 9);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_" + i), i, 10);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_" + i), i, 11);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_" + i), i, 12);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_" + i), i, 13);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_" + i), i, 14);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_" + i), i, 15);
                verifyPUREINT(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_INT_" + i), i, 16);
            } else if (data.get("State").equalsIgnoreCase("MN")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_" + i), i, 7);
                verifyIND(data.get("Driver_Incidents_Included_In_Household_Averaging_IND_" + i), i, 8);
                verifyINT(data.get("Driver_Incidents_Included_In_Household_Averaging_INT_" + i), i, 9);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_" + i), i, 10);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_" + i), i, 11);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_" + i), i, 12);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_" + i), i, 13);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_" + i), i, 14);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_" + i), i, 15);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_" + i), i, 16);
                verifyPUREIND(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_IND_" + i), i, 17);
                verifyPUREINT(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_INT_" + i), i, 18);
            } else {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_" + i), i, 7);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_" + i), i, 8);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_" + i), i, 9);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_" + i), i, 10);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_" + i), i, 11);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_" + i), i, 12);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_" + i), i, 13);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_" + i), i, 14);
            }
            totalIncidents++;
        }

        for (int i = 1; i <= data.get("Additional_Operators").split(",").length; i++) {
            for (int j = 1; j <= data.get("Additional_Operator_Incidents_" + i).split(",").length; j++) {
                int currentIncidents = totalIncidents + 1;
                if (data.get("State").equalsIgnoreCase("MO") ||
                        data.get("State").equalsIgnoreCase("AZ") ||
                        data.get("State").equalsIgnoreCase("KY") ||
                        data.get("State").equalsIgnoreCase("MN") ||
                        data.get("State").equalsIgnoreCase("TN") ||
                        data.get("State").equalsIgnoreCase("MD") ||
                        data.get("State").equalsIgnoreCase("MI") ||
                        data.get("State").equalsIgnoreCase("IN")) {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_" + currentIncidents), currentIncidents, 7);
                    verifyIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_IND_" + currentIncidents), currentIncidents, 8);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_" + currentIncidents), currentIncidents, 9);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_" + currentIncidents), currentIncidents, 10);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_" + currentIncidents), currentIncidents, 11);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_" + currentIncidents), currentIncidents, 12);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_" + currentIncidents), currentIncidents, 13);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_" + currentIncidents), currentIncidents, 14);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_" + currentIncidents), currentIncidents, 15);
                    verifyPUREIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_IND_" + currentIncidents), currentIncidents, 16);
                } else if (data.get("State").equalsIgnoreCase("CA")) {
                    //DO NOTHING THIS BLOCK DOES NOT APPLY TO CA
                } else if (data.get("State").equalsIgnoreCase("KS")) {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_" + currentIncidents), currentIncidents, 7);
                    verifyINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_INT_" + currentIncidents), currentIncidents, 8);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_" + currentIncidents), currentIncidents, 9);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_" + currentIncidents), currentIncidents, 10);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_" + currentIncidents), currentIncidents, 11);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_" + currentIncidents), currentIncidents, 12);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_" + currentIncidents), currentIncidents, 13);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_" + currentIncidents), currentIncidents, 14);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_" + currentIncidents), currentIncidents, 15);
                    verifyPUREINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_INT_" + currentIncidents), currentIncidents, 16);
                } else if (data.get("State").equalsIgnoreCase("MN")) {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_" + currentIncidents), currentIncidents, 7);
                    verifyIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_IND_" + currentIncidents), currentIncidents, 8);
                    verifyINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_INT_" + currentIncidents), currentIncidents, 9);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_" + currentIncidents), currentIncidents, 10);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_" + currentIncidents), currentIncidents, 11);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_" + currentIncidents), currentIncidents, 12);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_" + currentIncidents), currentIncidents, 13);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_" + currentIncidents), currentIncidents, 14);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_" + currentIncidents), currentIncidents, 15);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_" + currentIncidents), currentIncidents, 16);
                    verifyPUREIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_IND_" + currentIncidents), currentIncidents, 17);
                    verifyPUREINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_INT_" + currentIncidents), currentIncidents, 18);
                } else {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_" + currentIncidents), currentIncidents, 7);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_" + currentIncidents), currentIncidents, 8);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_" + currentIncidents), currentIncidents, 9);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_" + currentIncidents), currentIncidents, 10);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_" + currentIncidents), currentIncidents, 11);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_" + currentIncidents), currentIncidents, 12);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_" + currentIncidents), currentIncidents, 13);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_" + currentIncidents), currentIncidents, 14);
                }
                totalIncidents++;
            }
        }
    }

    public void fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_END(Map<String, String> data) {
        int totalIncidents = 0;

        for (int i = 1; i <= data.get("Driver_Incidents_END").split(",").length; i++) {
            if (data.get("State").equalsIgnoreCase("MO") ||
                    data.get("State").equalsIgnoreCase("AZ") ||
                    data.get("State").equalsIgnoreCase("KY") ||
                    data.get("State").equalsIgnoreCase("MN") ||
                    data.get("State").equalsIgnoreCase("TN") ||
                    data.get("State").equalsIgnoreCase("MD") ||
                    data.get("State").equalsIgnoreCase("MI") ||
                    data.get("State").equalsIgnoreCase("IN")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_END_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_END_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_END_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_END_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_END_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_END_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_END_" + i), i, 7);
                verifyIND(data.get("Driver_Incidents_Included_In_Household_Averaging_IND_END_" + i), i, 8);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_END_" + i), i, 9);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_END_" + i), i, 10);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_END_" + i), i, 11);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_END_" + i), i, 12);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_END_" + i), i, 13);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_END_" + i), i, 14);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_END_" + i), i, 15);
                verifyPUREIND(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_IND_END_" + i), i, 16);
            } else if (data.get("State").equalsIgnoreCase("CA")) {
                //DO NOTHING THIS BLOCK DOES NOT APPLY TO CA
            } else if (data.get("State").equalsIgnoreCase("KS")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_END_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_END_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_END_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_END_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_END_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_END_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_END_" + i), i, 7);
                verifyINT(data.get("Driver_Incidents_Included_In_Household_Averaging_INT_END_" + i), i, 8);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_END_" + i), i, 9);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_END_" + i), i, 10);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_END_" + i), i, 11);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_END_" + i), i, 12);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_END_" + i), i, 13);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_END_" + i), i, 14);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_END_" + i), i, 15);
                verifyPUREINT(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_INT_END_" + i), i, 16);
            } else if (data.get("State").equalsIgnoreCase("MN")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_END_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_END_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_END_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_END_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_END_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_END_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_END_" + i), i, 7);
                verifyIND(data.get("Driver_Incidents_Included_In_Household_Averaging_IND_END_" + i), i, 8);
                verifyINT(data.get("Driver_Incidents_Included_In_Household_Averaging_INT_END_" + i), i, 9);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_END_" + i), i, 10);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_END_" + i), i, 11);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_END_" + i), i, 12);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_END_" + i), i, 13);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_END_" + i), i, 14);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_END_" + i), i, 15);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_END_" + i), i, 16);
                verifyPUREIND(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_IND_END_" + i), i, 17);
                verifyPUREINT(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_INT_END_" + i), i, 18);
            } else {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_END_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_END_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_END_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_END_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_END_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_END_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_END_" + i), i, 7);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_END_" + i), i, 8);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_END_" + i), i, 9);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_END_" + i), i, 10);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_END_" + i), i, 11);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_END_" + i), i, 12);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_END_" + i), i, 13);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_END_" + i), i, 14);
            }
            totalIncidents++;
        }

//        for (int i = 1; i <= data.get("Additional_Operators_END").split(",").length; i++) {
//            for (int j = 1; j <= data.get("Additional_Operator_Incidents_END_" + i).split(",").length; j++) {
//                int currentIncidents = totalIncidents + 1;
//                if (data.get("State").equalsIgnoreCase("MO") ||
//                        data.get("State").equalsIgnoreCase("AZ") ||
//                        data.get("State").equalsIgnoreCase("KY") ||
//                        data.get("State").equalsIgnoreCase("MN") ||
//                        data.get("State").equalsIgnoreCase("TN") ||
//                        data.get("State").equalsIgnoreCase("MD") ||
//                        data.get("State").equalsIgnoreCase("MI") ||
//                        data.get("State").equalsIgnoreCase("IN")) {
//                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
//                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_END_" + currentIncidents), currentIncidents, 1);
//                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_END_" + currentIncidents), currentIncidents, 2);
//                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_END_" + currentIncidents), currentIncidents, 3);
//                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_END_" + currentIncidents), currentIncidents, 4);
//                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_END_" + currentIncidents), currentIncidents, 5);
//                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_END_" + currentIncidents), currentIncidents, 6);
//                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_END_" + currentIncidents), currentIncidents, 7);
//                    verifyIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_IND_END_" + currentIncidents), currentIncidents, 8);
//                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_END_" + currentIncidents), currentIncidents, 9);
//                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_END_" + currentIncidents), currentIncidents, 10);
//                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_END_" + currentIncidents), currentIncidents, 11);
//                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_END_" + currentIncidents), currentIncidents, 12);
//                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_END_" + currentIncidents), currentIncidents, 13);
//                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_END_" + currentIncidents), currentIncidents, 14);
//                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_END_" + currentIncidents), currentIncidents, 15);
//                    verifyPUREIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_IND_END_" + currentIncidents), currentIncidents, 16);
//                } else if(data.get("State").equalsIgnoreCase("CA")) {
//                    //DO NOTHING THIS BLOCK DOES NOT APPLY TO CA
//                } else if(data.get("State").equalsIgnoreCase("KS")){
//                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
//                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_END_" + currentIncidents), currentIncidents, 1);
//                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_END_" + currentIncidents), currentIncidents, 2);
//                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_END_" + currentIncidents), currentIncidents, 3);
//                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_END_" + currentIncidents), currentIncidents, 4);
//                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_END_" + currentIncidents), currentIncidents, 5);
//                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_END_" + currentIncidents), currentIncidents, 6);
//                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_END_" + currentIncidents), currentIncidents, 7);
//                    verifyINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_INT_END_" + currentIncidents), currentIncidents, 8);
//                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_END_" + currentIncidents), currentIncidents, 9);
//                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_END_" + currentIncidents), currentIncidents, 10);
//                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_END_" + currentIncidents), currentIncidents, 11);
//                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_END_" + currentIncidents), currentIncidents, 12);
//                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_END_" + currentIncidents), currentIncidents, 13);
//                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_END_" + currentIncidents), currentIncidents, 14);
//                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_END_" + currentIncidents), currentIncidents, 15);
//                    verifyPUREINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_INT_END_" + currentIncidents), currentIncidents, 16);
//                } else if(data.get("State").equalsIgnoreCase("MN")){
//                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
//                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_END_" + currentIncidents), currentIncidents, 1);
//                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_END_" + currentIncidents), currentIncidents, 2);
//                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_END_" + currentIncidents), currentIncidents, 3);
//                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_END_" + currentIncidents), currentIncidents, 4);
//                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_END_" + currentIncidents), currentIncidents, 5);
//                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_END_" + currentIncidents), currentIncidents, 6);
//                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_END_" + currentIncidents), currentIncidents, 7);
//                    verifyIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_IND_END_" + currentIncidents), currentIncidents, 8);
//                    verifyINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_INT_END_" + currentIncidents), currentIncidents, 9);
//                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_END_" + currentIncidents), currentIncidents, 10);
//                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_END_" + currentIncidents), currentIncidents, 11);
//                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_END_" + currentIncidents), currentIncidents, 12);
//                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_END_" + currentIncidents), currentIncidents, 13);
//                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_END_" + currentIncidents), currentIncidents, 14);
//                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_END_" + currentIncidents), currentIncidents, 15);
//                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_END_" + currentIncidents), currentIncidents, 16);
//                    verifyPUREIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_IND_END_" + currentIncidents), currentIncidents, 17);
//                    verifyPUREINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_INT_END_" + currentIncidents), currentIncidents, 18);
//                } else {
//                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents, 0);
//                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_END_" + currentIncidents), currentIncidents, 1);
//                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_END_" + currentIncidents), currentIncidents, 2);
//                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_END_" + currentIncidents), currentIncidents, 3);
//                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_END_" + currentIncidents), currentIncidents, 4);
//                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_END_" + currentIncidents), currentIncidents, 5);
//                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_END_" + currentIncidents), currentIncidents, 6);
//                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_END_" + currentIncidents), currentIncidents, 7);
//                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_END_" + currentIncidents), currentIncidents, 8);
//                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_END_" + currentIncidents), currentIncidents, 9);
//                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_END_" + currentIncidents), currentIncidents, 10);
//                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_END_" + currentIncidents), currentIncidents, 11);
//                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_END_" + currentIncidents), currentIncidents, 12);
//                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_END_" + currentIncidents), currentIncidents, 13);
//                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_END_" + currentIncidents), currentIncidents, 14);
//                }
//                totalIncidents++;
//            }
//        }

        //TODO PA END - Driver incidents included in household averaging - Low
    }

    public void fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_OOS_END(Map<String, String> data) {
        int totalIncidents = 0;

        for (int i = 1; i <= data.get("Driver_Incidents_OOS_END").split(",").length; i++) {
            if (data.get("State").equalsIgnoreCase("MO") ||
                    data.get("State").equalsIgnoreCase("AZ") ||
                    data.get("State").equalsIgnoreCase("KY") ||
                    data.get("State").equalsIgnoreCase("MN") ||
                    data.get("State").equalsIgnoreCase("TN") ||
                    data.get("State").equalsIgnoreCase("MD") ||
                    data.get("State").equalsIgnoreCase("MI") ||
                    data.get("State").equalsIgnoreCase("IN")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_OOS_END_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_OOS_END_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_OOS_END_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_OOS_END_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_OOS_END_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_OOS_END_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_OOS_END_" + i), i, 7);
                verifyIND(data.get("Driver_Incidents_Included_In_Household_Averaging_IND_OOS_END_" + i), i, 8);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_OOS_END_" + i), i, 9);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_OOS_END_" + i), i, 10);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_OOS_END_" + i), i, 11);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_OOS_END_" + i), i, 12);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_OOS_END_" + i), i, 13);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_OOS_END_" + i), i, 14);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_OOS_END_" + i), i, 15);
                verifyPUREIND(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_IND_OOS_END_" + i), i, 16);
            } else if (data.get("State").equalsIgnoreCase("CA")) {
                //DO NOTHING THIS BLOCK DOES NOT APPLY TO CA
            } else if (data.get("State").equalsIgnoreCase("KS")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_OOS_END_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_OOS_END_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_OOS_END_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_OOS_END_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_OOS_END_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_OOS_END_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_OOS_END_" + i), i, 7);
                verifyINT(data.get("Driver_Incidents_Included_In_Household_Averaging_INT_OOS_END_" + i), i, 8);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_OOS_END_" + i), i, 9);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_OOS_END_" + i), i, 10);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_OOS_END_" + i), i, 11);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_OOS_END_" + i), i, 12);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_OOS_END_" + i), i, 13);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_OOS_END_" + i), i, 14);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_OOS_END_" + i), i, 15);
                verifyPUREINT(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_INT_OOS_END_" + i), i, 16);
            } else if (data.get("State").equalsIgnoreCase("MN")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_OOS_END_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_OOS_END_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_OOS_END_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_OOS_END_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_OOS_END_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_OOS_END_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_OOS_END_" + i), i, 7);
                verifyIND(data.get("Driver_Incidents_Included_In_Household_Averaging_IND_OOS_END_" + i), i, 8);
                verifyINT(data.get("Driver_Incidents_Included_In_Household_Averaging_INT_OOS_END_" + i), i, 9);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_OOS_END_" + i), i, 10);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_OOS_END_" + i), i, 11);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_OOS_END_" + i), i, 12);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_OOS_END_" + i), i, 13);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_OOS_END_" + i), i, 14);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_OOS_END_" + i), i, 15);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_OOS_END_" + i), i, 16);
                verifyPUREIND(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_IND_OOS_END_" + i), i, 17);
                verifyPUREINT(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_INT_OOS_END_" + i), i, 18);
            } else {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_OOS_END_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_OOS_END_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_OOS_END_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_OOS_END_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_OOS_END_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_OOS_END_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_OOS_END_" + i), i, 7);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_OOS_END_" + i), i, 8);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_OOS_END_" + i), i, 9);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_OOS_END_" + i), i, 10);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_OOS_END_" + i), i, 11);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_OOS_END_" + i), i, 12);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_OOS_END_" + i), i, 13);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_OOS_END_" + i), i, 14);
            }
            totalIncidents++;
        }

        for (int i = 1; i <= data.get("Additional_Operators_OOS_END").split(",").length; i++) {
            for (int j = 1; j <= data.get("Additional_Operator_Incidents_OOS_END_" + i).split(",").length; j++) {
                int currentIncidents = totalIncidents + 1;
                if (data.get("State").equalsIgnoreCase("MO") ||
                        data.get("State").equalsIgnoreCase("AZ") ||
                        data.get("State").equalsIgnoreCase("KY") ||
                        data.get("State").equalsIgnoreCase("MN") ||
                        data.get("State").equalsIgnoreCase("TN") ||
                        data.get("State").equalsIgnoreCase("MD") ||
                        data.get("State").equalsIgnoreCase("MI") ||
                        data.get("State").equalsIgnoreCase("IN")) {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_OOS_END_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_OOS_END_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_OOS_END_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_OOS_END_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_OOS_END_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_OOS_END_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_OOS_END_" + currentIncidents), currentIncidents, 7);
                    verifyIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_IND_OOS_END_" + currentIncidents), currentIncidents, 8);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_OOS_END_" + currentIncidents), currentIncidents, 9);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_OOS_END_" + currentIncidents), currentIncidents, 10);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_OOS_END_" + currentIncidents), currentIncidents, 11);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_OOS_END_" + currentIncidents), currentIncidents, 12);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_OOS_END_" + currentIncidents), currentIncidents, 13);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_OOS_END_" + currentIncidents), currentIncidents, 14);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_OOS_END_" + currentIncidents), currentIncidents, 15);
                    verifyPUREIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_IND_OOS_END_" + currentIncidents), currentIncidents, 16);
                } else if (data.get("State").equalsIgnoreCase("CA")) {
                    //DO NOTHING THIS BLOCK DOES NOT APPLY TO CA
                } else if (data.get("State").equalsIgnoreCase("KS")) {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_OOS_END_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_OOS_END_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_OOS_END_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_OOS_END_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_OOS_END_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_OOS_END_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_OOS_END_" + currentIncidents), currentIncidents, 7);
                    verifyINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_INT_OOS_END_" + currentIncidents), currentIncidents, 8);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_OOS_END_" + currentIncidents), currentIncidents, 9);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_OOS_END_" + currentIncidents), currentIncidents, 10);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_OOS_END_" + currentIncidents), currentIncidents, 11);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_OOS_END_" + currentIncidents), currentIncidents, 12);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_OOS_END_" + currentIncidents), currentIncidents, 13);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_OOS_END_" + currentIncidents), currentIncidents, 14);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_OOS_END_" + currentIncidents), currentIncidents, 15);
                    verifyPUREINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_INT_OOS_END_" + currentIncidents), currentIncidents, 16);
                } else if (data.get("State").equalsIgnoreCase("MN")) {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_OOS_END_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_OOS_END_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_OOS_END_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_OOS_END_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_OOS_END_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_OOS_END_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_OOS_END_" + currentIncidents), currentIncidents, 7);
                    verifyIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_IND_OOS_END_" + currentIncidents), currentIncidents, 8);
                    verifyINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_INT_OOS_END_" + currentIncidents), currentIncidents, 9);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_OOS_END_" + currentIncidents), currentIncidents, 10);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_OOS_END_" + currentIncidents), currentIncidents, 11);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_OOS_END_" + currentIncidents), currentIncidents, 12);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_OOS_END_" + currentIncidents), currentIncidents, 13);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_OOS_END_" + currentIncidents), currentIncidents, 14);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_OOS_END_" + currentIncidents), currentIncidents, 15);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_OOS_END_" + currentIncidents), currentIncidents, 16);
                    verifyPUREIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_IND_OOS_END_" + currentIncidents), currentIncidents, 17);
                    verifyPUREINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_INT_OOS_END_" + currentIncidents), currentIncidents, 18);
                } else {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_OOS_END_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_OOS_END_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_OOS_END_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_OOS_END_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_OOS_END_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_OOS_END_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_OOS_END_" + currentIncidents), currentIncidents, 7);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_OOS_END_" + currentIncidents), currentIncidents, 8);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_OOS_END_" + currentIncidents), currentIncidents, 9);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_OOS_END_" + currentIncidents), currentIncidents, 10);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_OOS_END_" + currentIncidents), currentIncidents, 11);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_OOS_END_" + currentIncidents), currentIncidents, 12);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_OOS_END_" + currentIncidents), currentIncidents, 13);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_OOS_END_" + currentIncidents), currentIncidents, 14);
                }
                totalIncidents++;
            }
        }

        //TODO PA OOS - Driver incidents included in household averaging - Low
    }

    public void fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_RNW(Map<String, String> data) {
        int totalIncidents = 0;

        for (int i = 1; i <= data.get("Driver_Incidents_RNW").split(",").length; i++) {
            if (data.get("State").equalsIgnoreCase("MO") ||
                    data.get("State").equalsIgnoreCase("AZ") ||
                    data.get("State").equalsIgnoreCase("KY") ||
                    data.get("State").equalsIgnoreCase("MN") ||
                    data.get("State").equalsIgnoreCase("TN") ||
                    data.get("State").equalsIgnoreCase("MD") ||
                    data.get("State").equalsIgnoreCase("MI") ||
                    data.get("State").equalsIgnoreCase("IN")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_RNW_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_RNW_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_RNW_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_RNW_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_RNW_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_RNW_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_RNW_" + i), i, 7);
                verifyIND(data.get("Driver_Incidents_Included_In_Household_Averaging_IND_RNW_" + i), i, 8);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_RNW_" + i), i, 9);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_RNW_" + i), i, 10);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_RNW_" + i), i, 11);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_RNW_" + i), i, 12);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_RNW_" + i), i, 13);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_RNW_" + i), i, 14);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_RNW_" + i), i, 15);
                verifyPUREIND(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_IND_RNW_" + i), i, 16);
            } else if (data.get("State").equalsIgnoreCase("CA")) {
                //DO NOTHING THIS BLOCK DOES NOT APPLY TO CA
            } else if (data.get("State").equalsIgnoreCase("KS")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_RNW_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_RNW_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_RNW_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_RNW_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_RNW_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_RNW_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_RNW_" + i), i, 7);
                verifyINT(data.get("Driver_Incidents_Included_In_Household_Averaging_INT_RNW_" + i), i, 8);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_RNW_" + i), i, 9);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_RNW_" + i), i, 10);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_RNW_" + i), i, 11);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_RNW_" + i), i, 12);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_RNW_" + i), i, 13);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_RNW_" + i), i, 14);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_RNW_" + i), i, 15);
                verifyPUREINT(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_INT_RNW_" + i), i, 16);
            } else if (data.get("State").equalsIgnoreCase("MN")) {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_RNW_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_RNW_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_RNW_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_RNW_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_RNW_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_RNW_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_RNW_" + i), i, 7);
                verifyIND(data.get("Driver_Incidents_Included_In_Household_Averaging_IND_RNW_" + i), i, 8);
                verifyINT(data.get("Driver_Incidents_Included_In_Household_Averaging_INT_RNW_" + i), i, 9);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_RNW_" + i), i, 10);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_RNW_" + i), i, 11);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_RNW_" + i), i, 12);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_RNW_" + i), i, 13);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_RNW_" + i), i, 14);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_RNW_" + i), i, 15);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_RNW_" + i), i, 16);
                verifyPUREIND(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_IND_RNW_" + i), i, 17);
                verifyPUREINT(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_INT_RNW_" + i), i, 18);
            } else {
                verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), i, 0);
                verifyAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_AAF_RNW_" + i), i, 1);
                verifyAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_AFB_RNW_" + i), i, 2);
                verifyCPA(data.get("Driver_Incidents_Included_In_Household_Averaging_CPA_RNW_" + i), i, 3);
                verifyMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_MAJ_RNW_" + i), i, 4);
                verifyMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_MIN_RNW_" + i), i, 5);
                verifyNAF(data.get("Driver_Incidents_Included_In_Household_Averaging_NAF_RNW_" + i), i, 6);
                verifySPD(data.get("Driver_Incidents_Included_In_Household_Averaging_SPD_RNW_" + i), i, 7);
                verifyPUREAAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AAF_RNW_" + i), i, 8);
                verifyPUREAFB(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_AFB_RNW_" + i), i, 9);
                verifyPURECPA(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_CPA_RNW_" + i), i, 10);
                verifyPUREMAJ(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MAJ_RNW_" + i), i, 11);
                verifyPUREMIN(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_MIN_RNW_" + i), i, 12);
                verifyPURENAF(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_NAF_RNW_" + i), i, 13);
                verifyPURESPD(data.get("Driver_Incidents_Included_In_Household_Averaging_PURE_SPD_RNW_" + i), i, 14);
            }
            totalIncidents++;
        }

        for (int i = 1; i <= data.get("Additional_Operators_RNW").split(",").length; i++) {
            for (int j = 1; j <= data.get("Additional_Operator_Incidents_RNW_" + i).split(",").length; j++) {
                int currentIncidents = totalIncidents + 1;
                if (data.get("State").equalsIgnoreCase("MO") ||
                        data.get("State").equalsIgnoreCase("AZ") ||
                        data.get("State").equalsIgnoreCase("KY") ||
                        data.get("State").equalsIgnoreCase("MN") ||
                        data.get("State").equalsIgnoreCase("TN") ||
                        data.get("State").equalsIgnoreCase("MD") ||
                        data.get("State").equalsIgnoreCase("MI") ||
                        data.get("State").equalsIgnoreCase("IN")) {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_RNW_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_RNW_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_RNW_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_RNW_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_RNW_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_RNW_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_RNW_" + currentIncidents), currentIncidents, 7);
                    verifyIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_IND_RNW_" + currentIncidents), currentIncidents, 8);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_RNW_" + currentIncidents), currentIncidents, 9);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_RNW_" + currentIncidents), currentIncidents, 10);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_RNW_" + currentIncidents), currentIncidents, 11);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_RNW_" + currentIncidents), currentIncidents, 12);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_RNW_" + currentIncidents), currentIncidents, 13);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_RNW_" + currentIncidents), currentIncidents, 14);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_RNW_" + currentIncidents), currentIncidents, 15);
                    verifyPUREIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_IND_RNW_" + currentIncidents), currentIncidents, 16);
                } else if (data.get("State").equalsIgnoreCase("CA")) {
                    //DO NOTHING THIS BLOCK DOES NOT APPLY TO CA
                } else if (data.get("State").equalsIgnoreCase("KS")) {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_RNW_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_RNW_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_RNW_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_RNW_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_RNW_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_RNW_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_RNW_" + currentIncidents), currentIncidents, 7);
                    verifyINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_INT_RNW_" + currentIncidents), currentIncidents, 8);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_RNW_" + currentIncidents), currentIncidents, 9);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_RNW_" + currentIncidents), currentIncidents, 10);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_RNW_" + currentIncidents), currentIncidents, 11);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_RNW_" + currentIncidents), currentIncidents, 12);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_RNW_" + currentIncidents), currentIncidents, 13);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_RNW_" + currentIncidents), currentIncidents, 14);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_RNW_" + currentIncidents), currentIncidents, 15);
                    verifyPUREINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_INT_RNW_" + currentIncidents), currentIncidents, 16);
                } else if (data.get("State").equalsIgnoreCase("MN")) {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents + 1, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_RNW_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_RNW_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_RNW_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_RNW_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_RNW_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_RNW_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_RNW_" + currentIncidents), currentIncidents, 7);
                    verifyIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_IND_RNW_" + currentIncidents), currentIncidents, 8);
                    verifyINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_INT_RNW_" + currentIncidents), currentIncidents, 9);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_RNW_" + currentIncidents), currentIncidents, 10);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_RNW_" + currentIncidents), currentIncidents, 11);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_RNW_" + currentIncidents), currentIncidents, 12);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_RNW_" + currentIncidents), currentIncidents, 13);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_RNW_" + currentIncidents), currentIncidents, 14);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_RNW_" + currentIncidents), currentIncidents, 15);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_RNW_" + currentIncidents), currentIncidents, 16);
                    verifyPUREIND(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_IND_RNW_" + currentIncidents), currentIncidents, 17);
                    verifyPUREINT(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_INT_RNW_" + currentIncidents), currentIncidents, 18);
                } else {
                    verifyAdditionalDriver(data.get("First_Name") + " " + data.get("Last_Name"), totalIncidents, 0);
                    verifyAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AAF_RNW_" + currentIncidents), currentIncidents, 1);
                    verifyAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_AFB_RNW_" + currentIncidents), currentIncidents, 2);
                    verifyCPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_CPA_RNW_" + currentIncidents), currentIncidents, 3);
                    verifyMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MAJ_RNW_" + currentIncidents), currentIncidents, 4);
                    verifyMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_MIN_RNW_" + currentIncidents), currentIncidents, 5);
                    verifyNAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_NAF_RNW_" + currentIncidents), currentIncidents, 6);
                    verifySPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_SPD_RNW_" + currentIncidents), currentIncidents, 7);
                    verifyPUREAAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AAF_RNW_" + currentIncidents), currentIncidents, 8);
                    verifyPUREAFB(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_AFB_RNW_" + currentIncidents), currentIncidents, 9);
                    verifyPURECPA(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_CPA_RNW_" + currentIncidents), currentIncidents, 10);
                    verifyPUREMAJ(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MAJ_RNW_" + currentIncidents), currentIncidents, 11);
                    verifyPUREMIN(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_MIN_RNW_" + currentIncidents), currentIncidents, 12);
                    verifyPURENAF(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_NAF_RNW_" + currentIncidents), currentIncidents, 13);
                    verifyPURESPD(data.get("Driver_Incidents_Additional_Driver_Included_In_Household_Averaging_PURE_SPD_RNW_" + currentIncidents), currentIncidents, 14);
                }
                totalIncidents++;
            }
        }

        //TODO PA RNW - Driver incidents included in household averaging - Low
    }

    public void verifyAdditionalDriver(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Additional Driver");
    }

    public void verifyAAF(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging AAF");
    }

    public void verifyAFB(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging AFB");
    }

    public void verifyCPA(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging CPA");
    }

    public void verifyMAJ(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging MAJ");
    }

    public void verifyMIN(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging MIN");
    }

    public void verifyNAF(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging NAF");
    }

    public void verifySPD(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging NAF");
    }

    public void verifyIND(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging IND");
    }

    public void verifyINT(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging INT");
    }

    public void verifyPUREAAF(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging PURE AAF");
    }

    public void verifyPUREAFB(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging PURE AFB");
    }

    public void verifyPURECPA(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging PURE CPA");
    }

    public void verifyPUREMAJ(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging PURE MAJ");
    }

    public void verifyPUREMIN(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging PURE MIN");
    }

    public void verifyPURENAF(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging PURE NAF");
    }

    public void verifyPURESPD(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging PURE SPD");
    }

    public void verifyPUREIND(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging PURE IND");
    }

    public void verifyPUREINT(String s, int row, int cell) {
        assertEquals(driver.findElement(By.xpath("//div[text()='driver incidents included in Household Averaging']/../../../../../..//table//tr[" + row + "]/td[" + cell + "]")).getText(), s, "Averaging PURE INT");
    }

}