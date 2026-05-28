@PrimaryFlood @Admitted @US54748
Feature: Change Request: PF Admitted - Optional Flood Coverage Block - UI & Function - CO

  @TC105551
  Scenario: US54748 - Verify that after PD Filing date, Flood Advantage is not present on the Optional Coverage page/Optional coverage block

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "PRP - B/C/X"
    * I set "Manager_Flood_Zone_Override_END" to "Yes"
    * I set "Flood_Information_Flood_Zone_END" to "PRP - B/C/X"

    When I am logged in to Pure as Zonal
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify "Flood Advantage" is "not visible" on page
    * I take screenshot "Optional Coverages - NB"

    When I rate, bind and initiate new endorsement

    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Optional Coverages" page

    Then I verify "Flood Advantage" is "not visible" on page
    * I take screenshot "Optional Coverages - END"

  @TC105552
  Scenario: US54748 - Verify that after PD Filing date, Flood Extension (DIC)  is not present on the Optional Coverage page/Optional coverage block

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"
    * I set "Manager_Flood_Zone_Override_RNW" to "Yes"
    * I set "Flood_Information_Flood_Zone_RNW" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify "Flood Coverage Extension (DIC)" is "not visible" on page
    * I take screenshot "Optional Coverages - NB"

    When I rate, bind and initiate new renewal

    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Optional Coverages" page

    Then I verify "Flood Coverage Extension (DIC)" is "not visible" on page
    * I take screenshot "Optional Coverages - RNW"

  @TC105553
  Scenario: US54748 - Verify that Optional coverage Block is available for internal users (RUM authority level and above) all the time, eff date after 09/07/2025 (NB/END)

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page

    Then I verify "Flood Coverage Extension (DIC)" is "visible" on page
    * I take screenshot "Flood Coverage - NB"

    When I rate, bind and initiate new endorsement

    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify "Flood Coverage Extension (DIC)" is "visible" on page
    * I take screenshot "Flood Coverage - END"

  @TC105554
  Scenario: US54748 - Verify that Optional coverage Block and Flood Advantage are not available for internal users (RUM authority level and above), eff date after 09/07/2025 (NB/RNWL)

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "PRP - B/C/X"
    * I set "Manager_Flood_Zone_Override_END" to "Yes"
    * I set "Flood_Information_Flood_Zone_END" to "PRP - B/C/X"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page

    Then I verify "Flood Advantage" is "not visible" on page
    * I take screenshot "Flood Coverage - NB"

    When I rate, bind and initiate new renewal

    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I verify "Flood Advantage" is "not visible" on page
    * I take screenshot "Flood Coverage - END"

  @TC105556
  Scenario: US54748 - Verify that for in force policies Flood Advantage should be visible if it was set to "yes" on the NB before PD Filling dates for Brokers and internal users (RUM authority level and above)

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Optional_Coverages_Flood_Advantage" to "Yes"

    When I am logged in to Pure as Zonal
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify "Flood Advantage" is "visible" on page
    * I take screenshot "Optional Coverages - NB"

    When I rate, bind and initiate new renewal

    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page

    Then I verify "Flood Advantage" is "visible" on page
    * I take screenshot "Optional Coverages - RNW"