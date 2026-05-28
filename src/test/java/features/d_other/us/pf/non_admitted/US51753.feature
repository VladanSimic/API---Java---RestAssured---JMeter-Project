@PrimaryFlood @NonAdmitted @US51753
Feature: PF -  UI - Cover Page - Cosmetic Updates - Home only
  As a Product Manager I would like to make some cosmetic updates to the cover page
  for the new Flood Solutions LOB so we can start offering this new flood product to our members.

  @TC99902
  Scenario Outline: US51753 - Verify that "Replacement Cost" is renamed to "Dwelling" for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown

    Then I verify section "Selected Primary Flood Limits" is "visible" in "primary flood coverage" block
    * I verify input field "Dwelling" is "visible" in "primary flood coverage" block
    * I take screenshot "Dwelling visibility"

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

  @TC99903
  Scenario Outline: US51753 - Verify Homeowners Coverage Limits for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown

    Then I verify section "Homeowners Coverage Limits" is "visible" in "primary flood coverage" block
    * I verify input field "Replacement Cost" is "visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" is "visible" in "primary flood coverage" block
    * I take screenshot "Homeowners Coverage Limits"

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

  @TC99904
  Scenario Outline: US51753 - Verify risk address block and its fields for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown

    Then I verify block "risk address" is "visible" on page
    * I verify input field "Replacement Cost" is "not visible" in "risk address" block
    * I verify input field "Contents" is "not visible" in "risk address" block
    * I verify input field "Loss of Use" is "not visible" in "risk address" block
    * I verify input field "Other Structures" is "not visible" in "risk address" block
    * I verify input field "AOP Deductible" is "not visible" in "risk address" block
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