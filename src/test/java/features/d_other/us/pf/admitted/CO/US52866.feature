@PrimaryFlood @Admitted @US52866
Feature: PF Admitted - Update Elevation Certificate Details - UI & Function - CO
  As a product manager, I want "elevation certificate" block to be updated on the Flood node
  as we start offering admitted Primary flood endorsement to our members.

  @TC101890
  Scenario: US52866 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram - 1,2,3,4 (NB/END) - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "Elevation block visibility - NB"

    When I click "elevation certificate" block
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

    When I set "Building_Diagram_Number" to "1,2,3,4"
    * I set "Total_Square_Feet_For_The_Attached_Garage" to "1"
    * I set "Permanent_Flood_Openings" to "1"
    * I set "Total_Area_Of_All_Permanent_Openings" to "1"
    * I set "Top_Of_Bottom_Floor" to "1"
    * I set "Top_Of_Next_Floor" to "1"
    * I set "Bottom_Of_The_Attached_Garage" to "1"
    * I set "Lowest_Elevation_Machinery" to "1"
    * I set "Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Highest_Adjacent_Finished_Grade" to "1"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "1"

    Then I fill out HO Flood Coverage page

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I take screenshot "Elevation block visibility - END"

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

  @TC101899
  Scenario: US52866 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram - 6/7/8 and 1,2,3,4 (w/vented garage) - NB/RNW - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "Elevation block visibility - NB"

    When I click "elevation certificate" block
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

    When I set "Building_Diagram_Number" to "1,2,3,4 (w/ vented garage)"
    * I set "Top_Of_Bottom_Floor" to "1"
    * I set "Top_Of_Next_Floor" to "1"
    * I set "Bottom_Of_The_Attached_Garage" to "1"
    * I set "Lowest_Elevation_Machinery" to "1"
    * I set "Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Highest_Adjacent_Finished_Grade" to "1"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "1"

    Then I fill out HO Flood Coverage page

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I take screenshot "Elevation block visibility - RNW"

    When I click "elevation certificate" block
    * I type "8" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I verify input field "What is the Square feet of the enclosure?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the crawls space or enclosure(s) within 1.0 foot above adjacent grade" is "visible" in "elevation certificate" block
    * I verify input field "What is the total net area of flood openings in square inches" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 8 - RNW"

  @TC101901
  Scenario: US52866 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram 1,2,3,4 (w/vented garage) and 5 (NB/END) - CO_002 - 09/07/2025

    Given I use "CO_002" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "Elevation block visibility - NB"

    When I click "elevation certificate" block
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

    When I set "Building_Diagram_Number" to "5"
    * I set "Top_Of_Bottom_Floor" to "1"
    * I set "Top_Of_Next_Floor" to "1"
    * I set "Bottom_Of_The_Attached_Garage" to "1"
    * I set "Lowest_Elevation_Machinery" to "1"
    * I set "Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Highest_Adjacent_Finished_Grade" to "1"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "1"

    Then I fill out HO Flood Coverage page

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Tenants       | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I take screenshot "Elevation block visibility - RNW"

    When I click "elevation certificate" block
    * I type "1,2,3,4 (w/ vented garage)" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 5 - RNW"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the total square feet for the attached garage?" is "not visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "not visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "not visible" in "elevation certificate" block
    * I take screenshot "Elevation questions visibility for diagram number 1,2,3,4 (w/ vented garage) - NB"

  @TC101900
  Scenario: US52866 - Verify the questions for the "What is the Elevation of the" - 6/7/8 and 1,2,3,4 (w/ vented garage) diagram number NB/RNW - CO_003 - 09/07/2025

    Given I use "CO_003" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "Elevation block visibility - NB"

    When I click "elevation certificate" block
    * I type "6" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "What is the Square feet of the enclosure?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the crawls space or enclosure(s) within 1.0 foot above adjacent grade" is "visible" in "elevation certificate" block
    * I verify input field "What is the total net area of flood openings in square inches" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 6 - NB"

    When I set "Building_Diagram_Number" to "6"
    * I set "Square_Feet_Enclosure" to "1"
    * I set "No_Flood_Openings_Crawls_Space" to "1"
    * I set "Total_Net_Area_Square_Inches" to "1"
    * I set "Top_Of_Bottom_Floor" to "1"
    * I set "Top_Of_Next_Floor" to "1"
    * I set "Bottom_Of_The_Attached_Garage" to "1"
    * I set "Lowest_Elevation_Machinery" to "1"
    * I set "Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Highest_Adjacent_Finished_Grade" to "1"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "1"

    Then I fill out HO Flood Coverage page

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I take screenshot "Elevation block visibility - RNW"

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

  @TC101953
  Scenario: US52866 - Verify the questions for the "What is the Elevation of the" - 5 and 1,2,3,4 diagram number (NB/RNW) - CO_001 - 09/07/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click save changes button

    Then I navigate to "Elevation Certificate" page

    When I set "Building_Diagram_Number" to "5"
    * I set "Top_Of_Bottom_Floor" to "1"
    * I set "Top_Of_Next_Floor" to "1"
    * I set "Bottom_Of_The_Attached_Garage" to "1"
    * I set "Lowest_Elevation_Machinery" to "1"

    Then I fill out HO quote elevation certificate details

    When I rate, bind and initiate new renewal
    * I navigate to "Flood Coverage" page

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 5 - RNW"

    And I verify input field "What is the total square feet for the attached garage?" is "not visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "not visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "not visible" in "elevation certificate" block
    * I take screenshot "Elevation questions visibility for diagram number 5 - RNW"

    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Tenants       | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page

    Then I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I take screenshot "Elevation block visibility - RNW"

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