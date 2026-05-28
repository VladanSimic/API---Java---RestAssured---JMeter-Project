package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class DriverIncidentsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public DriverIncidentsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement addIncident;
    @FindBy(xpath = "//span[text()='delete']")
    List<WebElement> deleteIncident;
    @FindBy(xpath = "//div[text()='incidents']")
    WebElement incidentsBlock;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[2]/div")
    List<WebElement> source;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[3]/div")
    List<WebElement> accidentOrViolation;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[4]/div")
    List<WebElement> incidentDate;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[5]/div")
    List<WebElement> lossAmount;
    @FindBy(xpath = "(//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[4]/div//input)[1]")
    List<WebElement> totalClaimCostNo;
    @FindBy(xpath = "(//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[4]/div//input)[1]")
    List<WebElement> totalClaimCostYes;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table//tr/td[5]/div")
    List<WebElement> incidentDate2;

    String accidentOrViolationXpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table[$]//tr/td[3]/div";
    String incidentDateXpath = "//div[text()='incidents']/../../../../../../div[2]/div[3]//table[$]//tr/td[4]/div";

    public void fillDriverIncidentsDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("incidents");
        verifyBlockExists("previous incidents details from CLUE Reports");
        String[] incidents = data.get("Driver_Incidents").split(",");

        for (int i = 1; i <= incidents.length; i++) {
            clickElement(addIncident);
            pause(3000);
            clickElement(incidentsBlock);
            setIncidentSource(data.get("Incidents_Source_" + i), i-1);
            setAccidentOrViolation(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_" + i), i-1);
            setIncidentDate(data.get("Incidents_Acc_Or_Conviction_Date_" + i), i-1);
            setIncidentLossAmount(data.get("Incidents_LossAmount_" + i), i-1);
            saveChanges();
        }
    }

    public void fillDriverIncidentsDetailsPA_END(Map<String, String> data) throws Throwable {
        String[] incidentsNB = data.get("Driver_Incidents").split(",");
        String[] incidentsEND = data.get("Driver_Incidents_END").split(",");

        //Modify incident
        for (int i = 1; i <= incidentsEND.length; i++) {
            if (incidentsEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < incidentsNB.length; j++) {
                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i - 1].split("_MOD")[0])) {
                        clickElement(incidentsBlock);
                        setIncidentSource(data.get("Incidents_Source_END_" + i), j);
                        setAccidentOrViolation(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_END_" + i), j);
                        setIncidentDate(data.get("Incidents_Acc_Or_Conviction_Date_END_" + i), j);
                        saveChanges();
                        saveChanges();
                    }
                }
            }
        }

        int totalCount = incidentsNB.length;
        //Add addresses
        for (int i = 1; i <= incidentsEND.length; i++) {
            if (incidentsEND[i - 1].contains("_ADD")) {
                clickElement(addIncident);
                pause(3000);
                clickElement(incidentsBlock);
                setIncidentSource(data.get("Incidents_Source_END_" + i), totalCount);
                setAccidentOrViolation(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_END_" + i), totalCount);
                setIncidentDate(data.get("Incidents_Acc_Or_Conviction_Date_END_" + i), totalCount);
                saveChanges();
            }
        }

        //Delete incident
        for (int i = 0; i < incidentsEND.length; i++) {
            if (incidentsNB[i].contains("_DEL")) {
                for (int j = 0; j < incidentsNB.length; j++) {
                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i].split("_DEL")[0])) {
                        clickElement(deleteIncident.get(j));
                    }
                }
            }
        }
    }

    public void fillDriverIncidentsDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] driverIncidentsNB = data.get("Driver_Incidents").split(",");
        String[] driverIncidentsEND = data.get("Driver_Incidents_END").split(",");
        String[] driverIncidentsRNW = data.get("Driver_Incidents_RNW").split(",");
        String[] driverIncidentsOOSEND = data.get("Driver_Incidents_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = driverIncidentsNB.length;

        //If there was END transaction and it happened before OOS add END to the total count
        if (endPosition > -1 && endPosition < oosPosition) {
            for (String s : driverIncidentsEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was RNW transaction and it happened before OOS add RNW to the total count
        if (rnwPosition > -1 && rnwPosition < oosPosition) {
            for (String s : driverIncidentsRNW) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //Add Driver Incidents
        for (int i = 1; i <= driverIncidentsOOSEND.length; i++) {
            if (driverIncidentsOOSEND[i - 1].contains("_ADD")) {
                clickElement(addIncident);
                pause(3000);
                clickElement(incidentsBlock);
                setIncidentSource(data.get("Incidents_Source_OOS_END_" + i), totalCount);
                setAccidentOrViolation(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_OOS_END_" + i), totalCount);
                setIncidentDate(data.get("Incidents_Acc_Or_Conviction_Date_OOS_END_" + i), totalCount);
                saveChanges();
                totalCount++;
            }
        }

//        Modify incident
//        for (int i = 1; i <= incidentsEND.length; i++) {
//            if (incidentsEND[i-1].contains("_MOD")) {
//                for(int j = 0; j < incidentsNB.length; j++){
//                    if(incidentsNB[j].equalsIgnoreCase(incidentsEND[i-1].split("_MOD")[0])){
//                        clickElement(incidentsBlock);
//                        setIncidentSource(data.get("Incidents_Source_OOS_END_" + i), j);
//                        setAccidentOrViolation(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_OOS_END_" + i), j);
//                        setIncidentDate(data.get("Incidents_Acc_Or_Conviction_Date_OOS_END_" + i), j);
//                        saveChanges();
//                        saveChanges();
//                    }
//                }
//            }
//        }
//
//        Delete incident
//        for (int i = 0; i < incidentsEND.length; i++) {
//            if (incidentsNB[i].contains("_DEL")) {
//                for (int j = 0; j < incidentsNB.length; j++) {
//                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i].split("_DEL")[0])) {
//                        clickElement(deleteIncident.get(j));
//                    }
//                }
//            }
//        }

        //TODO PA OOS - Driver incidents - Modification and Deletion - Mid
    }

    public void fillDriverIncidentsDetailsPA_RNW(Map<String, String> data) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] driverIncidentsNB = data.get("Driver_Incidents").split(",");
        String[] driverIncidentsEND = data.get("Driver_Incidents_END").split(",");
        String[] driverIncidentsRNW = data.get("Driver_Incidents_RNW").split(",");
        String[] driverIncidentsOOSEND = data.get("Driver_Incidents_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = driverIncidentsNB.length;

        //If there was END transaction and it happened before RNW add END to the total count
        if (endPosition > -1 && endPosition < rnwPosition) {
            for (String s : driverIncidentsEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was OOS transaction and it happened before RNW add OOS to the total count
        if (oosPosition > -1 && oosPosition < rnwPosition) {
            for (String s : driverIncidentsOOSEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //Add driver incidents
        for (int i = 1; i <= driverIncidentsRNW.length; i++) {
            if (driverIncidentsRNW[i - 1].contains("_ADD")) {
                clickElement(addIncident);
                pause(3000);
                clickElement(incidentsBlock);
                setIncidentSource(data.get("Incidents_Source_RNW_" + i), totalCount);
                setAccidentOrViolation(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_RNW_" + i), totalCount);
                setIncidentDate(data.get("Incidents_Acc_Or_Conviction_Date_RNW_" + i), totalCount);
                saveChanges();
                totalCount++;
            }
        }

//        Modify incident
//        for (int i = 1; i <= incidentsEND.length; i++) {
//            if (incidentsEND[i-1].contains("_MOD")) {
//                for(int j = 0; j < incidentsNB.length; j++){
//                    if(incidentsNB[j].equalsIgnoreCase(incidentsEND[i-1].split("_MOD")[0])){
//                        clickElement(incidentsBlock);
//                        setIncidentSource(data.get("Incidents_Source_END_" + i), j);
//                        setAccidentOrViolation(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_END_" + i), j);
//                        setIncidentDate(data.get("Incidents_Acc_Or_Conviction_Date_END_" + i), j);
//                        saveChanges();
//                        saveChanges();
//                    }
//                }
//            }
//        }
//
//        Delete incident
//        for (int i = 0; i < incidentsEND.length; i++) {
//            if (incidentsNB[i].contains("_DEL")) {
//                for (int j = 0; j < incidentsNB.length; j++) {
//                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i].split("_DEL")[0])) {
//                        clickElement(deleteIncident.get(j));
//                    }
//                }
//            }
//        }

        //TODO PA RNW - Driver incidents - Modification and Deletion - Mid
    }

    public void fillAdditionalDriverIncidentsDetailsPA(Map<String, String> data, int index) throws Throwable {
        String[] incidents = data.get("Additional_Operator_Incidents_" + index).split(",");

        for (int i = 1; i <= incidents.length; i++) {
            clickElement(addIncident);
            saveChanges();
            clickElement(incidentsBlock);
            setIncidentSource(data.get("Incidents_Additional_Driver_Source_" + index + "_" + i), i-1);
            setAccidentOrViolation(data.get("Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_" + index + "_" + i), i-1);
            setIncidentDate(data.get("Incidents_Additional_Driver_Acc_Or_Conviction_Date_" + index + "_" + i), i-1);
            saveChanges();
        }
    }

    public void fillAdditionalDriverIncidentsDetailsPA_END(Map<String, String> data, int index) throws Throwable {
        String[] incidentsNB = data.get("Additional_Operator_Incidents_" + index).split(",");
        String[] incidentsEND = data.get("Additional_Operator_Incidents_END_" + index).split(",");

        //Modify incident
        for (int i = 1; i <= incidentsEND.length; i++) {
            if (incidentsEND[i - 1].contains("_MOD")) {
                for (int j = 0; j < incidentsNB.length; j++) {
                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i - 1].split("_MOD")[0])) {
                        clickElement(incidentsBlock);
                        setIncidentSource(data.get("Incidents_Additional_Driver_Source_END_" + index + "_" + i), j);
                        setAccidentOrViolation(data.get("Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_END_" + index + "_" + i), j);
                        setIncidentDate(data.get("Incidents_Additional_Driver_Acc_Or_Conviction_Date_END_" + index + "_" + i), j);
                        saveChanges();
                        saveChanges();
                    }
                }
            }
        }

        int totalCount = incidentsNB.length;
        //Add incident
        for (int i = 1; i <= incidentsEND.length; i++) {
            if (incidentsEND[i - 1].contains("_ADD")) {
                clickElement(addIncident);
                pause(3000);
                clickElement(incidentsBlock);
                setIncidentSource(data.get("Incidents_Additional_Driver_Source_END_" + index + "_" + i), totalCount);
                setAccidentOrViolation(data.get("Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_END_" + index + "_" + i), totalCount);
                setIncidentDate(data.get("Incidents_Additional_Driver_Acc_Or_Conviction_Date_END_" + index + "_" + i), totalCount);
                saveChanges();
            }
        }

        //Delete incident
        for (int i = 0; i < incidentsEND.length; i++) {
            if (incidentsNB[i].contains("_DEL")) {
                for (int j = 0; j < incidentsNB.length; j++) {
                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i].split("_DEL")[0])) {
                        clickElement(deleteIncident.get(j));
                    }
                }
            }
        }
    }

    public void fillAdditionalDriverIncidentsDetailsPA_OOS_END(Map<String, String> data, int index) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] incidentsNB = data.get("Additional_Operator_Incidents_" + index).split(",");
        String[] incidentsEND = data.get("Additional_Operator_Incidents_END_" + index).split(",");
        String[] incidentsRNW = data.get("Additional_Operator_Incidents_RNW_" + index).split(",");
        String[] incidentsOOSEND = data.get("Additional_Operator_Incidents_OOS_END_" + index).split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = incidentsNB.length;

        //If there was END transaction and it happened before OOS add END to the total count
        if (endPosition > -1 && endPosition < oosPosition) {
            for (String s : incidentsEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was RNW transaction and it happened before OOS add RNW to the total count
        if (rnwPosition > -1 && rnwPosition < oosPosition) {
            for (String s : incidentsRNW) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //Add incident
        for (int i = 1; i <= incidentsOOSEND.length; i++) {
            if (incidentsOOSEND[i - 1].contains("_ADD")) {
                clickElement(addIncident);
                pause(3000);
                clickElement(incidentsBlock);
                setIncidentSource(data.get("Incidents_Additional_Driver_Source_OOS_END_" + index + "_" + i), totalCount);
                setAccidentOrViolation(data.get("Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_OOS_END_" + index + "_" + i), totalCount);
                setIncidentDate(data.get("Incidents_Additional_Driver_Acc_Or_Conviction_Date_OOS_END_" + index + "_" + i), totalCount);
                saveChanges();
                totalCount++;
            }
        }

//        Modify incident
//        for (int i = 1; i <= incidentsEND.length; i++) {
//            if (incidentsEND[i - 1].contains("_MOD")) {
//                for (int j = 0; j < incidentsNB.length; j++) {
//                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i - 1].split("_MOD")[0])) {
//                        clickElement(incidentsBlock);
//                        setIncidentSource(data.get("Incidents_Additional_Driver_Source_OOS_END_" + i), j);
//                        setAccidentOrViolation(data.get("Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_OOS_END_" + i), j);
//                        setIncidentDate(data.get("Incidents_Additional_Driver_Acc_Or_Conviction_Date_OOS_END_" + i), j);
//                        saveChanges();
//                        saveChanges();
//                    }
//                }
//            }
//        }
//
//        Delete incident
//        for (int i = 0; i < incidentsEND.length; i++) {
//            if (incidentsNB[i].contains("_DEL")) {
//                for (int j = 0; j < incidentsNB.length; j++) {
//                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i].split("_DEL")[0])) {
//                        clickElement(deleteIncident.get(j));
//                    }
//                }
//            }
//        }

        // TODO PA OOS - Additional diver incidents - Modification and Deletion - Mid
    }

    public void fillAdditionalDriverIncidentsDetailsPA_RNW(Map<String, String> data, int index) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] incidentsNB = data.get("Additional_Operator_Incidents_" + index).split(",");
        String[] incidentsEND = data.get("Additional_Operator_Incidents_END_" + index).split(",");
        String[] incidentsRNW = data.get("Additional_Operator_Incidents_RNW_" + index).split(",");
        String[] incidentsOOSEND = data.get("Additional_Operator_Incidents_OOS_END_" + index).split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = incidentsNB.length;

        //If there was END transaction and it happened before RNW add END to the total count
        if (endPosition > -1 && endPosition < rnwPosition) {
            for (String s : incidentsEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was OOS transaction and it happened before RNW add OOS to the total count
        if (oosPosition > -1 && oosPosition < rnwPosition) {
            for (String s : incidentsOOSEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //Add addresses
        for (int i = 1; i <= incidentsRNW.length; i++) {
            if (incidentsRNW[i - 1].contains("_ADD")) {
                clickElement(addIncident);
                pause(3000);
                clickElement(incidentsBlock);
                setIncidentSource(data.get("Incidents_Additional_Driver_Source_RNW_" + index + "_" + i), totalCount);
                setAccidentOrViolation(data.get("Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_RNW_" + index + "_" + i), totalCount);
                setIncidentDate(data.get("Incidents_Additional_Driver_Acc_Or_Conviction_Date_RNW_" + index + "_" + i), totalCount);
                saveChanges();
            }
        }

//        Modify incident
//        for (int i = 1; i <= incidentsEND.length; i++) {
//            if (incidentsEND[i - 1].contains("_MOD")) {
//                for (int j = 0; j < incidentsNB.length; j++) {
//                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i - 1].split("_MOD")[0])) {
//                        clickElement(incidentsBlock);
//                        setIncidentSource(data.get("Incidents_Additional_Driver_Source_RNW_" + i), j);
//                        setAccidentOrViolation(data.get("Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_RNW_" + i), j);
//                        setIncidentDate(data.get("Incidents_Additional_Driver_Acc_Or_Conviction_Date_RNW_" + i), j);
//                        saveChanges();
//                        saveChanges();
//                    }
//                }
//            }
//        }
//
//        Delete incident
//        for (int i = 0; i < incidentsEND.length; i++) {
//            if (incidentsNB[i].contains("_DEL")) {
//                for (int j = 0; j < incidentsNB.length; j++) {
//                    if (incidentsNB[j].equalsIgnoreCase(incidentsEND[i].split("_DEL")[0])) {
//                        clickElement(deleteIncident.get(j));
//                    }
//                }
//            }
//        }

//        TODO PA RNW - Additional diver incidents - Modification and Deletion - Mid
    }

    public void setIncidentDate(String value, int i) throws Throwable {
        if (value != null) {
           // clickElement(driver.findElement(By.xpath(updateXpath(incidentDateXpath, String.valueOf(i)))));
            clickElement(incidentDate.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(incidentsBlock);
        }
    }

    public void setAccidentOrViolation(String value, int i) throws Throwable {
        if (value != null) {
            clickElement(accidentOrViolation.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(incidentsBlock);
        }
    }

    public void setIncidentSource(String value, int i) throws Throwable {
        if (value != null) {
            if(isElementDisplayed(source.get(i),15)){
                clickElement(source.get(i));
                typeText(driver.switchTo().activeElement(), value);
                pause(2000);
                clickElement(incidentsBlock);
            }
        }
    }

    public void setIncidentDate(String value, int i, String state) throws Throwable {
        if (state.equalsIgnoreCase("CA")) {
            clickElement(incidentDate2.get(i));
        } else {
            clickElement(incidentDate.get(i));
        }
        pause(1000);
        typeTextEnter(driver.switchTo().activeElement(), value, "Incident Date");
        clickFooter();
    }

    public void clickAdd() throws Throwable {
        clickElement(addIncident, "Add Incident");
        pause(2000);
        clickFooter();
    }

    public void setIncidentLossAmount(String value, int i) throws Throwable {
        if (value != null) {
            if(isElementDisplayed(lossAmount.get(i),15)){
                clickElement(lossAmount.get(i));
                typeText(driver.switchTo().activeElement(), value);
                pause(2000);
                clickElement(incidentsBlock);
            }
        }
    }

}