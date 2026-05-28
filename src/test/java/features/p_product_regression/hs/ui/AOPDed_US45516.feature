@PCRegression @US45516 @US @FL @HS @HomeSurplus @UI @2024 @December
Feature: US45516 - Florida HS (All Carriers) - Remove N/A - Wind Only AOP option

  @Homeowner @NB @NewBusiness @END @Endorsement @RN @Renewal
  Scenario: FL HS - National Fire and Marine
    NB/END/RN

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "11/09/2024"
    * I set "Endorsement_Effective_Date_END" to "11/10/2024"
    * I set "Risk_Addresses_Loss_Of_Use" to "50000"
    * I set "Risk_Addresses_Replacement_Cost" to "3250000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I set the residence type to "Homeowner"
    * I set risk address 0 replacement cost to "3250000"
    * I click on the footer
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    And I create a new "HS" quote
    Then I navigate to Home Surplus Lines Policy Page
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I think for 5 to 10 seconds
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Then I create a renewal
    And I navigate to policy image page
    * I think for 5 to 10 seconds
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I fill out HS quote application page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Homeowner @Condo @Coop @Override @PreProd
  Scenario: FL HS - Override on quote level to all carriers Homeowner and Condo/Co-op

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Safety Specialty Ins."
    * I set "Effective_Date" to "11/09/2024"
    * I set "Risk_Addresses_Replacement_Cost" to "3250000"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Risk_Addresses_Contents" to "3250000"
    * I set "Risk_Addresses_Loss_Of_Use" to "20000"
    * I set "Construction_Details_The_Floor_On_Which_The_Risk_Is_Located" to "2"
    And I navigate to quotes page
    Then I initiate a new quote
    And I check the manager override "Yes"
    * I set underwriting company to "Safety Specialty Ins."
    And I set the residence type to "Homeowner"
    * I set risk address 0 replacement cost to "3250000"
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I set underwriting company to "National Fire & Marine Insurance Company"
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I set underwriting company to "Accredited Specialty Insurance Company"
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I set underwriting company to "Palomar Excess and Surplus Insurance Company"
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I set underwriting company to "PURE Specialty Exchange"
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    And I set the residence type to "Condo/Co-op"
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I set underwriting company to "National Fire & Marine Insurance Company"
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I set underwriting company to "Accredited Specialty Insurance Company"
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I set underwriting company to "Palomar Excess and Surplus Insurance Company"
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I set underwriting company to "Safety Specialty Ins."
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I click save changes button
    And I create a new "HS" quote
    * I navigate to Optional Coverages Page
    * I set Include Excess Flood Coverage to "No"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

  @Homeowner @PreProd @RC @RenewalConversion
  Scenario: FL HS - Renewal Conversion National Fire & Marine Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "11/19/2023"
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "20000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I set the residence type to "Homeowner"
    * I set risk address 0 replacement cost to "5000000"
    * I click on the footer
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 13
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
      | N/A - Wind Only  |
    And I create a new "HS" quote
    Then I navigate to Home Surplus Lines Policy Page
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 13
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
      | N/A - Wind Only  |
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    Then I create a renewal
    And I navigate to policy image page
    * I think for 5 to 10 seconds
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I fill out HS quote application page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Homeowner @PreProd @RC @RenewalConversion
  Scenario: FL HS - Renewal Conversion PSE Condo

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "3250000"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Risk_Addresses_Contents" to "3250000"
    * I set "Risk_Addresses_Loss_Of_Use" to "20000"
    * I set "Construction_Details_The_Floor_On_Which_The_Risk_Is_Located" to "2"
    * I set "Effective_Date" to "11/19/2023"
    And I navigate to quotes page
    Then I initiate a new quote
    And I set the residence type to "Condo/Co-op"
    * I set the contents to "3250000"
    * I click on the footer
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 13
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
      | N/A - Wind Only  |
    And I create a new "HS" quote
    Then I navigate to Home Surplus Lines Policy Page
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 13
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
      | N/A - Wind Only  |
    * I navigate to Optional Coverages Page
    * I set Include Excess Flood Coverage to "No"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    Then I create a renewal
    And I navigate to policy image page
    * I think for 5 to 10 seconds
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I fill out HS quote application page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Homeowner @PreProdNew @RC @RenewalConversion
  Scenario: FL HS - National Fire and Marine PreProd

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "11/09/2024"
    * I set "Endorsement_Effective_Date_END" to "11/10/2024"
    * I set "Risk_Addresses_Loss_Of_Use" to "50000"
    * I set "Risk_Addresses_Replacement_Cost" to "3250000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I set the residence type to "Homeowner"
    * I set risk address 0 replacement cost to "3250000"
    * I click on the footer
    * I click save changes button
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    And I create a new "HS" quote
    Then I navigate to Home Surplus Lines Policy Page
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I think for 5 to 10 seconds
    * I click on the footer
    * I click risk address 0 AOP Ded cell
    Then I verify dropdown size is 12
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement
