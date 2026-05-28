@PrimaryFlood @Admitted @US51756
Feature: PF Admitted - Add Elevation Certificate Details to Flood Node - UI & Function - CO

  @TC100175
  Scenario: US51756 - Verify that "elevation certificate" block is added to the newly created Flood node below 'storm surge' block for HO CO state (NB/END scenario)
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "First_Name" to "Automation"
    * I set "Last_Name" to "DontTouch"
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"

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

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 5646 Jellison Street | Arvada | CO    | 80002 | Condo/Co-op   | 7500000 |           | 10,000 | 5%         | 2 |
    * I navigate to "Arvada CO" 2 page
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"

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
      | addressLine1          | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 9350 Grandview Avenue | Arvada | CO    | 80002 | Tenants       | 7500000 |           | 10,000 | 5%         | 3 |
    * I navigate to "Arvada CO" 3 page
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "elevation certificate - END"

    Then I verify input field "RiskMeter Flood Zone" in "flood information" block is read only and has value
    * I verify input field "Panel Number" in "flood information" block is read only and has value
    * I verify input field "Panel Date" in "flood information" block is read only and has value

  @TC100176
  Scenario: US51756 - Verify that "elevation certificate" block is added to the newly created Flood node below 'storm surge' block for HO CO state (NB/REN scenario)
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "First_Name" to "Automation"
    * I set "Last_Name" to "DontTouch"
    * I set "Effective_Date" to "09/07/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"
    * I set "Residence_Type" to "Tenants"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"

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
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 5646 Jellison Street | Arvada | CO    | 80002 | Condo/Co-op   | 7500000 |           | 10,000 | 5%         | 2 |
    * I navigate to "Arvada CO" 2 page
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "elevation certificate - NB"

    Then I verify input field "RiskMeter Flood Zone" in "flood information" block is read only and has value
    * I verify input field "Panel Number" in "flood information" block is read only and has value
    * I verify input field "Panel Date" in "flood information" block is read only and has value

  @TC100177
  Scenario: US51756 - Verify that "elevation certificate" block is added to the newly created Flood node below 'storm surge' block for HO CO state on Renewal transaction
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "First_Name" to "Automation"
    * I set "Last_Name" to "DontTouch"
    * I set "Effective_Date" to "09/07/2024"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Arvada CO" 1 page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"
    * I fill out HO quote elevation certificate details page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    Then I verify "Elevation Certificate" page is not visible

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 5646 Jellison Street | Arvada | CO    | 80002 | Condo/Co-op   | 7500000 |           | 10,000 | 5%         | 2 |
    * I navigate to "Arvada CO" 2 page
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "elevation certificate - RNW"

    When I navigate to "Arvada CO" 1 page
    * I navigate to "Flood Coverage" page

    Then I verify block "elevation certificate" is "visible" on page
    * I take screenshot "elevation certificate - RNW"

#  @TC100178
#  Scenario: Verify that "elevation certificate" block is added to the newly created Flood node below 'storm surge' block for HO CO state on Midterm Endorsement for newly added locations
#    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
#    * I turn off optional data
#    * I set "First_Name" to "Automation"
#    * I set "Last_Name" to "DontTouch"
#    * I set "Effective_Date" to "09/06/2025"
#    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
#    * I set "Address_Line_1_Txt" to "5235 Dover Street"
#    * I set "City_Name_Txt" to "Arvada"
#    * I set "Zip_Code" to "80002"
#    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"
#
#    When I am logged in to Pure as "Field"
#    * I create a new "HO" quote for a new customer
#    * I rate a quote
#    * I navigate to underwriting referrals page
#    * I accept underwriting referrals
#    * I bind a quote
#    * I override subjectivities
#    * I navigate to transactions or endorsements
#    * I initiate new endorsement
#    * I navigate to Homeowner Policy Page and add new risk location with basic details
#      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
#      | 5646 Jellison Street | Arvada | CO    | 80002 | Condo/Co-op   | 7500000 |           | 10,000 | 5%         | 2 |
#    * I navigate to "Arvada CO" 2 page
#    * I navigate to "Flood Coverage" page
#    * I set the check manager flood zone override to "Yes"
#    * I set the flood zone to "AE/A1-A30/A Unnumbered"
#    * I set do you purchase NFIP policy to "No"
#
#    Then I verify block "elevation certificate" is "visible" on page
#    * I take screenshot "elevation certificate - NB"
#
#    Then I verify input field "RiskMeter Flood Zone" in "flood information" block is read only and has value
#    * I verify input field "Panel Number" in "flood information" block is read only and has value
#    * I verify input field "Panel Date" in "flood information" block is read only and has value
#
#    * I set "Building_Diagram_Number" to "1,2,3,4"
#    * I set "Top_Of_Bottom_Floor" to "1"
#    * I set "Top_Of_Next_Floor" to "1"
#    * I set "Bottom_Of_The_Attached_Garage" to "1"
#    * I set "Total_Square_Feet_For_The_Attached_Garage" to "1"
#    * I set "Permanent_Flood_Openings" to "1"
#    * I set "Total_Area_Of_All_Permanent_Openings" to "1"
#    * I set "Lowest_Elevation_Machinery" to "1"
#
#    * I fill out HO Primary Flood Coverage block
#    * I fill out HO quote elevation certificate details block
#
#    When I review changes
#    * I rate a quote
#    * I navigate to underwriting alerts tab
#    * I accept underwriting referrals
#    * I issue an endorsement
#    * I create a renewal
#    * I navigate to policy image page
#    * I navigate to "Arvada CO" 1 page
#    * I navigate to "Flood Coverage" page
#    * I set the check manager flood zone override to "Yes"
#    * I set the flood zone to "AE/A1-A30/A Unnumbered"
#    * I set do you purchase NFIP policy to "No"
#
#    Then I verify block "elevation certificate" is "visible" on page
#    * I take screenshot "elevation certificate - RNW"
#
#    Then I verify input field "RiskMeter Flood Zone" in "flood information" block is read only and has value
#    * I verify input field "Panel Number" in "flood information" block is read only and has value
#    * I verify input field "Panel Date" in "flood information" block is read only and has value

  @TC100180
  Scenario: US51756 - Verify that "elevation certificate" block is not added to the newly created Flood node below 'storm surge' block for HO CO state before NB PD Filing date
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "First_Name" to "Automation"
    * I set "Last_Name" to "DontTouch"
    * I set "Effective_Date" to "09/06/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Arvada CO" 1 page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"
    * I fill out HO quote elevation certificate details page

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "elevation certificate - NB"

  @TC100181
  Scenario: US51756 - Verify that "elevation certificate" block is not added to the newly created Flood node below 'storm surge' block for HO CO state before REN PD Filing date
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "First_Name" to "Automation"
    * I set "Last_Name" to "DontTouch"
    * I set "Effective_Date" to "02/09/2024"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Arvada CO" 1 page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"
    * I fill out HO quote elevation certificate details page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Arvada CO" 1 page

    Then I verify page "Elevation Certificate" is "visible" in tree

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 5646 Jellison Street | Arvada | CO    | 80002 | Condo/Co-op   | 7500000 |           | 10,000 | 5%         | 2 |

    When I navigate to "Arvada CO" 2 page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set do you purchase NFIP policy to "No"

    Then I verify page "Elevation Certificate" is "visible" in tree
    * I take screenshot "elevation certificate - RNW"

