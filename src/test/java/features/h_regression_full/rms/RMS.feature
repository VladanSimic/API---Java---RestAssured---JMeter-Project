@FullRegression @Integration @HS @HomeSurplus @RMS
Feature: RMS TX/HI HomeSurplus Suite
  As a user I should be able to verify RMS Integration on Texas and Hawaii HS on NB/END/RN

  @TX  @Transactions @END @RN
  Scenario: RMS Report - Texas - NB/END/RN

    Given I use "TX_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P75" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "18026 Shaman Road"
    * I set "City_Name_Txt" to "Galveston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77554"
    * I set "Risk_Addresses_Replacement_Cost" to "6000000"
    * I set "Risk_Addresses_Hurricane_Deductible" to "10%"
    * I set "Construction_Details_Year_Built" to "2010"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I review changes
    * I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

  @TX @NB
  Scenario: RMS Report - Texas - New Business

    Given I use "TX_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P75" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "18026 Shaman Road"
    * I set "City_Name_Txt" to "Galveston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77554"
    * I set "Risk_Addresses_Replacement_Cost" to "6000000"
    * I set "Risk_Addresses_Hurricane_Deductible" to "10%"
    * I set "Construction_Details_Year_Built" to "2010"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote

  @TX @OOS
  Scenario: RMS Report - Texas - OOS Endorsement

    Given I use "TX_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P75" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "18026 Shaman Road"
    * I set "City_Name_Txt" to "Galveston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77554"
    * I set "Risk_Addresses_Replacement_Cost" to "6000000"
    * I set "Risk_Addresses_Hurricane_Deductible" to "10%"
    * I set "Construction_Details_Year_Built" to "2010"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
    * I insert Risk Model "RMS" information into "NB" data

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I review changes
    * I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

    And I navigate to transactions or endorsements
    And I initiate new oos endorsement 4 months ahead

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
    * I read Risk Model "RMS" information from "NB" trx data and check if it's "same"

    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    And I select a transaction "Renewal"
    Then I navigate to policy image page
    * I expand node tree if needed
    * I navigate to Location Details Page

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
    * I read Risk Model "RMS" information from "NB" trx data and check if it's "not same"


  @HI @NB
  Scenario: RMS Report - Hawaii - New Business

    Given I use "HI_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P75" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "7000 Hawaii Kai Dr"
    * I set "City_Name_Txt" to "Honolulu"
    * I set "State" to "HI"
    * I set "Zip_Code" to "96825"
    * I set "Risk_Addresses_Replacement_Cost" to "6000000"
    * I set "Risk_Addresses_Hurricane_Deductible" to "10%"
    * I set "Construction_Details_Year_Built" to "2010"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote

  @HI @Transactions @END @RN
  Scenario: RMS Report - Hawaii - NB/END/RN

    Given I use "HI_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P75" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "7000 Hawaii Kai Dr"
    * I set "City_Name_Txt" to "Honolulu"
    * I set "State" to "HI"
    * I set "Zip_Code" to "96825"
    * I set "Risk_Addresses_Replacement_Cost" to "6000000"
    * I set "Risk_Addresses_Hurricane_Deductible" to "10%"
    * I set "Construction_Details_Year_Built" to "2010"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I review changes
    * I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

  @HI @OOS
  Scenario: RMS Report - Hawaii - OOS Endorsement

    Given I use "HI_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P75" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "7000 Hawaii Kai Dr"
    * I set "City_Name_Txt" to "Honolulu"
    * I set "State" to "HI"
    * I set "Zip_Code" to "96825"
    * I set "Risk_Addresses_Replacement_Cost" to "6000000"
    * I set "Risk_Addresses_Hurricane_Deductible" to "10%"
    * I set "Construction_Details_Year_Built" to "2010"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
    * I insert Risk Model "RMS" information into "NB" data

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
    * I read Risk Model "RMS" information from "NB" trx data and check if it's "not same"

    * I review changes
    * I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

    And I navigate to transactions or endorsements
    And I initiate new oos endorsement 4 months ahead

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
    * I read Risk Model "RMS" information from "NB" trx data and check if it's "same"

    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    And I select a transaction "Renewal"
    Then I navigate to policy image page
    * I expand node tree if needed
    * I navigate to Location Details Page

    And I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
    * I read Risk Model "RMS" information from "NB" trx data and check if it's "not same"