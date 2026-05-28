@PrimaryFlood @PFHS @US52833
Feature: Change Request: HS - Update Elevation Certificate Questions - NJ - UI
  As a product manager, I want "elevation certificate" page to be updated on the HS LOB

  @TC106349
  Scenario: US52833 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram - 1,2,3,4 (NB/END) - NJ_001 - 09/07/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Budd Lake NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page
    * I click "elevation certificate" block
    * I type "1,2,3,4" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 - NB"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the total square feet for the attached garage?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "visible" in "elevation certificate" block
    * I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "Position and visibility of the questions when d) field is populated - NB"

    When I set "Elevation_Certificate_Building_Diagram_Number" to "1,2,3,4"
    * I set "Elevation_Certificate_Total_Square_Feet_For_The_Attached_Garage" to "1"
    * I set "Elevation_Certificate_Permanent_Flood_Openings" to "1"
    * I set "Elevation_Certificate_Total_Area_Of_All_Permanent_Openings" to "1"
    * I set "Elevation_Certificate_Top_Of_Bottom_Floor" to "1"
    * I set "Elevation_Certificate_Top_Of_Next_Floor" to "1"
    * I set "Elevation_Certificate_Bottom_Of_The_Attached_Garage" to "1"
    * I set "Elevation_Certificate_Lowest_Elevation_Machinery" to "1"
    * I set "Elevation_Certificate_Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Elevation_Certificate_Highest_Adjacent_Finished_Grade" to "1"
    * I set "Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation" to "1"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new endorsement
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click save changes button
    * I navigate to "Elevation Certificate" page

    When I click "elevation certificate" block
    * I type "1,2,3,4" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 - END"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the total square feet for the attached garage?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "visible" in "elevation certificate" block
    * I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "Position and visibility of the questions when d) field is populated - END"

  @TC106350
  Scenario: US52833 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram - 6/7/8 and 1,2,3,4 (w/vented garage) - NB/RNW - NJ_001 - 09/07/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Budd Lake NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page
    * I click "elevation certificate" block
    * I type "1,2,3,4 (w/ vented garage)" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 (w/ vented garage) - NB"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the total square feet for the attached garage?" is "not visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "not visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "not visible" in "elevation certificate" block
    * I take screenshot "Elevation questions visibility for diagram number 1,2,3,4 (w/ vented garage) - NB"

    When I set "Elevation_Certificate_Building_Diagram_Number" to "1,2,3,4 (w/ vented garage)"
    * I set "Elevation_Certificate_Top_Of_Bottom_Floor" to "1"
    * I set "Elevation_Certificate_Top_Of_Next_Floor" to "1"
    * I set "Elevation_Certificate_Bottom_Of_The_Attached_Garage" to "1"
    * I set "Elevation_Certificate_Lowest_Elevation_Machinery" to "1"
    * I set "Elevation_Certificate_Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Elevation_Certificate_Highest_Adjacent_Finished_Grade" to "1"
    * I set "Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation" to "1"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click save changes button
    * I navigate to "Elevation Certificate" page

    When I click "elevation certificate" block
    * I type "8" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I verify input field "What is the Square feet of the enclosure?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the crawls space or enclosure(s) within 1.0 foot above adjacent grade" is "visible" in "elevation certificate" block
    * I verify input field "What is the total net area of flood openings in square inches" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 8 - RNW"

  @TC106351
  Scenario: US52833 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram 1,2,3,4 (w/vented garage) and 5 (NB/END) - NJ_001 - 09/07/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Budd Lake NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page
    * I click "elevation certificate" block
    * I type "5" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 5 - NB"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the total square feet for the attached garage?" is "not visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "not visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "not visible" in "elevation certificate" block
    * I take screenshot "Elevation questions visibility for diagram number 5 - NB"

    When I set "Elevation_Certificate_Building_Diagram_Number" to "5"
    * I set "Elevation_Certificate_Top_Of_Bottom_Floor" to "1"
    * I set "Elevation_Certificate_Top_Of_Next_Floor" to "1"
    * I set "Elevation_Certificate_Bottom_Of_The_Attached_Garage" to "1"
    * I set "Elevation_Certificate_Lowest_Elevation_Machinery" to "1"
    * I set "Elevation_Certificate_Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Elevation_Certificate_Highest_Adjacent_Finished_Grade" to "1"
    * I set "Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation" to "1"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new endorsement
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click save changes button
    * I navigate to "Elevation Certificate" page

    When I click "elevation certificate" block
    * I type "1,2,3,4 (w/ vented garage)" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 (w/ vented garage) - END"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the total square feet for the attached garage?" is "not visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "not visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "not visible" in "elevation certificate" block
    * I take screenshot "Elevation questions visibility for diagram number 1,2,3,4 (w/ vented garage) - END"

  @TC106352
  Scenario: US52833 - Verify the questions for the "What is the Elevation of the" - 6/7/8 and 1,2,3,4 (w/ vented garage) diagram number NB/RNW - NJ_001 - 09/07/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Budd Lake NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page
    * I click "elevation certificate" block
    * I type "6" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 6 - NB"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the Square feet of the enclosure?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the crawls space or enclosure(s) within 1.0 foot above adjacent grade" is "visible" in "elevation certificate" block
    * I verify input field "What is the total net area of flood openings in square inches" is "visible" in "elevation certificate" block
    * I take screenshot "Elevation questions visibility for diagram number 6 - NB"

    When I set "Elevation_Certificate_Building_Diagram_Number" to "6"
    * I set "Elevation_Certificate_Square_Feet_Enclosure" to "1"
    * I set "Elevation_Certificate_Permanent_Flood_Openings" to "1"
        # No_Flood_Openings_Crawls_Space
    * I set "Elevation_Certificate_Total_Net_Area_Square_Inches" to "1"
    * I set "Elevation_Certificate_Top_Of_Bottom_Floor" to "1"
    * I set "Elevation_Certificate_Top_Of_Next_Floor" to "1"
    * I set "Elevation_Certificate_Bottom_Of_The_Attached_Garage" to "1"
    * I set "Elevation_Certificate_Lowest_Elevation_Machinery" to "1"
    * I set "Elevation_Certificate_Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Elevation_Certificate_Highest_Adjacent_Finished_Grade" to "1"
    * I set "Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation" to "1"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click save changes button
    * I navigate to "Elevation Certificate" page

    When I click "elevation certificate" block
    * I type "1,2,3,4 (w/ vented garage)" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 (w/ vented garage) - RNW"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the total square feet for the attached garage?" is "not visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "not visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "not visible" in "elevation certificate" block
    * I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "Elevation questions visibility for diagram number 1,2,3,4 (w/ vented garage) - RNW"

  @TC106353
  Scenario: US52833 - Verify the questions for the "What is the Elevation of the" - 5 and 1,2,3,4 diagram number (NB/RNW) - NJ_001 - 09/07/2024

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Budd Lake NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page
    * I set "Elevation_Certificate_Building_Diagram_Number" to "5"
    * I set "Elevation_Certificate_Top_Of_Bottom_Floor" to "1"
    * I set "Elevation_Certificate_Top_Of_Next_Floor" to "1"
    * I set "Elevation_Certificate_Bottom_Of_The_Attached_Garage" to "1"
    * I set "Elevation_Certificate_Lowest_Elevation_Machinery" to "1"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to "Elevation Certificate" page

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 5 - RNW (first location)"

    And I verify input field "What is the total square feet for the attached garage?" is "not visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "not visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "not visible" in "elevation certificate" block
    * I take screenshot "Elevation questions visibility for diagram number 5 - RNW (first location)"

    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click save changes button
    * I navigate to "Elevation Certificate" page

    When I click "elevation certificate" block
    * I type "1,2,3,4" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 - RNW"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the total square feet for the attached garage?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "visible" in "elevation certificate" block
    * I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "Position and visibility of the questions when d) field is populated - RNW"

  @TC106354
  Scenario: US52833 - Verify the questions for the "What is the Elevation of the" - 1,2,3,4 diagram number (NB/END) - NJ_001 - 09/06/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Budd Lake NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page
    * I click "elevation certificate" block
    * I type "1,2,3,4" to "What is the building diagram number?" dropdown
    * I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "not visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "not visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "not visible" in "elevation certificate" block
    * I verify input field "What is the total square feet for the attached garage?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square" is "visible" in "elevation certificate" block
    * I take screenshot "Visibility of the questions when d) field is populated - NB"

    When I set "Elevation_Certificate_Building_Diagram_Number" to "1,2,3,4"
    * I set "Elevation_Certificate_Total_Square_Feet_For_The_Attached_Garage" to "1"
    * I set "Elevation_Certificate_Permanent_Flood_Openings" to "1"
    * I set "Elevation_Certificate_Total_Area_Of_All_Permanent_Openings" to "1"
    * I set "Elevation_Certificate_Top_Of_Bottom_Floor" to "1"
    * I set "Elevation_Certificate_Top_Of_Next_Floor" to "1"
    * I set "Elevation_Certificate_Bottom_Of_The_Attached_Garage" to "1"
    * I set "Elevation_Certificate_Lowest_Elevation_Machinery" to "1"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new endorsement
    * I navigate to "Elevation Certificate" page

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 - END (first location)"

    And I verify input field "What is the total square feet for the attached garage?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "visible" in "elevation certificate" block
    * I take screenshot "Elevation questions visibility for diagram number 1,2,3,4 - END (first location)"

    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click save changes button
    * I navigate to "Elevation Certificate" page

    When I click "elevation certificate" block
    * I type "1,2,3,4" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 - END (second location)"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the total square feet for the attached garage?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "visible" in "elevation certificate" block
    * I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "Position and visibility of the questions when d) field is populated - RNW"