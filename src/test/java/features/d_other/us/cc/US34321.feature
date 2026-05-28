@CourseOfConstruction @US34321
Feature: CC - Run Insurance Score Ordering Logic - Phase 3 - 25 States - Testing only

  As a I want to be able to run insurance score for COC product so we can capture financial responsibility

  @NewBusiness
  Scenario Outline: Insurance Score Ordering Logic - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US34321" in sheet "QuoteCreatorCC" for "CC" LOB

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

    * I logout

    Examples:
      | TC_ID  |
      | AL_001 |
      | DC_001 |
      | GA_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | LA_001 |
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
      | TN_001 |
      | TX_001 |
      | VT_001 |
      | WI_001 |
      | WV_001 |