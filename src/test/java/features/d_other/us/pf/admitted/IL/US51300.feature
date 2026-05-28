@PrimaryFlood @Admitted @US51300
Feature: PF Admitted - Flood Information Block Update - UI & Function - IL
  As a product manager, I want to Flood Information block on the Flood node to display certain fields
  so we can start offering primary flood endorsement to our members

  @TC98995
  Scenario: US51300 - Verify fields visibility in flood information block for multiple locations NB and END - IL_004 - 09/07/2025

    Given I use "IL_004" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
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
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "First location - NB"

    When I navigate to "Burr Ridge IL" page
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
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "Second location - NB"
    * I navigate to "Gurnee IL" page
    * I fill out HO Flood Coverage page
    * I fill out HO quote elevation certificate details
    * I navigate to "Burr Ridge IL" page
    * I fill out HO Flood Coverage page
    * I fill out HO quote elevation certificate details

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 | Unlimited | 10,000 |            |
    * I navigate to "Chicago IL" page
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
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "Third location - END"

  @TC98996
  Scenario: US51300 - Verify fields visibility in flood information block for multiple locations NB and RNW - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page

    Then I take screenshot "First location - RNW"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 | Unlimited | 10,000 |            |
    * I navigate to "Chicago IL" page
    * I click order property details button
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
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "Second location - RNW"

  @TC98997
  Scenario: US51300 - Verify fields visibility in flood information block for multiple locations NB and RNW - IL_001 - 09/07/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to "Gurnee IL" page
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
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "First location - RNW"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 | Unlimited | 10,000 |            |

    * I navigate to "Chicago IL" page
    * I click order property details button
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
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
    * I take screenshot "Second location - RNW"

#  @TC98998
#  Scenario: US51300 - Verify fields visibility in flood information block for multiple locations NB, END and RNW - IL_001 - 09/06/2025
#
#    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
#    * I load random user data
#    * I set "Effective_Date" to "09/06/2025"
#    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
#
#    When I am logged in to Pure as "Field"
#    * I create a new "HO" quote for a new customer
#    * I rate, bind and initiate new endorsement
#    * I navigate to Homeowner Policy Page and add new risk location with basic details only
#      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
#      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 | Unlimited | 10,000 |            |
#    * I navigate to "Chicago IL" page
#    * I navigate to "Flood Coverage" page
#
#    Then I verify block "flood information" is "visible" on page
#    * I verify input field "Flood Zone" is "visible" in "flood information" block
#    * I verify checkbox is "visible" for label "Manager Flood Zone Override" in "flood information" block
#    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
#    * I verify textbox "Flood ID" is "visible" in "flood information" block
#    * I verify read only field "Panel Number" is "visible" in "flood information" block
#    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block
#
#    When I click "Manager Flood Zone Override" checkbox in "flood information" block
#    * I set the flood zone to "AE/A1-A30/A Unnumbered"
#
#    Then I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
#    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
#    * I take screenshot "Second location - END"
#
#    When I fill out all pages except Cover page
#    * I click save changes button
#    * I navigate to "Gurnee IL" page
#    * I fill out HO quote elevation certificate details
#
#    Then I review changes
#    * I rate an endorsement
#    * I issue an endorsement
#    * I create a renewal
#
#    When I navigate to policy image page
#    * I navigate to "Gurnee IL" page
#    * I navigate to "Flood Coverage" page
#    * I click "Manager Flood Zone Override" checkbox in "flood information" block
#    * I set the flood zone to "AE/A1-A30/A Unnumbered"
#
#    Then I verify block "flood information" is "visible" on page
#    * I verify input field "Flood Zone" is "visible" in "flood information" block
#    * I verify checkbox is "visible" for label "Manager Flood Zone Override" in "flood information" block
#    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
#    * I verify textbox "Flood ID" is "visible" in "flood information" block
#    * I verify read only field "Panel Number" is "visible" in "flood information" block
#    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block
#    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
#    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "not visible" in "flood information" block
#    * I take screenshot "First location - RNW"
#
#    When I navigate to "Chicago IL" page
#    * I navigate to "Flood Coverage" page
#
#    Then I take screenshot "Second location - RNW"

  @TC99000
  Scenario: US51300 - Verify fields visibility in flood information block NB - IL_001 - 09/06/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I scroll to "Does this location have a PURE NFIP Flood policy with maximum limits?" element
    * I take screenshot "Flood information block - before PDF date"

  @TC99003
  Scenario: US51300 - Verify fields visibility in flood information block NB and RNW - IL_001 - 02/09/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "02/09/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to "Gurnee IL" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify checkbox is "visible" for label "Manager Flood Zone override" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I verify textbox "Flood ID" is "visible" in "flood information" block
    * I verify read only field "Panel Number" is "visible" in "flood information" block
    * I verify read only combobox field "Panel Date" is "visible" in "flood information" block
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "visible" in "flood information" block
    * I scroll to "Does this location have a PURE NFIP Flood policy with maximum limits?" element
    * I take screenshot "Flood information block - RNW"