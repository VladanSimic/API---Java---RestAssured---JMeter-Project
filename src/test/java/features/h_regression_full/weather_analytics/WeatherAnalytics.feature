@FullRegression @Integration @Weather @WeatherAnalytics
Feature: Weather Analytics - Homeowners and HomeSurplus
  As a user I should be able to verify Weather Analytics for HO and HS on all transactions

  @HO @Homeowner @TX @NB
  Scenario: Weather Analytics - Homeowners - New Business

    Given I use "TX_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P76" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "12818 Green River Dr"
    * I set "City_Name_Txt" to "Houston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77044"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    When I navigate to Location Details Page
    Then I verify that Weather Analytics is pulled

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "10955 County Road 302"
    * I set risk address 1 city to "Rockdale"
    * I set risk address 1 state to "TX"
    * I set risk address 1 zip to "76567"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "9000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click order property details button
    * I set "Address_Line_1_Txt" to "10955 County Road 302"
    * I set "City_Name_Txt" to "Rockdale"
    * I set "Zip_Code" to "76567"
    * I set "State" to "TX"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I verify that Weather Analytics is pulled

    Then I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

  @HO @Homeowner @TX @END
  Scenario: Weather Analytics - Homeowners new location on Endorsement

    Given I use "TX_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P76" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "12818 Green River Dr"
    * I set "City_Name_Txt" to "Houston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77044"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    When I navigate to Location Details Page
    Then I verify that Weather Analytics is pulled
    * I insert Weather Analytics information into "NB" data

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I read Weather Analytics information from "NB" trx data and check if it's "same" for location

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "10955 County Road 302"
    * I set risk address 1 city to "Rockdale"
    * I set risk address 1 state to "TX"
    * I set risk address 1 zip to "76567"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "9000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click order property details button
    * I set "Address_Line_1_Txt" to "10955 County Road 302"
    * I set "City_Name_Txt" to "Rockdale"
    * I set "Zip_Code" to "76567"
    * I set "State" to "TX"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I verify that Weather Analytics is pulled

    Then I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page


    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

  @HO @Homeowner @TX @OOS
  Scenario: Weather Analytics - Homeowners - OOS Endorsement

    Given I use "TX_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P78" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "12818 Green River Dr"
    * I set "City_Name_Txt" to "Houston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77044"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    When I navigate to Location Details Page
    Then I verify that Weather Analytics is pulled
    * I insert Weather Analytics information into "NB" data

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    Then I create a renewal
    * I navigate to policy image page

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

    And I initiate new oos endorsement 4 months ahead
    Then I read Weather Analytics information from "NB" trx data and check if it's "same" for location

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "10955 County Road 302"
    * I set risk address 1 city to "Rockdale"
    * I set risk address 1 state to "TX"
    * I set risk address 1 zip to "76567"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "9000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click order property details button
    * I set "Address_Line_1_Txt" to "10955 County Road 302"
    * I set "City_Name_Txt" to "Rockdale"
    * I set "Zip_Code" to "76567"
    * I set "State" to "TX"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I verify that Weather Analytics is pulled
    * I insert Weather Analytics information into "OOS" data

    Then I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I select a transaction "Renewal"
    Then I navigate to policy image page
    * I expand node tree if needed
    * I read Weather Analytics information from "OOS" trx data and check if it's "same" for location

    And I set "City_Name_Txt" to "Houston"
    Then I set "State" to "TX"
    * I read Weather Analytics information from "NB" trx data and check if it's "same" for location

  @HO @Homeowner @TX @RN @Renewal
  Scenario: Weather Analytics - Homeowners all residence types - No re-pull on Renewal

    Given I use "TX_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P76" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "12818 Green River Dr"
    * I set "City_Name_Txt" to "Houston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77044"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    When I navigate to Location Details Page
    Then I verify that Weather Analytics is pulled
    * I insert Weather Analytics information into "NB" data

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "10955 County Road 302"
    * I set risk address 1 city to "Rockdale"
    * I set risk address 1 state to "TX"
    * I set risk address 1 zip to "76567"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "9000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click order property details button
    * I set "Address_Line_1_Txt" to "10955 County Road 302"
    * I set "City_Name_Txt" to "Rockdale"
    * I set "Zip_Code" to "76567"
    * I set "State" to "TX"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I verify that Weather Analytics is pulled
    * I insert Weather Analytics information into "NB" data

    Then I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Then I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    And I read Weather Analytics information from "NB" trx data and check if it's "same" for location

    Then I set "City_Name_Txt" to "Houston"
    * I set "State" to "TX"
    * I read Weather Analytics information from "NB" trx data and check if it's "same" for location

    And I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @HS @Homeowner @END @RN @Renewal @HomeSurplus
  Scenario: Weather Analytics - Home Surplus new location on Endorsement - NB/END/RN

    Given I use "TX_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P76" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "12818 Green River Dr"
    * I set "City_Name_Txt" to "Houston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77044"
    * I set "Collections_Add_CO_To_Home_Policy" to "No"
    * I set "Collections_Worldwide_Jewelry" to "No"
    * I set "Collections_Bank_Vaulted_Jewelry" to "No"
    * I set "Collections_Fine_Arts" to "No"
    * I set "Collections_Collectibles" to "No"
    * I set "Collections_CSSFMI" to "No"
    * I set "Collections_Wine" to "No"
    * I set "Collections_Miscellaneous_Valuable_Items" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to Location Details Page
    Then I verify that Weather Analytics is pulled
    * I insert Weather Analytics information into "NB" data

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I read Weather Analytics information from "NB" trx data and check if it's "same" for location
    Then I click Refresh Hail Assessment button
    * I insert Weather Analytics information into "END" data

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I create a renewal
    Then I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    And I read Weather Analytics information from "END" trx data and check if it's "same" for location

  @HS @Homeowner @END @RN @Renewal @HomeSurplus
  Scenario: Weather Analytics - Home Surplus - OOS

    Given I use "TX_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P76" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "12818 Green River Dr"
    * I set "City_Name_Txt" to "Houston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77044"
    * I set "Collections_Add_CO_To_Home_Policy" to "No"
    * I set "Collections_Worldwide_Jewelry" to "No"
    * I set "Collections_Bank_Vaulted_Jewelry" to "No"
    * I set "Collections_Fine_Arts" to "No"
    * I set "Collections_Collectibles" to "No"
    * I set "Collections_CSSFMI" to "No"
    * I set "Collections_Wine" to "No"
    * I set "Collections_Miscellaneous_Valuable_Items" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HS" quote

    When I navigate to Location Details Page
    Then I verify that Weather Analytics is pulled
    * I insert Weather Analytics information into "NB" data

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Then I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page

    Then I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    And I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I process a renewal

    Then I initiate new oos endorsement 4 months ahead
    And I read Weather Analytics information from "NB" trx data and check if it's "same" for location
    Then I click Refresh Hail Assessment button
    * I insert Weather Analytics information into "OOS" data

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I select a transaction "Renewal"
    Then I navigate to policy image page
    * I expand node tree if needed
    And I read Weather Analytics information from "OOS" trx data and check if it's "same" for location


  @NB @NewBusiness @Agent @HO @Homeowners
  Scenario: Weather Analytics - Agent - Refresh Button not displayed
  As a user I should be able to verify that Refresh Button is not displayed for Agent

    Given I use "TX_001" smoke test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "Agent1" unless is PROD then "A17"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "12818 Green River Dr"
    * I set "City_Name_Txt" to "Houston"
    * I set "State" to "TX"
    * I set "Zip_Code" to "77044"

    And I click new quote button
    Then I fill out the quote basic information page
    And I fill out HO quote cover page

    Then I navigate to Location Details Page
    And I verify that Hail Assessment Refresh button is "not displayed"

