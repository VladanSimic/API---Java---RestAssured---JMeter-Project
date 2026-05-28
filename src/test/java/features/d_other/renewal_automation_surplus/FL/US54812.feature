@HomeownersSurplus @US54812 @RenewalAutomation
Feature: HS FL -  Renewal Automation - Fire existing docusign functionality via the Renewal Offer batch.

  @US54812 @FullRegression_DreamTeam @Disabled
  Scenario:TC_01 | Verify that DocuSign functionality is set up for HS FL renewals and that Renewal Offer batch generates documents on transaction/documents tab and Customer/programs required forms tab - eSign Packages - Document Tracking
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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I click auto create renewal
    * I think for 10 to 15 seconds

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 15 times

    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Offer Batch"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 25 times

    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    And I navigate to policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"

    * I navigate to premium summary page
    * I get renewal grand total from UI

    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Sent                   |                  | No           |document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                | Ready to Send          |                  | No           |document list |

    * I download the file "Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

    * I download the file "Bind Request" and verify keywords
      | BIND REQUEST |


    * I navigate to customer summary page
    * I think for 5 to 10 seconds


    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |


  @US54812 @FullRegression_DreamTeam @Disabled
  Scenario:TC_02 | Verify that DocuSign functionality is set up for HS FL renewals and that Send Renewal Offer button generates documents on transaction/documents tab and Customer/programs required forms tab - eSign Packages - Document Tracking
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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I click auto create renewal
    * I think for 10 to 15 seconds

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    And I select a transaction "Renewal"

    * I navigate to premium summary page
    * I get renewal grand total from UI

    Then I click send renewal offer button
    * I think for 20 to 25 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block         |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Sent                   |                  | No           |document list |
      |            | Policy Form      | Renewal     | Bind Request                               | Completed                | Ready to Send          |                  | No           |document list |

    * I download the file "Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

    * I download the file "Bind Request" and verify keywords
      | BIND REQUEST |

    * I navigate to customer summary page
    * I think for 5 to 10 seconds


    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    And I verify block "eSign Packages - Document Tracking" exists

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |

    * I click "View History"
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                                  | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                                | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com]                | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Mirjana Nikolic [mnikolic@pureinsurance.zcom Signer] | Today | sent    |
      | 4   | PURE Insurance received a printable copy of the envelope                                  | Today | sent    |

    And I close new window handle and return to previous one
