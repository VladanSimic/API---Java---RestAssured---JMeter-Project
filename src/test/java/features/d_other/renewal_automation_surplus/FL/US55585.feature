@HomeownersSurplus @US55585 @RenewalAutomation
Feature: [Continued] HS FL - Renewal Automation - Actions to Stop Renewal Offer Not Sent Daily Reminder


  @US55585
  Scenario Outline: TC_01 | Verify that the task is marked as 'Complete' after Renewal offer is generated (Transaction Level)

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"
    * I set "Licensed_Producer_AWS_STG" to "Mirjana Nikolic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"


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
    * I verify carrier partner "Accredited Specialty Insurance Company"

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
    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"

    * I think for 10 to 10 seconds and i keep clicking home tab for 5 times

    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Offer Batch"
    * I think for 10 to 15 seconds
    Then I navigate to Home
    * I think for 4 to 6 seconds

    * I click "tasks"
    * I think for 10 to 15 seconds
    * I click "xxxRnOfferNotSentEmail"
    * I think for 10 to 15 seconds

    Then I navigate to Home
    * I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 15 to 20 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I think for 15 to 20 seconds
    Then I click "diary"

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | task                   |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   | Incomplete | Renewal Offer Not Sent |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I think for 5 to 6 seconds
    * I click "details"
    * I think for 5 to 6 seconds
    * I write date to field "Due Date" with offset -1

    * I click ">>> save changes"
    * I think for 5 to 6 seconds
    * I click "exit"
    * I think for 10 to 15 seconds

    When I navigate to underwriting alerts tab
    Then I accept underwriting referrals

    * I think for 10 to 15 seconds
    Then I click send renewal offer button

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 15 seconds

    * I click "tasks"
    * I think for 10 to 15 seconds
    * I click "xxxRnOfferNotSentEmail"
    * I think for 10 to 15 seconds

    Then I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I think for 10 to 15 seconds
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"
    * I think for 5 to 8 seconds
    Then I click "diary"

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | task                   |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | -1  | Complete   | Renewal Offer Not Sent |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | -1      |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |


  @US55585
  Scenario Outline: TC_02 | Verify that the task is marked as 'Complete' after Renewal offer is generated (Customer Level)

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 305 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"
    * I set "Licensed_Producer_AWS_STG" to "Mirjana Nikolic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"


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
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"

    * I think for 10 to 10 seconds and i keep clicking home tab for 30 times

    * I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    Then I click "diary"
    * I think for 10 to 15 seconds

    Then I verify tasks table on Customer Diary
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | internalFlag | task                   | block            |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   | Incomplete | Y            | Renewal Offer Not Sent | incomplete tasks |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I think for 5 to 6 seconds
    * I click "details"
    * I think for 5 to 6 seconds
    * I write date to field "Due Date" with offset -1

    * I click ">>> save changes"
    * I think for 5 to 6 seconds
    * I click "exit"
    * I think for 10 to 15 seconds

    And I navigate to customer summary page

    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    When I navigate to underwriting alerts tab
    Then I accept underwriting referrals

    * I think for 10 to 15 seconds
    Then I click send renewal offer button

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 15 seconds

    * I click "tasks"
    * I think for 10 to 15 seconds
    * I click "xxxRnOfferNotSentEmail"
    * I think for 10 to 15 seconds

    Then I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds

    * I think for 15 to 16 seconds
    Then I click "diary"

    Then I verify tasks table on Customer Diary
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | internalFlag | task                   | block           |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | -1  | Complete   | Y            | Renewal Offer Not Sent | completed tasks |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | -1      |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |


  @US55585
  Scenario Outline: TC_03 | Verify that the task is marked as 'Complete' after Renewal offer is generated (Primary UW - Tasks Level)

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 310 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"
    * I set "Licensed_Producer_AWS_STG" to "Mirjana Nikolic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"


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
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"

    * I think for 10 to 10 seconds and i keep clicking home tab for 25 times

    * I logout

    * I am logged in to Pure as Primary Surplus UW
    * I think for 10 to 15 seconds
    * I click "tasks"
    * I think for 10 to 15 seconds
    And I sort pre renewal tasks descending
    * I think for 5 to 7 seconds
    * I verify if task element is "Displayed" on the UI

    Then I verify tasks table on tasks page
      | createdDate | dueDate | creator | assignedTo | taskTitle              | relatedTo | taskStatus | taskType | block             |
      | Today       | 3       |         | Surplus UW | Renewal Offer Not Sent | Customer  | Incomplete |          | pre-renewal tasks |

    Then I click on renewal offer not sent task

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I think for 5 to 6 seconds
    * I click "details"
    * I think for 5 to 6 seconds
    * I write date to field "Due Date" with offset -1

    * I click "save changes"
    * I think for 5 to 6 seconds
    * I click "exit"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I think for 10 to 15 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    When I navigate to underwriting alerts tab
    Then I accept underwriting referrals

    * I think for 10 to 15 seconds
    Then I click send renewal offer button

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    When I navigate to Home
    * I think for 10 to 15 seconds

    * I click "tasks"
    * I think for 10 to 15 seconds
    * I click "xxxRnOfferNotSentEmail"
    * I think for 10 to 15 seconds
    Then I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 10 times

    * I click "tasks"
    * I think for 5 to 8 seconds
    And I sort pre renewal tasks descending
    * I think for 5 to 7 seconds
    * I verify if task element is "Not Displayed" on the UI


    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |

  @US55585
  Scenario Outline: TC_04 | Verify that the task is marked as 'Complete' after Renewal transaction expires (Manual verification day after)

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 364 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"
    * I set "Licensed_Producer_AWS_STG" to "Mirjana Nikolic"
    * I set "Advisor_Servicer_AWS_STG" to "Ivana Antonijevic"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"


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
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"

    * I think for 10 to 10 seconds and i keep clicking home tab for 7 times

    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Offer Batch"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I think for 5 to 8 seconds
    Then I click "diary"
    * I think for 5 to 8 seconds

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | task                   |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   | Incomplete | Renewal Offer Not Sent |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |


    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |
