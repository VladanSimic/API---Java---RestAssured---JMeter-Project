@HomeownersSurplus @US54568 @RenewalAutomation
Feature: [Continued] HS FL -  Renewal Automation - DocuSign - Ability to generate forms and continue to esign email

  @US54568
  Scenario:TC_01 | Verify if PSE Agreement is selected, the user can proceed to generate forms and ESign
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

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I create a renewal
    * I think for 10 to 15 seconds
    Then I go to summary and click update renewal
    And I review changes
    And I click renewed premium

    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 10 to 11 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    * I verify that "programs required forms" tab is between "required forms" and "documents"
    * I think for 30 to 30 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    And I click checkbox for "PSE Membership Agreement" document for eSign

    * I write text to "Member Email Address for electronic signature" and value is "npecic@pureinsurance.com"
    * I write text to "Advisor / Servicer Email Address for electronic signature" and value is "mnikolic@pureinsurance.com"

    Then I click "generate forms and continue to esign email"
    * I think for 7 to 10 seconds

    And I verify block "" exists

    Then I verify eSign signature invitation details Member
      | document                 | linkName | link                                                                                   |
      | PSE Membership Agreement | PDF Link | https://assets.pureinsurance.com/pdfs/PURE-Specialty-Exchange-Membership-Agreement.pdf |

    * I download the file "PDF Link" and verify keywords
      | At PSE, our insurance offerings fall into two categories |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email recipient " has value "npecic@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email cc" has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 0

    Then I click "send email for eSignature"
    * I think for 10 to 11 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded        | documentLink | documentCompletedSigned |completedDocumentLink|
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | PSE Membership Agreement |              | No                      |                     |


    * I click "View History" with index 1
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                          | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                        | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com Signer] | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Mirjana Nikolic [mnikolic@pureinsurance.com] | Today | sent    |
#      | 4   | PURE Insurance received a printable copy of the envelope                          | Today | sent    |

    And I close new window handle and return to previous one
    Then I think for 15 to 16 seconds


  @US54568
  Scenario:TC_02 | Verify if PSE Agreement is selected, the user can proceed to generate forms and ESign - Broker
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

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I create a renewal
    * I think for 10 to 15 seconds
    Then I go to summary and click update renewal
    And I review changes
    And I click renewed premium

    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 10 to 11 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

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

    And I click checkbox for "PSE Membership Agreement" document for eSign


    * I write text to "Member Email Address for electronic signature" and value is "npecic@pureinsurance.com"
    * I write text to "Advisor / Servicer Email Address for electronic signature" and value is "mnikolic@pureinsurance.com"

    Then I click "generate forms and continue to esign email"
    * I think for 7 to 10 seconds

    And I verify block "" exists

    Then I verify eSign signature invitation details Member
      | document                 | linkName | link                                                                                   |
      | PSE Membership Agreement | PDF Link | https://assets.pureinsurance.com/pdfs/PURE-Specialty-Exchange-Membership-Agreement.pdf |

    * I download the file "PDF Link" and verify keywords
      | At PSE, our insurance offerings fall into two categories |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email recipient " has value "npecic@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email cc" has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 0

    Then I click "send email for eSignature"
    * I think for 7 to 10 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded        | documentLink | documentCompletedSigned |completedDocumentLink|
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | PSE Membership Agreement |              | No                      |                     |


    * I click "View History"
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                          | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                        | Today | created |
      | 2   | PURE Insurance sent an invitation to {Customer} [npecic@pureinsurance.com Signer] | Today | sent    |
      | 3   | PURE Insurance sent an invitation to Mirjana Nikolic [mnikolic@pureinsurance.com] | Today | sent    |
      | 4   | PURE Insurance received a printable copy of the envelope                          | Today | sent    |

    And I close new window handle and return to previous one


  @US54568 @FullRegression_DreamTeam @UI @RenewalAutomation @Disabled
  Scenario:TC_03 | Verify if Rated Transaction is selected as product, the user can proceed to generate forms and ESign
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

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I create a renewal
    * I think for 10 to 15 seconds
    Then I go to summary and click update renewal
    And I review changes
    And I click renewed premium

    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 10 to 11 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    And I select a transaction "Renewal"
    Then I navigate to premium summary page

    * I get renewal grand total from UI

    And I click send renewal offer button
    * I think for 15 to 20 seconds

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    And I click checkbox for "Home Surplus Lines - Florida" document for eSign

    * I write text to "Member Email Address for electronic signature" and value is "npecic@pureinsurance.com"
    * I write text to "Advisor / Servicer Email Address for electronic signature" and value is "mnikolic@pureinsurance.com"

    Then I click "generate forms and continue to esign email"
    * I think for 7 to 10 seconds

    Then I verify eSign signature invitation details Broker
      | name     | documents                                  |
      | Customer | Home Surplus Lines Package - Renewal Offer |
      | Customer | Bind Request                               |

    * I download the file "Home Surplus Lines Package - Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

