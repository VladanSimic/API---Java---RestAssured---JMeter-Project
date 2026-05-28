@HomeownersSurplus @US51353 @RenewalAutomation @JuneRelease
Feature: HS FL - Renewal Automation - Implementation of transitional capping logic

  @US51353
  Scenario Outline: TC_01 FL_001 NFM | Verify that Automated Renewal returns transition factor when premium is below 10% from previous transaction (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "3000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

#    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.80" and "1.30"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US51353
  Scenario Outline: TC_01 FL_001 Palomar | Verify that  Automated Renewal returns transition factor when premium is below 10% from previous transaction (Palomar) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2012"
    * I set "Wind_Mitigation_Roof_Covering" to "Wood Shake"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "3000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
#    When I navigate to location page
#    * I write text to "Distance to Coast override" and value is "<DTC>"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.80" and "1.30"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US51353
  Scenario Outline: TC_01 FL_001 PSE | Verify that  Automated Renewal returns transition factor when premium is below 10% from previous transaction (PSE) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "3000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.80" and "1.30"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US51353
  Scenario Outline: TC_01 FL_001 ASIC | Verify that Automated Renewal returns transition factor when premium is below 10% from previous transaction (Accredited) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "3000"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.80" and "1.30"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US51353
  Scenario Outline: TC_02 FL_001 NFM | Verify that Automated Renewal returns transition factor when premium is below 10% from previous transaction (NFM) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "3000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.80" and "1.30"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US51353
  Scenario Outline: TC_02 FL_001 Palomar |  Verify that Automated Renewal returns transition factor when premium is below 10% from previous transaction (Palomar) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"

    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "3000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page
    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.80" and "1.90"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US51353
  Scenario Outline: TC_02 FL_001 PSE |  Verify that  Automated Renewal returns transition factor when premium is below 10% from previous transaction (PSE) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "3000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
#    When I navigate to location page
#    * I write text to "Distance to Coast override" and value is "<DTC>"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.80" and "1.90"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US51353
  Scenario Outline: TC_02 FL_001 ASIC |  Verify that  Automated Renewal returns transition factor when premium is below 10% from previous transaction (Accredited) - Condo-Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Contents" to "4700000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "3000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Accredited Specialty Insurance Company"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.80" and "1.30"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US51353
  Scenario Outline: TC_03 FL_001 NFM | Verify that  Automated Renewal returns transition factor when premium is 15% higher from previous transaction (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "-6000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"
    * I write text to "Distance to Coast override" and value is "<DTC>"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.20" and "1.20"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US51353
  Scenario Outline: TC_03 FL_001 Palomar | Verify that  Automated Renewal returns transition factor when premium is 15% higher from previous transaction (Palomar) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2012"
    * I set "Wind_Mitigation_Roof_Covering" to "Wood Shake"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "-6000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
#    When I navigate to location page
#    * I write text to "Distance to Coast override" and value is "<DTC>"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.50" and "1.50"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US51353
  Scenario Outline: TC_03 FL_001 PSE | Verify that  Automated Renewal returns transition factor when premium is 15% higher from previous transaction (PSE) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "-7000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.20" and "1.20"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US51353
  Scenario Outline: TC_03 FL_001 ASIC | Verify that  Automated Renewal returns transition factor when premium is 15% higher from previous transaction (Accredited) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "-6000"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.20" and "1.20"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US51353
  Scenario Outline: TC_04 FL_001 NFM | Verify that  Automated Renewal returns transition factor when premium is 15% higher from previous transaction (NFM) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Risk_Addresses_Contents" to "3500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "-8000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.20" and "1.20"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US51353
  Scenario Outline: TC_04 FL_001 Palomar | Verify that  Automated Renewal returns transition factor when premium is 15% higher from previous transaction (Palomar) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Contents" to "4000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "-8000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.20" and "1.20"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US51353
  Scenario Outline: TC_04 FL_001 PSE | Verify that  Automated Renewal returns transition factor when premium is 15% higher from previous transaction (PSE) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today


    * I set "Risk_Addresses_Contents" to "4500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "-8000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
#    When I navigate to location page
#    * I write text to "Distance to Coast override" and value is "<DTC>"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.20" and "1.20"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US51353
  Scenario Outline: TC_04 FL_001 ASIC | Verify that  Automated Renewal returns transition factor when premium is 15% higher from previous transaction (Accredited) - Condo-Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date to Today

    * I set "Risk_Addresses_Contents" to "4700000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "-8000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.20" and "1.20"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US51353
  Scenario Outline: TC_05 FL_001 NFM | Verify the correct factor is populated in the Additional rate Guidance field.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "3000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"
    * I write text to "Distance to Coast override" and value is "<DTC>"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "Application" page
    * I get current object ID for sql query

    * I navigate to "ROL and Premium Information" page

    * I execute the query and compare xml result
      | query    | column               | attributeName                               | fieldName                |
      | coherent | RESPONSE_XML_PAYLOAD | Rating Input ROL - Additional Rate Guidance | Additional Rate Guidance |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US51353
  Scenario Outline: TC_06 FL_001 ASIC | Verify that  Automated Renewal returns transition factor when premium is 15% higher from previous NB RWT transaction

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_003"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "-8000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy

    Then I navigate to transactions or endorsements

    #     #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I override subjectivities for New Business Rewrite transaction

    Then I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

   #    TODO Remove once rating is deployed
    * I navigate to policy image page

    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to underwriting alerts tab
    * I navigate to policy image page

    * I navigate to "ROL and Premium Information" page

    * I verify if element with message "Additional Rate Guidance" is "Displayed" on the UI

    And I verify field "Additional Rate Guidance" has a value between "0.50" and "1.50"

    * I compare "Additional Rate Guidance" factor on "ROL and Premium Information" page after re-rating for "Renewal" transaction


    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

