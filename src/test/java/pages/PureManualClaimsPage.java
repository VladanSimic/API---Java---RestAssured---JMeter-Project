package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class PureManualClaimsPage extends CommonComponentsAndActions {

    WebDriver driver;

    public PureManualClaimsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='pure claims']")
    WebElement pureClaimsBtn;
    @FindBy(xpath = "//div[text()='Vehicle Type']/../../../..//div[2]")
    WebElement vehicleType;
    @FindBy(xpath = "//div[text()='Vehicle Type']/../../../..//input")
    WebElement vehicleTypeFieldInput;
    @FindBy(xpath = "//div[text()='Vehicle Type']")
    WebElement vehicleTypeField;
    @FindBy(xpath = "//div[text()='Rated Driver']")
    WebElement ratedDriverField;
    @FindBy(xpath = "//div[text()='Rated Accident or Violation (within last 5 years)']")
    WebElement ratedAccidentField;
    @FindBy(xpath = "//div[text()='Rated Accident or Violation (within last 5 years)']/../../../..//input")
    WebElement ratedaccidentFieldInput;
    @FindBy(xpath = "//div[text()='Claim Operator']")
    WebElement claimOperatorField;
    @FindBy(xpath = "//div[text()='Claim Loss Cause']")
    WebElement claimLossCauseField;
    @FindBy(xpath = "//div[text()='Rated Driver']/../../../..//input")
    WebElement ratedDriverInputField;
    @FindBy(xpath = "//div[text()='Accident Conviction Dt']/../../../..//input")
    WebElement accidentConvictionInputField;
    @FindBy(xpath = "//div[text()='Description']/../../../..//textarea")
    WebElement descriptionField;
    @FindBy(xpath = "//div[text()='Claim Closed?']/../../../..//label[text()='No']/..//input")
    WebElement claimClosedNoBtn;
    @FindBy(xpath = "//div[text()='Claim Closed?']/../../../..//label[text()='Yes']/..//input")
    WebElement claimClosedYesBtn;
    @FindBy(xpath = "//div[text()='Subro?']/../../../..//label[text()='No']/..//input")
    WebElement subroNoBtn;
    @FindBy(xpath = "//div[text()='Subro?']/../../../..//label[text()='Yes']/..//input")
    WebElement subroYesBtn;
    @FindBy(xpath = "//div[text()='Any claims/losses with PURE Programs for this Customer?']/../../../..//label[text()='No']/..//input")
    WebElement prevLossesNoBtn;
    @FindBy(xpath = "//div[contains(text(),'Any claims/losses with PURE')]/../../../..//label[text()='Yes']/..//input")
    WebElement prevLossesYesBtn;
    @FindBy(xpath = "//div[text()='Copied Flag']/../../../..//label[text()='Yes']/..//input")
    WebElement copiedFlagYesBtn;
    @FindBy(xpath = "//div[text()='Copied Flag']/../../../..//label[text()='No']/..//input")
    WebElement copiedFlagNoBtn;
    @FindBy(xpath = "//span[text()='save']")
    WebElement saveBtn;
    @FindBy(xpath = "//div[text()='Vehicle Involved']/../../../..//input")
    WebElement vehicleInvolvedInputField;
    @FindBy(xpath = "//div[contains(text(),'Loss Type')]/../../../..//input")
    WebElement lossTypeInputField;
    @FindBy(xpath = "//div[text()='State']/../../../..//input")
    WebElement stateInputField;
    @FindBy(xpath = "//div[text()='Related Location']/../../../..//input")
    WebElement relatedLocationInputField;
    @FindBy(xpath = "//div[text()='Claim Number']/../../../..//input")
    WebElement claimNumInputField;
    @FindBy(xpath = "//span[text()='Claim Number']")
    WebElement claimNumColumn;
    @FindBy(xpath = "//div[text()='Total Amount Paid']/../../../..//input")
    WebElement totalAmountPaidInputField;
    @FindBy(xpath = "//div[text()='Indemnity Paid']/../../../..//input")
    WebElement indemnityPaidInputField;
    @FindBy(xpath = "//div[text()='Claim Operator Fault']/../../../..//input")
    WebElement claimOperatorFaultInputField;
    @FindBy(xpath = "//div[text()='Claim Loss Cause']/../../../..//input")
    WebElement claimLossCauseInputField;
    @FindBy(xpath = "//div[text()='Claim Operator']/../../../..//input")
    WebElement claimOperatorInputField;
    @FindBy(xpath = "//div[text()='Related Vessel']/../../../..//input")
    WebElement relatedVesselInputField;
    @FindBy(xpath = "//div[text()='Expense Paid']/../../../..//input")
    WebElement expensePaidInputField;
    @FindBy(xpath = "//div[contains(text(),'Loss Date')]/../../../..//input")
    WebElement lossDateInputField;
    @FindBy(xpath = "//div[text()='Class']/../../../..//input")
    WebElement classInputField;
    @FindBy(xpath = "//div[text()='LPB Taken Up?']/../../../..//label[text()='Yes']/..//input")
    WebElement lpbTakenUpYesBtn;
    @FindBy(xpath = "//div[text()='LPB Taken Up?']/../../../..//label[text()='No']/..//input")
    WebElement lpbTakenUpNoBtn;
    @FindBy(xpath = "(//span[text()='add'])[2]")
    WebElement wcAutoClaimAddBtn;


    public void clickOnPureClaims() {
        clickElement(pureClaimsBtn, "Pure Claims tab");
    }


    public void clickVehicleTypeBtn() {
        clickElement(vehicleType, "Vehicle Type field");
    }

    public void isElementVisible(WebElement element) {
        if (!isElementDisplayed(element)) {
            failAssertion(element + " Is not Displayed");
        } else successLog(element + " Is Displayed");
    }

    public void isElementNotVisible(WebElement element) {
        if (isElementDisplayed(element)) {
            failAssertion(element + " Is Displayed");
        } else successLog(element + " Is Not Displayed");
    }

    public void isVehicleTypeDisplayed() {
        isElementVisible(vehicleTypeField);
    }

    public void isPureClaimsTabVisible() {
        isElementNotVisible(pureClaimsBtn);
    }

    public void isRatedDriverVisible() {
        isElementVisible(ratedDriverField);
    }

    public void isRatedAccidentVisible() {
        isElementVisible(ratedAccidentField);
    }

    public void isClaimOperatorVisible() {
        isElementVisible(claimOperatorField);
    }

    public void isVehicleTypeMandatory(String mandatoryYesOrNo) {
        checkIsElementMandatory(vehicleTypeFieldInput, mandatoryYesOrNo);
    }

    public void fillOutManualClaimInfo(String LOB, Map<String, String> data, DataTable table) throws Throwable {
        Map<String, String> tableMap = table.asMap(String.class, String.class);

        if (LOB.equalsIgnoreCase("EX") || LOB.equalsIgnoreCase("PA") || LOB.equalsIgnoreCase("ES")) {
            clickAddBtn();
            setAccidentConvictionDate(tableMap.get("accidentConvictiondate"));
            setRatedAccidentField(tableMap.get("ratedAccident"));
            if (!hasValue(tableMap.get("ratedDriver"))) {
                setRatedDriver(data.get("First_Name") + " " + data.get("Last_Name"));
            } else {
                setRatedDriver(tableMap.get("ratedDriver"));
            }
            setDescription(tableMap.get("description"));
            clickClaimNoBtn();
            clickSaveBtn();

        } else if (LOB.equalsIgnoreCase("HO") || LOB.equalsIgnoreCase("HS") || LOB.equalsIgnoreCase("CC")) {
            clickPrevLossesYesBtn();
            clickAddBtn();
            if (!hasValue(tableMap.get("lossDate"))) {
                setLossDate(data.get("Effective_Date"));
            } else {
                setLossDate(tableMap.get("lossDate"));
            }
            setLossType(tableMap.get("lossType"));
            setRelatedLocationWithSheetData(data);
            setDescription(tableMap.get("description"));
            clickClaimNoBtn();
            clickSaveBtn();

        } else if (LOB.equalsIgnoreCase("DW")) {
            clickPrevLossesYesBtn();
            clickAddBtn();
            if (!hasValue(tableMap.get("lossDate"))) {
                setLossDate(data.get("Effective_Date"));
            } else {
                setLossDate(tableMap.get("lossDate"));
            }
            setLossType(tableMap.get("lossDWType"));
            setRelatedLocationWithSheetData(data);
            setStateWithSheetData(data);
            setClaimNumber();
            clickClaimNoBtn();
            clickSaveBtn();

        } else if (LOB.equalsIgnoreCase("PW")) {
            clickPrevLossesYesBtn();
            clickAddBtn();
            if (!hasValue(tableMap.get("lossDate"))) {
                setLossDate(data.get("Effective_Date"));
            } else {
                setLossDate(tableMap.get("lossDate"));
            }
            setLossType(tableMap.get("lossWCType"));
            setClaimNumber();
            clickClaimNoBtn();
            clickSaveBtn();

        } else if (LOB.equalsIgnoreCase("CO")) {
            clickPrevLossesYesBtn();
            clickAddBtn();
            if (!hasValue(tableMap.get("lossDate"))) {
                setLossDate(data.get("Effective_Date"));
            } else {
                setLossDate(tableMap.get("lossDate"));
            }
            setLossType(tableMap.get("lossCOType"));
            setClass(tableMap.get("classType"));
            setRelatedLocationWithSheetData(data);
            clickClaimNoBtn();
            clickSaveBtn();
        }
    }

    public void fillOutMultipleManualClaims(String LOB, Map<String, String> data, DataTable table) throws Throwable {
        switch (LOB) {
            case "HO":
            case "HS":
            case "CC":
            case "DW":
            case "CO":
                fillOutMultipleManualClaimsForHO(LOB, data, table);
                break;

            case "PA":
                fillOutMultipleManualClaimsForPA(data, table);
                break;
            case "ES":
            case "EX":
                fillOutMultipleManualClaimsForEXES(data, table);
                break;

            case "PW":
                fillOutMultipleManualClaimsForPW(data, table);
                break;
        }
    }

    public void fillOutMultipleManualClaimsForPA(Map<String, String> data, DataTable table) throws Throwable {

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (int i = 0; i < rows.size(); i++) {
            clickAddBtn();

            Map<String, String> row = rows.get(i);
            String accidentConvictionDate = row.get("accidentConvictionDate");
            String ratedAccident = row.get("ratedAccident");
            String ratedDriver = row.get("ratedDriver");
            String description = row.get("description");
            String claimClosedYesOrNo = row.get("claimClosed?");
            String subroYesOrNo = row.get("subroYesNo?");
            String totalAmountPaid = row.get("totalAmountPaid");
            String indemnityPaid = row.get("indemnityPaid");
            String expensePaid = row.get("expensePaid");
            String relationToVehicleOwner = row.get("relationToVehicleOwner");
            String vehicleType = row.get("vehicleType");
            String atFaultOrNot = row.get("atFaultOrNot");
            String claimLossCause = row.get("claimLossCause");
            String claimOperator = row.get("claimOperator");

            WebElement relationToVehicleOwnerField = driver.findElement(By.xpath("(//div[text()='Relation to Vehicle Owner']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(relationToVehicleOwnerField, relationToVehicleOwner, "Relation to Vehicle Owner");
            clickFooter();
            pause(1000);

            WebElement dateField = driver.findElement(By.xpath("(//div[text()='Accident Conviction Dt']/../../../..//input)[" + (i+1) + "]"));
            if (hasValue(accidentConvictionDate)) {
                typeTextEnter(dateField, accidentConvictionDate, "Accident Conviction Date");
            } else {
                typeTextEnter(dateField, data.get("Effective_Date"), "Accident Conviction Date");
            }
            clickFooter();
            pause(2000);

            WebElement accidentField = driver.findElement(By.xpath("(//div[text()='Rated Accident or Violation (within last 5 years)']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(accidentField, ratedAccident, "Rated Accident");
            clickFooter();
            pause(2000);

            WebElement driverField = driver.findElement(By.xpath("(//div[text()='Rated Driver']/../../../..//input)[" + (i+1) + "]"));
            if (hasValue(ratedDriver)) {
                typeTextEnter(driverField, ratedDriver, "Rated Driver");
            } else {
                typeTextEnter(driverField, data.get("First_Name") + " " + data.get("Last_Name"), "Rated Driver");
            }
            clickFooter();

            WebElement vehicleTypeField = driver.findElement(By.xpath("(//div[text()='Vehicle Type']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(vehicleTypeField, vehicleType, "Vehicle Type");
            clickFooter();
            pause(1000);

            WebElement claimOperatorFaultField = driver.findElement(By.xpath("(//div[text()='Claim Operator Fault']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(claimOperatorFaultField, atFaultOrNot, "Claim Operator Fault");
            clickFooter();
            pause(1000);

            WebElement claimLossCauseField = driver.findElement(By.xpath("(//div[text()='Claim Loss Cause']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(claimLossCauseField, claimLossCause, "Claim Loss Cause");
            clickFooter();
            pause(1000);

            WebElement claimOperatorField = driver.findElement(By.xpath("(//div[text()='Claim Operator']/../../../..//input)[" + (i+1) + "]"));
            if (hasValue(claimOperator)) {
                typeTextEnter(claimOperatorField, claimOperator, "Claim Operator");
            } else {
                typeTextEnter(claimOperatorField, data.get("First_Name") + " " + data.get("Last_Name"), "Rated Driver");
            }
            clickFooter();
            pause(1000);

            WebElement descriptionField = driver.findElement(By.xpath("(//div[text()='Description']/../../../..//textarea)[" + (i+1) + "]"));
            typeTextEnter(descriptionField, description, "Description");
            clickFooter();

            WebElement totalAmountPaidField = driver.findElement(By.xpath("(//div[text()='Total Amount Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(totalAmountPaidField, totalAmountPaid, "Total Amount Paid");
            clickFooter();

            WebElement indemnityPaidField = driver.findElement(By.xpath("(//div[text()='Indemnity Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(indemnityPaidField, indemnityPaid, "Indemnity Paid");
            clickFooter();

            WebElement expensePaidField = driver.findElement(By.xpath("(//div[text()='Expense Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(expensePaidField, expensePaid, "Expense Paid");
            clickFooter();

            clickClaimClosedYesOrNo(claimClosedYesOrNo, i);
            clickSubroYesOrNo(subroYesOrNo, i);

            clickSaveBtn();
        }

        pause(500);
    }

    public void fillOutMultipleManualClaimsForEXES(Map<String, String> data, DataTable table) throws Throwable {

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (int i = 0; i < rows.size(); i++) {
            clickAddBtn();

            Map<String, String> row = rows.get(i);
            String accidentConvictionDate = row.get("accidentConvictionDate");
            String ratedAccident = row.get("ratedAccident");
            String ratedDriver = row.get("ratedDriver");
            String description = row.get("description");
            String claimClosedYesOrNo = row.get("claimClosed?");
            String subroYesOrNo = row.get("subroYesNo?");
            String totalAmountPaid = row.get("totalAmountPaid");
            String indemnityPaid = row.get("indemnityPaid");
            String expensePaid = row.get("expensePaid");
            String atFaultOrNot = row.get("atFaultOrNot");
            String claimLossCause = row.get("claimLossCause");
            String claimOperator = row.get("claimOperator");

            WebElement dateField = driver.findElement(By.xpath("(//div[text()='Accident Conviction Dt']/../../../..//input)[" + (i+1) + "]"));
            if (hasValue(accidentConvictionDate)) {
                typeTextEnter(dateField, accidentConvictionDate, "Accident Conviction Date");
            } else {
                typeTextEnter(dateField, data.get("Effective_Date"), "Accident Conviction Date");
            }
            clickFooter();
            pause(500);

            WebElement accidentField = driver.findElement(By.xpath("(//div[text()='Rated Accident or Violation (within last 5 years)']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(accidentField, ratedAccident, "Rated Accident");
            clickFooter();
            pause(1000);

            WebElement driverField = driver.findElement(By.xpath("(//div[text()='Rated Driver']/../../../..//input)[" + (i+1) + "]"));
            if (hasValue(ratedDriver)) {
                typeTextEnter(driverField, ratedDriver, "Rated Driver");
            } else {
                typeTextEnter(driverField, data.get("First_Name"), "Rated Driver");
            }
            clickFooter();


            WebElement claimOperatorFaultField = driver.findElement(By.xpath("(//div[text()='Claim Operator Fault']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(claimOperatorFaultField, atFaultOrNot, "Claim Operator Fault");
            clickFooter();
            pause(1000);

            WebElement claimLossCauseField = driver.findElement(By.xpath("(//div[text()='Claim Loss Cause']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(claimLossCauseField, claimLossCause, "Claim Loss Cause");
            clickFooter();
            pause(1000);

            WebElement claimOperatorField = driver.findElement(By.xpath("(//div[text()='Claim Operator']/../../../..//input)[" + (i+1) + "]"));
            if (hasValue(claimOperator)) {
                typeTextEnter(claimOperatorField, claimOperator, "Claim Operator");
            } else {
                typeTextEnter(claimOperatorField, data.get("First_Name") + " " + data.get("Last_Name"), "Claim Operator");
            }
            clickFooter();
            pause(1000);

            WebElement descriptionField = driver.findElement(By.xpath("(//div[text()='Description']/../../../..//textarea)[" + (i+1) + "]"));
            typeTextEnter(descriptionField, description, "Description");
            clickFooter();

            WebElement totalAmountPaidField = driver.findElement(By.xpath("(//div[text()='Total Amount Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(totalAmountPaidField, totalAmountPaid, "Total Amount Paid");
            clickFooter();

            WebElement indemnityPaidField = driver.findElement(By.xpath("(//div[text()='Indemnity Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(indemnityPaidField, indemnityPaid, "Indemnity Paid");
            clickFooter();

            WebElement expensePaidField = driver.findElement(By.xpath("(//div[text()='Expense Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(expensePaidField, expensePaid, "Expense Paid");
            clickFooter();

            clickClaimClosedYesOrNo(claimClosedYesOrNo, i);
            clickSubroYesOrNo(subroYesOrNo, i);

            clickSaveBtn();
        }

        pause(10000);
    }

    public void fillOutMultipleManualClaimsForHO(String LOB, Map<String, String> data, DataTable table) throws Throwable {
        clickPrevLossesYesBtn();

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (int i = 0; i < rows.size(); i++) {
            clickAddBtn();

            Map<String, String> row = rows.get(i);
            String lossDate = row.get("lossDate");
            String lossType = row.get("lossType");
            String relatedLocation = row.get("relatedLocation");
            String description = row.get("description");
            String claimClosedYesOrNo = row.get("claimClosed?");
            String subroYesOrNo = row.get("subroYesNo?");
            String totalAmountPaid = row.get("totalAmountPaid");
            String indemnityPaid = row.get("indemnityPaid");
            String expensePaid = row.get("expensePaid");

            if (LOB.equalsIgnoreCase("DW")) {
                String state = row.get("state");
                String claimNumber = row.get("claimNumber");

                WebElement stateField = driver.findElement(By.xpath("(//div[text()='State']/../../../..//input)[" + (i+1) + "]"));
                typeTextEnter(stateField, state, "State");

                WebElement claimNumberField = driver.findElement(By.xpath("(//div[text()='Claim Number']/../../../..//input)[" + (i+1) + "]"));
                typeTextEnter(claimNumberField, claimNumber, "Claim Number");
                clickFooter();
            }

            if (LOB.equalsIgnoreCase("CO")) {
                String classElement = row.get("class");

                WebElement classField = driver.findElement(By.xpath("(//div[text()='Class']/../../../..//input)[" + (i+1) + "]"));
                typeTextEnter(classField, classElement, "Class");
                clickFooter();
                pause(1000);
            }

            WebElement dateField = driver.findElement(By.xpath("(//div[text()='Loss Date']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(dateField, lossDate, "Loss Date");
            clickFooter();
            pause(2000);

            WebElement lossTypeField = driver.findElement(By.xpath("(//div[text()='Loss Type']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(lossTypeField, lossType, "Loss Type");
            clickFooter();
            pause(2000);

            WebElement relatedLocationField = driver.findElement(By.xpath("(//div[text()='Related Location']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(relatedLocationField, relatedLocation, "Related Location");
            clickFooter();
            pause(2000);

            WebElement descriptionField = driver.findElement(By.xpath("(//div[text()='Description']/../../../..//textarea)[" + (i+1) + "]"));
            typeTextEnter(descriptionField, description, "Description");
            clickFooter();

            WebElement totalAmountPaidField = driver.findElement(By.xpath("(//div[text()='Total Amount Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(totalAmountPaidField, totalAmountPaid, "Total Amount Paid");
            clickFooter();

            WebElement indemnityPaidField = driver.findElement(By.xpath("(//div[text()='Indemnity Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(indemnityPaidField, indemnityPaid, "Indemnity Paid");
            clickFooter();

            WebElement expensePaidField = driver.findElement(By.xpath("(//div[text()=' Expense Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(expensePaidField, expensePaid, "Expense Paid");
            clickFooter();

            clickClaimClosedYesOrNo(claimClosedYesOrNo, i);
            clickSubroYesOrNo(subroYesOrNo, i);

            clickSaveBtn();
        }

    }

    public void fillOutMultipleManualClaimsForPW(Map<String, String> data, DataTable table) throws Throwable {
        clickPrevLossesYesBtn();

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (int i = 0; i < rows.size(); i++) {
            clickAddBtn();

            Map<String, String> row = rows.get(i);
            String lossDate = row.get("lossDate");
            String lossType = row.get("lossType");
            String relatedVessel = row.get("RelatedVessel");
            String description = row.get("description");
            String claimClosedYesOrNo = row.get("claimClosed?");
            String subroYesOrNo = row.get("subroYesNo?");
            String totalAmountPaid = row.get("totalAmountPaid");
            String indemnityPaid = row.get("indemnityPaid");
            String expensePaid = row.get("expensePaid");
            String claimNumber = row.get("claimNumber");

            WebElement dateField = driver.findElement(By.xpath("(//div[contains(text(),'Loss Date')]/../../../..//input)[" + (i+1) + "]"));
            if (hasValue(lossDate)) {
                typeTextEnter(dateField, lossDate, "Loss Date");
            } else {
                typeTextEnter(dateField, data.get("Effective_Date"), "Loss Date");
            }
            clickFooter();
            pause(2000);

            WebElement lossTypeField = driver.findElement(By.xpath("(//div[contains(text(),'Loss Type')]/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(lossTypeField, lossType, "Loss Type");
            clickFooter();
            pause(2000);

            WebElement relatedVesselField = driver.findElement(By.xpath("(//div[text()='Related Vessel']/../../../..//input)[" + (i+1) + "]"));
            if (hasValue(relatedVessel)) {
                typeTextEnter(relatedVesselField, relatedVessel, "Related Vessel");
            } else {
                typeTextEnter(relatedVesselField, data.get("Year"), "Related Vessel");
            }
            clickFooter();
            pause(2000);

            WebElement descriptionField = driver.findElement(By.xpath("(//div[text()='Description']/../../../..//textarea)[" + (i+1) + "]"));
            typeTextEnter(descriptionField, description, "Description");
            clickFooter();

            WebElement totalAmountPaidField = driver.findElement(By.xpath("(//div[text()='Total Amount Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(totalAmountPaidField, totalAmountPaid, "Total Amount Paid");
            clickFooter();

            WebElement indemnityPaidField = driver.findElement(By.xpath("(//div[text()='Indemnity Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(indemnityPaidField, indemnityPaid, "Indemnity Paid");
            clickFooter();

            WebElement expensePaidField = driver.findElement(By.xpath("(//div[text()='Expense Paid']/../../../..//input)[" + (i+1) + "]"));
            typeTextEnter(expensePaidField, expensePaid, "Expense Paid");
            clickFooter();

            WebElement claimNumberField = driver.findElement(By.xpath("(//div[text()='Claim Number']/../../../..//input)[" + (i+1) + "]"));
            if (hasValue(claimNumber)) {
                typeTextEnter(claimNumberField, claimNumber, "Claim Number");
            } else {
                setClaimNumber();
            }
            clickFooter();

            clickClaimClosedYesOrNo(claimClosedYesOrNo, i);
            clickSubroYesOrNo(subroYesOrNo, i);

            clickSaveBtn();
        }

    }

    public void isVehicleInvolvedMandatory(String mandatoryYesOrNo) {
        checkIsElementMandatory(vehicleInvolvedInputField, mandatoryYesOrNo);
    }

    public void setAccidentConvictionDate(String text) throws Throwable {
        typeTextEnter(accidentConvictionInputField, text, "Accident Convition Dt");
    }

    public void setRatedAccidentField(String text) throws Throwable {
        typeTextEnter(ratedaccidentFieldInput, text, "Rated Accident Field");
    }

    public void setRatedDriver(String text) throws Throwable {
        typeTextEnter(ratedDriverInputField, text, "Rated Driver");
    }

    public void setDescription(String text) throws Throwable {
        typeText(descriptionField, text);
    }

    public void clickClaimNoBtn() throws Throwable {
        clickElement(claimClosedNoBtn);
    }

    public void clickClaimYesBtn() throws Throwable {
        clickElement(claimClosedYesBtn);
    }

    public void clickClaimClosedYesOrNo(String text) throws Throwable {
        if (text.equalsIgnoreCase("Yes")) {
            clickClaimYesBtn();
        } else if (text.equalsIgnoreCase("No")) {
            clickClaimNoBtn();
        }
    }

    public void clickSubroYesOrNo(String text) throws Throwable {
        if (text.equalsIgnoreCase("Yes")) {
            clickSubroYes();
        } else if (text.equalsIgnoreCase("No")) {
            clickSubroNo();
        }
    }

    public void clickClaimClosedYesOrNo(String text, int index) throws Throwable {
        if (text.equalsIgnoreCase("Yes")) {
            clickElement(driver.findElement(By.xpath("(//div[text()='Claim Closed?']/../../../..//label[text()='Yes']/..//input)[" + (index + 1) + "]")));
        } else if (text.equalsIgnoreCase("No")) {
            clickElement(driver.findElement(By.xpath("(//div[text()='Claim Closed?']/../../../..//label[text()='No']/..//input)[" + (index + 1) + "]")));
        }
    }

    public void clickSubroYesOrNo(String text, int index) throws Throwable {
        if (text.equalsIgnoreCase("Yes")) {
            clickElement(driver.findElement(By.xpath("(//div[text()='Subro?']/../../../..//label[text()='Yes']/..//input)[" + (index + 1) + "]")));
        } else if (text.equalsIgnoreCase("No")) {
            clickElement(driver.findElement(By.xpath("(//div[text()='Subro?']/../../../..//label[text()='No']/..//input)[" + (index + 1) + "]")));
        }
    }

    public void clickCopiedFlagYesOrNo(String text, int index) throws Throwable {
        if (text.equalsIgnoreCase("Yes")) {
            clickElement(driver.findElement(By.xpath("(//div[text()='Copied Flag']/../../../..//label[text()='Yes']/..//input)[" + (index + 1) + "]")));
        } else if (text.equalsIgnoreCase("No")) {
            clickElement(driver.findElement(By.xpath("(//div[text()='Copied Flag']/../../../..//label[text()='No']/..//input)[" + (index + 1) + "]")));
        }
    }

    public void clickCopiedFlagYesOrNo(String text) throws Throwable {

        if (text.equalsIgnoreCase("Yes")) {
            clickCopiedFlagYes();
        } else if (text.equalsIgnoreCase("No")) {
            clickCopiedFlagNo();
        }
    }

    public void clickCopiedFlagYes() throws Throwable {
        clickElement(copiedFlagYesBtn);
    }

    public void clickCopiedFlagNo() throws Throwable {
        clickElement(copiedFlagNoBtn);
    }

    public void clickPrevLossesYesBtn() throws Throwable {
        clickElement(prevLossesYesBtn);
    }

    public void clickSaveBtn() throws Throwable {
        clickElement(saveBtn);
    }

    public void setLossDate(String text) {
        typeTextEnter(lossDateInputField, text, "Loss Date");
    }

    public void setLossType(String text) throws InterruptedException {
        typeTextEnter(lossTypeInputField, text, "Loss Type");
        pause(2000);
    }

    public void setRelatedLocation(String text) {
        typeTextEnter(relatedLocationInputField, text, "Related Location");
    }

    public void setRelatedLocationWithSheetData(Map<String, String> data) {
        typeTextEnter(relatedLocationInputField, data.get("Address_Line_1_Txt"), "Related Location");
    }

    public void setStateWithSheetData(Map<String, String> data) {
        typeTextEnter(stateInputField, data.get("State"), "State");
    }

    public void setClaimNumber() {
        Random random = new Random();
        int randomNum = Math.abs(random.nextInt(10000));
        typeTextEnter(claimNumInputField, Integer.toString(randomNum), "Claim Number");
    }

    public void isClaimNumberColumnVisible() {
        scrollToWebElement(claimNumColumn);
        isElementVisible(claimNumColumn);
    }

    public void isClaimNumberColumnNotVisible() {
        scrollToWebElement(claimNumColumn);
        isElementNotVisible(claimNumColumn);
    }

    public void isClaimLossCauseVisisble() {
        isElementVisible(claimLossCauseField);
    }

    public void setVehicleInvolved(String text) {
        typeTextEnter(vehicleInvolvedInputField, text, "Vehicle Involved");
    }

    public void setTotalAmountPaid(String text) {
        typeTextEnter(totalAmountPaidInputField, text, "Total Amount Paid");
    }

    public void setIndemnityPaid(String text) {
        typeTextEnter(indemnityPaidInputField, text, "Indemnity Paid");
    }
    public void setExpensePaid(String text) {
        typeTextEnter(expensePaidInputField, text, "Indemnity Paid");
    }

    public void clickSubroYes() throws Throwable {
        clickElement(subroYesBtn);
    }

    public void clickSubroNo() throws Throwable {
        clickElement(subroNoBtn);
    }

    public void setClaimOperatorFault(String text) {
        typeTextEnter(claimOperatorFaultInputField, text, "Claim Operator Fault");
    }

    public void setRelatedVesselWithSheetData(Map<String, String> data) {
        typeTextEnter(relatedVesselInputField, data.get("Year"), "Related Vessel");
    }

    public void setClass(String s) {
        typeTextEnter(classInputField, s, "Class");
    }

    public void clickAddForAutoClaimOnWcPureClaims () {
        scrollToWebElement(wcAutoClaimAddBtn);
        clickElement(wcAutoClaimAddBtn, "Clicked add button for auto claim on watercraft Pure Claims page");
    }

}
