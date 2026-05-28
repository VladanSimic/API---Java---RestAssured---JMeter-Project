@US47048 @US @UT @Homeowners @HO @PCRegression @2024 @December @UI @Rating @PostProd
Feature: US47048 - Change Request - UT Home EQ Extension Referral

  @NB @END @NewBusiness @Endorsement @Renewal @RN
  Scenario: UT Home EQ Extension Referral - NB/END/RN
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "25%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I rate a quote
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "20%"

    And I review changes
    * I rate an endorsement
    And I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is displayed 3 times
    * I accept underwriting referrals
    Then I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension deductible to "15%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "10%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "5%"

    Then I review changes
    And I click renewed premium
    When I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is "not displayed" on the UI
    * I accept underwriting referrals
    * I process a renewal

  @NB @END @NewBusiness @Endorsement @DayBefore @DayBeforePD @PreProd
  Scenario: UT Home EQ Extension Referral - Day Before PD Filling
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "25%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I rate a quote
    When I navigate to underwriting referrals page
    And I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is "not displayed" on the UI
    Then I accept underwriting referrals
    And I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "20%"

    And I review changes
    * I rate an endorsement
    And I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is "not displayed" on the UI
    * I accept underwriting referrals
    Then I issue an endorsement

  @NB @END @NewBusiness @Endorsement @Renewal @RN @RC @RenewalConversion
  Scenario: UT Home EQ Extension Referral - Renewal Conversion
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "25%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I rate a quote
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "20%"

    And I review changes
    * I rate an endorsement
    And I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is "not displayed" on the UI
    * I accept underwriting referrals
    Then I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "15%"

    Then I review changes
    And I click renewed premium
    When I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is "not displayed" on the UI
    * I accept underwriting referrals
    * I process a renewal
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "15%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "5%"
    Then I review changes
    * I rate an endorsement
    When I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is displayed 3 times
    * I accept underwriting referrals
    * I issue an endorsement

  @NB @END @NewBusiness @Endorsement @Renewal @RN @DayBeforeRC
  Scenario: UT Home EQ Extension Referral - Day Before Renewal Conversion
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "25%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I rate a quote
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "20%"

    And I review changes
    * I rate an endorsement
    And I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is "not displayed" on the UI
    * I accept underwriting referrals
    Then I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "15%"

    Then I review changes
    And I click renewed premium
    When I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is "not displayed" on the UI
    * I accept underwriting referrals
    * I process a renewal
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "10%"
    Then I review changes
    * I rate an endorsement
    When I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is "not displayed" on the UI
    * I accept underwriting referrals
    * I issue an endorsement

  @Rewrite @PreProd
  Scenario: UT Home EQ Extension Referral - Rewrite
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "25%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I rate a quote
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 01/01/2025 |
    And I navigate to Homeowner Policy Page
    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "20%"

    And I review changes
    * I rate an endorsement
    Then I complete rewrite transaction
    * I override subjectivities for New Business Rewrite transaction
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to policy image page

    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension deductible to "15%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "10%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "5%"

    Then I review changes
    And I rate an endorsement
    When I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is displayed 3 times
    * I accept underwriting referrals
    * I issue an endorsement

  @NB @END @NewBusiness @Endorsement @PreProdNew
  Scenario: UT Home EQ Extension Referral - PreProd
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "25%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I rate a quote
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension deductible to "20%"

    And I review changes
    * I rate an endorsement
    And I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is displayed 3 times
    * I accept underwriting referrals
    Then I issue an endorsement
