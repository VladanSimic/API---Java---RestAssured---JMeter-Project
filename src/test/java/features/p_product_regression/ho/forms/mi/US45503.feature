@US45503 @US @MI @Homeowners @HO @PCRegression @2024 @December @Forms
Feature: US45503 - MI Home Special Provisions Forms

  @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: MI Special Provisions Forms - NB/END/RN

    Given I use "MI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "892 Saint Clair Avenue"
    * I set risk address 1 city to "Grosse Pointe"
    * I set risk address 1 state to "MI"
    * I set risk address 1 zip to "48230"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "2500000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Grosse Pointe"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "25862 Hersheyvale Dr"
    * I set risk address 2 city to "Franklin"
    * I set risk address 2 state to "MI"
    * I set risk address 2 zip to "48025"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6100000"
    * I set risk address 2 AOP Ded to "2,500"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Franklin"
    * I set "Residence_Type" to "Condo/Co-op"
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
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @RC @RenewalConversion
  Scenario: MI Special Provisions Forms - Renewal Conversion

    Given I use "MI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "892 Saint Clair Avenue"
    * I set risk address 1 city to "Grosse Pointe"
    * I set risk address 1 state to "MI"
    * I set risk address 1 zip to "48230"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "2500000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Grosse Pointe"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "25862 Hersheyvale Dr"
    * I set risk address 2 city to "Franklin"
    * I set risk address 2 state to "MI"
    * I set risk address 2 zip to "48025"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6100000"
    * I set risk address 2 AOP Ded to "2,500"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Franklin"
    * I set "Residence_Type" to "Condo/Co-op"
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
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @DayPrior @Endorsement @NewBusiness @PreProd
  Scenario: MI Special Provisions Forms - Day Prior PD Filling

    Given I use "MI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "892 Saint Clair Avenue"
    * I set risk address 1 city to "Grosse Pointe"
    * I set risk address 1 state to "MI"
    * I set risk address 1 zip to "48230"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "2500000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Grosse Pointe"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "25862 Hersheyvale Dr"
    * I set risk address 2 city to "Franklin"
    * I set risk address 2 state to "MI"
    * I set risk address 2 zip to "48025"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6100000"
    * I set risk address 2 AOP Ded to "2,500"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Franklin"
    * I set "Residence_Type" to "Condo/Co-op"
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
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Rewrite @NBRewrite @PreProd
  Scenario: MI Special Provisions Forms - NB Rewrite

    Given I use "MI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "892 Saint Clair Avenue"
    * I set risk address 1 city to "Grosse Pointe"
    * I set risk address 1 state to "MI"
    * I set risk address 1 zip to "48230"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "2500000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Grosse Pointe"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "25862 Hersheyvale Dr"
    * I set risk address 2 city to "Franklin"
    * I set risk address 2 state to "MI"
    * I set risk address 2 zip to "48025"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6100000"
    * I set risk address 2 AOP Ded to "2,500"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Franklin"
    * I set "Residence_Type" to "Condo/Co-op"
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
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 01/01/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @Reinstatement @PreProd
  Scenario: MI Special Provisions Forms - Reinstatement

    Given I use "MI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "892 Saint Clair Avenue"
    * I set risk address 1 city to "Grosse Pointe"
    * I set risk address 1 state to "MI"
    * I set risk address 1 zip to "48230"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "2900000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Grosse Pointe"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "25862 Hersheyvale Dr"
    * I set risk address 2 city to "Franklin"
    * I set risk address 2 state to "MI"
    * I set risk address 2 zip to "48025"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6100000"
    * I set risk address 2 AOP Ded to "2,500"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Franklin"
    * I set "Residence_Type" to "Condo/Co-op"
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
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

  @NB @END @RN @NewBusiness @Endorsement @PreProdNew
  Scenario: MI Special Provisions Forms - PreProd

    Given I use "MI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "892 Saint Clair Avenue"
    * I set risk address 1 city to "Grosse Pointe"
    * I set risk address 1 state to "MI"
    * I set risk address 1 zip to "48230"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "2500000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Grosse Pointe"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "25862 Hersheyvale Dr"
    * I set risk address 2 city to "Franklin"
    * I set risk address 2 state to "MI"
    * I set risk address 2 zip to "48025"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6100000"
    * I set risk address 2 AOP Ded to "2,500"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Franklin"
    * I set "Residence_Type" to "Condo/Co-op"
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
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @NB @END @RN @NewBusiness @Endorsement @PreProdNew @Conditional
  Scenario: MI Special Provisions Forms Conditional - PreProd

    Given I use "MI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "892 Saint Clair Avenue"
    * I set risk address 1 city to "Grosse Pointe"
    * I set risk address 1 state to "MI"
    * I set risk address 1 zip to "48230"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "2500000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Grosse Pointe"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "25862 Hersheyvale Dr"
    * I set risk address 2 city to "Franklin"
    * I set risk address 2 state to "MI"
    * I set risk address 2 zip to "48025"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6100000"
    * I set risk address 2 AOP Ded to "2,500"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Franklin"
    * I set "Residence_Type" to "Condo/Co-op"
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
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @NB @END @RN @NewBusiness @Endorsement @Conditional @RN @Renewal
  Scenario: MI Special Provisions Forms Conditional

    Given I use "MI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "892 Saint Clair Avenue"
    * I set risk address 1 city to "Grosse Pointe"
    * I set risk address 1 state to "MI"
    * I set risk address 1 zip to "48230"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "2500000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Grosse Pointe"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "25862 Hersheyvale Dr"
    * I set risk address 2 city to "Franklin"
    * I set risk address 2 state to "MI"
    * I set risk address 2 zip to "48025"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6100000"
    * I set risk address 2 AOP Ded to "2,500"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Franklin"
    * I set "Residence_Type" to "Condo/Co-op"
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
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal
