@HomeownersSurplus @US51349 @RenewalAutomation
Feature: HS FL -  Renewal Automation - Task to Brokers when Renewal Offer is Available

  @US51349
  Scenario Outline: TC_01 FL_001 | Verify that the task 'Renewal Offering' is created on transaction level once renewal offer is created by 'Renewal Offer Batch'

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"


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
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    Then I create a renewal
    * I think for 10 to 15 seconds

    * I go to summary and click update renewal

    Then I review changes
    And I click renewed premium

    And I navigate to underwriting alerts tab
    Then I override and accept underwriting referrals

    And I navigate to underwriting alerts tab
    Then I navigate to policy image page
    Then I review changes
    And I click renewed premium

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 10 times

    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 8 to 10 seconds
    * I click "Renewal Offer Batch"
    * I think for 10 to 15 seconds

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
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I navigate to diary tab

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle                       | createdBy  | assignedTo        | due | taskStatus | task                            |
      | Today       | Task     | PURE Programs renewal offer for | Super User | Ivana Antonijevic | 5   | Incomplete | PURE Programs renewal offer for |

    Then I click "PURE Programs renewal offer" with index 0
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Incomplete | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Complete   | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US51349
  Scenario Outline: TC_02 FL_001 | Verify that the task 'Renewal Offering' is created on account level once renewal offer is created by 'Renewal Offer Batch'

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"


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
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    Then I create a renewal
    * I think for 10 to 15 seconds

    * I go to summary and click update renewal

    Then I review changes
    And I click renewed premium

    And I navigate to underwriting alerts tab
    Then I override and accept underwriting referrals

    And I navigate to underwriting alerts tab
    Then I navigate to policy image page
    Then I review changes
    And I click renewed premium

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I think for 10 to 15 seconds

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
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I navigate to customer summary page

    * I think for 5 to 7 seconds
    Then I click "diary"
    * I think for 10 to 15 seconds

    Then I verify tasks table on Customer Diary
      | createdDate | taskType | taskTitle                       | createdBy | assignedTo        | due | taskStatus | internalFlag | task                            | block            |
      | Today       | Task     | PURE Programs renewal offer for |           | Ivana Antonijevic | 5   | Incomplete | Y            | PURE Programs renewal offer for | incomplete tasks |

    Then I click "PURE Programs renewal offer" with index 0
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Incomplete | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Complete   | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US51349
  Scenario Outline: TC_03 FL_001 | Verify that the task 'Renewal Offering' is created on Task page once renewal offer is created by 'Renewal Offer Batch'

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"


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
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    Then I create a renewal
    * I think for 10 to 15 seconds

    * I go to summary and click update renewal

    Then I review changes
    And I click renewed premium

    And I navigate to underwriting alerts tab
    Then I override and accept underwriting referrals

    And I navigate to underwriting alerts tab
    Then I navigate to policy image page
    Then I review changes
    And I click renewed premium

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 45 times

    * I logout

    * I am logged in to Pure as "Agent2"
    * I think for 10 to 15 seconds
    * I click "tasks"
    * I think for 10 to 15 seconds
    And I sort renewal tasks descending
    * I think for 5 to 7 seconds
    * I verify if task element is "Displayed" on the UI

    Then I verify tasks table on tasks page
      | createdDate | dueDate | creator    | assignedTo        | taskTitle                       | relatedTo                       | taskStatus | taskType | block         |
      | Today       | 5       | Super User | Ivana Antonijevic | PURE Programs renewal offer for | PURE Programs renewal offer for | Incomplete |          | renewal tasks |

    Then I click on renewal offer not sent task
    * I think for 10 to 15 seconds

    Then I click "summary"

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Incomplete | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Complete   | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US51349
  Scenario Outline: TC_04 FL_001 | Verify that the task 'Renewal Offering' is created on Task page, and '>>> do task' button leads user to correct policy

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"

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
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    Then I create a renewal
    * I think for 10 to 15 seconds

    * I go to summary and click update renewal

    Then I review changes
    And I click renewed premium

    And I navigate to underwriting alerts tab
    Then I override and accept underwriting referrals

    And I navigate to underwriting alerts tab
    Then I navigate to policy image page
    Then I review changes
    And I click renewed premium

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 45 times

    * I logout

    * I am logged in to Pure as "Agent2"
    * I think for 10 to 15 seconds
    * I click "tasks"
    * I think for 10 to 15 seconds
    And I sort renewal tasks descending
    * I think for 5 to 7 seconds
    * I verify if task element is "Displayed" on the UI

    Then I verify tasks table on tasks page
      | createdDate | dueDate | creator    | assignedTo        | taskTitle                       | relatedTo                       | taskStatus | taskType | block         |
      | Today       | 5       | Super User | Ivana Antonijevic | PURE Programs renewal offer for | PURE Programs renewal offer for | Incomplete |          | renewal tasks |

    Then I click on renewal offer not sent task
    * I think for 10 to 15 seconds

    * I click "summary"

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Incomplete | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Complete   | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |

    * I think for 5 to 10 seconds
    * I click ">>> do task"
    * I think for 5 to 10 seconds

    * I navigate to transactions or endorsements
    * I navigate to policy summary tab

    * I verify renewal policy id on transaction summary

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US51349
  Scenario Outline: TC_05 FL_001 | Verify that the task For renewal offer is created on Diary tab page once Send renewal offer button is clicked.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 310 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"


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
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    Then I create a renewal
    * I think for 10 to 15 seconds

    * I go to summary and click update renewal

    Then I review changes
    And I click renewed premium

    And I navigate to underwriting alerts tab
    Then I override and accept underwriting referrals

    And I navigate to underwriting alerts tab
    Then I navigate to policy image page
    Then I review changes
    And I click renewed premium

