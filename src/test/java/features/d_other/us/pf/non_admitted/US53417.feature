@PrimaryFlood @NonAdmitted @US53417
Feature: FS - NonAdmitted - UI - Clone Summary Page UI & Function - Quote Only
  As a Product Manager I want to clone Summary page
  to the new non-admitted flood surplus LOB.

  @TC102641 @TC102642 @TC102643
  Scenario Outline: US53417 - Verify that Summary page is available with all its buttons and blocks - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page

    Then I type "NFIP" to "Current Primary Flood Insurance Carrier" dropdown
    * I type "Homeowner" to "Residence Type" dropdown
    * I click "No" radio button for label "Does the residence have a basement?"
    * I type "1,000,000" to "Replacement Cost" input field
    * I type "500,000" to "Contents" field with index 2
    * I type "100,000" to "Loss of Use" field with index 2
    * I type "200,000" to "Other Structures" field with index 2
    * I type "2,500" to "AOP Deductible" input field
    * I type "2020" to "Year Built" input field
    * I type "300" to "Square Footage (Under Air)" input field
    * I type "1" to "Number of Floors at the Risk Location" input field
    * I type "Slab and Split-Level on Slab" to "Foundation Type" input field
    * I type "PRP - B/C/X" to "Flood Zone" dropdown
    * I click save changes button

    When I navigate to "Previous Claim/Losses" page

    Then I click "No" radio button for label "Any prior losses on this location over the past five years?"
    * I click save changes button

    When I navigate to "Member Information" page

    Then I click "No" radio button for label "Existing Agency Client?"
    * I click "No" radio button for label "Has coverage been non-renewed or cancelled?"
    * I click "No" radio button for label "Does the insured keep one or more dangerous dogs?"
    * I click save changes button

    When I rate a quote
    * I navigate to quote summary page

    Then I verify that "quote details" tab is "visible" on page
    * I verify that "premium" tab is "visible" on page
    * I verify that "underwriting referrals" tab is "visible" on page
    * I verify that "documents" tab is "visible" on page
    * I verify that "diary" tab is "visible" on page
    * I verify that "member flag" tab is "visible" on page

    * I verify block "license warnings" is "visible" on page
    * I verify block "summary" is "visible" on page
    * I verify button "exit" is "visible" on page
    * I take screenshot "Summary page - FS"

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