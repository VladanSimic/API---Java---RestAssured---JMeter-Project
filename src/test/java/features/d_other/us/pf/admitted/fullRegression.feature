@PrimaryFlood @Admitted @fullRegressionFlood
Feature: PF - Admitted

  Scenario Outline: Relocated blocks and theirs UI and function - "<state>"

    Given I use "<TC>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
#    * I set "Wind_Or_Hail_Ded" to "<windHail>"

    * I set "Address_Line_1_Txt" to "<addressLine1>"
    * I set "City_Name_Txt" to "<city>"
    * I set "Zip_Code" to "<zip>"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out all pages except Flood Coverage page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I take screenshot "Optional flood coverage, excess flood block - not visible"

    When I navigate to "<cityState>" page

    Then I verify block "flood information" is "not visible" on page
    * I verify block "storm surge" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information, excess flood and storm surge blocks - not visible"

    When I navigate to "Flood Coverage" page

    Then I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I verify textbox "Eligibility Response" has value "This home is eligible for admitted primary flood coverage."
    * I verify label "Do you want to add the PURE Primary Flood Endorsement?" is bold
    * I verify label "Eligibility Response" is bold
    * I take screenshot "Endorsement question and eligibility response"

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory"

    When I click "Yes" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click save changes button

    Then I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" is defaulted to "No"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button

    Then I verify the "Do you want to add the PURE Primary Flood Endorsement?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I take screenshot "Endorsement question - enabled"

    When I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"
    * I fill out HO Flood Coverage page

    Then I verify "Dwelling & Other Structures (Up to $2M)" value "250,000" is displayed on page
    * I verify "Contents (Up to $1M)" value "100,000" is displayed on page
    * I verify "Loss of Use" value "250,000" is displayed on page

    When I click on the "Loss of Use" dropdown after scrolling "down"

    Then I verify dropdown size is 4
    * I verify dropdown values
      | values     |
      | - Select - |
      | 50,000     |
      | 150,000    |
      | 250,000    |
    * I take screenshot "Loss of Use dropdown values"
    * I click on the "Loss of Use" dropdown after scrolling "down"
    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is read only with value "0"
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is read only with value "0"
    * I verify "Deductible" value "5,000" is displayed on page
    * I take screenshot "Basement limits and deductible"

    When I click on the "Deductible" dropdown after scrolling "down"

    Then I verify dropdown size is 8
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
    * I take screenshot "Deductible dropdown values"
    * I click on the "Deductible" dropdown after scrolling "down"
    * I verify input field "Replacement Cost" is read only and has value
    * I verify input field "Contents" is read only and has value
    * I verify input field "Loss of Use" is read only and has value
    * I verify input field "Other Structures" is read only and has value
    * I verify input field "AOP Deductible" is read only and has value
    * I verify "Elevated Risk Credit" value "1" is displayed on page
    * I verify "High PML Load" value "1" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Basement question answered No"

    When I click "Yes" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    Then I verify "Basement Improvements Sublimit ($30K - $250K)" value "250,000" is displayed on page
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Basement limits - basement question answered Yes"

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify page "Elevation Certificate" is "not visible" in tree
    * I verify block "elevation certificate" is "visible" on page
    * I take screenshot "Elevation certificate page not visible/elevation certificate block visible"

    When I type "1,2,3,4" to "What is the building diagram number?" dropdown
    * I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I verify input field "What is the total square feet for the attached garage?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 - NB"

    * I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions (rate) - NB"

    When I set "Building_Diagram_Number" to "1,2,3,4"
    * I set "Total_Square_Feet_For_The_Attached_Garage" to "10,000"
    * I set "Permanent_Flood_Openings" to "10,000"
    * I set "Total_Area_Of_All_Permanent_Openings" to "10,000"
    * I set "Top_Of_Bottom_Floor" to "10,000"
    * I set "Top_Of_Next_Floor" to "10,000"
    * I set "Bottom_Of_The_Attached_Garage" to "10,000"
    * I set "Lowest_Elevation_Machinery" to "10,000"
    * I set "Lowest_Adjacent_Finished_Grade" to ""
    * I set "Highest_Adjacent_Finished_Grade" to ""
    * I set "Lowest_Adjacent_Lowest_Elevation" to ""

    Then I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "No"
    * I fill out HO Flood Coverage page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I click request bind
    * I think for 20 to 22 seconds
    * I take screenshot "Elevation questions"
    * I type "10,000" to "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I type "10,000" to "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I type "10,000" to "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field

    When I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify input field "How many floors does the location have above grade?" is "visible" in "primary flood coverage" block

    When I type "0" to "How many floors does the location have above grade?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Value of 0 - acceptable"

    When I type "-1" to "How many floors does the location have above grade?" input field
    * I click save changes button

    Then I verify validation message "The integer \"-1\" is too low, the minimum value is 0." is displayed
    * I take screenshot "Negative value - unacceptable"

    When I type "200" to "How many floors does the location have above grade?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Value of 200 - acceptable"

    When I type "201" to "How many floors does the location have above grade?" input field
    * I click save changes button

    Then I verify validation message "The integer \"201\" is too high, the maximum value is 200." is displayed
    * I take screenshot "Value of 201 - unacceptable"

    When I type "156" to "How many floors does the location have above grade?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Value of 156 - acceptable"

    When I type "1" to "How many floors does the location have above grade?" input field

    Then I verify "Dwelling" value "250,000" is displayed on page
    * I verify "Contents" with index 2 value "100,000" is displayed in "primary flood coverage" block
    * I verify "Loss of Use" with index 3 value "50,000" is displayed in "primary flood coverage" block
    * I verify "Other Structures" with index 2 value "25,000" is displayed in "primary flood coverage" block and it is read only
    * I verify "Deductible" with index 2 value "5,000" is displayed in "primary flood coverage" block
    * I verify "TIV" with index 1 value "425,000" is displayed in "primary flood coverage" block and it is read only

    * I verify input field "Replacement Cost" with index 2 in "primary flood coverage" block is read only and has value
    * I verify input field "Contents" with index 3 in "primary flood coverage" block is read only and has value
    * I verify input field "Loss of Use" with index 4 in "primary flood coverage" block is read only and has value
    * I verify input field "Other Structures" with index 3 in "primary flood coverage" block is read only and has value
    * I verify input field "AOP Deductible" with index 2 in "primary flood coverage" block is read only and has value
    * I take screenshot "Quoting section limits (Homeowners) - NB"

    When I click "Yes" radio button for label "Do you wish to include excess flood coverage?"

    Then I verify "Who is providing your underlying primary flood coverage?" label is "visible" in "excess flood" block

    When I click on the "Who is providing your underlying primary flood coverage?" dropdown after scrolling "down"

    Then I verify dropdown size is 5
    * I verify dropdown values
      | values                          |
      | - Select -                      |
      | NFIP                            |
      | PURE Primary Flood Endorsement  |
      | PURE Non-Admitted Primary Flood |
      | Other                           |

    * I take screenshot "Who is providing your underlying primary flood coverage dropdown values"
    * I verify "What Excess Flood coverage limits do you want to purchase?" label is "visible" in "excess flood" block
    * I verify input field "Primary Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Dwelling Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Dwelling Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Dwelling Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Dwelling Options dropdown values"
    * I verify read only field "Excess Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify input field "Primary Flood Contents Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Contents Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Contents Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Contents Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Contents Options dropdown values"
    * I verify read only field "Excess Flood Contents Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Contents Limit" is "visible" in "excess flood" block
    * I verify checkbox is "visible" for label "Manager Excess Flood Override" in "excess flood" block
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"

    When I rate, bind and initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page for "<state>"
      | addressLine1          | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 1820 N Delany Rd 510  | Gurnee      | IL    | 60031 | Condo/Co-op   | 7500000 |           | 10,000 |               | 1 |
      | 1437 Columbine Street | Denver      | CO    | 80206 | Condo/Co-op   | 7500000 |           | 10,000 | 2%            | 1 |
      | 45 McKinley Avenue    | Norwich     | CT    | 06360 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
      | 163 Shawn Ln          | Chatsworth  | GA    | 30705 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
      | 7 Manor Ln            | Oxford      | MA    | 01540 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
      | 378 Stanford St       | Perth Amboy | NJ    | 08861 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
    * I click order property details button
    * I navigate to the newly added location page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    When I click "elevation certificate" block
    * I type "1,2,3,4 (w/ vented garage)" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 (w/ vented garage) - END"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I scroll to the bottom of the page

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory - END"

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I scroll to the bottom of the page

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory - END"

    When I set "Building_Diagram_Number" to "1,2,3,4 (w/ vented garage)"
    * I set "Top_Of_Bottom_Floor" to "1"
    * I set "Top_Of_Next_Floor" to "1"
    * I set "Bottom_Of_The_Attached_Garage" to "1"
    * I set "Lowest_Elevation_Machinery" to "1"
    * I set "Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Highest_Adjacent_Finished_Grade" to "1"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "1"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"

    Then I fill out HO Flood Coverage page

    When I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"
    * I click save changes button

    Then I verify input field "Dwelling & Other Structures (Up to $2M)" in "primary flood coverage" block is read only and empty
    * I verify "Contents (Up to $1M)" value "250,000" is displayed on page
    * I verify "Loss of Use" value "250,000" is displayed on page

    When I click on the "Loss of Use" dropdown after scrolling "down"

    Then I verify dropdown size is 4
    * I verify dropdown values
      | values     |
      | - Select - |
      | 50,000     |
      | 150,000    |
      | 250,000    |

    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" in "primary flood coverage" block is read only and empty
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is read only with value "0"
    * I verify "Deductible" value "2,500" is displayed on page

    When I click on the "Deductible" dropdown after scrolling "down"

    Then I verify dropdown size is 8
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |

    * I verify input field "Replacement Cost" in "primary flood coverage" block is read only and empty
    * I verify input field "Contents" is read only and has value
    * I verify input field "Loss of Use" is read only and has value
    * I verify input field "Other Structures" in "primary flood coverage" block is read only and empty
    * I verify input field "AOP Deductible" is read only and has value
    * I verify "Elevated Risk Credit" value "1" is displayed on page
    * I verify "High PML Load" value "1" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Second location with basement question answered No - END"

    When I click "Yes" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify input field "Basement Improvements Sublimit ($30K - $250K)" in "primary flood coverage" block is read only and empty
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Second location with basement question answered Yes - END"

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify "Dwelling" field with index 1 is read only and empty in "primary flood coverage" block
    * I verify "Contents" with index 2 value "250,000" is displayed in "primary flood coverage" block
    * I verify "Loss of Use" with index 3 value "50,000" is displayed in "primary flood coverage" block
    * I verify "Other Structures" field with index 2 is read only and empty in "primary flood coverage" block
    * I verify "Deductible" with index 2 value "2,500" is displayed in "primary flood coverage" block
    * I verify "TIV" with index 1 value "300,000" is displayed in "primary flood coverage" block and it is read only

    * I verify "Replacement Cost" field with index 2 is read only and empty in "primary flood coverage" block
    * I verify input field "Contents" with index 3 in "primary flood coverage" block is read only and has value
    * I verify input field "Loss of Use" with index 4 in "primary flood coverage" block is read only and has value
    * I verify "Other Structures" field with index 3 is read only and empty in "primary flood coverage" block
    * I verify input field "AOP Deductible" with index 2 in "primary flood coverage" block is read only and has value
    * I take screenshot "Quoting section limits (Condo) - END"



    Examples:
      | TC     | addressLine1         | city        | state | zip   | cityState      | windHail |
      | IL_001 | 101 Main Street      | Evanston    | IL    | 60202 | Evanston IL    |          |
      | CO_001 | 101 Main Street      | Platteville | CO    | 80651 | Platteville CO |          |
      | CT_001 | 904 Howard Ave 8L    | New Haven   | CT    | 06519 | New Haven CT   |          |
      | GA_001 | 178 Springfield Blvd | Macon       | GA    | 31210 | Macon GA       | 5%       |
      | MA_001 | 25 Allied Dr         | Dedham      | MA    | 02026 | Dedham MA      |          |
      | NJ_001 | 38 Brookwood Dr      | Maplewood   | NJ    | 07040 | Maplewood NJ   |          |


