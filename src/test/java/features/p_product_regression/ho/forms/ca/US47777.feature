@US47777 @US @CA @Homeowners @HO @PCRegression @2025 @January @Forms
Feature: US47777 - CA Home Advisory Notice Form

  @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: CA Home Advisory Notice Form - NB/END/RN
    Given I use "CA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/29/2025"
    * I set "Endorsement_Effective_Date_END" to "04/29/2025"
    * I set "Address_Line_1_Txt" to "1470 Palou Avenue"
    * I set "City_Name_Txt" to "San Francisco"
    * I set "Zip_Code" to "94124"
    * I set "Replacement_Cost" to "11000000"
    * I set "Deductible" to "5,000"
    * I set "Loss_Of_Use" to "20%"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Extended Replacement Cost - 150%"
    * I set "Wildfire_Mitigation_Credits_Vegetation_Debris_Clearance" to ""
    * I set "Wildfire_Mitigation_Credits_Clearing_Of_Materials_Within5Ft" to ""
    * I set "Wildfire_Mitigation_Credits_NonCombustible_Materials_Improvements" to ""
    * I set "Wildfire_Mitigation_Credits_NoCombustible_Structures_Within30Ft" to ""
    * I set "Wildfire_Mitigation_Credits_PRC_4291_Compliant" to ""
    * I set "Wildfire_Mitigation_Credits_ClassA_Fire_Rated_Roof" to ""
    * I set "Wildfire_Mitigation_Credits_Enclosed_Eaves" to ""
    * I set "Wildfire_Mitigation_Credits_EmberFlame_Resistant_Vents" to ""
    * I set "Wildfire_Mitigation_Credits_Multi_Pane_Windows" to ""
    * I set "Wildfire_Mitigation_Credits_Vertical_Clearance_Surface" to ""
    * I set "Wildfire_Mitigation_Credits_Property_Credits_Override" to "No"
    * I set "Wildfire_Mitigation_Credits_Community_Credits_Override" to ""
    * I set "Wildfire_Mitigation_Credits_Firewise_USA_Site" to ""
    * I set "Wildfire_Mitigation_Credits_FireRisk_Reduction_Community" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "1608 32nd St"
    * I set risk address 1 city to "Oakland"
    * I set risk address 1 state to "CA"
    * I set risk address 1 zip to "94608"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "1100000"
    * I set risk address 1 Deductible to "5,000"
    * I set risk address 1 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Oakland"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "1417 Sandpiper Spit"
    * I set risk address 2 city to "Richmond"
    * I set risk address 2 state to "CA"
    * I set risk address 2 zip to "94801"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "1100000"
    * I set risk address 2 Deductible to "5,000"
    * I set risk address 2 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Richmond"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I navigate to Location Details Page

    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "2799 Breaker Cir"
    * I set risk address 3 city to "Hayward"
    * I set risk address 3 state to "CA"
    * I set risk address 3 zip to "94545"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1200000"
    * I set risk address 3 Deductible to "5,000"
    * I set risk address 3 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Hayward"
    * I set "Residence_Type" to "Tenants"

    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    And I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I think for 7 to 10 seconds
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "San Francisco"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    * I set Replacement Cost Coverage to "Replacement Cost - 100%"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Moderate"

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Oakland"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    * I set Replacement Cost Coverage to "Replacement Cost - 100%"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "High"
    * I fill out HO quote wildfire zone protection requirements block

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Richmond"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Very High"
    * I fill out HO quote wildfire zone protection requirements block

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Hayward"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Very High"
    * I fill out HO quote wildfire zone protection requirements block

    And I review changes
    * I click renewed premium
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @NB @RN @NewBusiness @Renewal @RC @RenewalConversion
  Scenario: CA Home Advisory Notice Form - Renewal Conversion
    Given I use "CA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/29/2024"
    * I set "Address_Line_1_Txt" to "1470 Palou Avenue"
    * I set "City_Name_Txt" to "San Francisco"
    * I set "Zip_Code" to "94124"
    * I set "Replacement_Cost" to "11000000"
    * I set "Deductible" to "5,000"
    * I set "Loss_Of_Use" to "20%"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Extended Replacement Cost - 150%"
    * I set "Wildfire_Mitigation_Credits_Vegetation_Debris_Clearance" to ""
    * I set "Wildfire_Mitigation_Credits_Clearing_Of_Materials_Within5Ft" to ""
    * I set "Wildfire_Mitigation_Credits_NonCombustible_Materials_Improvements" to ""
    * I set "Wildfire_Mitigation_Credits_NoCombustible_Structures_Within30Ft" to ""
    * I set "Wildfire_Mitigation_Credits_PRC_4291_Compliant" to ""
    * I set "Wildfire_Mitigation_Credits_ClassA_Fire_Rated_Roof" to ""
    * I set "Wildfire_Mitigation_Credits_Enclosed_Eaves" to ""
    * I set "Wildfire_Mitigation_Credits_EmberFlame_Resistant_Vents" to ""
    * I set "Wildfire_Mitigation_Credits_Multi_Pane_Windows" to ""
    * I set "Wildfire_Mitigation_Credits_Vertical_Clearance_Surface" to ""
    * I set "Wildfire_Mitigation_Credits_Property_Credits_Override" to "No"
    * I set "Wildfire_Mitigation_Credits_Community_Credits_Override" to ""
    * I set "Wildfire_Mitigation_Credits_Firewise_USA_Site" to ""
    * I set "Wildfire_Mitigation_Credits_FireRisk_Reduction_Community" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "1608 32nd St"
    * I set risk address 1 city to "Oakland"
    * I set risk address 1 state to "CA"
    * I set risk address 1 zip to "94608"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "1100000"
    * I set risk address 1 Deductible to "5,000"
    * I set risk address 1 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Oakland"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "1417 Sandpiper Spit"
    * I set risk address 2 city to "Richmond"
    * I set risk address 2 state to "CA"
    * I set risk address 2 zip to "94801"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "1100000"
    * I set risk address 2 Deductible to "5,000"
    * I set risk address 2 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Richmond"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I navigate to Location Details Page

    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "2799 Breaker Cir"
    * I set risk address 3 city to "Hayward"
    * I set risk address 3 state to "CA"
    * I set risk address 3 zip to "94545"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1200000"
    * I set risk address 3 Deductible to "5,000"
    * I set risk address 3 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Hayward"
    * I set "Residence_Type" to "Tenants"

    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I create a renewal
    Then I navigate to policy image page

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "San Francisco"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    * I set Replacement Cost Coverage to "Replacement Cost - 100%"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Very High"
    * I fill out HO quote wildfire zone protection requirements block

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Oakland"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    * I set Replacement Cost Coverage to "Replacement Cost - 100%"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Extreme"
    * I fill out HO quote wildfire zone protection requirements block

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Richmond"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "High"

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Hayward"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Moderate"

    And I review changes
    * I click renewed premium
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @NB @RN @NewBusiness @Renewal @RC @RenewalConversion @DayPriorRC @DayPrior
  Scenario: CA Home Advisory Notice Form - Day Prior Renewal Conversion
    Given I use "CA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/28/2024"
    * I set "Address_Line_1_Txt" to "1470 Palou Avenue"
    * I set "City_Name_Txt" to "San Francisco"
    * I set "Zip_Code" to "94124"
    * I set "Replacement_Cost" to "11000000"
    * I set "Deductible" to "5,000"
    * I set "Loss_Of_Use" to "20%"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Extended Replacement Cost - 150%"
    * I set "Wildfire_Mitigation_Credits_Vegetation_Debris_Clearance" to ""
    * I set "Wildfire_Mitigation_Credits_Clearing_Of_Materials_Within5Ft" to ""
    * I set "Wildfire_Mitigation_Credits_NonCombustible_Materials_Improvements" to ""
    * I set "Wildfire_Mitigation_Credits_NoCombustible_Structures_Within30Ft" to ""
    * I set "Wildfire_Mitigation_Credits_PRC_4291_Compliant" to ""
    * I set "Wildfire_Mitigation_Credits_ClassA_Fire_Rated_Roof" to ""
    * I set "Wildfire_Mitigation_Credits_Enclosed_Eaves" to ""
    * I set "Wildfire_Mitigation_Credits_EmberFlame_Resistant_Vents" to ""
    * I set "Wildfire_Mitigation_Credits_Multi_Pane_Windows" to ""
    * I set "Wildfire_Mitigation_Credits_Vertical_Clearance_Surface" to ""
    * I set "Wildfire_Mitigation_Credits_Property_Credits_Override" to "No"
    * I set "Wildfire_Mitigation_Credits_Community_Credits_Override" to ""
    * I set "Wildfire_Mitigation_Credits_Firewise_USA_Site" to ""
    * I set "Wildfire_Mitigation_Credits_FireRisk_Reduction_Community" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "1608 32nd St"
    * I set risk address 1 city to "Oakland"
    * I set risk address 1 state to "CA"
    * I set risk address 1 zip to "94608"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "1100000"
    * I set risk address 1 Deductible to "5,000"
    * I set risk address 1 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Oakland"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "1417 Sandpiper Spit"
    * I set risk address 2 city to "Richmond"
    * I set risk address 2 state to "CA"
    * I set risk address 2 zip to "94801"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "1100000"
    * I set risk address 2 Deductible to "5,000"
    * I set risk address 2 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Richmond"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I navigate to Location Details Page

    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "2799 Breaker Cir"
    * I set risk address 3 city to "Hayward"
    * I set risk address 3 state to "CA"
    * I set risk address 3 zip to "94545"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1200000"
    * I set risk address 3 Deductible to "5,000"
    * I set risk address 3 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Hayward"
    * I set "Residence_Type" to "Tenants"

    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I create a renewal
    Then I navigate to policy image page

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "San Francisco"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    * I set Replacement Cost Coverage to "Replacement Cost - 100%"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "High"
    * I fill out HO quote wildfire zone protection requirements block

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Oakland"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    * I set Replacement Cost Coverage to "Replacement Cost - 100%"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Moderate"

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Richmond"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Very High"
    * I fill out HO quote wildfire zone protection requirements block

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Hayward"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Extreme"
    * I fill out HO quote wildfire zone protection requirements block

    And I review changes
    * I click renewed premium
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @NB @RN @NewBusiness @Rewrite @Renewal
  Scenario: CA Home Advisory Notice Form - Rewrite
    Given I use "CA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/28/2025"
    * I set "Address_Line_1_Txt" to "1470 Palou Avenue"
    * I set "City_Name_Txt" to "San Francisco"
    * I set "Zip_Code" to "94124"
    * I set "Replacement_Cost" to "11000000"
    * I set "Deductible" to "5,000"
    * I set "Loss_Of_Use" to "20%"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Extended Replacement Cost - 150%"
    * I set "Wildfire_Mitigation_Credits_Vegetation_Debris_Clearance" to ""
    * I set "Wildfire_Mitigation_Credits_Clearing_Of_Materials_Within5Ft" to ""
    * I set "Wildfire_Mitigation_Credits_NonCombustible_Materials_Improvements" to ""
    * I set "Wildfire_Mitigation_Credits_NoCombustible_Structures_Within30Ft" to ""
    * I set "Wildfire_Mitigation_Credits_PRC_4291_Compliant" to ""
    * I set "Wildfire_Mitigation_Credits_ClassA_Fire_Rated_Roof" to ""
    * I set "Wildfire_Mitigation_Credits_Enclosed_Eaves" to ""
    * I set "Wildfire_Mitigation_Credits_EmberFlame_Resistant_Vents" to ""
    * I set "Wildfire_Mitigation_Credits_Multi_Pane_Windows" to ""
    * I set "Wildfire_Mitigation_Credits_Vertical_Clearance_Surface" to ""
    * I set "Wildfire_Mitigation_Credits_Property_Credits_Override" to "No"
    * I set "Wildfire_Mitigation_Credits_Community_Credits_Override" to ""
    * I set "Wildfire_Mitigation_Credits_Firewise_USA_Site" to ""
    * I set "Wildfire_Mitigation_Credits_FireRisk_Reduction_Community" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "1608 32nd St"
    * I set risk address 1 city to "Oakland"
    * I set risk address 1 state to "CA"
    * I set risk address 1 zip to "94608"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "1100000"
    * I set risk address 1 Deductible to "5,000"
    * I set risk address 1 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Oakland"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "1417 Sandpiper Spit"
    * I set risk address 2 city to "Richmond"
    * I set risk address 2 state to "CA"
    * I set risk address 2 zip to "94801"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "1100000"
    * I set risk address 2 Deductible to "5,000"
    * I set risk address 2 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Richmond"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I navigate to Location Details Page

    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "2799 Breaker Cir"
    * I set risk address 3 city to "Hayward"
    * I set risk address 3 state to "CA"
    * I set risk address 3 zip to "94545"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1200000"
    * I set risk address 3 Deductible to "5,000"
    * I set risk address 3 Loss of Use to "20%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Hayward"
    * I set "Residence_Type" to "Tenants"

    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date       | notes             | method    | reason         | MEP | reason |
      | Company | 04/28/2025 | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 04/29/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

    When I create a renewal
    Then I navigate to policy image page

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "San Francisco"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    * I set Replacement Cost Coverage to "Replacement Cost - 100%"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Moderate"

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Oakland"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    * I set Replacement Cost Coverage to "Replacement Cost - 100%"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "High"
    * I fill out HO quote wildfire zone protection requirements block

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Richmond"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Very High"
    * I fill out HO quote wildfire zone protection requirements block

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Hayward"
    * I navigate to Location Details Page
    * I navigate to Optional Coverages Page
    Then I set Fire And Lighting Extension for Landscaping to "No"
    When I navigate to Wildfire Page
    Then I set wildfire hazard reports wildfire hazard severity override to "Very High"
    * I fill out HO quote wildfire zone protection requirements block

    And I review changes
    * I click renewed premium
    Then I review and accept referrals on renewal if any
    And I process a renewal