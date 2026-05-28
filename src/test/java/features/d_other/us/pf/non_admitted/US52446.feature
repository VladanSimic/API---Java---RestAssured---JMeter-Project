@PrimaryFlood @NonAdmitted @US52446
Feature: FS - Non-admitted - UI - Cover Page - Cosmetic Updates 2 - Home only
  As a Product Manager I would like  to make some cosmetic updates to the cover
  page for the new Flood Solutions LOB

  @TC101309
  Scenario Outline: US52446 - Verify Label Update - "Selected Primary Flood Limits" to "Primary Flood Coverage Limits" - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown
    * I scroll to the bottom of the page

    Then I verify section "Selected Primary Flood Limits" is "not visible" in "primary flood coverage" block
    * I verify section "Primary Flood Coverage Limits" is "visible" in "primary flood coverage" block
    * I take screenshot "Primary Flood Coverage Limits visibility"

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

  @TC101310
  Scenario Outline: US52446 - Verify Label Update - "Homeowners Coverage Limits" to "Location Coverage Limits" - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown
    * I scroll to the bottom of the page

    Then I verify section "Homeowners Coverage Limits" is "not visible" in "primary flood coverage" block
    * I verify section "Location Coverage Limits" is "visible" in "primary flood coverage" block
    * I take screenshot "Location Coverage Limits visibility"

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

  @TC101311
  Scenario Outline: US52446 - Validate State-Specific Display - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown
    * I scroll to the bottom of the page

    Then I verify section "Primary Flood Coverage Limits" is "visible" in "primary flood coverage" block
    * I verify section "Location Coverage Limits" is "visible" in "primary flood coverage" block
    * I verify section "Sublimits" is "visible" in "primary flood coverage" block
    * I take screenshot "Primary flood coverage block sections"

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