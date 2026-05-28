@PrimaryFlood @Admitted @US51211
Feature: PF Admitted - Verify that Flood Advantage coverage is placed at the top, and Excess Flood Coverage
  is placed at the bottom of the newly created Flood Node page for HO- IL
  As a product manager, I want to make Optional Flood Coverage available only for
  the existing policies/locations with Flood Advantage or Flood Extension coverage

  @TC100509
  Scenario: US51211 - Verify Flood Advantage and Excess Flood Coverage for multiple locations NB and END - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "optional flood coverage" is at position 1 on page
    * I verify block "excess flood" is "visible" on page
    * I verify block "excess flood" is at position 4 on page
    * I take screenshot "Optional flood coverage and excess flood blocks- NB"
    * I fill out HO Flood Coverage page
    * I fill out HO quote elevation certificate details

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 | Unlimited | 10,000 |            |
    * I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "optional flood coverage" is at position 1 on page
    * I verify block "excess flood" is "visible" on page
    * I verify block "excess flood" is at position 4 on page
    * I take screenshot "Optional flood coverage and excess flood blocks - END"

  @TC100510
  Scenario: US51211 - Verify Flood Advantage and Excess Flood Coverage for multiple locations NB and RNW - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "optional flood coverage" is at position 1 on page
    * I verify block "excess flood" is "visible" on page
    * I verify block "excess flood" is at position 4 on page
    * I take screenshot "Optional flood coverage and excess flood blocks - NB"
    * I fill out HO Flood Coverage page
    * I fill out HO quote elevation certificate details

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "optional flood coverage" is at position 1 on page
    * I verify block "excess flood" is "visible" on page
    * I verify block "excess flood" is at position 4 on page
    * I take screenshot "Optional flood coverage and excess flood blocks - RNW"

  @TC100512
  Scenario: US51211 - Verify Flood Advantage and Excess Flood Coverage for multiple locations NB and END - IL_001  - 02/08/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "02/08/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I verify the "Excess Flood Coverage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I take screenshot "Flood Advantage and Excess Flood Coverage - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 | Unlimited | 10,000 |            |
    * I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "optional flood coverage" is at position 1 on page
    * I verify block "excess flood" is "visible" on page
    * I verify block "excess flood" is at position 4 on page
    * I take screenshot "Optional flood coverage and excess flood blocks - END"

  @TC100515
  Scenario: US51211 - Verify Flood Advantage and Excess Flood Coverage for multiple locations NB and RNW - IL_001 - 09/07/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I verify the "Excess Flood Coverage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I take screenshot "Flood Advantage and Excess Flood Coverage - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "optional flood coverage" is at position 1 on page
    * I verify block "excess flood" is "visible" on page
    * I verify block "excess flood" is at position 4 on page
    * I take screenshot "Optional flood coverage and excess flood blocks - RNW"

    When I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "optional flood coverage" is at position 1 on page
    * I verify block "excess flood" is "visible" on page
    * I verify block "excess flood" is at position 4 on page
    * I take screenshot "Optional flood coverage and excess flood blocks - first location"

  @TC98759
  Scenario: US51211 - Verify Flood Advantage and Excess Flood Coverage for NB, END and RNW - IL_001 - 01/09/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "01/09/2024"
    * I set "Endorsement_Effective_Date_END" to "01/11/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I verify the "Excess Flood Coverage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I take screenshot "Flood Advantage and Excess Flood Coverage - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "Gurnee IL" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I verify the "Excess Flood Coverage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I take screenshot "Flood Advantage and Excess Flood Coverage - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Gurnee IL" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I verify the "Excess Flood Coverage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I take screenshot "Flood Advantage and Excess Flood Coverage - RNW"

  @TC98760
  Scenario Outline: US51211 - Verify Flood Advantage and Excess Flood Coverage is visible  - "<state>" not in scope - 09/07/2025

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "<locationPageName>" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I verify the "Excess Flood Coverage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I take screenshot "Flood Advantage and Excess Flood Coverage - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "<locationPageName>" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I verify the "Excess Flood Coverage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I take screenshot "Flood Advantage and Excess Flood Coverage - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "<locationPageName>" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I verify the "Excess Flood Coverage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block
    * I take screenshot "Flood Advantage and Excess Flood Coverage - RNW"

    Examples:
      | state  | locationPageName    |
      | AZ_001 | Cornville AZ        |
      | DC_001 | Washington DC       |
      | IA_001 | Marion IA           |
      | IN_001 | Fairmount IN        |
      | KS_001 | Fort Leavenworth KS |
      | MN_001 | Lakeland MN         |
      | MT_001 | Butte MT            |
      | ND_001 | Fargo ND            |
      | NE_001 | La Vista NE         |
      | NM_001 | Tularosa NM         |
      | NV_001 | Mesquite NV         |
      | OH_001 | Upper Sandusky OH   |
      | OK_001 | Enid OK             |
      | OR_001 | North Plains OR     |
      | PA_001 | Scranton PA         |
      | RI_001 | Coventry RI         |
      | SD_001 | Hot Springs SD      |
      | TN_001 | Gatlinburg TN       |
      | UT_001 | Kanab UT            |
      | VT_001 | Burlington VT       |
      | WA_001 | Ridgefield WA       |
      | WI_001 | Williams Bay WI     |
      | WY_001 | Cody WY             |
      | MD_001 | Woodbine MD         |
      | ME_001 | Mount Vernon ME     |
      | SC_001 | Moore SC            |
      | MI_001 | Whitmore Lake MI    |
      | ID_001 | Boise ID            |