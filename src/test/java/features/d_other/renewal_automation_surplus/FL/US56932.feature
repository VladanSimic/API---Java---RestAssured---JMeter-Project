@HomeownersSurplus @US56932 @RenewalAutomation @UI @ProgramsRequiredForms
Feature: HS FL - Renewal Automation - Programs Required Forms UI - Renewal Offers should only be listed


  @US56932
  Scenario:TC_01 | Verify that the new block "renewal: product specific forms to include in signature" is visible, and that the table is displaying correct values after 3 Renewal Offers Generated - broker
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "5240 Kim Court"
    * I set "City_Name_Txt" to "West Palm Beach"
    * I set "Zip_Code" to "33414"

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 310 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Mirjana Nikolic"
    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Mirjana Nikolic"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I am logged in to Pure as "P1"

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"
    * I write text to "Distance to Coast override" and value is "> 5 miles"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    And I navigate to policy
    * I navigate to transactions or endorsements
    Then I create a renewal

    * I go to summary and click update renewal
    And I review changes
    Then I click renewed premium
    * I think for 5 to 10 seconds
    And I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 5 to 10 seconds

    Then I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 40 times

    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    Then I select a transaction "Renewal"

    Then I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI

    * I navigate to premium summary page
    * I click send renewal offer button
    * I think for 15 to 20 seconds

    * I navigate to premium summary page
    * I click send renewal offer button
    * I think for 15 to 20 seconds

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I navigate to Home
    * I think for 5 to 10 seconds
    And I logout

    Then I am logged in to Pure as "Agent2"
    And I navigate to customers page
    * I select customer by ID
    * I verify that "programs required forms" tab is between "required forms" and "documents"
    * I think for 5 to 6 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "renewal: product specific forms to include in signature" exists

    Then I verify product specific forms to include block
      | select   | product                      | policyNumber  | term | effectiveDate  | premium | status                 | renewalForms                               |
      | checkbox | Home Surplus Lines - Florida | Policy Number | 1    | Effective Date | Premium | PolicyTransactionRated | Home Surplus Lines Package - Renewal Offer, Bind Request |


  @US56932
  Scenario:TC_02 | Verify that the new block "renewal: product specific forms to include in signature" is visible, and that the table is displaying correct values after 3 Renewal Offers Generated - Internal users
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "5240 Kim Court"
    * I set "City_Name_Txt" to "West Palm Beach"
    * I set "Zip_Code" to "33414"

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 310 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Mirjana Nikolic"
    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Mirjana Nikolic"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I am logged in to Pure as "P1"

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"
    * I write text to "Distance to Coast override" and value is "> 5 miles"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    And I navigate to policy
    * I navigate to transactions or endorsements
    Then I create a renewal

    * I go to summary and click update renewal
    And I review changes
    Then I click renewed premium
    * I think for 5 to 10 seconds
    And I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 5 to 10 seconds

    Then I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 40 times

    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    Then I select a transaction "Renewal"

    Then I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI

    * I navigate to premium summary page
    * I click send renewal offer button
    * I think for 15 to 20 seconds

    * I navigate to premium summary page
    * I click send renewal offer button
    * I think for 15 to 20 seconds

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    * I verify that "programs required forms" tab is between "required forms" and "documents"

    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "renewal: product specific forms to include in signature" exists


    Then I verify product specific forms to include block
      | select   | product                      | policyNumber  | term | effectiveDate  | premium | status                 | renewalForms                                                                                     |
      | checkbox | Home Surplus Lines - Florida | Policy Number | 1    | Effective Date | Premium | PolicyTransactionRated | Home Surplus Lines Package - Renewal Offer, Bind Request |
