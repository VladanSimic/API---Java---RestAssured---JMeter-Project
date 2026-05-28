package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.PolicyPage;
import pages.utils.CommonComponentsAndActions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class UnderwritingCompanyBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public UnderwritingCompanyBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Underwriting Company']/../../../..//input[@aria-hidden='false']")
    List<WebElement> underwritingCompany;
    @FindBy(xpath = "(//div[text()='underwriting company']/../../../../../..//input)[1]")
    List<WebElement> underwritingCompanyES;
    @FindBy(xpath = "//div[contains(text(),'Manager Override')]/../../../../div//input[@aria-hidden='false']")
    List<WebElement> managerOverride;

    public void fillUnderwritingCompanyDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("underwriting company");
        verifyUnderwritingCompany(data.get("Underwriting_Company_Underwriting_Company"));
        checkManagerOverride(data.get("Underwriting_Company_Manager_Override"));
        saveChanges();
    }

    public void fillUnderwritingCompanyDetailsCC_END(Map<String, String> data) throws Throwable {
        verifyUnderwritingCompany(data.get("Underwriting_Company_Underwriting_Company_END"));
        checkManagerOverride(data.get("Underwriting_Company_Manager_Override_END"));
        saveChanges();
    }

    public void checkManagerOverride(String value) throws Throwable {
        checkCheckbox(managerOverride.get(0), value, "Manager override");
        pause(1000);
    }

    public void chooseUnderwritingCompany(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Underwriting_Company_Manager_Override")) && data.get("Underwriting_Company_Manager_Override").equalsIgnoreCase("Yes")) {
            pause(2000);

            typeText(underwritingCompany.get(0), data.get("Underwriting_Company_Underwriting_Company"));
            underwritingCompany.get(0).sendKeys(Keys.ENTER);

            pause(2000);
        }
    }

    public void chooseUnderwritingCompanyHS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Underwriting_Company_Manager_Override_END")) && data.get("Underwriting_Company_Manager_Override_END").equalsIgnoreCase("Yes")) {
            try {
                typeText(underwritingCompany.get(0), data.get("Underwriting_Company_Underwriting_Company_END"));
                underwritingCompany.get(0).sendKeys(Keys.ENTER);
            } catch (Exception e) {
                typeText(underwritingCompany.get(1), data.get("Underwriting_Company_Underwriting_Company_END"));
                underwritingCompany.get(1).sendKeys(Keys.ENTER);
            }
            pause(2000);
        }
    }

    public void chooseUnderwritingCompanyHS_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Underwriting_Company_Manager_Override_OOS_END")) && data.get("Underwriting_Company_Manager_Override_OOS_END").equalsIgnoreCase("Yes")) {
            try {
                typeText(underwritingCompany.get(0), data.get("Underwriting_Company_Underwriting_Company_OOS_END"));
                underwritingCompany.get(0).sendKeys(Keys.ENTER);
            } catch (Exception e) {
                typeText(underwritingCompany.get(1), data.get("Underwriting_Company_Underwriting_Company_OOS_END"));
                underwritingCompany.get(1).sendKeys(Keys.ENTER);
            }
            pause(2000);
        }
    }

    public void chooseUnderwritingCompanyHS_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Underwriting_Company_Manager_Override_RNW")) && data.get("Underwriting_Company_Manager_Override_RNW").equalsIgnoreCase("Yes")) {
            try {
                typeText(underwritingCompany.get(0), data.get("Underwriting_Company_Underwriting_Company_RNW"));
                underwritingCompany.get(0).sendKeys(Keys.ENTER);
            } catch (Exception e) {
                typeText(underwritingCompany.get(1), data.get("Underwriting_Company_Underwriting_Company_RNW"));
                underwritingCompany.get(1).sendKeys(Keys.ENTER);
            }
            pause(2000);
        }
    }

    public void verifyUnderwritingCompany(String value) {
        assertCellValue(underwritingCompany.get(0), value, "Underwriting company");
    }

    public void fillUnderwritingCompanyDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("underwriting company");
        //      verifyUnderwritingCompany(data.get("Underwriting_Company_Underwriting_Company"));
        checkManagerOverride(data.get("Underwriting_Company_Manager_Override"));
        chooseUnderwritingCompany(data);
        try {
            new InsuranceInformationBlock(driver).fillInsuranceInformationDetailsHS(data);
        } catch (Exception ignored) {

        }
    }

    public void fillUnderwritingCompanyDetailsHS_END(Map<String, String> data) throws Throwable {
//        verifyUnderwritingCompany(data.get("Underwriting_Company_Underwriting_Company_END"));
        checkManagerOverride(data.get("Underwriting_Company_Manager_Override_END"));
        chooseUnderwritingCompanyHS_END(data);
    }

    public void fillUnderwritingCompanyDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
