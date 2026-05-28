@US45496 @US @GA @Homeowners @HO @PCRegression @2025 @January @Forms
Feature: US45496 - GA Home Structural - Forms

  @NB @END @RN @NewBusiness @Endorsement @Renewal @1
  Scenario: GA Home Structural - Forms - NB/END/RN
    Given I use "GA_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Excess_Flood_Coverage" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "108 San Marco Drive"
    * I set risk address 1 city to "Tybee Island"
    * I set risk address 1 state to "GA"
    * I set risk address 1 zip to "31328"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "5000000"
    * I set risk address 1 AOP Ded to "250,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Tybee Island"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "113 E 26th St"
    * I set risk address 2 city to "Sea Island"
    * I set risk address 2 state to "GA"
    * I set risk address 2 zip to "31561"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "1%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Sea Island"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page

    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
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
    * I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "2561 Oakridge Drive"
    * I set risk address 3 city to "Conyers"
    * I set risk address 3 state to "GA"
    * I set risk address 3 zip to "30094"
    * I set risk address 3 residence type to "Homeowner"
    * I set risk address 3 replacement cost to "5000000"
    * I set risk address 3 AOP Ded to "100,000"
    * I set risk address 3 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Conyers"
    * I set "Residence_Type" to "Homeowner"
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""
    * I set "Is_There_Mortgage" to ""
    * I set "Wind_Mitigation_Fortified_Designation" to "Gold"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"

    Then I navigate to Location Details Page
    Then I navigate to Location Details Page
    * I think for 5 to 10 seconds
    * I approve uw referrals if visible
    * I navigate to policy image page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    * I set "City_Name_Txt" to "Duluth"
    * I navigate to Location Details Page
    * I set fortified designation to "Roof" designation expiration date to "01/01/2028"

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any

  @NB @END @NewBusiness @Endorsement @DayPrior @DayPriorPD @PreProd
  Scenario: GA Home Structural - Forms - Day Prior PD Filling + Endorsement
    Given I use "GA_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Excess_Flood_Coverage" to ""
    * I set "Wind_Or_Hail_Ded" to "Not Available"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "108 San Marco Drive"
    * I set risk address 1 city to "Tybee Island"
    * I set risk address 1 state to "GA"
    * I set risk address 1 zip to "31328"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "5000000"
    * I set risk address 1 AOP Ded to "250,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Tybee Island"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "113 E 26th St"
    * I set risk address 2 city to "Sea Island"
    * I set risk address 2 state to "GA"
    * I set risk address 2 zip to "31561"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "1%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Sea Island"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page

    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "2561 Oakridge Drive"
    * I set risk address 3 city to "Conyers"
    * I set risk address 3 state to "GA"
    * I set risk address 3 zip to "30094"
    * I set risk address 3 residence type to "Homeowner"
    * I set risk address 3 replacement cost to "5000000"
    * I set risk address 3 AOP Ded to "100,000"
    * I set risk address 3 windstorm or hail deductible to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Conyers"
    * I set "Residence_Type" to "Homeowner"
    * I set "Is_There_Mortgage" to "Yes"
    Then I navigate to Location Details Page
    * I verify if element with message "FORTIFIED Designation" is "not displayed" on the UI
    * I verify if element with message "Designation Expiration Date" is "not displayed" on the UI
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote additional interests coverages page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @NB @RN @NewBusiness @Renewal @RenewalConversion @RC
  Scenario: GA Home Structural - Forms - Renewal Conversion
    Given I use "GA_Forms_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/01/2024"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Excess_Flood_Coverage" to ""
    * I set "Wind_Or_Hail_Ded" to "Not Available"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Location Details Page
    * I verify if element with message "FORTIFIED Designation" is "not displayed" on the UI
    * I verify if element with message "Designation Expiration Date" is "not displayed" on the UI
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "108 San Marco Drive"
    * I set risk address 1 city to "Tybee Island"
    * I set risk address 1 state to "GA"
    * I set risk address 1 zip to "31328"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "1000000"
    * I set risk address 1 AOP Ded to "1,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Tybee Island"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "113 E 26th St"
    * I set risk address 2 city to "Sea Island"
    * I set risk address 2 state to "GA"
    * I set risk address 2 zip to "31561"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "2000000"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "1%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Sea Island"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    When I create a renewal
    Then I navigate to policy image page
    * I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Duluth"
    * I navigate to Location Details Page
    * I set fortified designation to "Roof" designation expiration date to "01/01/2027"
    And I verify if element with message "FORTIFIED Designation" is "displayed" on the UI
    * I verify if element with message "Designation Expiration Date" is "displayed" on the UI
    When I navigate to Additional Interests Page
    * I approve uw referrals if visible
    * I navigate to policy image page
    * I navigate to Additional Interests Page
    Then I click add additional interests
    * I click on the footer
    And I set additional interest 7 type to "Additional Insured -  Premises Liability for Specific Location"
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

    Then I click on the footer
    And I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite @PreProd
  Scenario: GA Home Structural - Forms - Rewrite
    Given I use "GA_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Excess_Flood_Coverage" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "108 San Marco Drive"
    * I set risk address 1 city to "Tybee Island"
    * I set risk address 1 state to "GA"
    * I set risk address 1 zip to "31328"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "5000000"
    * I set risk address 1 AOP Ded to "250,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Tybee Island"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "113 E 26th St"
    * I set risk address 2 city to "Sea Island"
    * I set risk address 2 state to "GA"
    * I set risk address 2 zip to "31561"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "1%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Sea Island"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page

    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
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
      | Company | 02/15/2025 | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 02/15/2025 |
    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @NB @NewBusiness @PreProd
  Scenario: GA Home Structural - Forms - Out of Scope State (FL)
    Given I use "FL_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    And I set risk address 1 address line 1 to "14374 SW 163rd Ter"
    * I set risk address 1 city to "Miami"
    * I set risk address 1 state to "FL"
    * I set risk address 1 zip to "33177"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "2000000"
    * I click on the footer
    * I click order property details button
    * I set "Address_Line_1_Txt" to "14374 SW 163rd Ter"
    * I set "City_Name_Txt" to "Miami"
    * I set "Zip_Code" to "33177"
    * I set "Residence_Type" to "Condo/Co-op"
    * I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out HO quote binding information page
    * I fill out HO quote inspection details page

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

  @NB @END @NewBusiness @Endorsement @PreProdNew
  Scenario: GA Home Structural - Forms - PreProd
    Given I use "GA_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Excess_Flood_Coverage" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "108 San Marco Drive"
    * I set risk address 1 city to "Tybee Island"
    * I set risk address 1 state to "GA"
    * I set risk address 1 zip to "31328"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "5000000"
    * I set risk address 1 AOP Ded to "250,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Tybee Island"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "113 E 26th St"
    * I set risk address 2 city to "Sea Island"
    * I set risk address 2 state to "GA"
    * I set risk address 2 zip to "31561"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "1%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Sea Island"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page

    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "2561 Oakridge Drive"
    * I set risk address 3 city to "Conyers"
    * I set risk address 3 state to "GA"
    * I set risk address 3 zip to "30094"
    * I set risk address 3 residence type to "Homeowner"
    * I set risk address 3 replacement cost to "5000000"
    * I set risk address 3 AOP Ded to "100,000"
    * I set risk address 3 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Conyers"
    * I set "Residence_Type" to "Homeowner"
    * I set "Wind_Mitigation_Fortified_Designation" to "Gold"
    * I set "Additional_Interests_Name_1" to "Add Ins HO 2"
    * I set "Additional_Interests_Name_2" to "Add Int HO 2"
    * I set "Additional_Interests_Name_3" to "LLC HO 2"
    * I set "Additional_Interests_Name_4" to "Add Ins Spec Loc HO 2"
    * I set "Additional_Interests_Name_5" to "LP HO 2"
    * I set "Additional_Interests_Name_6" to "First Mortgagee HO 2"
    * I set "Additional_Interests_Name_7" to "Third Mortgagee HO 2"
    * I set "Additional_Interests_Name_8" to "HELOC Mortgagee HO 2"
    * I set "Additional_Interests_Name_9" to "Add Ins Spec Pro HO 2"

    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    And I review changes
    Then I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement