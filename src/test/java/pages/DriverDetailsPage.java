package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.DriverDetailsBlock;
import pages.blocks.DriverIncidentsBlock;
import pages.blocks.OptionalToQuoteRequiredToBindBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class DriverDetailsPage extends CommonComponentsAndActions {
    WebDriver driver;

    DriverDetailsBlock driverDetailsBlock;
    DriverIncidentsBlock driverIncidentsBlock;
    OptionalToQuoteRequiredToBindBlock optionalToQuoteRequiredToBindBlock;

    public DriverDetailsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driverDetailsBlock = new DriverDetailsBlock(driver);
        driverIncidentsBlock = new DriverIncidentsBlock(driver);
        optionalToQuoteRequiredToBindBlock = new OptionalToQuoteRequiredToBindBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='previous incidents details from CLUE Reports']/../../../../../..//tr")
    List<WebElement> clueDataReturned;

    public void fillDriverDetailsPagePA(Map<String, String> data) throws Throwable {
        navigateToDriverDetailsPage(data, "First_Name", "MI", "Last_Name");
        pause(10000);
        driverDetailsBlock.fillDriverDetailsDetailsPA(data);
        optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindDriverDetailsPA(data);
        driverIncidentsBlock.fillDriverIncidentsDetailsPA(data);

        for (int i = 1; i <= data.get("Additional_Operators").split(",").length; i++) {
            if (!data.get("Additional_Operators_Additional_Driver_Driver_Status_" + i).equalsIgnoreCase("Not in Household") &&
                    !data.get("Additional_Operators_Additional_Driver_Driver_Status_" + i).equalsIgnoreCase("Deceased") &&
                    !data.get("Additional_Operators_Additional_Driver_Driver_Status_" + i).equalsIgnoreCase("Duplicate") &&
                    !data.get("Additional_Operators_Additional_Driver_Driver_Status_" + i).equalsIgnoreCase("Driver Unknown") &&
                    !data.get("Additional_Operators_Additional_Driver_Driver_Status_" + i).equalsIgnoreCase("LLC/Trust/Corp")) {

                navigateToDriverDetailsPage(data, "Additional_Operators_Additional_Driver_First_Name_" + i, "Additional_Operators_Additional_Driver_MI_" + i, "Additional_Operators_Additional_Driver_Last_Name_" + i);
                driverDetailsBlock.fillAdditionalDriverDetailsPA(data, i);
                optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA(data, i);
                driverIncidentsBlock.fillAdditionalDriverIncidentsDetailsPA(data, i);
            }
        }

        if (hasValue(data.get("Obtained_Operators_Num"))) {
            for (int i = 0; i < Integer.parseInt(data.get("Obtained_Operators_Num")); i++) {
                navigateToDriverDetailsPage(data, "Obtained_Operators_First_Name_" + (i + 1), "Obtained_Operators_MI_" + (i + 1), "Obtained_Operators_Last_Name_" + (i + 1));
                driverDetailsBlock.setDriverMaritalStatus("Single");
                driverDetailsBlock.setDriverLicenseStatus("Active License in U.S.");
                driverDetailsBlock.setHowlLongLicensedInUS("3 or More Yrs");
                driverDetailsBlock.setHighestLevelOfEducationCompleted("High School");
                driverDetailsBlock.setSR22Certificate("Yes");
                driverDetailsBlock.setLicensedInAnotherState("No");
                optionalToQuoteRequiredToBindBlock.setDriversOccupation("Driver");
            }
        }

    }

    public void fillDriverDetailsPagePA_END(Map<String, String> data) throws Throwable {
        navigateToDriverDetailsPage(data, "First_Name", "MI", "Last_Name");
        pause(10000);
        driverDetailsBlock.fillDriverDetailsDetailsPA_END(data);
        optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindDriverDetailsPA_END(data);
        driverIncidentsBlock.fillDriverIncidentsDetailsPA_END(data);

        String[] additionalOperatorsNB = data.get("Additional_Operators").split(",");
        String[] additionalOperatorsEND = data.get("Additional_Operators_END").split(",");

        //Modify additional operators
        for (int i = 1; i <= additionalOperatorsEND.length; i++) {
            if (additionalOperatorsEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < additionalOperatorsNB.length; j++) {
                    if (additionalOperatorsNB[j].equalsIgnoreCase(additionalOperatorsEND[i - 1].split("_MOD")[0])) {
                        if (!data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Not in Household") &&
                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Deceased") &&
                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Duplicate") &&
                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Driver Unknown") &&
                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("LLC/Trust/Corp")) {

                            navigateToDriverDetailsPage(data, "Additional_Operators_Additional_Driver_First_Name_END_" + i, "Additional_Operators_Additional_Driver_MI_END_" + i, "Additional_Operators_Additional_Driver_Last_Name_END_" + i);
                            driverDetailsBlock.fillAdditionalDriverDetailsPA_END(data, i);
                            optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA_END(data, i);
                            driverIncidentsBlock.fillAdditionalDriverIncidentsDetailsPA_END(data, i);
                        }
                    }
                }
            }
        }

        //Add additional operators
        for (int i = 1; i <= additionalOperatorsEND.length; i++) {
            if (additionalOperatorsEND[i - 1].contains("_ADD")) {
                if (!data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Not in Household") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Deceased") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Duplicate") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("Driver Unknown") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + i).equalsIgnoreCase("LLC/Trust/Corp")) {

                    navigateToDriverDetailsPage(data, "Additional_Operators_Additional_Driver_First_Name_END_" + i, "Additional_Operators_Additional_Driver_MI_END_" + i, "Additional_Operators_Additional_Driver_Last_Name_END_" + i);
                    driverDetailsBlock.fillAdditionalDriverDetailsPA_END(data, i);
                    optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA_END(data, i);
                    driverIncidentsBlock.fillAdditionalDriverIncidentsDetailsPA_END(data, i);
                }
            }
        }
    }

    public void fillDriverDetailsPagePA_OOS_END(Map<String, String> data) throws Throwable {
        navigateToDriverDetailsPage(data, "First_Name", "MI", "Last_Name");
        pause(10000);
        driverDetailsBlock.fillDriverDetailsDetailsPA_OOS_END(data);
        optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindDriverDetailsPA_OOS_END(data);
        driverIncidentsBlock.fillDriverIncidentsDetailsPA_OOS_END(data);

        String[] additionalOperatorsOOSEND = data.get("Additional_Operators_OOS_END").split(",");

        //Add additional operators
        for (int i = 1; i <= additionalOperatorsOOSEND.length; i++) {
            if (additionalOperatorsOOSEND[i - 1].contains("_ADD")) {
                if (!data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Not in Household") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Deceased") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Duplicate") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Driver Unknown") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("LLC/Trust/Corp")) {

                    navigateToDriverDetailsPage(data, "Additional_Operators_Additional_Driver_First_Name_OOS_END_" + i, "Additional_Operators_Additional_Driver_MI_OOS_END_" + i, "Additional_Operators_Additional_Driver_Last_Name_OOS_END_" + i);
                    driverDetailsBlock.fillAdditionalDriverDetailsPA_OOS_END(data, i);
                    optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA_OOS_END(data, i);
                    driverIncidentsBlock.fillAdditionalDriverIncidentsDetailsPA_OOS_END(data, i);
                }
            }
        }

