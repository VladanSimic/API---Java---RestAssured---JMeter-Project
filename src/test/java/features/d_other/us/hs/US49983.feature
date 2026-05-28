@US49983 @Iteration4
Feature: If a PURE Programs Home Surplus policy with Palomar is updated to indicate
  construction or renovation, an Underwriting Alert should trigger for Manager review.
  This applies once per endorsement or renewal transaction in NY, MA, SC, NC, and FL.

  Scenario: TC_1: HS FL - Verify when Palomar is carrier on NB, and on EN CC is selected, UW alert is triggered.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "529 Long Lake Dr"
    * I set "City_Name_Txt" to "Pensacola"
    * I set "Zip_Code" to "32506"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I am logged in to Pure as "P82"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI



  Scenario: TC_2: HS FL - Verify when Palomar is carrier on NB, and on RN CC is selected, UW alert is triggered.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "529 Long Lake Dr"
    * I set "City_Name_Txt" to "Pensacola"
    * I set "Zip_Code" to "32506"
    * I set "Effective_Date" to "03/01/2025"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I am logged in to Pure as "P83"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I navigate to transactions or endorsements

    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI


  Scenario: TC_3: HS MA - Verify when Palomar is carrier on NB, and on EN CC is selected, UW alert is triggered.


    Given I use "MA_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "City_Name_Txt" to "Abington"


    * I am logged in to Pure as "P83"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I think for 10 to 15 seconds
    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI


  Scenario: TC_4: HS MA - Verify when Palomar is carrier on NB, and on RN CC is selected, UW alert is triggered.

    Given I use "MA_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "400000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "City_Name_Txt" to "Abington"


    * I am logged in to Pure as "P84"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    * I rate a quote
    Then I bind a quote
    * I select created policy


    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page

    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI


  Scenario: TC_5: HS NC - Verify when Palomar is carrier on NB, and on EN CC is selected, UW alert is triggered.

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    * I am logged in to Pure as "P85"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I think for 10 to 15 seconds
    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI

  Scenario: TC_6: HS NC - Verify when Palomar is carrier on NB, and on RN CC is selected, UW alert is triggered.

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "400000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"


    * I am logged in to Pure as "P86"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI

  Scenario Outline: TC_7: HS NY - Verify when Palomar is carrier on NB, and on EN CC is selected, UW alert is triggered.

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"

    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy
    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI


    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P84  | 410 Fishel Avenue    | Riverhead   | 11901 |

  Scenario Outline: TC_8: HS NY  - Verify when Palomar is carrier on NB, and on RN CC is selected, UW alert is triggered.

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set "Effective_Date" to "03/01/2025"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"

    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I navigate to transactions or endorsements

    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI


    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P85  | 410 Fishel Avenue    | Riverhead   | 11901 |

  Scenario: TC_9: HS SC - Verify when Palomar is carrier on NB, and on EN CC is selected, UW alert is triggered.

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    * I am logged in to Pure as "P87"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI


  Scenario: TC_10: HS SC - Verify when Palomar is carrier on NB, and on RN CC is selected, UW alert is triggered.

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "400000"
    * I set "Risk_Addresses_Loss_Of_Use" to "40000"


    * I am logged in to Pure as "P88"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I navigate to transactions or endorsements

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI


  Scenario: TC_11: HS FL - Verify when Palomar is carrier on NB, when UW alert is overridden on EN, it should not trigger on RN

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "529 Long Lake Dr"
    * I set "City_Name_Txt" to "Pensacola"
    * I set "Zip_Code" to "32506"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I am logged in to Pure as "P89"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"


    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI
    * I accept underwriting referrals
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Not Displayed" on the UI


  Scenario: TC_12: HS MA - Verify when Palomar is carrier on NB, when UW alert is overridden on EN, it should not trigger on RN


    Given I use "MA_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "City_Name_Txt" to "Abington"


    * I am logged in to Pure as "P90"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"
    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI
    * I accept underwriting referrals
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Not Displayed" on the UI


  Scenario: TC_13: HS NC - Verify when Palomar is carrier on NB, when UW alert is overridden on EN, it should not trigger on RN

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    * I am logged in to Pure as "P91"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I think for 10 to 15 seconds
    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI
    * I accept underwriting referrals
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Not Displayed" on the UI


  Scenario Outline: TC_14: HS NY - Verify when Palomar is carrier on NB, when UW alert is overridden on EN, it should not trigger on RN

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"

    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI
    * I accept underwriting referrals
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Not Displayed" on the UI


    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P84  | 410 Fishel Avenue    | Riverhead   | 11901 |

  Scenario: TC_15: HS SC - Verify when Palomar is carrier on NB, when UW alert is overridden on EN, it should not trigger on RN

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    * I am logged in to Pure as "P93"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I navigate to location page
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I write text to "How long will the member be out of the residence due to the work?" and value is "30 days or less"
    * I write text to "What is the cost of the planned work?" and value is "10000"

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Displayed" on the UI
    * I accept underwriting referrals
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "COC is selected as a risk characteristic on this transaction. Please refer to management for consideration." is "Not Displayed" on the UI
