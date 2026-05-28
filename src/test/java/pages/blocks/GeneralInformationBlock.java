package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class GeneralInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public GeneralInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Declined, Canceled')]/../../../../div//label[text()='Yes']/..//input")
    WebElement declinedCanceledNonRenewedYes;
    @FindBy(xpath = "//div[contains(text(),'Declined, Canceled')]/../../../../div//label[text()='No']/..//input")
    WebElement declinedCanceledNonRenewedNo;
    @FindBy(xpath = "//div[contains(text(),'involved in any Litigation')]/../../../../div//label[text()='Yes']/..//input")
    WebElement involvedInLitigationYes;
    @FindBy(xpath = "//div[contains(text(),'involved in any Litigation')]/../../../../div//label[text()='No']/..//input")
    WebElement involvedInLitigationNo;
    @FindBy(xpath = "//div[contains(text(),'Domestic Employees')]/../../../../div//label[text()='Yes']/..//input")
    WebElement domesticEmployeesYes;
    @FindBy(xpath = "//div[contains(text(),'Domestic Employees')]/../../../../div//label[text()='No']/..//input")
    WebElement domesticEmployeesNo;
    @FindBy(xpath = "//div[contains(text(),'had an allegation')]/../../../../div//label[text()='Yes']/..//input")
    WebElement hadAnAllegationYes;
    @FindBy(xpath = "//div[contains(text(),'had an allegation')]/../../../../div//label[text()='No']/..//input")
    WebElement hadAnAllegationNo;
    @FindBy(xpath = "//div[contains(text(),'How many?')]/../../../../div//input")
    WebElement howManyEmployees;
    @FindBy(xpath = "//div[text()='How many vehicles are owned or leased in the household']/../../../..//input")
    WebElement howManyVehiclesOwned;
    @FindBy(xpath = "//div[contains(text(),'own a recreational vehicle?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement householdOwnARecreationalVehicleYes;
    @FindBy(xpath = "//div[contains(text(),'own a recreational vehicle?')]/../../../../div//label[text()='No']/..//input")
    WebElement householdOwnARecreationalVehicleNo;
    @FindBy(xpath = "//div[contains(text(),'own a motorcycle')]/../../../../div//label[text()='Yes']/..//input")
    WebElement householdOwnAMotorcycleYes;
    @FindBy(xpath = "//div[contains(text(),'own a motorcycle')]/../../../../div//label[text()='No']/..//input")
    WebElement householdOwnAMotorcycleNo;
    @FindBy(xpath = "//div[text()='How many?']/../../../..//input[@aria-hidden='false']")
    List<WebElement> howMany;

    public void setDeclinedCanceledNonRenewed(String value) throws Throwable {
        pause(5000);
        choose(declinedCanceledNonRenewedYes, declinedCanceledNonRenewedNo, value, "Declined canceled non renewed");
    }

    public void setInvolvedInLitigation(String value) throws Throwable {
        choose(involvedInLitigationYes, involvedInLitigationNo, value, "Involved in litigation");
    }

    public void setHowManyVehiclesOwned(String value) {
        typeText(howManyVehiclesOwned, value, "How many vehicles owned");
    }

    public void setDomesticEmployees(String value, String employeesNum) throws Throwable {
        choose(domesticEmployeesYes, domesticEmployeesNo, value, "Domestic employees");
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            typeText(howManyEmployees, employeesNum, "How many employees");
        }
    }

    public void setDomesticEmployees(String value) throws Throwable {
        choose(domesticEmployeesYes, domesticEmployeesNo, value, "Domestic employees");
    }

    public void setHowManyEmployees(String value) {
        typeTextEnter(howManyEmployees, value, "How many employees");
    }

    public void setHadAnAllegation(String value) throws Throwable {
        choose(hadAnAllegationYes, hadAnAllegationNo, value, "Had an allegation");
    }

    public void fillGeneralInformationDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("general information");
        setDeclinedCanceledNonRenewed(data.get("Declined_Canceled_NonRenewed"));
        setInvolvedInLitigation(data.get("Involved_In_Litigation"));
        setDomesticEmployees(data.get("Domestic_Employees"), data.get("Domestic_Employees_Num"));
        setHadAnAllegation(data.get("Had_An_Allegation"));
        if (data.get("State").equalsIgnoreCase("NY")) {
            setHowManyVehiclesOwned(data.get("How_Many_Vehicles_Owned"));
        }
        setHouseHoldOwnRecreationalVehicle(data.get("Household_Own_Recreational_Vehicle"));
        setHouseHoldOwnMotorcycleMopedScooter(data.get("Household_Own_Motorcycle_Moped_Scooter"));
        saveChanges();
    }

    public void fillGeneralInformationDetailsExcessSurplus(Map<String, String> data) throws Throwable {
        if (driver.findElements(By.xpath("//div[text()='general information']")).size() > 0) {
            setDeclinedCanceledNonRenewed("No");
            setInvolvedInLitigation("No");
            setDomesticEmployees("No", "0");
            setHadAnAllegation("No");
            saveChanges();
        }
    }

    public void fillGeneralInformationDetails_END(Map<String, String> data) throws Throwable {
        setDeclinedCanceledNonRenewed(data.get("Declined_Canceled_NonRenewed_END"));
        setInvolvedInLitigation(data.get("Involved_In_Litigation_END"));
        setDomesticEmployees(data.get("Domestic_Employees_END"), data.get("Domestic_Employees_Num_END"));
        setHadAnAllegation(data.get("Had_An_Allegation_END"));
        pause(2000);
        saveChanges();
    }

    public void fillGeneralInformationDetails_OOS_END(Map<String, String> data) throws Throwable {
        setDeclinedCanceledNonRenewed(data.get("Declined_Canceled_NonRenewed_OOS_END"));
        setInvolvedInLitigation(data.get("Involved_In_Litigation_OOS_END"));
        setDomesticEmployees(data.get("Domestic_Employees_OOS_END"), data.get("Domestic_Employees_Num_OOS_END"));
        setHadAnAllegation(data.get("Had_An_Allegation_OOS_END"));
        saveChanges();
    }

    public void fillGeneralInformationDetails_RNW(Map<String, String> data) throws Throwable {
        setDeclinedCanceledNonRenewed(data.get("Declined_Canceled_NonRenewed_RNW"));
        setInvolvedInLitigation(data.get("Involved_In_Litigation_RNW"));
        setDomesticEmployees(data.get("Domestic_Employees_RNW"), data.get("Domestic_Employees_Num_RNW"));
        setHadAnAllegation(data.get("Had_An_Allegation_RNW"));
        saveChanges();
    }

    public void setHouseHoldOwnRecreationalVehicle(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                if(isElementDisplayed(householdOwnARecreationalVehicleYes)) {
                    choose(householdOwnARecreationalVehicleYes, householdOwnARecreationalVehicleNo, "No");
                }
            } else {
                choose(householdOwnARecreationalVehicleYes, householdOwnARecreationalVehicleNo, "Yes");
                pause(1000);
                typeTextEnter(howMany.get(howMany.size() - 1), value, "How Many?");
            }
        }
    }

    public void setHouseHoldOwnMotorcycleMopedScooter(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                if(isElementDisplayed(householdOwnAMotorcycleYes)) {
                    choose(householdOwnAMotorcycleYes, householdOwnAMotorcycleNo, "No");
                }
            } else {
                choose(householdOwnAMotorcycleYes, householdOwnAMotorcycleYes, "Yes");
                pause(1000);
                typeTextEnter(howMany.get(howMany.size() - 1), value, "How Many?");
            }
        }
    }
}