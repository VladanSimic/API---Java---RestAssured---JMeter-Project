@CourseOfConstruction @US39130 @RegressionUS
Feature: US39130 - Add Project Description Field

  As an underwriter I want to direct the broker to provide
  more information about the COC location when referring a quote
  into underwriting so that we have a clearer idea of the risk when making decisions

  @NewBusiness @Endorsement @PolicyExtension
  Scenario Outline: Add Project Description Field - "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEnd>"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out the policy page for CC line of business
    * I create a new "CC" quote
    * I navigate to "Home Surplus Lines Policy" page
    * I navigate to next page

    Then I verify project description field is "<projectDescNB>"

    When I set project description to "Description"
    * I click save changes button
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I navigate to "Home Surplus Lines Policy" page
    * I navigate to next page

    Then I verify project description field is "<projectDescEND>"

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I navigate to "Home Surplus Lines Policy" page
    * I navigate to next page
    * I delete project description

    Then I verify project description field is "<projectDescEXT>"

    When I set project description to "Description"
    * I click save changes button
    * I review changes
    * I click renewed premium
    * I click review referrals
    * I accept underwriting referrals

    Then I click process policy extension
    * I exit policy
    * I logout

    Examples:
      | TC_ID  | effectiveDate | effectiveDateEnd | projectDescNB | projectDescEND | projectDescEXT |
      | FL_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | AZ_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | CA_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | CO_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | CT_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | DE_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | HI_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | ID_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | IL_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | MA_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | MT_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | ME_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | MD_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | NC_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | NJ_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | NM_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | NV_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | NY_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | RI_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | SC_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | OR_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | UT_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | VA_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | WA_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | WY_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | AR_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | DC_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | IA_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | IN_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | KS_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | KY_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | MI_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | MN_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | MO_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | MS_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | ND_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | NE_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | NH_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | OH_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | OK_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | PA_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | SD_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | VT_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | AL_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | GA_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | LA_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | TN_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | TX_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |
      | WI_001 | 04/18/2024    | 04/19/2024       | Not Mandatory | Not Mandatory  | Mandatory      |
      | WV_001 | 04/21/2024    | 04/22/2024       | Mandatory     | Not Mandatory  | Mandatory      |