@CourseOfConstruction @US34159
Feature: US34159 - Risk Model Page Functions

  As an Underwriting Manager I want the COC Risk Model Screen
  to have specific functions so we that we are able to evaluate
  rating aspects associated with the risk

  Scenario Outline: Create a quote for "<TC_ID>"

    Given I use "FL_001" regression test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as "<User>"
    * I navigate to quotes page
    * I initiate a new quote
    * I clear data
    * I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "Home Course of Construction"
    * I set "Quote_Line_And_Name_Block_State" to "<TC_ID>"
    * I set "Quote_Line_And_Name_Block_Name" to "Automation Testing"
    * I navigate to customer summary page
    * I click new quote button on customer summary page
    * I create a new quote on new quote information page
    * I create a new "CC" quote

    Then I get customer account ID

    Examples:
      | TC_ID  |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | ME_001 |
      | MD_001 |
      | MT_001 |
      | NC_001 |
      | NJ_001 |
      | NM_001 |
      | NV_001 |
      | RI_001 |
      | SC_001 |
      | OR_001 |
      | UT_001 |
      | VA_001 |
      | WA_001 |
      | WY_001 |
      | FL_001 |
      | MA_001 |
      | NY_001 |