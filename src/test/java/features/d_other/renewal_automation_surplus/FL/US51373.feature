@HomeownersSurplus @US51373 @RenewalAutomation
Feature: HS FL -  Renewal Automation - DocuSign - Ability to void an eSignature envelope(s)

  @US51373
  Scenario:TC_01 | Verify that if changes are made to a renewal transaction after a renewal offer is sent, the previously sent package should be automatically voided when transaction is re-rated- Internal Users
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Then I rate a quote
    * I think for 10 to 15 seconds

    When I navigate to underwriting referrals page
    Then I override and accept underwriting referrals

    Then I bind a quote for surplus

    And I navigate to policy
    * I navigate to transactions or endorsements

    Then I create a renewal
    * I think for 15 to 20 seconds

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

    Then I navigate to documents tab
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

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
      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I click checkbox for "eSign Package 1" package for eSign
    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    Then I click checkbox for "eSign Package 1" package for eSign

    Then I navigate to customer summary page

    And I select renewal policy

    Then I navigate to transactions or endorsements

    Then I select a transaction "Renewal"
    * I think for 3 to 4 seconds

    Then I get current object ID for sql query
    * I think for 3 to 4 seconds

    * I execute the query and verify job status
      | query    | column             | status | expectedRequests | parameter |
      | docusign | RELATION_OBJECT_ID |        | 1                | OBJECT_ID |

    * I go to summary and click update renewal
    Then I write text to "Replacement Cost" and value is "9000000"

    And I review changes
    * I think for 10 to 12 seconds
    Then I click renewed premium
    * I think for 10 to 15 seconds
    * I navigate to customer summary page
    * I think for 10 to 15 seconds

    Then I click "programs required forms"
    * I think for 10 to 11 seconds

    Then I click "eSignature packages"
    * I think for 3 to 4 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | BindRequestDocuSign                        |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    |              |                         |                       |

    * I click "View History" with index 1
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                                                 | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                                               | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com]                               | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Nemanja Pecic [npecic@pureinsurance.com Signer]                     | Today | sent    |
      | 4   | PURE Insurance received a printable copy of the envelope                                                 | Today | sent    |
      | 5   | The envelope has been voided and e-mail notifications were sent [Changes have been made to the renewal.] | Today | voided  |

    And I close new window handle and return to previous one

    Then I think for 5 to 6 seconds


  @US51373
  Scenario:TC_02 | Verify that there is an ability to manually void previously sent out packages/envelopes sent via DocuSign on HS FL renewals via the "programs required forms" tab-Internal Users
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Then I rate a quote
    * I think for 10 to 15 seconds

    When I navigate to underwriting referrals page
    Then I override and accept underwriting referrals

    Then I bind a quote for surplus

    And I navigate to policy
    * I navigate to transactions or endorsements

    Then I create a renewal
    * I think for 15 to 20 seconds

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
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

    * I navigate to customer summary page
    * I think for 5 to 6 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I click checkbox for "eSign Package 1" package for eSign

    And I click "void eSign package"
    * I think for 3 to 4 seconds
    And I click "OK"
    * I think for 20 to 25 seconds
    Then I click "programs required forms"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer | Not Present  |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | BindRequestDocuSign                        |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    |              |                         |                       |

    * I click "View History" with index 1
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                             | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                           | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com]           | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Nemanja Pecic [npecic@pureinsurance.com Signer] | Today | sent    |
      | 4   | PURE Insurance received a printable copy of the envelope                             | Today | sent    |
      | 5   | The envelope has been voided and e-mail notifications were sent [ ]                  | Today | voided  |

    And I close new window handle and return to previous one

    Then I think for 5 to 6 seconds


  @US51373
  Scenario:TC_03 | Verify  that there is an ability to manually void previously sent out packages/envelopes sent via DocuSign on HS FL renewals via the "programs required forms" tab- Broker
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Then I rate a quote
    * I think for 10 to 15 seconds

    When I navigate to underwriting referrals page
    Then I override and accept underwriting referrals

    Then I bind a quote for surplus

    And I navigate to policy
    * I navigate to transactions or endorsements

    Then I create a renewal
    * I think for 15 to 20 seconds

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
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

    Then I navigate to Home
    * I think for 5 to 10 seconds
    And I logout

    Then I am logged in to Pure as "Agent2"
    And I navigate to customers page
    * I select customer by ID

    * I think for 5 to 6 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds
    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I click checkbox for "eSign Package 1" package for eSign

    And I click "void eSign package"
    * I think for 3 to 4 seconds
    And I click "OK"
    * I think for 20 to 25 seconds
    Then I click "programs required forms"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | BindRequestDocuSign                        |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    |              |                         |                       |

    * I click "View History" with index 1
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                             | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                           | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com]           | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Nemanja Pecic [npecic@pureinsurance.com Signer] | Today | sent    |
      | 4   | PURE Insurance received a printable copy of the envelope                             | Today | sent    |
      | 5   | The envelope has been voided and e-mail notifications were sent [ ]                  | Today | voided  |

    And I close new window handle and return to previous one

    Then I think for 5 to 6 seconds


  @US51373
  Scenario:TC_04 | Verify that manually re-sent forms are voided after policy is re-rated - Renewal Offer batch
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
    * I think for 15 to 20 seconds

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
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

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
      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I click checkbox for "eSign Package 1" package for eSign

    And I click "resend eSign package"
    * I think for 3 to 4 seconds
    And I click "OK"
    * I think for 15 to 20 seconds

    Then I click "programs required forms"

    * I think for 3 to 4 seconds
    Then I click "eSignature packages"
    * I think for 3 to 4 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer | Not Present   | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | BindRequestDocuSign                        | Not Present   | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    | Not Present   | No                      |                       |
      | checkbox       | eSign Package 2    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 2    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |
      | checkbox       | eSign Package 2    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I navigate to customer summary page

    And I select renewal policy

    Then I navigate to transactions or endorsements

    Then I select a transaction "Renewal"

    Then I get current object ID for sql query
    * I think for 3 to 4 seconds

    * I execute the query and verify job status
      | query    | column             | status | expectedRequests | parameter |
      | docusign | RELATION_OBJECT_ID |        | 1                | OBJECT_ID |

    * I go to summary and click update renewal
    Then I write text to "Replacement Cost" and value is "8500000"

    And I review changes
    Then I click renewed premium
    * I think for 10 to 15 seconds

    * I navigate to customer summary page
    * I think for 10 to 15 seconds

    Then I click "programs required forms"
    * I think for 10 to 11 seconds

    Then I click "eSignature packages"
    * I think for 3 to 4 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | BindRequestDocuSign                        |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    |              |                         |                       |
      | checkbox       | eSign Package 2    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer |              |                         |                       |
      | checkbox       | eSign Package 2    |              | Today               | voided                | BindRequestDocuSign                        |              |                         |                       |
      | checkbox       | eSign Package 2    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    |              |                         |                       |

    * I click "View History" with index 1
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                             | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                           | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com]           | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Nemanja Pecic [npecic@pureinsurance.com Signer] | Today | sent    |
      | 4   | PURE Insurance received a printable copy of the envelope                             | Today | sent    |
      | 5   | The envelope has been voided and e-mail notifications were sent [ ]                  | Today | voided  |

    And I close new window handle and return to previous one

    Then I think for 5 to 6 seconds

    * I click "View History" with index 2
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                                                 | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                                               | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com]                               | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Nemanja Pecic [npecic@pureinsurance.com Signer]                     | Today | sent    |
      | 4   | PURE Insurance received a printable copy of the envelope                                                 | Today | sent    |
      | 5   | The envelope has been voided and e-mail notifications were sent [Changes have been made to the renewal.] | Today | voided  |

    And I close new window handle and return to previous one

    Then I think for 5 to 6 seconds

  @US51373
  Scenario:TC_05 | Verify once document are voided manually, they are not showing on application page.
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
    * I think for 15 to 20 seconds

    * I go to summary and click update renewal

    And I review changes
    Then I click renewed premium

    * I think for 5 to 10 seconds

    And I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 5 to 10 seconds

    Then I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    Then I select a transaction "Renewal"

    Then I navigate to premium summary page
    And I click send renewal offer button

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    * I think for 15 to 18 seconds
    Then I navigate to documents tab
    * I think for 5 to 6 seconds
    Then I navigate to documents tab

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

    And I navigate to policy image page

    When I navigate to "Application" page
    * I think for 5 to 6 seconds

    Then I verify DocuSign document block
      | documentType                               | documentLink                               | reviewedAndAccepted | block              |
      | Home Surplus Lines Package - Renewal Offer | Home Surplus Lines Package - Renewal Offer | No                  | docusign documents |
      | Bind Request                               | Bind Request                               | No                  | docusign documents |
      | Statement Of Diligent Effort - Florida     | Statement Of Diligent Effort - Florida     | No                  | docusign documents |

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
      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I click checkbox for "eSign Package 1" package for eSign

    And I click "void eSign package"

    * I think for 3 to 4 seconds
    And I click "OK"
    * I think for 15 to 20 seconds

    Then I click "programs required forms"

    * I think for 3 to 4 seconds
    Then I click "eSignature packages"
    * I think for 3 to 4 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer | Not Present  |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | BindRequestDocuSign                        |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    |              |                         |                       |

    Then I navigate to customer summary page

    And I select renewal policy

    Then I navigate to transactions or endorsements

    Then I select a transaction "Renewal"
    * I navigate to policy image page

    When I navigate to "Application" page
    * I think for 5 to 6 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Not Displayed" on the UI
    * I verify if element with message "Bind Request" is "Not Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Not Displayed" on the UI

  @US51373
  Scenario:TC_06 | Verify that manually re-sent forms are voided after policy is re-rated - Send Renewal Offer button
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
    * I think for 15 to 20 seconds

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
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

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
      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I click checkbox for "eSign Package 1" package for eSign

    And I click "resend eSign package"
    * I think for 3 to 4 seconds
    And I click "OK"
    * I think for 15 to 20 seconds

    Then I click "programs required forms"

    * I think for 3 to 4 seconds
    Then I click "eSignature packages"
    * I think for 3 to 4 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer | Not Present   | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | BindRequestDocuSign                        | Not Present   | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    | Not Present   | No                      |                       |
      | checkbox       | eSign Package 2    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 2    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |
      | checkbox       | eSign Package 2    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I navigate to customer summary page

    And I select renewal policy

    Then I navigate to transactions or endorsements

    Then I select a transaction "Renewal"
    Then I get current object ID for sql query
    * I think for 3 to 4 seconds

    * I execute the query and verify job status
      | query    | column             | status | expectedRequests | parameter |
      | docusign | RELATION_OBJECT_ID |        | 1                | OBJECT_ID |

    * I go to summary and click update renewal
    Then I write text to "Replacement Cost" and value is "8500000"

    And I review changes
    * I think for 3 to 4 seconds
    And I take screenshot
    Then I click renewed premium
    And I take screenshot
    * I think for 10 to 15 seconds

    * I navigate to customer summary page
    * I think for 10 to 15 seconds

    Then I click "programs required forms"
    * I think for 10 to 11 seconds

    Then I click "eSignature packages"
    * I think for 3 to 4 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | BindRequestDocuSign                        |              |                         |                       |
      | checkbox       | eSign Package 1    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    |              |                         |                       |
      | checkbox       | eSign Package 2    | View History | Today               | voided                | Home Surplus Lines Package - Renewal Offer |              |                         |                       |
      | checkbox       | eSign Package 2    |              | Today               | voided                | BindRequestDocuSign                        |              |                         |                       |
      | checkbox       | eSign Package 2    |              | Today               | voided                | StatementOfDiligentEffortForm - Florida    |              |                         |                       |

    * I click "View History" with index 1
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                             | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                           | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com]           | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Nemanja Pecic [npecic@pureinsurance.com Signer] | Today | sent    |
      | 4   | PURE Insurance received a printable copy of the envelope                             | Today | sent    |
      | 5   | The envelope has been voided and e-mail notifications were sent [ ]                  | Today | voided  |

    And I close new window handle and return to previous one

    Then I think for 5 to 6 seconds

    * I click "View History" with index 2
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                                                 | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                                               | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com]                               | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Nemanja Pecic [npecic@pureinsurance.com Signer]                     | Today | sent    |
      | 4   | PURE Insurance received a printable copy of the envelope                                                 | Today | sent    |
      | 5   | The envelope has been voided and e-mail notifications were sent [Changes have been made to the renewal.] | Today | voided  |

    And I close new window handle and return to previous one

    Then I think for 5 to 6 seconds