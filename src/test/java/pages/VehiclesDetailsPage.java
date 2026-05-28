package pages;

import io.cucumber.datatable.DataTable;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class VehiclesDetailsPage extends CommonComponentsAndActions {
    WebDriver driver;

    VehicleDetailsBlock vehicleDetailsBlock;
    OwnershipBlock ownershipBlock;
    VehicleCharacteristicsBlock vehicleCharacteristicsBlock;
    SymbolsBlock symbolsBlock;
    LossPayeeAdditionalInterestBlock lossPayeeAdditionalInterestBlock;
    TerritoryFactorsBlock territoryFactorsBlock;

    public VehiclesDetailsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        vehicleDetailsBlock = new VehicleDetailsBlock(driver);
        ownershipBlock = new OwnershipBlock(driver);
        vehicleCharacteristicsBlock = new VehicleCharacteristicsBlock(driver);
        symbolsBlock = new SymbolsBlock(driver);
        lossPayeeAdditionalInterestBlock = new LossPayeeAdditionalInterestBlock(driver);
        territoryFactorsBlock = new TerritoryFactorsBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillVehiclesDetailsPagePA(Map<String, String> data) throws Throwable {
        String[] additionalVehicles = data.get("Additional_Vehicles").split(",");

        int obtainedVehiclesNum;

        try {
            obtainedVehiclesNum = Integer.parseInt(data.get("Obtained_Vehicle_Num"));
        } catch (Exception e) {
            obtainedVehiclesNum = 0;
        }

        for (int i = 1; i <= additionalVehicles.length; i++) {
            navigateToVehicleDetailsPage(
                    data,
                    "Vehicle_Details_Year_" + i,
                    "Vehicle_Details_Make_" + i,
                    "Vehicle_Details_Model_" + i
            );

            pause(5000);

            vehicleDetailsBlock.fillVehicleDetailsPA(data, i);
            ownershipBlock.fillOwnershipDetailsPA(data, i);
            if (data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_" + i).equalsIgnoreCase("Yes") ||
                    data.get("Ownership_Ownership_" + i).equalsIgnoreCase("Financed")) {
                lossPayeeAdditionalInterestBlock.fillLossPayeeAdditionalInterestDetailsPA(data, i);
            }
            if (data.get("State").equalsIgnoreCase("HI") ||
                    data.get("State").equalsIgnoreCase("NH") ||
                    data.get("State").equalsIgnoreCase("MS") ||
                    data.get("State").equalsIgnoreCase("RI") ||
                    data.get("State").equalsIgnoreCase("VT") ||
                    data.get("State").equalsIgnoreCase("OK")||
                    data.get("State").equalsIgnoreCase("MT")) {
                symbolsBlock.fillSymbolDetailsPA(data, i);
            }
//            symbolsBlock.fillSymbolDetailsPA(data, i);
//            territoryFactorsBlock.fillTerritoryFactorsDetailsPA(data, i);

            saveChanges();
        }

        for (int i = 1; i <= obtainedVehiclesNum; i++) {
            navigateToVehicleDetailsPage(data,
                    "Obtained_Vehicle_Year_" + i,
                    "Obtained_Vehicle_Make_" + i,
                    "Obtained_Vehicle_Model_" + i
            );

            fillObtainedVehiclesDetails(data, i);

            saveChanges();
        }
    }

    public void fillVehiclesDetailsPagePA_END(Map<String, String> data) throws Throwable {
        String[] additionalVehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] additionalVehiclesEND = data.get("Additional_Vehicles_END").split(",");

        //Modified vehicles
        for (int i = 1; i <= additionalVehiclesEND.length; i++) {
            if (additionalVehiclesEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < additionalVehiclesNB.length; j++) {
                    if (additionalVehiclesNB[j].equalsIgnoreCase(additionalVehiclesEND[i - 1].split("_MOD")[0])) {
                        navigateToVehicleDetailsPage(
                                data,
                                "Vehicle_Details_Year_END_" + i,
                                "Vehicle_Details_Make_END_" + i,
                                "Vehicle_Details_Model_END_" + i
                        );

                        pause(5000);

                        vehicleDetailsBlock.fillVehicleDetailsPA_END(data, i);
                        ownershipBlock.fillOwnershipDetailsPA_END(data, i);
                        if (data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_END_" + i).equalsIgnoreCase("Yes") ||
                                data.get("Ownership_Ownership_END_" + i).equalsIgnoreCase("Financed")) {
                            lossPayeeAdditionalInterestBlock.fillLossPayeeAdditionalInterestDetailsPA_END(data, i);
                        }
//                        symbolsBlock.fillSymbolDetailsPA_END(data, i);
//                        territoryFactorsBlock.fillTerritoryFactorsDetailsPA_END(data, i);

                        saveChanges();
                    }
                }
            }
        }

        //Added vehicles
        for (int i = 1; i <= additionalVehiclesEND.length; i++) {
            if (additionalVehiclesEND[i - 1].contains("_ADD")) {
                navigateToVehicleDetailsPage(
                        data,
                        "Vehicle_Details_Year_END_" + i,
                        "Vehicle_Details_Make_END_" + i,
                        "Vehicle_Details_Model_END_" + i
                );

                pause(5000);

                vehicleDetailsBlock.fillVehicleDetailsPA_END(data, i);
                ownershipBlock.fillOwnershipDetailsPA_END(data, i);
                if (data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_END_" + i).equalsIgnoreCase("Yes") ||
                        data.get("Ownership_Ownership_END_" + i).equalsIgnoreCase("Financed")) {
                    lossPayeeAdditionalInterestBlock.fillLossPayeeAdditionalInterestDetailsPA_END(data, i);
                }
//                symbolsBlock.fillSymbolDetailsPA_END(data, i);
                //               territoryFactorsBlock.fillTerritoryFactorsDetailsPA_END(data, i);

                saveChanges();
            }
        }
    }

    public void fillVehiclesDetailsPagePA_OOS_END(Map<String, String> data) throws Throwable {
        String[] additionalVehiclesOOSEND = data.get("Additional_Vehicles_OOS_END").split(",");

        //Added vehicles
        for (int i = 1; i <= additionalVehiclesOOSEND.length; i++) {
            if (additionalVehiclesOOSEND[i - 1].contains("_ADD")) {
                navigateToVehicleDetailsPage(
                        data,
                        "Vehicle_Details_Year_OOS_END_" + i,
                        "Vehicle_Details_Make_OOS_END_" + i,
                        "Vehicle_Details_Model_OOS_END_" + i
                );

                pause(5000);

                vehicleDetailsBlock.fillVehicleDetailsPA_OOS_END(data, i);
                ownershipBlock.fillOwnershipDetailsPA_OOS_END(data, i);
                if (data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_OOS_END_" + i).equalsIgnoreCase("Yes") ||
                        data.get("Ownership_Ownership_OOS_END_" + i).equalsIgnoreCase("Financed")) {
                    lossPayeeAdditionalInterestBlock.fillLossPayeeAdditionalInterestDetailsPA_OOS_END(data, i);
                }
//                symbolsBlock.fillSymbolDetailsPA_OOS_END(data, i);
//                territoryFactorsBlock.fillTerritoryFactorsDetailsPA_OOS_END(data, i);

                saveChanges();
            }
        }

//        Modified vehicles
//        for (int i = 1; i <= additionalVehiclesEND.length; i++) {
//            if (additionalVehiclesEND[i - 1].contains("_MOD")) {
//                for (int j = 0; j < additionalVehiclesNB.length; j++) {
//                    if (additionalVehiclesNB[j].equalsIgnoreCase(additionalVehiclesEND[i - 1].split("_MOD")[0])) {
//                        navigateToVehicleDetailsPage(
//                                data,
//                                "Vehicle_Details_Year_OOS_END_" + i,
//                                "Vehicle_Details_Make_OOS_END_" + i,
//                                "Vehicle_Details_Model_OOS_END_" + i
//                        );
//
//                        pause(5000);
//
//                        vehicleDetailsBlock.fillVehicleDetailsPA_OOS_END(data, i);
//                        ownershipBlock.fillOwnershipDetailsPA_OOS_END(data, i);
//                        if (data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_OOS_END_" + i).equalsIgnoreCase("Yes") ||
//                                data.get("Ownership_Ownership_OOS_END_" + i).equalsIgnoreCase("Financed")) {
//                            lossPayeeAdditionalInterestBlock.fillLossPayeeAdditionalInterestDetailsPA_OOS_END(data, i);
//                        }
//                        symbolsBlock.fillSymbolDetailsPA_OOS_END(data, i);
//                        territoryFactorsBlock.fillTerritoryFactorsDetailsPA_OOS_END(data, i);
//
//                        saveChanges();
//                    }
//                }
//            }
//        }

        //TODO PA OOS - Vehicle details - Modification - Mid
    }

    public void fillVehiclesDetailsPagePA_RNW(Map<String, String> data) throws Throwable {
        String[] additionalVehiclesRNW = data.get("Additional_Vehicles_RNW").split(",");

        //Added vehicles
        for (int i = 1; i <= additionalVehiclesRNW.length; i++) {
            if (additionalVehiclesRNW[i - 1].contains("_ADD")) {
                navigateToVehicleDetailsPage(
                        data,
                        "Vehicle_Details_Year_RNW_" + i,
                        "Vehicle_Details_Make_RNW_" + i,
                        "Vehicle_Details_Model_RNW_" + i
                );

                pause(5000);
                saveChanges();
                if (isElementDisplayed(underwritingAlertsRaisedBlock, 5)) {
                    new UnderwritingReferralsPage(driver).approveAndAcceptUWReferralsIfVisible(data);
                    navigateToPolicyImagePage("no");
                }
                vehicleDetailsBlock.fillVehicleDetailsPA_RNW(data, i);
                ownershipBlock.fillOwnershipDetailsPA_RNW(data, i);
                if (data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_RNW_" + i).equalsIgnoreCase("Yes") ||
                        data.get("Ownership_Ownership_RNW_" + i).equalsIgnoreCase("Financed")) {
                    lossPayeeAdditionalInterestBlock.fillLossPayeeAdditionalInterestDetailsPA_RNW(data, i);
                }
//               symbolsBlock.fillSymbolDetailsPA_RNW(data, i);
//               territoryFactorsBlock.fillTerritoryFactorsDetailsPA_RNW(data, i);

                saveChanges();
            }
        }

//        Modified vehicles
//        for (int i = 1; i <= additionalVehiclesEND.length; i++) {
//            if (additionalVehiclesEND[i - 1].contains("_MOD")) {
//                for (int j = 0; j < additionalVehiclesNB.length; j++) {
//                    if (additionalVehiclesNB[j].equalsIgnoreCase(additionalVehiclesEND[i - 1].split("_MOD")[0])) {
//                        navigateToVehicleDetailsPage(
//                                data,
//                                "Vehicle_Details_Year_RNW_" + i,
//                                "Vehicle_Details_Make_RNW_" + i,
//                                "Vehicle_Details_Model_RNW_" + i
//                        );
//
//                        pause(5000);
//
//                        vehicleDetailsBlock.fillVehicleDetailsPA_RNW(data, i);
//                        ownershipBlock.fillOwnershipDetailsPA_RNW(data, i);
//                        if (data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_RNW_" + i).equalsIgnoreCase("Yes") ||
//                                data.get("Ownership_Ownership_RNW_" + i).equalsIgnoreCase("Financed")) {
//                            lossPayeeAdditionalInterestBlock.fillLossPayeeAdditionalInterestDetailsPA_RNW(data, i);
//                        }
//                        symbolsBlock.fillSymbolDetailsPA_RNW(data, i);
//                        territoryFactorsBlock.fillTerritoryFactorsDetailsPA_RNW(data, i);
//
//                        saveChanges();
//                    }
//                }
//            }
//        }

        //TODO PA RNW - Vehicle details - Modification - Mid
    }

    public void fillObtainedVehiclesDetails(Map<String, String> data, int i) throws Throwable {
        try {
            vehicleDetailsBlock.setVehicleInsureByAnotherPUREPolicy("No");
        } catch (Exception e) {
        }

        try {
            vehicleDetailsBlock.setCustomOrAdditionalEquipment("No", "0");
        } catch (Exception e) {
        }

        vehicleDetailsBlock.setVehicleRegistered("Yes");
        vehicleDetailsBlock.setVehicleVacationUse("No");
        vehicleDetailsBlock.setVehicleUse("Commute");
        vehicleDetailsBlock.setCurrentTermOverride("Yes", "10,000");
        ownershipBlock.setOwnership("Owned");
        ownershipBlock.setVehicleTitledInTheName(data.get("First_Name"));
        if (data.get("State").equalsIgnoreCase("MI"))
            vehicleDetailsBlock.setSnowbirdVehicle("No");

        //TODO PA NB - Obtained vehicles - Mid
    }

    public void navigateToVehicleDetailsPage(Map<String, String> data, String year, String make, String model) throws Throwable {
        String modelValue;
        if (data.get(model).contains(" ")) {
            modelValue = data.get(model).split(" ")[0];
        } else {
            modelValue = data.get(model);
        }
        pause(4000);
        clickElement(driver.findElement(By.xpath("//a[contains(text(),'" + data.get(year) + "') and contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'" + data.get(make).toLowerCase() + "') and contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'" + modelValue.toLowerCase() + "')]")));
        pause(1000);
    }

    public void verifyVehicleCharacteristicsBlock(DataTable table) {
        vehicleCharacteristicsBlock.verifyVehicleCharacteristicsBlock(table);
    }

    public void verifyVehicleSymbolsBlock(DataTable table) {
        symbolsBlock.verifySymbolsBlock(table);
    }

    public void verifyVehicleCharacteristicsBlockIsNotDisplayed() {
        Assert.assertTrue(driver.findElements(By.xpath("//div[text()='vehicle characteristics']")).size() < 1);
        reportScreenshot("VehicleCharacteristics" + System.currentTimeMillis(), "VehicleCharacteristics");
    }

}