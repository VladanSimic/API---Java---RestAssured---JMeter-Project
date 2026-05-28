@US48598 @TC95964 @TC95965 @US @WA @Homeowners @HO @PCRegression @2025 @MAR @Forms @P1 @PCTeam2Regression
Feature: US48598: [Continued] WA Multiple LOB - Special Provisions - Form

  @NB @NewBusiness
  Scenario: WA Multiple LOB - Special Provisions - Form - NB
    Given I use "WA_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "07/01/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Excess_Flood_Coverage" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "337 Heron Cove Road"
    * I set risk address 1 city to "Port Angeles"
    * I set risk address 1 state to "WA"
    * I set risk address 1 zip to "98363"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "5000000"
    * I set risk address 1 AOP Ded to "250,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I set risk address 1 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Port Angeles"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "56 North Washington Street"
    * I set risk address 2 city to "Spokane"
    * I set risk address 2 state to "WA"
    * I set risk address 2 zip to "99201"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "1%"
    * I set risk address 2 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Spokane"
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
  Scenario: WA Multiple LOB - Special Provisions - Form - NB Prior
    Given I use "WA_Forms_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "06/30/2025"
    * I set "Policy_Information_Named_Insured_Type" to "Individual"
    * I set "Optional_Coverages_Excess_Flood_Coverage" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "337 Heron Cove Road"
    * I set risk address 1 city to "Port Angeles"
    * I set risk address 1 state to "WA"
    * I set risk address 1 zip to "98363"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "5000000"
    * I set risk address 1 AOP Ded to "250,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I set risk address 1 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Port Angeles"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "56 North Washington Street"
    * I set risk address 2 city to "Spokane"
    * I set risk address 2 state to "WA"
    * I set risk address 2 zip to "99201"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "1%"
    * I set risk address 2 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Spokane"
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
