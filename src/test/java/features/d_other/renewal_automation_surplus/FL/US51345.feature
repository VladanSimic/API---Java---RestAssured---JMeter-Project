@HomeownersSurplus @US55119 @RenewalAutomation
Feature: HS FL -  Renewal Automation - Task Generation due to UW Referrals and Review Required Status


  @US51345
  Scenario:TC_01| Verify that the task 'Renewal Review for' is created once renewal image is created - Transaction Level - Surplus UW Tech

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

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 10 times
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Offer Batch"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 40 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    Then I navigate to underwriting alerts tab
    * I think for 10 to 11 seconds
    And I get referral list from underwriting alerts

    And I verify if element with message "Renewal ROL increased >15% from prior term." is "Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I click "diary"

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle          | createdBy  | assignedTo                      | due | taskStatus | task               |
      | Today       | Task     | Renewal Review for | Super User | Surplus Underwriting Technician | 15  | Incomplete | Renewal Review for |

    And I click "Renewal Review for"
    * I think for 5 to 8 seconds

    Then I verify task contents
      | taskType                        | title              | taskStatus | taskInternalFlag | assignedTo                      | dueDate | createdDate | relatedTo | notes              | agencyName |
      | Underwriting Referral - Renewal | Renewal Review for | Incomplete | Y                | Surplus Underwriting Technician | 15      |             | Customer  | Renewal Review for | Underc0de  |

    When I verify all texts from hashmap with key "Referral_List" are displayed on the page

    * I click "mark task complete"
    * I think for 10 to 15 seconds

  @US51345
  Scenario:TC_02 | Verify that the task 'Renewal Review for' is created once renewal image is created - Transaction Level - Primary Surplus UW

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

    * I set "Protection_Fire_Alarm" to "No"
    * I set "Protection_Burglar_Alarm" to "No"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus


    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 40 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    Then I navigate to underwriting alerts tab
    * I think for 10 to 11 seconds
    And I get referral list from underwriting alerts

    And I verify if element with message "Renewal ROL increased >15% from prior term." is "Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I click "diary"

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle          | createdBy  | assignedTo | due | taskStatus | task               |
      | Today       | Task     | Renewal Review for | Super User | Surplus UW | 15  | Incomplete | Renewal Review for |

    And I click "Renewal Review for"
    * I think for 5 to 8 seconds

    Then I verify task contents
      | taskType                        | title              | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes              | agencyName |
      | Underwriting Referral - Renewal | Renewal Review for | Incomplete | Y                | Surplus UW | 15      |             | Customer  | Renewal Review for | Underc0de  |

    When I verify all texts from hashmap with key "Referral_List" are displayed on the page

    * I click "mark task complete"
    * I think for 10 to 15 seconds

  @US51345
  Scenario:TC_03 | Verify that the task 'Renewal Review for' is created once renewal image is created - Account level

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

    * I set "Protection_Fire_Alarm" to "No"
    * I set "Protection_Burglar_Alarm" to "No"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 40 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    Then I navigate to underwriting alerts tab
    * I think for 10 to 11 seconds
    And I get referral list from underwriting alerts

    And I verify if element with message "Renewal ROL increased >15% from prior term." is "Displayed" on the UI

    Then I navigate to customer summary page

    * I think for 5 to 7 seconds
    Then I click "diary"
    * I think for 10 to 15 seconds

    Then I verify tasks table on Customer Diary
      | createdDate | taskType | taskTitle          | createdBy | assignedTo | due | taskStatus | internalFlag | task               | block            |
      | Today       | Task     | Renewal Review for |           | Surplus UW | 15  | Incomplete | Y            | Renewal Review for | incomplete tasks |

    Then I click "Renewal Review for" with index 0
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title              | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes              | agencyName |
      | Underwriting Referral - Renewal | Renewal Review for | Incomplete | Y                | Surplus UW | 15      |             | Customer  | Renewal Review for | Underc0de  |

    When I verify all texts from hashmap with key "Referral_List" are displayed on the page

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title              | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes              | agencyName |
      | Underwriting Referral - Renewal | Renewal Review for | Complete   | Y                | Surplus UW | 15      |             | Customer  | Renewal Review for | Underc0de  |


  @US51345
  Scenario:TC_04 | Verify that the task 'Renewal Review for' is created once renewal image is created - Tasks Page - Primary Surplus UW

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

    * I set "Protection_Fire_Alarm" to "No"
    * I set "Protection_Burglar_Alarm" to "No"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 40 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    Then I navigate to underwriting alerts tab
    * I think for 10 to 11 seconds
    And I get referral list from underwriting alerts

    And I verify if element with message "Renewal ROL increased >15% from prior term." is "Displayed" on the UI

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 45 times

    * I logout

    * I am logged in to Pure as "Surplus UW"
    * I think for 10 to 15 seconds
    * I click "tasks"
    * I think for 10 to 15 seconds
    And I sort renewal tasks descending
    * I think for 5 to 7 seconds
    * I verify if task element is "Displayed" on the UI

    Then I verify tasks table on tasks page
      | createdDate | dueDate | creator    | assignedTo | taskTitle          | relatedTo          | taskStatus | taskType | block         |
      | Today       | 5       | Super User | Surplus UW | Renewal Review for | Renewal Review for | Incomplete |          | renewal tasks |

    Then I click on renewal offer not sent task
    * I think for 10 to 15 seconds

    Then I click "summary"

    Then I verify task contents
      | taskType                        | title              | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes              | agencyName |
      | Underwriting Referral - Renewal | Renewal Review for | Incomplete | Y                | Surplus UW | 15      |             | Customer  | Renewal Review for | Underc0de  |

    When I verify all texts from hashmap with key "Referral_List" are displayed on the page

    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType                        | title              | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes              | agencyName |
      | Underwriting Referral - Renewal | Renewal Review for | Complete   | Y                | Surplus UW | 15      |             | Customer  | Renewal Review for | Underc0de  |


  @US51345
  Scenario:TC_05 | Verify that the task 'Renewal Review for' is completed, and user add changes to renewal that trigger a referral, a new task I created.

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

    * I set "Protection_Fire_Alarm" to "No"
    * I set "Protection_Burglar_Alarm" to "No"

    * I set "Appraisal_Contact_Email" to "npecic@pureinsurance.com"
    * I set "Opt_Out_Of_Delivery" to "No"

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

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals

    Then I bind a quote for surplus

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 40 times
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    Then I navigate to underwriting alerts tab
    * I think for 10 to 11 seconds
    And I get referral list from underwriting alerts

    And I verify if element with message "Renewal ROL increased >15% from prior term." is "Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I click "diary"

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle          | createdBy  | assignedTo                      | due | taskStatus | task               |
      | Today       | Task     | Renewal Review for | Super User | Surplus Underwriting Technician | 15  | Incomplete | Renewal Review for |

    Then I go to summary and click update renewal

    And I navigate to Home Surplus Lines Policy Page

    Then I override underwriting company to "Palomar Excess and Surplus Insurance Company"


    And I review changes
    * I think for 10 to 15 seconds
    And I review changes
    Then I click renewed premium
    * I think for 10 to 15 seconds
    Then I click "diary"

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle          | createdBy  | assignedTo | due | taskStatus | task               |
      | Today       | Task     | Renewal Review for | Super User | Surplus UW | 15  | Incomplete | Renewal Review for |
      | Today       | Task     | Renewal Review for | Super User | Surplus UW | 15  | Incomplete | Renewal Review for |


  @US51345
  Scenario:TC_06 | Verify that the task 'Renewal Review for' is created once renewal image is created - Transaction Level - Manual renewal -  Surplus UW Tech

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
    And I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    * I review changes
    * I click renewed premium

    * I think for 10 to 11 seconds

    Then I navigate to underwriting alerts tab
    * I think for 10 to 11 seconds
    And I get referral list from underwriting alerts

    And I verify if element with message "Renewal ROL increased >15% from prior term." is "Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I click "diary"

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle          | createdBy  | assignedTo                      | due | taskStatus | task               |
      | Today       | Task     | Renewal Review for | Super User | Surplus Underwriting Technician | 15  | Incomplete | Renewal Review for |


  @US51345
  Scenario:TC_07 | Verify that the task 'Renewal Review for' is created once renewal image is created - Transaction Level - Manual renewal -  Primary Surplus UW

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

    * I set "Protection_Fire_Alarm" to "No"
    * I set "Protection_Burglar_Alarm" to "No"

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
    And I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    * I review changes
    * I click renewed premium

    * I think for 10 to 11 seconds

    Then I navigate to underwriting alerts tab
    * I think for 10 to 11 seconds
    And I get referral list from underwriting alerts

    And I verify if element with message "Renewal ROL increased >15% from prior term." is "Displayed" on the UI

    * I think for 10 to 15 seconds
    Then I click "diary"

    Then I verify carrier all tasks table
      | createdDate | taskType | taskTitle          | createdBy  | assignedTo | due | taskStatus | task               |
      | Today       | Task     | Renewal Review for | Super User | Surplus UW | 15  | Incomplete | Renewal Review for |