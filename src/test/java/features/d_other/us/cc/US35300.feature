@CourseOfConstruction @US35300
Feature: US35300 - Review Change Summary Page UI

  As a developer I need to clone the review change summary page
  for the new COC product so that users can review changes made to a COC policy

  Scenario Outline: Review Change Summary Page UI - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US35300" in sheet "QuoteCreatorCC" for "CC" LOB
    * I load random user data

    When I am logged in to Pure as Field
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

    Examples:
      | TC_ID  |
      | AZ_001 |
      | CA_002 |
      | CO_003 |
      | CT_004 |
      | DE_005 |
      | HI_006 |
      | ID_001 |
      | IL_002 |
      | ME_003 |
      | MD_004 |
      | MT_005 |
      | NC_006 |
      | NJ_001 |
      | NM_002 |
      | NV_003 |
      | RI_004 |
      | SC_005 |
      | OR_006 |
      | UT_001 |
      | VA_002 |
      | WA_003 |
      | WY_004 |
      | FL_001 |
      | MA_001 |
      | NY_001 |