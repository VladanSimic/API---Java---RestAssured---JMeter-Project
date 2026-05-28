@PrimaryFlood @NonAdmitted @US51451
Feature: FS - Create Rate Workflow for Standalone Flood
  As a Product Manager I want the users to be able to utilize the rate button
  on standalone non-admitted flood quotes and policies, so they're able to obtain the rates.

  @TC101840
  Scenario Outline: US51451 - Verify that the Rate button is available for the users on the UI - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page

    Then I type "Homeowner" to "Residence Type" dropdown
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

    And I verify button "rate" is "visible" on page
    * I take screenshot "Cover page - Rate button visibility"

    When I navigate to "Elevation Certificate" page

    Then I verify button "rate" is "visible" on page
    * I take screenshot "Elevation Certificate page - Rate button visibility"

    When I navigate to "Previous Claim/Losses" page
    * I click "No" radio button for label "Any prior losses on this location over the past five years?"
    * I click save changes button

    Then I verify button "rate" is "visible" on page
    * I take screenshot "Previous Claim/Losses page - Rate button visibility"

    When I navigate to "Additional Interests" page

    Then I verify button "rate" is "visible" on page
    * I take screenshot "Additional Interests page - Rate button visibility"

    When I navigate to "Member Information" page

    Then I verify button "rate" is "visible" on page
    * I take screenshot "Member Information page - Rate button visibility"

    When I navigate to "Manuscript Endorsements" page

    Then I verify button "rate" is "visible" on page
    * I take screenshot "Manuscript Endorsements page - Rate button visibility"

    When I navigate to "Mandatory Forms" page

    Then I verify button "rate" is "visible" on page
    * I take screenshot "Mandatory Forms page - Rate button visibility"

    When I navigate to "Subjectivities" page

    Then I verify button "rate" is "visible" on page
    * I take screenshot "Subjectivities page - Rate button visibility"

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

  @TC101841
  Scenario Outline: US51451 - Confirm that clicking the 'Rate' button successfully navigates the system to the Premium Summary screen - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page

    Then I type "Homeowner" to "Residence Type" dropdown
    * I click "No" radio button for label "Does the residence have a basement?"
    * I type "2,000,000" to "Replacement Cost" input field
    * I type "1,000,000" to "Contents" field with index 2
    * I type "200,000" to "Loss of Use" field with index 2
    * I type "400,000" to "Other Structures" field with index 2
    * I type "5,000" to "AOP Deductible" input field
    * I type "2022" to "Year Built" input field
    * I type "350" to "Square Footage (Under Air)" input field
    * I type "1" to "Number of Floors at the Risk Location" input field
    * I type "Slab and Split-Level on Slab" to "Foundation Type" input field
    * I type "PRP - B/C/X" to "Flood Zone" dropdown
    * I click save changes button
    * I navigate to "Elevation Certificate" page

    When I navigate to "Previous Claim/Losses" page

    Then I click "No" radio button for label "Any prior losses on this location over the past five years?"
    * I click save changes button

    When I navigate to "Additional Interests" page
    * I navigate to "Member Information" page
    * I navigate to "Manuscript Endorsements" page
    * I navigate to "Mandatory Forms" page
    * I navigate to "Subjectivities" page

    Then I rate a quote
    * I verify that the system navigates to the "quote version | premium summary" page
    * I take screenshot "Premium summary page visibility"

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