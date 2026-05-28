@PrimaryFlood @Admitted @US54360
Feature: PF Admitted - New Flood Questions Function - IL & CO (Mandatory questions in elevation and primary flood coverage blocks)
  As a product manager, I want to ensure newly added questions to the Flood
  Node are working as expected for Endorsements and Renewal transactions

  @TC105284
  Scenario: US54360 - Verify that new questions are optional to rate and mandatory to bind for new business policies and mandatory to rate for newly added risk locations on the existing policies (NB/END) - IL - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
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
    * I type "10,000" to "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I type "10,000" to "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I type "10,000" to "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field

    When I rate, bind and initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 101 Main Street | West Chicago | IL    | 60185 | Condo/Co-op   | 7500000 |           | 10,000 |            |
    * I click order property details button

    When I navigate to "West Chicago IL" page
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

  @TC105285
  Scenario: US54360 - Verify that new questions are optional to rate and mandatory to bind only for new business policies and mandatory for newly added risk locations on the existing policies (NB/RNW) - IL - 09/07/2025

    Given I use "IL_003" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
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
    * I scroll "down" the page
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
      | addressLine1    | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 101 Main Street | West Chicago | IL    | 60185 | Homeowner     | 7500000 |           | 10,000 |            |
    * I click order property details button

    Then I navigate to "West Chicago IL" page
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

  @TC105286
  Scenario: US54360 - Verify that new questions are not mandatory to rate for the existing locations on Endorsement after NB PD Filing date (NB/END) - IL - 09/06/2025

    Given I use "IL_002" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
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

    When I rate, bind and initiate new endorsement
    * I navigate to "Gurnee IL" page
    * I click order property details button
    * I navigate to "Flood Coverage" page
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I scroll "down" the page
    * I take screenshot "Elevation not mandatory questions - END (first location)"
    * I scroll to the bottom of the page
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "not mandatory"
    * I take screenshot "Primary flood coverage not mandatory question - END (first location)"

    When I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 101 Main Street | West Chicago | IL    | 60185 | Homeowner     | 7500000 |           | 10,000 | 5%         | 1 |
    * I click order property details button
    * I navigate to "West Chicago IL" page
    * I navigate to "Flood Coverage" page

    When I click "Manager Flood Zone Override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "mandatory"
    * I scroll "down" the page
    * I take screenshot "Elevation mandatory questions - END (second location)"
    * I scroll to the bottom of the page
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I take screenshot "Primary flood coverage mandatory question - END (second location)"

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
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I take screenshot "Endorsement issued"

  @TC105287
  Scenario: US54360 - Verify that new questions are not mandatory to rate for the existing locations on Renewal after REN PD Filing date (NB/RNW) - IL - 09/07/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
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
    * I navigate to "Gurnee IL" page
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

    Then I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 101 Main Street | West Chicago | IL    | 60185 | Tenants       | 7500000 |           | 10,000 |            | 1 |
    * I click order property details button
    * I navigate to "West Chicago IL" page
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