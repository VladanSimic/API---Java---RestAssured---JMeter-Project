@PrimaryFlood @Admitted @US51832
Feature: PF Admitted - Remove Elevation Certificate Node - UI & Function - IL
  As a product manager, I want "elevation certificate" node to be removed as
  elevation certificate will be part of the newly created Flood node as we
  start offering admitted Primary flood endorsement to our members.

  @TC99925
  Scenario: US51832 - Verify that Elevation Certificate node is removed from the UI - multiple locations NB and END - IL_005 - 09/07/2025

    Given I use "IL_005" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I navigate to "Hanover Park IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Tenants       | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Third location Elevation Certificate visibility - END"

  @TC99926
  Scenario: US51832 - Verify that Elevation Certificate node is removed from the UI for multiple locations NB and RNW - IL_003 - 09/07/2025

    Given I use "IL_003" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - RNW"

  @TC99927
  Scenario: US51832 - Verify that Elevation Certificate node is removed on renewal - multiple locations NB and RNW - IL_001 - 09/07/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click save changes button
    * I fill out HO quote elevation certificate details

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Condo/Co-op   | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - RNW"

    When I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - RNW"

  #  TC99928 - NB before PDF, END after PDF, RNW
  #  TC99929 - OOS END

  @TC99930
  Scenario: US51832 - Verify that Elevation Certificate node is not removed NB - IL_001 - 09/06/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

  @TC99931
  Scenario: US51832 - Verify that Elevation Certificate node is not removed RNW - IL_002 - 02/09/2024

    Given I use "IL_002" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "02/09/2024"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click save changes button
    * I fill out HO quote elevation certificate details

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Tenants       | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Gurnee IL" page

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - RNW"

    When I navigate to "Chicago IL" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - RNW"