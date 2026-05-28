package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class UsageBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public UsageBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Primary Residence')]/../../../../div//label[text()='No']/..//input")
    WebElement isPrimaryResidenceNo;
    @FindBy(xpath = "//div[contains(text(),'Primary Residence')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isPrimaryResidenceYes;
    @FindBy(xpath = "//div[contains(text(),'secondary home')]/../../../../div//label[text()='No']/..//input")
    WebElement isThisASeasonalOrSecondaryHomeNo;
    @FindBy(xpath = "//div[contains(text(),'secondary home')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isThisASeasonalOrSecondaryHomeYes;
    @FindBy(xpath = "//div[contains(text(),'PURE insure')]/../../../../div//label[text()='No']/..//input")
    WebElement doesPureInsureThePrimaryHomeNo;
    @FindBy(xpath = "//div[contains(text(),'PURE insure')]/../../../../div//label[text()='Yes']/..//input")
    WebElement doesPureInsureThePrimaryHomeYes;
    @FindBy(xpath = "//div[contains(text(),'home unoccupied')]/../../../../div//label[text()='No']/..//input")
    WebElement isTheHomeUnoccupiedMoreThanTwoMonthsNo;
    @FindBy(xpath = "//div[contains(text(),'home unoccupied')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheHomeUnoccupiedMoreThanTwoMonthsYes;
    @FindBy(xpath = "//div[contains(text(),'part of the residence') or contains(text(),'residence rented')]/../../../../div//label[text()='No']/..//input")
    WebElement isTheResidenceOrPartRentedNo;
    @FindBy(xpath = "//div[contains(text(),'part of the residence') or contains(text(),'residence rented')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheResidenceOrPartRentedYes;
    @FindBy(xpath = "//div[contains(text(),'short-term rental')]/../../../../div//label[text()='No']/..//input")
    WebElement isTheResidenceShortTermRentalNo;
    @FindBy(xpath = "//div[contains(text(),'short-term rental')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheResidenceShortTermRentalYes;
    @FindBy(xpath = "//div[contains(text(),'residence vacant')]/../../../../div//label[text()='No']/..//input")
    WebElement isResidenceVacantNo;
    @FindBy(xpath = "//div[contains(text(),'residence vacant')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isResidenceVacantYes;
    @FindBy(xpath = "//div[contains(text(),'residence under construction')]/../../../../div//label[text()='No']/..//input")
    WebElement isResidenceUnderConstructionOrMajorRenovationNo;
    @FindBy(xpath = "//div[contains(text(),'residence under construction')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isResidenceUnderConstructionOrMajorRenovationYes;
    @FindBy(xpath = "//div[contains(text(),'construction or renovation')]/../../../../div//label[text()='No']/..//input")
    WebElement isResidenceUnderConstructionRenovationNo;
    @FindBy(xpath = "//div[contains(text(),'construction or renovation')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isResidenceUnderConstructionRenovationYes;
    @FindBy(xpath = "//div[contains(text(),'How long will the member be out')]/../../../../div//input")
    WebElement howLongMemberWillBeOutFromResidence;
    @FindBy(xpath = "//div[contains(text(),'cost of the planned work')]/../../../../div//input")
    WebElement whatIsTheCostOfPlannedWork;
    @FindBy(xpath = "//div[contains(text(),'currently for sale')]/../../../../div//label[text()='No']/..//input")
    WebElement isTheResidenceCurrentlyForSaleNo;
    @FindBy(xpath = "//div[contains(text(),'currently for sale')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheResidenceCurrentlyForSaleYes;
    @FindBy(xpath = "//div[contains(text(),'location listed on national')]/../../../../div//label[text()='No']/..//input")
    WebElement locationListedOnNationalNo;
    @FindBy(xpath = "//div[contains(text(),'location listed on national')]/../../../../div//label[text()='Yes']/..//input")
    WebElement locationListedOnNationalYes;
    @FindBy(xpath = "//div[contains(text(),'seasonal home')]/../../../../div//label[text()='No']/..//input")
    WebElement isThisASeasonalHomeNo;
    @FindBy(xpath = "//div[contains(text(),'seasonal home')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isThisASeasonalHomeYes;
    @FindBy(xpath = "//div[contains(text(),'residence rented')]/../../../../div//label[text()='No']/..//input")
    WebElement isTheResidenceRentedNo;
    @FindBy(xpath = "//div[contains(text(),'residence rented')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheResidenceRentedYes;
    @FindBy(xpath = "//div[contains(text(),'Is a Management Company used to administer rentals?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isManagementCompanyUsedToAdministerRentalsYes;
    @FindBy(xpath = "//div[contains(text(),'Is a Management Company used to administer rentals?')]/../../../../div//label[text()='No']/..//input")
    WebElement isManagementCompanyUsedToAdministerRentalsNo;
    @FindBy(xpath = "//div[contains(text(),'How many weeks per year is the residence rented?')]/../../../../div//input")
    WebElement weeksPerYearRented;
    @FindBy(xpath = "//div[contains(text(),'What is the minimum night stay?')]/../../../../div//input")
    WebElement whatIsTheMinimumNightStay;
    @FindBy(xpath = "//div[text()='What is the intended occupancy of the home?']/../../../..//input")
    WebElement whatIsIntendedOccupancyOfTheHome;
    @FindBy(xpath = "//div[text()='Other Occupancy']/../../../..//input")
    WebElement otherOccupancy;

    public void fillUsageDetails(Map<String, String> data) throws Throwable {
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        setLocationListedOnNational(data.get("Location_Listed_On_National"));
                        switch (data.get("State")) {
                            case "AK":
                            case "MD":
                            case "MS":
                            case "RI":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "ID":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "ME":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "TN":
                            case "WA":
                            case "CA": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence"));
                                setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home"));
                                if (data.get("Is_This_A_Seasonal_Or_Secondary_Home").equalsIgnoreCase("Yes")) {
                                    setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home"));
                                }
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented"));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation"));
                                if (data.get("Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work"));
                                }
                                setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale"));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence"));
                                setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home"));
                                if (data.get("Is_This_A_Seasonal_Or_Secondary_Home").equalsIgnoreCase("Yes")) {
                                    setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home"));
                                }
                                setIsTheResidenceRented(data.get("Part_Of_The_Residence_Rented"));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation"));
                                if (data.get("Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work"));
                                }
                            }
                            break;
                            case "FL": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied"));
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented"));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation"));
                                if (data.get("Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work"));
                                }
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AR":
                            case "KS":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "IA":
                            case "KY":
                            case "AK":
                            case "IN":
                            case "CO":
                            case "NV":
                            case "MN":
                            case "OH":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "MO":
                            case "MT":
                            case "OK":
                            case "OR":
                            case "WA":
                            case "SD":
                            case "WI":
                            case "RI":
                            case "UT":
                            case "WV":
                            case "TN":
                            case "PA":
                            case "VT":
                            case "MD":
                            case "HI":
                            case "MA":
                            case "ME":
                            case "CT":
                            case "AL":
                            case "WY":
                            case "LA":
                            case "CA":
                            case "DE":
                            case "GA":
                            case "NJ":
                            case "TX":
                            case "MI":
                            case "MS":
                            case "VA":
                            case "NC":
                            case "NY":
                            case "ND":
                            case "ID": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence"));
                                setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home"));
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented"));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation"));
                                if (data.get("Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work"));
                                }
                                setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale"));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence"));
                                setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home"));
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented"));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation"));
                                if (data.get("Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work"));
                                }
                            }
                            break;
                            case "FL": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied"));
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented"));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation"));
                                if (data.get("Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work"));
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;

            case "Home Surplus Lines": {
                switch (data.get("Risk_Addresses_Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK":
                            case "MD":
                            case "RI":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "ID":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "ME":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "SC":
                            case "FL":
                            case "MS": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied"));
                                setIsTheResidenceRented(data.get("Part_Of_The_Residence_Rented"));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation"));
                                if (data.get("Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work"));
                                }
                                setLocationListedOnNational(data.get("Location_Listed_On_National"));
                            }
                            break;
                        }
                    }
                    break;

                    //TODO Usage for CONDO and TENANTS HS
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "FL":
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied"));
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented"));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation"));
                                if (data.get("Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work"));
                                }
                            }
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "FL":
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ": {

                            }
                        }
                    }
                    break;
                }
            }
            break;
        }
        clickElement(footer, "footer");
        verifyBlockExists("usage");
    }

    public void fillUsageDetails_END(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type_END")) {
                case "Homeowner": {
                    setLocationListedOnNational(data.get("Location_Listed_On_National_END"));
                    switch (data.get("State_END")) {
                        case "AK":
                        case "MD":
                        case "MS":
                        case "RI":
                        case "AL":
                        case "LA":
                        case "MA":
                        case "DE":
                        case "HI":
                        case "VA":
                        case "NC":
                        case "CT":
                        case "NY":
                        case "NJ":
                        case "AR":
                        case "IA":
                        case "IN":
                        case "ID":
                        case "KS":
                        case "KY":
                        case "MN":
                        case "MO":
                        case "MT":
                        case "ND":
                        case "NE":
                        case "NH":
                        case "OH":
                        case "OK":
                        case "SD":
                        case "WI":
                        case "WY":
                        case "ME":
                        case "TX":
                        case "GA":
                        case "AZ":
                        case "DC":
                        case "IL":
                        case "NM":
                        case "NV":
                        case "OR":
                        case "PA":
                        case "UT":
                        case "VT":
                        case "WV":
                        case "MI":
                        case "CO":
                        case "TN":
                        case "WA":
                        case "CA": {
                            setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_END"));
                            setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_END"));
                            if (data.get("Is_This_A_Seasonal_Or_Secondary_Home_END").equalsIgnoreCase("Yes")) {
                                setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home_END"));
                            }
                            setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_END"));
                            setIsResidenceVacant(data.get("Is_The_Residence_Vacant_END"));
                            setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_END"));
                            if (data.get("Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_END"));
                                setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_END"));
                            }
                            setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale_END"));
                        }
                        break;
                        case "SC": {
                            setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_END"));
                            setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_END"));
                            if (data.get("Is_This_A_Seasonal_Or_Secondary_Home_END").equalsIgnoreCase("Yes")) {
                                setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home_END"));
                            }
                            setIsTheResidenceRented(data.get("Part_Of_The_Residence_Rented_END"));
                            setIsResidenceVacant(data.get("Is_The_Residence_Vacant_END"));
                            setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_END"));
                            if (data.get("Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_END"));
                                setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_END"));
                            }
                        }
                        break;
                        case "FL": {
                            setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_END"));
                            setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied_END"));
                            setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_END"));
                            setIsResidenceVacant(data.get("Is_The_Residence_Vacant_END"));
                            setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_END"));
                            if (data.get("Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_END"));
                                setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_END"));
                            }
                        }
                        break;
                    }
                }
                break;
                case "Condo/Co-op":
                case "Tenants": {
                    switch (data.get("State_END")) {
                        case "AR":
                        case "KS":
                        case "AZ":
                        case "DC":
                        case "IL":
                        case "IA":
                        case "KY":
                        case "AK":
                        case "IN":
                        case "CO":
                        case "NV":
                        case "MN":
                        case "OH":
                        case "NE":
                        case "NH":
                        case "NM":
                        case "MO":
                        case "MT":
                        case "OK":
                        case "OR":
                        case "WA":
                        case "SD":
                        case "WI":
                        case "RI":
                        case "UT":
                        case "WV":
                        case "TN":
                        case "PA":
                        case "VT":
                        case "MD":
                        case "HI":
                        case "MA":
                        case "ME":
                        case "CT":
                        case "AL":
                        case "WY":
                        case "LA":
                        case "CA":
                        case "DE":
                        case "GA":
                        case "NJ":
                        case "TX":
                        case "MI":
                        case "MS":
                        case "VA":
                        case "NC":
                        case "NY":
                        case "ND":
                        case "ID": {
                            setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_END"));
                            setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_END"));
                            setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_END"));
                            setIsResidenceVacant(data.get("Is_The_Residence_Vacant_END"));
                            setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_END"));
                            if (data.get("Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_END"));
                                setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_END"));
                            }
                            setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale_END"));
                        }
                        break;
                        case "SC": {
                            setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_END"));
                            setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_END"));
                            setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_END"));
                            setIsResidenceVacant(data.get("Is_The_Residence_Vacant_END"));
                            setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_END"));
                            if (data.get("Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_END"));
                                setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_END"));
                            }
                        }
                        break;
                        case "FL": {
                            setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_END"));
                            setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied_END"));
                            setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_END"));
                            setIsResidenceVacant(data.get("Is_The_Residence_Vacant_END"));
                            setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_END"));
                            if (data.get("Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_END"));
                                setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_END"));
                            }
                        }
                        break;
                    }
                }
                break;
            }
        clickElement(footer, "footer");
        verifyBlockExists("usage");
    }

    public void fillUsageDetails_OOS_END(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type_OOS_END")) {
            case "Homeowner": {
                setLocationListedOnNational(data.get("Location_Listed_On_National_OOS_END"));
                switch (data.get("State_OOS_END")) {
                    case "AK":
                    case "MD":
                    case "MS":
                    case "RI":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "VA":
                    case "NC":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "ID":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "ME":
                    case "TX":
                    case "GA":
                    case "AZ":
                    case "DC":
                    case "IL":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "CO":
                    case "TN":
                    case "WA":
                    case "CA": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_OOS_END"));
                        setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_OOS_END"));
                        if (data.get("Is_This_A_Seasonal_Or_Secondary_Home_OOS_END").equalsIgnoreCase("Yes")) {
                            setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home_OOS_END"));
                        }
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_OOS_END"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_OOS_END"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_OOS_END"));
                        if (data.get("Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_OOS_END"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_OOS_END"));
                        }
                        setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale_OOS_END"));
                    }
                    break;
                    case "SC": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_OOS_END"));
                        setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_OOS_END"));
                        if (data.get("Is_This_A_Seasonal_Or_Secondary_Home_OOS_END").equalsIgnoreCase("Yes")) {
                            setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home_OOS_END"));
                        }
                        setIsTheResidenceRented(data.get("Part_Of_The_Residence_Rented_OOS_END"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_OOS_END"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_OOS_END"));
                        if (data.get("Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_OOS_END"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_OOS_END"));
                        }
                    }
                    break;
                    case "FL": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_OOS_END"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied_OOS_END"));
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_OOS_END"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_OOS_END"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_OOS_END"));
                        if (data.get("Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_OOS_END"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_OOS_END"));
                        }
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_OOS_END")) {
                    case "AR":
                    case "KS":
                    case "AZ":
                    case "DC":
                    case "IL":
                    case "IA":
                    case "KY":
                    case "AK":
                    case "IN":
                    case "CO":
                    case "NV":
                    case "MN":
                    case "OH":
                    case "NE":
                    case "NH":
                    case "NM":
                    case "MO":
                    case "MT":
                    case "OK":
                    case "OR":
                    case "WA":
                    case "SD":
                    case "WI":
                    case "RI":
                    case "UT":
                    case "WV":
                    case "TN":
                    case "PA":
                    case "VT":
                    case "MD":
                    case "HI":
                    case "MA":
                    case "ME":
                    case "CT":
                    case "AL":
                    case "WY":
                    case "LA":
                    case "CA":
                    case "DE":
                    case "GA":
                    case "NJ":
                    case "TX":
                    case "MI":
                    case "MS":
                    case "VA":
                    case "NC":
                    case "NY":
                    case "ND":
                    case "ID": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_OOS_END"));
                        setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_OOS_END"));
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_OOS_END"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_OOS_END"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_OOS_END"));
                        if (data.get("Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_OOS_END"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_OOS_END"));
                        }
                        setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale_OOS_END"));
                    }
                    break;
                    case "SC": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_OOS_END"));
                        setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_OOS_END"));
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_OOS_END"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_OOS_END"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_OOS_END"));
                        if (data.get("Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_OOS_END"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_OOS_END"));
                        }
                    }
                    break;
                    case "FL": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_OOS_END"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied_OOS_END"));
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_OOS_END"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_OOS_END"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_OOS_END"));
                        if (data.get("Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_OOS_END"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_OOS_END"));
                        }
                    }
                    break;
                }
            }
            break;
        }
        clickElement(footer, "footer");
        verifyBlockExists("usage");
    }

    public void fillUsageDetails_RNW(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type_RNW")) {
            case "Homeowner": {
                setLocationListedOnNational(data.get("Location_Listed_On_National_RNW"));
                switch (data.get("State_RNW")) {
                    case "AK":
                    case "MD":
                    case "MS":
                    case "RI":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "VA":
                    case "NC":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "ID":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "ME":
                    case "TX":
                    case "GA":
                    case "AZ":
                    case "DC":
                    case "IL":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "CO":
                    case "TN":
                    case "WA":
                    case "CA": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_RNW"));
                        setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_RNW"));
                        if (data.get("Is_This_A_Seasonal_Or_Secondary_Home_RNW").equalsIgnoreCase("Yes")) {
                            setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home_RNW"));
                        }
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_RNW"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_RNW"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_RNW"));
                        if (data.get("Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_RNW"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_RNW"));
                        }
                        setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale_RNW"));
                    }
                    break;
                    case "SC": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_RNW"));
                        setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_RNW"));
                        if (data.get("Is_This_A_Seasonal_Or_Secondary_Home_RNW").equalsIgnoreCase("Yes")) {
                            setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home_RNW"));
                        }
                        setIsTheResidenceRented(data.get("Part_Of_The_Residence_Rented_RNW"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_RNW"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_RNW"));
                        if (data.get("Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_RNW"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_RNW"));
                        }
                    }
                    break;
                    case "FL": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_RNW"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied_RNW"));
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_RNW"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_RNW"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_RNW"));
                        if (data.get("Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_RNW"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_RNW"));
                        }
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_RNW")) {
                    case "AR":
                    case "KS":
                    case "AZ":
                    case "DC":
                    case "IL":
                    case "IA":
                    case "KY":
                    case "AK":
                    case "IN":
                    case "CO":
                    case "NV":
                    case "MN":
                    case "OH":
                    case "NE":
                    case "NH":
                    case "NM":
                    case "MO":
                    case "MT":
                    case "OK":
                    case "OR":
                    case "WA":
                    case "SD":
                    case "WI":
                    case "RI":
                    case "UT":
                    case "WV":
                    case "TN":
                    case "PA":
                    case "VT":
                    case "MD":
                    case "HI":
                    case "MA":
                    case "ME":
                    case "CT":
                    case "AL":
                    case "WY":
                    case "LA":
                    case "CA":
                    case "DE":
                    case "GA":
                    case "NJ":
                    case "TX":
                    case "MI":
                    case "MS":
                    case "VA":
                    case "NC":
                    case "NY":
                    case "ND":
                    case "ID": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_RNW"));
                        setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_RNW"));
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_RNW"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_RNW"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_RNW"));
                        if (data.get("Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_RNW"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_RNW"));
                        }
                        setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale_RNW"));
                    }
                    break;
                    case "SC": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_RNW"));
                        setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_RNW"));
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_RNW"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_RNW"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_RNW"));
                        if (data.get("Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_RNW"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_RNW"));
                        }
                    }
                    break;
                    case "FL": {
                        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_RNW"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied_RNW"));
                        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_RNW"));
                        setIsResidenceVacant(data.get("Is_The_Residence_Vacant_RNW"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_RNW"));
                        if (data.get("Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_RNW"));
                            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_RNW"));
                        }
                    }
                    break;
                }
            }
            break;
        }
        clickElement(footer, "footer");
        verifyBlockExists("usage");
    }

    public void fillUsageDetails(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        setLocationListedOnNational(data.get("Is_This_Location_Listed_On_National_" + i));
                        switch (data.get("State_" + i)) {
                            case "AK":
                            case "MD":
                            case "MS":
                            case "RI":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "ID":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "ME":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "TN":
                            case "WA":
                            case "CA": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_" + i));
                                setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_" + i));
                                if (data.get("Is_This_A_Seasonal_Or_Secondary_Home_" + i).equalsIgnoreCase("Yes")) {
                                    setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home_" + i));
                                }
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_" + i));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant_" + i));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_" + i));
                                if (data.get("Under_Construction_Or_Major_Renovation_" + i).equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_" + i));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_" + i));
                                }
                                setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale_" + i));
                                setLocationListedOnNational(data.get("Location_Listed_On_National_" + i));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_" + i));
                                setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_" + i));
                                if (data.get("Is_This_A_Seasonal_Or_Secondary_Home_" + i).equalsIgnoreCase("Yes")) {
                                    setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home_" + i));
                                }
                                setIsTheResidenceRented(data.get("Part_Of_The_Residence_Rented_" + i));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant_" + i));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_" + i));
                                if (data.get("Under_Construction_Or_Major_Renovation_" + i).equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_" + i));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_" + i));
                                }
                            }
                            break;
                            case "FL": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_" + i));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied_" + i));
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_" + i));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant_" + i));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_" + i));
                                if (data.get("Under_Construction_Or_Major_Renovation_" + i).equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_" + i));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_" + i));
                                }
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AR":
                            case "KS":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "IA":
                            case "KY":
                            case "AK":
                            case "IN":
                            case "CO":
                            case "NV":
                            case "MN":
                            case "OH":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "MO":
                            case "MT":
                            case "OK":
                            case "OR":
                            case "WA":
                            case "SD":
                            case "WI":
                            case "RI":
                            case "UT":
                            case "WV":
                            case "TN":
                            case "PA":
                            case "VT":
                            case "MD":
                            case "HI":
                            case "MA":
                            case "ME":
                            case "CT":
                            case "AL":
                            case "WY":
                            case "LA":
                            case "CA":
                            case "DE":
                            case "GA":
                            case "NJ":
                            case "TX":
                            case "MI":
                            case "MS":
                            case "VA":
                            case "NC":
                            case "NY":
                            case "ND":
                            case "ID": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_" + i));
                                setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_" + i));
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_" + i));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant_" + i));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_" + i));
                                if (data.get("Under_Construction_Or_Major_Renovation_" + i).equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_" + i));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_" + i));
                                }
                                setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale_" + i));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_" + i));
                                setIsThisASeasonalHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home_" + i));
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_" + i));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant_" + i));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_" + i));
                                if (data.get("Under_Construction_Or_Major_Renovation_" + i).equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_" + i));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_" + i));
                                }
                            }
                            break;
                            case "FL": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_" + i));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied_" + i));
                                setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented_" + i));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant_" + i));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_" + i));
                                if (data.get("Under_Construction_Or_Major_Renovation_" + i).equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_" + i));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_" + i));
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;

            case "Home Surplus Lines": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK":
                            case "MD":
                            case "MS":
                            case "RI":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "ID":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "ME":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "SC":
                            case "FL": {
                                setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence_" + i));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Home_Unoccupied_" + i));
                                setIsTheResidenceRented(data.get("Part_Of_The_Residence_Rented_" + i));
                                setIsResidenceVacant(data.get("Is_The_Residence_Vacant_" + i));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation_" + i));
                                if (data.get("Under_Construction_Or_Major_Renovation_" + i).equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out_" + i));
                                    setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work_" + i));
                                }

                            }
                            break;
                        }
                    }
                    break;

                    //TODO Usage for CONDO and TENANTS HS
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "FL":
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ":
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "FL":
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ": {

                            }
                        }
                    }
                    break;
                }
            }
            break;
        }

        saveChanges();
    }

    public void fillUsageDetailsCC(Map<String, String> data) throws Throwable {
        String intendedOccupancy = data.get("Usage_What_Is_The_Intended_Occupancy_Of_The_Home");
        verifyBlockExists("usage");
        setWhatIsIntendedOccupancyOfTheHome(data.get("Usage_What_Is_The_Intended_Occupancy_Of_The_Home"));
        if (hasValue(intendedOccupancy) && intendedOccupancy.equalsIgnoreCase("Other")) {
            setOtherOccupancy(data.get("Usage_Other_Occupancy"));
        }
        clickFooter();
        saveChanges();
    }

    public void fillUsageDetailsCC_END(Map<String, String> data) throws Throwable {
        String intendedOccupancy = hasValue(data.get("Usage_What_Is_The_Intended_Occupancy_Of_The_Home_END")) ? data.get("Usage_What_Is_The_Intended_Occupancy_Of_The_Home_END") : data.get("Usage_What_Is_The_Intended_Occupancy_Of_The_Home");

        setWhatIsIntendedOccupancyOfTheHome(data.get("Usage_What_Is_The_Intended_Occupancy_Of_The_Home_END"));
        if (intendedOccupancy.equalsIgnoreCase("Other")) {
            setOtherOccupancy(data.get("Usage_Other_Occupancy_END"));
        }
        saveChanges();
    }

    public void setWhatIsIntendedOccupancyOfTheHome(String value) {
        typeTextEnter(whatIsIntendedOccupancyOfTheHome, value, "What is intended occupancy of the home");
    }

    public void setOtherOccupancy(String value) {
        typeText(otherOccupancy, value, "Other Occupancy");
    }

    public void setIsPrimaryResidence(String res) throws Throwable {
        pause(5000);
        choose(isPrimaryResidenceYes, isPrimaryResidenceNo, res, "Is primary residence");
        if (res.equalsIgnoreCase("No")) {
            try {
                setIsThisASeasonalOrSecondaryHome("Yes");
            } catch (Exception e) {
                //
            }
            setDoesPureInsureThePrimaryHome("Yes");
        }
    }

    public void setDoesPureInsureThePrimaryHome(String choose) throws Throwable {
        choose(doesPureInsureThePrimaryHomeYes, doesPureInsureThePrimaryHomeNo, choose, "Does PURE insure primary home");
    }

    public void setIsTheHomeUnoccupiedMoreThanTwoMonths(String choose) throws Throwable {
        choose(isTheHomeUnoccupiedMoreThanTwoMonthsYes, isTheHomeUnoccupiedMoreThanTwoMonthsNo, choose, "Home unoccupied more than two months");
    }

    public void setIsTheResidenceOrPartRented(String choose) throws Throwable {
        choose(isTheResidenceOrPartRentedYes, isTheResidenceOrPartRentedNo, choose);
    }

    public void setIsTheResidenceShortTermRental(String choose) throws Throwable {
        choose(isTheResidenceShortTermRentalYes, isTheResidenceShortTermRentalNo, choose);
    }

    public void setIsResidenceVacant(String choose) throws Throwable {
        choose(isResidenceVacantYes, isResidenceVacantNo, choose, "Is residence vacant");
    }

    public void setIsResidenceUnderConstructionRenovation(String choose) throws Throwable {
        choose(isResidenceUnderConstructionRenovationYes, isResidenceUnderConstructionRenovationNo, choose);
    }

    public void setIsResidenceUnderConstructionRenovation(Map<String, String> data) throws Throwable {
        choose(isResidenceUnderConstructionRenovationYes, isResidenceUnderConstructionRenovationNo, data.get("Usage_Details_Is_Residence_Under_Construction"), "Is residence under construction renovation");
        if (data.get("Usage_Details_Is_Residence_Under_Construction").equalsIgnoreCase("Yes")) {
            setWhatIsTheCostOfPlannedWork(data.get("Usage_Details_Cost_Of_Planned_Work"));
        }
    }

    public void setHowLongMemberWillBeOutFromResidence(String text) throws Throwable {
        if (isResidenceUnderConstructionOrMajorRenovationYes.isEnabled() && isResidenceUnderConstructionOrMajorRenovationNo.isEnabled()) {

            typeText(howLongMemberWillBeOutFromResidence, text);
        }
    }

    public void setWhatIsTheCostOfPlannedWork(String text) {
        if (isResidenceUnderConstructionOrMajorRenovationYes.isEnabled() && isResidenceUnderConstructionOrMajorRenovationNo.isEnabled()) {

            typeText(whatIsTheCostOfPlannedWork, text, "What is the cost of planned work");
        }
    }

    public void setIsThisASeasonalOrSecondaryHome(String choose) throws Throwable {
        choose(isThisASeasonalOrSecondaryHomeYes, isThisASeasonalOrSecondaryHomeNo, choose);
    }

    public void setIsResidenceUnderConstructionOrMajorRenovation(String choose) throws Throwable {
        if (isResidenceUnderConstructionOrMajorRenovationYes.isEnabled() && isResidenceUnderConstructionOrMajorRenovationNo.isEnabled()) {
            choose(isResidenceUnderConstructionOrMajorRenovationYes, isResidenceUnderConstructionOrMajorRenovationNo, choose);
        }
    }

    public void setIsTheResidenceCurrentlyForSale(String choose) throws Throwable {
        choose(isTheResidenceCurrentlyForSaleYes, isTheResidenceCurrentlyForSaleNo, choose);
    }

    public void setLocationListedOnNational(String choose) throws Throwable {
        if (isVisibleOnly(By.xpath("//div[contains(text(),'location listed on national')]/../../../../div//label[text()='Yes']/..//input"))) {
            choose(locationListedOnNationalYes, locationListedOnNationalNo, choose);
        }
    }

    public void setIsThisASeasonalHome(String choose) throws Throwable {
        choose(isThisASeasonalHomeYes, isThisASeasonalHomeNo, choose);
    }

    public void setIsTheResidenceRented(String choose) throws Throwable {
        choose(isTheResidenceRentedYes, isTheResidenceRentedNo, choose);
    }

    public void setIsTheResidenceRented(Map<String, String> data) throws Throwable {
        choose(isTheResidenceRentedYes, isTheResidenceRentedNo, data.get("Usage_Part_Of_The_Residence_Rented"), "Is the residence rented");
        if (data.get("Usage_Part_Of_The_Residence_Rented").equalsIgnoreCase("Yes")) {
            setWeeksPerYearRented(data.get("Usage_How_Many_Weeks_Per_Year_Is_The_Residence-Rented?"));
            setWhatIsTheMinimumNightStay(data.get("Usage_What_Is_The_Minimum_Night_Stay?"));
            pause(500);
            setIsManagementCompanyUsedToAdministerRentals(data.get("Usage_Is_A_Management_Company_Used_To_Administer_Rentals?"));
        }
    }

    public void setIsTheResidenceRented_END(Map<String, String> data) throws Throwable {
        choose(isTheResidenceRentedYes, isTheResidenceRentedNo, data.get("Usage_Part_Of_The_Residence_Rented_END"), "Is the residence rented");
        if (data.get("Usage_Part_Of_The_Residence_Rented_END").equalsIgnoreCase("Yes")) {
            setWeeksPerYearRented(data.get("Usage_How_Many_Weeks_Per_Year_Is_The_Residence-Rented?_END"));
            setWhatIsTheMinimumNightStay(data.get("Usage_What_Is_The_Minimum_Night_Stay?_END"));
            pause(500);
            setIsManagementCompanyUsedToAdministerRentals(data.get("Usage_Is_A_Management_Company_Used_To_Administer_Rentals?_END"));
        }
    }

    public void setIsTheResidenceRented_OOS_END(Map<String, String> data) throws Throwable {
        choose(isTheResidenceRentedYes, isTheResidenceRentedNo, data.get("Usage_Part_Of_The_Residence_Rented_OOS_END"), "Is the residence rented");
        if (data.get("Usage_Part_Of_The_Residence_Rented_OOS_END").equalsIgnoreCase("Yes")) {
            setWeeksPerYearRented(data.get("Usage_How_Many_Weeks_Per_Year_Is_The_Residence-Rented?_OOS_END"));
            setWhatIsTheMinimumNightStay(data.get("Usage_What_Is_The_Minimum_Night_Stay?_OOS_END"));
            pause(500);
            setIsManagementCompanyUsedToAdministerRentals(data.get("Usage_Is_A_Management_Company_Used_To_Administer_Rentals?_OOS_END"));
        }
    }

    public void setIsTheResidenceRented_RNW(Map<String, String> data) throws Throwable {
        choose(isTheResidenceRentedYes, isTheResidenceRentedNo, data.get("Usage_Part_Of_The_Residence_Rented_RNW"), "Is the residence rented");
        if (data.get("Usage_Part_Of_The_Residence_Rented_RNW").equalsIgnoreCase("Yes")) {
            setWeeksPerYearRented(data.get("Usage_How_Many_Weeks_Per_Year_Is_The_Residence-Rented?_RNW"));
            setWhatIsTheMinimumNightStay(data.get("Usage_What_Is_The_Minimum_Night_Stay?_RNW"));
            pause(500);
            setIsManagementCompanyUsedToAdministerRentals(data.get("Usage_Is_A_Management_Company_Used_To_Administer_Rentals?_RNW"));
        }
    }

    public void setIsManagementCompanyUsedToAdministerRentals(String value) throws Throwable {
        choose(isManagementCompanyUsedToAdministerRentalsYes, isManagementCompanyUsedToAdministerRentalsNo, value, "Management company used to administer rentals");
    }

    public void setWhatIsTheMinimumNightStay(String value) {
        typeText(whatIsTheMinimumNightStay, value, "What Is The Minimum Night Stay");
    }

    public void setWeeksPerYearRented(String value) {
        typeText(weeksPerYearRented, value, "Weeks Per Year Rented");
    }

    public void fillUsageDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("usage");
        switch (data.get("Risk_Addresses_Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AL": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "LA": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "MA": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "HI": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "NC": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "NY": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "NJ": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "MT": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "WY": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "TX": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "GA": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "AZ": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "UT": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "CO": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "CA": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "SC": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "FL": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        if (data.get("Usage_Is_This_A_Primary_Residence").equalsIgnoreCase("No")) {
                            setDoesPureInsureThePrimaryHome("Usage_Does_Pure_Insure_The_Primary_Home");
                        }
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "MS": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "RI": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "CT": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                }
            }
            break;

            case "Condo/Co-op": {
                switch (data.get("State")) {
                    case "FL": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        //                       setDoesPureInsureThePrimaryHome("Usage_Does_Pure_Insure_The_Primary_Home");
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "MT": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "WY": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "MS": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "TX": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "GA": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "AZ": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "UT": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "CO": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "CA": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "AL": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "LA": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "MA": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "HI": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "NC": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "SC": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "NY": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "NJ": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "CT": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                    case "RI": {
                        setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                        setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                        setIsTheResidenceRented(data);
                        setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                        if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                            setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                            setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                        }
                        setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                    }
                    break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillUsageDetailsHS_END(Map<String, String> data) throws Throwable {
        String residenceType;
        if (hasValue(data.get("Risk_Addresses_Residence_Type_END"))) {
            residenceType = data.get("Risk_Addresses_Residence_Type_END");
        } else {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (residenceType) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "LA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "MA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "HI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "NC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "NY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "NJ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "MT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "WY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "TX": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "GA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "AZ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "UT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "CO": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "CA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "FL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "MS": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "RI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "CT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                        }
                    }
                    break;

                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "FL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "MT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "WY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "MS": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "TX": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "GA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "AZ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "UT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "CO": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "CA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "AL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "LA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "MA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "HI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "NC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "NY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "NJ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_END"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_END"));
                            }
                            break;
                            case "CT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                            }
                            break;
                            case "RI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied"));
                                setIsTheResidenceRented_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National"));
                            }
                            break;
                        }
                    }
                    break;
                }
                saveChanges();
            }
        }
    }

    public void fillUsageDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        String residenceType;
        if (hasValue(data.get("Risk_Addresses_Residence_Type_OOS_END"))) {
            residenceType = data.get("Risk_Addresses_Residence_Type_OOS_END");
        } else {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (residenceType) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "LA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "MA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "HI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "NC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "NY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "NJ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "MT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "WY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "TX": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "GA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "AZ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "UT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "CO": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "CA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "FL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "MS": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "RI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "CT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;

                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "FL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "MT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "WY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "MS": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "TX": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "GA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "AZ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "UT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "CO": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "CA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "AL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "LA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "MA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "HI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "NC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "NY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "NJ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "RI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                            case "CT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_OOS_END"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_OOS_END"));
                                setIsTheResidenceRented_OOS_END(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_OOS_END"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_OOS_END").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_OOS_END"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_OOS_END"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;
                }
                saveChanges();
            }
        }
    }

    public void fillUsageDetailsHS_RNW(Map<String, String> data) throws Throwable {
        String residenceType;
        if (hasValue(data.get("Risk_Addresses_Residence_Type_RNW"))) {
            residenceType = data.get("Risk_Addresses_Residence_Type_RNW");
        } else {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (residenceType) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "LA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "MA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "HI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "NC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "NY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "NJ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "MT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "WY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "TX": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "GA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "AZ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "UT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "CO": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "CA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "FL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "MS": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "RI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "CT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                        }
                    }
                    break;

                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "FL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "MT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "WY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "MS": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "TX": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "GA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "AZ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "UT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "CO": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "CA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "AL": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "LA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "MA": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "HI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "NC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "SC": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "NY": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "NJ": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "RI": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                            case "CT": {
                                setIsPrimaryResidence(data.get("Usage_Is_This_A_Primary_Residence_RNW"));
                                setIsTheHomeUnoccupiedMoreThanTwoMonths(data.get("Usage_Home_Unoccupied_RNW"));
                                setIsTheResidenceRented_RNW(data);
                                setIsResidenceVacant(data.get("Usage_Is_The_Residence_Vacant_RNW"));
                                setIsResidenceUnderConstructionOrMajorRenovation(data.get("Usage_Under_Construction_Or_Major_Renovation_RNW"));
                                if (data.get("Usage_Under_Construction_Or_Major_Renovation_RNW").equalsIgnoreCase("Yes")) {
                                    setHowLongMemberWillBeOutFromResidence(data.get("Usage_How_Long_Will_The_Member_Be_Out_RNW"));
                                    setWhatIsTheCostOfPlannedWork(data.get("Usage_Cost_Of_Planned_Work_RNW"));
                                }
                                setLocationListedOnNational(data.get("Usage_Location_Listed_On_National_RNW"));
                            }
                            break;
                        }
                    }
                    break;
                }
                saveChanges();
            }
        }
    }

    public void fillUsageDetailsFS(Map<String, String> data) {

    }
}



