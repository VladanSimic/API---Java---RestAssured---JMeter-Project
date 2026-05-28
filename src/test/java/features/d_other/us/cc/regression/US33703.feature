@CourseOfConstruction @US33703 @RegressionUS
Feature: US33703 - Commission Factor - Rating Only

  As a Product Owner I want Commission factors included in the COC algorithm
  so we are able to adequately calculate premium on COC policies in regard to
  commission.

  Scenario Outline: I create and rate a "<TC_ID>" quote

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
    * I navigate to premium details page

    Then I verify base rate "<commissionFactor>"

    Examples:
      | TC_ID  | commissionFactor   |
      | AZ_001 | Commission Value/1 |
      | CA_001 | Commission Value/1 |
      | CO_001 | Commission Value/1 |
      | CT_001 | Commission Value/1 |
      | DE_001 | Commission Value/1 |
      | HI_001 | Commission Value/1 |
      | ID_001 | Commission Value/1 |
      | IL_001 | Commission Value/1 |
      | ME_001 | Commission Value/1 |
      | MD_001 | Commission Value/1 |
      | MT_001 | Commission Value/1 |
      | NC_001 | Commission Value/1 |
      | NJ_001 | Commission Value/1 |
      | NM_001 | Commission Value/1 |
      | NV_001 | Commission Value/1 |
      | RI_001 | Commission Value/1 |
      | SC_001 | Commission Value/1 |
      | OR_001 | Commission Value/1 |
      | UT_001 | Commission Value/1 |
      | VA_001 | Commission Value/1 |
      | WA_001 | Commission Value/1 |
      | WY_001 | Commission Value/1 |
      | FL_001 | Commission Value/1 |
      | MA_001 | Commission Value/1 |
      | NY_001 | Commission Value/1 |