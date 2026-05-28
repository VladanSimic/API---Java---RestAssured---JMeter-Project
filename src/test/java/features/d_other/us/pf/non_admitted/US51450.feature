@PrimaryFlood @NonAdmitted @US51450
Feature: [Continued] FS - Create Bind Workflow for Standalone Flood

  @TC102678
  Scenario Outline: US51450 - Verify that Bind workflow is working correct for FS quotes when all mandatory fields to bind are populated - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I click "rate" button
    * I navigate to underwriting referrals page
    * I accept underwriter referrals FS
    * I click request bind

    Then I verify I am on "quote version | premium summary" step
    * I verify button "bind" is "visible" on page
    * I take screenshot "Premium summary"

    When I click bind
    * I fill policy delivery details "Yes" "PrintByPure"
    * I click request bind

    Then I verify that "FS" policy is active
    * I take screenshot "Bound policy"

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

  @TC102800
  Scenario Outline: US51450 - Verify that Bind workflow is working correct for FS quotes when all mandatory fields to rate are populated - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Existing_Agency_Client" to ""
    * I set "Non_Renewed_Or_Declined_Coverage" to ""
    * I set "Dangerous_Dogs" to ""

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I click "rate" button
    * I navigate to underwriting referrals page
    * I accept underwriter referrals FS
    * I click request bind

    Then I verify I am on "quote | quote version | edit | homeowners | member information" step
    * I take screenshot "Request bind"

    When I set "Existing_Agency_Client" to "No"
    * I set "Non_Renewed_Or_Declined_Coverage" to "No"
    * I set "Dangerous_Dogs" to "No"
    * I fill out FS quote member information page
    * I rate a quote

    When I click bind
    * I fill policy delivery details "Yes" "PrintByPure"
    * I click request bind

    Then I verify that "FS" policy is active
    * I take screenshot "Bound policy"

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