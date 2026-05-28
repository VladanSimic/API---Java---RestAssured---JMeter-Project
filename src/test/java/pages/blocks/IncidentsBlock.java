package pages.blocks;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class IncidentsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public IncidentsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='incidents']/../../../../../../div[2]//*[text()='add']")
    WebElement addIncident;
    @FindBy(xpath = "//div[text()='incidents']")
    WebElement incidentsBlock;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../..//table//td[1]/div")
    List<WebElement> driverElement;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../..//table//td[2]/div")
    List<WebElement> source;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../..//table//td[3]/div")
    List<WebElement> violationType;
    @FindBy(xpath = "//div[text()='incidents']/../../../../../..//table//td[4]/div")
    List<WebElement> dateOfViolation;

    public void fillIncidentDetailsPA(Map<String, String> data) {
        int totalIncidents = 0;

        for (int i = 1; i <= data.get("Driver_Incidents").split(",").length; i++) {
            verifyDriver(data.get("First_Name") + " " + data.get("Last_Name"), i - 1);
            verifySource(data.get("Incidents_Source_" + i), i);
            verifyViolationType(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_" + i), i - 1);
            verifyDateOfViolation(data.get("Incidents_Acc_Or_Conviction_Date_" + i), i - 1);
            totalIncidents++;
        }

        for (int i = 1; i <= data.get("Additional_Operators").split(",").length; i++) {
            for (int j = 1; j <= data.get("Additional_Operator_Incidents_" + i).split(",").length; j++) {
                int currentIncidents = totalIncidents + 1;
                verifyDriver(data.get("Additional_Operators_Additional_Driver_First_Name_" + i) + " " + data.get("Additional_Operators_Additional_Driver_Last_Name_" + i), totalIncidents);
                verifySource(data.get("Incidents_Source_" + currentIncidents), currentIncidents - 1);
                verifyViolationType(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_" + currentIncidents), currentIncidents - 1);
                verifyDateOfViolation(data.get("Incidents_Acc_Or_Conviction_Date_" + currentIncidents), currentIncidents - 1);
                totalIncidents++;
            }
        }
    }

    public void fillIncidentDetailsPA_END(Map<String, String> data) {
        int totalIncidents = 0;

        for (int i = 1; i <= data.get("Driver_Incidents_END").split(",").length; i++) {
            verifyDriver(data.get("First_Name") + " " + data.get("Last_Name"), i);
            verifySource(data.get("Incidents_Source_END_" + i), i);
            verifyViolationType(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_END_" + i), i);
            verifyDateOfViolation(data.get("Incidents_Acc_Or_Conviction_Date_END_" + i), i);
            totalIncidents++;
        }

//        for (int i = 1; i <= data.get("Additional_Operators_END").split(",").length; i++) {
//            for (int j = 1; j <= data.get("Additional_Operator_Incidents_END_" + i).split(",").length; j++) {
//                int currentIncidents = totalIncidents + 1;
//                verifyDriver(data.get("Additional_Operators_Additional_Driver_First_Name_END_" + i) + " " + data.get("Additional_Operators_Additional_Driver_Last_Name_END_" + i), totalIncidents + 1);
//                verifySource(data.get("Incidents_Source_END_" + currentIncidents), currentIncidents);
//                verifyViolationType(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_END_" + currentIncidents), currentIncidents);
//                verifyDateOfViolation(data.get("Incidents_Acc_Or_Conviction_Date_END_" + currentIncidents), currentIncidents);
//                totalIncidents++;
//            }
//        }
        //TODO PA END - Incident details - Low
    }

    public void fillIncidentDetailsPA_OOS_END(Map<String, String> data) {
        int totalIncidents = 0;

        for (int i = 1; i <= data.get("Driver_Incidents_OOS_END").split(",").length; i++) {
            verifyDriver(data.get("First_Name") + " " + data.get("Last_Name"), i);
            verifySource(data.get("Incidents_Source_OOS_END_" + i), i);
            verifyViolationType(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_OOS_END_" + i), i);
            verifyDateOfViolation(data.get("Incidents_Acc_Or_Conviction_Date_OOS_END_" + i), i);
            totalIncidents++;
        }

        for (int i = 1; i <= data.get("Additional_Operators_OOS_END").split(",").length; i++) {
            for (int j = 1; j <= data.get("Additional_Operator_Incidents_OOS_END_" + i).split(",").length; j++) {
                int currentIncidents = totalIncidents + 1;
                verifyDriver(data.get("Additional_Operators_Additional_Driver_First_Name_OOS_END_" + i) + " " + data.get("Additional_Operators_Additional_Driver_Last_Name_OOS_END_" + i), totalIncidents + 1);
                verifySource(data.get("Incidents_Source_OOS_END_" + currentIncidents), currentIncidents);
                verifyViolationType(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_OOS_END_" + currentIncidents), currentIncidents);
                verifyDateOfViolation(data.get("Incidents_Acc_Or_Conviction_Date_OOS_END_" + currentIncidents), currentIncidents);
                totalIncidents++;
            }
        }
        //TODO PA OOS - Incident details - Low
    }

    public void fillIncidentDetailsPA_RNW(Map<String, String> data) {
        int totalIncidents = 0;

        for (int i = 1; i <= data.get("Driver_Incidents_RNW").split(",").length; i++) {
            verifyDriver(data.get("First_Name") + " " + data.get("Last_Name"), i);
            verifySource(data.get("Incidents_Source_RNW_" + i), i);
            verifyViolationType(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_RNW_" + i), i);
            verifyDateOfViolation(data.get("Incidents_Acc_Or_Conviction_Date_RNW_" + i), i);
            totalIncidents++;
        }

        for (int i = 1; i <= data.get("Additional_Operators_RNW").split(",").length; i++) {
            for (int j = 1; j <= data.get("Additional_Operator_Incidents_RNW_" + i).split(",").length; j++) {
                int currentIncidents = totalIncidents + 1;
                verifyDriver(data.get("Additional_Operators_Additional_Driver_First_Name_RNW_" + i) + " " + data.get("Additional_Operators_Additional_Driver_Last_Name_RNW_" + i), totalIncidents + 1);
                verifySource(data.get("Incidents_Source_END_" + currentIncidents), currentIncidents);
                verifyViolationType(data.get("Incidents_Accident_Or_Violation_Within_Last_5_Years_RNW_" + currentIncidents), currentIncidents);
                verifyDateOfViolation(data.get("Incidents_Acc_Or_Conviction_Date_RNW_" + currentIncidents), currentIncidents);
                totalIncidents++;
            }
        }
        //TODO PA RNW - Incident details - Low
    }

    public void verifyDriver(String s, int i) {
        assertEquals(driverElement.get(i).getText(), s, "Driver");
    }

    public void verifySource(String s, int i) {
        assertEquals(source.get(i).getText(), s, "Source");
    }

    public void verifyViolationType(String s, int i) {
        assertEquals(violationType.get(i).getText(), s, "Violation Type");
    }

    public void verifyDateOfViolation(String s, int i) {
        assertEquals(dateOfViolation.get(i).getText(), s, "Date Of Violation");
    }

    public void addIncidents(Map<String, String> data) throws Throwable {
        verifyBlockExists("incidents");
        if (hasValue(data.get("Incidents_Num"))) {
            for (int i = 1; i <= Integer.parseInt(data.get("Incidents_Num")); i++) {
                clickElement(addIncident);
                pause(5000);
                clickElement(incidentsBlock);
                setSource(data.get("Source").split(",")[i - 1], i);
                pause(3000);
                setDriver(data.get("Incident_Driver").split(",")[i - 1], i);
                pause(3000);
                setAccidentOrViolation(data.get("Accident_Or_Violation").split(",")[i - 1], i);
                pause(3000);
                setAccidentOrConvictionDate(data.get("Accident_Or_Conviction_Date").split(",")[i - 1], i);
                pause(3000);
                clickElement(saveChanges);
            }
        }
    }

    public void addIncidents_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Incidents_Num_END"))) {
            for (int i = 1; i <= Integer.parseInt(data.get("Incidents_Num_END")); i++) {
                int totalIncidents = i + Integer.parseInt(data.get("Incidents_Num"));
                clickElement(addIncident);
                pause(3000);
                clickElement(incidentsBlock);
                setDriver(data.get("Incident_Driver_END").split(",")[i - 1], totalIncidents);
                pause(3000);
                setSource(data.get("Source_END").split(",")[i - 1], totalIncidents);
                pause(3000);
                setAccidentOrViolation(data.get("Accident_Or_Violation_END").split(",")[i - 1], totalIncidents);
                pause(3000);
                setAccidentOrConvictionDate(data.get("Accident_Or_Conviction_Date_END").split(",")[i - 1], totalIncidents);
                pause(3000);
                saveChanges();
            }
        }
    }

    public void addIncidents_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Incidents_Num_OOS_END"))) {
            for (int i = 1; i <= Integer.parseInt(data.get("Incidents_Num_OOS_END")); i++) {
                int totalIncidents = i + Integer.parseInt(data.get("Incidents_Num"));
                clickElement(addIncident);
                pause(3000);
                clickElement(incidentsBlock);
                setDriver(data.get("Incident_Driver_OOS_END").split(",")[i - 1], totalIncidents);
                pause(3000);
                setSource(data.get("Source_OOS_END").split(",")[i - 1], totalIncidents);
                pause(3000);
                setAccidentOrViolation(data.get("Accident_Or_Violation_OOS_END").split(",")[i - 1], totalIncidents);
                pause(3000);
                setAccidentOrConvictionDate(data.get("Accident_Or_Conviction_Date_OOS_END").split(",")[i - 1], totalIncidents);
                pause(3000);
                saveChanges();
            }
        }
    }

    public void addIncidents_RNW(Map<String, String> data) throws Throwable {
        int totalIncidents = 0;
        int endorsementTotalIncidents = Integer.parseInt(data.get("Incidents_Num_END"));
        if (hasValue(data.get("Incidents_Num_RNW"))) {
            for (int i = 1; i <= Integer.parseInt(data.get("Incidents_Num_RNW")); i++) {
// TODO Uncomment when defect gets fixed
//                if(data.containsKey("Renewal_After_Endorsement") && data.get("Renewal_After_Endorsement").equals("Yes")) {
//                    totalIncidents = i + Integer.parseInt(data.get("Incidents_Num")) + endorsementTotalIncidents;
//                } else{
//                    totalIncidents = i + Integer.parseInt(data.get("Incidents_Num"));
//                }
                if (!data.get("Incidents_Num").equals("0")) {
                    totalIncidents = 2; //Currently it is allways second if there are incidents- DEFECT
                } else {
                    totalIncidents = i;
                }
                clickElement(addIncident);
                pause(5000);
                setDriver(data.get("Incident_Driver_RNW").split(",")[i - 1], totalIncidents);
                pause(3000);
                setSource(data.get("Source_RNW").split(",")[i - 1], totalIncidents);
                pause(3000);
                setAccidentOrViolation(data.get("Accident_Or_Violation_RNW").split(",")[i - 1], totalIncidents);
                pause(3000);
                setAccidentOrConvictionDate(data.get("Accident_Or_Conviction_Date_RNW").split(",")[i - 1], totalIncidents);
                pause(3000);
                saveChanges();
            }
        }
    }

    public void setDriver(String value, int i) throws Throwable {
        if (!value.equals("") && !value.equals(" ")) {
            clickElement(driver.findElement(By.xpath("//span[text()='Driver']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[1]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickElement(incidentsBlock);
            pause(1000);
        }
    }

    public void setSource(String value, int num) throws Throwable {
        if (hasValue(value)) {
            clickElement(driver.findElement(By.xpath("//span[text()='Source']/../../../../../../../../../div[3]//table[" + num + "]//tr/td[2]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickElement(incidentsBlock);
            pause(1000);
        }
    }

    public void setAccidentOrViolation(String value, int num) throws Throwable {
        if (hasValue(value)) {
            clickElement(incidentsBlock);
            clickElement(driver.findElement(By.xpath("//span[text()='Source']/../../../../../../../../../div[3]//table[" + num + "]//tr/td[3]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickElement(incidentsBlock);
            pause(1000);
        }
    }

    public void setAccidentOrConvictionDate(String value, int num) throws Throwable {
        if (hasValue(value)) {
            clickElement(driver.findElement(By.xpath("//span[text()='Source']/../../../../../../../../../div[3]//table[" + num + "]//tr/td[4]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickElement(incidentsBlock);
            pause(1000);
        }
    }

    public void verifyDetailsOfCopiedIncident(String LOB, DataTable table, Map<String, String> data) {

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        if (LOB.equalsIgnoreCase("PA") || LOB.equalsIgnoreCase("EX") || LOB.equalsIgnoreCase("ES")) {
            for (int i = 0; i < rows.size(); i++) {

                Map<String, String> row = rows.get(i);

                if (hasValue(row.get("ratedDriver"))) {
                    verifyDriver(row.get("ratedDriver"), i);
                } else {
                    verifyDriver(data.get("First_Name") + " " + data.get("Last_Name"), i);
                }

                verifySource(row.get("Source"), i);
                verifyViolationType(row.get("ratedAccident"), i);

                if (hasValue(row.get("accidentConvictionDate"))) {
                    verifyDateOfViolation(row.get("accidentConvictionDate"), i);
                } else {
                    verifyDateOfViolation(data.get("Effective_Date"), i);
                }
            }
            reportScreenshot(LOB+"CopiedClaims"+System.currentTimeMillis(),"CopiedClaimInfo");
        }
    }


    public void addIncidentsES(Map<String, String> data) throws Throwable {
        verifyBlockExists("incidents");
        verifyBlockExists("previous incidents from CLUE reports");
        if (hasValue(data.get("Incidents_Num"))) {
            for (int i = 1; i <= Integer.parseInt(data.get("Incidents_Num")); i++) {
                clickElement(addIncident);
                pause(5000);
                clickElement(incidentsBlock);
                setSource(data.get("Incident_Source").split(",")[i - 1], i);
                pause(3000);
                setDriver(data.get("Incident_Driver").split(",")[i - 1], i);
                pause(3000);
                setAccidentOrViolation(data.get("Incident_Accident_Or_Violation").split(",")[i - 1], i);
                pause(3000);
                setAccidentOrConvictionDate(data.get("Incident_Accident_Or_Conviction_Date").split(",")[i - 1], i);
                pause(3000);
                clickElement(saveChanges);
            }
        }
    }
}