#  @TC100182 N/A – 3 new questions were added to the UI later
#  Scenario: Verify that the functionality of the "elevation certificate" block is the same after NB PD Filing date for HO CO state.
#    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
#    * I turn off optional data
#    * I set "First_Name" to "Automation"
#    * I set "Last_Name" to "DontTouch"
#    * I set "Effective_Date" to "09/07/2025"
#    * I set "Address_Line_1_Txt" to "5235 Dover Street"
#    * I set "City_Name_Txt" to "Arvada"
#    * I set "Zip_Code" to "80002"
#
#    When I am logged in to Pure as "Field"
#    * I create a new "HO" quote for a new customer
#    * I navigate to "Flood Coverage" page
#    * I fill out HO Primary Flood Coverage block
#    * I set the check manager flood zone override to "Yes"
#    * I set the flood zone to "AE/A1-A30/A Unnumbered"
#    * I set do you purchase NFIP policy to "No"
#    * I click save changes button
#    * I rate a quote
#    * I navigate to underwriting referrals page
#    * I accept underwriting referrals
#    * I navigate to "Flood Coverage" page
#    * I click "elevation certificate" block
#    * I click "elevation certificate" block
#
#    Then I verify "What is the building diagram number?" field is "mandatory"
#    * I verify "a) Top of bottom floor (including basement, crawl space, or enclosure floor)?" field is "mandatory"
#    * I verify "b) Top of the next floor?" field is "mandatory"
#    * I verify "d) Bottom of the attached garage (top of slab)?" field is "mandatory"
#    * I verify "e) Lowest elevation of machinery or equipment servicing the building?" field is "mandatory"
#
#    When I set what is the building diagram number to "1,2,3,4"
#
#    Then I verify "a) Top of bottom floor (including basement, crawl space, or enclosure floor)?" field is "mandatory"
#    * I verify "b) Top of the next floor?" field is "mandatory"
#    * I verify "d) Bottom of the attached garage (top of slab)?" field is "mandatory"
#    * I verify "e) Lowest elevation of machinery or equipment servicing the building?" field is "mandatory"
#
#    When I set what is the building diagram number to "6"
#
#    * I verify "What is the Square feet of the enclosure?" field is "mandatory"
#    * I verify "No. of permanent flood openings in the crawls space or enclosure(s) within 1.0 foot above adjacent grade" field is "mandatory"
#    * I verify "What is the total net area of flood openings in square inches" field is "mandatory"
#
#    When I set "Building_Diagram_Number" to "1,2,3,4"
#    * I set "Top_Of_Bottom_Floor" to "1"
#    * I set "Top_Of_Next_Floor" to "1"
#    * I set "Bottom_Of_The_Attached_Garage" to "1"
#    * I set "Total_Square_Feet_For_The_Attached_Garage" to "1"
#    * I set "Permanent_Flood_Openings" to "1"
#    * I set "Total_Area_Of_All_Permanent_Openings" to "1"
#    * I set "Lowest_Elevation_Machinery" to "1"
#    * I fill out HO quote elevation certificate details block
#    * I rate a quote
#    * I navigate to underwriting referrals page
#    * I accept underwriting referrals
#
#    Then I bind a quote