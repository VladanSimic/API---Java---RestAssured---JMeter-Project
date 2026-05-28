@CourseOfConstruction @US34335 @RegressionUS
Feature: US34335 - Amend Owner's Prior Losses Factor

  As a Product Owner I want to update the owner's prior losses factor
  to capture prior losses within the last 5 years as we are currently
  capturing COC owner prior losses within 3+ years and we want to be
  consistent with our user interface

  Scenario Outline: Loss factor for - "<TC_ID>" - "<description>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US34335" in sheet "QuoteCreatorCC" for "CC" LOB
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
    * I navigate to premium page
    * I navigate to premium details page

    Then I verify base rates "<ownersPriorLossFactor>"

    When I return to premium summary page
    * I bind a CC quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify base rates "<ownersPriorLossFactor>"

    Examples:
      | TC_ID  | ownersPriorLossFactor                                           | description                                                     |
      | FL_001 | Owner's Prior Losses Factor/1.2,Owner's Prior Losses Factor/1.2 | factor should be 1.2 for 2 losses                               |
      | AZ_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | CA_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 4 losses                               |
      | CO_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 5 losses                               |
      | CT_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | DE_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | HI_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | ID_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | IL_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | MA_001 | Owner's Prior Losses Factor/1,Owner's Prior Losses Factor/1     | factor should be 1.0 for 1 loss                                 |
      | MD_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | ME_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | MT_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | NC_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | NJ_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | NM_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | NV_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | NY_001 |                                                                 | factor should be 1.0 for no losses                              |
      | RI_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | SC_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | OR_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | UT_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | VA_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | WA_001 | Owner's Prior Losses Factor/1.3,Owner's Prior Losses Factor/1.3 | factor should be 1.3 for 3 losses                               |
      | WY_001 | Owner's Prior Losses Factor/1.2,Owner's Prior Losses Factor/1.2 | factor should be 1.2 for 2 losses and 1 loss older than 5 years |