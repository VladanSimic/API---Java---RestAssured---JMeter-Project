@PrimaryFlood @Admitted @US60796
Feature: PF Admitted - Turning on PA - QA Test Only 10/19/2025

  #Tests copied from NJ

  @TC117456 @HO
  Scenario: TC117456 - Verify flood history questions are mandatory when PURE Primary Flood Endorsement is Yes and optional when No (NB / END) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""
    * I set "Has_Property_Been_Impacted_By_Flood_Event" to ""
    * I set "Has_Property_Experienced_Sump_Pump_Failure" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory"

    When I fill out HO Flood Coverage page

    Then I rate a quote
    * I verify validation message "Yellow fields are mandatory" is displayed

    * I take screenshot "UW questions and validation message"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click save changes button
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button

    Then I rate, bind and initiate new endorsement

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |

    Then I navigate to "Philadelphia PA" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory"

    When I fill out HO Flood Coverage page for additional location
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I take screenshot "Endorsement issued"

  @TC117457 @HO
  Scenario: TC117457 - Verify additional questions become mandatory when 'Quote a Non-Admitted Flood Primary' is 'Yes', and the floor count field accepts only values within the valid range (NB/END) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to ""
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to ""
    * I set "Floors_Above_Grade" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify that "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "visible" on page

    When I click "rate" button

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "Basement question - visible and mandatory"

    When I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "No"
    * I fill out HO Flood Coverage page

    Then I rate, bind and initiate new endorsement

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Homeowner     | 7500000 |           | 10,000 | Not Available |

    Then I navigate to "Philadelphia PA" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify input field "How many floors does the location have above grade?" is "visible" in "primary flood coverage" block

    When I review changes
    * I review and accept referrals on endorsement if any

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "Floors above grade question - visible and mandatory"

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

  @TC117455 @HO
  Scenario: TC117455 - Verify that Excess Flood Block is updated (Homeowners/Condo, NB/END) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

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

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I click order property details button

    * I navigate to "Philadelphia PA" page
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
    * I take screenshot "Excess flood block - END"

  @TC117444 @HO
  Scenario: TC117444 - Verify Flood information block for multiple locations (NB/RNW) - 12/27/2024

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "12/27/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to location page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Tenants       | 7500000 |           | 10,000 | Not Available |
    * I navigate to "Philadelphia PA" page
    * I click order property details button

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - RNW"

    When I navigate to "State College PA" page

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

  @TC117449 @HO
  Scenario: TC117449 - Verify Primary Flood Coverage block for multiple locations (NB/END) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
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
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "State College PA" page
#    * I set the page zoom to 75 percent
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    Then I verify block "primary flood coverage" is at position 4 on page
    * I verify block "excess flood" is at position 5 on page
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

    Then I verify input field "Basement Improvements Sublimit ($30K - $250K)" is read only with value "0"
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
    * I verify "Elevated Risk Credit" value "1" is not displayed on page
    * I verify "High PML Load" value "1" is not displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "First location with basement question answered No - NB"

    When I click "Yes" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I scroll to the bottom of the page

    Then I verify "Basement Improvements Sublimit ($30K - $250K)" value "250,000" is displayed on page
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I take screenshot "First location with basement question answered Yes - NB"
    * I fill out HO Flood Coverage page

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
    * I click order property details button
    * I navigate to "Philadelphia PA" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button
    * I scroll to the bottom of the page

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
    * I verify "Elevated Risk Credit" value "1" is not displayed on page
    * I verify "High PML Load" value "1" is not displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Second location with basement question answered No - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1  | city       | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 523 Berlin Rd | New Oxford | PA    | 17350 | Tenants       | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "State College PA" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I take screenshot "First location - END"

    When I navigate to "Philadelphia PA" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I take screenshot "Second location - END"

    When I navigate to "New Oxford PA" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"
    * I scroll to the bottom of the page

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
    * I verify "Elevated Risk Credit" value "1" is not displayed on page
    * I verify "High PML Load" value "1" is not displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Third location with basement question answered No - END"

    When I click "Yes" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify input field "Basement Improvements Sublimit ($30K - $250K)" in "primary flood coverage" block is read only and empty
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Third location with basement question answered Yes - END"

  @TC117454 @HO
  Scenario Outline: TC117454 - "<user>" - Verify that Manager Primary Flood Override is displayed on the UI when PURE Flood endorsement is ineligible for all internal users

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "10/20/2025"
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"
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
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "<user>"

    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify checkbox "Manager Primary Flood Override" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Manager Override"

    Examples:
      | user                       |
      | Field                      |
      | Zonal                      |
      | RUM                        |
      | Specialist1                |
      | Specialist2                |
      | SeniorUnderwriter          |
      | Underwriter1               |
      | Underwriter2               |
      | Analyst                    |
      | UWSA1                      |
      | UWSA2                      |
      | UWSSA                      |
      | UWSRM                      |
      | SeniorUWManagementRole     |
      | UWManagerRole              |
      | UnderwriterRole            |
      | UnderwritingTechnicianRole |
      | SeniorUWTechnicianRole     |

  @TC117453 @HO
  Scenario: TC117453 - Verify that new questions are not mandatory to rate for the existing locations on Renewal after REN PD Filing date (NB/RNW) - 12/27/2024

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "12/27/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to location page
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
    * I navigate to "State College PA" page
    * I click order property details button
    * I navigate to "Flood Coverage" page
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I scroll "down" the page
    * I take screenshot "Elevation not mandatory questions - RNW (first location)"
    * I scroll to the bottom of the page
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "not mandatory"
    * I take screenshot "Primary flood coverage not mandatory question - RNW (first location)"

    When I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I click "No" radio button for label "Flood Extension (DIC)"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Tenants       | 7500000 |           | 10,000 | Not Available | 1 |

    * I navigate to "Philadelphia PA" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "mandatory"
    * I scroll "down" the page
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

  @TC117450 @HO
  Scenario: TC117450 - Verify Primary Flood Coverage block for multiple locations (NB/RNW) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Type" to "Tenants"
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"
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
    * I navigate to location page
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
    * I verify "Elevated Risk Credit" value "1" is not displayed on page
    * I verify "High PML Load" value "1" is not displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "First location with basement question answered No - NB"

    When I click "Yes" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify input field "Basement Improvements Sublimit ($30K - $250K)" in "primary flood coverage" block is read only and empty
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "First location with basement question answered Yes - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "State College PA" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I take screenshot "First location - RNW"

    When I navigate to "Philadelphia PA" page
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
    * I verify "Elevated Risk Credit" value "1" is not displayed on page
    * I verify "High PML Load" value "1" is not displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Second location with basement question answered No - RNW"

    When I click "Yes" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify input field "Basement Improvements Sublimit ($30K - $250K)" in "primary flood coverage" block is read only and empty
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Second location with basement question answered Yes - RNW"

  @TC117443 @HO
  Scenario: TC117443 - Verify new blocks are available for different transactions and additional locations (NB/END) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I scroll "up" the page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "flood information" is "visible" on page
    * I take screenshot "Optional flood coverage and flood information - NB"

    When I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Homeowner     | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "Philadelphia PA" page

    Then I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    When I fill out HO Flood Coverage page
    * I scroll "up" the page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "flood information" is "visible" on page
    * I take screenshot "Optional flood coverage and flood information - END"

    When I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood block - END"

  @TC117443 @HO
  Scenario: TC117443 - Verify new blocks are available for different transactions and additional locations (NB/RNW) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I scroll "up" the page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "flood information" is "visible" on page
    * I take screenshot "Optional flood coverage and flood information - NB"

    When I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Homeowner     | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "Philadelphia PA" page

    Then I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    When I fill out HO Flood Coverage page
    * I scroll "up" the page

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "flood information" is "visible" on page
    * I take screenshot "Optional flood coverage and flood information - RNW"

    When I scroll to the bottom of the page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood block - RNW"

  @TC117445 @HO
  Scenario: TC117445 - Verify fields visibility in flood information block for multiple locations NB and RNW - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to "State College PA" page
    * I navigate to "Flood Coverage" page

    Then I take screenshot "First location - RNW"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Homeowner     | 7500000 |           | 10,000 | Not Available |
    * I navigate to "Philadelphia PA" page
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

  @TC117452 @HO
  Scenario: TC117452 - Verify that the new Quoting Section is placed just below "Elevated Risk Credit (internal only" and "High PML Load (internal only)" fields of the "primary flood coverage" block (NB/END) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "State College PA" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify Selection information text is displayed
    * I verify input field "Dwelling" is "visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Deductible" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "TIV" is "visible" in "primary flood coverage" block

    * I verify input field "Replacement Cost" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 4 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" with index 2 is "visible" in "primary flood coverage" block
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "primary flood coverage" block
    * I take screenshot "Quoting section fields (Homeowners) - NB"
    * I type "1" to "How many floors does the location have above grade?" input field
    * I choose "No" for "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    When I rate, bind and initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I click order property details button

    When I navigate to "Philadelphia PA" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify Selection information text is displayed
    * I verify input field "Dwelling" is "visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Deductible" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "TIV" is "visible" in "primary flood coverage" block

    * I verify input field "Replacement Cost" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 4 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" with index 2 is "visible" in "primary flood coverage" block
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "primary flood coverage" block
    * I take screenshot "Quoting section fields (Condo) - END"

  @TC117447 @HO
  Scenario: TC117447 - Verify that "elevation certificate" block is added to the newly created Flood node below 'storm surge' block for HO IL state (NB/END scenario)
    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "First_Name" to "Automation"
    * I set "Last_Name" to "DontTouch"
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

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
    * I set "Lowest_Adjacent_Finished_Grade" to "10,000"
    * I set "Highest_Adjacent_Finished_Grade" to "10,000"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "10,000"

    * I fill out HO Flood Coverage page

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
    * I navigate to "Philadelphia PA" page
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "elevation certificate - NB 2"

    Then I verify input field "RiskMeter Flood Zone" in "flood information" block is read only and has value
    * I verify input field "Panel Number" in "flood information" block is read only and has value
    * I verify input field "Panel Date" in "flood information" block is read only and has value

    * I fill out HO Flood Coverage page

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city       | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 523 Berlin Rd | New Oxford | PA    | 17350 | Tenants       | 7500000 |           | 10,000 | Not Available | 1 |
    * I navigate to "New Oxford PA" page
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "elevation certificate - END"

    Then I verify input field "RiskMeter Flood Zone" in "flood information" block is read only and has value
    * I verify input field "Panel Number" in "flood information" block is read only and has value
    * I verify input field "Panel Date" in "flood information" block is read only and has value

  @TC117446 @HO
  Scenario: TC117446 - Verify that Elevation Certificate node is removed from the UI - multiple locations (NB/END) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "State College PA" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
    * I click order property details button
    * I navigate to "Philadelphia PA" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1  | city       | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 523 Berlin Rd | New Oxford | PA    | 17350 | Tenants       | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "New Oxford PA" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Third location Elevation Certificate visibility - END"

  @TC117451 @HO
  Scenario: TC117451 - Verify the questions for the "1,2,3,4" diagram number and empty "d) Bottom of the attached garage (top of slab)?" (NB/END) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

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
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "Philadelphia PA" page
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

  #Tests added 09/29 by Milan and Diana

  @TC118295 @HO #TC99545
  Scenario: TC118295 - Verify Flood information and Excess blocks for multiple locations NB and END - PA_001  - 10/18/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "10/18/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to location page

    Then I verify block "flood information" is "visible" on page
