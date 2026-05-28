@PrimaryFlood @Admitted @US60806
Feature: PF Admitted - Turning on RI - QA Test Only 10/19/2025

  #US52833
  @TC118903 #@TC106349
  Scenario: TC118903 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram - 1,2,3,4 (NB/END) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

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
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

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

  @TC118904 #@TC106350
  Scenario: TC118904 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram - 6/7/8 and 1,2,3,4 (w/vented garage) - NB/RNW - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

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
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

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

  @TC118905 #@TC106351
  Scenario: TC118905 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram 1,2,3,4 (w/vented garage) and 5 (NB/END) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

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
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

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

  @TC118906 #@TC106352
  Scenario: TC118906 - Verify the questions for the "What is the Elevation of the" - 6/7/8 and 1,2,3,4 (w/ vented garage) diagram number NB/RNW - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

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
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

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

  @TC118907 @TC106353
  Scenario: TC118907 - Verify the questions for the "What is the Elevation of the" - 5 and 1,2,3,4 diagram number (NB/RNW) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

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
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

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

  @TC118908 #@TC106354
  Scenario: TC118908 - Verify the questions for the "What is the Elevation of the" - 1,2,3,4 diagram number (NB/END) - RI_001 - 10/18/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/18/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

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
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

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


  #US52834
  @TC118911 #@TC106264
  Scenario: TC118911 - Verify that the new Flood section is placed below the question 'Do you purchase an NFIP policy with maximum limits?' within "flood information" block of the Location Coverage Page (NB/END) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Would_You_Like_Non_Admitted_PF_Quote" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    When I click "Yes" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

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

    When I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new endorsement
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    When I click "Yes" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"

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

  @TC118912 #@TC106265
  Scenario: TC118912 - Verify that the new Flood section is placed below the question 'Do you purchase an NFIP policy with maximum limits?' within "flood information" block of the Location Coverage Page (NB/RNW) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Would_You_Like_Non_Admitted_PF_Quote" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    When I click "Yes" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

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

    When I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"

    Then I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    When I click "Yes" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"

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

  @TC118913 #@TC106266
  Scenario: TC118913 - Verify that the new Flood section is placed below the question 'Do you purchase an NFIP policy with maximum limits?' within "flood information" block of the  Location Coverage Page (RNW) - RI_001 - 10/18/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/18/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to location page

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "not mandatory"

    When I click "Yes" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

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
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    When I click "Yes" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"

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

  @TC118914 #@TC106267
  Scenario: TC118914 - Verify that the new Flood section is placed below the question 'Do you purchase an NFIP policy with maximum limits?' within "flood information" block of the Location Coverage Page (NB/END) - RI_001 - 10/18/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/18/2025"
    * I set "Endorsement_Effective_Date_END" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new endorsement
    * I navigate to location page

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "not mandatory"

    When I click "Yes" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

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
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"

    Then I verify "Would you like a Non-Admitted Primary Flood quote?" distant question doesn't have default answer
    * I verify "Would you like a Non-Admitted Primary Flood quote?" question is "mandatory"

    When I click "Yes" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"

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

  @TC118915 #@TC106269
  Scenario: TC118915 - Verify that the new Flood section is not visible in "flood information" block of the Location Coverage Page of HS NJ before NB PD Filing date - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I scroll to the bottom of the page

    Then I take screenshot "Quoting section invisibility - NB"


  #US52835
  @TC118921 #@TC105737
  Scenario: TC118921 - Verify that the 'excess flood' block is placed just below "flood information" block on the Location Coverage page (NB/END) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - END"

  @TC118922 #@TC105738
  Scenario: TC118922 - Verify that the 'excess flood' block is placed just below "flood information" block on the Location Coverage page (NB/RNW) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Type" to "Condo/Co-op"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - RNW"

  @TC118923 #@TC105739
  Scenario: TC118923 - Verify that the 'excess flood' block is just below "flood information" block on the Location Coverage page (RNW) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to location page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility (first location) - RNW"

    When I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility (second location) - RNW"

  @TC118924 #@TC105740
  Scenario: TC118924 - Verify that the 'excess flood' block is placed just below "flood information" block on the Location Coverage page (NB/END) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I navigate to location page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility (first location) - END"

    When I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - END"

  @TC118926 #@TC105981
  Scenario: TC118926 - Verify that the 'excess flood' block is not read-only when UW Company is Palomar NB - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to Home Surplus Lines Policy Page

    Then I click "Manager Override" checkbox in "underwriting company" block
    * I type "Palomar Excess and Surplus Insurance Company" to "Underwriting Company" dropdown

    When I navigate to location page

    Then I verify the "Do you wish to include excess flood coverage?" question with yes and no radio buttons is "disabled" in "excess flood" block
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block fields disabled - NB"

  @TC118927 #@TC105983
  Scenario: TC118927 - Verify that the 'excess flood' block is not on the Location page before NB PD Filing date - RI_001 - 10/18/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/18/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page
    * I click "flood information" block
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block invisibility (Location page)"

    When I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood block visibility (Optional coverages page)"


  #US52836
  @TC118929 #@TC105502
  Scenario: TC118929 - Verify that the Excess Flood Block is not present on the Optional Coverage Screen after PD Filing dates (NB/END) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal - END"

  @TC118930 #@TC105503
  Scenario: TC118930 - Verify that the Excess Flood Block is not present on the Optional Coverage Screen after PD Filing dates (NB/RNW) - RI_001 - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal - RNW"

  @TC118931 #@TC105504
  Scenario: TC118931 - Verify that the Excess Flood Block is present on the Optional Coverage Screen before PD Filing dates (NB/END) - RI_001 - 10/17/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/17/2025"
    * I set "Endorsement_Effective_Date_END" to "10/18/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood block visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood blocks visibility - END"

  @TC118932 #@TC105505
  Scenario: TC118932 - Verify that the Excess Flood Block is present on the Optional Coverage Screen before PD Filing dates (NB), and  Excess Flood Block is not present on the Optional Coverage Screen after PD Filing dates (RNW) - RI_001 - 10/18/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/18/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood blocks visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal (first location) - RNW"

    When I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 90 Brenton Road | Newport | RI    | 02840 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Newport RI" page
    * I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block removal (second location) - RNW"


  #US57014
  @TC118946 #@TC110340
  Scenario: TC118946 - 5. Verify new questions are optional to rate and mandatory to bind for new HS RI policies, and mandatory to rate for added risk locations on existing policies (NB/END) - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"
    * I set "Elevation_Certificate_Lowest_Adjacent_Finished_Grade" to ""
    * I set "Elevation_Certificate_Highest_Adjacent_Finished_Grade" to ""
    * I set "Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "Yes" radio button for distant label "Would you like a Non-Admitted Primary Flood quote?"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions (rate) - NB"

    When I fill out HS quote elevation certificate details page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I click request bind
    * I think for 20 to 25 seconds

    Then I take screenshot "Elevation questions"
    * I type "1" to "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I type "1" to "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I type "1" to "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field

    When I rate, bind and initiate new endorsement
    * I navigate to "Elevation Certificate" page

    * I delete value from "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I delete value from "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I delete value from "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions - END"

  @TC118947 #@TC110341
  Scenario: TC118947 - 6. Verify new questions are optional to rate and mandatory to bind for new HS RI policies, and mandatory for added risk locations on existing ones (NB/RNW) - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Manual_Subjectivities" to ""
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"
    * I set "Elevation_Certificate_Lowest_Adjacent_Finished_Grade" to ""
    * I set "Elevation_Certificate_Highest_Adjacent_Finished_Grade" to ""
    * I set "Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions (rate) - NB"

    When I fill out HS quote elevation certificate details page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I click request bind
    * I think for 20 to 25 seconds

    Then I take screenshot "Elevation questions"
    * I type "1" to "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I type "1" to "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I type "1" to "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field

    When I rate, bind and initiate new renewal
    * I navigate to "Elevation Certificate" page

    * I delete value from "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I delete value from "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I delete value from "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions - RNW"

  @TC118948 #@TC110342
  Scenario: TC118948 - 7. Verify new questions are not mandatory to rate existing locations on Endorsements after NB PD Filing date for HS RI (NB/END) - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button
    * I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new endorsement
    * I navigate to "Elevation Certificate" page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions - END"

  @TC118949 #@TC110343
  Scenario: TC118949 - 8. Verify new questions are not mandatory to rate existing locations on Renewal after the RNW PD filing date for HS RI (NB/RNW) - 10/19/2025

    Given I use "RI_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to location page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button
    * I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to "Elevation Certificate" page
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions - RNW"