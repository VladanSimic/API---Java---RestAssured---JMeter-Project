@HomeownersSurplus @US55119 @RenewalAutomation
Feature:  HS FL - Renewal Automation - Configure and Implement Logic for PSE Agreement form in DocuSign (Member)

  @US55119
  Scenario:TC_01 | Verify that PSE agreement is sent via DocuSign with Renewal Offer Batch, in case carrier partner changes to PSE at renewal and the account does not have a signed PSE agreement on file.
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

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

#    * I set "Underwriting_Company_Manager_Override" to "Yes"
#    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I am logged in to Pure as Field

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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus
    Then I select created policy

    * I navigate to transactions or endorsements
    Then I create a renewal
    * I go to summary and click update renewal
    Then I navigate to Home Surplus Lines Policy Page

    And I override underwriting company to "PURE Specialty Exchange"

    Then I click save changes button
    And I review changes
    And I click renewed premium

    When I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 15 times

    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 8 to 10 seconds
    * I click "Renewal Offer Batch"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 30 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    When I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "PURE Specialty Exchange Membership Agreement" is "Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I navigate to documents tab
    * I think for 5 to 10 seconds

    Then I verify document table content
      | documentID | documentType     | description | documentLink                                 | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer   | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | PURE Specialty Exchange Membership Agreement | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                                 | Completed                |                        |                  | No           | document list |

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                            | documentLink  | documentCompletedSigned |completedDocumentLink|
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer   | Document Link | No                      |                     |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                          | Document Link | No                      |                     |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | PURE Specialty Exchange Membership Agreement | Document Link | No                      |                     |

    * I download the file "Document Link" with index 3 and verify keywords
      | PURE SPECIALTY EXCHANGE |

    Then I switch to window 1 handle
    And I close new window handle and return to previous one

  @US55119
  Scenario:TC_02 | Verify that PSE Agreement is NOT generated and NOT included in package when UW carrier is  PSE on NB- Send Renewal Offer batch
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

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I am logged in to Pure as Field

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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus
    Then I select created policy

    * I navigate to transactions or endorsements
    Then I create a renewal
    * I go to summary and click update renewal

    And I review changes
    And I click renewed premium

    When I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 45 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    When I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "PURE Specialty Exchange Membership Agreement" is "Not Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I navigate to documents tab

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |

    * I verify if element with message "PURE Specialty Exchange Membership Agreement" is "Not Displayed" on the UI

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    * I verify if element with message "PURE Specialty Exchange Membership Agreement" is "Not Displayed" on the UI

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned |completedDocumentLink|
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                     |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                     |


  @US55119 @Disabled
  Scenario:TC_03 | Verify that PSE Agreement is generated and included in package when UW carrier is changed to PSE - Send Renewal Offer Button
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

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

#    * I set "Underwriting_Company_Manager_Override" to "Yes"
#    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I am logged in to Pure as Field

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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    Then I select created policy
    * I navigate to transactions or endorsements
    Then I create a renewal
    * I go to summary and click update renewal
    Then I navigate to Home Surplus Lines Policy Page

    And I override underwriting company to "PURE Specialty Exchange"

    Then I click save changes button
    And I review changes
    And I click renewed premium

    When I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    And I select a transaction "Renewal"

    Then I navigate to premium summary page
    And I click send renewal offer button
    * I think for 20 to 25 seconds

    When I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "PURE Specialty Exchange Membership Agreement" is "Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I navigate to documents tab

    Then I verify document table content
      | documentID | documentType     | description | documentLink                                 | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer   | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | PURE Specialty Exchange Membership Agreement | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                                 | Completed                |                        |                  | No           | document list |

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                            | documentLink  | documentCompletedSigned |completedDocumentLink|
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer   | Document Link | No                      |                     |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                          | Document Link | No                      |                     |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | PURE Specialty Exchange Membership Agreement | Document Link | No                      |                     |

    * I download the file "Document Link" with index 3 and verify keywords
      | PURE SPECIALTY EXCHANGE |

    Then I switch to window 1 handle
    And I close new window handle and return to previous one


  @US55119
  Scenario:TC_04 | Verify that PSE Agreement is NOT generated and NOT included in package when UW carrier is  PSE on NB- Send Renewal Offer batch
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

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I am logged in to Pure as Field

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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus
    Then I select created policy

    * I navigate to transactions or endorsements
    Then I create a renewal
    * I go to summary and click update renewal

    And I review changes
    And I click renewed premium

    When I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 45 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    When I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "PURE Specialty Exchange Membership Agreement" is "Not Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I navigate to documents tab

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |

    * I verify if element with message "PURE Specialty Exchange Membership Agreement" is "Not Displayed" on the UI

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    * I verify if element with message "PURE Specialty Exchange Membership Agreement" is "Not Displayed" on the UI

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned |completedDocumentLink|completedDocumentLink|
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                     |                     |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                     |                     |


  @US55119
  Scenario:TC_05| Verify that manual uploaded PSE agreement is defaulting to yes on application and mandatory forms block
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

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

