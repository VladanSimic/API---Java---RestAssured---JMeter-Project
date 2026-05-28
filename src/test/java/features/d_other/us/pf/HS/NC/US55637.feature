@PrimaryFlood @PFHS @US55637
Feature: Change Request: HS - Remove Excess Flood Block from Optional Coverage Screen - NC
  As a product manager, I want to remove Excess Flood block from the "Optional Coverages" page of the HS LOB

  @TC105498
  Scenario: US55637 - Verify that the Excess Flood Block is not present on the Optional Coverage Screen after PD Filing dates (NB/END) - NC_001 - 09/07/2025

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1          | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible             |
      | 3400 Wake Forest Road | Raleigh | NC    | 27609 | Condo/Co-op   | 7500000 |           | 10,000 | N/A - AOP Ded. Applies |
    * I click order property details button
    * I navigate to "Raleigh NC" page
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal - END"

  @TC105499
  Scenario: US55637 - Verify that the Excess Flood Block is not present on the Optional Coverage Screen after PD Filing dates (NB/RNW) - NC_001 - 09/07/2025

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1          | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible             |
      | 3400 Wake Forest Road | Raleigh | NC    | 27609 | Condo/Co-op   | 7500000 |           | 10,000 | N/A - AOP Ded. Applies |
    * I click order property details button
    * I navigate to "Raleigh NC" page
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal - RNW"

  @TC105500
  Scenario: US55637 - Verify that the Excess Flood Block is present on the Optional Coverage Screen before PD Filing dates (NB/END/RNW) - NC_001 - 01/09/2024

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/09/2024"
    * I set "Endorsement_Effective_Date_END" to "01/11/2024"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood block visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood blocks visibility - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood blocks visibility - RNW"

  @TC105501
  Scenario: US55637 - Verify that the Excess Flood Block is present on the Optional Coverage Screen before PD Filing dates (NB), and  Excess Flood Block is not present on the Optional Coverage Screen after PD Filing dates (RNW) - NC_001 - 09/07/2024

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood blocks visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal (first location) - RNW"

    When I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1          | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible             |
      | 3400 Wake Forest Road | Raleigh | NC    | 27609 | Condo/Co-op   | 7500000 |           | 10,000 | N/A - AOP Ded. Applies |
    * I click order property details button
    * I navigate to "Raleigh NC" page
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal (second location) - RNW"