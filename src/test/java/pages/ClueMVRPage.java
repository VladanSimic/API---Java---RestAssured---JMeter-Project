package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;
import pages.utils.CustomFileUtils;
import selenium.DriverManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ClueMVRPage extends CommonComponentsAndActions {
    WebDriver driver;

    public ClueMVRPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Choose Home Quote/Policy for Report']/../../../..//input")
    WebElement homeQuote;
    @FindBy(xpath = "//div[text()='Choose Quote/Policy for Report']/../../../..//input")
    WebElement autoQuote;
    @FindBy(xpath = "//div[text()='Choose Quote/Policy for MVR reports']/../../../../../..//input")
    WebElement policyForMVR;
    @FindBy(xpath = "//span[text()='run MVR']")
    WebElement runMVR;
    @FindBy(xpath = "//span[text()='Order MVR?']/../../../../../../../../..//table//tr/td[5]//input")
    WebElement runMVRCheckbox;
    @FindBy(xpath = "//div[text()='Household Members']/../../../..//input")
    WebElement householdMembers;
    @FindBy(xpath = "//div[text()='Household Locations']/../../../..//input")
    WebElement householdLocations;
    @FindBy(xpath = "//span[text()='run home CLUE']")
    WebElement runHomeClue;
    @FindBy(xpath = "//span[text()='run auto CLUE']")
    WebElement runAutoClue;
    @FindBy(xpath = "//div[text()='auto CLUE reports']/../../../../../..//div[text()='Household Members']/../../../..//input")
    WebElement householdMembersAuto;
    @FindBy(xpath = "//div[text()='auto CLUE reports']/../../../../../../../../../..//div[text()='Household Members']/../../../..//input")
    WebElement householdMembersAutoOperatorInformationPage;
    @FindBy(xpath = "//div[text()='auto CLUE reports']/../../../../../..//div[text()='Household Locations']/../../../..//input[@aria-hidden='false']")
    WebElement householdLocationsAuto;
    @FindBy(xpath = "//div[@class='x-grid-item-container']//table//tr//td[11]//div")
    List<WebElement> includeClaim;
    @FindBy(xpath = "//div[@class='x-grid-item-container']//table//tr//td[11][contains(@class, 'gridCellEditable')]//div")
    List<WebElement> includeClaimEditable;
    @FindBy(xpath = "//div[@class='x-grid-item-container']//table//tr//td[12]//div")
    List<WebElement> location;
    @FindBy(css = "#footer-panel-innerCt")
    WebElement footer;
    @FindBy(xpath = "//span[text()='assign claims']")
    WebElement assignClaims;
    @FindBy(xpath = "//span[text()='clear claims assignment']")
    WebElement clearClaimsAssignment;
    @FindBy(xpath = "//span[text()='assign CLUE claims']")
    WebElement assignCLUEClaims;
    @FindBy(xpath = "//span[text()='save claims assignment']")
    WebElement saveClaimsAssignment;
    @FindBy(xpath = "//div[@class='x-grid-item-container']//table//tr//td[12]//div")
    List<WebElement> driverMatch;
    @FindBy(xpath = "//div[@class='x-grid-item-container']//table//tr//td[12][contains(@class, 'gridCellEditable')]//div")
    List<WebElement> driverMatchEditable;
    @FindBy(xpath = "//div[@class='x-grid-item-container']//table//tr//td[13]//div")
    List<WebElement> driverCell;
    @FindBy(xpath = "//div[@class='x-grid-item-container']//table//tr//td[13][contains(@class, 'gridCellEditable')]//div")
    List<WebElement> driverCellEditable;
    @FindBy(xpath = "//div[text()='home CLUE reports order history']/../../../../../..//td[5]//div")
    List<WebElement> homeCLUEReportStatus;
    @FindBy(xpath = "//div[text()='auto CLUE reports order history']/../../../../../..//td[5]//div")
    List<WebElement> autoCLUEReportStatus;
    @FindBy(xpath = "//div[text()='auto CLUE reports order history']/../../../../../..//td[1]//div")
    List<WebElement> autoCLUEMemberStatus;
    @FindBy(xpath = "//div[text()='auto CLUE reports order history']/../../../../../..//td[4]//div")
    List<WebElement> autoCLUEOrderedBy;
    @FindBy(xpath = "//div[text()='home CLUE reports']/../../../../../..//div[text()='Use Different Address']/../../../..//input")
    WebElement homeCLUEUseDifferentAddress;
    @FindBy(xpath = "//div[text()='auto CLUE reports']/../../../../../..//div[text()='Use Different Address']/../../../..//input")
    WebElement autoCLUEUseDifferentAddress;
    @FindBy(xpath = "//div[text()='home CLUE reports']/../../../../../..//div[text()='Address Line 1']/../../../..//input")
    WebElement homeCLUEAddressLine1;
    @FindBy(xpath = "//div[text()='home CLUE reports']/../../../../../..//div[text()='City']/../../../..//input")
    WebElement homeCLUEAddressCity;
    @FindBy(xpath = "//div[text()='home CLUE reports']/../../../../../..//div[text()='State']/../../../..//input")
    WebElement homeCLUEAddressState;
    @FindBy(xpath = "//div[text()='home CLUE reports']/../../../../../..//div[text()='Zip']/../../../..//input")
    WebElement homeCLUEAddressZIP;
    @FindBy(xpath = "//div[text()='auto CLUE reports']/../../../../../..//div[text()='Address Line 1']/../../../..//input")
    WebElement autoCLUEAddressLine1;
    @FindBy(xpath = "//div[text()='auto CLUE reports']/../../../../../..//div[text()='City']/../../../..//input")
    WebElement autoCLUEAddressCity;
    @FindBy(xpath = "//div[text()='auto CLUE reports']/../../../../../..//div[text()='State']/../../../..//input")
    WebElement autoCLUEAddressState;
    @FindBy(xpath = "//div[text()='auto CLUE reports']/../../../../../..//div[text()='Zip']/../../../..//input")
    WebElement autoCLUEAddressZIP;
    @FindBy(xpath = "//span[text()='CLUE/MVR reports']")
    List<WebElement> clueMVRTab;
    @FindBy(xpath = "//span[text()='upload CLUE/MVR/NCF']")
    WebElement uploadClueMvrNcf;
    @FindBy(xpath = "//label[text()='Home CLUE']/..//input")
    WebElement homeClueCheckbox;
    @FindBy(xpath = "//label[text()='Auto CLUE']/..//input")
    WebElement autoClueCheckbox;
    @FindBy(xpath = "//label[text()='MVR']/..//input")
    WebElement mvrCheckbox;
    @FindBy(xpath = "//label[text()='NCF']/..//input")
    WebElement ncfCheckbox;
    @FindBy(xpath = "//div[contains(text(),'manually uploaded')]/../../../../../..//table//tr//td[3]//div")
    WebElement clueHomeReportStatus;
    @FindBy(xpath = "//div[contains(text(),'manually uploaded')]/../../../../../..//table//tr//td[4]//div")
    WebElement clueAutoReportStatus;
    @FindBy(xpath = "//div[contains(text(),'manually uploaded')]/../../../../../..//table//tr//td[6]//div")
    WebElement ncfReportStatus;
    @FindBy(xpath = "//div[contains(text(),'manually uploaded')]/../../../../../..//table//tr//td[8]//span")
    WebElement documentLink;


    public void runHomeClue(Map<String, String> data) throws Throwable {
        setHomeQuote(data);
        setHouseholdMembers(data);
        setHouseholdLocations(data);
        clickRunHomeClue();
    }

    public void runAutoClue(Map<String, String> data) throws Throwable {
        setAutoQuote(data);
        setHouseholdMembersAuto(data);
        setHouseholdLocationsAuto(data);
        clickRunAutoClue();
    }

    public void runAutoMVR(Map<String, String> data) throws Throwable {
        clickElement(policyForMVR, "Policy for MVR");
        pause(8000);
        try {
            clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + "Quote:" + data.get("Last_Name") + "')]")), "MVR Dropdown ");
        } catch (Exception e) {
            try {
                clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + "Quote:" + data.get("First_Name") + "')]")), "MVR Dropdown");
            } catch (Exception ee) {
                pause(1000);
                policyForMVR.sendKeys(Keys.ARROW_DOWN);
                pause(1000);
                policyForMVR.sendKeys(Keys.ENTER);
            }
        }

        pause(3500);
        checkCheckbox(runMVRCheckbox, "Yes");
        clickElement(runMVR);
    }

    public void includeClaimAndAddLocation(String value) throws Throwable {
        if (includeClaim.size() == 1) {
            clickFooter();
            pause(3000);
            clickElement(includeClaim.get(0));
            pause(1000);
            //Needed to default to Select Value if we are overriding this field later
            typeTextEnter(driver.switchTo().activeElement(), "S", "Include Claim");
            clickFooter();
            clickElement(includeClaim.get(0));
            pause(1000);
            //Here we are entering the actual value
            typeTextEnter(driver.switchTo().activeElement(), value, "Include Claim");
            clickFooter();
            pause(2000);
            clickElement(location.get(0), "Location");
            pause(2000);
            driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            clickAssignClaims();
        } else if (includeClaim.size() > 1) {
            for (int i = 0; i < includeClaim.size(); i++) {
                pause(1000);
                clickFooter();
                pause(2000);
                clickElement(includeClaim.get(i));
                pause(1000);
                //Needed to default to Select Value if we are overriding this field later
                typeTextEnter(driver.switchTo().activeElement(), "S", "Include Claim");
                clickFooter();
                clickElement(includeClaim.get(i));
                pause(1000);
                //Here we are entering the actual value
                typeTextEnter(driver.switchTo().activeElement(), value, "Include Claim");
                clickFooter();
                pause(2000);
                clickElement(location.get(i), "Location");
                pause(2000);
                driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            }
            clickAssignClaims();
        }
    }

    public void includeClaimOnOperatorInformationPage(String value) throws Throwable {
        pause(3000);
        clickFooter();
        if (includeClaimEditable.size() > 0) {
            if (isElementDisplayed(clearClaimsAssignment))
                clickClearClaimsAssignment();
            for (int i = 0; i < includeClaimEditable.size(); i++) {
                clickFooter();
                clickElement(includeClaimEditable.get(i));
                pause(1000);
                typeTextEnter(driver.switchTo().activeElement(), value, "Include Claim");
                clickFooter();
                pause(500);
                clickFooter();
                if (!includeClaimEditable.get(i).getText().contains(value)) {
                    clickFooter();
                    clickElement(includeClaimEditable.get(i));
                    pause(1000);
                    driver.switchTo().activeElement().clear();
                    pause(500);
                    driver.switchTo().activeElement().sendKeys(value);
                    clickFooter();
                    pause(500);
                }
            }
            for (int y = 0; y < driverMatchEditable.size(); y++) {
                clickFooter();
                clickElement(driverMatchEditable.get(y));
                pause(1000);
                typeTextEnter(driver.switchTo().activeElement(), "Yes", "Include Claim");
                clickFooter();
                if (!driverMatchEditable.get(y).getText().contains("Yes")) {
                    clickFooter();
                    clickElement(driverMatchEditable.get(y));
                    pause(1000);
                    driver.switchTo().activeElement().clear();
                    pause(500);
                    driver.switchTo().activeElement().sendKeys("Yes");
                    clickFooter();
                }
            }
            for (int k = 0; k < driverCellEditable.size(); k++) {
                clickFooter();
                clickElement(driverCellEditable.get(k), "Driver");
                pause(1000);
                clickElement(dropdownOptions.get(1));
                clickFooter();
                pause(500);
            }
            clickSaveClaimsAssignment();
        }
    }

    public void includeClaimToDriverAuto(String value) throws Throwable {
        pause(3000);
        clickFooter();
        if (includeClaimEditable.size() > 0) {
            if (isElementDisplayed(clearClaimsAssignment))
                clickClearClaimsAssignment();
            for (int i = 0; i < includeClaimEditable.size(); i++) {
                clickFooter();
                clickElement(includeClaimEditable.get(i));
                pause(1000);
                typeTextEnter(driver.switchTo().activeElement(), value, "Include Claim");
                clickFooter();
                pause(500);
                clickFooter();
                if (!includeClaimEditable.get(i).getText().contains(value)) {
                    clickFooter();
                    clickElement(includeClaimEditable.get(i));
                    pause(1000);
                    driver.switchTo().activeElement().clear();
                    pause(500);
                    driver.switchTo().activeElement().sendKeys(value);
                    clickFooter();
                    pause(500);
                }
            }
            for (int y = 0; y < driverMatchEditable.size(); y++) {
                clickFooter();
                clickElement(driverMatchEditable.get(y));
                pause(1000);
                typeTextEnter(driver.switchTo().activeElement(), "Yes", "Include Claim");
                clickFooter();
                if (!driverMatchEditable.get(y).getText().contains("Yes")) {
                    clickFooter();
                    clickElement(driverMatchEditable.get(y));
                    pause(1000);
                    driver.switchTo().activeElement().clear();
                    pause(500);
                    driver.switchTo().activeElement().sendKeys("Yes");
                    clickFooter();
                }
            }
            for (int k = 0; k < driverCellEditable.size(); k++) {
                clickFooter();
                clickElement(driverCellEditable.get(k), "Driver");
                pause(1000);
                clickElement(dropdownOptions.get(1));
                clickFooter();
                pause(500);
            }
            clickAssignClaims();
        }
    }


    public void clickAssignClaims() throws Throwable {
        clickElement(assignClaims);
    }

    public void clickSaveClaimsAssignment() {
        clickElement(saveClaimsAssignment, "save claims assignment");
    }

    public void clickAssignCLUEClaims() throws Throwable {
        clickElement(assignCLUEClaims, "Assign CLUE Claims");
        pause(3000);
    }

    public void verifyHomeClueReportStatus(int index, String value) {
        String response = homeCLUEReportStatus.get(index).getText();

        if (value.equalsIgnoreCase("clean")) {
            if (!response.equalsIgnoreCase("processing complete, no claims, no inquiry history"))
                failAssertion("HOME CLUE - Expected clean status, but found: " + response);
        } else {
            if (!response.equalsIgnoreCase("processing complete, with claims"))
                failAssertion("HOME CLUE - Expected with claims status, but found: " + response);
        }
        reportScreenshot("CLUE", "CLUE Integration Response");
    }

    public void setHomeClueAddressLine1(String value) {
        typeText(homeCLUEAddressLine1, value, "Address Line 1");
    }

    public void setHomeClueCity(String value) {
        typeText(homeCLUEAddressCity, value, "City");
    }

    public void setHomeClueState(String value) {
        typeTextEnter(homeCLUEAddressState, value, "State");
    }

    public void setHomeClueZIP(String value) {
        typeText(homeCLUEAddressZIP, value, "ZIP");
    }

    public void setAutoClueAddressLine1(String value) {
        typeText(autoCLUEAddressLine1, value, "Address Line 1");
    }

    public void setAutoClueCity(String value) {
        typeText(autoCLUEAddressCity, value, "City");
    }

    public void setAutoClueState(String value) {
        typeTextEnter(autoCLUEAddressState, value, "State");
    }

    public void setAutoClueZIP(String value) {
        typeText(autoCLUEAddressZIP, value, "ZIP");
    }

    public void clickRunHomeClue() throws Throwable {
        clickElement(runHomeClue, "Run Home CLUE");
        pause(8000);
    }

    public void setHomeQuote(Map<String, String> data) throws Throwable {
        clickElement(homeQuote, "Set home quote/policy");
        pause(2000);
        if (data.get("Admitted_Line").equalsIgnoreCase("Home Surplus Lines")) {
            clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + data.get("State") + "  " + "Quote:" + "')]")));
        } else {
            try {
                clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + "Quote:" + data.get("Last_Name") + "')]")));
            } catch (Exception e) {
                clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + data.get("State") + " " + data.get("First_Name") + "')]")));
            }
        }
    }

    public void setHouseholdMembers(Map<String, String> data) throws Throwable {
        clickElement(householdMembers);
        pause(2000);
        clickElement(driver.findElement(By.xpath("//li[text()='" + data.get("First_Name") + " " + data.get("Last_Name") + "']")));
    }

    public void setHouseholdLocations(Map<String, String> data) throws Throwable {
        clickElement(householdLocations);
        pause(2000);
        clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + data.get("Address_Line_1_Txt") + "')]")));
    }

    public void clickRunAutoClue() throws Throwable {
        clickElement(runAutoClue, "Run Auto Clue");
        pause(9000);
    }

    public void setAutoQuote(Map<String, String> data) throws Throwable {
        clickElement(autoQuote, "Choose Auto quote/policy");
        pause(2000);
        try {
            clickElement(driver.findElement(By.xpath("//li[contains(text(),'Quote:" + data.get("Last_Name") + "')]")));
        } catch (Exception e) {
            try {
                clickElement(driver.findElement(By.xpath("//li[contains(text(),'Quote:" + data.get("First_Name") + "')]")));
            } catch (Exception ee) {
                try {
                    clickElement(driver.findElement(By.xpath("//li[contains(text(),'Quote')]")));
                } catch (Exception eee) {
                    clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + data.get("State") + "')]")));
                }
            }
        }

    }

    public void setHouseholdMembersAuto(Map<String, String> data) throws Throwable {
        clickElement(householdMembersAuto);
        pause(2000);
        try {
            clickElement(driver.findElement(By.xpath("//li[text()='" + data.get("First_Name") + " " + data.get("Last_Name") + "']")));
        } catch (Exception e) {
            clickElement(driver.findElement(By.xpath("//li[text()='" + data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name") + "']")));
        }
    }

    public void setHouseholdMembersAutoOperatorInformationPage(Map<String, String> data) throws Throwable {
        clickElement(householdMembersAutoOperatorInformationPage);
        pause(2000);
        try {
            clickElement(driver.findElement(By.xpath("//li[text()='" + data.get("First_Name") + " " + data.get("Last_Name") + "']")));
        } catch (Exception e) {
            clickElement(driver.findElement(By.xpath("//li[text()='" + data.get("First_Name") + " " + data.get("MI") + " " + data.get("Last_Name") + "']")));
        }
    }

    public void setHouseholdLocationsAuto(Map<String, String> data) throws Throwable {
        clickElement(householdLocationsAuto, "Household Locations");
        pause(2000);
        clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + data.get("Zip_Code") + "')]")));
    }

    public void setHomeCLUEUseDifferentAddress(String value) throws Throwable {
        checkCheckbox(homeCLUEUseDifferentAddress, value, "Use Different Address");
        pause(500);
    }

    public void setAutoCLUEUseDifferentAddress(String value) throws Throwable {
        checkCheckbox(autoCLUEUseDifferentAddress, value, "Use Different Address");
        pause(500);
    }

    public void verifyIfTabIsPresent(String value) {
        boolean isDisplayed = clueMVRTab.size() > 0;

        if (value.equalsIgnoreCase("displayed") && !isDisplayed) {
            failAssertion("CLUE/MVR tab is not visible");
        } else if (value.equalsIgnoreCase("not displayed") && isDisplayed) {
            failAssertion("CLUE/MVR tab is visible when it shouldn't be");
        }
        reportScreenshot("Clue_MVR_Tab", "Clue/MVR Tab");
    }

    public void clickUploadClueMvrNcf() {
        clickElement(uploadClueMvrNcf, "Upload CLUE/MVR/NCF");
    }

    public void setHomeClueCheckbox(String value) throws Throwable {
        checkCheckbox(homeClueCheckbox, value, "Home CLUE");
    }

    public void setAutoClueCheckbox(String value) throws Throwable {
        checkCheckbox(autoClueCheckbox, value, "Auto CLUE");
    }

    public void setMVRCheckbox(String value) throws Throwable {
        checkCheckbox(mvrCheckbox, value, "MVR");
    }

    public void setNCFCheckbox(String value) throws Throwable {
        checkCheckbox(ncfCheckbox, value, "NCF");
    }

    public void uploadDocument(String doc) throws Throwable {
        String filePath = System.getProperty("user.dir") + "/src/test/test_data/upload/";

        clickElement(fileUpload, "File Upload");
        pause(2000);
        browseFileBtn.sendKeys(filePath + doc);
        pause(1000);
        clickElement(uploadBtn, "upload");
        pause(5000);
        clickOK();
        saveChanges();
    }

    public void verifyReportStatus(String value) {
        if (value.equalsIgnoreCase("Home CLUE")) {
            assertEquals(clueHomeReportStatus.getText(), "Completed", "Home CLUE Report Status");
        } else if (value.equalsIgnoreCase("Auto CLUE")) {
            assertEquals(clueAutoReportStatus.getText(), "Completed", "Auto CLUE Report Status");
        } else if (value.equalsIgnoreCase("NCF")) {
            assertEquals(ncfReportStatus.getText(), "Completed", "NCF Report Status");
        }
    }

    public void verifyDownloadedDocument() throws IOException, InterruptedException {
        String downloadDirectory = "results/downloads/" + DriverManager.getInstance() + "/";
        fileDownload(documentLink);

        File downloadedFile = CustomFileUtils.getFirstFileByPartialName(downloadDirectory, CustomFileUtils.getLatestDownloadedFileName(downloadDirectory));
        try {
            if (CustomFileUtils.isFileOverSize(downloadedFile, 4 * 1024)) {
                FileUtils.forceDelete(downloadedFile);
            } else {
                failAssertion("File is null");
            }
        } catch (Exception e) {
            //
        } finally {
            FileUtils.deleteDirectory(new File(downloadDirectory));
        }
    }

    public void uploadAndVerifyClueMvrNcfReport(String report, String doc) throws Throwable {
        clickUploadClueMvrNcf();
        switch (report) {
            case "Home CLUE": {
                setHomeClueCheckbox("Yes");
            }
            break;
            case "Auto CLUE": {
                setAutoClueCheckbox("Yes");
            }
            break;
            case "MVR": {
                setMVRCheckbox("Yes");
            }
            break;
            case "NCF": {
                setNCFCheckbox("Yes");
            }
            break;
        }
        uploadDocument(doc);
        verifyReportStatus(report);
        verifyDownloadedDocument();
    }

    public void verifyAutoClueReportStatus(int index, String value) {
        String response = autoCLUEReportStatus.get(index).getText();

        if (value.equalsIgnoreCase("clean")) {
            if (!response.equalsIgnoreCase("processing complete, results clear"))
                failAssertion("Auto CLUE - Expected clean status, but found: " + response);
        } else {
            if (!response.equalsIgnoreCase("processing complete, with results information"))
                failAssertion("Auto CLUE - Expected with claims status, but found: " + response);
        }
        reportScreenshot("CLUE", "CLUE Integration Response");
    }


    public void verifyAutoClueOrderedBy(int index, String value) {
        assertContains(autoCLUEOrderedBy.get(index).getText(), value, "Auto CLUE - Ordered By");
    }

    public void verifyAutoClueMemberStatus(int index, String value, Map<String, String> data) {
        if (value.equalsIgnoreCase("primary driver"))
            assertContains(autoCLUEMemberStatus.get(index).getText().toLowerCase(), data.get("First_Name").toLowerCase(), "Auto CLUE - Member - Status");
        else
            assertContains(autoCLUEMemberStatus.get(index).getText().toLowerCase(), value.toLowerCase(), "Auto CLUE - Member - Status");
    }

    public void clickFooter() {
        clickElement(footer, "footer");
    }

    public void clickClearClaimsAssignment() throws Throwable {
        clickElement(clearClaimsAssignment, "clear claims assignment");
        clickOK();
        pause(1000);
    }


}
