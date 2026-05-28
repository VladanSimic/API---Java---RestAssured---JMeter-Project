@PrimaryFlood @NonAdmitted @US51758
Feature: PF -  UI - Cover Page - Add Flood Information Details Block
  As a Product Manager I want to add  "flood information" block to the Cover Page
  of the non-admitted flood solution LOB as we start offering this new Flood product to our members

  @TC100196
  Scenario Outline: US51758 - Verify that flood information block is added to the Cover Page for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block visibility"

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

  @TC100197
  Scenario Outline: US51758 - Verify that flood information block is placed below the construction details block for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown

    Then I scroll to the bottom of the page
    * I take screenshot "Flood information block position"

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

  @TC100198
  Scenario Outline: US51758 - Verify flood information block and its fields for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown
    * I scroll to the bottom of the page

    Then I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I take screenshot "Flood information block - mandatory status and visibility of fields"

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