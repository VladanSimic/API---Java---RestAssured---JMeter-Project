@PrimaryFlood @Admitted @US59205
Feature: PF Admitted - Turning on MA - QA Test Only

  @TC109548MA
  Scenario: US56460 - Verify that after HO post-PD END, UW questions are optional if blank or "No" for existing locations, but mandatory if "Yes" for both existing and new locations - 09/06/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"
    * I set "Residence_Type" to "Condo/Co-op"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new endorsement
    * I navigate to "Dedham MA" page
    * I click order property details button

    When I navigate to "Flood Coverage" page

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory (NB location)"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory (NB location)"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Homeowner     | 7500000 |           | 10,000 | Not Available |

    Then I navigate to "Oxford MA" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory (second location)"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory (second location)"

  @TC110128MA
  Scenario: US57017 - Verify additional questions are not displayed when 'Quote a Non-Admitted Flood Primary' is 'No' (NB/RNW) - 09/07/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to ""
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to ""
    * I set "Floors_Above_Grade" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify input field "How many floors does the location have above grade?" is "not visible" in "primary flood coverage" block
    * I take screenshot "Floors above grade question - not visible"

    When I fill out HO Flood Coverage page

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |

    Then I navigate to "Oxford MA" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify that "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "not visible" on page
    * I take screenshot "Basement question - not visible"

  @TC107094MA
  Scenario: US55008 - Verify that Excess Flood Block is updated (Homeowners/Tenants, NB/RNW) - 09/07/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for label "Do you wish to include excess flood coverage?"

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
    * I take screenshot "Excess flood block - NB"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Tenants       | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "Oxford MA" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for label "Do you wish to include excess flood coverage?"

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
#    * I verify input field "Excess Flood Dwelling Options" is read only with value "- Select -"
    * I verify input field "Excess Flood Dwelling Options" is "visible" in "excess flood" block

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
    * I take screenshot "Excess flood block - RNW"

  @TC97813MA
  Scenario: US49684 - Verify Flood information block for multiple locations (NB/END) - 09/07/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Dedham MA" page

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I navigate to "Oxford MA" page

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - END"

  @TC101295MA
  Scenario: US52954 - Verify Primary Flood Coverage block for multiple locations (NB/RNW) - 09/07/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Type" to "Tenants"
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"
    * I set "Building_Diagram_Number" to "1,2,3,4 (w/ vented garage)"
    * I set "Top_Of_Bottom_Floor" to "20,000"
    * I set "Top_Of_Next_Floor" to "20,000"
    * I set "Bottom_Of_The_Attached_Garage" to "20,000"
    * I set "Lowest_Elevation_Machinery" to "20,000"
    * I set "Lowest_Adjacent_Finished_Grade" to "20,000"
    * I set "Highest_Adjacent_Finished_Grade" to "20,000"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "20,000"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Dedham MA" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify block "primary flood coverage" is at position 4 on page
    * I verify block "excess flood" is at position 5 on page
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Do you want to add the PURE Primary Flood Endorsement?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify textarea "Eligibility Response" is "visible" in "primary flood coverage" block
#    * I verify checkbox is "visible" for label "UW Manager Override" in "primary flood coverage" block - commented out since it depends on location eligibility
    * I verify input field "Dwelling & Other Structures (Up to $2M)" in "primary flood coverage" block is read only and empty
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
    * I take screenshot "First location with basement question answered No - NB"

    When I click "Yes" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify input field "Basement Improvements Sublimit ($30K - $250K)" in "primary flood coverage" block is read only and empty
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "First location with basement question answered Yes - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "Dedham MA" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I take screenshot "First location - RNW"

    When I navigate to "Oxford MA" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify block "primary flood coverage" is at position 4 on page
    * I verify block "excess flood" is at position 5 on page
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Do you want to add the PURE Primary Flood Endorsement?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify textarea "Eligibility Response" is "visible" in "primary flood coverage" block
#    * I verify checkbox is "visible" for label "UW Manager Override" in "primary flood coverage" block - commented out since it depends on location eligibility
    * I verify input field "Dwelling & Other Structures (Up to $2M)" in "primary flood coverage" block is read only and empty
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
    * I take screenshot "Second location with basement question answered No - RNW"

    When I click "Yes" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify input field "Basement Improvements Sublimit ($30K - $250K)" in "primary flood coverage" block is read only and empty
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Second location with basement question answered Yes - RNW"

  @TC105294MA
  Scenario: US54262 - Field - Verify that when Manager Primary Flood Override is checked and question "Do you want to add PURE Flood Endorsement?" is answered YES additional 'Primary Flood Coverage Limits' section is displayed

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "9 Dwight St"
    * I set "City_Name_Txt" to "Pittsfield"
    * I set "Zip_Code" to "01201"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "Yes" for "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Primary Flood Coverage Limits" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "PURE Primary Flood Endorsement"

  @TC105287MA
  Scenario: US54360 - Verify that new questions are not mandatory to rate for the existing locations on Renewal after REN PD Filing date (NB/RNW) - 09/07/2024

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Dedham MA" page
    * I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click save changes button

    Then I navigate to "Elevation Certificate" page

    When I set "Building_Diagram_Number" to "1,2,3,4"
    * I set "Total_Square_Feet_For_The_Attached_Garage" to "10,000"
    * I set "Permanent_Flood_Openings" to "10,000"
    * I set "Total_Area_Of_All_Permanent_Openings" to "10,000"
    * I set "Top_Of_Bottom_Floor" to "10,000"
    * I set "Top_Of_Next_Floor" to "10,000"
    * I set "Bottom_Of_The_Attached_Garage" to "10,000"
    * I set "Lowest_Elevation_Machinery" to "10,000"

    Then I fill out HO quote elevation certificate details

    When I rate, bind and initiate new renewal
    * I navigate to "Dedham MA" page
    * I click order property details button
    * I navigate to "Flood Coverage" page
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions - RNW (first location)"
    * I scroll to the bottom of the page
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "not mandatory"
    * I take screenshot "Primary flood coverage not mandatory question - RNW (first location)"

    When I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I click "No" radio button for label "Flood Extension (DIC)"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Tenants       | 7500000 |           | 10,000 | Not Available | 1 |

    * I navigate to "Oxford MA" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "mandatory"
    * I take screenshot "Elevation mandatory questions - RNW (second location)"
    * I scroll to the bottom of the page
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I take screenshot "Primary flood coverage mandatory question - RNW (second location)"

    When I set "Building_Diagram_Number" to "1,2,3,4"
    * I set "Total_Square_Feet_For_The_Attached_Garage" to "10,000"
    * I set "Permanent_Flood_Openings" to "10,000"
    * I set "Total_Area_Of_All_Permanent_Openings" to "10,000"
    * I set "Top_Of_Bottom_Floor" to "10,000"
    * I set "Top_Of_Next_Floor" to "10,000"
    * I set "Bottom_Of_The_Attached_Garage" to "10,000"
    * I set "Lowest_Elevation_Machinery" to "10,000"
    * I set "Lowest_Adjacent_Finished_Grade" to "10,000"
    * I set "Highest_Adjacent_Finished_Grade" to "10,000"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "10,000"

    Then I fill out HO Flood Coverage page for additional location

    When I review changes
    * I review and accept referrals on renewal if any
    * I process a renewal

    Then I take screenshot "Renewal processed"

  @TC105919MA
  Scenario: US49618 - Verify that when location is eligible question  "Do you want to add the PURE Primary Flood Endorsement?" is mandatory and internal message is displayed “This home is eligible for admitted primary flood coverage.” (NB/END) - 09/07/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out all pages except Flood Coverage page
    * I navigate to "Flood Coverage" page

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I verify textbox "Eligibility Response" has value "This home is eligible for admitted primary flood coverage."
    * I verify label "Do you want to add the PURE Primary Flood Endorsement?" is bold
    * I verify label "Eligibility Response" is bold
    * I take screenshot "Endorsement question and eligibility response"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I take screenshot "UW and basement questions"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button
    * I scroll to the bottom of the page

    Then I verify input field "Dwelling & Other Structures (Up to $2M)" is "visible" in "primary flood coverage" block
    * I verify input field "Contents (Up to $1M)" is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 1 is "visible" in "primary flood coverage" block
    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "visible" in "primary flood coverage" block
    * I verify input field "Deductible" is "visible" in "primary flood coverage" block
    * I verify input field "Replacement Cost" is "visible" in "primary flood coverage" block
    * I verify input field "Contents" is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" is "visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" is "visible" in "primary flood coverage" block
    * I take screenshot "Limits visibility"

    When I click "Yes" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I click save changes button

    Then I verify "Basement Improvements Sublimit ($30K - $250K)" value "250,000" is displayed on page
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Basement limits - default values"

    When I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"
    * I click "No" radio button for label "Refer Rate:"

    Then I rate, bind and initiate new endorsement

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
    * I click order property details button
    * I navigate to "Oxford MA" page
    * I navigate to "Flood Coverage" page

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I take screenshot "Endorsement question - mandatory"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block

    When I click "Yes" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" is defaulted to "No"
    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "not visible" in "primary flood coverage" block
    * I verify input field "Contents (Up to $1M)" is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 1 is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "not visible" in "primary flood coverage" block
    * I verify input field "Deductible" is "not visible" in "primary flood coverage" block
    * I verify input field "Replacement Cost" is "not visible" in "primary flood coverage" block
    * I verify input field "Contents" is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "Other Structures" is "not visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" is "not visible" in "primary flood coverage" block
    * I verify textbox "Eligibility Response" has value "This home is ineligible for admitted primary flood coverage due to its loss history and/or residence elevation."
    * I take screenshot "Limits invisibility and ineligible response"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button

    Then I verify the "Do you want to add the PURE Primary Flood Endorsement?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I take screenshot "Endorsement question - enabled"

  @TC97704MA
  Scenario: US49692 - Verify Optional flood coverage block for multiple locations (NB/RNW) - 09/07/2024

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Tenants       | 7500000 |           | 10,000 | Not Available |
    * I navigate to "Oxford MA" page
    * I click order property details button
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - RNW"

    When I navigate to "Dedham MA" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - NB"

  @TC98874MA
  Scenario: US51212 - Verify Primary Flood Coverage block for multiple locations (NB/END) - 09/07/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "1000"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"
    * I set "Primary_Flood_Deductible" to ""
    * I set "Building_Diagram_Number" to "1,2,3,4 (w/ vented garage)"
    * I set "Top_Of_Bottom_Floor" to "20,000"
    * I set "Top_Of_Next_Floor" to "20,000"
    * I set "Bottom_Of_The_Attached_Garage" to "20,000"
    * I set "Lowest_Elevation_Machinery" to "20,000"
    * I set "Lowest_Adjacent_Finished_Grade" to "20,000"
    * I set "Highest_Adjacent_Finished_Grade" to "20,000"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "20,000"
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Dedham MA" page
    * I navigate to "Flood Coverage" page
#    * I set the page zoom to 75 percent
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    When I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    Then I verify block "primary flood coverage" is at position 5 on page
    * I verify block "excess flood" is at position 6 on page
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Do you want to add the PURE Primary Flood Endorsement?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify textarea "Eligibility Response" is "visible" in "primary flood coverage" block
#    * I verify checkbox is "visible" for label "UW Manager Override" in "primary flood coverage" block - commented out since it depends on location eligibility
    * I verify "Dwelling & Other Structures (Up to $2M)" value "250,000" is displayed on page
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

    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is read only with value "0"
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is read only with value "0"
    * I verify "Deductible" value "5,000" is displayed on page

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

    * I verify input field "Replacement Cost" is read only and has value
    * I verify input field "Contents" is read only and has value
    * I verify input field "Loss of Use" is read only and has value
    * I verify input field "Other Structures" is read only and has value
    * I verify input field "AOP Deductible" is read only and has value
    * I verify "Elevated Risk Credit" value "1" is displayed on page
    * I verify "High PML Load" value "1" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "First location with basement question answered No - NB"

    When I click "Yes" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    Then I verify "Basement Improvements Sublimit ($30K - $250K)" value "250,000" is displayed on page
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "First location with basement question answered Yes - NB"
    * I fill out HO Flood Coverage page

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Homeowner     | 7500000 |           | 10,000 | Not Available | 1 |
    * I click order property details button
    * I navigate to "Oxford MA" page

    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify block "primary flood coverage" is at position 5 on page
    * I verify block "excess flood" is at position 6 on page
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Do you want to add the PURE Primary Flood Endorsement?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify textarea "Eligibility Response" is "visible" in "primary flood coverage" block
#    * I verify checkbox is "visible" for label "UW Manager Override" in "primary flood coverage" block - commented out since it depends on location eligibility
    * I verify "Dwelling & Other Structures (Up to $2M)" value "250,000" is displayed on page
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

    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is read only with value "0"
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is read only with value "0"
    * I verify "Deductible" value "5,000" is displayed on page

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

    * I verify input field "Replacement Cost" is read only and has value
    * I verify input field "Contents" is read only and has value
    * I verify input field "Loss of Use" is read only and has value
    * I verify input field "Other Structures" is read only and has value
    * I verify input field "AOP Deductible" is read only and has value
    * I verify "Elevated Risk Credit" value "1" is displayed on page
    * I verify "High PML Load" value "1" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Second location with basement question answered No - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 66 Twin Lakes Dr | Halifax | MA    | 02338 | Homeowner     | 7500000 |           | 10,000 | 5%         |
    * I click order property details button
    * I navigate to "Dedham MA" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I take screenshot "First location - END"

    When I navigate to "Oxford MA" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I take screenshot "Second location - END"

    When I navigate to "Halifax MA" page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    Then I verify block "primary flood coverage" is at position 5 on page
    * I verify block "excess flood" is at position 6 on page
    * I verify the "Is the home in CBRA Zone?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Does this location have a PURE NFIP Flood policy with maximum limits?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Do you want to add the PURE Primary Flood Endorsement?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify textarea "Eligibility Response" is "visible" in "primary flood coverage" block
#    * I verify checkbox is "visible" for label "UW Manager Override" in "primary flood coverage" block - commented out since it depends on location eligibility
    * I verify "Dwelling & Other Structures (Up to $2M)" value "250,000" is displayed on page
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

    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is read only with value "0"
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is read only with value "0"
    * I verify "Deductible" value "5,000" is displayed on page

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

    * I verify input field "Replacement Cost" is read only and has value
    * I verify input field "Contents" is read only and has value
    * I verify input field "Loss of Use" is read only and has value
    * I verify input field "Other Structures" is read only and has value
    * I verify input field "AOP Deductible" is read only and has value
    * I verify "Elevated Risk Credit" value "1" is displayed on page
    * I verify "High PML Load" value "1" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Third location with basement question answered No - END"

    When I click "Yes" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    Then I verify "Basement Improvements Sublimit ($30K - $250K)" value "250,000" is displayed on page
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Third location with basement question answered Yes - END"

  @TC98995MA
  Scenario: US51300 - Verify fields visibility in flood information block for multiple locations (NB/END) - 09/07/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Dedham MA" page
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
    * I fill out HO Flood Coverage page

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Homeowner     | 7500000 |           | 10,000 | Not Available | 1 |
    * I click order property details button
    * I navigate to "Oxford MA" page
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
    * I fill out HO Flood Coverage page

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 66 Twin Lakes Dr | Halifax | MA    | 02338 | Homeowner     | 7500000 |           | 10,000 | 5%         |
    * I navigate to "Halifax MA" page
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

  @TC104603MA
  Scenario: US52399 - Verify that the Quoting Section is not displayed on the UI if Residence Type is "Tenants" - NB - 09/07/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"
    * I set "Residence_Type" to "Tenants"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Dedham MA" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify the "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?" distant label with "Yes" and "No" radio buttons is "not visible"
    * I verify input field "Dwelling" is "not visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 3 is "not visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "Deductible" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "TIV" is "not visible" in "primary flood coverage" block

    * I verify input field "Replacement Cost" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 3 is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 4 is "not visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 3 is "not visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" with index 2 is "not visible" in "primary flood coverage" block
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "not visible" in "primary flood coverage" block
    * I take screenshot "Quoting section limits (Tenants) - NB"

    When I rate a quote
    * I bind a quote

    Then I override subjectivities

  @TC100386MA
  Scenario: US51755 - Verify that "elevation certificate" block is added to the newly created Flood node below 'storm surge' block (NB/REN scenario)

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "First_Name" to "Automation"
    * I set "Last_Name" to "DontTouch"
    * I set "Effective_Date" to "09/07/2025"
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"
    * I set "Residence_Type" to "Tenants"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "elevation certificate - NB"

    Then I verify input field "RiskMeter Flood Zone" in "flood information" block is read only and has value
    * I verify input field "Panel Number" in "flood information" block is read only and has value
    * I verify input field "Panel Date" in "flood information" block is read only and has value

    * I set "Building_Diagram_Number" to "1,2,3,4"
    * I set "Top_Of_Bottom_Floor" to "1"
    * I set "Top_Of_Next_Floor" to "1"
    * I set "Bottom_Of_The_Attached_Garage" to "1"
    * I set "Total_Square_Feet_For_The_Attached_Garage" to "1"
    * I set "Permanent_Flood_Openings" to "1"
    * I set "Total_Area_Of_All_Permanent_Openings" to "1"
    * I set "Lowest_Elevation_Machinery" to "1"
    * I set "Lowest_Adjacent_Finished_Grade" to "1"
    * I set "Highest_Adjacent_Finished_Grade" to "1"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "1"

    * I fill out HO Flood Coverage page

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Homeowner     | 7500000 |           | 10,000 | Not Available | 1 |
    * I navigate to "Oxford MA" page
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "elevation certificate - NB"

    Then I verify input field "RiskMeter Flood Zone" in "flood information" block is read only and has value
    * I verify input field "Panel Number" in "flood information" block is read only and has value
    * I verify input field "Panel Date" in "flood information" block is read only and has value

  @TC101419MA
  Scenario: US51825 - Verify the questions for the "What is the Elevation of the" - "1,2,3,4 (w/vented garage)" for NB and "5" for RNW - 09/07/2025

    Given I use "MA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"

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
      | addressLine1 | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 7 Manor Ln   | Oxford | MA    | 01540 | Homeowner     | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "Oxford MA" page
    * I navigate to "Flood Coverage" page

    Then I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I take screenshot "Elevation block visibility - RNW"

    When I click "elevation certificate" block
    * I click "elevation certificate" block
    * I type "5" to "What is the building diagram number?" dropdown

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 5 - RNW"