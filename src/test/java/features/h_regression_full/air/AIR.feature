@FullRegression @Integration @HS @HomeSurplus
Feature: AIR/RMS FL HomeSurplus Suite
  As a user I should be able to verify AIR and RMS Integration on Florida HS NB/END/RN

  @AIR
  Scenario: AIR FL - NB/END/RN

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P74" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "1215 NW 7th Ave"
    * I set "City_Name_Txt" to "Florida City"
    * I set "State" to "FL"
    * I set "Zip_Code" to "33034"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated for Large Missiles"
    * I set "Construction_Details_Distance_To_Coast" to "< 1000 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "AIR"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "AIR"

    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "AIR"
    And I fill out HS quote application page

    * I review changes
    * I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

  @AIR
  Scenario: AIR FL - OOS Endorsement

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P74" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "1215 NW 7th Ave"
    * I set "City_Name_Txt" to "Florida City"
    * I set "State" to "FL"
    * I set "Zip_Code" to "33034"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated for Large Missiles"
    * I set "Construction_Details_Distance_To_Coast" to "< 1000 ft"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "AIR"
    * I insert Risk Model "AIR" information into "NB" data

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

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "AIR"
    * I read Risk Model "AIR" information from "NB" trx data and check if it's "not same"

    And I fill out HS quote application page
    * I review changes
    * I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

    And I navigate to transactions or endorsements
    And I initiate new oos endorsement 4 months ahead

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "AIR"
    * I read Risk Model "AIR" information from "NB" trx data and check if it's "same"

    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    And I select a transaction "Renewal"
    Then I navigate to policy image page
    * I expand node tree if needed
    * I navigate to Location Details Page

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "AIR"

  @RMS
  Scenario: RMS FL - NB/END/RN

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P75" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "1215 NW 7th Ave"
    * I set "City_Name_Txt" to "Florida City"
    * I set "State" to "FL"
    * I set "Zip_Code" to "33034"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Construction_Details_Year_Built" to "2021"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"

    * I review changes
    * I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

  @RMS @OOS
  Scenario: RMS FL - OOS Endorsement

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P75" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "1215 NW 7th Ave"
    * I set "City_Name_Txt" to "Florida City"
    * I set "State" to "FL"
    * I set "Zip_Code" to "33034"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Construction_Details_Year_Built" to "2021"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to "Risk Model Information" page through the Tree
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

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
    * I read Risk Model "RMS" information from "NB" trx data and check if it's "not same"

    * I review changes
    * I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

    Then I initiate new oos endorsement 4 months ahead

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
    * I read Risk Model "RMS" information from "NB" trx data and check if it's "same"

    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    And I select a transaction "Renewal"
    Then I navigate to policy image page
    * I expand node tree if needed
    * I navigate to Location Details Page

    When I navigate to "Risk Model Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS"
