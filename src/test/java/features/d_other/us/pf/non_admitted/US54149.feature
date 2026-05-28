@PrimaryFlood @NonAdmitted @US54149
Feature: Change Request: FS - Non-Admitted Cover Page UI updates - Home and Condo
  As a Product Manager I want to make make a few updates to the Cover Page of the UI

  @TC106108 @TC106109 @TC106110 @TC106111 @TC106112 @TC106113
  Scenario Outline: US54149 - Verify question, labels and Current Primary Flood Insurance Carrier dropdown changes - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page

    Then I verify the "Is this Primary Flood policy being quoted concurrently with a PURE or PURE Programs new business policy or renewal offer?" label with "Yes" and "No" radio buttons is "not visible" in "policy information" block
    * I verify the "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?" label with "Yes" and "No" radio buttons is "visible" in "policy information" block
    * I scroll "up" the page
    * I take screenshot "Verifying question change in Policy Information block"

    When I click on the "Current Primary Flood Insurance Carrier" dropdown after scrolling "up"

    Then I verify dropdown size is 12
    * I verify dropdown values
      | values      |
      | - Select -  |
      | NFIP        |
      | PURE        |
      | Neptune     |
      | Chubb       |
      | Berkley One |
      | Cincinnati  |
      | AIG         |
      | AON         |
      | Selective   |
      | Not Insured |
      | Other       |

    * I verify following options are not present in the "Current Primary Flood Insurance Carrier" dropdown
      | values      |
      | Undisclosed |

    * I take screenshot "Current Primary Flood Insurance Carrier dropdown values"

    When I scroll to the bottom of the page

    Then I verify input field "Basement Coverage - Improvements" is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Improvements" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Coverage - Contents" is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Contents" is "visible" in "primary flood coverage" block
    * I verify input field "Loss Assessments" is "not visible" in "primary flood coverage" block
    * I verify input field "Loss Assessment" is "visible" in "primary flood coverage" block
    * I take screenshot "Primary flood coverage and flood information blocks - renamed labels and position"

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |