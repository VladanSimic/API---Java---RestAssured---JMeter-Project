@PrimaryFlood @Admitted @US51931
Feature: PF Admitted - Remove Storm Surge block from Location Coverage Screen - CO
  As a product manager, I want to remove Storm Surge block from Locations coverage
  screen of our Homeowners line of business.

  @TC99941
  Scenario: US51931 - Verify that the Storm Surge block is not present on the Location coverage page NB and END - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "First location - visibility of storm surge block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Condo/Co-op   | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "Second location - visibility of storm surge block - END"

  @TC99942
  Scenario: US51931 - Verify that the Storm Surge block is not present on the Location coverage page NB and RNW - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "First location - visibility of storm surge block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Tenants       | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "Second location - visibility of storm surge block - RNW"

  @TC99944
  Scenario: US51931 - Verify that the Storm Surge block is present on the Location coverage page NB - TX_001  - 09/07/2025

    Given I use "TX_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Address_Line_1_Txt" to "10109 River Road"
    * I set "City_Name_Txt" to "Amarillo"
    * I set "Zip_Code" to "79108"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Amarillo TX" page
    * I scroll to the bottom of the page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "Visibility of storm surge block - NB"