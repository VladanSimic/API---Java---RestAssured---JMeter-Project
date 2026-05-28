@PrimaryFlood @PFHS @US55634
Feature: HS - Add Non-Admitted FS Quoting Section on Location Coverage Page - UI - NC - Home & Condo
  As a product manager, I want to add the ability to quote non-admitted Flood Solutions LOB from the Location Page of the HS LOB

  @TC106271
  Scenario: US55634 - Verify that the new Flood section is placed below the question 'Do you purchase an NFIP policy with maximum limits?' within "flood information" block of the Location Coverage Page (NB/END) - NC_001 - 09/07/2025

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Would_You_Like_Non_Admitted_PF_Quote" to ""
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    * I verify section "Primary Flood Coverage Limits" is "visible" in "flood information" block
    * I verify "Dwelling" with index 2 value "250,000" is displayed in "flood information" block
    * I verify "Contents" with index 2 value "100,000" is displayed in "flood information" block
    * I verify "Loss of Use" with index 2 value "50,000" is displayed in "flood information" block
    * I verify "Other Structures" with index 2 value "25,000" is displayed in "flood information" block and it is read only
    * I verify "Deductible" with index 1 value "5,000" is displayed in "flood information" block
    * I verify "TIV" with index 1 value "425,000" is displayed in "flood information" block and it is read only

    * I verify section "Location Coverage Limits" is "visible" in "flood information" block
    * I verify input field "Replacement Cost" with index 1 is read only and has value
    * I verify input field "Contents" with index 2 is read only and has value
    * I verify input field "Loss of Use" with index 2 is read only and has value
    * I verify input field "Other Structures" with index 2 is read only and has value
    * I verify input field "AOP Deductible" with index 1 is read only and has value
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "flood information" block
    * I scroll to the bottom of the page
    * I take screenshot "Quoting section - NB"

    When I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new endorsement
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1          | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3400 Wake Forest Road | Raleigh | NC    | 27609 | Condo/Co-op   | 7500000 |           | 10,000 |            |
    * I click order property details button
    * I navigate to "Raleigh NC" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    * I verify section "Primary Flood Coverage Limits" is "visible" in "flood information" block
    * I verify "Dwelling" field with index 2 is read only and empty in "flood information" block
    * I verify "Contents" with index 2 value "250,000" is displayed in "flood information" block
    * I verify "Loss of Use" with index 2 value "50,000" is displayed in "flood information" block
    * I verify "Other Structures" field with index 2 is read only and empty in "flood information" block
    * I verify "Deductible" with index 1 value "2,500" is displayed in "flood information" block
    * I verify "TIV" with index 1 value "300,000" is displayed in "flood information" block and it is read only

    * I verify section "Location Coverage Limits" is "visible" in "flood information" block
    * I verify "Replacement Cost" field with index 1 is read only and empty in "flood information" block
    * I verify input field "Contents" with index 2 is read only and has value
    * I verify input field "Loss of Use" with index 2 is read only and has value
    * I verify "Other Structures" field with index 3 is read only and empty in "flood information" block
    * I verify input field "AOP Deductible" with index 1 is read only and has value
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "flood information" block
    * I scroll to the bottom of the page
    * I take screenshot "Quoting section (second location) - END"

  @TC106274
  Scenario: US55634 - Verify that the new Flood section is placed below the question 'Do you purchase an NFIP policy with maximum limits?' within "flood information" block of the Location Coverage Page (NB/RNW) - NC_001 - 09/07/2025

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Would_You_Like_Non_Admitted_PF_Quote" to ""
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    * I verify section "Primary Flood Coverage Limits" is "visible" in "flood information" block
    * I verify "Dwelling" field with index 2 is read only and empty in "flood information" block
    * I verify "Contents" with index 2 value "250,000" is displayed in "flood information" block
    * I verify "Loss of Use" with index 2 value "50,000" is displayed in "flood information" block
    * I verify "Other Structures" field with index 2 is read only and empty in "flood information" block
    * I verify "Deductible" with index 1 value "2,500" is displayed in "flood information" block
    * I verify "TIV" with index 1 value "300,000" is displayed in "flood information" block and it is read only

    * I verify section "Location Coverage Limits" is "visible" in "flood information" block
    * I verify "Replacement Cost" field with index 1 is read only and empty in "flood information" block
    * I verify input field "Contents" with index 2 is read only and has value
    * I verify input field "Loss of Use" with index 2 is read only and has value
    * I verify "Other Structures" field with index 3 is read only and empty in "flood information" block
    * I verify input field "AOP Deductible" with index 1 is read only and has value
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "flood information" block
    * I scroll to the bottom of the page
    * I take screenshot "Quoting section - NB"

    When I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1          | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3400 Wake Forest Road | Raleigh | NC    | 27609 | Homeowner     | 7500000 |           | 10,000 |            |
    * I click order property details button
    * I navigate to "Raleigh NC" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    * I verify section "Primary Flood Coverage Limits" is "visible" in "flood information" block
    * I verify "Dwelling" with index 2 value "250,000" is displayed in "flood information" block
    * I verify "Contents" with index 2 value "100,000" is displayed in "flood information" block
    * I verify "Loss of Use" with index 2 value "50,000" is displayed in "flood information" block
    * I verify "Other Structures" with index 2 value "25,000" is displayed in "flood information" block and it is read only
    * I verify "Deductible" with index 1 value "5,000" is displayed in "flood information" block
    * I verify "TIV" with index 1 value "425,000" is displayed in "flood information" block and it is read only

    * I verify section "Location Coverage Limits" is "visible" in "flood information" block
    * I verify input field "Replacement Cost" with index 1 is read only and has value
    * I verify input field "Contents" with index 2 is read only and has value
    * I verify input field "Loss of Use" with index 2 is read only and has value
    * I verify input field "Other Structures" with index 2 is read only and has value
    * I verify input field "AOP Deductible" with index 1 is read only and has value
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "flood information" block
    * I scroll to the bottom of the page
    * I take screenshot "Quoting section (second location) - RNW"

  @TC106275
  Scenario: US55634 - Verify that the new Flood section is placed below the question 'Do you purchase an NFIP policy with maximum limits?' within "flood information" block of the  Location Coverage Page (RNW) - NC_001 - 09/07/2024

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set "Manual_Subjectivities" to ""
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to "Durham NC" page

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "not mandatory"

    * I verify section "Primary Flood Coverage Limits" is "visible" in "flood information" block
    * I verify "Dwelling" with index 2 value "250,000" is displayed in "flood information" block
    * I verify "Contents" with index 2 value "100,000" is displayed in "flood information" block
    * I verify "Loss of Use" with index 2 value "50,000" is displayed in "flood information" block
    * I verify "Other Structures" with index 2 value "25,000" is displayed in "flood information" block and it is read only
    * I verify "Deductible" with index 1 value "5,000" is displayed in "flood information" block
    * I verify "TIV" with index 1 value "425,000" is displayed in "flood information" block and it is read only

    * I verify section "Location Coverage Limits" is "visible" in "flood information" block
    * I verify input field "Replacement Cost" with index 1 is read only and has value
    * I verify input field "Contents" with index 2 is read only and has value
    * I verify input field "Loss of Use" with index 2 is read only and has value
    * I verify input field "Other Structures" with index 2 is read only and has value
    * I verify input field "AOP Deductible" with index 1 is read only and has value
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "flood information" block
    * I scroll to the bottom of the page
    * I take screenshot "Quoting section (first location) - RNW"

    When I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1          | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3400 Wake Forest Road | Raleigh | NC    | 27609 | Condo/Co-op   | 7500000 |           | 10,000 |            |
    * I click order property details button
    * I navigate to "Raleigh NC" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    * I verify section "Primary Flood Coverage Limits" is "visible" in "flood information" block
    * I verify "Dwelling" field with index 2 is read only and empty in "flood information" block
    * I verify "Contents" with index 2 value "250,000" is displayed in "flood information" block
    * I verify "Loss of Use" with index 2 value "50,000" is displayed in "flood information" block
    * I verify "Other Structures" field with index 2 is read only and empty in "flood information" block
    * I verify "Deductible" with index 1 value "2,500" is displayed in "flood information" block
    * I verify "TIV" with index 1 value "300,000" is displayed in "flood information" block and it is read only

    * I verify section "Location Coverage Limits" is "visible" in "flood information" block
    * I verify "Replacement Cost" field with index 1 is read only and empty in "flood information" block
    * I verify input field "Contents" with index 2 is read only and has value
    * I verify input field "Loss of Use" with index 2 is read only and has value
    * I verify "Other Structures" field with index 3 is read only and empty in "flood information" block
    * I verify input field "AOP Deductible" with index 1 is read only and has value
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "flood information" block
    * I scroll to the bottom of the page
    * I take screenshot "Quoting section (second location) - RNW"

  @TC106276
  Scenario: US55634 - Verify that the new Flood section is placed below the question 'Do you purchase an NFIP policy with maximum limits?' within "flood information" block of the Location Coverage Page (NB/END) - NC_001 - 09/06/2025

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new endorsement
    * I navigate to "Durham NC" page

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "not mandatory"

    * I verify section "Primary Flood Coverage Limits" is "visible" in "flood information" block
    * I verify "Dwelling" with index 2 value "250,000" is displayed in "flood information" block
    * I verify "Contents" with index 2 value "100,000" is displayed in "flood information" block
    * I verify "Loss of Use" with index 2 value "50,000" is displayed in "flood information" block
    * I verify "Other Structures" with index 2 value "25,000" is displayed in "flood information" block and it is read only
    * I verify "Deductible" with index 1 value "5,000" is displayed in "flood information" block
    * I verify "TIV" with index 1 value "425,000" is displayed in "flood information" block and it is read only

    * I verify section "Location Coverage Limits" is "visible" in "flood information" block
    * I verify input field "Replacement Cost" with index 1 is read only and has value
    * I verify input field "Contents" with index 2 is read only and has value
    * I verify input field "Loss of Use" with index 2 is read only and has value
    * I verify input field "Other Structures" with index 2 is read only and has value
    * I verify input field "AOP Deductible" with index 1 is read only and has value
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "flood information" block
    * I scroll to the bottom of the page
    * I take screenshot "Quoting section (first location) - END"

    When I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1          | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3400 Wake Forest Road | Raleigh | NC    | 27609 | Condo/Co-op   | 7500000 |           | 10,000 |            |
    * I click order property details button
    * I navigate to "Raleigh NC" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    * I verify section "Primary Flood Coverage Limits" is "visible" in "flood information" block
    * I verify "Dwelling" field with index 2 is read only and empty in "flood information" block
    * I verify "Contents" with index 2 value "250,000" is displayed in "flood information" block
    * I verify "Loss of Use" with index 2 value "50,000" is displayed in "flood information" block
    * I verify "Other Structures" field with index 2 is read only and empty in "flood information" block
    * I verify "Deductible" with index 1 value "2,500" is displayed in "flood information" block
    * I verify "TIV" with index 1 value "300,000" is displayed in "flood information" block and it is read only

    * I verify section "Location Coverage Limits" is "visible" in "flood information" block
    * I verify "Replacement Cost" field with index 1 is read only and empty in "flood information" block
    * I verify input field "Contents" with index 2 is read only and has value
    * I verify input field "Loss of Use" with index 2 is read only and has value
    * I verify "Other Structures" field with index 3 is read only and empty in "flood information" block
    * I verify input field "AOP Deductible" with index 1 is read only and has value
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "flood information" block
    * I scroll to the bottom of the page
    * I take screenshot "Quoting section (second location) - END"

  @TC106278
  Scenario: US55634 - Verify that the new Flood section is not visible in "flood information" block of the Location Coverage Page of HS NC before NB PD Filing date - NC_001 - 09/06/2025

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I scroll to the bottom of the page

    Then I take screenshot "Quoting section invisibility - NB"

  @TC106279
  Scenario: US55634 - Verify that the new Flood section is not visible in "flood information" block of the Location Coverage Page of HS NC before REN PD Filing date - NC_001 - 02/09/2024

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "02/09/2024"
    * I set "Manual_Subjectivities" to ""
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to "Durham NC" page
    * I click "flood information" block
    * I scroll to the bottom of the page

    Then I take screenshot "Quoting section invisibility (Location page) - RNW"