@US45514 @US @UT @Homeowners @HO @PCRegression @2024 @December @Forms @3.0
Feature: US45514 - UT Home 3.0 Forms

  @NB @END @RN @NewBusiness @Endorsement @Renewal @Individual
  Scenario: UT Home - 3.0 Forms - Individual Named Insured - NB/END/RN

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I initiate new endorsement

    When I navigate to Homeowner Policy Page
    Then I set risk address 0 Loss of Use to "10%"
    * I set risk address 1 Loss of Use to "0"
    * I set risk address 2 Loss of Use to "20%"
    * I set risk address 3 Loss of Use to "10%"
    * I set "City_Name_Txt" to "Kanab"
    * I navigate to Location Details Page
    * I navigate via action button next
    And I set Replacement Cost Coverage to "Extended Replacement Cost - 150%"

    And I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    And I navigate to Location Details Page
    * I navigate via action button next
    And I set Replacement Cost Coverage to "Extended Replacement Cost - 200%"

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @NewBusiness @Endorsement @DayPrior @Individual
  Scenario: UT Home - 3.0 Forms - Individual Named Insured - DayPrior PD Filling

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
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
    * I issue an endorsement

  @NB @END @NewBusiness @Endorsement @DayPriorRB @Individual
  Scenario: UT Home - 3.0 Forms - Individual Named Insured - DayPrior RB

    Given I use "UT_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P83" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
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
    * I issue an endorsement

  @NB @NewBusiness @RC @RenewalConversion @Individual
  Scenario: UT Home - 3.0 Forms - Individual Named Insured - Renewal Conversion

    Given I use "UT_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P84" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "LP HO 2"
    * I set "Additional_Interests_Name_5" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_6" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "HELOC Mortgagee HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "LP Condo"
    * I set "Additional_Interests_Name_5" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_6" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "HELOC Mortgagee Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "LP Tenants"
    * I set "Additional_Interests_Name_5" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_6" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "HELOC Mortgagee Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    Then I navigate to transactions or endorsements

    When I create a renewal
    Then I navigate to policy image page
    * I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc HO"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property HO"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"
    * I set "City_Name_Txt" to "Kanab"
    * I minimize node tree except the first node
    * I expand node tree if needed
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc HO 2"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property HO 2"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"

    * I set "City_Name_Txt" to "Beaver"
    * I minimize node tree except the first node
    * I expand node tree if needed
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc Condo"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property Condo"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"

    * I set "City_Name_Txt" to "Midvale"
    * I minimize node tree except the first node
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc Tenants"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property Tenants"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @RN @NewBusiness @Reinstatement @Individual
  Scenario: UT Home - 3.0 Forms - Individual Named Insured - Reinstatement

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P85" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    And I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

  @NB @END @RN @NewBusiness @Rewrite @Individual
  Scenario: UT Home - 3.0 Forms - Individual Named Insured - Rewrite

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P86" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 01/01/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @NB @END @RN @NewBusiness @Endorsement @Renewal @LLC
  Scenario: UT Home - 3.0 Forms - LLC Named Insured - NB/END/RN

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P87" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I initiate new endorsement

    When I navigate to Homeowner Policy Page
    Then I set risk address 0 Loss of Use to "10%"
    * I set risk address 1 Loss of Use to "0"
    * I set risk address 2 Loss of Use to "20%"
    * I set risk address 3 Loss of Use to "10%"
    * I set "City_Name_Txt" to "Kanab"
    * I navigate to Location Details Page
    * I navigate via action button next
    And I set Replacement Cost Coverage to "Extended Replacement Cost - 150%"

    And I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    And I navigate to Location Details Page
    * I navigate via action button next
    And I set Replacement Cost Coverage to "Extended Replacement Cost - 200%"

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @NewBusiness @Endorsement @DayPrior @LLC
  Scenario: UT Home - 3.0 Forms - LLC Named Insured - DayPrior PD Filling

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P88" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
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
    * I issue an endorsement

  @NB @END @NewBusiness @Endorsement @DayPriorRB @LLC
  Scenario: UT Home - 3.0 Forms - LLC Named Insured - DayPrior RB

    Given I use "UT_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P89" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
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
    * I issue an endorsement

  @NB @NewBusiness @RC @RenewalConversion @LLC
  Scenario: UT Home - 3.0 Forms - LLC Named Insured - Renewal Conversion

    Given I use "UT_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P90" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "LP HO 2"
    * I set "Additional_Interests_Name_5" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_6" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "HELOC Mortgagee HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "LP Condo"
    * I set "Additional_Interests_Name_5" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_6" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "HELOC Mortgagee Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "LP Tenants"
    * I set "Additional_Interests_Name_5" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_6" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "HELOC Mortgagee Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    Then I navigate to transactions or endorsements

    When I create a renewal
    Then I navigate to policy image page
    * I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc HO"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property HO"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"
    * I set "City_Name_Txt" to "Kanab"
    * I minimize node tree except the first node
    * I expand node tree if needed
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc HO 2"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property HO 2"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"

    * I set "City_Name_Txt" to "Beaver"
    * I minimize node tree except the first node
    * I expand node tree if needed
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc Condo"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property Condo"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"

    * I set "City_Name_Txt" to "Midvale"
    * I minimize node tree except the first node
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc Tenants"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property Tenants"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @RN @NewBusiness @Reinstatement @LLC
  Scenario: UT Home - 3.0 Forms - LLC Named Insured - Reinstatement

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P91" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    And I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

  @NB @END @RN @NewBusiness @Rewrite @LLC
  Scenario: UT Home - 3.0 Forms - LLC Named Insured - Rewrite

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P92" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 01/01/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @NB @END @RN @NewBusiness @Endorsement @Renewal @Trust
  Scenario: UT Home - 3.0 Forms - Trust Named Insured - NB/END/RN

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P93" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I initiate new endorsement

    When I navigate to Homeowner Policy Page
    Then I set risk address 0 Loss of Use to "10%"
    * I set risk address 1 Loss of Use to "0"
    * I set risk address 2 Loss of Use to "20%"
    * I set risk address 3 Loss of Use to "10%"
    * I set "City_Name_Txt" to "Kanab"
    * I navigate to Location Details Page
    * I navigate via action button next
    And I set Replacement Cost Coverage to "Extended Replacement Cost - 150%"

    And I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    And I navigate to Location Details Page
    * I navigate via action button next
    And I set Replacement Cost Coverage to "Extended Replacement Cost - 200%"

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @NewBusiness @Endorsement @DayPrior @Trust
  Scenario: UT Home - 3.0 Forms - Trust Named Insured - DayPrior PD Filling

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P94" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
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
    * I issue an endorsement

  @NB @END @NewBusiness @Endorsement @DayPriorRB @Trust
  Scenario: UT Home - 3.0 Forms - Trust Named Insured - DayPrior RB

    Given I use "UT_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P95" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
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
    * I issue an endorsement

  @NB @NewBusiness @RC @RenewalConversion @Trust
  Scenario: UT Home - 3.0 Forms - Trust Named Insured - Renewal Conversion

    Given I use "UT_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P96" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "LP HO 2"
    * I set "Additional_Interests_Name_5" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_6" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "HELOC Mortgagee HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "LP Condo"
    * I set "Additional_Interests_Name_5" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_6" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "HELOC Mortgagee Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "LP Tenants"
    * I set "Additional_Interests_Name_5" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_6" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "HELOC Mortgagee Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    Then I navigate to transactions or endorsements

    When I create a renewal
    Then I navigate to policy image page
    * I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc HO"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property HO"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"
    * I set "City_Name_Txt" to "Kanab"
    * I minimize node tree except the first node
    * I expand node tree if needed
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc HO 2"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property HO 2"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"

    * I set "City_Name_Txt" to "Beaver"
    * I minimize node tree except the first node
    * I expand node tree if needed
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc Condo"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property Condo"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"

    * I set "City_Name_Txt" to "Midvale"
    * I minimize node tree except the first node
    And I navigate to Location Details Page
    * I navigate to Additional Interests Page
    * I click add additional interests
    * I click on the footer
    * I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
    * I set additional interest 7 llc trust to "No"
    * I set additional interest 7 name to "Premises Specific Loc Tenants"
    * I set additional interest 7 address line 1 to "1999 E West Pkwy"
    * I set additional interest 7 city to "Fleming Island"
    * I set additional interest 7 state to "FL"
    * I set additional interest 7 zip to "32003"
    * I set additional interest 7 address for liability coverage to "200 Walmart Avenue, Fleming Island, FL, 32003"
    * I click add additional interests
    * I click on the footer
    * I set additional interest 8 type to "Additional Insured -  Premises Liability for Specific Property"
    * I set additional interest 8 llc trust to "No"
    * I set additional interest 8 name to "Premises Specific Property Tenants"
    * I set additional interest 8 address line 1 to "2000 E West Pkwy"
    * I set additional interest 8 city to "Fleming Island"
    * I set additional interest 8 state to "FL"
    * I set additional interest 8 zip to "32003"
    * I set additional interest 8 address for liability coverage to "201 Walmart Avenue, Fleming Island, FL, 32003"
    * I set additional interest 8 property description to "Description"

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @RN @NewBusiness @Reinstatement @Trust
  Scenario: UT Home - 3.0 Forms - Trust Named Insured - Reinstatement

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P97" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    And I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

  @NB @END @RN @NewBusiness @Rewrite @Trust
  Scenario: UT Home - 3.0 Forms - Trust Named Insured - Rewrite

    Given I use "UT_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P98" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "755 Hillside Dr"
    * I set risk address 1 city to "Moab"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84532"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Roof_Shape" to "Flat"
    * I set "Flood_Information_Flood_Zone" to "A99/B/C/X"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "410 N Main St"
    * I set risk address 2 city to "Beaver"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84713"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Flood_Information_Flood_Zone" to ""
    * I set "Additional_Interests_Name_1" to "Add Ins Condo"
    * I set "Additional_Interests_Name_2" to "Add Int Condo"
    * I set "Additional_Interests_Name_3" to "LLC Condo"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Condo"
    * I set "Additional_Interests_Name_5" to "LP Condo"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Condo"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Condo"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Condo"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Condo"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "7857 S Pioneer St"
    * I set risk address 3 city to "Midvale"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84047"
    * I set risk address 3 residence type to "Tenants"
    * I set risk address 3 contents to "1299990"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Midvale"
    * I set "Residence_Type" to "Tenants"
    * I set "Additional_Interests_Name_1" to "Add Ins Tenants"
    * I set "Additional_Interests_Name_2" to "Add Int Tenants"
    * I set "Additional_Interests_Name_3" to "LLC Tenants"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc Tenants"
    * I set "Additional_Interests_Name_5" to "LP Tenants"
    * I set "Additional_Interests_Name_6" to "First Mortgagee Tenants"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee Tenants"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee Tenants"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 01/01/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @NB @END @RN @NewBusiness @Endorsement @Renewal @RealCustomerData
  Scenario: UT Home - 3.0 Forms - Real Customer Data
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    * I set "First_Name" to "James"
    * I set "MI" to "L"
    * I set "Last_Name" to "Owen"
    * I set "Suffix" to "Jr."
    * I set "Date_Of_Birth" to "12/15/1960"
    * I set "SSN" to "666298143"
    * I set "Address_Line_1_Txt" to "646 N East Ln"
    * I set "City_Name_Txt" to "American Fork"
    * I set "Zip_Code" to "84003"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I initiate new endorsement
    Then I set Did Member Request RePull Of Insurance Score Upon Renewal to "Yes"
    * I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    And I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "Endorsement"
    * I navigate to policy image page
    * I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite @Renewal @RN @Endorsement @END
  Scenario: UT Home - 3.0 Forms - Home Rewrite Form 1
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    * I set "Endorsement_Effective_Date_END" to "02/16/2024"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I initiate new endorsement
    * I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite
  Scenario: UT Home - 3.0 Forms - Home Rewrite Form 2
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I initiate new endorsement
    * I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite
  Scenario: UT Home - 3.0 Forms - Home Rewrite Form 3
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I initiate new endorsement
    * I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite
  Scenario: UT Home - 3.0 Forms - Home Rewrite Form 4
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2024"
    * I set "Endorsement_Effective_Date_END" to "01/02/2024"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I initiate new endorsement
    * I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite
  Scenario: UT Home - 3.0 Forms - Home Rewrite Form 5
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2025"
    * I set "Endorsement_Effective_Date_END" to "02/15/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I initiate new endorsement
    * I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite
  Scenario: UT Home - 3.0 Forms - Home Rewrite Form 6
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2024"
    * I set "Endorsement_Effective_Date_END" to "02/15/2024"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I initiate new endorsement
    * I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite
  Scenario: UT Home - 3.0 Forms - Home Rewrite Form 7
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    * I set "Endorsement_Effective_Date_END" to "02/16/2024"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I initiate new endorsement
    * I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal
