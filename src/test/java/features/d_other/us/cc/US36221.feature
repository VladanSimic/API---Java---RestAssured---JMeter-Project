@CourseOfConstruction @US36221
Feature: US36221 - Phase 2 applications

  As a Compliance officer I need an application to generate when Phase 2
  COC states are quoted so we are able to collect pertinent insurance information

  Scenario Outline: Dynamic fields for retail broker information - "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "CC" quote

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