@US47202 @US @DE @Homeowners @HO @PCRegression @2025 @January @Forms @3.0
Feature: US47202 - DE Home 3.0 Forms

  @NB @END @RN @NewBusiness @Endorsement @Renewal @Individual @PreProd
  Scenario: DE Home - 3.0 Forms - Individual Named Insured - NB/END/RN
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
    * I set "City_Name_Txt" to "Lewes"
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

  @NB @END @NewBusiness @Endorsement @DayPrior @Individual @PreProd
  Scenario: DE Home - 3.0 Forms - Individual Named Insured - DayPrior PD Filling
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2025"
    * I set "Endorsement_Effective_Date_END" to "02/15/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
  Scenario: DE Home - 3.0 Forms - Individual Named Insured - DayPrior RB
    Given I use "DE_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P83" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/30/2024"
    * I set "Endorsement_Effective_Date_END" to "04/01/2024"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
  Scenario: DE Home - 3.0 Forms - Individual Named Insured - Renewal Conversion
    Given I use "DE_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P84" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/01/2024"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
    * I set "City_Name_Txt" to "Lewes"
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
    * I set "City_Name_Txt" to "Middletown"
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

    * I set "City_Name_Txt" to "Dover"
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

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any

  @NB @END @RN @NewBusiness @Reinstatement @Individual @PreProd
  Scenario: DE Home - 3.0 Forms - Individual Named Insured - Reinstatement
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P85" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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

  @NB @END @RN @NewBusiness @Rewrite @Individual @PreProd
  Scenario: DE Home - 3.0 Forms - Individual Named Insured - Rewrite
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P86" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
      | notes | date       |
      | Notes | 02/15/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @NB @END @RN @NewBusiness @Endorsement @Renewal @LLC @PreProd
  Scenario: DE Home - 3.0 Forms - LLC Named Insured - NB/END/RN
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
    * I set "City_Name_Txt" to "Lewes"
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

  @NB @END @NewBusiness @Endorsement @DayPrior @LLC @PreProd
  Scenario: DE Home - 3.0 Forms - LLC Named Insured - DayPrior PD Filling
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2025"
    * I set "Endorsement_Effective_Date_END" to "02/15/2025"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
  Scenario: DE Home - 3.0 Forms - LLC Named Insured - DayPrior RB
    Given I use "DE_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P83" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/30/2024"
    * I set "Endorsement_Effective_Date_END" to "04/01/2024"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
  Scenario: DE Home - 3.0 Forms - LLC Named Insured - Renewal Conversion
    Given I use "DE_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P84" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/01/2024"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
    * I set "City_Name_Txt" to "Lewes"
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
    * I set "City_Name_Txt" to "Middletown"
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

    * I set "City_Name_Txt" to "Dover"
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

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any

  @NB @END @RN @NewBusiness @Reinstatement @LLC @PreProd
  Scenario: DE Home - 3.0 Forms - LLC Named Insured - Reinstatement
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P85" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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

  @NB @END @RN @NewBusiness @Rewrite @LLC @PreProd
  Scenario: DE Home - 3.0 Forms - LLC Named Insured - Rewrite
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P86" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
      | notes | date       |
      | Notes | 02/15/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @NB @END @RN @NewBusiness @Endorsement @Renewal @Trust @PreProd
  Scenario: DE Home - 3.0 Forms - Trust Named Insured - NB/END/RN
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P93" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/15/2025"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
    * I set "City_Name_Txt" to "Lewes"
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

  @NB @END @NewBusiness @Endorsement @DayPrior @Trust @PreProd
  Scenario: DE Home - 3.0 Forms - Trust Named Insured - DayPrior PD Filling
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P94" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2025"
    * I set "Endorsement_Effective_Date_END" to "02/15/2025"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
  Scenario: DE Home - 3.0 Forms - Trust Named Insured - DayPrior RB
    Given I use "DE_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P95" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/30/2024"
    * I set "Endorsement_Effective_Date_END" to "04/01/2024"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any

  @NB @NewBusiness @RC @RenewalConversion @Trust
  Scenario: DE Home - 3.0 Forms - Trust Named Insured - Renewal Conversion
    Given I use "DE_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P96" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/01/2024"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
    * I set "City_Name_Txt" to "Lewes"
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
    * I set "City_Name_Txt" to "Middletown"
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

    * I set "City_Name_Txt" to "Dover"
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

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any

  @NB @END @RN @NewBusiness @Reinstatement @Trust @PreProd
  Scenario: DE Home - 3.0 Forms - Trust Named Insured - Reinstatement
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P97" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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

  @NB @END @RN @NewBusiness @Rewrite @Trust @PreProd
  Scenario: DE Home - 3.0 Forms - Trust Named Insured - Rewrite
    Given I use "DE_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P98" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Optional_Coverages_Replacement_Cost_Coverage" to "Replacement Cost"
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 2500 ft"
    * I set "Policy_Information_Named_Insured_Type" to "Trust"
    * I set "Policy_Information_Trust_LLC_Or_Other_Legal_Entity" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Legal_Entity_Name" to "TestCo Trust"
    * I set "LLC_Trust_Questionnaire_Block_Legal_Entity_Type" to "Trust"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "112 Marathon Dr"
    * I set risk address 1 city to "Middletown"
    * I set risk address 1 state to "DE"
    * I set risk address 1 zip to "19709"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "200000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Middletown"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Flood_Coverage_Extension_DIC" to ""
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
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Stuart Dr"
    * I set risk address 2 city to "Dover"
    * I set risk address 2 state to "DE"
    * I set risk address 2 zip to "19901"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "100001"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Dover"
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
      | notes | date       |
      | Notes | 02/15/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @NB @END @RN @NewBusiness @Endorsement @Renewal @RealCustomerData @PreProd
  Scenario: DE Home - 3.0 Forms - Real Customer Data
    Given I use "DE_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "First_Name" to "Edward"
    * I set "Last_Name" to "Brito"
    * I set "Date_Of_Birth" to "05/10/1975"
    * I set "SSN" to "666115437"
    * I set "Address_Line_1_Txt" to "11 Wineberry Dr"
    * I set "City_Name_Txt" to "Hockessin"
    * I set "Zip_Code" to "19707"
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