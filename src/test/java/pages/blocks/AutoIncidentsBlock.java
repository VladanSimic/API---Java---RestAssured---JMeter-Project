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

public class AutoIncidentsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AutoIncidentsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Has any operator had any prior incidents?']/../../../..//label[text()='No']/..//input")
    WebElement operatorPriorIncidentsNo;
    @FindBy(xpath = "//div[text()='Has any operator had any prior incidents?']/../../../..//label[text()='Yes']/..//input")
    WebElement operatorPriorIncidentsYes;
    @FindBy(xpath = "//div[text()='Select Operator']/../../../..//input")
    WebElement selectOperatorField;
    @FindBy(xpath = "//div[text()='Select Operator']/../../../../../../../../../../..//span[text()='Add']")
    WebElement addAutoLoss;


    public void fillAutoIncidentsComponent(Map<String, String> data) throws Throwable {
        verifyBlockExists("auto incidents");
        setPriorOperatorIncidents(data);

       if(hasValue(data.get("auto_incident_num")) && !data.get("auto_incident_num").isEmpty()) {
           for (int i = 0; i < Integer.parseInt(data.get("auto_incident_num")); i++) {
               pause(1000);
               setSelectedOperatorWithSheetData(data);
               clickElement(addAutoLoss, "Add button for auto incidents");
               pause(1000);
               clickFooter();
               setAutoIncidentSource(data.get("auto_incident_source_" + i), i);
               setAutoIncidentAccidentType(data.get("auto_incident_accident_type_" + i), i);
               if (data.get("auto_incident_loss_date_" + i).equalsIgnoreCase("Today")) {
                   setAutoIncidentLossDate(data.get("Effective_Date"), i);
               } else {
                   setAutoIncidentLossDate(data.get("auto_incident_loss_date_" + i), i);
               }
           }
       }
    }

    private void setPriorOperatorIncidents(Map<String, String> data) throws Throwable {
        choose(operatorPriorIncidentsYes, operatorPriorIncidentsNo, data.get("Operator_Prior_Incidents"));
    }

    public void verifyDetailsOfCopiedAutoClaim(DataTable table, Map<String, String> data) {

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (int i = 0; i < rows.size(); i++) {
            WebElement operatorName = driver.findElement(By.xpath("//div[text()='auto incidents']/ancestor::div[1]//following::table[" + (4 + i) + "]//td[1]/div"));
            WebElement source = driver.findElement(By.xpath("//div[text()='auto incidents']/ancestor::div[1]//following::table[" + (4 + i) + "]//td[2]/div"));
            WebElement violationType = driver.findElement(By.xpath("//div[text()='auto incidents']/ancestor::div[1]//following::table[" + (4 + i) + "]//td[3]/div"));
            WebElement dateOfViolation = driver.findElement(By.xpath("//div[text()='auto incidents']/ancestor::div[1]//following::table[" + (4 + i) + "]//td[4]/div"));

            Map<String, String> row = rows.get(i);

            if (hasValue(row.get("ratedDriver"))) {
                assertEquals(operatorName.getText(), row.get("ratedDriver"), "Operator");
            } else {
                assertEquals(operatorName.getText(), data.get("First_Name") + " " + data.get("Last_Name"), "Operator");;
            }

            assertEquals(source.getText(), row.get("Source"), "Source");
            assertEquals(violationType.getText(), row.get("ratedAccident"), "Violation Type");

            if (hasValue(row.get("accidentConvictionDate"))) {
                assertEquals(dateOfViolation.getText(), row.get("accidentConvictionDate"), "Date Of Violation");
            } else {
                assertEquals(dateOfViolation.getText(), data.get("Effective_Date"), "Date Of Violation");
            }
        }
    }


    public void verifyDetailsOfCopiedWatercraftClaim(DataTable table, Map<String, String> data) {

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (int i = 0; i < rows.size(); i++) {
            WebElement source = driver.findElement(By.xpath("//div[text()='watercraft loss history for prior vessels not listed on the quote (policy)']/ancestor::div[1]//following::table[" + (4 + i) + "]//td[1]/div"));
            WebElement lossType = driver.findElement(By.xpath("//div[text()='watercraft loss history for prior vessels not listed on the quote (policy)']/ancestor::div[1]//following::table[" + (4 + i) + "]//td[2]/div"));
            WebElement lossDate = driver.findElement(By.xpath("//div[text()='watercraft loss history for prior vessels not listed on the quote (policy)']/ancestor::div[1]//following::table[" + (4 + i) + "]//td[3]/div"));
            WebElement lossAmount = driver.findElement(By.xpath("//div[text()='watercraft loss history for prior vessels not listed on the quote (policy)']/ancestor::div[1]//following::table[" + (4 + i) + "]//td[4]/div"));

            Map<String, String> row = rows.get(i);

            assertEquals(source.getText(), row.get("Source"), "Source");
            assertEquals(lossType.getText(), row.get("lossType"), "Loss Type");

            if (hasValue(row.get("lossDate"))) {
                assertEquals(lossDate.getText(), row.get("lossDate"), "Loss Date");
            } else {
                assertEquals(lossDate.getText(), data.get("Effective_Date"), "Date Of Violation");
            }

            assertEquals(lossAmount.getText(), row.get("lossAmount"), "Loss Amount");
        }
    }

    public void setAutoIncidentSource(String value, int index) throws Throwable {
        WebElement source = driver.findElement(By.xpath("//div[text()='auto incidents']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[2]/div"));
        if (hasValue(value)) {
            clickFooter();
            clickElement(source, "Incident Source");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

    public void setAutoIncidentAccidentType(String value, int index) throws Throwable {
        WebElement AccidentType = driver.findElement(By.xpath("//div[text()='auto incidents']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[3]/div"));
        if (hasValue(value)) {
            clickElement(AccidentType, "Incident Accident or Violation Type");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

    public void setAutoIncidentLossDate(String value, int index) throws Throwable {
        WebElement lossDate = driver.findElement(By.xpath("//div[text()='auto incidents']/ancestor::div[1]//following::table[" + (4 + index) + "]//td[4]/div"));
        if (hasValue(value)) {
            clickElement(lossDate, "Incident Loss Date");
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
            pause(1000);
        }
    }

    public void setSelectedOperatorWithSheetData(Map<String, String> data) {
        typeTextEnter(selectOperatorField, data.get("First_Name") + " " + data.get("Last_Name"), "Select Operator");
    }

}