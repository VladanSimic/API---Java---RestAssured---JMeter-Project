@PrimaryFlood @Admitted @US51861
Feature: PF Admitted - Remove Storm Surge block from Location Coverage Screen - IL
  As a product manager, I want to remove Storm Surge block from Locations coverage
  screen of our Homeowners line of business.

  @TC99939
  Scenario: US51861 - Verify that the Storm Surge block is not present on the Location coverage page NB and END - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "First location - visibility of storm surge block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Condo/Co-op   | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Chicago IL" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "Second location - visibility of storm surge block - END"

  @TC99940
  Scenario: US51861 - Verify that the Storm Surge block is not present on the Location coverage page NB and RNW - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "First location - visibility of storm surge block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Tenants       | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Chicago IL" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "Second location - visibility of storm surge block - RNW"

  @TC99945
  Scenario: US51861 - Verify that the Storm Surge block is present on the Location coverage page NB - FL_001  - 09/07/2025

    Given I use "FL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Winter Garden FL" page
    * I scroll to "Distance to Closest Sinkhole" element

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "Visibility of storm surge block - NB"