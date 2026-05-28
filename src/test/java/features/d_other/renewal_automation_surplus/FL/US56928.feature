@HomeownersSurplus @US56928 @RenewalAutomation
Feature: HS FL - Renewal Automation - Hide "Application and mandatory forms" and "documents" block on Application Tree Node in renewal transaction

  @HS @US56928
  Scenario Outline: TC_1: HS FL | Verify application and mandatory forms, and documents block are present on quote level.

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

    * I fill out HS quote cover page
    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Displayed" on the UI

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P2   | 529 Long Lake Dr | Pensacola | 32506 |     |

  @HS @US56928
  Scenario Outline: TC_2: HS FL | Verify application and mandatory forms, and documents block are present on endorsement transaction.

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

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Displayed" on the UI

    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Displayed" on the UI

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
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
      | user | AddressLine      | City      | Zip   | DTC |
      | P2   | 529 Long Lake Dr | Pensacola | 32506 |     |

  @HS @US56928
  Scenario Outline: TC_3: HS FL | Verify application and mandatory forms, and documents block are NOT present on renewal transaction.

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

    Then I navigate to "Application" page
    * I think for 5 to 7 seconds
    Then I navigate to "Application" page
    * I think for 5 to 7 seconds

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Displayed" on the UI

    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Displayed" on the UI

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    Then I issue an endorsement

    * I create a renewal
    * I navigate to policy image page

    * I approve uw referrals if visible and navigate back to policy image page

    Then I navigate to "Application" page
    * I think for 10 to 15 seconds
    Then I navigate to "Application" page

#    And I verify block "application and mandatory forms" exists
#    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Not Displayed" on the UI
    Then I verify if element with message "documents" is "Not Displayed" on the UI

    Then I verify if element with message "Document Type" is "Not Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Not Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Not Displayed" on the UI

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P2   | 529 Long Lake Dr | Pensacola | 32506 |     |

  @HS @US54228
  Scenario Outline: TC_4: HS FL | Verify application and mandatory forms, and documents block are present on NB RWT transaction

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

    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
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

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Displayed" on the UI

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P3   | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  Scenario Outline: Programs HS  "<TC_ID>" | Verify "Application and mandatory forms" and "documents" block are visible on "<TC_ID>" NB / EN / RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    Then I set Effective Date to Today
#    * I set Effective Date 290 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Advisor_Servicer_AWS_QA" to "Mirjana Nikolic"
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_STG" to "Mirjana Nikolic"

    * I set "Advisor_Servicer_PROD" to "Nemanja Pecic"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<yesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Displayed" on the UI

    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus
    * I select created policy

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Displayed" on the UI
    Then I verify if element with message "docusign documents" is "Not Displayed" on the UI

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "Statement of Diligent Effort" is "Displayed" on the UI
    Then I verify if element with message "docusign documents" is "Not Displayed" on the UI



    Examples:
      | TC_ID  | user | yesOrNo |
      | AZ_001 | P16  |         |
      | CO_001 | P15  |         |
      | MT_001 | P17  |         |
      | NC_001 | P10  |         |
      | UT_001 | P18  |         |
      | WY_001 | P19  |         |



  Scenario Outline: Programs HS - "<TC_ID>" | Verify "Application and mandatory forms" and "documents" block are visible on "<TC_ID>" NB / EN / RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    Then I set Effective Date to Today
#    * I set Effective Date 290 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Advisor_Servicer_AWS_QA" to "Mirjana Nikolic"
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_STG" to "Mirjana Nikolic"

    * I set "Advisor_Servicer_PROD" to "Nemanja Pecic"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<yesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI

    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus
    * I select created policy

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "docusign documents" is "Not Displayed" on the UI

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "docusign documents" is "Not Displayed" on the UI

    Examples:
      | TC_ID  | user | yesOrNo |
      | AL_001 | P3   |         |
      | GA_001 | P5   |         |
      | HI_001 | P20  |         |
      | LA_001 | P6   |         |
      | MS_001 | P2   |         |
      | NJ_001 | P9   |         |
      | NY_001 | P97  |         |
      | SC_001 | P8   |         |
      | TX_001 | P11  |         |
      | MA_001 | P7   |         |


  Scenario Outline: Programs HS "<TC_ID>" | Verify "Application and mandatory forms" and "documents" block are visible on "<TC_ID>" NB / EN / RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    Then I set Effective Date to Today
#    * I set Effective Date 290 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Advisor_Servicer_AWS_QA" to "Mirjana Nikolic"
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_STG" to "Mirjana Nikolic"

    * I set "Advisor_Servicer_PROD" to "Nemanja Pecic"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<yesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "SL-1 CA Confidential Report of Placement" is "Displayed" on the UI
    Then I verify if element with message "SL-2 CA Diligent Search Report" is "Displayed" on the UI
    Then I verify if element with message "D-1 CA Freestanding Disclosure Statement" is "Displayed" on the UI
    Then I verify if element with message "Agreed Value Settlement Basis Acknowledgement Notice" is "Displayed" on the UI

    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus
    * I select created policy
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "SL-1 CA Confidential Report of Placement" is "Displayed" on the UI
    Then I verify if element with message "SL-2 CA Diligent Search Report" is "Displayed" on the UI
    Then I verify if element with message "D-1 CA Freestanding Disclosure Statement" is "Displayed" on the UI
    Then I verify if element with message "Agreed Value Settlement Basis Acknowledgement Notice" is "Displayed" on the UI
    Then I verify if element with message "docusign documents" is "Not Displayed" on the UI

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    Then I navigate to "Application" page

    And I verify block "application and mandatory forms" exists
    And I verify block "documents" exists

    Then I verify if element with message "application and mandatory forms" is "Displayed" on the UI
    Then I verify if element with message "documents" is "Displayed" on the UI

    Then I verify if element with message "Document Type" is "Displayed" on the UI
    Then I verify if element with message "Surplus Lines Homeowners Application" is "Displayed" on the UI
    Then I verify if element with message "SL-1 CA Confidential Report of Placement" is "Displayed" on the UI
    Then I verify if element with message "SL-2 CA Diligent Search Report" is "Displayed" on the UI
    Then I verify if element with message "D-1 CA Freestanding Disclosure Statement" is "Displayed" on the UI
    Then I verify if element with message "Agreed Value Settlement Basis Acknowledgement Notice" is "Displayed" on the UI
    Then I verify if element with message "docusign documents" is "Not Displayed" on the UI


    Examples:
      | TC_ID  | user | yesOrNo |
      | CA_001 | P1   |         |
