package pages.blocks;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class VehiclesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public VehiclesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='vehicles']")
    WebElement vehiclesBlock;
    @FindBy(xpath = "//div[text()='select coverage']")
    WebElement selectCoveragesBlock;
    @FindBy(xpath = "//span[text()='Apply']")
    WebElement apply;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[2]")
    List<WebElement> compDeductible;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[2]")
    List<WebElement> otcDeductible;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[4]")
    List<WebElement> umpdDeductible;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[3]")
    List<WebElement> collDeductible;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[4]")
    List<WebElement> collOption;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[5]")
    List<WebElement> waiverOfCOLLDed;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[4]")
    List<WebElement> options;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[5]")
    List<WebElement> options2;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[last()]")
    List<WebElement> towingAndLabor;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[6]")
    List<WebElement> medicalPayment;

    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//td[4]")
    List<WebElement> floodDeductible;

    public void fillVehicleDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("vehicles");
        for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
            switch (data.get("State")) {
                case "AK":
                    vehicleDeductiblesAK(data, i);
                    break;
                case "AR":
                    vehicleDeductiblesAR(data, i);
                    break;
                case "OK":
                    vehicleDeductiblesOK(data, i);
                    break;
                case "CO":
                    vehicleDeductiblesCO(data, i);
                    break;
                case "IL":
                    vehicleDeductiblesIL(data, i);
                    break;
                case "NM":
                    vehicleDeductiblesNM(data, i);
                    break;
                case "OH":
                    vehicleDeductiblesOH(data, i);
                    break;
                case "MD":
                    vehicleDeductiblesMD(data, i);
                    break;
                case "TN":
                    vehicleDeductiblesTN(data, i);
                    break;
                case "KY":
                    vehicleDeductiblesKY(data, i);
                    break;
                case "AL":
                    vehicleDeductiblesAL(data, i);
                    break;
                case "DC":
                    vehicleDeductiblesDC(data, i);
                    break;
                case "TX":
                    vehicleDeductiblesTX(data, i);
                    break;
                case "SC":
                    vehicleDeductiblesSC(data, i);
                    break;
                case "LA":
                    vehicleDeductiblesLA(data, i);
                    break;
                case "UT":
                    vehicleDeductiblesUT(data, i);
                    break;
                case "CT":
                    vehicleDeductiblesCT(data, i);
                    break;
                case "AZ":
                    vehicleDeductiblesAZ(data, i);
                    break;
                case "IN":
                    vehicleDeductiblesIN(data, i);
                    break;
                case "KS":
                    vehicleDeductiblesKS(data, i);
                    break;
                case "NV":
                    vehicleDeductiblesNV(data, i);
                    break;
                case "PA":
                    vehicleDeductiblesPA(data, i);
                    break;
                case "WI":
                    vehicleDeductiblesWI(data, i);
                    break;
                case "MO":
                    vehicleDeductiblesMO(data, i);
                    break;
                case "MT":
                    vehicleDeductiblesMT(data, i);
                    break;
                case "ND":
                    vehicleDeductiblesND(data, i);
                    break;
                case "OR":
                    vehicleDeductiblesOR(data, i);
                    break;
                case "DE":
                    vehicleDeductiblesDE(data, i);
                    break;
                case "SD":
                    vehicleDeductiblesSD(data, i);
                    break;
                case "WV":
                    vehicleDeductiblesWV(data, i);
                    break;
                case "MN":
                    vehicleDeductiblesMN(data, i);
                    break;
                case "NH":
                    vehicleDeductiblesNH(data, i);
                    break;
                case "ME":
                    vehicleDeductiblesME(data, i);
                    break;
                case "VT":
                    vehicleDeductiblesVT(data, i);
                    break;
                case "NE":
                    vehicleDeductiblesNE(data, i);
                    break;
                case "IA":
                    vehicleDeductiblesIA(data, i);
                    break;
                case "ID":
                    vehicleDeductiblesID(data, i);
                    break;
                case "MS":
                    vehicleDeductiblesMS(data, i);
                    break;
                case "RI":
                    vehicleDeductiblesRI(data, i);
                    break;
                case "WA":
                    vehicleDeductiblesWA(data, i);
                    break;
                case "WY":
                    vehicleDeductiblesWY(data, i);
                    break;
                case "CA":
                    vehicleDeductiblesCA(data, i);
                    break;
                case "HI":
                    vehicleDeductiblesHI(data, i);
                    break;
                case "MA":
                    vehicleDeductiblesMA(data, i);
                    break;
                case "NC":
                    vehicleDeductiblesNC(data, i);
                    break;
                case "NJ":
                    vehicleDeductiblesNJ(data, i);
                    break;
                case "NY":
                    vehicleDeductiblesNY(data, i);
                    break;
                case "VA":
                    vehicleDeductiblesVA(data, i);
                    break;
                case "FL":
                    vehicleDeductiblesFL(data, i);
                    break;
                case "MI":
                    vehicleDeductiblesMI(data, i);
                    break;
                case "GA":
                    vehicleDeductiblesGA(data, i);
                    break;
            }
            if (!data.get("State").equalsIgnoreCase("NC")) {
                if (data.get("State").equalsIgnoreCase("HI") &&
                        (data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Golf Carts") ||
                                data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Motorcycles/Mopeds/Scooters"))) {
                    // Do Nothing
                } else {
                    setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_" + i), i);
                }
            }
        }
        saveChanges();
    }

    public void fillVehicleDetailsPA_END(Map<String, String> data) throws Throwable {
        String[] additionalVehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] additionalVehiclesEND = data.get("Additional_Vehicles_END").split(",");

        int totalCount = additionalVehiclesNB.length;

        //Added vehicles
        for (int i = 1; i <= additionalVehiclesEND.length; i++) {
            if (additionalVehiclesEND[i - 1].contains("_ADD")) {
                totalCount++;
                switch (data.get("State")) {
                    case "AK":
                        vehicleDeductiblesAK_END(data, i, totalCount);
                        break;
                    case "AR":
                        vehicleDeductiblesAR_END(data, i, totalCount);
                        break;
                    case "OK":
                        vehicleDeductiblesOK_END(data, i, totalCount);
                        break;
                    case "CO":
                        vehicleDeductiblesCO_END(data, i, totalCount);
                        break;
                    case "IL":
                        vehicleDeductiblesIL_END(data, i, totalCount);
                        break;
                    case "NM":
                        vehicleDeductiblesNM_END(data, i, totalCount);
                        break;
                    case "OH":
                        vehicleDeductiblesOH_END(data, i, totalCount);
                        break;
                    case "MD":
                        vehicleDeductiblesMD_END(data, i, totalCount);
                        break;
                    case "TN":
                        vehicleDeductiblesTN_END(data, i, totalCount);
                        break;
                    case "KY":
                        vehicleDeductiblesKY_END(data, i, totalCount);
                        break;
                    case "AL":
                        vehicleDeductiblesAL_END(data, i, totalCount);
                        break;
                    case "DC":
                        vehicleDeductiblesDC_END(data, i, totalCount);
                        break;
                    case "TX":
                        vehicleDeductiblesTX_END(data, i, totalCount);
                        break;
                    case "SC":
                        vehicleDeductiblesSC_END(data, i, totalCount);
                        break;
                    case "LA":
                        vehicleDeductiblesLA_END(data, i, totalCount);
                        break;
                    case "UT":
                        vehicleDeductiblesUT_END(data, i, totalCount);
                        break;
                    case "CT":
                        vehicleDeductiblesCT_END(data, i, totalCount);
                        break;
                    case "AZ":
                        vehicleDeductiblesAZ_END(data, i, totalCount);
                        break;
                    case "IN":
                        vehicleDeductiblesIN_END(data, i, totalCount);
                        break;
                    case "KS":
                        vehicleDeductiblesKS_END(data, i, totalCount);
                        break;
                    case "NV":
                        vehicleDeductiblesNV_END(data, i, totalCount);
                        break;
                    case "PA":
                        vehicleDeductiblesPA_END(data, i, totalCount);
                        break;
                    case "WI":
                        vehicleDeductiblesWI_END(data, i, totalCount);
                        break;
                    case "MO":
                        vehicleDeductiblesMO_END(data, i, totalCount);
                        break;
                    case "MT":
                        vehicleDeductiblesMT_END(data, i, totalCount);
                        break;
                    case "ND":
                        vehicleDeductiblesND_END(data, i, totalCount);
                        break;
                    case "OR":
                        vehicleDeductiblesOR_END(data, i, totalCount);
                        break;
                    case "DE":
                        vehicleDeductiblesDE_END(data, i, totalCount);
                        break;
                    case "SD":
                        vehicleDeductiblesSD_END(data, i, totalCount);
                        break;
                    case "WV":
                        vehicleDeductiblesWV_END(data, i, totalCount);
                        break;
                    case "MN":
                        vehicleDeductiblesMN_END(data, i, totalCount);
                        break;
                    case "NH":
                        vehicleDeductiblesNH_END(data, i, totalCount);
                        break;
                    case "ME":
                        vehicleDeductiblesME_END(data, i, totalCount);
                        break;
                    case "VT":
                        vehicleDeductiblesVT_END(data, i, totalCount);
                        break;
                    case "NE":
                        vehicleDeductiblesNE_END(data, i, totalCount);
                        break;
                    case "IA":
                        vehicleDeductiblesIA_END(data, i, totalCount);
                        break;
                    case "ID":
                        vehicleDeductiblesID_END(data, i, totalCount);
                        break;
                    case "MS":
                        vehicleDeductiblesMS_END(data, i, totalCount);
                        break;
                    case "RI":
                        vehicleDeductiblesRI_END(data, i, totalCount);
                        break;
                    case "WA":
                        vehicleDeductiblesWA_END(data, i, totalCount);
                        break;
                    case "WY":
                        vehicleDeductiblesWY_END(data, i, totalCount);
                        break;
                    case "CA":
                        vehicleDeductiblesCA_END(data, i, totalCount);
                        break;
                    case "HI":
                        vehicleDeductiblesHI_END(data, i, totalCount);
                        break;
                    case "MA":
                        vehicleDeductiblesMA_END(data, i, totalCount);
                        break;
                    case "NC":
                        vehicleDeductiblesNC_END(data, i, totalCount);
                        break;
                    case "NJ":
                        vehicleDeductiblesNJ_END(data, i, totalCount);
                        break;
                    case "NY":
                        vehicleDeductiblesNY_END(data, i, totalCount);
                        break;
                    case "VA":
                        vehicleDeductiblesVA_END(data, i, totalCount);
                        break;
                    case "FL":
                        vehicleDeductiblesFL_END(data, i, totalCount);
                        break;
                    case "MI":
                        vehicleDeductiblesMI_END(data, i, totalCount);
                        break;
                    case "GA":
                        vehicleDeductiblesGA_END(data, i, totalCount);
                        break;
                }
                if (!data.get("State").equalsIgnoreCase("NC")) {
                    if (data.get("State").equalsIgnoreCase("HI") &&
                            (data.get("Vehicle_Details_Vehicle_Type_END_" + i).equalsIgnoreCase("Golf Carts") ||
                                    data.get("Vehicle_Details_Vehicle_Type_END_" + i).equalsIgnoreCase("Motorcycles/Mopeds/Scooters"))) {
                        // Do Nothing
                    } else {
                        setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_END_" + i), totalCount);
                    }
                }
            }
        }

        //Modified vehicles
        for (int i = 1; i <= additionalVehiclesEND.length; i++) {
            if (additionalVehiclesEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < additionalVehiclesNB.length; j++) {
                    if (additionalVehiclesNB[j].equalsIgnoreCase(additionalVehiclesEND[i - 1].split("_MOD")[0])) {
                        switch (data.get("State")) {
                            case "AK":
                                vehicleDeductiblesAK_END(data, i, j);
                                break;
                            case "AR":
                                vehicleDeductiblesAR_END(data, i, j);
                                break;
                            case "OK":
                                vehicleDeductiblesOK_END(data, i, j);
                                break;
                            case "CO":
                                vehicleDeductiblesCO_END(data, i, j);
                                break;
                            case "IL":
                                vehicleDeductiblesIL_END(data, i, j);
                                break;
                            case "NM":
                                vehicleDeductiblesNM_END(data, i, j);
                                break;
                            case "OH":
                                vehicleDeductiblesOH_END(data, i, j);
                                break;
                            case "MD":
                                vehicleDeductiblesMD_END(data, i, j);
                                break;
                            case "TN":
                                vehicleDeductiblesTN_END(data, i, j);
                                break;
                            case "KY":
                                vehicleDeductiblesKY_END(data, i, j);
                                break;
                            case "AL":
                                vehicleDeductiblesAL_END(data, i, j);
                                break;
                            case "DC":
                                vehicleDeductiblesDC_END(data, i, j);
                                break;
                            case "TX":
                                vehicleDeductiblesTX_END(data, i, j);
                                break;
                            case "SC":
                                vehicleDeductiblesSC_END(data, i, j);
                                break;
                            case "LA":
                                vehicleDeductiblesLA_END(data, i, j);
                                break;
                            case "UT":
                                vehicleDeductiblesUT_END(data, i, j);
                                break;
                            case "CT":
                                vehicleDeductiblesCT_END(data, i, j);
                                break;
                            case "AZ":
                                vehicleDeductiblesAZ_END(data, i, j);
                                break;
                            case "IN":
                                vehicleDeductiblesIN_END(data, i, j);
                                break;
                            case "KS":
                                vehicleDeductiblesKS_END(data, i, j);
                                break;
                            case "NV":
                                vehicleDeductiblesNV_END(data, i, j);
                                break;
                            case "PA":
                                vehicleDeductiblesPA_END(data, i, j);
                                break;
                            case "WI":
                                vehicleDeductiblesWI_END(data, i, j);
                                break;
                            case "MO":
                                vehicleDeductiblesMO_END(data, i, j);
                                break;
                            case "MT":
                                vehicleDeductiblesMT_END(data, i, j);
                                break;
                            case "ND":
                                vehicleDeductiblesND_END(data, i, j);
                                break;
                            case "OR":
                                vehicleDeductiblesOR_END(data, i, j);
                                break;
                            case "DE":
                                vehicleDeductiblesDE_END(data, i, j);
                                break;
                            case "SD":
                                vehicleDeductiblesSD_END(data, i, j);
                                break;
                            case "WV":
                                vehicleDeductiblesWV_END(data, i, j);
                                break;
                            case "MN":
                                vehicleDeductiblesMN_END(data, i, j);
                                break;
                            case "NH":
                                vehicleDeductiblesNH_END(data, i, j);
                                break;
                            case "ME":
                                vehicleDeductiblesME_END(data, i, j);
                                break;
                            case "VT":
                                vehicleDeductiblesVT_END(data, i, j);
                                break;
                            case "NE":
                                vehicleDeductiblesNE_END(data, i, j);
                                break;
                            case "IA":
                                vehicleDeductiblesIA_END(data, i, j);
                                break;
                            case "ID":
                                vehicleDeductiblesID_END(data, i, j);
                                break;
                            case "MS":
                                vehicleDeductiblesMS_END(data, i, j);
                                break;
                            case "RI":
                                vehicleDeductiblesRI_END(data, i, j);
                                break;
                            case "WA":
                                vehicleDeductiblesWA_END(data, i, j);
                                break;
                            case "WY":
                                vehicleDeductiblesWY_END(data, i, j);
                                break;
                            case "CA":
                                vehicleDeductiblesCA_END(data, i, j);
                                break;
                            case "HI":
                                vehicleDeductiblesHI_END(data, i, j);
                                break;
                            case "MA":
                                vehicleDeductiblesMA_END(data, i, j);
                                break;
                            case "NC":
                                vehicleDeductiblesNC_END(data, i, j);
                                break;
                            case "NJ":
                                vehicleDeductiblesNJ_END(data, i, j);
                                break;
                            case "NY":
                                vehicleDeductiblesNY_END(data, i, j);
                                break;
                            case "VA":
                                vehicleDeductiblesVA_END(data, i, j);
                                break;
                            case "FL":
                                vehicleDeductiblesFL_END(data, i, j);
                                break;
                            case "MI":
                                vehicleDeductiblesMI_END(data, i, j);
                                break;
                            case "GA":
                                vehicleDeductiblesGA_END(data, i, j);
                                break;
                        }
                        if (!data.get("State").equalsIgnoreCase("NC")) {
                            if (data.get("State").equalsIgnoreCase("HI") &&
                                    (data.get("Vehicle_Details_Vehicle_Type_END_" + i).equalsIgnoreCase("Golf Carts") ||
                                            data.get("Vehicle_Details_Vehicle_Type_END_" + i).equalsIgnoreCase("Motorcycles/Mopeds/Scooters"))) {
                                // Do Nothing
                            } else {
                                setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_END_" + i), j);
                            }
                        }
                    }
                }
            }
        }
        saveChanges();
    }

    public void fillVehicleDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] additionalVehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] additionalVehiclesEND = data.get("Additional_Vehicles_END").split(",");
        String[] additionalVehiclesRNW = data.get("Additional_Vehicles_RNW").split(",");
        String[] additionalVehiclesOOSEND = data.get("Additional_Vehicles_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = additionalVehiclesNB.length;

        //If there was END transaction and it happened before OOS add END to the total count
        if (endPosition > -1 && endPosition < oosPosition) {
            for (String s : additionalVehiclesEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was RNW transaction and it happened before OOS add RNW to the total count
//        if (rnwPosition > -1 && rnwPosition < oosPosition) {
//            for (String s : additionalVehiclesRNW) {
//                if (s.contains("_ADD")) {
//                    totalCount++;
//                }
//            }
//        }

        for (int i = 1; i <= additionalVehiclesOOSEND.length; i++) {
            if (additionalVehiclesOOSEND[i - 1].contains("_ADD")) {
                totalCount++;
                switch (data.get("State")) {
                    case "AK":
                        vehicleDeductiblesAK_OOS_END(data, i, totalCount);
                        break;
                    case "AR":
                        vehicleDeductiblesAR_OOS_END(data, i, totalCount);
                        break;
                    case "OK":
                        vehicleDeductiblesOK_OOS_END(data, i, totalCount);
                        break;
                    case "CO":
                        vehicleDeductiblesCO_OOS_END(data, i, totalCount);
                        break;
                    case "IL":
                        vehicleDeductiblesIL_OOS_END(data, i, totalCount);
                        break;
                    case "NM":
                        vehicleDeductiblesNM_OOS_END(data, i, totalCount);
                        break;
                    case "OH":
                        vehicleDeductiblesOH_OOS_END(data, i, totalCount);
                        break;
                    case "MD":
                        vehicleDeductiblesMD_OOS_END(data, i, totalCount);
                        break;
                    case "TN":
                        vehicleDeductiblesTN_OOS_END(data, i, totalCount);
                        break;
                    case "KY":
                        vehicleDeductiblesKY_OOS_END(data, i, totalCount);
                        break;
                    case "AL":
                        vehicleDeductiblesAL_OOS_END(data, i, totalCount);
                        break;
                    case "DC":
                        vehicleDeductiblesDC_OOS_END(data, i, totalCount);
                        break;
                    case "TX":
                        vehicleDeductiblesTX_OOS_END(data, i, totalCount);
                        break;
                    case "SC":
                        vehicleDeductiblesSC_OOS_END(data, i, totalCount);
                        break;
                    case "LA":
                        vehicleDeductiblesLA_OOS_END(data, i, totalCount);
                        break;
                    case "UT":
                        vehicleDeductiblesUT_OOS_END(data, i, totalCount);
                        break;
                    case "CT":
                        vehicleDeductiblesCT_OOS_END(data, i, totalCount);
                        break;
                    case "AZ":
                        vehicleDeductiblesAZ_OOS_END(data, i, totalCount);
                        break;
                    case "IN":
                        vehicleDeductiblesIN_OOS_END(data, i, totalCount);
                        break;
                    case "KS":
                        vehicleDeductiblesKS_OOS_END(data, i, totalCount);
                        break;
                    case "NV":
                        vehicleDeductiblesNV_OOS_END(data, i, totalCount);
                        break;
                    case "PA":
                        vehicleDeductiblesPA_OOS_END(data, i, totalCount);
                        break;
                    case "WI":
                        vehicleDeductiblesWI_OOS_END(data, i, totalCount);
                        break;
                    case "MO":
                        vehicleDeductiblesMO_OOS_END(data, i, totalCount);
                        break;
                    case "MT":
                        vehicleDeductiblesMT_OOS_END(data, i, totalCount);
                        break;
                    case "ND":
                        vehicleDeductiblesND_OOS_END(data, i, totalCount);
                        break;
                    case "OR":
                        vehicleDeductiblesOR_OOS_END(data, i, totalCount);
                        break;
                    case "DE":
                        vehicleDeductiblesDE_OOS_END(data, i, totalCount);
                        break;
                    case "SD":
                        vehicleDeductiblesSD_OOS_END(data, i, totalCount);
                        break;
                    case "WV":
                        vehicleDeductiblesWV_OOS_END(data, i, totalCount);
                        break;
                    case "MN":
                        vehicleDeductiblesMN_OOS_END(data, i, totalCount);
                        break;
                    case "NH":
                        vehicleDeductiblesNH_OOS_END(data, i, totalCount);
                        break;
                    case "ME":
                        vehicleDeductiblesME_OOS_END(data, i, totalCount);
                        break;
                    case "VT":
                        vehicleDeductiblesVT_OOS_END(data, i, totalCount);
                        break;
                    case "NE":
                        vehicleDeductiblesNE_OOS_END(data, i, totalCount);
                        break;
                    case "IA":
                        vehicleDeductiblesIA_OOS_END(data, i, totalCount);
                        break;
                    case "ID":
                        vehicleDeductiblesID_OOS_END(data, i, totalCount);
                        break;
                    case "MS":
                        vehicleDeductiblesMS_OOS_END(data, i, totalCount);
                        break;
                    case "RI":
                        vehicleDeductiblesRI_OOS_END(data, i, totalCount);
                        break;
                    case "WA":
                        vehicleDeductiblesWA_OOS_END(data, i, totalCount);
                        break;
                    case "WY":
                        vehicleDeductiblesWY_OOS_END(data, i, totalCount);
                        break;
                    case "CA":
                        vehicleDeductiblesCA_OOS_END(data, i, totalCount);
                        break;
                    case "HI":
                        vehicleDeductiblesHI_OOS_END(data, i, totalCount);
                        break;
                    case "MA":
                        vehicleDeductiblesMA_OOS_END(data, i, totalCount);
                        break;
                    case "NC":
                        vehicleDeductiblesNC_OOS_END(data, i, totalCount);
                        break;
                    case "NJ":
                        vehicleDeductiblesNJ_OOS_END(data, i, totalCount);
                        break;
                    case "NY":
                        vehicleDeductiblesNY_OOS_END(data, i, totalCount);
                        break;
                    case "VA":
                        vehicleDeductiblesVA_OOS_END(data, i, totalCount);
                        break;
                    case "FL":
                        vehicleDeductiblesFL_OOS_END(data, i, totalCount);
                        break;
                    case "MI":
                        vehicleDeductiblesMI_OOS_END(data, i, totalCount);
                        break;
                    case "GA":
                        vehicleDeductiblesGA_OOS_END(data, i, totalCount);
                        break;
                }
                if (!data.get("State").equalsIgnoreCase("NC")) {
                    if (data.get("State").equalsIgnoreCase("HI") &&
                            (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i).equalsIgnoreCase("Golf Carts") ||
                                    data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i).equalsIgnoreCase("Motorcycles/Mopeds/Scooters"))) {
                        // Do Nothing
                    } else {
                        setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_OOS_END_" + i), totalCount);
                    }
                }
            }
        }
        saveChanges();

        //TODO PA OOS - Vehicle details - Modification and Deletion - Mid
    }

    public void fillVehicleDetailsPA_RNW(Map<String, String> data) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] additionalVehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] additionalVehiclesEND = data.get("Additional_Vehicles_END").split(",");
        String[] additionalVehiclesRNW = data.get("Additional_Vehicles_RNW").split(",");
        String[] additionalVehiclesOOSEND = data.get("Additional_Vehicles_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = additionalVehiclesNB.length;

        //If there was END transaction and it happened before RNW add END to the total count
        if (endPosition > -1 && endPosition < rnwPosition) {
            for (String s : additionalVehiclesEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was OOS transaction and it happened before RNW add OOS to the total count
        if (oosPosition > -1 && oosPosition < rnwPosition) {
            for (String s : additionalVehiclesOOSEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        for (int i = 1; i <= additionalVehiclesRNW.length; i++) {
            if (additionalVehiclesRNW[i - 1].contains("_ADD")) {
                totalCount++;
                switch (data.get("State")) {
                    case "AK":
                        vehicleDeductiblesAK_RNW(data, i, totalCount);
                        break;
                    case "AR":
                        vehicleDeductiblesAR_RNW(data, i, totalCount);
                        break;
                    case "OK":
                        vehicleDeductiblesOK_RNW(data, i, totalCount);
                        break;
                    case "CO":
                        vehicleDeductiblesCO_RNW(data, i, totalCount);
                        break;
                    case "IL":
                        vehicleDeductiblesIL_RNW(data, i, totalCount);
                        break;
                    case "NM":
                        vehicleDeductiblesNM_RNW(data, i, totalCount);
                        break;
                    case "OH":
                        vehicleDeductiblesOH_RNW(data, i, totalCount);
                        break;
                    case "MD":
                        vehicleDeductiblesMD_RNW(data, i, totalCount);
                        break;
                    case "TN":
                        vehicleDeductiblesTN_RNW(data, i, totalCount);
                        break;
                    case "KY":
                        vehicleDeductiblesKY_RNW(data, i, totalCount);
                        break;
                    case "AL":
                        vehicleDeductiblesAL_RNW(data, i, totalCount);
                        break;
                    case "DC":
                        vehicleDeductiblesDC_RNW(data, i, totalCount);
                        break;
                    case "TX":
                        vehicleDeductiblesTX_RNW(data, i, totalCount);
                        break;
                    case "SC":
                        vehicleDeductiblesSC_RNW(data, i, totalCount);
                        break;
                    case "LA":
                        vehicleDeductiblesLA_RNW(data, i, totalCount);
                        break;
                    case "UT":
                        vehicleDeductiblesUT_RNW(data, i, totalCount);
                        break;
                    case "CT":
                        vehicleDeductiblesCT_RNW(data, i, totalCount);
                        break;
                    case "AZ":
                        vehicleDeductiblesAZ_RNW(data, i, totalCount);
                        break;
                    case "IN":
                        vehicleDeductiblesIN_RNW(data, i, totalCount);
                        break;
                    case "KS":
                        vehicleDeductiblesKS_RNW(data, i, totalCount);
                        break;
                    case "NV":
                        vehicleDeductiblesNV_RNW(data, i, totalCount);
                        break;
                    case "PA":
                        vehicleDeductiblesPA_RNW(data, i, totalCount);
                        break;
                    case "WI":
                        vehicleDeductiblesWI_RNW(data, i, totalCount);
                        break;
                    case "MO":
                        vehicleDeductiblesMO_RNW(data, i, totalCount);
                        break;
                    case "MT":
                        vehicleDeductiblesMT_RNW(data, i, totalCount);
                        break;
                    case "ND":
                        vehicleDeductiblesND_RNW(data, i, totalCount);
                        break;
                    case "OR":
                        vehicleDeductiblesOR_RNW(data, i, totalCount);
                        break;
                    case "DE":
                        vehicleDeductiblesDE_RNW(data, i, totalCount);
                        break;
                    case "SD":
                        vehicleDeductiblesSD_RNW(data, i, totalCount);
                        break;
                    case "WV":
                        vehicleDeductiblesWV_RNW(data, i, totalCount);
                        break;
                    case "MN":
                        vehicleDeductiblesMN_RNW(data, i, totalCount);
                        break;
                    case "NH":
                        vehicleDeductiblesNH_RNW(data, i, totalCount);
                        break;
                    case "ME":
                        vehicleDeductiblesME_RNW(data, i, totalCount);
                        break;
                    case "VT":
                        vehicleDeductiblesVT_RNW(data, i, totalCount);
                        break;
                    case "NE":
                        vehicleDeductiblesNE_RNW(data, i, totalCount);
                        break;
                    case "IA":
                        vehicleDeductiblesIA_RNW(data, i, totalCount);
                        break;
                    case "ID":
                        vehicleDeductiblesID_RNW(data, i, totalCount);
                        break;
                    case "MS":
                        vehicleDeductiblesMS_RNW(data, i, totalCount);
                        break;
                    case "RI":
                        vehicleDeductiblesRI_RNW(data, i, totalCount);
                        break;
                    case "WA":
                        vehicleDeductiblesWA_RNW(data, i, totalCount);
                        break;
                    case "WY":
                        vehicleDeductiblesWY_RNW(data, i, totalCount);
                        break;
                    case "CA":
                        vehicleDeductiblesCA_RNW(data, i, totalCount);
                        break;
                    case "HI":
                        vehicleDeductiblesHI_RNW(data, i, totalCount);
                        break;
                    case "MA":
                        vehicleDeductiblesMA_RNW(data, i, totalCount);
                        break;
                    case "NC":
                        vehicleDeductiblesNC_RNW(data, i, totalCount);
                        break;
                    case "NJ":
                        vehicleDeductiblesNJ_RNW(data, i, totalCount);
                        break;
                    case "NY":
                        vehicleDeductiblesNY_RNW(data, i, totalCount);
                        break;
                    case "VA":
                        vehicleDeductiblesVA_RNW(data, i, totalCount);
                        break;
                    case "FL":
                        vehicleDeductiblesFL_RNW(data, i, totalCount);
                        break;
                    case "MI":
                        vehicleDeductiblesMI_RNW(data, i, totalCount);
                        break;
                    case "GA":
                        vehicleDeductiblesGA_RNW(data, i, totalCount);
                        break;
                }
                if (!data.get("State").equalsIgnoreCase("NC")) {
                    if (data.get("State").equalsIgnoreCase("HI") &&
                            (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i).equalsIgnoreCase("Golf Carts") ||
                                    data.get("Vehicle_Details_Vehicle_Type_RNW_" + i).equalsIgnoreCase("Motorcycles/Mopeds/Scooters"))) {
                        // Do Nothing
                    } else {
                        setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_RNW_" + i), totalCount);
                    }
                }
            }
        }
        saveChanges();
        //TODO PA RNW - Vehicle details - Modification and Deletion - Mid
    }

    public void vehicleDeductiblesAK(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesAR(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesOK(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesCO(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible2(data.get("Vehicles_COLL_Deductible_" + i), i);
        pause(3000);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesIL(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesNM(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesOH(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesMD(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesTN(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesKY(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesAL(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesDC(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesTX(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible2(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesSC(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesLA(Map<String, String> data, int i) throws Throwable {
        setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setUMPDDeductible(data.get("Vehicles_UMPD_Deductible_" + i), i);
        setOptions2(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesUT(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesCT(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesAZ(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesIN(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesKS(Map<String, String> data, int i) throws Throwable {
        setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_" + i), i);
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);


    }

    public void vehicleDeductiblesNV(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesPA(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesWI(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesMO(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesMT(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesND(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesOR(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setUMPDDeductible(data.get("Vehicles_UMPD_Deductible_" + i), i);
        setOptions2(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesDE(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesSD(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesWV(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesMN(Map<String, String> data, int i) throws Throwable {
        setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_" + i), i);
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesNH(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesME(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesVT(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible2(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
        setUMPDDeductible(data.get("Vehicles_UMPD_Deductible_" + i), i);
        setOptions2(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesNE(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible2(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
        setOptions2(data.get("Vehicles_Options_" + i), i);
        setUMPDDeductible(data.get("Vehicles_UMPD_Deductible_" + i), i);

    }

    public void vehicleDeductiblesIA(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesID(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesMS(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesRI(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible2(data.get("Vehicles_OTC_Deductible_" + i), i);
        setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setUMPDDeductible(data.get("Vehicles_UMPD_Deductible_" + i), i);
        setOptions2(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesWA(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible2(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesWY(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesCA(Map<String, String> data, int i) throws Throwable {
        setTowingAndLabor(data.get("Vehicles_Towing_Labor_Limit_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setUMPDDeductible(data.get("Vehicles_UMPD_Deductible_" + i), i);
        setOptions2(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesHI(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        if (data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Golf Carts") ||
                data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Motorcycles/Mopeds/Scooters")) {
            setMedicalPayment(data.get("Vehicles_Medical_Payment_" + i), i);
        }
    }

    public void vehicleDeductiblesMA(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setCOLLOption(data.get("Vehicles_COLL_Option_" + i), i);
        setWaiverOfCOLLDed(data.get("Vehicles_Waiver_Of_COLL_Ded_" + i), i);
    }

    public void vehicleDeductiblesNC(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesNJ(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesNY(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setOptions(data.get("Vehicles_Options_" + i), i);
    }

    public void vehicleDeductiblesVA(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesFL(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setFloodDeductible(data.get("Vehicles_Flood_Deductible_" + i), i);
    }

    public void vehicleDeductiblesMI(Map<String, String> data, int i) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
        setCOLLOption(data.get("Vehicles_COLL_Option_" + i), i);
    }

    public void vehicleDeductiblesGA(Map<String, String> data, int i) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_" + i), i);
    }

    public void vehicleDeductiblesAK_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesAR_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesOK_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesCO_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesIL_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNM_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesOH_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMD_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesTN_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesKY_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesAL_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesDC_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesTX_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesSC_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesLA_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesUT_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesCT_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesAZ_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
        setOptions(data.get("Vehicles_Options_END_" + i), elIndex);
    }

    public void vehicleDeductiblesIN_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesKS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
        setOptions(data.get("Vehicles_Options_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNV_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesPA_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesWI_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMO_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMT_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesND_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesOR_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
        setUMPDDeductible(data.get("Vehicles_UMPD_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesDE_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesSD_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesWV_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMN_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNH_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesME_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesVT_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNE_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesIA_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesID_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesRI_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesWA_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesWY_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesCA_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesHI_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
        if (data.get("Vehicle_Details_Vehicle_Type_END_" + i).equalsIgnoreCase("Golf Carts") ||
                data.get("Vehicle_Details_Vehicle_Type_END_" + i).equalsIgnoreCase("Motorcycles/Mopeds/Scooters")) {
            setMedicalPayment(data.get("Vehicles_Medical_Payment_END_" + i), elIndex);
        }
    }

    public void vehicleDeductiblesMA_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
        setCOLLOption(data.get("Vehicles_COLL_Option_END_" + i), elIndex);
        setWaiverOfCOLLDed(data.get("Vehicles_Waiver_Of_COLL_Ded_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNC_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNJ_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNY_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
        setOptions(data.get("Vehicles_Options_END_" + i), elIndex);
    }

    public void vehicleDeductiblesVA_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesFL_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMI_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
        setCOLLOption(data.get("Vehicles_COLL_Option_END_" + i), elIndex);
    }

    public void vehicleDeductiblesGA_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_END_" + i), elIndex);
    }

    public void vehicleDeductiblesAK_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesAR_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesOK_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesCO_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesIL_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNM_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesOH_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMD_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesTN_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesKY_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesAL_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesDC_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesTX_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesSC_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesLA_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesUT_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesCT_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesAZ_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
        setOptions(data.get("Vehicles_Options_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesIN_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesKS_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNV_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesPA_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesWI_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMO_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMT_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesND_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesOR_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
        setUMPDDeductible(data.get("Vehicles_UMPD_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesDE_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesSD_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesWV_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMN_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNH_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesME_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesVT_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNE_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesIA_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesID_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMS_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesRI_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesWA_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesWY_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesCA_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesHI_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
        if (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i).equalsIgnoreCase("Golf Carts") ||
                data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i).equalsIgnoreCase("Motorcycles/Mopeds/Scooters")) {
            setMedicalPayment(data.get("Vehicles_Medical_Payment_OOS_END_" + i), elIndex);
        }
    }

    public void vehicleDeductiblesMA_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
        setCOLLOption(data.get("Vehicles_COLL_Option_OOS_END_" + i), elIndex);
        setWaiverOfCOLLDed(data.get("Vehicles_Waiver_Of_COLL_Ded_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNC_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNJ_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesNY_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
        setOptions(data.get("Vehicles_Options_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesVA_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesFL_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesMI_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
        setCOLLOption(data.get("Vehicles_COLL_Option_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesGA_OOS_END(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_OOS_END_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_OOS_END_" + i), elIndex);
    }

    public void vehicleDeductiblesAK_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesAR_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesOK_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesCO_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesIL_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesNM_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesOH_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesMD_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesTN_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesKY_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesAL_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesDC_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesTX_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesSC_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesLA_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesUT_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), i);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), i);
    }

    public void vehicleDeductiblesCT_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesAZ_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
        setOptions(data.get("Vehicles_Options_RNW_" + i), i);
    }

    public void vehicleDeductiblesIN_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesKS_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesNV_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesPA_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesWI_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesMO_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesMT_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesND_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesOR_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
        setUMPDDeductible(data.get("Vehicles_UMPD_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesDE_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesSD_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesWV_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesMN_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesNH_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesME_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesVT_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesNE_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesIA_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesID_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesMS_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesRI_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesWA_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesWY_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesCA_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesHI_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
        if (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i).equalsIgnoreCase("Golf Carts") ||
                data.get("Vehicle_Details_Vehicle_Type_RNW_" + i).equalsIgnoreCase("Motorcycles/Mopeds/Scooters")) {
            setMedicalPayment(data.get("Vehicles_Medical_Payment_RNW_" + i), elIndex);
        }
    }

    public void vehicleDeductiblesMA_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
        setCOLLOption(data.get("Vehicles_COLL_Option_RNW_" + i), elIndex);
        setWaiverOfCOLLDed(data.get("Vehicles_Waiver_Of_COLL_Ded_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesNC_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesNJ_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesNY_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
        setOptions(data.get("Vehicles_Options_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesVA_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesFL_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesMI_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setCOMPDeductible(data.get("Vehicles_COMP_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
        setCOLLOption(data.get("Vehicles_COLL_Option_RNW_" + i), elIndex);
    }

    public void vehicleDeductiblesGA_RNW(Map<String, String> data, int i, int elIndex) throws Throwable {
        setOTCDeductible(data.get("Vehicles_OTC_Deductible_RNW_" + i), elIndex);
        setCOLLDeductible(data.get("Vehicles_COLL_Deductible_RNW_" + i), elIndex);
    }

    public void setCOLLDeductible(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(collDeductible.get(i - 1), "Coll Deductible");
        driver.switchTo().activeElement().sendKeys(value);
        saveChanges();
    }

    public void setCOLLDeductible2(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(collDeductible.get(i - 1), "Coll Deductible");
        driver.switchTo().activeElement().sendKeys(value);
        clickFooter();
    }

    public void setOptions(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(options.get(i - 1), "Options");
        driver.switchTo().activeElement().sendKeys(value);
        clickFooter();
    }

    public void setOptions2(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(options2.get(i - 1), "Options");
        driver.switchTo().activeElement().sendKeys(value);
        clickFooter();
    }

    public void setCOMPDeductible(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(compDeductible.get(i - 1), "Comp Deductible");
        driver.switchTo().activeElement().sendKeys(value);
        clickFooter();
    }

    public void setMedicalPayment(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(medicalPayment.get(i - 1), "Medical Payment");
        driver.switchTo().activeElement().sendKeys(value);
        clickFooter();
    }

    public void setCOLLOption(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(collOption.get(i - 1), "Coll Option");
        driver.switchTo().activeElement().sendKeys(value);
        clickFooter();
    }

    public void setWaiverOfCOLLDed(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(waiverOfCOLLDed.get(i - 1), "Waiver Of COLL Ded");
        driver.switchTo().activeElement().sendKeys(value);
        clickFooter();
    }

    public void setOTCDeductible(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(otcDeductible.get(i - 1), "OTC Deductible");
        driver.switchTo().activeElement().sendKeys(value);
        saveChanges();
    }

    public void setOTCDeductible2(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(otcDeductible.get(i - 1), "OTC Deductible");
        driver.switchTo().activeElement().sendKeys(value);
    }

    public void setFloodDeductible(String value, int i) throws Throwable {
        if (hasValue(value)) {
            if (!floodDeductible.isEmpty()) {
                clickElement(selectCoveragesBlock);
                pause(2000);
                clickElement(floodDeductible.get(i - 1), "Flood Deductible");
                driver.switchTo().activeElement().sendKeys(value);
            }
        }
    }

    public void setUMPDDeductible(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(selectCoveragesBlock);
            pause(2000);
            if (isElementDisplayed(umpdDeductible.get(i - 1))) {
                clickElement(umpdDeductible.get(i - 1), "UMPD Deductible");
                driver.switchTo().activeElement().sendKeys(value);
            }
            clickFooter();
        }
    }

    public void setTowingAndLabor(String value, int i) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        clickElement(towingAndLabor.get(i - 1), "Towing And Labor");
        driver.switchTo().activeElement().sendKeys(value);
        clickFooter();
    }

    public void fillObtainedVehiclesDetailsPA(String state) throws Throwable {
        int obtainedVehNum = Integer.parseInt(DataManager.getInstance().getKey("Obtained_Vehicle_Num"));
        if (obtainedVehNum != 0) {
            List<WebElement> totalVehicleRows = driver.findElements(By.xpath("//div[text()='vehicles']/../../../../../..//tr"));

            switch (state) {
                case "MI": {
                    for (int i = totalVehicleRows.size(); i > totalVehicleRows.size() - obtainedVehNum; i--) {
                        setOTCDeductible("1,000", i);
                        setCOLLDeductible("1,000", i);
                        setCOLLOption("Standard", i);
                    }
                }
                break;
                default: {
                    for (int i = 0; i < driver.findElements(By.xpath("//div[text()='vehicles']/../../../../../..//*[contains(@class,'yellowMandatory')]/div")).size(); i++) {
                        clickElement(selectCoveragesBlock);
                        pause(2000);
                        clickElement(selectCoveragesBlock);
                        clickElement(driver.findElements(By.xpath("//div[text()='vehicles']/../../../../../..//*[contains(@class,'yellowMandatory')]/div")).get(0), "Mandatory cell");
                        typeTextEnter(driver.switchTo().activeElement(), "1,000", "Deductibles");
                        pause(2000);
                        clickElement(selectCoveragesBlock);
                        saveChanges();
                    }
                    try {
                        clickElement(selectCoveragesBlock);
                        clickElement(driver.findElements(By.xpath("//div[text()='vehicles']/../../../../../..//*[contains(@class,'yellowMandatory')]/div")).get(0), "Mandatory cell");
                        typeTextEnter(driver.switchTo().activeElement(), "1,000", "Deductibles");
                        saveChanges();
                    } catch (Exception e) {
                    }
                }
            }

        }
    }
}