//        verifyUnderwritingCompany(data.get("Underwriting_Company_Underwriting_Company_OOS_END"));
        checkManagerOverride(data.get("Underwriting_Company_Manager_Override_OOS_END"));
        chooseUnderwritingCompanyHS_OOS_END(data);
    }

    public void fillUnderwritingCompanyDetailsHS_RNW(Map<String, String> data) throws Throwable {
//        verifyUnderwritingCompany(data.get("Underwriting_Company_Underwriting_Company_RNW"));
        checkManagerOverride(data.get("Underwriting_Company_Manager_Override_RNW"));
        chooseUnderwritingCompanyHS_RNW(data);
    }

    public void fillUnderwritingCompanyDetailsES(Map<String, String> data) throws Throwable {
        verifyBlockExists("underwriting company");
        checkManagerOverride(data.get("Underwriting_Company_Manager_Override"));
        chooseUnderwritingCompanyES(data);
    }

    public void chooseUnderwritingCompanyES(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Underwriting_Company_Manager_Override")) && data.get("Underwriting_Company_Manager_Override").equalsIgnoreCase("Yes")) {
            pause(2000);
            typeText(underwritingCompanyES.get(0), data.get("Underwriting_Company_Underwriting_Company"));
            underwritingCompanyES.get(0).sendKeys(Keys.ENTER);
            pause(2000);
        }
    }

    public void setUnderwritingCompany(String value) throws Throwable {
        typeTextEnter(underwritingCompany.get(0), value, "underwriting company");
        clickFooter();
    }


    public void selectUnderwritingCompany(Map<String, String> data, String company) throws Throwable {
        String lob = data.get("Admitted_Line");
        checkManagerOverride("Yes");
        pause(2000);

        if (lob.equalsIgnoreCase("Excess Liability")) {
            typeTextEnter(underwritingCompanyES.get(0), company, "Underwriting Company");
            saveChanges();
        }
        if (lob.equalsIgnoreCase("Home Surplus Lines")) {
            typeTextEnter(underwritingCompany.get(0), company, "Underwriting Company");
            saveChanges();
        }
        clickFooter();
        pause(3000);
        saveChanges();

    }

    private void assertCarrierPartner(String expected, String log) {
        assertCellValue(underwritingCompany.get(0), expected, log);
        reportScreenshot("Carrier_" + System.currentTimeMillis(), "Expected carrier partner: " + expected);
    }

    public void verifyCarrierPartner(Map<String, String> data, String trx) throws Throwable {
        CommonComponentsAndActions actions = new CommonComponentsAndActions(driver);

        String courseOfConstruction = data.get("Usage_Under_Construction_Or_Major_Renovation");
        String overrideNewBusiness = data.get("Underwriting_Company_Manager_Override");
        String overrideRenewal = data.get("Underwriting_Company_Manager_Override_RNW");
        String residenceType = data.get("Risk_Addresses_Residence_Type");
        String state = data.get("State");

        String replacementCost = driver.findElement(By.xpath("//*[text()='Replacement Cost']/../../../..//input")).getAttribute("value").replace(",", "");
        String otherStructures = driver.findElement(By.xpath("//*[text()='Other Structures']/../../../..//input")).getAttribute("value").replace(",", "");
        String lossOfUse = driver.findElement(By.xpath("//*[text()='Contents']/../../../..//input")).getAttribute("value").replace(",", "");
        String contents = driver.findElement(By.xpath("//*[text()='Loss of Use']/../../../..//input")).getAttribute("value").replace(",", "");

        final int TIV_THRESHOLD = 10000000;  // 10M
        final int TIV_UPPER_THRESHOLD_NY = 25000000;  // 25M

        int tiv = 0;
        tiv += actions.parseOrDefault(replacementCost, 0);
        tiv += actions.parseOrDefault(otherStructures, 0);
        tiv += actions.parseOrDefault(lossOfUse, 0);
        tiv += actions.parseOrDefault(contents, 0);


        boolean isCoCSelected = courseOfConstruction.equalsIgnoreCase("Yes");
        boolean isOverrideNB = overrideNewBusiness.equalsIgnoreCase("Yes");
        boolean isOverrideRN = overrideRenewal.equalsIgnoreCase("Yes");
        String carrier = "Default";

        scrollToWebElement(underwritingCompany.get(0));
        switch (residenceType) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AL":
                    case "GA":
                    case "MS":
                    case "LA":
                    case "NJ":
                    case "CA": {
                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else {
                            carrier = "PURE Specialty Exchange";
                        }
                        infoLog("Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction +
                                " State: " + state + " Carrier: " + carrier);
                        assertCarrierPartner(carrier, "Carrier Partner");
                    }
                    break;
                    case "AZ":
                    case "CO":
                    case "HI":
                    case "MT":
                    case "UT":
                    case "WY": {
                        assertCarrierPartner("PURE Specialty Exchange", "Carrier Partner");
                        infoLog("Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction + " State: " + state + " Carrier: PURE Specialty Exchange");
                    }
                    break;
                    case "SC":
                    case "MA":
                    case "NC": {
                        String effectiveDateString = data.get("Effective_Date");
                        String pdFilingDate = "02/01/2025";
                        LocalDate effectiveDate = LocalDate.parse(effectiveDateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                        LocalDate comparisonDate = LocalDate.parse(pdFilingDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));


                        // First check for overrides
                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else if (effectiveDate.isBefore(comparisonDate)) {
                            carrier = "PURE Specialty Exchange";
                        } else if (effectiveDate.isEqual(comparisonDate) || effectiveDate.isAfter(comparisonDate)) {
                            if (tiv >= TIV_THRESHOLD) {
                                carrier = "PURE Specialty Exchange";
                            } else {
                                carrier = "Palomar Excess and Surplus Insurance Company";
                            }
                        }
                        String message = "Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction +
                                " State: " + state + " Carrier: " + carrier + " Override: " + isOverrideNB;
                        infoLog(message);
                        reportTextAttachment("Carrier", message);
                        assertCarrierPartner(carrier, "Carrier Partner");
                        break;
                    }
                    case "TX": {
                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else if (tiv < TIV_THRESHOLD) {
                            carrier = "Accredited Specialty Insurance Company";
                        } else {
                            carrier = "PURE Specialty Exchange";
                        }
                    }
                    infoLog("Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction +
                            " State: " + state + " Carrier: " + carrier);
                    assertCarrierPartner(carrier, "Carrier Partner");
                    break;
                    case "NY": {
                        navigateToLocation(data);
                        pause(2000);
                        String countyName = driver.findElement(By.xpath("//div[text()='County']/ancestor::div[4]//div[@role='textbox']")).getText().toLowerCase();

                        navigateToHomeSurplusLinesPolicyPage();
                        pause(2000);


                        String effectiveDateString = data.get("Effective_Date");
                        String pdFilingDate = "03/01/2025";
                        LocalDate effectiveDate = LocalDate.parse(effectiveDateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                        LocalDate comparisonDate = LocalDate.parse(pdFilingDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

                        Set<String> specificCounties = new HashSet<>(Arrays.asList("Nassau", "Nassau S", "Nassau N", "Suffolk", "Suffolk N.W.",
                                        "Suffolk S.E.", "Suffolk S.W.", "Suffolk N.E.").stream()
                                .map(String::toLowerCase).collect(Collectors.toList()));

                        // First check for overrides
                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else if (effectiveDate.isBefore(comparisonDate)) {
                            carrier = (tiv <= TIV_UPPER_THRESHOLD_NY)
                                    ? "Accredited Specialty Insurance Company"
                                    : "PURE Specialty Exchange";
                        } else if (tiv < TIV_THRESHOLD) {
                            carrier = specificCounties.contains(countyName)
                                    ? "Palomar Excess and Surplus Insurance Company"
                                    : "Accredited Specialty Insurance Company";
                        } else {
                            carrier = "PURE Specialty Exchange";
                        }
                        infoLog("Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction +
                                " State: " + state + " Carrier: " + carrier + " County: " + countyName + " Override: " + isOverrideNB);
                        assertCarrierPartner(carrier, "Carrier Partner");
                        reportTextAttachment("County", countyName);
                    }
                    break;
                    case "FL": {
                        navigateToLocation(data);
                        pause(2000);
                        String countyName = driver.findElement(By.xpath("//div[text()='County']/ancestor::div[4]//div[@role='textbox']")).getText().toLowerCase();
                        String distanceToCoast = driver.findElement(By.xpath("//div[text()='Distance to Coast override']/../../../..//input[@aria-hidden='false']")).getAttribute("value").toLowerCase();
                        String openingProtection = driver.findElement(By.xpath("//div[text()='Opening Protection']/../../../..//input[@aria-hidden='false']")).getAttribute("value").toLowerCase();

                        pause(1000);
                        navigateToHomeSurplusLinesPolicyPage();
                        pause(1000);

                        String zipCode = data.get("Zip_Code");
                        String yearBuiltStr = data.get("Construction_Details_Year_Built");
                        String roofType = data.get("Wind_Mitigation_Roof_Covering");
                        String yearRoofReplacedStr = data.get("Wind_Mitigation_Year_Roof_Replaced");

                        int yearBuilt = parseOrDefault(yearBuiltStr, -1);
                        int yearRoofReplaced = parseOrDefault(yearRoofReplacedStr, -1);


                        String effectiveDateString = data.get("Effective_Date");
                        String pdFilingDate = "03/01/2025";


                        LocalDate effectiveDate = LocalDate.parse(effectiveDateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                        LocalDate comparisonDate = LocalDate.parse(pdFilingDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

                        int roofInstallationYear = Math.max(yearBuilt, yearRoofReplaced);
                        int roofAge = effectiveDate.getYear() - roofInstallationYear;

                        Set<String> specificCounties = new HashSet<>(Arrays.asList("Palm Beach", "Miami-Dade", "Indian River", "Collier").stream()
                                .map(String::toLowerCase).collect(Collectors.toList()));
                        Set<String> generalCounties = new HashSet<>(Arrays.asList("Escambia", "Santa Rosa", "Okaloosa", "Walton", "Holmes", "Washington",
                                        "Bay", "Jackson", "Calhoun", "Gulf", "Liberty", "Franklin", "Gadsden",
                                        "Leon", "Wakulla", "Jefferson")
                                .stream().map(String::toLowerCase).collect(Collectors.toList()));

                        boolean qualifiesNfm = meetsNfmQualifications(roofType, yearBuilt, effectiveDate,
                                countyName, distanceToCoast, openingProtection, yearRoofReplaced, tiv);

                        // First check for overrides
                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else if (specificCounties.contains(countyName)) {
                            if (tiv < 2500000) {
                                carrier = qualifiesNfm
                                        ? "National Fire & Marine Insurance Company"
                                        : "PURE Specialty Exchange";
                            } else if (tiv >= 2500000 && tiv < 10000000) {
                                carrier = "Accredited Specialty Insurance Company";
                            } else {
                                carrier = "PURE Specialty Exchange";
                            }
                        } else if (generalCounties.contains(countyName) && effectiveDate.isBefore(comparisonDate)) {
                            carrier = tiv < 10000000
                                    ? qualifiesNfm
                                    ? "National Fire & Marine Insurance Company"
                                    : "PURE Specialty Exchange"
                                    : "PURE Specialty Exchange";
                        } else if (generalCounties.contains(countyName) && !effectiveDate.isBefore(comparisonDate)) {
                            if (tiv >= TIV_THRESHOLD) {
                                carrier = "PURE Specialty Exchange";
                            } else {
                                carrier = qualifiesNfm
                                        ? "National Fire & Marine Insurance Company"
                                        : "Palomar Excess and Surplus Insurance Company";
                            }
                        } else {
                            carrier = tiv < 10000000
                                    ? qualifiesNfm
                                    ? "National Fire & Marine Insurance Company"
                                    : "PURE Specialty Exchange"
                                    : "PURE Specialty Exchange";
                        }
                        // Single output and assertion per block
                        infoLog("Total Insured Value: " + tiv + " ZIP: " + zipCode + " Roof Type: " + roofType +
                                " Roof Age: " + roofAge + " State: " + state + " Carrier: " + carrier);
                        assertCarrierPartner(carrier, "Carrier Partner");
                        reportTextAttachment("County", countyName);
                    }
                }
                break;
            }
            case "Condo/Co-op": {
                switch (data.get("State")) {
                    case "AL":
                    case "GA":
                    case "MS":
                    case "LA":
                    case "NJ":
                    case "CA": {
                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else {
                            carrier = "PURE Specialty Exchange";
                        }
                        infoLog("Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction +
                                " State: " + state + " Carrier: " + carrier);
                        assertCarrierPartner(carrier, "Carrier Partner");
                    }
                    break;
                    case "AZ":
                    case "CO":
                    case "HI":
                    case "MT":
                    case "UT":
                    case "WY": {
                        assertCarrierPartner("PURE Specialty Exchange", "Carrier Partner");
                        infoLog("Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction + " State: " + state + " Carrier: PURE Specialty Exchange");
                    }
                    break;
                    case "SC":
                    case "MA":
                    case "NC": {
                        // First check for overrides
                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else {
                            carrier = "PURE Specialty Exchange";
                        }
                        String message = "Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction +
                                " State: " + state + " Carrier: " + carrier + " Override: " + isOverrideNB;
                        infoLog(message);
                        reportTextAttachment("Carrier", message);
                        assertCarrierPartner(carrier, "Carrier Partner");
                        break;
                    }
                    case "TX": {
                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else if (tiv < TIV_THRESHOLD) {
                            carrier = "Accredited Specialty Insurance Company";
                        } else {
                            carrier = "PURE Specialty Exchange";
                        }
                    }
                    infoLog("Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction +
                            " State: " + state + " Carrier: " + carrier);
                    assertCarrierPartner(carrier, "Carrier Partner");
                    break;
                    case "NY": {
                        String effectiveDateString = data.get("Effective_Date");
                        String pdFilingDate = "03/01/2025";
                        LocalDate effectiveDate = LocalDate.parse(effectiveDateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                        LocalDate comparisonDate = LocalDate.parse(pdFilingDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else if (effectiveDate.isBefore(comparisonDate)) {
                            carrier = (tiv <= TIV_UPPER_THRESHOLD_NY)
                                    ? "Accredited Specialty Insurance Company"
                                    : "PURE Specialty Exchange";
                        } else {
                            carrier = (tiv < TIV_THRESHOLD)
                                    ? "Accredited Specialty Insurance Company"
                                    : "PURE Specialty Exchange";
                        }
                    }
                    infoLog("Total Insured Value: " + tiv + " and CoC selected: " + courseOfConstruction +
                            " State: " + state + " Carrier: " + carrier);
                    assertCarrierPartner(carrier, "Carrier Partner");
                    break;
                    case "FL": {
                        navigateToLocation(data);
                        pause(2000);
                        String countyName = driver.findElement(By.xpath("//div[text()='County']/ancestor::div[4]//div[@role='textbox']")).getText().toLowerCase();

                        navigateToHomeSurplusLinesPolicyPage();
                        pause(1000);

                        String effectiveDateString = data.get("Effective_Date");
                        String pdFilingDate = "03/01/2025";


                        LocalDate effectiveDate = LocalDate.parse(effectiveDateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                        LocalDate comparisonDate = LocalDate.parse(pdFilingDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

                        Set<String> specificCounties = new HashSet<>(Arrays.asList("Palm Beach", "Miami-Dade", "Indian River", "Collier").stream()
                                .map(String::toLowerCase).collect(Collectors.toList()));

                        // First check for overrides
                        if (isOverrideNB) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company");
                        } else if (isOverrideRN) {
                            carrier = data.get("Underwriting_Company_Underwriting_Company_RNW");
                        } else if (isCoCSelected) {
                            carrier = "Palomar Excess and Surplus Insurance Company";
                        } else if (specificCounties.contains(countyName) && effectiveDate.isBefore(comparisonDate)) {
                            if (tiv >= 2500000 && tiv < 10000000) {
                                carrier = "Accredited Specialty Insurance Company";
                            } else {
                                carrier = "- Select -";
                            }
                        } else if (!effectiveDate.isBefore(comparisonDate)) {
                            if (tiv < 5000000) {
                                carrier = "National Fire & Marine Insurance Company";
                            } else if (tiv < 10000000 && specificCounties.contains((countyName))) {
                                carrier = "Accredited Specialty Insurance Company";
                            } else if (tiv < 10000000 && !specificCounties.contains(countyName)) {
                                carrier = "- Select -";
                            } else {
                                carrier = "- Select -";
                            }
                        } else {
                            carrier = "- Select -";
                        }
                        infoLog("Total Insured Value: " + tiv + " State: " + state + " Carrier: " + carrier);
                        assertCarrierPartner(carrier, "Carrier Partner");
                    }
                }
                break;
            }
        }
    }

    private boolean meetsNfmQualifications(String roofType, int yearBuilt, LocalDate effectiveDate,
                                           String countyName, String distanceToCoast, String openingProtection,
                                           int yearRoofReplaced, int tiv) {

        if (tiv >= 10000000) {
            reportTextAttachment("NFM Qualification Check by TIV", "Not Qualified: TIV is greater than $10M (" + tiv + ").");
            return false;
        }
        // Calculate the age of the roof
        int roofInstallationYear = Math.max(yearBuilt, yearRoofReplaced);
        int roofAge = effectiveDate.getYear() - roofInstallationYear;

        // Check distance to coast and opening protection
        boolean isCoastal = distanceToCoast.equals("< 1000 ft") || distanceToCoast.equals("Barrier Island");
        if (isCoastal) {
            if (!openingProtection.equalsIgnoreCase("Impact Glass Rated For Large Missiles") &&
                    !openingProtection.equalsIgnoreCase("Impact Shutters Rated For Large Missiles")) {
                reportTextAttachment("NFM Qualification Check by Distance to Coast",
                        "Not Qualified: Distance to Coast is '" + distanceToCoast +
                                "' but Opening Protection is not 'Impact Glass Rated For Large Missiles' or 'Impact Shutters Rated For Large Missiles'.");
                return false;
            }
            reportTextAttachment("NFM Qualification Check by Distance to Coast",
                    "Qualified: Distance to Coast and Opening Protection requirements are met.");
        } else {
            reportTextAttachment("NFM Qualification Check by Distance to Coast",
                    "No Distance to Coast validation required for '" + distanceToCoast + "'.");
        }
        // Qualification logic based on roof type and age
        if ((roofType.equalsIgnoreCase("Metal Sheathing With Concealed Fasteners") && roofAge <= 15) ||
                (roofType.equalsIgnoreCase("Concrete / Clay Tiles") && roofAge <= 10) ||
                (!roofType.equalsIgnoreCase("Metal Sheathing With Concealed Fasteners") &&
                        !roofType.equalsIgnoreCase("Concrete / Clay Tiles") && roofAge <= 10)) {
            String roofMessage = (roofType.equalsIgnoreCase("Metal Sheathing With Concealed Fasteners")) ?
                    "Roof type is 'Metal Sheathing With Concealed Fasteners' and roof age is <= 15 years." :
                    (roofType.equalsIgnoreCase("Concrete / Clay Tiles")) ?
                            "Roof type is 'Concrete / Clay Tiles' and roof age is <= 10 years." :
                            "Roof type is not 'Metal Sheathing With Concealed Fasteners' or 'Concrete / Clay Tiles', but roof age is <= 10 years.";
            reportTextAttachment("NFM Qualification Check by roof", "Qualified: " + roofMessage);
            return true;
        }
        // Default case: does not meet qualifications
        reportTextAttachment("NFM Qualification Check",
                "Not Qualified: Roof Type = " + roofType + ", Roof Age = " + roofAge + ", County = " + countyName + ".");
        return false;
    }

    public void verifyCarrier(String expected) {
        assertCellValue(underwritingCompany.get(0), expected, "Carrier Partner");
        reportScreenshot("Carrier_" + System.currentTimeMillis(), "Expected carrier partner: " + expected);
    }

    public void fillUnderwritingCompanyDetailsFS(Map<String, String> data) throws Throwable {
        // TODO FS
        verifyBlockExists("underwriting company");
    }
}