#    * I download the file "Renewal Notice" and verify keywords
#      | At PSE, our insurance offerings fall into two categories |
#
#    * I download the file "Notice_of_Change_Policy_Terms_MGU_Home" and verify keywords
#      | At PSE, our insurance offerings fall into two categories |

    * I download the file "Bind Request" and verify keywords
      | THIS IS DOCUSIGN BIND REQUEST |

#    * I download the file "Statement Of Diligent Effort - Florida" and verify keywords
#      | Surplus lines agents must verify that a diligent effort has been made by requiring a properly documented statement of diligent effort from the retail or producing agent. |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email recipient " has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email cc" has value "" and should be read-only "yes" at index 0

    Then I click "send email for eSignature"
    * I think for 7 to 10 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |
#      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |


    * I click "View History"
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                                 | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                               | Today | created |
      | 2   | PURE Insurance sent an invitation to Mirjana Nikolic [mnikolic@pureinsurance.com Signer] | Today | sent    |
      | 3   | PURE Insurance received a printable copy of the envelope                                 | Today | sent    |

    And I close new window handle and return to previous one


  @US54568 @FullRegression_DreamTeam @UI @RenewalAutomation @Disabled
  Scenario:TC_04 |Verify if Rated Transaction is selected as product, the user can proceed to generate forms and ESign - Broker
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

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I create a renewal
    * I think for 10 to 15 seconds
    Then I go to summary and click update renewal
    And I review changes
    And I click renewed premium

    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 10 to 11 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

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

    And I click checkbox for "Home Surplus Lines - Florida" document for eSign

    * I write text to "Member Email Address for electronic signature" and value is "npecic@pureinsurance.com"
    * I write text to "Advisor / Servicer Email Address for electronic signature" and value is "mnikolic@pureinsurance.com"

    Then I click "generate forms and continue to esign email"
    * I think for 7 to 10 seconds

    Then I verify eSign signature invitation details Broker
      | name     | documents                                  |
      | Customer | Home Surplus Lines Package - Renewal Offer |
      | Customer | Bind Request                               |

    * I download the file "Home Surplus Lines Package - Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

    * I download the file "Bind Request" and verify keywords
      | THIS IS DOCUSIGN BIND REQUEST |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email recipient " has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email cc" has value "" and should be read-only "yes" at index 0

    Then I click "send email for eSignature"
    * I think for 7 to 10 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |
#      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |


    * I click "View History"
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                                 | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                               | Today | created |
      | 2   | PURE Insurance sent an invitation to Mirjana Nikolic [mnikolic@pureinsurance.com Signer] | Today | sent    |
      | 3   | PURE Insurance received a printable copy of the envelope                                 | Today | sent    |

    And I close new window handle and return to previous one


  @US54568 @FullRegression_DreamTeam @UI @RenewalAutomation @Disabled
  Scenario:TC_05 | Verify if PSE Agreement and product rated transaction are selected, the user can proceed to generate forms and ESign
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

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I create a renewal
    * I think for 10 to 15 seconds
    Then I go to summary and click update renewal
    And I review changes
    And I click renewed premium

    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 10 to 11 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    * I verify that "programs required forms" tab is between "required forms" and "documents"

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    And I click checkbox for "Home Surplus Lines - Florida" document for eSign
    And I click checkbox for "PSE Membership Agreement" document for eSign

    * I write text to "Member Email Address for electronic signature" and value is "npecic@pureinsurance.com"
    * I write text to "Advisor / Servicer Email Address for electronic signature" and value is "mnikolic@pureinsurance.com"

    Then I click "generate forms and continue to esign email"
    * I think for 10 to 11 seconds

    Then I verify eSign signature invitation details Broker
      | name     | documents                                  |
      | Customer | Home Surplus Lines Package - Renewal Offer |
      | Customer | Bind Request                               |

    * I download the file "Home Surplus Lines Package - Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

#    * I download the file "Renewal Notice" and verify keywords
#      | At PSE, our insurance offerings fall into two categories |
#
#    * I download the file "Notice_of_Change_Policy_Terms_MGU_Home" and verify keywords
#      | At PSE, our insurance offerings fall into two categories |

    * I download the file "Bind Request" and verify keywords
      | THIS IS DOCUSIGN BIND REQUEST |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email recipient " has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email cc" has value "" and should be read-only "yes" at index 0

    Then I verify eSign signature invitation details Member
      | document                                   | linkName | link                                                                                   |
      | PSE Membership Agreement                   | PDF Link | https://assets.pureinsurance.com/pdfs/PURE-Specialty-Exchange-Membership-Agreement.pdf |
      | Home Surplus Lines Package - Renewal Offer |          |                                                                                        |

    * I download the file "PDF Link" and verify keywords
      | At PSE, our insurance offerings fall into two categories |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 1
    Then I verify that field "Email recipient " has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 1
    Then I verify that field "Email cc" has value "" and should be read-only "yes" at index 1

    Then I click "send email for eSignature"
    * I think for 7 to 10 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |
#      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |


    * I click "View History" with index 1
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                                 | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                               | Today | created |
      | 2   | PURE Insurance sent an invitation to Mirjana Nikolic [mnikolic@pureinsurance.com Signer] | Today | sent    |
      | 3   | PURE Insurance received a printable copy of the envelope                                 | Today | sent    |

    And I close new window handle and return to previous one



  @US54568
  Scenario:TC_06 | Verify if PSE Agreement and product rated transaction are selected, the user can proceed to generate forms and ESign - Broker
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

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I create a renewal
    * I think for 10 to 15 seconds
    Then I go to summary and click update renewal
    And I review changes
    And I click renewed premium

    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 10 to 11 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

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

    And I click checkbox for "Home Surplus Lines - Florida" document for eSign
    And I click checkbox for "PSE Membership Agreement" document for eSign

    * I write text to "Member Email Address for electronic signature" and value is "npecic@pureinsurance.com"
    * I write text to "Advisor / Servicer Email Address for electronic signature" and value is "mnikolic@pureinsurance.com"

    Then I click "generate forms and continue to esign email"
    * I think for 10 to 11 seconds

    Then I verify eSign signature invitation details Broker
      | name     | documents                                  |
      | Customer | Home Surplus Lines Package - Renewal Offer |
      | Customer | Bind Request                               |

    * I download the file "Home Surplus Lines Package - Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

    * I download the file "Bind Request" and verify keywords
      | BIND REQUEST |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email recipient " has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email cc" has value "" and should be read-only "yes" at index 0

    Then I verify eSign signature invitation details Member
      | document                                   | linkName | link                                                                                   |
      | PSE Membership Agreement                   | PDF Link | https://assets.pureinsurance.com/pdfs/PURE-Specialty-Exchange-Membership-Agreement.pdf |
      | Home Surplus Lines Package - Renewal Offer |          |                                                                                        |

    * I download the file "PDF Link" and verify keywords
      | At PSE, our insurance offerings fall into two categories |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 1
    Then I verify that field "Email recipient " has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 1
    Then I verify that field "Email cc" has value "" and should be read-only "yes" at index 1

    Then I click "send email for eSignature"
    * I think for 7 to 10 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |


    * I click "View History" with index 1
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                                 | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                               | Today | created |
      | 2   | PURE Insurance sent an invitation to Mirjana Nikolic [mnikolic@pureinsurance.com Signer] | Today | sent    |
      | 3   | PURE Insurance received a printable copy of the envelope                                 | Today | sent    |

    And I close new window handle and return to previous one


  @US54568 @FullRegression_DreamTeam @UI @RenewalAutomation @Disabled
  Scenario:TC_07 |  Verify that Producer email i cc'ed on Broker package, but not on member package
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

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I think for 10 to 15 seconds
    * I create a renewal
    * I think for 10 to 15 seconds
    Then I go to summary and click update renewal
    And I review changes
    And I click renewed premium

    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I think for 10 to 11 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to customer summary page
    * I think for 5 to 10 seconds

    * I verify that "programs required forms" tab is between "required forms" and "documents"

    Then I click "programs required forms"
    * I think for 5 to 6 seconds

    And I click checkbox for "Home Surplus Lines - Florida" document for eSign
    And I click checkbox for "PSE Membership Agreement" document for eSign

    * I write text to "Member Email Address for electronic signature" and value is "npecic@pureinsurance.com"
    * I write text to "Advisor / Servicer Email Address for electronic signature" and value is "mnikolic@pureinsurance.com"
    * I write text to "Licensed Producer Email Address for electronic signature" and value is "npecic@pureinsurance.com"


    Then I click "generate forms and continue to esign email"
    * I think for 10 to 11 seconds

    Then I verify eSign signature invitation details Broker
      | name     | documents                                  |
      | Customer | Home Surplus Lines Package - Renewal Offer |
      | Customer | Bind Request                               |

    * I download the file "Home Surplus Lines Package - Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

#    * I download the file "Renewal Notice" and verify keywords
#      | At PSE, our insurance offerings fall into two categories |
#
#    * I download the file "Notice_of_Change_Policy_Terms_MGU_Home" and verify keywords
#      | At PSE, our insurance offerings fall into two categories |

    * I download the file "Bind Request" and verify keywords
      | BIND REQUEST |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email recipient " has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 0
    Then I verify that field "Email cc" has value "npecic@pureinsurance.com" and should be read-only "yes" at index 0

    Then I verify eSign signature invitation details Member
      | document                                   | linkName | link                                                                                   |
      | PSE Membership Agreement                   | PDF Link | https://assets.pureinsurance.com/pdfs/PURE-Specialty-Exchange-Membership-Agreement.pdf |
      | Home Surplus Lines Package - Renewal Offer |          |                                                                                        |

    * I download the file "PDF Link" and verify keywords
      | At PSE, our insurance offerings fall into two categories |

    Then I verify that field "Email Sender" has value "esignature@pureinsurance.com" and should be read-only "yes" at index 1
    Then I verify that field "Email recipient " has value "npecic@pureinsurance.com" and should be read-only "yes" at index 1
    Then I verify that field "Email cc" has value "mnikolic@pureinsurance.com" and should be read-only "yes" at index 1

    Then I click "send email for eSignature"
    * I think for 7 to 10 seconds

    Then I verify eSign packages block
      | selectPackages | eSignaturePackages | history      | packageSentDateTime | packageStatusDateTime | DocumentsIncluded                          | documentLink  | documentCompletedSigned | completedDocumentLink |
      | checkbox       | eSign Package 1    | View History | Today               | sent                  | Home Surplus Lines Package - Renewal Offer | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | BindRequestDocuSign                        | Document Link | No                      |                       |
      | checkbox       | eSign Package 1    |              | Today               | sent                  | StatementOfDiligentEffortForm - Florida    | Document Link | No                      |                       |


    * I click "View History" with index 1
    Then I think for 5 to 6 seconds

    Then I switch to window 1 handle

    And I verify eSign History block
      | row | activity                                                                                 | time  | status  |
      | 1   | The envelope was created by PURE Insurance                                               | Today | created |
      | 2   | PURE Insurance sent an invitation to Mirjana Nikolic [mnikolic@pureinsurance.com Signer] | Today | sent    |
      | 3   | PURE Insurance received a printable copy of the envelope                                 | Today | sent    |

    And I close new window handle and return to previous one

