@FullRegression @CLUE @Home @HomeClue @HomeCLUE @Integration
Feature: Home CLUE
  As a user I should be able to verify Homeowners CLUE on all transactions and residence types

  @Homeowners @HO @Homeowner @NoLosses
  Scenario: Home CLUE - No Losses on quote level

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "123 6th St 1B"
    * I set "City_Name_Txt" to "Pelham"
    * I set "State" to "NY"
    * I set "Zip_Code" to "10803"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    Then I verify that newest Home CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Homeowners @HO @Homeowner @Losses @Claims
  Scenario: Home CLUE - With Claims on quote level

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "41 Ashdown Road"
    * I set "City_Name_Txt" to "Ballston Lake"
    * I set "State" to "NY"
    * I set "Zip_Code" to "12019"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    * I assign claims to location
    Then I verify that newest Home CLUE returned status "with claims"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Homeowners @HO @Homeowner @NoLosses
  Scenario: Home CLUE - Endorsement Additional Location - No Claims

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Address_Line_1_Txt" to "2062 Cedarlawn Avenue"
    * I set "City_Name_Txt" to "Rotterdam"
    * I set "State" to "NY"
    * I set "Zip_Code" to "12306"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I accept underwriting referrals
    And I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "123 6th St 1B"
    * I set risk address 1 city to "Pelham"
    * I set risk address 1 state to "NY"
    * I set risk address 1 zip to "10803"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "6000000"
    * I click on the footer
    * I click order property details button
    Then I set "Address_Line_1_Txt" to "123 6th St 1B"
    * I set "City_Name_Txt" to "Pelham"
    * I set "State" to "NY"
    * I set "Zip_Code" to "10803"

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    Then I verify that newest Home CLUE returned status "clean"

  @Homeowners @HO @Homeowner @DifferentAddress @Override
  Scenario: Home CLUE - Address override

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "123 6th St 1B"
    * I set "City_Name_Txt" to "Pelham"
    * I set "State" to "NY"
    * I set "Zip_Code" to "10803"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    Then I verify that newest Home CLUE returned status "clean"

    And I add and verify different Home CLUE Address response status
      | addressLine1    | city          | state | zip   | responseStatus |
      | 41 Ashdown Road | Ballston Lake | NY    | 12019 | with claims    |

    Then I navigate to customer page
    And I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Homeowners @HO @Homeowner @Losses @Claims
  Scenario: Home CLUE - Verify that pulled losses are visible on Previous Claim/Losses page

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "41 Ashdown Road"
    * I set "City_Name_Txt" to "Ballston Lake"
    * I set "State" to "NY"
    * I set "Zip_Code" to "12019"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    * I assign claims to location
    Then I verify that newest Home CLUE returned status "with claims"
    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I think for 5 to 10 seconds

    When I navigate to "Previous Claim/Losses" page through the Tree
    Then I verify if CLUE Data is "returned" on previous claim losses page

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Homeowners @HO @Homeowner @NoLosses
  Scenario: Home CLUE - No Losses on quote level <= 30 days

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "123 6th St 1B"
    * I set "City_Name_Txt" to "Pelham"
    * I set "State" to "NY"
    * I set "Zip_Code" to "10803"
    * I set Effective Date 29 days in the past
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    Then I verify that newest Home CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Homeowners @HO @Homeowner @NoLosses
  Scenario: Home CLUE - No Losses on quote level > 30 days

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "123 6th St 1B"
    * I set "City_Name_Txt" to "Pelham"
    * I set "State" to "NY"
    * I set "Zip_Code" to "10803"
    * I set Effective Date 31 days in the future
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    Then I verify that newest Home CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Homeowners @HO @Homeowner @Losses @Claims
  Scenario: Home CLUE - Assign Unassigned Claims

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "41 Ashdown Road"
    * I set "City_Name_Txt" to "Ballston Lake"
    * I set "State" to "NY"
    * I set "Zip_Code" to "12019"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    * I set Home CLUE Claims status to "Do not Include - Unknown claim"
    Then I verify that newest Home CLUE returned status "with claims"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I think for 5 to 10 seconds

    When I navigate to "Previous Claim/Losses" page through the Tree
    Then I verify if CLUE Data is "not returned" on previous claim losses page

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I click assign CLUE claims on clue mvr page
    * I set Home CLUE Claims status to "Include"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I think for 5 to 10 seconds

    When I navigate to "Previous Claim/Losses" page through the Tree
    Then I verify if CLUE Data is "returned" on previous claim losses page

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Homeowners @HO @Homeowner @Agent
  Scenario: Home CLUE - Agent can't see CLUE/MVR Tab

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "Agent1" unless is PROD then "A17"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "41 Ashdown Road"
    * I set "City_Name_Txt" to "Ballston Lake"
    * I set "State" to "NY"
    * I set "Zip_Code" to "12019"
    And I click new quote button
    Then I fill out the quote basic information page

    Then I navigate to customer page
    And I verify that Clue MVR Tab is "not displayed"

  @HomeSurplus @HS @Homeowner @Losses @Claims
  Scenario: Home Surplus Lines CLUE - With Claims on quote level

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "41 Ashdown Road"
    * I set "City_Name_Txt" to "Ballston Lake"
    * I set "State" to "NY"
    * I set "Zip_Code" to "12019"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    * I assign claims to location
    Then I verify that newest Home CLUE returned status "with claims"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @COC @Homeowner @Losses @Claims
  Scenario: Course of Construction CLUE - With Claims on quote level

    Given I use "NY_001" regression test data from "QuoteCreatorCC" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "41 Ashdown Road"
    * I set "City_Name_Txt" to "Ballston Lake"
    * I set "State" to "NY"
    * I set "Zip_Code" to "12019"
    * I set "Project_Address_Risk_Address_1" to "41 Ashdown Road"
    * I set "Project_Address_City" to "Ballston Lake"
    * I set "Project_Address_ZIP" to "12019"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "CC" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run home CLUE
    * I assign claims to location
    Then I verify that newest Home CLUE returned status "with claims"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Homeowners @HO @Homeowner @NoLosses @Document @Upload
  Scenario: Home CLUE - Manually Upload And Verify Document

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "123 6th St 1B"
    * I set "City_Name_Txt" to "Pelham"
    * I set "State" to "NY"
    * I set "Zip_Code" to "10803"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    Then I upload and verify "Home CLUE" report document on clue mvr page

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

