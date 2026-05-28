@CourseOfConstruction @US39828
Feature: Change Request: Add Additional Documents to Cancellation Package All 50 states

  As a Compliance officer I want a full policy premium breakdown as
  part of the cancellation package so that we can report to the state correctly

  @NewBusiness @Endorsement
  Scenario Outline: Add Additional Documents to Cancellation Package - "<testCaseDataId>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US39828" in sheet "QuoteCreatorCC" for "CC" LOB
    * I load random user data

    When I am logged in to Pure as "P3"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    Examples:
      | testCaseDataId |
      | FL_001         |
      | AZ_001         |
      | CA_001         |
      | CO_001         |
      | CT_001         |
      | DE_001         |
      | HI_001         |
      | ID_001         |
      | IL_001         |
      | MA_001         |
      | MT_001         |
      | ME_001         |
      | MD_001         |
      | NC_001         |
      | NJ_001         |
      | NM_001         |
      | NV_001         |
      | NY_001         |
      | RI_001         |
      | SC_001         |
      | OR_001         |
      | UT_001         |
      | VA_001         |
      | WA_001         |
      | WY_001         |
      | AR_001         |
      | DC_001         |
      | IA_001         |
      | IN_001         |
      | KS_001         |
      | KY_001         |
      | MI_001         |
      | MN_001         |
      | MO_001         |
      | MS_001         |
      | ND_001         |
      | NE_001         |
      | NH_001         |
      | OH_001         |
      | OK_001         |
      | PA_001         |
      | SD_001         |
      | VT_001         |
      | AL_001         |
      | GA_001         |
      | LA_001         |
      | TN_001         |
      | TX_001         |
      | WI_001         |
      | WV_001         |