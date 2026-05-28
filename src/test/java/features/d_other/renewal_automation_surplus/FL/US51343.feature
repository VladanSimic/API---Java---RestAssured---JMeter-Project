@HomeownersSurplus @US51343 @RenewalAutomation
Feature: HS FL -  Renewal Automation -  UW Task - Renewal Offer not sent when renewal date is 60 day out

  @US51343
  Scenario Outline: TC_01 FL_001 NFM | Verify that UW Task is created under transaction and assigned to Primary Surplus UW - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


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
    * I think for 10 to 15 seconds

    * I click auto create renewal nd
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    Then I click "xxx MGU Task Reminders"
    * I think for 10 to 15 seconds
    Then I click "diary"
    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI
    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |


    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |

  @US51343
  Scenario Outline: TC_01 FL_001 PSE | Verify that UW Task is created under transaction and assigned to Primary Surplus UW - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

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
    * I think for 10 to 15 seconds

    * I click auto create renewal nd
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    Then I click "xxx MGU Task Reminders"
    * I think for 10 to 15 seconds
    Then I click "diary"
    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI
    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |


    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US51343
  Scenario Outline: TC_02 FL_001 NFM | Verify that UW Task is created on Customer diary tab and assigned to Primary Surplus UW - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


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
    * I think for 10 to 15 seconds

    * I click auto create renewal nd
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    Then I click "xxx MGU Task Reminders"
    * I think for 10 to 15 seconds
    * I navigate to customer summary page
    * I think for 10 to 15 seconds

    Then I click "diary"

    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI

    Then I verify tasks table on Customer Diary
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | internalFlag | task                   | block            |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            | Y            | Renewal Offer Not Sent | incomplete tasks |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds


    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US51343
  Scenario Outline: TC_02 FL_001 PSE |Verify that UW Task is created on Customer diary tab and assigned to Primary Surplus UW - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

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
    * I think for 10 to 15 seconds

    * I click auto create renewal nd
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    Then I click "xxx MGU Task Reminders"
    * I think for 10 to 15 seconds
    * I navigate to customer summary page
    * I think for 10 to 15 seconds

    Then I click "diary"

    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI

    Then I verify tasks table on Customer Diary
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | internalFlag | task                   | block            |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            | Y            | Renewal Offer Not Sent | incomplete tasks |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |


    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US51343
  Scenario Outline: TC_03 FL_001 NFM | Confirm "UW Renewal Offer Not Sent)" is created, hidden until Primary Surplus UW logs in, and marked complete upon clicking "Mark Complete.- Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


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
    * I think for 10 to 15 seconds

    * I click auto create renewal nd
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    Then I click "xxx MGU Task Reminders"
    * I think for 10 to 15 seconds
    Then I click "diary"

    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI

    * I click "tasks"
    * I think for 10 to 15 seconds
##    Then I write text to "Task type to display" and value is "Pre-renewal tasks"

    * I think for 10 to 15 seconds
    * I verify if task element is "Not Displayed" on the UI

    * I logout

    * I am logged in to Pure as Primary Surplus UW

    * I click "tasks"
    * I think for 10 to 15 seconds
#    Then I write text to "Task type to display" and value is "Pre-renewal tasks"

    * I think for 10 to 15 seconds
    * I verify if task element is "Displayed" on the UI

    Then I verify tasks table on tasks page
      | createdDate | dueDate | creator | assignedTo | taskTitle              | relatedTo | taskStatus | taskType | block             |
      | Today       | 3       |         | Surplus UW | Renewal Offer Not Sent |           | Incomplete |          | pre-renewal tasks |

    Then I click on renewal offer not sent task

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I think for 7 to 10 seconds
    * I click "mark task complete"
    * I think for 15 to 20 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "exit"
    * I think for 10 to 15 seconds

    * I verify if task element is "Not Displayed" on the UI

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US51343
  Scenario Outline: TC_03 FL_001 PSE | Confirm "UW (Renewal Offer Not Sent)" is created, hidden until Primary Surplus UW logs in, and marked complete upon clicking "Mark Complete.- Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

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
    * I think for 10 to 15 seconds

    * I click auto create renewal nd
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    Then I click "xxx MGU Task Reminders"
    * I think for 10 to 15 seconds
    Then I click "diary"

    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI

    * I click "tasks"
    * I think for 10 to 15 seconds
