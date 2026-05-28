@PrimaryFlood @NonAdmitted @US50516
Feature: PF - Cover page UI and function
  As a Product Manager I would like to make Cover page available for the new Flood Solutions LOB
  so we can start offering this new flood product to our members.

  @TC100456
  Scenario Outline: US50516 - Verify Cover page UI and function - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll "up" the page

#    Then I verify "Is this Primary Flood policy being quoted concurrently with a PURE or PURE Programs new business policy or renewal offer?" is defaulted to "No"
  #    replaced with question below - US54727
    Then I verify "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?" is defaulted to "No"
    * I verify "Is this Primary Flood policy replacing existing primary flood coverage?" is defaulted to "No"
    * I take screenshot "Default values"

    When I click "Yes" radio button for label "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?"
    * I click save changes button

    Then I verify question "Is this Primary Flood policy replacing existing primary flood coverage?" with Yes and No answers is hidden in "policy information" block
    * I verify "Term" value "12 Months" is displayed in "policy information" block
    * I verify "Effective Date" value "01/01/2025" is displayed in "policy information" block
    * I verify input field "Expiration Date" is read only with value "01/01/2026"
    * I verify "Named Insured Type" value "Individual" is displayed in "policy information" block

    * I verify "Current Primary Flood Insurance Carrier" value "- Select -" is displayed in "insurance information" block

    # dropdown values changed through US54727 - covered through TS598
    When I click on the "Current Primary Flood Insurance Carrier" dropdown after scrolling "up"

    Then I verify dropdown size is 12
    * I verify dropdown values
      | values      |
      | - Select -  |
      | NFIP        |
      | Neptune     |
      | Chubb       |
      | Berkley One |
      | Cincinnati  |
      | AIG         |
      | AON         |
      | Selective   |
      | Not Insured |
      | Other       |
      | Undisclosed |

    * I type "01/01/2026" to "Flood Expiration Date" date field
    * I verify input field "Current Premium" is empty
    * I verify input field "Underwriting Company" is read-only in "underwriting company" block

    * I get text from row 1 cell 1 in "named insured" block and verify "Named Insured" field has a value
    * I get text from row 1 cell 3 in "named insured" block and verify "First Name" field has a value
    * I get text from row 1 cell 5 in "named insured" block and verify "Last Name" field has a value
    * I take screenshot "Policy and Insurance Information, Underwriting Company and Named Insured"
    * I scroll "down" the page

    * I verify input field "Address Line 1" in "risk address" block is read only and has value
    * I verify input field "City" in "risk address" block is read only and has value
    * I verify input field "State" in "risk address" block is read only and has value
    * I verify input field "ZIP" in "risk address" block is read only and has value
    * I scroll "down" the page
    * I take screenshot "Risk address block"

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

#  @TC98100 - previous version
#  Scenario Outline: US50516 - Verify Cover page UI and function - "<state>" - 01/01/2025
#
#    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
#
#    * I load random user data
#    * I set "Effective_Date" to "01/01/2025"
#
#    When I am logged in to Pure as "Field"
#    * I initiate a new quote for a new customer
#    * I navigate to "Home Surplus Lines Policy" page
#    * I scroll "up" the page
#
#    Then I verify "Is this Primary Flood policy being quoted concurrently with a PURE or PURE Programs new business policy or renewal offer?" is defaulted to "No"
#    * I verify "Is this Primary Flood policy replacing existing primary flood coverage?" is defaulted to "No"
#    * I take screenshot "Default values"
#
#    When I click "Yes" radio button for label "Is this Primary Flood policy being quoted concurrently with a PURE or PURE Programs new business policy or renewal offer?"
#    * I click save changes button
#
#    Then I verify question "Is this Primary Flood policy replacing existing primary flood coverage?" with Yes and No answers is hidden in "policy information" block
#    * I verify "Term" value "12 Months" is displayed in "policy information" block
#    * I verify "Effective Date" value "01/01/2025" is displayed in "policy information" block
#    * I verify input field "Expiration Date" is read only with value "01/01/2026"
#    * I verify "Named Insured Type" value "Individual" is displayed in "policy information" block
#
#    * I verify "Current Primary Flood Insurance Carrier" value "- Select -" is displayed in "insurance information" block
#
#    When I click on the "Current Primary Flood Insurance Carrier" dropdown after scrolling "up"
#
#    Then I verify dropdown size is 12
#    * I verify dropdown values
#      | values      |
#      | - Select -  |
#      | NFIP        |
#      | Neptune     |
#      | Chubb       |
#      | Berkley One |
#      | Cincinnati  |
#      | AIG         |
#      | AON         |
#      | Selective   |
#      | Not Insured |
#      | Other       |
#      | Undisclosed |
#
#    * I type "01/01/2026" to "Flood Expiration Date" date field
#    * I verify input field "Current Premium" is empty
#    * I verify input field "Underwriting Company" is read-only in "underwriting company" block
#
#    * I get text from row 1 cell 1 in "named insured" block and verify "Named Insured" field has a value
#    * I get text from row 1 cell 3 in "named insured" block and verify "First Name" field has a value
#    * I get text from row 1 cell 5 in "named insured" block and verify "Last Name" field has a value
#    * I take screenshot "Policy and Insurance Information, Underwriting Company and Named Insured"
#    * I scroll "down" the page
#
#    * I verify input field "Address Line 1" in "risk address and underlying limits" block is read only and has value
#    * I verify input field "City" in "risk address and underlying limits" block is read only and has value
#    * I verify input field "State" in "risk address and underlying limits" block is read only and has value
#    * I verify input field "ZIP" in "risk address and underlying limits" block is read only and has value
#    * I scroll "down" the page
#    * I take screenshot "Risk address and underlying limits"
#
#    Examples:
#      | state  |
#      | NY_001 |
#      | MA_001 |
#      | TX_001 |
#      | GA_001 |
#      | CT_001 |
#      | NJ_001 |
#      | VA_001 |
#      | IL_001 |
#      | CO_001 |
#      | CA_001 |
#      | FL_001 |
#      | LA_001 |
#      | NC_001 |
#      | MO_001 |
#      | AL_001 |
#      | KY_001 |
#      | MS_001 |
#      | AR_001 |