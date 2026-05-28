@CourseOfConstruction @US36345
Feature: US36345 - Turn on 22 additional states for COC quotes

  As a user I should be able to initiate home course of construction
  line of business quote for supported states.

  Scenario Outline: Initiate - "<description>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    Examples:
      | TC_ID  | description |
      | NY_001 | NY quote    |
      | MA_001 | MA quote    |
      | FL_001 | FL quote    |
      | AZ_001 | AZ quote    |
      | CA_001 | CA quote    |
      | CO_001 | CO quote    |
      | CT_001 | CT quote    |
      | DE_001 | DE quote    |
      | HI_001 | HI quote    |
      | ID_001 | ID quote    |
      | IL_001 | IL quote    |
      | ME_001 | ME quote    |
      | MD_001 | MD quote    |
      | MT_001 | MT quote    |
      | NC_001 | NC quote    |
      | NJ_001 | NJ quote    |
      | NM_001 | NM quote    |
      | NV_001 | NV quote    |
      | RI_001 | RI quote    |
      | SC_001 | SC quote    |
      | OR_001 | OR quote    |
      | UT_001 | UT quote    |
      | WA_001 | WA quote    |
      | WY_001 | WY quote    |