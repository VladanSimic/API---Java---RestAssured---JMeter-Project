@PrimaryFlood @Admitted @US52440
Feature: PF Admitted - PF Admitted - Remove Optional Flood Coverage Block - CO
  As a product manager, I want to remove Optional Flood Coverage block from the
  newly created Flood Node as we start offering Primary Flood Endorsement to our members.

  @TC101312
  Scenario: US52440 - Verify that the Optional Flood Coverage block is not present on the Flood information page NB and END - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "First location - visibility of optional flood coverage block - NB"
    * I fill out HO Flood Coverage page

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner   | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Second location - visibility of optional flood coverage block - END"

  @TC101313
  Scenario: US52440 - Verify that the Optional Flood Coverage block is not present on the Flood information page NB and RNW - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "First location - visibility of optional flood coverage block - NB"
    * I fill out HO Flood Coverage page

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner       | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Second location - visibility of optional flood coverage block - RNW"

  @TC101328
  Scenario: US52440 - Verify that the Optional Flood Coverage block is not present on the Optional Coverages page NB, END and RNW - CO_001 - 02/09/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "02/09/2024"
    * I set "Endorsement_Effective_Date_END" to "02/11/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Visibility of optional flood coverage block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Visibility of optional flood coverage block - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Visibility of optional flood coverage block - RNW"