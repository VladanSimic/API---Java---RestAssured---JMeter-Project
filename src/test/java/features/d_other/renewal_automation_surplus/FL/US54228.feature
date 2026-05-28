@HomeownersSurplus @US54228 @JuneRelease
Feature: HS FL - Renewal Automation - Adding UW flag on ROL & Premium summary tab

  @HS @US54228
  Scenario Outline: TC_1: HS FL - Verify UW flag checkbox is present on ROL & Premium summary tab for NB / END/ RNW transactions

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I think for 10 to 15 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "unchecked"

    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 7 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "unchecked"

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    * I approve uw referrals if visible and navigate back to policy image page

    * I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 7 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "unchecked"



    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
      | P2   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |

  @HS @US54228
  Scenario Outline: TC_2: HS FL -  Verify UW flag checkbox is present on ROL & Premium summary tab for NB RWT transaction transactions

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I think for 10 to 15 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "unchecked"

    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

#     #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I click save changes button
    * I think for 10 to 15 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "unchecked"
    * I review changes
    * I rate a quote
    * I complete rewrite transaction

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P3  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @HS @US54228
  Scenario Outline: TC_3: HS FL - Verify UW flag checkbox stays checked on END, and is unchecked on RNW transaction

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I think for 10 to 15 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I check checkbox field "Review at Renewal"
    * I click save changes button
    * I verify that "Review at Renewal" checkbox is "checked"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 7 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "checked"


    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    * I approve uw referrals if visible and navigate back to policy image page

    * I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 7 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "unchecked"

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
      | P4   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |


  @HS @US54228
  Scenario Outline: TC_4: HS FL - Verify UW flag checkbox can be selected on END transaction and will be unchecked on RN

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I think for 10 to 15 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "unchecked"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 7 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I check checkbox field "Review at Renewal"
    * I click save changes button
    * I verify that "Review at Renewal" checkbox is "checked"

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    * I approve uw referrals if visible and navigate back to policy image page

    * I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 7 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "unchecked"

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
      | P5   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |

  @HS @US54228 @Disabled
  Scenario Outline: TC_5: HS FL - Verify UW flag checkbox that was selected on NB triggers a referral on Renewal

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I think for 10 to 15 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I check checkbox field "Review at Renewal"
    * I click save changes button
    * I verify that "Review at Renewal" checkbox is "checked"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    And I navigate to transactions or endorsements

    * I create a renewal
    * I navigate to policy image page

    * I approve uw referrals if visible and navigate back to policy image page

    * I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 7 seconds
    * I navigate to "ROL and Premium Information" page
    * I think for 5 to 7 seconds
    * I should see exactly 1 visible input fields for "Review at Renewal"
    * I verify that "Review at Renewal" checkbox is "unchecked"
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "Review Required on Renewal" is "Displayed" on the UI


    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
      | P6   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |