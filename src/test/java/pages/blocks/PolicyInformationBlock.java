package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class PolicyInformationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public PolicyInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label//div[text()='Term']/../../../..//input")
    WebElement term;
    @FindBy(xpath = "//label//div[text()='Effective Date']/../../../..//input")
    WebElement effectiveDate;
    @FindBy(xpath = "//label//div[text()='Expiration Date']/../../../..//input")
    WebElement expirationDate;
    @FindBy(xpath = "//label//div[text()='Named Insured Type']/../../../..//input")
    WebElement namedInsuredType;
    @FindBy(xpath = "//div[contains(text(),'Entity Name')]/../../../..//input")
    WebElement entityName;
    @FindBy(xpath = "//label//div[text()='Quote Name']/../../../..//input")
    WebElement quoteName;
    @FindBy(xpath = "//label//div[text()='Licensed Producer']/../../../..//input")
    WebElement licencedProducer;
    @FindBy(xpath = "//label//div[text()='Advisor / Servicer']/../../../..//input")
    WebElement advisorServicer;
    @FindBy(xpath = "//div//label[contains(text(),'PURE Jewelry')]/..//input")
    List<WebElement> doesTheMemberHavePureJewelry;
    @FindBy(xpath = "//div//label[contains(text(),'PURE Personal Excess')]/..//input")
    List<WebElement> doesTheMemberHavePurePersonalExcess;
    @FindBy(xpath = "//div//label[contains(text(),'PURE High Value Homeowners')]/..//input")
    WebElement doesTheMemberHavePureHighValueHomeowners;
    @FindBy(xpath = "//label//div[text()='Current Homeowners Insurance Carrier']/../../../..//input")
    WebElement currentHomeownersInsuranceCarrier;
    @FindBy(xpath = "//label//div[text()='Current Premium']/../../../..//input")
    WebElement currentPremium;
    @FindBy(xpath = "//div//label[contains(text(),'PURE Private Fleet Auto')]/..//input")
    WebElement doesTheMemberHaveAPurePrivateAuto;
    @FindBy(xpath = "//div//label[contains(text(),'PURE Homeowners')]/..//input")
    List<WebElement> doesTheMemberHavePureHomeowners;
    @FindBy(xpath = "//span/div[contains(text(),'State political figure?')]/../../../../div//label[text()='No']/..//input")
    WebElement stateOrPoliticalFigureNo;
    @FindBy(xpath = "//span/div[contains(text(),'State political figure?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement stateOrPoliticalFigureYes;
    @FindBy(xpath = "//label[text()='Does or will the member insure the balance of their account with PURE?']/..//input")
    WebElement doesMemberInsureBalanceWithPURE;
    @FindBy(xpath = "//div[text()='Previous Policy Number']/../../../..//input")
    WebElement previousPolicyNumber;
    @FindBy(xpath = "//label[text()='Policy Rewrite']/..//input")
    WebElement policyRewrite;
    @FindBy(xpath = "//div[text()='Primary Location']/../../../..//input")
    WebElement primaryLocation;
    @FindBy(xpath = "//div[text()='Address Line 1']/../../../..//input")
    WebElement addressLine1;
    @FindBy(xpath = "//div[text()='City']/../../../..//input")
    WebElement city;
    @FindBy(xpath = "//div[text()='State']/../../../..//input")
    WebElement state;
    @FindBy(xpath = "//div[text()='ZIP Code']/../../../..//input")
    WebElement zip;
    @FindBy(xpath = "//div[text()='policy information']")
    WebElement policyInformationBlock;
    @FindBy(xpath = "//label[contains(text(),'member insure the balance')]/..//input")
    WebElement memberInsureTheBalance;
    @FindBy(xpath = "//span[text()='Create new Entity']")
    WebElement createNewEntity;
    @FindBy(xpath = "//div[text()='Trust, LLC or Other Legal Entity']/../../../..//input")
    WebElement trustLLC;
    @FindBy(xpath = "//div[text()='Name of Resident']/../../../..//input")
    WebElement nameOfResident;
    @FindBy(xpath = "//label[text()='Waive Surplus Lines Broker Fee']/..//input")
    WebElement waiveSurplusLinesBrokerFee;
    @FindBy(xpath = "//div[text()='Census Tract']/../../../..//input")
    WebElement censusTract;
    @FindBy(xpath = "//div[text()='Other Legal Entity']/../../../..//input")
    WebElement otherLegalEntityName;
    @FindBy(xpath = "//div[text()='Limited Liability Company (LLC)']/../../../..//input")
    WebElement llcName;
    @FindBy(xpath = "//div[text()='Trust']/../../../..//input")
    WebElement trustName;
    @FindBy(xpath = "//div[text()='Territory']/../../../..//input")
    WebElement territory;
    @FindBy(xpath = "//div[text()='Manager Census Tract Override']/../../../..//input")
    List<WebElement> managerCensusTractOverride;
    @FindBy(xpath = "//div[text()='Census Tract Override']/../../../..//input[@aria-hidden='false']")
    WebElement censusTractOverride;
    @FindBy(xpath = "//div[text()='Is this Primary Flood policy replacing existing primary flood coverage?']/../../../../div//label[text()='Yes']/..//input")
    WebElement primaryFloodPolicyYes;
    @FindBy(xpath = "//div[text()='Is this Primary Flood policy replacing existing primary flood coverage?']/../../../../div//label[text()='No']/..//input")
    WebElement primaryFloodPolicyNo;
    @FindBy(xpath = "//div[text()='If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?']/../../../../div//label[text()='Yes']/..//input")
    WebElement issuedWithEffDateYes;
    @FindBy(xpath = "//div[text()='If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?']/../../../../div//label[text()='No']/..//input")
    WebElement issuedWithEffDateNo;

    public void fillPolicyInformationDetailsEX(Map<String, String> data) throws Throwable {
        if (isVisibleOnly(By.xpath("//div//label[contains(text(),'PURE High Value Homeowners')]/..//input")))
            setDoesTheMemberHaveHighValueHomeowners(data.get("High_Value_Homeowners"));
        setDoesTheMemberHaveAPurePrivateAuto(data.get("Private_Fleet_Auto"));
        setNamedInsuredType(data.get("Named_Insured_Type"));
        clickFooter();
        setTrustLLCOrOtherLegalEntityName(data.get("Named_Insured_Type"), data.get("Policy_Information_Entity_Name"));
        verifyBlockExists("policy information");
    }

    public void fillPolicyInformationDetailsEX_END(Map<String, String> data) throws Throwable {
        setDoesTheMemberHaveHighValueHomeowners(data.get("High_Value_Homeowners_END"));
        setDoesTheMemberHaveAPurePrivateAuto(data.get("Private_Fleet_Auto_END"));
        setNamedInsuredType(data.get("Named_Insured_Type_END"));
    }

    public void fillPolicyInformationDetailsEX_OOS_END(Map<String, String> data) throws Throwable {
        setDoesTheMemberHaveHighValueHomeowners(data.get("High_Value_Homeowners_OOS_END"));
        setDoesTheMemberHaveAPurePrivateAuto(data.get("Private_Fleet_Auto_OOS_END"));
        setNamedInsuredType(data.get("Named_Insured_Type_OOS_END"));
    }

    public void fillPolicyInformationDetailsEX_RNW(Map<String, String> data) throws Throwable {
        setDoesTheMemberHaveHighValueHomeowners(data.get("High_Value_Homeowners_RNW"));
        setDoesTheMemberHaveAPurePrivateAuto(data.get("Private_Fleet_Auto_RNW"));
        setNamedInsuredType(data.get("Named_Insured_Type_RNW"));
    }

    public void fillPolicyInformationDetailsPA(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type"));
        clickFooter();
        setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type"), data.get("Policy_Information_Entity_Name"));
        setPolicyRewrite(data.get("Policy_Information_Policy_Rewrite"), data.get("Policy_Information_Previous_Policy_Number"));
        setDoesTheMemberHavePureHomeowners(data.get("Policy_Information_Does_The_Member_Have_A_PURE_Homeowners_Policy"));

        if (!data.get("State").equalsIgnoreCase("MT")) {
            setDoesTheMemberHavePurePersonalExcess(data.get("Policy_Information_Does_The_Member_Have_A_PURE_Personal_Excess_Policy_With_A_Limit_of_$5_Mil_Or_More"));
        }

        if (!data.get("State").equalsIgnoreCase("MT") &&
                !data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheMemberHavePureJewelry(data.get("Policy_Information_Does_The_Member_Have_A_Qualifying_PURE_Jewelry_&_Art_Policy_With_At_Least_$25_000_Of_Scheduled_Jewelry_Or_$250_000"));
        }

        setQuoteName(data.get("Policy_Information_Quote_Name"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer"));
        verifyBlockExists("policy information");
    }

    public void fillPolicyInformationDetailsPA_END(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_END"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_END"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_END"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_END"));
        setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type_END"), data.get("Policy_Information_Entity_Name_END"));
        setPolicyRewrite(data.get("Policy_Information_Policy_Rewrite_END"), data.get("Policy_Information_Previous_Policy_Number_END"));
        setDoesTheMemberHavePureHomeowners(data.get("Policy_Information_Does_The_Member_Have_A_PURE_Homeowners_Policy_END"));

        if (!data.get("State").equalsIgnoreCase("MT")) {
            setDoesTheMemberHavePurePersonalExcess(data.get("Policy_Information_Does_The_Member_Have_A_PURE_Personal_Excess_Policy_With_A_Limit_of_$5_Mil_Or_More_END"));
        }

        if (!data.get("State").equalsIgnoreCase("MT") &&
                !data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheMemberHavePureJewelry(data.get("Policy_Information_Does_The_Member_Have_A_Qualifying_PURE_Jewelry_&_Art_Policy_With_At_Least_$25_000_Of_Scheduled_Jewelry_Or_$250_000_END"));
        }

        setQuoteName(data.get("Policy_Information_Quote_Name_END"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_END"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_END"));
    }

    public void fillPolicyInformationDetailsCO(Map<String, String> data) throws Throwable {
        pause(3000);
        setNamedInsuredType(data.get("Named_Insured_Type"));
        clickFooter();
        setTrustLLCOrOtherLegalEntityName(data.get("Named_Insured_Type"), data.get("Policy_Information_Entity_Name"));
        setDoesTheMemberHavePureHomeowners(data.get("Member_Have_Homeowners_Policy"));
//        setDoesTheMemberHavePurePersonalExcess(data.get("Member_Have_Personal_Excess_Policy"));
//        setDoesTheMemberHavePureJewelry(data.get("Member_Have_Collections_Policy"));
        verifyBlockExists("policy information");
    }

    public void fillPolicyInformationDetailsHS(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term"));
        setQuoteName(data.get("Policy_Information_Quote_Name"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date"));
        setWaiveSurplusLinesBrokerFee(data.get("Policy_Information_Waive_Surplus_Lines_Broker_Fee"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type"));
        if (data.get("Policy_Information_Named_Insured_Type").equalsIgnoreCase("Other Legal Entity")) {
            setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity"));
        }

        checkPolicyRewrite(data.get("Policy_Information_Policy_Rewrite"));
        if (data.get("Policy_Information_Policy_Rewrite").equalsIgnoreCase("Other Legal Entity")) {
            setPreviousPolicyNumber(data.get("Policy_Information_Previous_Policy_Number"));
        }

        if (!data.get("State").equalsIgnoreCase("CA")) {
            checkDoesMemberInsureBalanceWithPURE(data.get("Policy_Information_Does_Member_Insure_Balance_With_PURE"));
            if (!data.get("State").equalsIgnoreCase("NY")) {
                verifyStateOrPoliticalFigure(data.get("Policy_Information_Entertainer_Or_Athlete"));
            }
        }
        verifyBlockExists("policy information");
    }

    public void fillPolicyInformationDetailsHS_END(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_END"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_END"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_END"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_END"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_END"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_END"));
        if (data.get("Policy_Information_Named_Insured_Type_END").equalsIgnoreCase("Other Legal Entity")) {
            setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type_END"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity_END"));
        }

        checkPolicyRewrite(data.get("Policy_Information_Policy_Rewrite_END"));
        if (data.get("Policy_Information_Policy_Rewrite_END").equalsIgnoreCase("Other Legal Entity"))
            setPreviousPolicyNumber(data.get("Policy_Information_Previous_Policy_Number_END"));

        checkDoesMemberInsureBalanceWithPURE(data.get("Policy_Information_Does_Member_Insure_Balance_With_PURE_END"));
        if (!data.get("State").equalsIgnoreCase("NY_END"))
            verifyStateOrPoliticalFigure(data.get("Policy_Information_Entertainer_Or_Athlete_END"));
        saveChanges();
    }

    public void fillPolicyInformationDetailsHO(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type"));
        setStateOrPoliticalFigure(data.get("Policy_Information_You_Or_Member_Entertainer_Athlete"));
        setQuoteName(data.get("Policy_Information_Quote_Name"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer"));
        setLLCTrustOtherEntityNameAndCreateHO(data.get("Policy_Information_Named_Insured_Type"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity"), data.get("Policy_Information_Trust_LLC_Resident_Name"));
        setDoesTheMemberHavePurePersonalExcess(data.get("Policy_Information_Member_Have_Excess_Policy"));
        setDoesTheMemberHavePureJewelry(data.get("Policy_Information_Member_Have_Collections_Policy"));
        setDoesTheMemberHaveAPurePrivateAuto(data.get("Policy_Information_Member_Have_Auto_Policy"));
        checkIfNamedInsuredTypeIsEmpty(data.get("Policy_Information_Named_Insured_Type"));
        verifyBlockExists("policy information");
    }

    public void fillPolicyInformationDetailsHO_END(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_END"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_END"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_END"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_END"));
        setStateOrPoliticalFigure(data.get("Policy_Information_You_Or_Member_Entertainer_Athlete_END"));
        setQuoteName(data.get("Policy_Information_Quote_Name_END"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_END"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_END"));
        setLLCTrustOtherEntityNameAndCreateHO(data.get("Policy_Information_Named_Insured_Type_END"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity_END"), data.get("Policy_Information_Trust_LLC_Resident_Name_END"));
        setDoesTheMemberHavePurePersonalExcess(data.get("Policy_Information_Member_Have_Excess_Policy_END"));
        setDoesTheMemberHavePureJewelry(data.get("Policy_Information_Member_Have_Collections_Policy_END"));
        setDoesTheMemberHaveAPurePrivateAuto(data.get("Policy_Information_Member_Have_Auto_Policy_END"));
        checkIfNamedInsuredTypeIsEmpty(data.get("Policy_Information_Named_Insured_Type_END"));
        verifyBlockExists("policy information");
    }

    public void fillPolicyInformationDetailsHO_OOS_END(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_OOS_END"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_OOS_END"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_OOS_END"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_OOS_END"));
        setStateOrPoliticalFigure(data.get("Policy_Information_You_Or_Member_Entertainer_Athlete_OOS_END"));
        setQuoteName(data.get("Policy_Information_Quote_Name_OOS_END"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_OOS_END"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_OOS_END"));
        setLLCTrustOtherEntityNameAndCreateHO(data.get("Policy_Information_Named_Insured_Type_OOS_END"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity_OOS_END"), data.get("Policy_Information_Trust_LLC_Resident_Name_OOS_END"));
        setDoesTheMemberHavePurePersonalExcess(data.get("Policy_Information_Member_Have_Excess_Policy_OOS_END"));
        setDoesTheMemberHavePureJewelry(data.get("Policy_Information_Member_Have_Collections_Policy_OOS_END"));
        setDoesTheMemberHaveAPurePrivateAuto(data.get("Policy_Information_Member_Have_Auto_Policy_OOS_END"));
        checkIfNamedInsuredTypeIsEmpty(data.get("Policy_Information_Named_Insured_Type_OOS_END"));
        verifyBlockExists("policy information");
    }

    public void fillPolicyInformationDetailsHO_RNW(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_RNW"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_RNW"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_RNW"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_RNW"));
        setStateOrPoliticalFigure(data.get("Policy_Information_You_Or_Member_Entertainer_Athlete_RNW"));
        setQuoteName(data.get("Policy_Information_Quote_Name_RNW"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_RNW"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_RNW"));
        setLLCTrustOtherEntityNameAndCreateHO(data.get("Policy_Information_Named_Insured_Type_RNW"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity_RNW"), data.get("Policy_Information_Trust_LLC_Resident_Name_RNW"));
        setDoesTheMemberHavePurePersonalExcess(data.get("Policy_Information_Member_Have_Excess_Policy_RNW"));
        setDoesTheMemberHavePureJewelry(data.get("Policy_Information_Member_Have_Collections_Policy_RNW"));
        setDoesTheMemberHaveAPurePrivateAuto(data.get("Policy_Information_Member_Have_Auto_Policy_RNW"));
        checkIfNamedInsuredTypeIsEmpty(data.get("Policy_Information_Named_Insured_Type_RNW"));
        verifyBlockExists("policy information");
    }

    public void fillPolicyInformationDetailsES(Map<String, String> data) throws Throwable {
        pause(5000);
        verifyBlockExists("policy information");
        setNamedInsuredType(data.get("Named_Insured_Type"));
        clickFooter();
        setTrustLLCOrOtherLegalEntityName(data.get("Named_Insured_Type"), data.get("Policy_Information_Entity_Name"));
        setQuoteName(data.get("Quote_Name"));
    }

    public void fillPolicyInformationDetailsPW(Map<String, String> data) throws Throwable {
        typeText(primaryLocation, "New Address");
        pause(2000);
        typeText(addressLine1, data.get("Address_Line_1_Txt"));
        typeText(state, data.get("State"));
        typeText(city, data.get("City_Name_Txt"));
        clickElement(policyInformationBlock);
        typeText(zip, data.get("Zip_Code"));
        setNamedInsuredType(data.get("Named_Insured_Type"));
        clickFooter();
        setTrustLLCOrOtherLegalEntityName(data.get("Named_Insured_Type"), data.get("Policy_Information_Entity_Name"));
        verifyBlockExists("policy information");
    }

    public void fillPolicyInformationDetailsCC(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type"));
        clickFooter();
        setStateOrPoliticalFigure(data.get("Policy_Information_You_Or_Member_Entertainer_Athlete"));
        setQuoteName(data.get("Policy_Information_Quote_Name"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer"));
        setWaiveSurplusLinesBrokerFee(data.get("Policy_Information_Waive_Surplus_Lines_Broker_Fee"));
        setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity"));
        verifyBlockExists("policy information");
        saveChanges();
    }

    public void fillPolicyInformationDetailsCC_END(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_END"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_END"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_END"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_END"));
        setStateOrPoliticalFigure(data.get("Policy_Information_You_Or_Member_Entertainer_Athlete_END"));
        setQuoteName(data.get("Policy_Information_Quote_Name_END"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_END"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_END"));
        setWaiveSurplusLinesBrokerFee(data.get("Policy_Information_Waive_Surplus_Lines_Broker_Fee_END"));
        setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type_END"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity_END"));
        saveChanges();
    }

    public void fillPolicyInformationDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_OOS_END"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_OOS_END"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_OOS_END"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_OOS_END"));
        setStateOrPoliticalFigure(data.get("Policy_Information_You_Or_Member_Entertainer_Athlete_OOS_END"));
        setQuoteName(data.get("Policy_Information_Quote_Name_OOS_END"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_OOS_END"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_OOS_END"));
        setWaiveSurplusLinesBrokerFee(data.get("Policy_Information_Waive_Surplus_Lines_Broker_Fee_OOS_END"));
        setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type_OOS_END"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity_OOS_END"));
        saveChanges();
    }

    public void fillPolicyInformationDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_RNW"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_RNW"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_RNW"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_RNW"));
        setStateOrPoliticalFigure(data.get("Policy_Information_You_Or_Member_Entertainer_Athlete_RNW"));
        setQuoteName(data.get("Policy_Information_Quote_Name_RNW"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_RNW"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_RNW"));
        setWaiveSurplusLinesBrokerFee(data.get("Policy_Information_Waive_Surplus_Lines_Broker_Fee_RNW"));
        setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type_RNW"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity_RNW"));
        saveChanges();
    }

    public void clickCreateNewEntity() throws InterruptedException {
        clickElement(createNewEntity, "Create new Entity");
        pause(3500);
    }

    public void setPolicyRewrite(String value, String number) throws Throwable {
        checkCheckbox(policyRewrite, value, "Policy Rewrite");
        setPreviousPolicyNumber(number);
    }

    public void setPreviousPolicyNumber(String value) {
        typeTextEnter(previousPolicyNumber, value, "Previous policy number");
    }

    public void setWaiveSurplusLinesBrokerFee(String value) throws Throwable {
        checkCheckbox(waiveSurplusLinesBrokerFee, value, "Waive Surplus Lines Broker Fee");
    }

    public void setTrustLLCOrOtherLegalEntityName(String policy_information_named_insured_type, String policy_information_trust_llc_other_legal_entity) throws InterruptedException {
        if (hasValue(policy_information_named_insured_type) && policy_information_named_insured_type.equalsIgnoreCase("Other Legal Entity")) {
            clickElement(createNewEntity, "Create new Entity");
            pause(3000);
            typeText(trustLLC, policy_information_trust_llc_other_legal_entity, "Trust LLC or Other Legal Entity");
        }
    }

    public void setTrustLLC(String value) {
        if (hasValue(value)) {
            typeText(trustLLC, value, "Trust LLC or Other Legal Entity");
        }
    }

    public void setEntityName(String policy_information_entity_name) {
        typeText(entityName, policy_information_entity_name, "Entity name");
    }

    public void setCurrentHomeownersInsuranceCarrier(String currentHomeownersInsuranceCarrierText) throws Throwable {
        typeText(currentHomeownersInsuranceCarrier, currentHomeownersInsuranceCarrierText);
    }

    public void setDoesTheMemberInsureTheBalance(String value) throws Throwable {
        checkCheckbox(memberInsureTheBalance, value);
    }

    public void setCurrentPremium(String currentPremiumText) throws Throwable {
        typeText(currentPremium, currentPremiumText);
    }

    public void setDoesTheMemberHavePureJewelry(String checked) throws Throwable {
        checkCheckboxes(doesTheMemberHavePureJewelry, 0, checked);
    }

    public void setDoesTheMemberHavePurePersonalExcess(String checked) throws Throwable {
        pause(2000);
        checkCheckboxes(doesTheMemberHavePurePersonalExcess, 0, checked);
    }

    public void setTerm(String termText) {
        typeText(term, termText, "Term");
    }

    public void setEffectiveDate(String dateText) throws InterruptedException {
        typeText(effectiveDate, dateText, "Effective date");
    }

    public void setExpirationDate(String expirationDateText) {
        typeText(expirationDate, expirationDateText, "Expiration date");
    }

    public void setNamedInsuredType(String namedInsuredTypeText) throws Throwable {
        clickFooter();
        typeTextEnter(namedInsuredType, namedInsuredTypeText, "Named insured type");
    }

    public void setDoesTheMemberHaveAPurePrivateAuto(String checked) throws Throwable {
        checkCheckbox(doesTheMemberHaveAPurePrivateAuto, checked, "Does the member have a pure private auto");
    }

    public void setQuoteName(String quoteNameText) throws Throwable {
        try {
            typeText(quoteName, quoteNameText);
        } catch (Exception e) {
            pause(5000);
            clickElement(quoteName);
            typeText(quoteName, quoteNameText);
        }
    }

    public void setLicencedProducer(String licencedProducerText) {
        typeText(licencedProducer, licencedProducerText, "Licensed producer");
    }

    public void setAdvisorServicer(String advisorServicerText) {
        typeText(advisorServicer, advisorServicerText, "Advisor servicer");
    }

    public void setDoesTheMemberHaveHighValueHomeowners(String checked) throws Throwable {
        pause(2000);
        checkCheckbox(doesTheMemberHavePureHighValueHomeowners, checked, "Does the member have pure high value homeowners");
    }

    public void setDoesTheMemberHavePureHomeowners(String checked) throws Throwable {
        try {
            checkCheckboxes(doesTheMemberHavePureHomeowners, 0, checked);
        } catch (Exception e) {

        }
    }

    public void setStateOrPoliticalFigure(String choose) throws Throwable {
        choose(stateOrPoliticalFigureYes, stateOrPoliticalFigureNo, choose, "State or political figure");
    }

    public void checkDoesMemberInsureBalanceWithPURE(String value) throws Throwable {
        checkCheckbox(doesMemberInsureBalanceWithPURE, value, "Does member insure balance with PURE");
    }

    public void checkPolicyRewrite(String value) throws Throwable {
        checkCheckbox(policyRewrite, value, "Policy rewrite");
    }

    public void verifyStateOrPoliticalFigure(String choose) throws Throwable {

        if (hasValue(choose)) {
            if (choose.equalsIgnoreCase("Yes")) {
                Assert.assertTrue(stateOrPoliticalFigureYes.isSelected());
            } else {
                Assert.assertTrue(stateOrPoliticalFigureNo.isSelected());
            }
        }
    }

    public void verifyExpirationDate(String value) {
        assertCellValue(expirationDate, value, "Expiration Date");
    }

    public void verifyCensusTract(String value) {
        assertCellValue(censusTract, value, "Census Tract");
    }

    public void verifyThatTheQuoteHasTheSameFutureEffectiveDateAsTheAdmittedHomeQuote(Map<String, String> data) {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.assertEquals(effectiveDate.getAttribute("value"), data.get("Effective_Date"), "Future effective date");
        commonComponentsAndActions.scrollToWebElement(effectiveDate);
        reportScreenshot("Effective Date" + System.currentTimeMillis(), "Same future effective date as the admitted Home quote");
    }

    public void verifyThatTheQuoteHasTheSystemCurrentDateAsEffectiveDate() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedCurrentDate = currentDate.format(formatter);
        commonComponentsAndActions.assertEquals(effectiveDate.getAttribute("value"), formattedCurrentDate, "Current date");
        commonComponentsAndActions.scrollToWebElement(effectiveDate);
        reportScreenshot("Current date" + System.currentTimeMillis(), "System current date as effective date");
    }

    public void setNameOfResident(String name_of_resident) {
        typeText(nameOfResident, name_of_resident, "Name of Resident");
    }

    public void setLLCTrustOtherEntityNameAndCreateHO(String insuredType, String entityName, String name_of_resident) throws InterruptedException {
        if (hasValue(insuredType) && !insuredType.equalsIgnoreCase("Individual")) {
            clickCreateNewEntity();
            pause(3000);
            if (insuredType.equalsIgnoreCase("Limited Liability Company (LLC)")) {
                setNameOfResident(name_of_resident);
                setLLCName(entityName);
            } else if (insuredType.equalsIgnoreCase("Trust")) {
                setNameOfResident(name_of_resident);
                setTrustName(entityName);
            } else {
                setOtherLegalEntityName(entityName);
            }
        }
    }

    public void setOtherLegalEntityName(String entity_name) {
        typeText(otherLegalEntityName, entity_name, "Entity Name");
    }

    public void setLLCName(String llc_name) {
        typeText(llcName, llc_name, "LLC Name");
    }

    public void setTrustName(String trust_name) {
        typeText(trustName, trust_name, "Trust Name");
    }

    public void overrideCensusTract(String value) throws Throwable {
        checkCheckbox(managerCensusTractOverride.get(0), "yes", "Manager Census Tract Override");
        pause(1000);
        typeTextEnter(censusTractOverride, value, "Census Tract Override");
        clickFooter();
    }

    public void verifyTerritory(String value) {
        assertCellValue(territory, value, "Territory");
    }

    public void verifyManagerCensusTractOverrideCheckbox(String value) {
        boolean isDisplayed = managerCensusTractOverride.size() > 0;

        if (value.equalsIgnoreCase("not displayed")) {
            if (isDisplayed)
                failAssertion("Census Tract Override checkbox is displayed");
            else
                successLog("Census Tract Override checkbox is not displayed");
        } else if (value.equalsIgnoreCase("displayed")) {
            if (!isDisplayed)
                failAssertion("Census Tract Override checkbox is not displayed");
            else
                successLog("Census Tract Override checkbox is displayed");
        }
        reportScreenshot("CensusTractOverride", "Census Tract Override Checkbox");
    }

    public void fillPolicyInformationDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_OOS_END"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_OOS_END"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_OOS_END"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_OOS_END"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_OOS_END"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_OOS_END"));
        if (data.get("Policy_Information_Named_Insured_Type_OOS_END").equalsIgnoreCase("Other Legal Entity")) {
            setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type_OOS_END"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity_OOS_END"));
        }

        checkPolicyRewrite(data.get("Policy_Information_Policy_Rewrite_OOS_END"));
        if (data.get("Policy_Information_Policy_Rewrite_OOS_END").equalsIgnoreCase("Other Legal Entity"))
            setPreviousPolicyNumber(data.get("Policy_Information_Previous_Policy_Number_OOS_END"));

        checkDoesMemberInsureBalanceWithPURE(data.get("Policy_Information_Does_Member_Insure_Balance_With_PURE_OOS_END"));
        if (!data.get("State").equalsIgnoreCase("NY_OOS_END"))
            verifyStateOrPoliticalFigure(data.get("Policy_Information_Entertainer_Or_Athlete_OOS_END"));
        saveChanges();
    }

    public void fillPolicyInformationDetailsHS_RNW(Map<String, String> data) throws Throwable {
        setTerm(data.get("Policy_Information_Term_RNW"));
        setEffectiveDate(data.get("Policy_Information_Effective_Date_RNW"));
        setLicencedProducer(data.get("Policy_Information_Licensed_Producer_RNW"));
        setAdvisorServicer(data.get("Policy_Information_Advisor_Servicer_RNW"));
        verifyExpirationDate(data.get("Policy_Information_Expiration_Date_RNW"));
        setNamedInsuredType(data.get("Policy_Information_Named_Insured_Type_RNW"));
        if (data.get("Policy_Information_Named_Insured_Type_RNW").equalsIgnoreCase("Other Legal Entity")) {
            setTrustLLCOrOtherLegalEntityName(data.get("Policy_Information_Named_Insured_Type_RNW"), data.get("Policy_Information_Trust_LLC_Or_Other_Legal_Entity_RNW"));
        }

        checkPolicyRewrite(data.get("Policy_Information_Policy_Rewrite_RNW"));
        if (data.get("Policy_Information_Policy_Rewrite_RNW").equalsIgnoreCase("Other Legal Entity"))
            setPreviousPolicyNumber(data.get("Policy_Information_Previous_Policy_Number_RNW"));

        checkDoesMemberInsureBalanceWithPURE(data.get("Policy_Information_Does_Member_Insure_Balance_With_PURE_RNW"));
        if (!data.get("State").equalsIgnoreCase("NY_RNW"))
            verifyStateOrPoliticalFigure(data.get("Policy_Information_Entertainer_Or_Athlete_RNW"));
        saveChanges();
    }

    public void checkIfNamedInsuredTypeIsEmpty(String value) throws Throwable {
        if (hasValue(value)) {
            if (!namedInsuredType.getAttribute("value").equalsIgnoreCase(value)) {
                typeTextEnter(namedInsuredType, value, "Named Insured Type");
                clickFooter();
            }
        }
    }

    public void fillPolicyInformationDetailsFS(Map<String, String> data) throws Throwable {
        setIfIssuedWithTheEffectiveDate(data.get("Primary_Flood_Issued_With_The_Effective_Date"));
        setPrimaryFloodPolicy(data.get("Primary_Flood_Policy"));
        verifyBlockExists("policy information");
    }

    private void setIfIssuedWithTheEffectiveDate(String primaryFloodIssuedWithTheEffectiveDate) throws Throwable {
        choose(issuedWithEffDateYes, issuedWithEffDateNo, primaryFloodIssuedWithTheEffectiveDate, "Issued with effective date");
    }

    public void setPrimaryFloodPolicy(String quote) throws Throwable {
        if (isElementDisplayed(primaryFloodPolicyNo)) {
            choose(primaryFloodPolicyYes, primaryFloodPolicyNo, quote, "Is this Primary Flood policy replacing existing primary flood coverage?");
        }
    }

}