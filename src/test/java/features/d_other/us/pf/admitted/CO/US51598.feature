@PrimaryFlood @Admitted @US51598
Feature: PF Admitted - Flood Node - Excess Flood Coverage Block - UI - CO
  As a product manager, I want Excess Flood coverage block placement is
  consistent  on the Flood node with the rest of the states, when we start
  offering primary flood endorsement to our members.

  @TC100769
  Scenario: US51598 - Verify that the 'excess flood' block is placed at the bottom of the Flood node -  NB and END - CO_005 - 09/07/2025

    Given I use "CO_005" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "First location excess flood block visibility - NB"

    When I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Second location excess flood block visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Tenants       | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Denver CO" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Third location excess flood block visibility - END"

  @TC100770
  Scenario: US51598 - Verify that the 'excess flood' block is placed at the bottom of the Flood node -  NB and RNW - CO_003 - 09/07/2025

    Given I use "CO_003" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "First location excess flood block visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Second location excess flood block visibility - RNW"

  @TC100771
  Scenario: US51598 - Verify that the 'excess flood' block is placed at the bottom of the Flood node -  NB and RNW - CO_001 - 09/07/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new renewal

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Condo/Co-op   | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button

    When I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "First location excess flood block visibility - RNW"

    When I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Second location excess flood block visibility - RNW"

  #@TC100772 - NB before PDF, END after PDF
  #@TC100773 - OOS END