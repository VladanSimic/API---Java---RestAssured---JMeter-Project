package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class OperatorsObtainedFromActiveHouseholdsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public OperatorsObtainedFromActiveHouseholdsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'include')]")
    WebElement includeBtn;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[1]/div")
    List<WebElement> markOperatorToBeIncluded;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[2]/div")
    List<WebElement> driverPrefix;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[3]/div")
    List<WebElement> driverFirstName;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[4]/div")
    List<WebElement> driverMiddleName;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[5]/div")
    List<WebElement> driverLastName;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[6]/div")
    List<WebElement> driverSuffix;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[7]/div")
    List<WebElement> driverDateOfBirth;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[8]/div")
    List<WebElement> driverExclude;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[9]/div")
    List<WebElement> driverStatus;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[10]/div")
    List<WebElement> driverGender;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[11]/div")
    List<WebElement> driverLicenseState;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[12]/div")
    List<WebElement> driverLicenseNumber;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[13]/div")
    List<WebElement> driverRelationshipToInsured;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[14]/div")
    List<WebElement> driverFromQuoteName;
    @FindBy(xpath = "//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[15]/div")
    List<WebElement> driverFromPolicyNumber;


    public void verifyDriverSuffix(String s, int i) {
        if (hasValue(driverSuffix.get(i).getText()) && !driverSuffix.get(i).getText().equalsIgnoreCase(" ")) {
            assertEquals(driverSuffix.get(i).getText(), s, "Driver Suffix");
        }
        else infoLog("Driver Suffix is empty");
    }

    public void verifyDriverFirstName(String s, int i) {
        assertEquals(driverFirstName.get(i).getText(), s, "Driver First Name");
    }
    public void verifyDriverLastName(String s, int i) {
        assertEquals(driverLastName.get(i).getText(), s, "Driver Last Name");
    }

    public void verifyDriverPrefix(String s, int i) {
        if (hasValue(driverPrefix.get(i).getText()) && (!driverPrefix.get(i).getText().equalsIgnoreCase(" ")
                                                         || !driverPrefix.get(i).getText().equalsIgnoreCase(""))) {

            assertEquals(driverPrefix.get(i).getText(), s, "Driver Prefix");
        }
        else infoLog("Driver Prefix is Empty");
    }

    public void verifyDriverMiddleName(String s, int i) {
        if (hasValue(driverMiddleName.get(i).getText()) && (!driverMiddleName.get(i).getText().equalsIgnoreCase(" ")
                                                             || !driverMiddleName.get(i).getText().equalsIgnoreCase(""))) {

            assertEquals(driverMiddleName.get(i).getText(), s, "Driver Middle Name");
        }
        else infoLog("Driver Middle Name is Empty");
    }

    public void verifyDriverDateOfBirth(String s, int i) {
        assertEquals(driverDateOfBirth.get(i).getText(), s, "Driver Date of Birth");
    }

    public void verifyDriverGender(String s, int i) {
        if (hasValue(driverGender.get(i).getText()) && (!driverGender.get(i).getText().equalsIgnoreCase(" ")
                                                         || !driverGender.get(i).getText().equalsIgnoreCase(""))) {

            assertEquals(driverGender.get(i).getText(), s, "Driver Gender");
        }
        else infoLog("Driver Gender is empty");
    }

    public void verifyDriverLicenseState(String s, int i) {
        if (hasValue(driverLicenseState.get(i).getText()) && (!driverLicenseState.get(i).getText().equalsIgnoreCase(" ")
                                                               || !driverLicenseState.get(i).getText().equalsIgnoreCase(""))) {

            assertEquals(driverLicenseState.get(i).getText(), s, "Driver License State");
        }
        else infoLog("Driver License State is empty");
    }

    public void verifyDriverLicenseNumber(String s, int i) {
        if (hasValue(driverLicenseNumber.get(i).getText()) && (!driverLicenseNumber.get(i).getText().equalsIgnoreCase(" ")
                                                                || !driverLicenseNumber.get(i).getText().equalsIgnoreCase(""))) {

            assertEquals(driverLicenseNumber.get(i).getText(), s, "Driver License Number");
        }
        else infoLog("Driver License Number is empty");
    }

    public void verifyDriverRelationshipToInsured(String s, int i) {
        if (hasValue(driverRelationshipToInsured.get(i).getText()) && (!driverRelationshipToInsured.get(i).getText().equalsIgnoreCase(" ")
                                                                        || !driverRelationshipToInsured.get(i).getText().equalsIgnoreCase(""))) {

            assertEquals(driverRelationshipToInsured.get(i).getText(), s, "Driver Relationship to Insured");
        }
        else infoLog("Driver relationship to insured is empty");
    }
    public void verifyDriverExcluded(String s, int i) {
        if (hasValue(driverExclude.get(i).getText()) && (!driverExclude.get(i).getText().equalsIgnoreCase(" ")
                                                          || !driverExclude.get(i).getText().equalsIgnoreCase(""))) {

            assertEquals(driverExclude.get(i).getText(), s, "Driver Excluded");
        }
        else infoLog("Driver Excluded is empty");
    }

    public void verifyDriverStatus(String s, int i) {
        if (!s.equalsIgnoreCase("Not in Household") &&
                !s.equalsIgnoreCase("Deceased") &&
                !s.equalsIgnoreCase("Duplicate") &&
                !s.equalsIgnoreCase("Driver Unknown") &&
                !s.equalsIgnoreCase("LLC/Trust/Corp")) {
            assertEquals(driverStatus.get(i).getText(), s, "Driver Status");
        }
    }

    public void verifyDriverFromQuote(String s, int i) {
        if (hasValue(driverFromQuoteName.get(i).getText()) && (!driverFromQuoteName.get(i).getText().equalsIgnoreCase(" ")
                                                                || !driverFromQuoteName.get(i).getText().equalsIgnoreCase(""))) {

            assertEquals(driverFromQuoteName.get(i).getText(), s, "Driver Quote");
        }
        else infoLog("Driver Quote name is empty");
    }

    public void verifyDriverFromPolicy(String s, int i) {
        if (hasValue(driverFromPolicyNumber.get(i).getText()) && (!driverFromPolicyNumber.get(i).getText().equalsIgnoreCase(" ")
                                                                  || !driverFromPolicyNumber.get(i).getText().equalsIgnoreCase(""))) {
            assertEquals(driverFromPolicyNumber.get(i).getText(), s, "Driver Policy");
        }
        else infoLog("Driver Policy is Empty");
    }

    public void verifyIfThereAreAnyOperatorsPresentInBlock() {
        if(markOperatorToBeIncluded.size() == 0) {
            failAssertion("No operators present in the block");
        }
    }

    public void verifyOperatorDetailsInNewBlockFromPAENDonPA(Map<String, String> data) {
        verifyIfThereAreAnyOperatorsPresentInBlock();

        for (int i = 0; i < markOperatorToBeIncluded.size(); i++) {

            verifyDriverPrefix(data.get("Additional_Operators_Additional_Driver_Prefix_END_" + (i + 1)), i);
            verifyDriverFirstName(data.get("Additional_Operators_Additional_Driver_First_Name_END_" + (i + 1)), i);
            verifyDriverMiddleName(data.get("Additional_Operators_Additional_Driver_MI_END_" + (i + 1)), i);
            verifyDriverLastName(data.get("Additional_Operators_Additional_Driver_Last_Name_END_" + (i + 1)), i);
            verifyDriverSuffix(data.get("Additional_Operators_Additional_Driver_Suffix_END_" + (i + 1)), i);
            verifyDriverDateOfBirth(data.get("Additional_Operators_Additional_Driver_Date_Of_Birth_END_" + (i + 1)), i);
            verifyDriverExcluded(data.get("Additional_Operators_Additional_Driver_Exclude_END_" + (i + 1)), i);
            verifyDriverStatus(data.get("Additional_Operators_Additional_Driver_Driver_Status_END_" + (i + 1)), i);
            verifyDriverGender(data.get("Additional_Operators_Additional_Driver_Gender_END_" + (i + 1)), i);
            verifyDriverLicenseState(data.get("Additional_Operators_Additional_Driver_License_State_END_" + (i + 1)), i);
            verifyDriverLicenseNumber(data.get("Additional_Operators_Additional_Driver_License_Number_END_" + (i + 1)), i);
            verifyDriverRelationshipToInsured(data.get("Additional_Operators_Additional_Driver_Relationship_To_Insured_END_" + (i + 1)), i);
            verifyDriverFromPolicy(data.get("Policy_ID"), i);
        }
    }

    public void markOperatorToBeIncludedByIndexAndInclude(int index) throws InterruptedException {
        scrollToWebElement(includeBtn);
        clickElement(markOperatorToBeIncluded.get(index), "Clicked Operator checkbox to be included");
        clickElement(includeBtn, "Clicked Include button");
        pause(2000);
    }

    public void verifyOperatorDetailsInNewBlockFromPAENDonPW(Map<String, String> data) {
        verifyIfThereAreAnyOperatorsPresentInBlock();

        List<WebElement> operatorFirstName = driver.findElements(By.xpath("//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[2]/div"));
        List<WebElement> operatorLastName  = driver.findElements(By.xpath("//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[3]/div"));
        List<WebElement> operatorDateOfBirth = driver.findElements(By.xpath("//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[4]/div"));
        List<WebElement> operatorRelationshipToInsured = driver.findElements(By.xpath("//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[5]/div"));
        List<WebElement> operatorQuoteName = driver.findElements(By.xpath("//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[6]/div"));
        List<WebElement> policyId = driver.findElements(By.xpath("//div//t[text()='Operators obtained from active household quotes and policies']/../../../../../../../..//table//td[7]/div"));

        for (int i = 0; i < markOperatorToBeIncluded.size(); i++) {
            assertEquals(operatorFirstName.get(i).getText(), data.get("Additional_Operators_Additional_Driver_First_Name_END_" + (i + 1)), "Operator First Name");
            assertEquals(operatorLastName.get(i).getText(), data.get("Additional_Operators_Additional_Driver_Last_Name_END_" + (i + 1)), "Operator Last Name");
            assertEquals(operatorDateOfBirth.get(i).getText(), data.get("Additional_Operators_Additional_Driver_Date_Of_Birth_END_" + (i + 1)), "Operator Date of Birth");
            assertEquals(operatorRelationshipToInsured.get(i).getText(), data.get("Additional_Operators_Additional_Driver_Relationship_To_Insured_END_" + (i + 1)), "Operator Relationship to Insured");
            assertEquals(policyId.get(i).getText(), data.get("Policy_ID"), "Operator Policy");
        }
    }

    public void verifyOperatorDetailsFromENDTrx(String LOB, Map<String, String> data) {
        switch (LOB) {
            case "PA":
                verifyOperatorDetailsInNewBlockFromPAENDonPA(data);
                break;
            case "PW":
                verifyOperatorDetailsInNewBlockFromPAENDonPW(data);
                break;
        }
    }

}