#    * I set "Underwriting_Company_Manager_Override" to "Yes"
#    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I am logged in to Pure as Field

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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    Then I select created policy
    * I navigate to transactions or endorsements
    Then I create a renewal
    * I go to summary and click update renewal
    Then I navigate to Home Surplus Lines Policy Page

    And I override underwriting company to "PURE Specialty Exchange"

    Then I click save changes button
    And I review changes
    And I click renewed premium

    When I navigate to underwriting alerts tab
    And I override and accept underwriting referrals

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 45 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    When I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "PURE Specialty Exchange Membership Agreement" is "Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I navigate to documents tab

    Then I verify document table content
      | documentID | documentType     | description | documentLink                                 | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer   | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | PURE Specialty Exchange Membership Agreement | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                                 | Completed                |                        |                  | No           | document list |

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                            | documentLink  | documentCompletedSigned |completedDocumentLink|
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer   | Document Link | No                      |                     |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                          | Document Link | No                      |                     |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | PURE Specialty Exchange Membership Agreement | Document Link | No                      |                     |

    * I download the file "Document Link" with index 3 and verify keywords
      | PURE SPECIALTY EXCHANGE |

    Then I switch to window 1 handle
    And I close new window handle and return to previous one

    Then I upload product specific forms for eSign "eSign Package 1"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                            | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer   | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                          | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | PURE Specialty Exchange Membership Agreement | Not Present  | Yes                     | Completed Document Link |


    Then I verify member application and agreements block
      | checkBox | enabled | documentName                | documentLinkText | documentLink                                     | question                                         | yesOrNo | signedDocumentText | signedDocumentLinks             | button |
      | yes      | no      | Surplus eDelivery Agreement | PDF Link         | pure-programs-edelivery-agreement.pdf            | Did member opt out of electronic delivery?       |         |                    |                                 | yes    |
#      | yes      | no      | PSE Membership Agreement    | PDF Link         | PURE-Specialty-Exchange-Membership-Agreement.pdf | PSE Membership agreement is signed and complete? | Yes     | PDF Link           | https://pureut1.hylandcloud.com | yes    |

    When I navigate to customer summary page
    Then I select renewal policy

    And I navigate to transactions or endorsements
    * I select a transaction "Renewal"

    And I navigate to policy image page

    When I navigate to "Application" page
    * I think for 5 to 6 seconds

    Then I verify DocuSign document block
      | documentType                                 | documentLink                                 | reviewedAndAccepted | block              |
      | Home Surplus Lines Package - Renewal Offer   | Home Surplus Lines Package - Renewal Offer   | Yes                 | docusign documents |
      | Bind Request                                 | Bind Request                                 | Yes                 | docusign documents |
      | PURE Specialty Exchange Membership Agreement | PURE Specialty Exchange Membership Agreement | Yes                 | docusign documents |
