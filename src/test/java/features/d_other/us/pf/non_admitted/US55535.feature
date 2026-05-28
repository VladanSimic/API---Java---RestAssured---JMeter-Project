@PrimaryFlood @NonAdmitted @US55535
Feature: FS - NonAdmitted - UI - Premium Summary Screen - Transaction
  As a Product Manager, I want the Premium Summary Screen to be available for the new Flood Surplus LOB

  @TC107080 @TC107081 @TC107082
  Scenario Outline: US55535 - Verify that for the FS product Premium Summary Screen is updated (Definitions, TIV and details blocks) - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote

    When I navigate to policy
    * I navigate to "transactions/endorsements" tab
    * I navigate to New Business summary page
    * I navigate to premium summary page

    Then I verify block "Definitions" is "visible" on page
    * I verify "Aggregation Zone TIV" label is "not visible" in "Definitions" block
    * I verify "Current TIV Capacity used in Aggregation Zone" label is "not visible" in "Definitions" block
    * I verify "Total TIV Capacity used if risk is bound" label is "not visible" in "Definitions" block
    * I verify "TIV:" label is "visible" in "Definitions" block
    * I verify block "TIV totals measured against locations on this policy" is "not visible" on page

    * I verify "Hurricane Deductible" label is "not visible" on page
    * I verify "All Other Perils Deductible" label is "not visible" on page
    * I verify "Hail Deductible" label is "not visible" on page
    * I verify "Wildfire Deductible" label is "not visible" on page
    * I verify "Optional Coverages" label is "not visible" on page
    * I verify "Optional Coverages Premium" label is "not visible" on page
    * I verify "Flood Surplus Lines" label is "visible" on page

    * I verify "Primary Flood" is displayed and has value for "deductible" field
    * I verify "Basement Improvements Sublimit" is displayed and has value for "limit" field
    * I verify "Basement Contents Sublimit" is displayed and has value for "limit" field

    * I take screenshot "Definitions, TIV and coverages"

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

  @TC107083 @TC107084
  Scenario Outline: US55535 - Verify that for the FS product Premium Summary Screen is updated (premium summary and broker compensation blocks) - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote

    When I navigate to policy
    * I navigate to "transactions/endorsements" tab
    * I navigate to New Business summary page
    * I navigate to premium summary page

    Then I verify block "premium summary" is "visible" on page
    * I verify "Inspection Fee" label is "not visible" in "premium summary" block
    * I verify "Surplus Lines Broker Fee" label is "not visible" in "premium summary" block
    * I verify "State Mandated Assessments Include" label is "visible" in "premium summary" block

    And I verify block "broker compensation" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Premium summary and details blocks"

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |