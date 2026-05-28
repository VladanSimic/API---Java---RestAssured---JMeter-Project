@PrimaryFlood @Admitted @US53572
Feature: PF - Admitted Enable Feature for Mid-Term Endorsement - CO
  As a product manager, I want to enable the feature for Mid-Term endorsement in CO

  @TC102644
  Scenario: US53572 - Verify that all Flood related blocks and pages that should be on the Flood node are removed from other pages on Midterm Endorsement (NB/END) - CO_002 - 09/06/2025

    Given I use "CO_002" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Arvada CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click save changes button

    Then I fill out HO quote elevation certificate details

    When I rate, bind and initiate new endorsement
    * I navigate to "Arvada CO" page

    Then I verify block "storm surge" is "not visible" on page
    * I verify block "flood information" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Blocks removed from location page/Elevation certificate page not displayed  - END"

  @TC102645
  Scenario: US53572 - Verify that all Flood related blocks and pages that are removed from other pages are displayed on the Flood node on Midterm Endorsement (NB/END) - CO_003 - 09/06/2025

    Given I use "CO_003" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Arvada CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click save changes button

    Then I fill out HO quote elevation certificate details

    When I rate, bind and initiate new endorsement
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I verify block "flood information" is "visible" on page
    * I verify block "storm surge" is "visible" on page
    * I verify block "elevation certificate" is "visible" on page
    * I verify block "excess flood" is "visible" on page
    * I take screenshot "Flood coverage page - blocks visibility - END"

  @TC102649
  Scenario: US53572 - Verify that new Primary Flood Coverage blocks is displayed on the Flood node on Midterm Endorsement (NB/END) - CO_001 - 09/06/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Arvada CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click save changes button

    Then I fill out HO quote elevation certificate details

    When I rate, bind and initiate new endorsement
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify block "primary flood coverage" is "visible" on page
    * I verify block "primary flood coverage" is at position 4 on page
    * I verify block "excess flood" is at position 5 on page
    * I take screenshot "Flood coverage page - primary flood coverage block visibility - END"