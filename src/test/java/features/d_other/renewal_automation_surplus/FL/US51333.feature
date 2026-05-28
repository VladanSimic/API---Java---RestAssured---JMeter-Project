@HomeownersSurplus @US51333 @RenewalAutomation @tEST123
Feature: HS FL - Renewal Automation - Generating Renewal Offer (Batch) and Send Renewal Offer to Member via SourceCorp

  @US51333
  Scenario Outline: TC_01 FL_001 | Verify 'Send Renewal batch' button generates a renewal offer when in rated status - Send Renewal Offer status should be 'Ready to Send' - 60 days

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

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times

    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView | block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           | docusign documents |

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P16  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US51333
  Scenario Outline: TC_02 FL_001 | Verify  'Send Renewal batch' button generates  a renewal offer when in rated status - Send Renewal offer Status should be 'Ready to Send' - 55 days


    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past


    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


    * I set "Risk_Addresses_Replacement_Cost" to "6000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"

    * I set "Construction_Details_Year_Built" to "2000"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2001"
    * I set "Wind_Mitigation_Roof_Covering" to "Wood Shake"
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
    * I write text to "Distance to Coast override" and value is "> 5 miles"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times

    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    And I select a transaction "Renewal"
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           |docusign documents |

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333
  Scenario Outline: TC_03 FL_001 | Verify  'Send Renewal batch' button generates  a renewal offer when in rated status - Send Renewal offer Status should be 'Ready to Send' - Condo - 55days

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Risk_Addresses_Contents" to "4700000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"


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

    * I create a new "HS" quote

    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    * I write text to "Distance to Coast override" and value is "> 5 miles"

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times

    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           |docusign documents |

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333
  Scenario Outline: TC_04 FL_001 | Verify 'Send Renewal batch' button is NOT generating a renewal offer when transaction is in Created status

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

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times

    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Not Displayed" on the UI

