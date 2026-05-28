@US48599 @TC96321 @TC96326 @US @GA @Homeowners @HO @PCRegression @2025 @MAR @Forms @P1 @PCTeam2Regression @Retry
Feature: US48599: [Continued] GA Multiple LOB - Fraud/Special Provisions - Form

  @NB @NewBusiness
  Scenario: GA Multiple LOB - Fraud/Special Provisions - Form - NB
    Given I use "GA_Forms_003" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Excess_Flood_Coverage" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "175 Oak Ridge Cir"
    * I set risk address 1 city to "Richmond Hill"
    * I set risk address 1 state to "GA"
    * I set risk address 1 zip to "31324"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "5000000"
    * I set risk address 1 AOP Ded to "250,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Richmond Hill"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Belmonte Dr SW"
    * I set risk address 2 city to "Atlanta"
    * I set risk address 2 state to "GA"
    * I set risk address 2 zip to "30311"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "1%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Atlanta"
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



  @PriorNB @PriorNewBusiness @DayPrior
  Scenario: GA Multiple LOB - Fraud/Special Provisions - Form - NB Prior
    Given I use "GA_Forms_003" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/31/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Excess_Flood_Coverage" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "175 Oak Ridge Cir"
    * I set risk address 1 city to "Richmond Hill"
    * I set risk address 1 state to "GA"
    * I set risk address 1 zip to "31324"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "5000000"
    * I set risk address 1 AOP Ded to "250,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Richmond Hill"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "122 Belmonte Dr SW"
    * I set risk address 2 city to "Atlanta"
    * I set risk address 2 state to "GA"
    * I set risk address 2 zip to "30311"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "1%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Atlanta"
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