#    * I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Philadelphia PA" page

    Then I verify block "flood information" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks removal - END"

    When I navigate to "Flood Coverage" page

    Then I verify block "flood information" is at position 1 on page
#    * I verify block "excess flood" is at position 3 on page
    * I take screenshot "Flood information and excess flood blocks visibility - END"

  @TC118303 @HO #TC101890
  Scenario: TC118303 - Verify that new questions are added to the section "What is the Elevation of the" for Building Diagram - 1,2,3,4 (NB/END) - PA_001 - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
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
      | addressLine1          | city          | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 117 South Butz Street | State College | PA    | 16801 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "State College PA" page
    * I navigate to "Flood Coverage" page

    Then I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I take screenshot "Elevation block visibility - END"

    When I click "elevation certificate" block
    * I type "650" to "Base Flood Elevation" input field
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

  @TC118311 @HO #TC104388
  Scenario: TC118311 - Verify that new questions are optional to rate and mandatory to bind only for new business policies and mandatory for newly added risk locations on the existing policies (NB/RNW) - PA - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions (rate) - NB"
    * I scroll to the bottom of the page
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I take screenshot "Primary flood coverage mandatory question (rate) - NB"

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

    Then I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "No"
    * I fill out HO Flood Coverage page

    When I delete value from "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I delete value from "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I delete value from "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field
    * I click save changes button

    Then I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I click request bind
    * I think for 20 to 22 seconds
    * I take screenshot "Elevation questions"

    When I type "10,000" to "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I type "10,000" to "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I type "10,000" to "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1          | city          | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 117 South Butz Street | State College | PA    | 16801 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button

    Then I navigate to "State College PA" page
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

  @TC118385 @HO #TC104564
  Scenario: TC118385 - Verify limits in the new Quoting Section PA NB Homeowners, RNW Condo - PA (NB/RNW) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to location page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

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
    * I type "1" to "How many floors does the location have above grade?" input field
    * I choose "No" for "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    When I rate, bind and initiate new renewal

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1          | city          | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 117 South Butz Street | State College | PA    | 16801 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button

    When I navigate to "State College PA" page
    * I navigate to "Flood Coverage" page
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
    * I take screenshot "Quoting section limits (Condo) - RNW"

  @TC118389 @HO #TC105992
  Scenario: TC118389 - Verify that when location is eligible question  "Do you want to add the PURE Primary Flood Endorsement?" is mandatory and internal message is displayed “This home is eligible for admitted primary flood coverage.” Tenants (NB/RNW) - PA_001 - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "117 South Butz Street"
    * I set "City_Name_Txt" to "State College"
    * I set "Zip_Code" to "16801"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out all pages except Flood Coverage page
    * I navigate to "Flood Coverage" page

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I verify textbox "Eligibility Response" has value "This home is eligible for admitted primary flood coverage."
    * I take screenshot "Eligibility response"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I take screenshot "UW questions visibility"

    When I click "Yes" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" is defaulted to "No"
    * I verify the "Do you want to add the PURE Primary Flood Endorsement?" question with yes and no radio buttons is "disabled" in "primary flood coverage" block
    * I verify textbox "Eligibility Response" has value "This home is ineligible for admitted primary flood coverage due to its loss history and/or residence elevation."
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
    * I take screenshot "Endorsement question, eligibility response and limits"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I pause for "10" seconds
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button

    Then I verify the "Do you want to add the PURE Primary Flood Endorsement?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I take screenshot "Endorsement question enabled"

    When I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"
    * I click "No" radio button for label "Refer Rate:"
    * I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I click save changes button

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Tenants       | 7500000 |           | 10,000 | 2%         | 1 |
    * I click order property details button
    * I navigate to "Philadelphia PA" page
    * I navigate to "Flood Coverage" page

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I verify textbox "Eligibility Response" has value "This home is eligible for admitted primary flood coverage."
    * I take screenshot "Endorsement question and eligibility response"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I take screenshot "UW questions - visibility"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button

    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "visible" in "primary flood coverage" block
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
    * I scroll to the bottom of the page
    * I take screenshot "Limits visibility"

  @TC118391 @HO #TC110134
  Scenario: TC118391 - 6. Verify HO PA additional questions are not displayed when 'Quote a Non-Admitted Flood Primary' is 'No' (NB/RNW) - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
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
      | addressLine1          | city          | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 117 South Butz Street | State College | PA    | 16801 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |

    Then I navigate to "State College PA" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify that "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "not visible" on page
    * I take screenshot "Basement question - not visible"

  @TC118397 @HO #TC97704
  Scenario: TC118397 - Verify Optional flood coverage block for multiple locations NB and RNW - PA_001 - 10/18/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/18/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1          | city          | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 117 South Butz Street | State College | PA    | 16801 | Tenants       | 7500000 |           | 10,000 |            |
    * I navigate to "State College PA" page
    * I click order property details button
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - RNW"

    When I navigate to "Scranton PA" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - NB"

  @TC118432 @HO #TC109548
  Scenario: TC118432 - 3. Verify that after HO PA post-PD END, UW questions are optional if blank or "No" for existing locations, but mandatory if "Yes" for both existing and new locations - PA - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new endorsement
    * I navigate to location page
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
      | addressLine1          | city          | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 117 South Butz Street | State College | PA    | 16801 | Homeowner     | 7500000 |           | 10,000 | 5%         |

    Then I navigate to "State College PA" page
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

  @TC117459 #@TC99939
  Scenario: TC117459 - Verify that the Storm Surge block is not present on the Location coverage page NB and END - PA_001 - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to location page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "First location - visibility of storm surge block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Condo/Co-op   | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Philadelphia PA" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "Second location - visibility of storm surge block - END"

  @TC117458 #@TC99925
  Scenario: TC117458 - Verify that Elevation Certificate node is removed from the UI - multiple locations NB and END - PA_001 - 10/19/2025

    Given I use "PA_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to location page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "First location Elevation Certificate visibility - NB"

    When I navigate to location page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Second location Elevation Certificate visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 8714 Verree Rd | Philadelphia | PA    | 19115 | Tenants       | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Philadelphia PA" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify page "Elevation Certificate" is "not visible" in tree
    * I take screenshot "Third location Elevation Certificate visibility - END"