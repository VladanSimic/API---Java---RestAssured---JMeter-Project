@PrimaryFlood @NonAdmitted @DE52626
Feature: Error found in TC104980: 2. Verify that Underwriting Company Name is changed from Flood Underwriting Company to "National Fire & Marine Insurance Company"

  Scenario Outline: DE52626 - Verify that Underwriting Company Name is changed from Flood Underwriting Company to "National Fire & Marine Insurance Company" - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I fill out the policy page for FS line of business
    * I click "BHSI rate" button
    * I think for 11 to 17 seconds
    * I fill out FS quote elevation certificate details page
    * I fill out FS previous claim losses page
    * I fill out FS quote member information page
    * I navigate to "Flood Surplus Lines Policy" page

    Then I verify that the underwriting company is "National Fire & Marine Insurance Company"
    * I take screenshot "Underwriting company - quote level"

    Then I rate a quote
    * I bind a quote

    When I navigate to policy
    * I navigate to "transactions/endorsements" tab
    * I navigate to New Business summary page
    * I navigate to "policy image" tab

    Then I verify that the underwriting company is "National Fire & Marine Insurance Company"
    * I take screenshot "Underwriting company - policy level"

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