#    Marking Task complete to avoid huge amount of task generated and email sending
    * I click "diary"
    Then I click "Renewal Offer Not Sent"
    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333
  Scenario Outline: TC_05 FL_001 | Verify 'Send Renewal batch' button is NOT generating a renewal offer when transaction is in Referred status

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

    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times

    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Not Displayed" on the UI

    #    Marking Task complete to avoid huge amount of task generated and email sending
    * I click "diary"
    Then I click "Renewal Offer Not Sent"
    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |


    Examples:
      | user | AddressLine    | City            | Zip   |
      | P3   | 5240 Kim Court | West Palm Beach | 33414 |

  @US51333
  Scenario Outline: TC_06 FL_001 | Verify 'Send Renewal batch' button is NOT generating a renewal offer when transaction is in Review Required status

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

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Not Displayed" on the UI

    #    Marking Task complete to avoid huge amount of task generated and email sending
    * I click "diary"
    Then I click "Renewal Offer Not Sent"
    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US51333
  Scenario Outline: TC_07 FL_001 | Verify 'Send Renewal batch' button is NOT generating a renewal offer when transaction is in 61 days from renewal eff date

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 304 days in the past
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

    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Not Displayed" on the UI

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P16  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US51333
  Scenario Outline: TC_08 FL_001 NFM | Verify Grand Total Premium matches premium in renewal offer.

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

    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I navigate to premium summary page
    * I get renewal grand total from UI
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           |docusign documents |

    * I download the file "Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P16  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US51333
  Scenario Outline: TC_08 FL_001 Palomar| Verify Grand Total Premium matches premium in renewal offer.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"

    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote

    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    * I write text to "Distance to Coast override" and value is "> 5 miles"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal
    * I think for 10 to 15 seconds

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I navigate to premium summary page
    * I get renewal grand total from UI
    * I navigate to documents tab

    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           |docusign documents |

    * I download the file "Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P16  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US51333
  Scenario Outline: TC_08 FL_001 PSE | Verify Grand Total Premium matches premium in renewal offer.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"

    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
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

    * I create a renewal
    * I go to summary and click update renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy

    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    * I navigate to premium summary page
    * I get renewal grand total from UI

    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           |docusign documents |

    * I download the file "Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333
  Scenario Outline: TC_08 FL_001 ASIC | Verify Grand Total Premium matches premium in renewal offer.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

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

    * I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times

    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    * I navigate to premium summary page
    * I get renewal grand total from UI

    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           |docusign documents |

    * I download the file "Renewal Offer" and verify keywords
      | Grand Total ${grandTotalRN} |

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |


  @US51333
  Scenario Outline: TC_09 FL_001 | Verify that this batch only triggers once on a policy and after initial offer is sent, in case any docs or changes made, UW or Ops need to manually generate the updated ren offer

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"

    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
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

    * I click auto create renewal
    * I think for 10 to 15 seconds

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 20 times
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
    And I navigate to policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds
    And I select a transaction "Renewal"
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           |docusign documents |

    * I think for 10 to 15 seconds

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
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
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is displayed 1 times

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |


  @US51333
  Scenario Outline: TC_10 FL_001 | Verify if 'Renewal Offer' is generated manually, Send renewal batch button should not generate an additional Renewal Offer

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
    * I navigate to premium summary page

    * I click send renewal offer button
    Then I think for 25 to 30 seconds
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is displayed 1 times

    * I think for 10 to 10 seconds and i keep clicking home tab for 55 times

    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds

    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"

    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is displayed 1 times

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           |docusign documents |

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P16  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US51333
  Scenario Outline: TC_11 FL_001 | Verify 'Send Renewal Batch' doesn't generate offers in 'Review Required' status, but does once referrals are cleared and status is 'Rated'.

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

    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID
    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    And I select a transaction "Renewal"
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Not Displayed" on the UI

    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I navigate to underwriting alerts tab
    And I go to summary and click update renewal
    * I review changes
    * I click renewed premium
    * I think for 15 to 20 seconds
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I navigate to Home
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 10 to 15 seconds
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
    * I navigate to documents tab
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is displayed 1 times

    Then I verify document table content
      | documentID | documentType     | description | documentLink                               | documentGenerationStatus | documentDeliveryStatus | deliveryDateTime | internalView |block              |
      |            | Document Package | Renewal     | Home Surplus Lines Package - Renewal Offer | Completed                | Ready to Send          |                  | No           |docusign documents |

    #    Marking Task complete to avoid huge amount of task generated and email sending
    * I click "diary"
    Then I click "Renewal Offer Not Sent"
    * I click "mark task complete"
    * I think for 10 to 15 seconds

    Then I verify task contents
      | taskType               | title                  | taskStatus | taskInternalFlag | assignedTo | dueDate | createdDate | relatedTo | notes                  | agencyName |
      | Renewal Offer Not Sent | Renewal Offer Not Sent | Complete   | Y                | Surplus UW | 3       |             | Customer  | Renewal Offer Not Sent | Underc0de  |

    Examples:
      | user | AddressLine      | City      | Zip   |
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |

  @US51333
  Scenario Outline: TC_12 FL_001 | Verify once renewal transaction is expired, no Renewal offer is generated overnight.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 366 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"
    * I set "Underwriting_Company_Manager_Override" to "No"

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
    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P16  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US51333 @Disabled
  Scenario Outline: TP_01 FL_001 | Verify 'Send Renewal batch' button generates a renewal offer when in rated status - Send Renewal Offer status should be 'Ready to Send' - 60 days

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

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P26  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US51333 @Disabled
  Scenario Outline: TP_02 FL_001 | Verify  'Send Renewal batch' button generates  a renewal offer when in rated status - Send Renewal offer Status should be 'Ready to Send' - 55 days


    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past


    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"


    * I set "Risk_Addresses_Replacement_Cost" to "6000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"

    * I set "Construction_Details_Year_Built" to "2000"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2001"
    * I set "Wind_Mitigation_Roof_Covering" to "Wood Shake"
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
    * I write text to "Distance to Coast override" and value is "> 5 miles"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I create a renewal

    * I think for 10 to 15 seconds

    * I select a transaction "Renewal"
    * I navigate to policy image page
    Then I fill out HS quote application page
    * I review changes
    * I click renewed premium

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"


    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333 @Disabled
  Scenario Outline: TP_03 FL_001 | Verify  'Send Renewal batch' button generates  a renewal offer when in rated status - Send Renewal offer Status should be 'Ready to Send' - Condo - 55days

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Risk_Addresses_Contents" to "4700000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"


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

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    * I write text to "Distance to Coast override" and value is "> 5 miles"

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I create a renewal

    * I select a transaction "Renewal"
    * I navigate to policy image page
    Then I fill out HS quote application page
    * I review changes
    * I click renewed premium

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333 @Disabled
  Scenario Outline: TP_04 FL_001 | Verify 'Send Renewal batch' button is NOT generating a renewal offer when transaction is in Created status

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

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333 @Disabled
  Scenario Outline: TP_05 FL_001 | Verify 'Send Renewal batch' button is NOT generating a renewal offer when transaction is in Referred status

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

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333 @Disabled
  Scenario Outline: TP_06 FL_001 | Verify 'Send Renewal batch' button is NOT generating a renewal offer when transaction is in Review Required status

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

  @US51333 @Disabled
  Scenario Outline: TP_07 FL_001 | Verify 'Send Renewal batch' button is NOT generating a renewal offer when transaction is in 61 days from renewal eff date

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 304 days in the past
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

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P26  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US51333 @Disabled
  Scenario Outline: TP_08 FL_001 NFM | Verify Grand Total Premium matches premium in renewal offer.

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

    * I create a renewal
    * I think for 10 to 15 seconds

    * I select a transaction "Renewal"
    * I navigate to policy image page
    Then I fill out HS quote application page
    * I review changes
    * I click renewed premium

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P26  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US51333 @Disabled
  Scenario Outline: TP_08 FL_001 Palomar| Verify Grand Total Premium matches premium in renewal offer.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"

    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    * I write text to "Distance to Coast override" and value is "> 5 miles"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements
    * I think for 10 to 15 seconds

    * I create a renewal
    * I think for 10 to 15 seconds

    * I select a transaction "Renewal"
    * I navigate to policy image page
    Then I fill out HS quote application page
    * I review changes
    * I click renewed premium

    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"


    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333 @Disabled
  Scenario Outline: TP_08 FL_001 PSE | Verify Grand Total Premium matches premium in renewal offer.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"

    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
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

    * I create a renewal
    * I think for 10 to 15 seconds

    * I select a transaction "Renewal"
    * I navigate to policy image page
    Then I fill out HS quote application page
    * I review changes
    * I click renewed premium

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |

  @US51333 @Disabled
  Scenario Outline: TP_08 FL_001 ASIC | Verify Grand Total Premium matches premium in renewal offer.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

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

    * I create a renewal
    * I think for 10 to 15 seconds

    * I select a transaction "Renewal"
    * I navigate to policy image page
    Then I fill out HS quote application page
    * I review changes
    * I click renewed premium

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"


    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |


  @US51333 @Disabled
  Scenario Outline: TP_09 FL_001 | Verify that this batch only triggers once on a policy and after initial offer is sent, in case any docs or changes made, UW or Ops need to manually generate the updated ren offer


    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_QA" to "Ivana Antonijevic"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"

    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
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

    * I create a renewal
    * I think for 10 to 15 seconds

    * I select a transaction "Renewal"
    * I navigate to policy image page
    Then I fill out HS quote application page
    * I review changes
    * I click renewed premium

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"


    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |


  @US51333 @Disabled
  Scenario Outline: TP_10 FL_001 | Verify if 'Renewal Offer' is generated manually, Send renewal batch button should not generate an additional Renewal Offer

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

    * I select a transaction "Renewal"
#    * I navigate to policy image page
#    Then I fill out HS quote application page
#    * I review changes
#    * I click renewed premium

    * I navigate to premium summary page

    * I click send renewal offer button
    Then I think for 25 to 30 seconds
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is displayed 1 times

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P8   | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US51333 @Disabled
  Scenario Outline: TP_11 FL_001 | Verify 'Send Renewal Batch' doesn't generate offers in 'Review Required' status, but does once referrals are cleared and status is 'Rated'.

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

  @US51333 @Disabled
  Scenario Outline: TP_12 FL_001 | Verify once renewal transaction is expired, no Renewal offer is generated overnight.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 366 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"
    * I set "Underwriting_Company_Manager_Override" to "No"

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

    * I create a renewal
    * I think for 10 to 15 seconds

    * I select a transaction "Renewal"
    * I navigate to policy image page
    Then I fill out HS quote application page
    * I review changes
    * I click renewed premium

    Then I navigate to underwriting alerts tab
    And I accept underwriting referrals

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P8   | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |
