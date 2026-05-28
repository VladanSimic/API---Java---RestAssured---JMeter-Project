@PrimaryFlood @NonAdmitted @US49744
Feature: PF - Cover page UI
  As a Product Manager I would like to make Cover page available for the new Flood Solutions LOB
  so we can start offering this new flood product to our members.

  @TC100455
  Scenario Outline: US49744 - Verify Cover page blocks and cells for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page

    Then I verify block "policy information" is "visible" on page
    * I verify the "Is this Primary Flood policy being quoted concurrently with a PURE or PURE Programs new business policy or renewal offer?" label with "Yes" and "No" radio buttons is "visible" in "policy information" block
    * I verify the "Is this Primary Flood policy replacing existing primary flood coverage?" label with "Yes" and "No" radio buttons is "visible" in "policy information" block
    * I verify checkbox "Does or will the member insure the balance of their account with PURE?" is "not visible" on page

    * I verify block "insurance information" is "visible" on page
    * I verify input field "Current Primary Flood Insurance Carrier" is "visible" in "insurance information" block
    * I verify input field "Flood Expiration Date" is "visible" in "insurance information" block
    * I click on the "Current Primary Flood Insurance Carrier" dropdown after scrolling "up"
    * I verify dropdown size is 12
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

    When I type "Other" to "Current Primary Flood Insurance Carrier" dropdown
    * I click save changes button
    * I scroll "up" the page

    Then I verify input field "Carrier Name" is "visible" in "insurance information" block
    * I verify block "underwriting company" is "visible" on page
    * I verify input field "Underwriting Company" is "visible" in "underwriting company" block

    * I verify block "credit score/ tiers" is "not visible" on page

    * I verify block "named insured" is "visible" on page
    * I take screenshot "Policy and insurance information, Underwriting Company and Named Insured"
    * I scroll "down" the page

    * I verify block "risk address" is "visible" on page
    * I verify input field "Named Storm Deductible" is "not visible" in "risk address" block
    * I verify input field "Hail Deductible" is "not visible" in "risk address" block
    * I verify checkbox is "not visible" for label "Hail Deductible UW Override" in "risk address" block
    * I verify that "FAC Reinsurance Required?" label with "Yes" and "No" radio buttons is "not visible" on page

    * I verify block "liability coverages" is "not visible" on page

    * I take screenshot "Risk address and liability coverage"

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

#  @TC97224 - previous version
#  Scenario Outline: US49744 - Verify Cover page blocks and cells for - "<state>" - 01/01/2025
#
#    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
#
#    * I load random user data
#    * I set "Effective_Date" to "01/01/2025"
#
#    When I am logged in to Pure as "Field"
#    * I initiate a new quote for a new customer
#    * I navigate to "Home Surplus Lines Policy" page
#
#    Then I verify block "policy information" is "visible" on page
#    * I verify the "Is this Primary Flood policy being quoted concurrently with a PURE or PURE Programs new business policy or renewal offer?" label with "Yes" and "No" radio buttons is "visible" in "policy information" block
#    * I verify the "Is this Primary Flood policy replacing existing primary flood coverage?" label with "Yes" and "No" radio buttons is "visible" in "policy information" block
#    * I verify checkbox "Does or will the member insure the balance of their account with PURE?" is "not visible" on page
#
#    * I verify block "insurance information" is "visible" on page
#    * I verify input field "Current Primary Flood Insurance Carrier" is "visible" in "insurance information" block
#    * I verify input field "Flood Expiration Date" is "visible" in "insurance information" block
#    * I click on the "Current Primary Flood Insurance Carrier" dropdown after scrolling "up"
#    * I verify dropdown size is 12
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
#    When I type "Other" to "Current Primary Flood Insurance Carrier" dropdown
#    * I click save changes button
#    * I scroll "up" the page
#
#    Then I verify input field "Carrier Name" is "visible" in "insurance information" block
#    * I verify block "underwriting company" is "visible" on page
#    * I verify input field "Underwriting Company" is "visible" in "underwriting company" block
#
#    * I verify block "credit score/ tiers" is "not visible" on page
#
#    * I verify block "named insured" is "visible" on page
#    * I take screenshot "Policy and insurance information, Underwriting Company and Named Insured"
#    * I scroll "down" the page
#
#    * I verify block "risk address and underlying limits" is "visible" on page
#    * I verify input field "Named Storm Deductible" is "not visible" in "risk address and underlying limits" block
#    * I verify input field "Hail Deductible" is "not visible" in "risk address and underlying limits" block
#    * I verify checkbox is "not visible" for label "Hail Deductible UW Override" in "risk address and underlying limits" block
#    * I verify that "FAC Reinsurance Required?" label with "Yes" and "No" radio buttons is "not visible" on page
#
#    * I verify block "liability coverages" is "not visible" on page
#
#    * I take screenshot "Risk address and liability coverage"
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