@PrimaryFlood @Admitted @US51930
Feature: PF Admitted - Remove Elevation Certificate Node - UI & Function - CO
  As a product manager, I want "elevation certificate" node to be removed as
  elevation certificate will be part of the newly created Flood node as we
  start offering admitted Primary flood endorsement to our members.

  @TC99932
  Scenario: US51930 - Verify that Elevation Certificate node is removed from the UI - multiple locations NB and END - CO_005 - 09/07/2025

    Given I use "CO_005" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Tenants       | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Denver CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Third location Elevation Certificate visibility - END"

  @TC99933
  Scenario: US51930 - Verify that Elevation Certificate node is removed from the UI for multiple locations NB and RNW - CO_003 - 09/07/2025

    Given I use "CO_003" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - RNW"

  @TC99934
  Scenario: US51930 - Verify that Elevation Certificate node is removed on renewal - multiple locations NB and RNW - CO_001 - 09/07/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I fill out HO quote elevation certificate details

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Condo/Co-op   | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - RNW"

    When I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - RNW"

  #  @TC99935 - NB before PDF, END after PDF
  #  @TC99936 - OOS END

  @TC99937
  Scenario: US51930 - Verify that Elevation Certificate node is not removed NB - CO_001 - 09/06/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/06/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

  @TC99938
  Scenario: US51930 - Verify that Elevation Certificate node is not removed RNW - CO_002 - 02/09/2024

    Given I use "CO_002" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "02/09/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click save changes button
    * I fill out HO quote elevation certificate details

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Tenants       | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Wheat Ridge CO" page

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - RNW"

    When I navigate to "Arvada CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - RNW"