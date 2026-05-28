@HomeownersSurplus @US51334 @RenewalAutomation
Feature: HS FL -  Renewal Automation - Processing Renewal Batch

  @US51334
  Scenario:TC_01 FL_001 | Verify that once documents are uploaded manually, and status of transaction is 'Rated', transaction is processed - Renewal Offer Batch
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 305 days in the past
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Then I rate a quote
    * I think for 10 to 15 seconds

    When I navigate to underwriting referrals page
    Then I override and accept underwriting referrals

    Then I bind a quote for surplus

    Then I select created policy
    * I navigate to transactions or endorsements

    Then I create a renewal
    * I think for 10 to 15 seconds

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
    * I think for 10 to 10 seconds and i keep clicking home tab for 10 times
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Offer Batch"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 30 times
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    Then I select a transaction "Renewal"

    * I think for 3 to 4 seconds
    Then I navigate to documents tab
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |

    Then I upload product specific forms for eSign "eSign Package 1"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                        | Not Present  | Yes                     | Completed Document Link |


    * I navigate to Home
    * I think for 20 to 25 seconds and i keep clicking home tab for 10 times

    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 20 to 25 seconds and i keep clicking home tab for 25 times

    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    Then I select created policy
    * I think for 5 to 6 seconds
    And I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionProcessed"


  @US51334
  Scenario:TC_02 FL_001 | Verify that transaction is not processed if documents are not uploaded 60 days
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 303 days in the past
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Then I rate a quote
    * I think for 10 to 15 seconds

    When I navigate to underwriting referrals page
    Then I override and accept underwriting referrals

    Then I bind a quote for surplus

    Then I select created policy
    * I navigate to transactions or endorsements

    Then I create a renewal
    * I think for 10 to 15 seconds

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

    * I think for 3 to 4 seconds
    Then I navigate to documents tab
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |

    * I navigate to Home
    * I think for 20 to 25 seconds and i keep clicking home tab for 35 times

    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    Then I select created policy
    * I think for 5 to 6 seconds
    And I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"


  @US51334
  Scenario:TC_03 FL_001 | Verify that transaction is not processed if documents are uploaded, but transaction is in ReviewRequired
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 303 days in the past
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Then I rate a quote
    * I think for 10 to 15 seconds

    When I navigate to underwriting referrals page
    Then I override and accept underwriting referrals

    Then I bind a quote for surplus

    Then I select created policy
    * I navigate to transactions or endorsements

    Then I create a renewal
    * I think for 10 to 15 seconds

    * I go to summary and click update renewal
    And I review changes
    Then I click renewed premium
    * I think for 5 to 10 seconds

    Then I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Then I select a transaction "Renewal"
    * I think for 5 to 10 seconds
    * I click "xxx Test DocuSign"
    * I think for 10 to 15 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |

    Then I upload product specific forms for eSign "eSign Package 1"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                        | Not Present  | Yes                     | Completed Document Link |


    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 70 times
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

  @US51334
  Scenario:TC_04 FL_001 | Verify that transaction is not processed if meets condition at 62 days
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 303 days in the past
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Then I rate a quote
    * I think for 10 to 15 seconds

    When I navigate to underwriting referrals page
    Then I override and accept underwriting referrals

    Then I bind a quote for surplus

    Then I select created policy
    * I navigate to transactions or endorsements

    Then I create a renewal
    * I think for 10 to 15 seconds

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
    * I think for 10 to 10 seconds and i keep clicking home tab for 35 times
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    Then I select a transaction "Renewal"

    * I think for 3 to 4 seconds
    Then I navigate to documents tab
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |

    Then I upload product specific forms for eSign "eSign Package 1"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                        | Not Present  | Yes                     | Completed Document Link |


    * I navigate to Home
    * I think for 20 to 25 seconds and i keep clicking home tab for 30 times

    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    Then I select created policy
    * I think for 5 to 6 seconds
    And I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"



  @US51334
  Scenario:TC_05 FL_001 | Verify that transaction is processed if meets condition at 50 days
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 315 days in the past
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Then I rate a quote
    * I think for 10 to 15 seconds

    When I navigate to underwriting referrals page
    Then I override and accept underwriting referrals

    Then I bind a quote for surplus

    Then I select created policy
    * I navigate to transactions or endorsements

    Then I create a renewal
    * I think for 10 to 15 seconds

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
    * I think for 10 to 10 seconds and i keep clicking home tab for 30 times
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    Then I select a transaction "Renewal"

    * I think for 3 to 4 seconds
    Then I navigate to documents tab
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |

    Then I upload product specific forms for eSign "eSign Package 1"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                        | Not Present  | Yes                     | Completed Document Link |


    * I navigate to Home
    * I think for 20 to 25 seconds and i keep clicking home tab for 40 times


    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    Then I select created policy
    * I think for 5 to 6 seconds
    And I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionProcessed"