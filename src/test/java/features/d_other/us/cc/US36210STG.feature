@CourseOfConstruction @US36210STG
Feature: CC - Phase 3 Quote Proposals - Dragon

  As a Compliance Officer I want  Quote Proposals generated when
  Phase 3 Surplus Course of Construction states are quoted so applicants
  are advised of their proposed coverage and premium

  @NewBusiness
  Scenario Outline: Course of Construction - "<TC_ID>" - New Business

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US36210STG" in sheet "QuoteCreatorCC" for "CC" LOB

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
      | AL_001 |
      | AL_002 |
      | AL_003 |
      | AR_001 |
      | AR_002 |
      | AR_003 |
      | DC_001 |
      | DC_002 |
      | DC_003 |
      | GA_001 |
      | GA_002 |
      | GA_003 |
      | IA_001 |
      | IA_002 |
      | IA_003 |
      | IN_001 |
      | IN_002 |
      | IN_003 |
      | KS_001 |
      | KS_002 |
      | KS_003 |
      | KY_001 |
      | KY_002 |
      | KY_003 |
      | LA_001 |
      | LA_002 |
      | LA_003 |
      | MI_001 |
      | MI_002 |
      | MI_003 |
      | MN_001 |
      | MN_002 |
      | MN_003 |
      | MO_001 |
      | MO_002 |
      | MO_003 |
      | MS_001 |
      | MS_002 |
      | MS_003 |
      | ND_001 |
      | ND_002 |
      | ND_003 |
      | NE_001 |
      | NE_002 |
      | NE_003 |
      | NH_001 |
      | NH_002 |
      | NH_003 |
      | OH_001 |
      | OH_002 |
      | OH_003 |
      | OK_001 |
      | OK_002 |
      | OK_003 |
      | PA_001 |
      | PA_002 |
      | PA_003 |
      | SD_001 |
      | SD_002 |
      | SD_003 |
      | TN_001 |
      | TN_002 |
      | TN_003 |
      | TX_001 |
      | TX_002 |
      | TX_003 |
      | VT_001 |
      | VT_002 |
      | VT_003 |
      | WI_001 |
      | WI_002 |
      | WI_003 |
      | WV_001 |
      | WV_002 |
      | WV_003 |