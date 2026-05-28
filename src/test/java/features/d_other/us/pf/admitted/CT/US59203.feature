@PrimaryFlood @Admitted @US59203
Feature: PF Admitted - Turning on CT - QA Test Only

  @TC109547CT
  Scenario: US56460 - Verify flood history questions are optional when PURE Primary Flood Endorsement is "No" and become mandatory when "Yes" is selected (NB/RNW) - 09/07/2025

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""
    * I set "Has_Property_Been_Impacted_By_Flood_Event" to ""
    * I set "Has_Property_Experienced_Sump_Pump_Failure" to ""
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"
    * I set "Residence_Type" to "Tenants"
    * I set "Hurr_Ded" to "Not Available"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory"

    When I fill out HO Flood Coverage page

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Homeowner     | 7500000 |           | 10,000 | 2%         | 1 |

    Then I navigate to "Norwich CT" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory"

    When I review changes
    * I review and accept referrals on renewal if any

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "Validation message"

    When I set "Has_Property_Been_Impacted_By_Flood_Event" to "No"
    * I set "Has_Property_Experienced_Sump_Pump_Failure" to "No"

    Then I fill out HO Flood Coverage page for additional location

    When I review changes
    * I review and accept referrals on renewal if any
    * I process a renewal

    Then I take screenshot "Renewal processed"

  @TC110130CT
  Scenario: US57017 - Verify that after post-PD RNW, the new questions are displayed and mandatory when 'Yes' is selected, and are not displayed when 'No' is selected - 09/07/2024

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to ""
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to ""
    * I set "Floors_Above_Grade" to ""
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Hurr_Ded" to "Not Available"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new renewal
    * I navigate to "Madison CT" page
    * I click order property details button

    When I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify that "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "visible" on page
    * I take screenshot "Basement question - visible"

    When I review changes
    * I review and accept referrals on renewal if any

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "Validation message"
    * I choose "Yes" for "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Homeowner     | 7500000 |           | 10,000 | 2%         |

    Then I navigate to "Norwich CT" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify input field "How many floors does the location have above grade?" is "not visible" in "primary flood coverage" block
    * I take screenshot "Floors above grade question - not visible"

  @TC105297CT
  Scenario: US54262 - Field - Verify that validation message appears when Elevated Risk Credit is below limit

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "3 Chase Hill Rd"
    * I set "City_Name_Txt" to "Kent"
    * I set "Zip_Code" to "06757"
    * I set "Hurr_Ded" to "Not Available"
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
    * I type "0.74" to "Elevated Risk Credit" input field

    Then I verify validation message "Elevated Risk Credit Factor Range for this field should be between 1.00 - 0.75" is displayed
    * I take screenshot "Validation message - Elevated risk credit below limit"

  @TC105298CT
  Scenario: US54262 - Field - Verify that validation message appears when Elevated Risk Credit is above limit

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "3 Chase Hill Rd"
    * I set "City_Name_Txt" to "Kent"
    * I set "Zip_Code" to "06757"
    * I set "Hurr_Ded" to "Not Available"
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
    * I type "1.01" to "Elevated Risk Credit" input field

    Then I verify validation message "Elevated Risk Credit Factor Range for this field should be between 1.00 - 0.75" is displayed
    * I take screenshot "Validation message - Elevated risk credit above limit"

  @TC105284CT
  Scenario: US54360 - Verify that new questions are optional to rate and mandatory to bind for new business policies and mandatory to rate for newly added risk locations on the existing policies (NB/END) - 09/07/2025

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"

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
    * I type "10,000" to "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I type "10,000" to "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I type "10,000" to "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field

    When I rate, bind and initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I click order property details button

    When I navigate to "Norwich CT" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "mandatory"
    * I take screenshot "Elevation mandatory questions - END (second location)"
    * I scroll to the bottom of the page
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I take screenshot "Primary flood coverage mandatory question - END (second location)"

  @TC105971CT
  Scenario: US49618 - Verify that when location is eligible question  "Do you want to add the PURE Primary Flood Endorsement?" is mandatory and internal message is displayed “This home is eligible for admitted primary flood coverage,” and sunken question is No (NB/RNW) - 09/07/2025
    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer

    Then I fill out all pages except Flood Coverage page
    * I navigate to "Flood Coverage" page

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I click save changes button

    Then I verify input field "Basement Improvements Sublimit ($30K - $250K)" is read only with value "0"
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is read only with value "0"
    * I scroll to the bottom of the page
    * I take screenshot "Basement limits - default values"

    When I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button
    * I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"
    * I click "No" radio button for label "Refer Rate:"

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Homeowner     | 7500000 |           | 10,000 | 2%         | 1 |
    * I click order property details button
    * I navigate to "Norwich CT" page

    Then I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" label with "Yes" and "No" radio buttons is "not visible" in "primary flood coverage" block
    * I take screenshot "Basement question - not visible"

  @TC98896CT
  Scenario: US51212 - Verify Primary Flood Coverage block for multiple locations NB and RNW - 09/07/2025

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "1000"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"
    * I set "Building_Diagram_Number" to "1,2,3,4 (w/ vented garage)"
    * I set "Top_Of_Bottom_Floor" to "20,000"
    * I set "Top_Of_Next_Floor" to "20,000"
    * I set "Bottom_Of_The_Attached_Garage" to "20,000"
    * I set "Lowest_Elevation_Machinery" to "20,000"
    * I set "Lowest_Adjacent_Finished_Grade" to "20,000"
    * I set "Highest_Adjacent_Finished_Grade" to "20,000"
    * I set "Lowest_Adjacent_Lowest_Elevation" to "20,000"
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Madison CT" page
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
#    * I set the page zoom to 75 percent
    * I navigate to "Madison CT" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I take screenshot "First location - RNW"

    When I navigate to "Norwich CT" page
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
    * I take screenshot "Second location with basement question answered No - RNW"

    When I click "Yes" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    Then I verify "Basement Improvements Sublimit ($30K - $250K)" value "250,000" is displayed on page
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Second location with basement question answered Yes - RNW"

  @TC104602CT
  Scenario: US52399 - Verify limits in the new Quoting Section NB Homeowners, RNW Condo (NB/RNW) - 09/07/2025

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Madison CT" page
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
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I click order property details button

    When I navigate to "Norwich CT" page
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

  @TC101418CT
  Scenario: US51825 - Verify the questions for the "1,2,3,4" diagram number and "1" for "d) Bottom of the attached garage (top of slab)?" (NB/RNW) - 09/07/2025

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "Elevation block visibility - NB"

    When I type "1,2,3,4" to "What is the building diagram number?" dropdown
    * I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I verify input field "What is the total square feet for the attached garage?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "visible" in "elevation certificate" block
    * I scroll "down" the page
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

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Tenants       | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "Norwich CT" page
    * I navigate to "Flood Coverage" page

    Then I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I take screenshot "Elevation block visibility - RNW"

    When I type "1,2,3,4" to "What is the building diagram number?" dropdown
    * I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input field "f) Lowest adjacent (finished) grade next to building (LAG)?" is "visible" in "elevation certificate" block
    * I verify input field "g) Highest adjacent (finished) grade next to building (HAG)?" is "visible" in "elevation certificate" block
    * I verify input field "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is "visible" in "elevation certificate" block
    * I verify input field "What is the total square feet for the attached garage?" is "visible" in "elevation certificate" block
    * I verify input field "No. of permanent flood openings in the attached garage or enclosure(s)" is "visible" in "elevation certificate" block
    * I verify input field "Total area of all permanent openings (flood vents) in square inches?" is "visible" in "elevation certificate" block
    * I take screenshot "New elevation questions for diagram number 1,2,3,4 - RNW"

  @TC107095CT
  Scenario: US55008 - Verify that Excess Flood Block is updated (Homeowners, NB/RNW) - 09/07/2024

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Madison CT" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Location page - NB"

    When I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Optional coverages page - NB"

    When I rate, bind and initiate new renewal
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
    * I take screenshot "Excess flood block - RNW"

  @TC101295CT
  Scenario: US52954 - Verify Primary Flood Coverage block for multiple locations (NB/RNW) - 09/07/2025

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Type" to "Tenants"
    * I set "Hurr_Ded" to "Not Available"
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"
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
    * I navigate to "Madison CT" page
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
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "Madison CT" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I take screenshot "First location - RNW"

    When I navigate to "Norwich CT" page
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

  @TC107094CT
  Scenario: US55008 - Verify that Excess Flood Block is updated (Homeowners/Tenants, NB/RNW) - 09/07/2025

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"

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
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Tenants       | 7500000 |           | 10,000 | Not Available |
    * I click order property details button
    * I navigate to "Norwich CT" page
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

  @TC97815CT
  Scenario: US49684 - Verify Flood information block for multiple locations NB and END - 09/06/2025

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Madison CT" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 45 McKinley Avenue | Norwich | CT    | 06360 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available |
    * I navigate to "Norwich CT" page

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - END"

  @TC105296CT
  Scenario Outline: US54262 - "<user>" - Verify that when Manager Primary Flood Override is checked and question "Do you want to add PURE Flood Endorsement?" is answered YES Elevated Risk Credit and High PML Load fields are visible for all internal roles

    Given I use "CT_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "3 Chase Hill Rd"
    * I set "City_Name_Txt" to "Kent"
    * I set "Zip_Code" to "06757"
    * I set "Hurr_Ded" to "Not Available"
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
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "<user>"
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify "Elevated Risk Credit" is "visible" on page
    * I verify "High PML Load" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "PURE Primary Flood Endorsement"

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