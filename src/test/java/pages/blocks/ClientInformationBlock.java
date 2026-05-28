package pages.blocks;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ClientInformationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ClientInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label//div[text()='Effective Date']/../../../..//input")
    List<WebElement> effectiveDate;
    @FindBy(xpath = "//label//div[text()='DOB']/../../../..//input")
    List<WebElement> dateOfBirth;
    @FindBy(xpath = "//label//div[text()='First Name']/../../../..//input")
    List<WebElement> firstName;
    @FindBy(xpath = "//label//div[text()='Last Name']/../../../..//input")
    List<WebElement> lastName;
    @FindBy(xpath = "//label//div[text()='Prefix']/../../../..//input")
    List<WebElement> prefix;
    @FindBy(xpath = "//label//div[text()='Suffix']/../../../..//input")
    List<WebElement> suffix;
    @FindBy(xpath = "//label//div[text()='MI']/../../../..//input")
    List<WebElement> mi;
    @FindBy(xpath = "//label//div[text()='Member Occupation']/../../../..//input")
    List<WebElement> memberOccupation;
    @FindBy(xpath = "//label//div[text()='Member Employer']/../../../..//input")
    List<WebElement> memberEmployer;
    @FindBy(xpath = "//label//div[text()='SSN']/../../../..//input")
    List<WebElement> ssn;
    @FindBy(xpath = "//label//div[text()='Email']/../../../..//input")
    List<WebElement> email;
    @FindBy(xpath = "//div[contains(text(),'Spouse/Partner')]/../../../..//input")
    List<WebElement> spousePartner;
    @FindBy(xpath = "//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8414905']")
    WebElement primaryAddressLine1;
    //add 2
    //saleforce number
    @FindBy(xpath = "//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8534206']")
    List<WebElement> city;
    @FindBy(xpath = "//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_7979502']")
    List<WebElement> zipCode;
    @FindBy(xpath = "//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8534406']")
    List<WebElement> state;
    @FindBy(xpath = "//div[contains(text(),'more than six months?')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement sixMonthsYes;
    @FindBy(xpath = "//div[contains(text(),'more than six months?')]/../../../../div//label[text()='No']/../span/input")
    WebElement sixMonthsNo;
    //prior addres 1
    // prior addres 2
    // city
    @FindBy(xpath = "//div[contains(text(),'member of your household')]/../../../../div//label[text()='No']/../span/input")
    WebElement memberOfHouseholdNo;
    @FindBy(xpath = "//div[contains(text(),'member of your household')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement memberOfHouseholdYes;

    public void fillOutClientInformationDetails(Map<String, String> data) throws Throwable {
        setEffectiveDate(data.get("Effective_Date"));
        setDateOfBirth(data.get("Date_Of_Birth"));
        livedAtAddressMoreThanSixMonths(data.get("More_Than_Six_Months"));
        entertainerAthletePoliticalFigure(data.get("Entertainer_Athlete"));
        setFirstName(data.get("First_Name"));
        setLastName(data.get("Last_Name"));
        setPrefix(data.get("Prefix"));
        setMI(data.get("MI"));
        setSuffix(data.get("Suffix"));
        setSSN(data.get("SSN"));
        setMemberOccupation(data.get("Member_Occupation"));
        setMemberEmployer(data.get("Member_Employer"));

        if (isElementDisplayed(primaryAddressLine1)) {
            setPrimaryRiskAddressLine1(data.get("Address_Line_1_Txt"));
            setCity(data.get("City_Name_Txt"));
            setZipCode(data.get("Zip_Code"));
            setState(data.get("State"));
        } else {
            driver.switchTo().frame("addressIframe");
            typeText(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8414905']")), data.get("Address_Line_1_Txt"));
            typeText(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8534206']")), data.get("City_Name_Txt"));
            Select s = new Select(driver.findElement(By.xpath("//select")));
            s.selectByVisibleText(data.get("State"));
            typeText(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_7979502']")), data.get("Zip_Code"));
            driver.switchTo().parentFrame();
            //TODO - move elements, create methods
        }
        setSpousePartner(data.get("Spouse_Partner"));

        if (hasValue(data.get("Spouse_Partner")) && data.get("Spouse_Partner").equalsIgnoreCase("Yes")) {
            setPartnerFirstName(data.get("Partner_First_Name"));
            setPartnerLastName(data.get("Partner_Last_Name"));
            setPartnerPrefix(data.get("Partner_Prefix"));
            setPartnerMI(data.get("Partner_MI"));
            setPartnerSuffix(data.get("Partner_Suffix"));
        }

        try {
            if (isElementDisplayed(primaryAddressLine1)) {
                setState(data.get("State"));
            } else {
                driver.switchTo().frame("addressIframe");
                typeText(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_7979502']")), data.get("Zip_Code"));
                driver.switchTo().parentFrame();
            }
            clickElement(driver.findElement(By.xpath("//div[text()='client information']")));

        } catch (Exception e) {

        }

    }

    public void setPartnerSuffix(String partner_suffix) throws Throwable {
        typeTexts(suffix, 1, partner_suffix);
    }

    public void setAddressCityZipAndState(Map<String, String> data) throws Throwable {
        if (isElementDisplayed(primaryAddressLine1)) {
            setPrimaryRiskAddressLine1(data.get("Address_Line_1_Txt"));
            setCity(data.get("City_Name_Txt"));
            setZipCode(data.get("Zip_Code"));
            setState(data.get("State"));
        } else {
            driver.switchTo().frame("addressIframe");
            typeText(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8414905']")), data.get("Address_Line_1_Txt"));
            typeText(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8534206']")), data.get("City_Name_Txt"));
            Select s = new Select(driver.findElement(By.xpath("//select")));
            s.selectByVisibleText(data.get("State"));
            typeText(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_7979502']")), data.get("Zip_Code"));
            driver.switchTo().parentFrame();
            //TODO - move elements, create methods
        }
    }

    public void setPartnerMI(String partner_mi) throws Throwable {
        typeTexts(mi, 1, partner_mi);
    }

    public void setPartnerPrefix(String partner_prefix) throws Throwable {
        typeTexts(prefix, 1, partner_prefix);
    }

    public void setMI(String miValue) {
        typeText(mi.get(0), miValue, "MI");
    }

    public void setPrefix(String prefixValue) {
        if (hasValue(prefixValue)) {
            typeText(prefix.get(0), prefixValue, "Prefix");
        }
    }

    public void setSuffix(String suffixValue) {
        typeText(suffix.get(0), suffixValue, "Suffix");
    }

    public void setEffectiveDate(String effectiveDateValue) throws Throwable {
        clickFooter();
        typeTextEnter(effectiveDate.get(0), effectiveDateValue, "Effective date");
        clickFooter();
        DataManager.getInstance().setKey("Current_Term_Eff_Date", effectiveDateValue);
    }

    public void setDateOfBirth(String dateOfBirthValue) throws Throwable {
        clickFooter();
        typeTextEnter(dateOfBirth.get(0), dateOfBirthValue, "Date of birth");
    }

    public void setFirstName(String firstNameValue) throws Throwable {
        clickFooter();
        typeText(firstName.get(0), firstNameValue, "First name");
    }

    public void setLastName(String lastNameValue) {
        typeText(lastName.get(0), lastNameValue, "Last name");
    }

    public void setMemberEmployer(String memberEmployerValue) {
        typeText(memberEmployer.get(0), memberEmployerValue, "Member employer");
    }

    public void setMemberOccupation(String memberOccupationValue) {
        typeText(memberOccupation.get(0), memberOccupationValue, "Member occupation");
    }

    public void setState(String stateValue) {
//        driver.switchTo().frame("addressIframe");
//        Select s = new Select(driver.findElement(By.xpath("//select")));
//        s.selectByVisibleText(stateValue);
        typeTextEnter(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8534406']")), stateValue, "State");
//        infoLog("Successfully selected " + stateValue + " State");
//        driver.switchTo().parentFrame();
    }

    public void setPartnerFirstName(String partnerFirstNameValue) throws Throwable {
        typeTexts(firstName, 1, partnerFirstNameValue);
    }

    public void setPartnerLastName(String partnerLastNameValue) throws Throwable {
        typeTexts(lastName, 1, partnerLastNameValue);
    }

    public void setPrimaryRiskAddressLine1(String riskAddressLine1Value) {
//        driver.switchTo().frame("addressIframe");
        typeTextEnter(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8414905']")), riskAddressLine1Value, "Risk address line 1");
        driver.switchTo().parentFrame();
    }

    public void setCity(String cityValue) {
//        driver.switchTo().frame("addressIframe");
        typeTextEnter(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_8534206']")), cityValue, "City");
        driver.switchTo().parentFrame();
    }

    public void setZipCode(String zipCodeValue) {
//        driver.switchTo().frame("addressIframe");
        typeTextEnter(driver.findElement(By.xpath("//input[@osviewid='PAI_393402_OT_53_OI_1_BI_1981333_CI_7979502']")), zipCodeValue, "ZIP code");
        driver.switchTo().parentFrame();
    }

    public void livedAtAddressMoreThanSixMonths(String moreThanSixMonths) throws Throwable {
        choose(sixMonthsYes, sixMonthsNo, moreThanSixMonths, "More than six months");
    }

    public void entertainerAthletePoliticalFigure(String athletePolitical) throws Throwable {
        choose(memberOfHouseholdYes, memberOfHouseholdNo, athletePolitical, "Entertainer or athlete");
    }

    public void setSpousePartner(String spousePartnerValue) throws InterruptedException {
        pause(3000);
        typeTextEnter(spousePartner.get(0), spousePartnerValue, "Spouse partner");
        if (!spousePartner.get(0).getAttribute("value").equals(spousePartnerValue)) {
            typeTextEnter(spousePartner.get(0), spousePartnerValue, "Spouse partner (retry)");
        }
    }

    public void setSSN(String value) {
        typeTextEnter(ssn.get(0), value, "ssn");
    }
}