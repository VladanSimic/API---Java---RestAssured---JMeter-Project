@HomeownersSurplus @US54053 @RenewalAutomation
Feature: FL HS - Renewal Automation - UW Task Reminder when Renewal Offer is not sent out at 60 days

  @US54053
  Scenario Outline: TC_01 FL_001 | Verify task is NOT created with Task batch button when 62 from renewal effective date

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 303 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    * I think for 10 to 10 seconds and i keep clicking home tab for 60 times

    * I navigate to Home
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I think for 5 to 8 seconds
    Then I click "diary"
    * I verify if element with message "Renewal Offer Not Sent" is "Not Displayed" on the UI


    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US54053
  Scenario Outline: TC_02 FL_001 | Verify task is created with Task batch button when 60 from renewal effective date

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

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    * I think for 10 to 10 seconds and i keep clicking home tab for 60 times

    * I navigate to Home
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 15 to 20 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I think for 5 to 8 seconds
    Then I click "diary"

    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI
    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | task                   |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            | Renewal Offer Not Sent |

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


  @US54053
  Scenario Outline: TC_03 FL_001 | Verify task is created with Task batch button when 55 from renewal effective date

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

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    * I think for 10 to 10 seconds and i keep clicking home tab for 60 times

    * I navigate to Home
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I think for 5 to 8 seconds
    Then I click "diary"
    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI
    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | task                   |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            | Renewal Offer Not Sent |

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

  @US54053
  Scenario Outline: TC_04 FL_001 | Verify that the task is Created when transaction is in status Created - Manual verification of emails

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 310 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    * I think for 10 to 10 seconds and i keep clicking home tab for 25 times
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Offer Batch"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 10 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I think for 5 to 8 seconds
    Then I click "diary"
    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI
    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | task                   |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            | Renewal Offer Not Sent |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P8   | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US54053
  Scenario Outline: TC_05 FL_001 | Verify that the task is Created when transaction is in status ReviewRequired - Manual verification of emails

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

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    * I think for 10 to 10 seconds and i keep clicking home tab for 60 times

    * I navigate to Home
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I think for 5 to 8 seconds
    Then I click "diary"
    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI
    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | task                   |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            | Renewal Offer Not Sent |

    Then I click "Renewal Offer Not Sent"
    * I think for 10 to 15 seconds

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "exit"

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US54053
  Scenario Outline: TC_06 FL_001 | Verify that the task is Created when transaction is in status Referred

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
    * I navigate to Home Surplus Lines Policy Page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"

    * I think for 10 to 10 seconds and i keep clicking home tab for 60 times

    * I navigate to Home
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I think for 5 to 8 seconds
    Then I click "diary"
    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI
    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | task                   |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            | Renewal Offer Not Sent |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |

  @US54053
  Scenario Outline: TC_07 FL_001 | Verify that the task is not Created when transaction is in status Rated

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 310 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


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

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I think for 10 to 10 seconds and i keep clicking home tab for 60 times
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
    * I verify if element with message "Renewal Offer Not Sent" is "Not Displayed" on the UI

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P8   | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US54053
  Scenario Outline: TC_08 FL_001 | Verify that the task is Created only once with Renewal offer batch button

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
    * I navigate to Home Surplus Lines Policy Page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"

    * I think for 10 to 10 seconds and i keep clicking home tab for 60 times

    * I navigate to Home
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I think for 5 to 8 seconds
    Then I click "diary"
    * I verify if element with message "Renewal Offer Not Sent" is "Displayed" on the UI
    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle              | createdBy | assignedTo | due | taskStatus | task                   |
      | Today       | Task     | Renewal Offer Not Sent |           | Surplus UW | 3   |            | Renewal Offer Not Sent |

    Then I click "Renewal Offer Not Sent"

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Incomplete | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    And I navigate to Home
    Then I navigate to user setup page
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
    * I verify if element with message "Renewal Offer Not Sent" is displayed 1 times


    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |

  @US54053 @Disabled
  Scenario Outline: TP_01 FL_001 | Verify email reminders are not being sent after policy is marked as expired. - day before policy expiration - Manual verification

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 363 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US54053 @Disabled
  Scenario Outline: TP_02 FL_001 | Verify task is NOT created with Task batch button when 62 from renewal effective date

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 304 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US54053 @Disabled
  Scenario Outline: TP_03 FL_001 | Verify task is created with Task batch button when 60 from renewal effective date

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

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US54053 @Disabled
  Scenario Outline: TP_04 FL_001 | Verify task is created with Task batch button when 55 from renewal effective date

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

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US54053 @Disabled
  Scenario Outline: TP_05 FL_001 | Verify that the task is Created when transaction is in status Created - Manual verification of emails

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 310 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P8   | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US54053 @Disabled
  Scenario Outline: TP_06 FL_001 | Verify that the task is Created when transaction is in status ReviewRequired - Manual verification of emails

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

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US54053 @Disabled
  Scenario Outline: TP_07 FL_001 | Verify that the task is Created when transaction is in status Referred

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

    Then I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"
    * I go to summary and click update renewal
    Then I navigate to policy image page
    * I fill out HS quote application page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"


    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |

  @US54053 @Disabled
  Scenario Outline: TP_08 FL_001 | Verify that the task is Not Created when transaction is in status Rated

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

    Then I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"
    * I go to summary and click update renewal
    Then I navigate to policy image page
    * I fill out HS quote application page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"


    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |

  @US54053 @Disabled
  Scenario Outline: TP_01 FL_001 | Verify email reminders are not being sent after policy is marked as expired. - day before policy expiration - Manual verification

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set Effective Date 363 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US54053 @Disabled
  Scenario Outline: TP_02 FL_001 | Verify task is NOT created with Task batch button when 62 from renewal effective date

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 304 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US54053 @Disabled
  Scenario Outline: TP_03 FL_001 | Verify task is created with Task batch button when 60 from renewal effective date

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

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |


  @US54053 @Disabled
  Scenario Outline: TP_04 FL_001 | Verify task is created with Task batch button when 55 from renewal effective date

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

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US54053 @Disabled
  Scenario Outline: TP_05 FL_001 | Verify that the task is Created when transaction is in status Created - Manual verification of emails

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 310 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID


    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P8   | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US54053 @Disabled
  Scenario Outline: TP_06 FL_001 | Verify that the task is Created when transaction is in status ReviewRequired - Manual verification of emails

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

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


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
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I click auto create renewal
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReviewRequired"

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US54053 @Disabled
  Scenario Outline: TP_07 FL_001 | Verify that the task is Created when transaction is in status Referred

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

    Then I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"
    * I go to summary and click update renewal
    Then I navigate to policy image page
    * I fill out HS quote application page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"


    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |

  @US54053 @Disabled
  Scenario Outline: TP_08 FL_001 | Verify that the task is Not Created when transaction is in status Rated

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

    Then I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"
    * I go to summary and click update renewal
    Then I navigate to policy image page
    * I fill out HS quote application page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"


    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |
