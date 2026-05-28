package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class MemberInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public MemberInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Existing Agency Client?']/../../../../div//label[text()='No']/..//input")
    WebElement existingAgencyClientNo;
    @FindBy(xpath = "//div[text()='Existing Agency Client?']/../../../../div//label[text()='Yes']/..//input")
    WebElement existingAgencyClientYes;
    @FindBy(xpath = "//div[text()='Has any company cancelled or refused to insure in the past 3 years?']/../../../../div//label[text()='No']/..//input")
    WebElement cancelledOrRefusedNo;
    @FindBy(xpath = "//div[text()='Has any company cancelled or refused to insure in the past 3 years?']/../../../../div//label[text()='Yes']/..//input")
    WebElement cancelledOrRefusedYes;
    @FindBy(xpath = "//div[contains(text(),'coverage been non-renewed')]/../../../../div//label[text()='No']/..//input")
    WebElement coverageNonRenewedOrDeclinedNo;
    @FindBy(xpath = "//div[contains(text(),'coverage been non-renewed')]/../../../../div//label[text()='Yes']/..//input")
    WebElement coverageNonRenewedOrDeclinedYes;
    @FindBy(xpath = "//div[contains(text(),'Does the insured keep one or more dangerous dogs?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement dangerousDogsYes;
    @FindBy(xpath = "//div[contains(text(),'Does the insured keep one or more dangerous dogs?')]/../../../../div//label[text()='No']/..//input")
    WebElement dangerousDogsNo;
    @FindBy(xpath = "//div[text()='Has any member of the Household been involved in any Litigation pertaining to Personal Excess Insurance in the past 5 Years? ']/../../../../div//label[text()='Yes']/..//input")
    WebElement householdInvolvedYes;
    @FindBy(xpath = "//div[text()='Has any member of the Household been involved in any Litigation pertaining to Personal Excess Insurance in the past 5 Years? ']/../../../../div//label[text()='No']/..//input")
    WebElement householdInvolvedNo;
    @FindBy(xpath = "//div[text()='Do you employ any Domestic Employees?']/../../../../div//label[text()='Yes']/..//input")
    WebElement domesticEmployeesYes;
    @FindBy(xpath = "//div[text()='Do you employ any Domestic Employees?']/../../../../div//label[text()='No']/..//input")
    WebElement domesticEmployeesNo;
    @FindBy(xpath = "//div[text()='Has any member of the Household had an allegation made against them by a Domestic Employee?']/../../../../div//label[text()='Yes']/..//input")
    WebElement householdAllegationYes;
    @FindBy(xpath = "//div[text()='Has any member of the Household had an allegation made against them by a Domestic Employee?']/../../../../div//label[text()='No']/..//input")
    WebElement householdAllegationNo;
    @FindBy(xpath = "//div[contains(text(),'Are you, or is a member of your household a Media Personality')]/../../../../div//label[text()='Yes']/..//input")
    WebElement memberHouseholdMediaPersonalityYes;
    @FindBy(xpath = "//div[contains(text(),'Are you, or is a member of your household a Media Personality')]/../../../../div//label[text()='No']/..//input")
    WebElement memberHouseholdMediaPersonalityNo;
    @FindBy(xpath = "//div[text()='Member Occupation']/../../../../..//input")
    WebElement memberOccupation;
    @FindBy(xpath = "//div[text()='Member Employer']/../../../../..//input")
    WebElement memberEmployer;
    @FindBy(xpath = "//div[contains(text(),'Are you, or is a member of your household a Media Personality, Professional Entertainer')]/../../../../div//label[text()='Yes']/..//input")
    WebElement memberInformationMemberOfYourHouseholdMediaYes;
    @FindBy(xpath = "//div[contains(text(),'Are you, or is a member of your household a Media Personality, Professional Entertainer')]/../../../../div//label[text()='No']/..//input")
    WebElement memberInformationMemberOfYourHouseholdMediaNo;

    public void fillOutMemberInformation(Map<String, String> data) throws Throwable {
        verifyBlockExists("Member Information");
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "MO": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client"));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs"));
                            }
                            break;
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "ID":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "NV":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "FL":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "AL": {
                                pause(3000);
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client"));
                                choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled"));
                                choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage"));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "NV":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "FL":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "ID": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client"));
                                choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled"));
                                choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage"));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs"));
                            }
                            break;
                            case "MO": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client"));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("State")) {
                    case "FL":
                    case "MS":
                    case "AL":
                    case "GA":
                    case "LA":
                    case "MA":
                    case "SC":
                    case "NJ":
                    case "NC":
                    case "NY":
                    case "TX": {
                        pause(2000);
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client"));
                        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs"));
                    }
                    break;
                    case "CA": {
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client"));
                        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage"));
                        choose(memberHouseholdMediaPersonalityYes, memberHouseholdMediaPersonalityNo, data.get("Member_Of_Your_Household_Media"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs"));
                    }
                    break;
                }
            }
            break;
            case "Excess Liability": {
                choose(householdInvolvedYes, householdInvolvedNo, data.get("Household_Involved_Litigation"));
                choose(domesticEmployeesYes, domesticEmployeesNo, data.get("Domestic_Employees"));
                choose(householdAllegationYes, householdAllegationNo, data.get("Household_Allegation"));
            }
            break;
        }
    }

    public void fillOutMemberInformation_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Member Information");
        switch (data.get("Residence_Type_END")) {
                    case "Homeowner": {
                        switch (data.get("State_END")) {
                            case "MO": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_END"));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_END"));
                            }
                            break;
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "ID":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "NV":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "FL":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "AL": {
                                pause(3000);
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_END"));
                                choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_END"));
                                choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_END"));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_END"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State_END")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "NV":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "FL":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "ID": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_END"));
                                choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_END"));
                                choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_END"));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_END"));
                            }
                            break;
                            case "MO": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_END"));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_END"));
                            }
                            break;
                        }
                    }
                    break;
                }
    }

    public void fillOutMemberInformation_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Member Information");
        switch (data.get("Residence_Type_OOS_END")) {
            case "Homeowner": {
                switch (data.get("State_OOS_END")) {
                    case "MO": {
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_OOS_END"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_OOS_END"));
                    }
                    break;
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "ID":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "AZ":
                    case "NV":
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "CO":
                    case "RI":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "VA":
                    case "NC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "AL": {
                        pause(3000);
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_OOS_END"));
                        choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_OOS_END"));
                        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_OOS_END"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_OOS_END"));
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_OOS_END")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "AZ":
                    case "NV":
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "CO":
                    case "RI":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "VA":
                    case "NC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "ID": {
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_OOS_END"));
                        choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_OOS_END"));
                        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_OOS_END"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_OOS_END"));
                    }
                    break;
                    case "MO": {
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_OOS_END"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_OOS_END"));
                    }
                    break;
                }
            }
            break;
        }
    }

    public void fillOutMemberInformation_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("Member Information");
        switch (data.get("Residence_Type_RNW")) {
            case "Homeowner": {
                switch (data.get("State_RNW")) {
                    case "MO": {
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_RNW"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_RNW"));
                    }
                    break;
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "ID":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "AZ":
                    case "NV":
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "CO":
                    case "RI":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "VA":
                    case "NC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "AL": {
                        pause(3000);
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_RNW"));
                        choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_RNW"));
                        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_RNW"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_RNW"));
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_RNW")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "AZ":
                    case "NV":
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "CO":
                    case "RI":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "VA":
                    case "NC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "ID": {
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_RNW"));
                        choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_RNW"));
                        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_RNW"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_RNW"));
                    }
                    break;
                    case "MO": {
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_RNW"));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_RNW"));
                    }
                    break;
                }
            }
            break;
        }
    }

    public void fillOutMemberInformation(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        switch (data.get("State_" + i)) {
                            case "MO": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_" + i));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_" + i));
                            }
                            break;
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "ID":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "NV":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "FL":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "AL": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_" + i));
                                choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_" + i));
                                choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_" + i));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_" + i));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "NV":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "FL":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "ID": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_" + i));
                                choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_" + i));
                                choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_" + i));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_" + i));
                            }
                            break;
                            case "MO": {
                                choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_" + i));
                                choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_" + i));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("State_" + i)) {
                    case "FL":
                    case "MS":
                    case "AL":
                    case "GA":
                    case "LA":
                    case "MA":
                    case "SC":
                    case "NJ":
                    case "NC":
                    case "NY":
                    case "TX": {
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_" + i));
                        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_" + i));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_" + i));
                    }
                    break;
                    case "CA": {
                        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_" + i));
                        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_" + i));
                        choose(memberHouseholdMediaPersonalityYes, memberHouseholdMediaPersonalityNo, data.get("Member_Of_Your_Household_Media_" + i));
                        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs_" + i));
                    }
                    break;
                }
            }
            break;
            case "Excess Liability": {
                choose(householdInvolvedYes, householdInvolvedNo, data.get("Household_Involved_Litigation_" + i));
                choose(domesticEmployeesYes, domesticEmployeesNo, data.get("Domestic_Employees_" + i));
                choose(householdAllegationYes, householdAllegationNo, data.get("Household_Allegation_" + i));
            }
            break;
        }
    }

    public void fillOutMemberInformationDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("member information");
        setExistingAgencyClient(data.get("Member_Information_Existing_Agency_Client"));
        setCancelledOrRefused(data.get("Member_Information_Has_Any_Company_Cancelled_Or_Refused_To_Insure_In_The_Past_3_Years"));
        setHasCoverageBeenNonRenewedOrDeclined(data.get("Member_Information_Has_Coverage_Been_Non_Renewed_Or_Declined"));
    }

    public void fillOutMemberInformationDetailsPA_END(Map<String, String> data) throws Throwable {
        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_END"));
        choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_END"));
        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_END"));
    }

    public void fillOutMemberInformationDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client_OOS_END"));
        choose(cancelledOrRefusedYes, cancelledOrRefusedNo, data.get("Any_Company_Refused_Or_Cancelled_OOS_END"));
        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage_OOS_END"));
    }

    public void fillOutMemberInformationDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setExistingAgencyClient(data.get("Member_Information_Existing_Agency_Client_RNW"));
        setCancelledOrRefused(data.get("Member_Information_Has_Any_Company_Cancelled_Or_Refused_To_Insure_In_The_Past_3_Years_RNW"));
        setHasCoverageBeenNonRenewedOrDeclined(data.get("Member_Information_Has_Coverage_Been_Non_Renewed_Or_Declined_RNW"));
    }

    public void fillOutMemberInformationDetailCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("member information");
        verifyMemberOccupation(data.get("Member_Information_Member_Occupation"));
        verifyMemberEmployer(data.get("Member_Information_Member_Employer"));
        setExistingAgencyClient(data.get("Member_Information_Existing_Agency_Client"));
        setHasCoverageBeenNonRenewedOrDeclined(data.get("Member_Information_Has_Coverage_Been_Non_Renewed_Or_Cancelled"));
        setDoesTheInsuredKeepOneOrMoreDangerousDogs(data.get("Member_Information_Does_The_Insured_Keep_One_Or_More_Dangerous_Dogs"));
        saveChanges();
    }

    public void fillOutMemberInformationDetailCC_END(Map<String, String> data) throws Throwable {
        verifyMemberOccupation(data.get("Member_Information_Member_Occupation_END"));
        verifyMemberEmployer(data.get("Member_Information_Member_Employer_END"));
        setExistingAgencyClient(data.get("Member_Information_Existing_Agency_Client_END"));
        setHasCoverageBeenNonRenewedOrDeclined(data.get("Member_Information_Has Coverage Been Non_Renewed_Or_Cancelled_END"));
        setDoesTheInsuredKeepOneOrMoreDangerousDogs(data.get("Member_Information_Does_The_Insured_Keep_One_Or_More_Dangerous_Dogs_END"));
        saveChanges();
    }

    public void fillOutMemberInformationDetailHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("member information");
        verifyMemberOccupation(data.get("Member_Information_Member_Occupation"));
        verifyMemberEmployer(data.get("Member_Information_Member_Employer"));
        setExistingAgencyClient(data.get("Member_Information_Existing_Agency_Client"));
        setHasCoverageBeenNonRenewedOrDeclined(data.get("Member_Information_Has_Coverage_Been_Non_Renewed_Or_Cancelled"));
        setDoesTheInsuredKeepOneOrMoreDangerousDogs(data.get("Member_Information_Does_The_Insured_Keep_One_Or_More_Dangerous_Dogs"));
        if (data.get("State").equalsIgnoreCase("CA")) {
            setMemberInformationMemberOfYourHouseholdMedia(data.get("Member_Information_Member_Of_Your_Household_Media"));
        }
        saveChanges();
    }

    public void fillOutMemberInformationDetailHS_END(Map<String, String> data) throws Throwable {
        verifyMemberOccupation(data.get("Member_Information_Member_Occupation_END"));
        verifyMemberEmployer(data.get("Member_Information_Member_Employer_END"));
        setExistingAgencyClient(data.get("Member_Information_Existing_Agency_Client_END"));
        setHasCoverageBeenNonRenewedOrCanceled(data.get("Member_Information_Has_Coverage_Been_Non_Renewed_Or_Cancelled_END"));
        setDoesTheInsuredKeepOneOrMoreDangerousDogs(data.get("Member_Information_Does_The_Insured_Keep_One_Or_More_Dangerous_Dogs_END"));
        if (data.get("State").equalsIgnoreCase("CA")) {
            setMemberInformationMemberOfYourHouseholdMedia(data.get("Member_Information_Member_Of_Your_Household_Media_END"));
        }
        saveChanges();
    }

    public void fillOutMemberInformationDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        verifyMemberOccupation(data.get("Member_Information_Member_Occupation_OOS_END"));
        verifyMemberEmployer(data.get("Member_Information_Member_Employer_OOS_END"));
        setExistingAgencyClient(data.get("Member_Information_Existing_Agency_Client_OOS_END"));
        setHasCoverageBeenNonRenewedOrCanceled(data.get("Member_Information_Has_Coverage_Been_Non_Renewed_Or_Cancelled_OOS_END"));
        setDoesTheInsuredKeepOneOrMoreDangerousDogs(data.get("Member_Information_Does_The_Insured_Keep_One_Or_More_Dangerous_Dogs_OOS_END"));
        if (data.get("State").equalsIgnoreCase("CA")) {
            setMemberInformationMemberOfYourHouseholdMedia(data.get("Member_Information_Member_Of_Your_Household_Media_OOS_END"));
        }
        saveChanges();
    }

    public void fillOutMemberInformationDetailHS_RNW(Map<String, String> data) throws Throwable {
        verifyMemberOccupation(data.get("Member_Information_Member_Occupation_RNW"));
        verifyMemberEmployer(data.get("Member_Information_Member_Employer_RNW"));
        setExistingAgencyClient(data.get("Member_Information_Existing_Agency_Client_RNW"));
        setHasCoverageBeenNonRenewedOrCanceled(data.get("Member_Information_Has_Coverage_Been_Non_Renewed_Or_Cancelled_RNW"));
        setDoesTheInsuredKeepOneOrMoreDangerousDogs(data.get("Member_Information_Does_The_Insured_Keep_One_Or_More_Dangerous_Dogs_RNW"));
        if (data.get("State").equalsIgnoreCase("CA")) {
            setMemberInformationMemberOfYourHouseholdMedia(data.get("Member_Information_Member_Of_Your_Household_Media_RNW"));
        }
        saveChanges();
    }

    public void setExistingAgencyClient(String value) throws Throwable {
        choose(existingAgencyClientYes, existingAgencyClientNo, value, "Existing agency client");
    }

    public void setHasCoverageBeenNonRenewedOrDeclined(String value) throws Throwable {
        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, value, "Has coverage been non renewed or canceled");
    }

    public void setCancelledOrRefused(String value) throws Throwable {
        choose(cancelledOrRefusedYes, cancelledOrRefusedNo, value, "Has coverage been canceled or refused");
    }

    public void setDoesTheInsuredKeepOneOrMoreDangerousDogs(String value) throws Throwable {
        choose(dangerousDogsYes, dangerousDogsNo, value, "Does the insured keep one or more dangerous dogs");
    }

    public void setMemberInformationMemberOfYourHouseholdMedia(String value) throws Throwable {
        choose(memberInformationMemberOfYourHouseholdMediaYes, memberInformationMemberOfYourHouseholdMediaNo, value, "Member Information Member Of Your Household Media");
    }

    public void setHasCoverageBeenNonRenewedOrCanceled(String value) throws Throwable {
        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, value, "Has coverage been non renewed or canceled");
    }

    public void verifyMemberOccupation(String value) {
        assertCellValue(memberOccupation, value, "Member occupation");
    }

    public void verifyMemberEmployer(String value) {
        assertCellValue(memberEmployer, value, "Member employer");
    }

    public void fillOutMemberInformationDetailFS(Map<String, String> data) throws Throwable {
        choose(existingAgencyClientYes, existingAgencyClientNo, data.get("Existing_Agency_Client"));
        choose(coverageNonRenewedOrDeclinedYes, coverageNonRenewedOrDeclinedNo, data.get("Non_Renewed_Or_Declined_Coverage"));
        choose(dangerousDogsYes, dangerousDogsNo, data.get("Dangerous_Dogs"));
        verifyBlockExists("member information");
    }


}