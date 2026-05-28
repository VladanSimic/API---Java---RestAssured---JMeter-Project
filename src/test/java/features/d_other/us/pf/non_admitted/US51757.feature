@PrimaryFlood @NonAdmitted @US51757
Feature: PF -  UI - Cover Page - Add Construction Details Block
  As a Product Manager I want to add "construction details" block to the Cover Page
  of the non-admitted flood solution LOB as we start offering this new Flood product to our members.

  @TC100199
  Scenario Outline: US51757 - Verify that construction details block is added to the Cover Page for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown

    Then I verify block "construction details" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Construction details block visibility"

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

  @TC100200
  Scenario Outline: US51757 - Verify that construction details block is placed below the primary flood coverage block for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown

    Then I scroll to the bottom of the page
    * I take screenshot "Construction details block position"

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

  @TC100201
  Scenario Outline: US51757 - Verify construction details block and its fields for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown
    * I scroll to the bottom of the page

    Then I verify input field "Year Built" is "visible" in "construction details" block
    * I verify "Year Built" field is "mandatory"
    * I verify input field "Square Footage (Under Air)" is "visible" in "construction details" block
    * I verify "Square Footage (Under Air)" field is "mandatory"
    * I verify input field "Number of Floors at the Risk Location" is "visible" in "construction details" block
    * I verify "Number of Floors at the Risk Location" field is "mandatory"
    * I verify input field "Foundation Type" is "visible" in "construction details" block
    * I verify "Foundation Type" field is "mandatory"
    * I take screenshot "Construction details block - mandatory status and visibility of fields"

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