#    Then I write text to "Task type to display" and value is "Pre-renewal tasks"

    * I think for 10 to 15 seconds
    * I verify if task element is "Not Displayed" on the UI

    * I logout

    * I am logged in to Pure as Primary Surplus UW

    * I click "tasks"
    * I think for 10 to 15 seconds
#    Then I write text to "Task type to display" and value is "Pre-renewal tasks"

    * I think for 10 to 15 seconds
    * I verify if task element is "Displayed" on the UI

    Then I verify tasks table on tasks page
      | createdDate | dueDate | creator | assignedTo | taskTitle              | relatedTo | taskStatus | taskType | block             |
      | Today       | 3       |         | Surplus UW | Renewal Offer Not Sent |           | Incomplete |          | pre-renewal tasks |

    Then I click on renewal offer not sent task

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I think for 7 to 10 seconds
    * I click "mark task complete"
    * I think for 15 to 20 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "exit"
    * I think for 10 to 15 seconds

    * I verify if task element is "Not Displayed" on the UI

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US51343
  Scenario Outline: TC_04 FL_001 NFM | Verify that UW (Renewal Offer Not Sent) Task is created and ">>> do task" navigates user to correct policy - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


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
    * I think for 10 to 15 seconds

    * I click auto create renewal nd
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    Then I click "xxx MGU Task Reminders"
    * I think for 10 to 15 seconds
    Then I click "diary"

    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI

    * I think for 5 to 7 seconds
    * I click "tasks"
    * I think for 10 to 15 seconds
#    Then I write text to "Task type to display" and value is "Pre-renewal tasks"

    * I think for 10 to 15 seconds
    * I verify if task element is "Not Displayed" on the UI

    * I logout

    * I am logged in to Pure as Primary Surplus UW

    * I click "tasks"
    * I think for 10 to 15 seconds
#    Then I write text to "Task type to display" and value is "Pre-renewal tasks"

    * I think for 10 to 15 seconds
    * I verify if task element is "Displayed" on the UI

    Then I click on renewal offer not sent task

    * I think for 5 to 10 seconds
    * I click "mark task complete"
    * I think for 5 to 10 seconds

    * I think for 5 to 10 seconds
    * I click ">>> do task"
    * I think for 5 to 10 seconds

    * I navigate to transactions or endorsements
    * I navigate to policy summary tab

    * I verify renewal policy id on transaction summary

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US51343
  Scenario Outline: TC_04 FL_001 PSE | Verify that UW Task is created and ">>> do task" navigates user to correct policy - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

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
    * I think for 10 to 15 seconds

    * I click auto create renewal nd
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    Then I click "xxx MGU Task Reminders"
    * I think for 10 to 15 seconds
    Then I click "diary"

    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI

    * I think for 5 to 7 seconds
    * I click "tasks"
    * I think for 10 to 15 seconds
#    Then I write text to "Task type to display" and value is "Pre-renewal tasks"

    * I think for 10 to 15 seconds
    * I verify if task element is "Not Displayed" on the UI

    * I logout

    * I am logged in to Pure as Primary Surplus UW

    * I click "tasks"
    * I think for 10 to 15 seconds
#    Then I write text to "Task type to display" and value is "Pre-renewal tasks"

    * I think for 10 to 15 seconds
    * I verify if task element is "Displayed" on the UI

    Then I click on renewal offer not sent task

    * I think for 5 to 10 seconds
    * I click "mark task complete"
    * I think for 5 to 7 seconds

    * I think for 5 to 10 seconds
    * I click ">>> do task"
    * I think for 5 to 10 seconds

    * I navigate to transactions or endorsements
    * I navigate to policy summary tab

    * I verify renewal policy id on transaction summary

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US51343
  Scenario Outline: TC_05 FL_001 NFM | Verify that UW Task is created and is assign to correct UW - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


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
    * I think for 10 to 15 seconds

    * I click auto create renewal nd
    * I think for 10 to 15 seconds
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"

    Then I click "xxx MGU Task Reminders"
    * I think for 10 to 15 seconds
    Then I click "diary"
    * I think for 10 to 15 seconds

    Then I click "Renewal Offer Not Sent"
    * I think for 10 to 15 seconds

    * I click "mark task complete"
    * I think for 5 to 10 seconds
    Then I click "exit"

    * I save primary UW from the task
    Then I navigate to agency underwriting tab
    And I verify that Primary UW is the assigned correctly

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |
