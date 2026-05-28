@CourseOfConstruction @US36529
Feature: CC -  Countrywide Forms - Windstorm or Hail Deductible - Dragon - Remaining States

  As a Compliance Officer I want the Surplus Course of Construction contract to contain forms
  for Windstorm or Hail Deductible when endorsed on the policy so the insured is advised
  what their coverage entails

  @NewBusiness @Endorsement
  Scenario Outline: Course of Construction - "<TC_ID>" - New Business -  Endorsement

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US36529" in sheet "QuoteCreatorCC" for "CC" LOB

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
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    Examples:
      | TC_ID  |
      | AR_001 |
      | AR_002 |
      | AR_003 |
      | AR_004 |
      | DC_001 |
      | DC_002 |
      | DC_003 |
      | DC_004 |
      | IA_001 |
      | IA_002 |
      | IA_003 |
      | IA_004 |
      | IN_001 |
      | IN_002 |
      | IN_003 |
      | IN_004 |
      | KS_001 |
      | KS_002 |
      | KS_003 |
      | KS_004 |
      | KY_001 |
      | KY_002 |
      | KY_003 |
      | KY_004 |
      | MI_001 |
      | MI_002 |
      | MI_003 |
      | MI_004 |
      | MN_001 |
      | MN_002 |
      | MN_003 |
      | MN_004 |
      | MO_001 |
      | MO_002 |
      | MO_003 |
      | MO_004 |
      | MS_001 |
      | MS_002 |
      | MS_003 |
      | MS_004 |
      | ND_001 |
      | ND_002 |
      | ND_003 |
      | ND_004 |
      | NE_001 |
      | NE_002 |
      | NE_003 |
      | NE_004 |
      | NH_001 |
      | NH_002 |
      | NH_003 |
      | NH_004 |
      | OH_001 |
      | OH_002 |
      | OH_003 |
      | OH_004 |
      | OK_001 |
      | OK_002 |
      | OK_003 |
      | OK_004 |
      | PA_001 |
      | PA_002 |
      | PA_003 |
      | PA_004 |
      | SD_001 |
      | SD_002 |
      | SD_003 |
      | SD_004 |
      | VT_001 |
      | VT_002 |
      | VT_003 |
      | VT_004 |
      | WI_001 |
      | WI_002 |
      | WI_003 |
      | WI_004 |
      | WV_001 |
      | WV_002 |
      | WV_003 |
      | WV_004 |