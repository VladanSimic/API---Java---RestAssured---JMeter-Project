@US45505 @US @MN @Homeowners @HO @PCRegression @2024 @December @Forms
Feature: US45505 - MN Home - Roof Covering Payment Schedule

  @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: MN Home Roof Covering Payment Schedule - NB/END/RN

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
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
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Year_Built" to "2009"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Gable"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "2000000"
    * I set risk address 2 AOP Ded to "25,000"
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
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
  Scenario: MN Home Roof Covering Payment Schedule - Renewal Conversion

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/07/2024"
    * I set "Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost" to "No"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Gable"
    * I set "Roof_Characteristics_Home_Fortification" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Roof_Covering" to "Wood Shake"
    * I set "Roof_Shape" to "Hip"
    * I set "Year_Built" to "2018"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "2000000"
    * I set risk address 2 AOP Ded to "25,000"
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
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
    * I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @DayPrior @Endorsement @NewBusiness @PreProd
  Scenario: MN Home Roof Covering Payment Schedule - Day Prior PD Filling

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Year_Built" to "2009"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Gable"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "2000000"
    * I set risk address 2 AOP Ded to "25,000"
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
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

  @Rewrite @NBRewrite @PreProd
  Scenario: MN Home Roof Covering Payment Schedule - NB Rewrite

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Year_Built" to "2009"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Gable"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "2000000"
    * I set risk address 2 AOP Ded to "25,000"
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
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
  Scenario: MN Home Roof Covering Payment Schedule - Reinstatement

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Year_Built" to "2009"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Gable"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "2000000"
    * I set risk address 2 AOP Ded to "25,000"
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
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

  And I create reinstatement transaction
  | description        | notes | losses | reason               |
  | Reinstatement test | Notes | No     | Underwriting Reasons |

  @DayPriorRB
  Scenario: MN Home Roof Covering Payment Schedule - Day Prior RB Effective Date

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/06/2024"
    * I set "Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost" to "No"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Gable"
    * I set "Roof_Characteristics_Home_Fortification" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Roof_Covering" to "Wood Shake"
    * I set "Roof_Shape" to "Hip"
    * I set "Year_Built" to "2018"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "2000000"
    * I set risk address 2 AOP Ded to "25,000"
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
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
    * I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @RN @NewBusiness @Endorsement @PreProdNew
  Scenario: MN Home Roof Covering Payment Schedule - PreProd

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
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
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Year_Built" to "2009"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Gable"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "2000000"
    * I set risk address 2 AOP Ded to "25,000"
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
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