#    And I navigate to premium summary page
    And I click send renewal offer button
    * I think for 10 to 15 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I navigate to diary tab

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle                       | createdBy  | assignedTo        | due | taskStatus | task                            |
      | Today       | Task     | PURE Programs renewal offer for | Field Test | Ivana Antonijevic | 5   | Incomplete | PURE Programs renewal offer for |

    Then I click "PURE Programs renewal offer" with index 0
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Incomplete | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                           | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                       | agencyName |
      | Underwriting Referral - Renewal | PURE Programs renewal offer for | Complete   | Y                | Ivana Antonijevic | 5       |             | Customer  | PURE Programs renewal offer | Underc0de  |


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |


  @US51349
  Scenario Outline: TC_06 FL_001 | Verify that the old task For renewal offer is created on Diary tab page once Send renewal offer button is clicked. Before Feature date

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 340 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"


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
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    Then I create a renewal
    * I think for 10 to 15 seconds

    * I go to summary and click update renewal

    Then I review changes
    And I click renewed premium

    And I navigate to underwriting alerts tab
    Then I override and accept underwriting referrals

    And I navigate to underwriting alerts tab
    Then I navigate to policy image page
    Then I review changes
    And I click renewed premium

#    And I navigate to premium summary page

    And I click send renewal offer button
    * I think for 10 to 15 seconds

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I verify if element with message "Bind Request" is "Displayed" on the UI
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I click "diary"

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle                            | createdBy  | assignedTo                      | due | taskStatus | task                                 |
      | Today       | Task     | A Renewal Offer is now available for | Field Test | Ivana Antonijevic               | 5   | Incomplete | A renewal offer is now available for |
      | Today       | Task     | A Renewal Offer is now available for | Field Test | Surplus Underwriting Technician | 5   | Incomplete | A renewal offer is now available for |

    Then I click "A renewal offer is now available for" with index 0
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                                | taskStatus | taskInternalFlag | assignedTo        | dueDate | createdDate | relatedTo | notes                                | agencyName |
      | Underwriting Referral - Renewal | A Renewal Offer is now available for | Incomplete | Y                | Ivana Antonijevic | 5       |             | Customer  | A Renewal Offer is now available for | Underc0de  |

    Then I click "exit"

    Then I click "A renewal offer is now available for" with index 1
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title                                | taskStatus | taskInternalFlag | assignedTo                      | dueDate | createdDate | relatedTo | notes                                | agencyName |
      | Underwriting Referral - Renewal | A Renewal Offer is now available for | Incomplete | Y                | Surplus Underwriting Technician | 5       |             | Customer  | A Renewal Offer is now available for | Underc0de  |


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |


  @US51349 @Disabled
  Scenario Outline: TC_07 FL_001 | Verify that the task 'Renewal Offering' reminder is being sent on 30 days from renewal expire - Manual

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 334 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"


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
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    Then I create a renewal
    * I think for 10 to 15 seconds

    * I go to summary and click update renewal

    Then I review changes
    And I click renewed premium

    And I navigate to underwriting alerts tab
    Then I override and accept underwriting referrals

    And I navigate to underwriting alerts tab
    Then I navigate to policy image page
    Then I review changes
    And I click renewed premium

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

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
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I navigate to diary tab

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle                       | createdBy  | assignedTo        | due | taskStatus | task             |
      | Today       | Task     | PURE Programs renewal offer for | Super User | Ivana Antonijevic | 5   | Incomplete | Renewal Offering |

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US51349 @Disabled
  Scenario Outline: TC_08 FL_001 | Verify that the task 'Renewal Offering' reminder is being sent on 1 day from renewal expire - Manual

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 363 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Nemanja Pecic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"


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
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    Then I create a renewal
    * I think for 10 to 15 seconds

    * I go to summary and click update renewal

    Then I review changes
    And I click renewed premium

    And I navigate to underwriting alerts tab
    Then I override and accept underwriting referrals

    And I navigate to underwriting alerts tab
    Then I navigate to policy image page
    Then I review changes
    And I click renewed premium

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

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
    * I verify if element with message "Statement Of Diligent Effort - Florida" is "Displayed" on the UI

    Then I navigate to diary tab

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle                       | createdBy  | assignedTo        | due | taskStatus | task                            |
      | Today       | Task     | PURE Programs renewal offer for | Super User | Ivana Antonijevic | 5   | Incomplete | PURE Programs renewal offer for |

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |