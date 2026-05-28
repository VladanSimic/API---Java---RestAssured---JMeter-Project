@PrimaryFlood @Admitted @US51490
Feature: PF Admitted - Flood Information Block Update - UI & Function - CO
  As a product manager, I want to Flood Information block on the Flood node to display certain fields
  so we can start offering primary flood endorsement to our members

  @TC98980
  Scenario: US51490 - Verify fields visibility in flood information block for multiple locations NB and END - CO_004 - 09/07/2025

    Given I use "CO_004" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone Override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block

    When I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Do you purchase an NFIP policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Does the location have a PURE NFIP Flood Policy?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "First location - NB"
    * I fill out HO Flood Coverage page
    * I fill out HO quote elevation certificate details

    When I navigate to "Denver CO" page
    * I navigate to "Flood Coverage" page

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone Override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block

    When I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Do you purchase an NFIP policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Does the location have a PURE NFIP Flood Policy?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "Second location - NB"
    * I fill out HO Flood Coverage page
    * I fill out HO quote elevation certificate details

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone Override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block

    When I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Do you purchase an NFIP policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Does the location have a PURE NFIP Flood Policy?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "Third location - END"

  @TC98988
  Scenario: US51490 - Verify fields visibility in flood information block for multiple locations NB and RNW - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page

    Then I take screenshot "First location - RNW"

    When I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone Override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block

    When I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Do you purchase an NFIP policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Does the location have a PURE NFIP Flood Policy?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "Second location - RNW"

  @TC98989
  Scenario: US51490 - Verify fields visibility in flood information block for multiple locations NB and RNW - CO_001 - 09/07/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone Override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Do you purchase an NFIP policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Does the location have a PURE NFIP Flood Policy?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "First location - RNW"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone Override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block

    When I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Do you purchase an NFIP policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I verify the "Does the location have a PURE NFIP Flood Policy?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "Second location - RNW"

  # TC98990 - NB before PDF, END after PDF, RNW
  # TC98992 - OOS END
  @TC98993
  Scenario: US51490 - Verify fields visibility in flood information block NB - CO_001 - 09/06/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I verify the "Do you purchase an NFIP policy with maximum limits?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I verify the "Does the location have a PURE NFIP Flood Policy?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I scroll to "Does the location have a PURE NFIP Flood Policy?" element
    * I take screenshot "Flood information block - before PDF date"

  @TC99002
  Scenario: US51490 - Verify fields visibility in flood information block NB and RNW - CO_001 - 02/09/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "02/09/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to "Wheat Ridge CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I verify the "Do you purchase an NFIP policy with maximum limits?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I verify the "Does the location have a PURE NFIP Flood Policy?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I scroll to "Does the location have a PURE NFIP Flood Policy?" element
    * I take screenshot "Flood information block - RNW"