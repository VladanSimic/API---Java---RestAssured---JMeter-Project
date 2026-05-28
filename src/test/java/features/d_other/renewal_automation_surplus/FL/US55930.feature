@HomeownersSurplus @US55930 @RenewalAutomation @UI @ProgramsRequiredForms
Feature: HS FL - Renewal Automation - Making programs required form tab Only Visible if Account has a HS FL policy


  @US55930 @Disabled
  Scenario:TC_01 | Verify that the new tab 'Programs Required Forms' tab is not Visible for Account that has PA policy
    Given I use "FL_001" regression test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set Effective Date to Today
    When I am logged in to Pure as "P5"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I create a renewal
    And I think for 30 to 45 seconds
    Then I navigate to policy image page
    And I review changes
    And I click renewed premium
    * I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I verify if element with message "programs required forms" is "Not Displayed" on the UI



  @US55930 @Disabled
  Scenario:TC_02 | Verify that the new tab 'Programs Required Forms' tab is not Visible for Account that has CO policy

    Given I use "FL_001" regression test data from "QuoteCreatorCO" sheet
    * I load random user data
    * I set Effective Date to Today
    When I am logged in to Pure as "P4"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I create a renewal
    And I think for 30 to 45 seconds
    Then I navigate to policy image page
    And I review changes
    And I click renewed premium
    * I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I verify if element with message "programs required forms" is "Not Displayed" on the UI

  @US55930 @Disabled
  Scenario:TC_03 | Verify that the new tab 'Programs Required Forms' tab is not Visible for Account that has CC policy


    Given I use "FL_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    When I am logged in to Pure as "P3"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote

    * I navigate to Location Details Page
    * I click order property details button
    * I think for 30 to 35 seconds
    * I verify if element with message "Debug Error Page" is "Not Displayed" on the UI
    Then I set the protection class to ""
    * I take screenshot

    * I think for 10 to 15 seconds
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    When I initiate a policy extension
    And I think for 30 to 45 seconds
    Then I navigate to policy image page
    And I review changes
    And I click renewed premium
    * I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I verify if element with message "programs required forms" is "Not Displayed" on the UI


  @US55930 @Disabled
  Scenario:TC_04 | Verify that the new tab 'Programs Required Forms' tab is not Visible for Account that has EX policy
    Given I use "FL_001" regression test data from "QuoteCreatorEX" sheet
    * I load random user data
    * I set Effective Date to Today
    When I am logged in to Pure as "P2"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements

    And I create a renewal
    And I think for 30 to 45 seconds
    Then I navigate to policy image page
    And I review changes
    And I click renewed premium
    * I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I verify if element with message "programs required forms" is "Not Displayed" on the UI

  @US55930 @Disabled
  Scenario:TC_05 | Verify that the new tab 'Programs Required Forms' tab is not Visible for Account that has ES policy
    Given I use "FL_001" regression test data from "QuoteCreatorES" sheet

    * I load random user data
    Then I set Effective Date to Today
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Advisor_Servicer_AWS_QA" to "Mirjana Nikolic"
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_STG" to "Mirjana Nikolic"

    * I set "Advisor_Servicer_PROD" to "Nemanja Pecic"

    When I am logged in to Pure as "P1"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "ES" quote

    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I select created policy

    And I navigate to transactions or endorsements

    And I create a renewal
    And I think for 30 to 45 seconds
    Then I navigate to policy image page
    Then I fill out ES quote application page
    And I review changes
    And I click renewed premium
    * I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I verify if element with message "programs required forms" is "Not Displayed" on the UI

  @US55930 @Disabled
  Scenario:TC_06 | Verify that the new tab 'Programs Required Forms' tab is not Visible for Account that has HO policy
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set Effective Date to Today
    * I am logged in to Pure as "P7"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements

    And I create a renewal
    And I think for 30 to 45 seconds
    Then I navigate to policy image page
    And I review changes
    And I click renewed premium
    * I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I verify if element with message "programs required forms" is "Not Displayed" on the UI


  @US55930 @Disabled
  Scenario:TC_07 | Verify that the new tab 'Programs Required Forms' tab is Visible for Account when HS FL policy is added to Account
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Mirjana Nikolic"
    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Mirjana Nikolic"

    * I load random user data
    * I set Effective Date to Today
    * I am logged in to Pure as "P7"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements

    And I create a renewal
    And I think for 30 to 45 seconds
    Then I navigate to policy image page
    And I review changes
    And I click renewed premium
    * I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I verify if element with message "programs required forms" is "Not Displayed" on the UI

    Then I click "new quote"
    And I write text to "Insurance Line" and value is "Home Surplus Lines"
    And I write text to "Risk State" and value is "FL"
    And I write text to "Quote Name" and value is "TabTest"
    * I select "No" for "Are you quoting only California, Hawaii or Massachusetts business or Maryland Homeowners? (No disclosure is required)" on ""
    * I select "Yes" for "Have you disclosed the use of consumer reports to your client?" on ""
    And I write text to "Licensed Producer" and value is "Nemanja Pecic"
    * I think for 5 to 10 seconds

    Then I click ">>> create quote"
    * I think for 15 to 20 seconds

    When I clear data

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    * I refresh DragonSteps data

    And I write text to "Address Line 1" and value is "1815 E West Pkwy"
    * I think for 3 to 5 seconds
    And I write text to "City" and value is "Fleming Island"
    * I think for 3 to 5 seconds
    And I write text to "State" and value is "FL"
    * I think for 3 to 5 seconds
    And I write text to "ZIP" and value is "32003"
    * I think for 3 to 5 seconds

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    Then I fill out HS quote cover page
    And I click save changes button
    * I think for 5 to 10 seconds

    Then I click "next red"
    And I fill out HS quote basic location coverage details page
    And I fill out HS quote optional coverages page
    And I fill out HS quote previous losses coverages page
    And I fill out HS quote member information page
    And I fill out HS quote application page

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I create a renewal
    * I think for 10 to 15 seconds
    Then I go to summary and click update renewal
    And I review changes
    And I click renewed premium

    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 10 to 11 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to customer summary page
    * I think for 5 to 10 seconds
    Then I verify if element with message "programs required forms" is "Displayed" on the UI

    * I verify that "programs required forms" tab is between "required forms" and "documents"

    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "signature preference" exists


