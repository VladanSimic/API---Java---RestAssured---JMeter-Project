@CourseOfConstruction @US39555 @RegressionUS
Feature:  US39555 - Change Request: Update Risk Model Tab

  As a Product Manager I want to update the ROL Calculations
  on the risk model tab so that

  @NewBusiness @Endorsement @PolicyExtension
  Scenario Outline: Update Risk Model Tab - "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to quotes detail page
    * I navigate to "Risk Model Information" page

    Then I verify that RMS rate calculations base location premium ROL is "Empty"
    * I verify that RMS rate calculations total premium label text is "Total Premium (Reflects Seasonality)"
    * I verify that RMS rate calculations total premium ROL is "Not Empty"

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I navigate to "Risk Model Information" page

    Then I verify that RMS rate calculations base location premium ROL is "Empty"
    * I verify that RMS rate calculations total premium label text is "Total Premium (Reflects Seasonality)"
    * I verify that RMS rate calculations total premium ROL is "Not Empty"

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I navigate to "Risk Model Information" page

    Then I verify that RMS rate calculations base location premium ROL is "Empty"
    * I verify that RMS rate calculations total premium label text is "Total Premium (Reflects Seasonality)"
    * I verify that RMS rate calculations total premium ROL is "Not Empty"

    Examples:
      | TC_ID  |
      | FL_001 |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | MA_001 |
      | MT_001 |
      | ME_001 |
      | MD_001 |
      | NC_001 |
      | NJ_001 |
      | NM_001 |
      | NV_001 |
      | NY_001 |
      | RI_001 |
      | SC_001 |
      | OR_001 |
      | UT_001 |
      | VA_001 |
      | WA_001 |
      | WY_001 |
      | AR_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | MI_001 |
      | MN_001 |
      | MO_001 |
      | MS_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | OH_001 |
      | OK_001 |
      | PA_001 |
      | SD_001 |
      | VT_001 |
      | AL_001 |
      | GA_001 |
      | LA_001 |
      | TN_001 |
      | TX_001 |
      | WI_001 |
      | WV_001 |