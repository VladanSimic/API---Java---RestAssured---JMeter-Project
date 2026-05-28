@CourseOfConstruction @US36790 @RegressionUS
Feature: US36790 - Mandatory Forms Workflow

  As an Underwriting Manager I want mandatory forms collected for
  Phase 1 COC states so that we are able to bind CC policies

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
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

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