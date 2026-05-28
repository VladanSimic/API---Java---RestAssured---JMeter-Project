@HomeownersSurplus @US52993 @RenewalAutomation
Feature: HS FL - Renewal Automation - Reception and Storage of Manually Uploaded Documents

  @US52993
  Scenario:TC_01 FL_001 | Verify once document are uploaded manually, package is voided
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
    * I think for 10 to 10 seconds and i keep clicking home tab for 5 times
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Offer Batch"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 25 times
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
#    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
#      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

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
#      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I upload product specific forms for eSign "eSign Package 1"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                        | Not Present  | Yes                     | Completed Document Link |
#      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | StatementOfDiligentEffortForm - Florida    | Not Present  | Yes                     | Completed Document Link |


    * I navigate to Home
    * I think for 20 to 25 seconds and i keep clicking home tab for 15 times
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                        | Not Present  | Yes                     | Completed Document Link |
#      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | StatementOfDiligentEffortForm - Florida    | Not Present  | Yes                     | Completed Document Link |


  @US52993 @FullRegression_DreamTeam @UI @RenewalAutomation @Disabled
  Scenario:TC_02 FL_001 | Verify once document are uploaded manually, they are stored as individual links on programs required forms tab
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
    * I think for 10 to 10 seconds and i keep clicking home tab for 32 times
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
#    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
#      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

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
#      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I upload product specific forms for eSign "eSign Package 1"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                        | Not Present  | Yes                     | Completed Document Link |
#      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | StatementOfDiligentEffortForm - Florida    | Not Present  | Yes                     | Completed Document Link |

    Then I download the file "Completed Document Link" with index 1 and verify keywords
      | Renewal |

    Then I switch to window 1 handle
    And I close new window handle and return to previous one

    Then I download the file "Completed Document Link" with index 2 and verify keywords
      | Bind Request |

    Then I switch to window 1 handle
    And I close new window handle and return to previous one

#    Then I download the file "Completed Document Link" with index 3 and verify keywords
#      | Statement of Diligent |

    Then I switch to window 1 handle
    And I close new window handle and return to previous one

  @US52993 @FullRegression_DreamTeam @UI @RenewalAutomation @Disabled
  Scenario:TC_03 FL_001 | Verify once document are uploaded manually, they are stored as individual links on transaction 'application' page
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

    Then I select created policy
    * I navigate to transactions or endorsements

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
    * I think for 10 to 10 seconds and i keep clicking home tab for 32 times
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
#    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
#      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |


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
#      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I upload product specific forms for eSign "eSign Package 1"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                        | Not Present  | Yes                     | Completed Document Link |
#      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | StatementOfDiligentEffortForm - Florida    | Not Present  | Yes                     | Completed Document Link |

    When I navigate to customer summary page
    Then I select renewal policy

    And I navigate to transactions or endorsements
    * I select a transaction "Renewal"

    And I navigate to policy image page

    When I navigate to "Application" page
    * I think for 5 to 6 seconds

    Then I verify DocuSign document block
      | documentType                               | documentLink                               | reviewedAndAccepted | block              |
      | Home Surplus Lines Package - Renewal Offer | Home Surplus Lines Package - Renewal Offer | Yes                 | docusign documents |
      | Bind Request                               | Bind Request                               | Yes                 | docusign documents |
#      | Statement Of Diligent Effort - Florida     | Statement Of Diligent Effort - Florida     | Yes                 | docusign documents |

    Then I download the file "RenewalOffer.pdf" and verify keywords
      | Renewal  |

    Then I download the file "BindRequest.pdf" and verify keywords
      | Bind Request |

#    Then I download the file "DE.pdf" and verify keywords
#      | Statement Of |


  @US52993
  Scenario:TC_04 FL_001 | Verify manual upload functionality is only visible to internal users
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

    Then I select created policy
    * I navigate to transactions or endorsements

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
    * I think for 10 to 10 seconds and i keep clicking home tab for 32 times
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
#    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block        |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
#      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

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
    * I verify if element with message "manually upload" is "Not Displayed" on the UI


  @US52993
  Scenario:TC_05 FL_001 | Verify once document are uploaded manually, package is voided - Send Renewal Offer button
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

    * I think for 10 to 15 seconds

    And I get renewal grand total from UI
    And I click send renewal offer button
    * I think for 15 to 18 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
#    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I navigate to documents tab
    * I think for 5 to 10 seconds
    Then I navigate to documents tab

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                |                        |                  | No           | document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                |                        |                  | No           | document list |
#      |            | Policy Form      | Renewal     | Statement Of Diligent Effort - Florida     | Completed                |                        |                  | No           | document list |

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
#      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |

    Then I upload product specific forms for eSign "eSign Package 1"

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink | documentCompletedSigned | completedDocumentLink   |
      | checkbox       | eSign Package 1    | View History | Today               | manually uploaded     | Home Surplus Lines Package - Renewal Offer | Not Present  | Yes                     | Completed Document Link |
      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | BindRequestDocuSign                        | Not Present  | Yes                     | Completed Document Link |
#      | checkbox       | eSign Package 1    |              | Today               | manually uploaded     | StatementOfDiligentEffortForm - Florida    | Not Present  | Yes                     | Completed Document Link |


  @US52993 @Error
  Scenario:TC_01 FL_001 | Verify once document are uploaded manually, package is voided
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

  @US52993 @FullRegression_DreamTeam @UI @RenewalAutomation @Disabled @Error
  Scenario:TC_02 FL_001 | Verify once document are uploaded manually, they are stored as individual links on programs required forms tab
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

  @US52993 @FullRegression_DreamTeam @UI @RenewalAutomation @Disabled@Error
  Scenario:TC_03 FL_001 | Verify once document are uploaded manually, they are stored as individual links on transaction 'application' page
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

    Then I select created policy
    * I navigate to transactions or endorsements

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