//        Modify additional operators
//        for (int i = 1; i <= additionalOperatorsEND.length; i++) {
//            if (additionalOperatorsEND[i - 1].contains("_MOD")) {
//                for (int j = 0; j < additionalOperatorsNB.length; j++) {
//                    if (additionalOperatorsNB[j].equalsIgnoreCase(additionalOperatorsEND[i - 1].split("_MOD")[0])) {
//                        if (!data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Not in Household") &&
//                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Deceased") &&
//                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Duplicate") &&
//                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("Driver Unknown") &&
//                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_OOS_END_" + i).equalsIgnoreCase("LLC/Trust/Corp")) {
//
//                            navigateToDriverDetailsPage(data, "Additional_Operators_Additional_Driver_First_Name_OOS_END_" + i, "Additional_Operators_Additional_Driver_MI_OOS_END_" + i, "Additional_Operators_Additional_Driver_Last_Name_OOS_END_" + i);
//                            driverDetailsBlock.fillAdditionalDriverDetailsPA_OOS_END(data, i);
//                            optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA_OOS_END(data, i);
//                            driverIncidentsBlock.fillAdditionalDriverIncidentsDetailsPA_OOS_END(data, i);
//                        }
//                    }
//                }
//            }
//        }

        //TODO PA OOS - Driver Details - Modification - Mid
    }

    public void fillDriverDetailsPagePA_RNW(Map<String, String> data) throws Throwable {
        navigateToDriverDetailsPage(data, "First_Name", "MI", "Last_Name");
        pause(10000);
        driverDetailsBlock.fillDriverDetailsDetailsPA_RNW(data);
        optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindDriverDetailsPA_RNW(data);
        driverIncidentsBlock.fillDriverIncidentsDetailsPA_RNW(data);

        String[] additionalOperatorsRNW = data.get("Additional_Operators_RNW").split(",");

        //Add additional operators
        for (int i = 1; i <= additionalOperatorsRNW.length; i++) {
            if (additionalOperatorsRNW[i - 1].contains("_ADD")) {
                if (!data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Not in Household") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Deceased") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Duplicate") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Driver Unknown") &&
                        !data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("LLC/Trust/Corp")) {

                    navigateToDriverDetailsPage(data, "Additional_Operators_Additional_Driver_First_Name_RNW_" + i, "Additional_Operators_Additional_Driver_MI_RNW_" + i, "Additional_Operators_Additional_Driver_Last_Name_RNW_" + i);
                    driverDetailsBlock.fillAdditionalDriverDetailsPA_RNW(data, i);
                    optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA_RNW(data, i);
                    driverIncidentsBlock.fillAdditionalDriverIncidentsDetailsPA_RNW(data, i);
                }
            }
        }

//        Modify additional operators
//        for (int i = 1; i <= additionalOperatorsEND.length; i++) {
//            if (additionalOperatorsEND[i - 1].contains("_MOD")) {
//                for (int j = 0; j < additionalOperatorsNB.length; j++) {
//                    if (additionalOperatorsNB[j].equalsIgnoreCase(additionalOperatorsEND[i - 1].split("_MOD")[0])) {
//                        if (!data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Not in Household") &&
//                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Deceased") &&
//                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Duplicate") &&
//                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("Driver Unknown") &&
//                                !data.get("Additional_Operators_Additional_Driver_Driver_Status_RNW_" + i).equalsIgnoreCase("LLC/Trust/Corp")) {
//
//                            navigateToDriverDetailsPage(data, "Additional_Operators_Additional_Driver_First_Name_RNW_" + i, "Additional_Operators_Additional_Driver_MI_RNW_" + i, "Additional_Operators_Additional_Driver_Last_Name_RNW_" + i);
//                            driverDetailsBlock.fillAdditionalDriverDetailsPA_RNW(data, i);
//                            optionalToQuoteRequiredToBindBlock.fillOptionalToQuoteRequiredToBindAdditionalDriverDetailsPA_RNW(data, i);
//                            driverIncidentsBlock.fillAdditionalDriverIncidentsDetailsPA_RNW(data, i);
//                        }
//                    }
//                }
//            }
//        }
        //TODO PA RNW - Driver details - Modification - Mid

        if (data.get("State").equalsIgnoreCase("NY")) {
            goToPage("Operators & Vehicles");
            pause(3000);
            saveChanges();
        }
    }

    public void navigateToDriverDetailsPage(Map<String, String> data, String driverName, String driverMI, String driverLastName) throws Throwable {
        pause(3000);
        if (hasValue(data.get(driverMI))) {
            String MI = data.get(driverMI);
            try {
                clickElement(driver.findElement(By.xpath("//a[contains(text(),'" + data.get(driverName) + "') and contains(text(),'" + MI + "')]")));
            } catch (Exception e) {
                pause(10000);
                clickElement(footer);
                driver.findElement(By.xpath("//a[contains(text(),'" + data.get(driverName) + "') and contains(text(),'" + MI + "')]")).click();
            }
        } else {
            pause(3000);
                clickElement(driver.findElement(By.xpath("//a[contains(text(),'" + data.get(driverName) + "') and contains(text(),'" + data.get(driverLastName) + "')]")));
        }
        pause(3000);
    }

    public boolean isCLUEDataReturned() {
        return clueDataReturned.size() != 0;
    }

    public void verifyIfCLUEDataReturned(String value) throws Throwable {
        pause(2000);
        reportScreenshot("CLUE_Data_" + System.currentTimeMillis(), "CLUE Data");

        if (value.equalsIgnoreCase("Returned")) {
            if (!isCLUEDataReturned())
                failAssertion("CLUE Data is not returned");
            else
                successLog("CLUE Data is returned");
        } else {
            if (isCLUEDataReturned())
                failAssertion("CLUE Data is returned");
            else
                successLog("CLUE Data is not returned");
        }
    }

}