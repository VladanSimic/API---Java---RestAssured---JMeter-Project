@HomeownersSurplus @US52879 @RenewalAutomation @tEST123
Feature: HS FL - Renewal Automation - Send Renewal Image to External Rating Engine and Receive Data Back

  @US52879
  Scenario Outline: TC_01 FL_001 NFM | Verify that  Automated Renewal Triggers Rating via Coherent (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
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
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"
    * I navigate to policy image page without save

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |


  @US52879
  Scenario Outline: TC_01 FL_001 Palomar | Verify that  Automated Renewal Triggers Rating via Coherent (Palomar) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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
#    When I navigate to location page
#
    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements


    * I verify if element with message "Renewal" is "Displayed" on the UI
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"
    * I navigate to policy image page without save

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_01 FL_001 PSE | Verify that  Automated Renewal Triggers Rating via Coherent (PSE) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 5 times
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 15 to 20 seconds
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
#    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"
    * I navigate to policy image page without save

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_01 FL_001 ASIC | Verify that  Automated Renewal Triggers Rating via Coherent (Accredited) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to customer page
    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"
    * I navigate to policy image page without save

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_02 FL_001 NFM | Verify that Automated Renewal Triggers Rating via Coherent (NFM) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "100"
    * I set "Manuscript_Endorsements_Annual_Manual_Premium_2" to "100"
    * I set "Manuscript_Endorsements_Annual_Manual_Premium_3" to "100"

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionReferred"
    And I select a transaction "Renewal"
    * I navigate to policy image page without save

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_02 FL_001 Palomar | Verify that  Automated Renewal Triggers Rating via Coherent (Palomar) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Underwriting_Company_Manager_Override" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"
    * I navigate to policy image page without save

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_02 FL_001 PSE | Verify that  Automated Renewal Triggers Rating via Coherent (PSE) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I think for 10 to 10 seconds and i keep clicking home tab for 10 times

    * I navigate to Home
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 15 to 20 seconds

    * I navigate to Home
    * I think for 16 to 18 seconds
    And I navigate to customers page
    * I think for 20 to 25 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I think for 10 to 15 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"
    * I navigate to policy image page without save

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_02 FL_001 ASIC | Verify that  Automated Renewal Triggers Rating via Coherent (Accredited) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past
    * I set "Risk_Addresses_Contents" to "4700000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "Underwriting_Company_Manager_Override" to "No"


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
    * I navigate to location page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Accredited Specialty Insurance Company"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"
    And I select a transaction "Renewal"
    * I navigate to policy image page without save

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_03 FL_001 NFM | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
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
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 1 premium for comparison
    * I save "Renewal" transaction 1 total premium for comparison

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_03 FL_001 Palomar | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (Palomar) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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
#    When I navigate to location page
#
    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 1 premium for comparison
    * I save "Renewal" transaction 1 total premium for comparison

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_03 FL_001 PSE | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (PSE) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 15 times

    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 1 premium for comparison
    * I save "Renewal" transaction 1 total premium for comparison

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_03 FL_001 ASIC | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (Accredited) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 1 premium for comparison
    * I save "Renewal" transaction 1 total premium for comparison

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P12  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US52879
  Scenario Outline: TC_04 FL_001 NFM | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (NFM) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "100"
    * I set "Manuscript_Endorsements_Annual_Manual_Premium_2" to "100"
    * I set "Manuscript_Endorsements_Annual_Manual_Premium_3" to "100"


    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 1 premium for comparison
    * I save "Renewal" transaction 1 total premium for comparison

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_04 FL_001 Palomar | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (Palomar) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Underwriting_Company_Manager_Override" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 1 premium for comparison
    * I save "Renewal" transaction 1 total premium for comparison

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_04 FL_001 PSE | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction (PSE) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I navigate to Home
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 11 seconds
    And I navigate to customers page
    * I think for 10 to 15 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 1 premium for comparison
    * I save "Renewal" transaction 1 total premium for comparison

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_04 FL_001 ASIC | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction (Accredited) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 1 premium for comparison
    * I save "Renewal" transaction 1 total premium for comparison

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P16  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US52879
  Scenario Outline: TC_05 FL_001 NFM |  Verify that Automated Renewal Triggers Rating via Coherent on 2nd renewal - Homeowner (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 675 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
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
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I create a renewal
    And I select a transaction "Renewal"
    Then I navigate to policy image page

    * I fill out HS quote application page

    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I click "accept"

    Then I click process renewal

    * I navigate to transactions or endorsements

    * I navigate to Home
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 20 to 25 seconds
    * I select customer by ID
    * I think for 15 to 20 seconds
    And I navigate to policy
    * I think for 10 to 15 seconds
    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 2 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 2 premium for comparison
    * I save "Renewal" transaction 2 total premium for comparison

    When I navigate to Renewal "2"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"
    * I click save changes button
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_06 FL_001 NFM |  Verify that Automated Renewal Triggers Rating via Coherent on 2nd renewal - Homeowner (NFM) - Condo

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 675 days in the past

    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page

    * I navigate to Home Surplus Lines Policy Page

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I create a renewal
    And I select a transaction "Renewal"
    Then I navigate to policy image page

    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal

    * I navigate to transactions or endorsements

    * I navigate to Home
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 20 to 25 seconds
    * I select customer by ID
    * I think for 15 to 20 seconds
    And I navigate to policy
    * I think for 10 to 15 seconds
    * I navigate to transactions or endorsements

    Then the status of "Renewal" transaction 2 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 2 premium for comparison
    * I save "Renewal" transaction 2 total premium for comparison

    When I navigate to Renewal "2"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page

    * I click save changes button

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_07 FL_001 NFM |  Verify that Manual Renewal Image Does NOT go into Rated Status (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
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
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click create renewal button
    * I think for 20 to 25 seconds

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    And I select a transaction "Renewal"
    * I navigate to policy image page

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |


  @US52879
  Scenario Outline: TC_07 FL_001 Palomar |  Verify that Manual Renewal Image Does NOT go into Rated Status (Palomar) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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
#    When I navigate to location page
#
    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click create renewal button
    * I think for 20 to 25 seconds

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    And I select a transaction "Renewal"
    * I navigate to policy image page

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI


    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |


  @US52879
  Scenario Outline: TC_07 FL_001 PSE |   Verify that Manual Renewal Image Does NOT go into Rated Status (PSE) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I navigate to transactions or endorsements
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements
    * I think for 20 to 25 seconds

    * I click create renewal button

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    And I select a transaction "Renewal"
    * I navigate to policy image page

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    Examples:
      | user | AddressLine      | City           | Zip   |
      | P1   | 1815 E West Pkwy | Fleming Island | 32003 |


  @US52879
  Scenario Outline: TC_07 FL_001 ASIC |  Verify that Manual Renewal Image Does NOT go into Rated Status (Accredited) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I click create renewal button
    * I think for 20 to 25 seconds
    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    And I select a transaction "Renewal"
    * I navigate to policy image page

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled
  Scenario Outline: TC_08 FL_001 NFM | Verify that Automated Renewal does not remain in 'Rated' status if renewal has been updated. (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
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
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements


    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled
  Scenario Outline: TC_08 FL_001 Palomar | Verify that Automated Renewal does not remain in 'Rated' status if renewal has been updated. (Palomar) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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
#    When I navigate to location page
#
    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements


    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled
  Scenario Outline: TC_08 FL_001 PSE | Verify that Automated Renewal does not remain in 'Rated' status if renewal has been updated. (PSE) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I navigate to Home
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 10 to 15 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    And I navigate to customers page
    * I think for 20 to 25 seconds
    * I select customer by ID
    * I think for 10 to 15 seconds

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879
  Scenario Outline: TC_08 FL_001 ASIC | Verify that Automated Renewal does not remain in 'Rated' status if renewal has been updated. (Accredited) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    * I navigate to customer page
    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 65 times
    And I navigate to customers page
    * I select customer by ID

    And I navigate to policy
    * I think for 20 to 25 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to transactions or endorsements
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionCreated"


    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P26  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US52879
  Scenario Outline: TC_09 FL_001 ASIC | Verify that  Automated Renewal Triggers Rating via Coherent - NB RWT

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 295 days in the past

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I select created policy

#     #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I override subjectivities for New Business Rewrite transaction

    * I navigate to customer page
    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 30 times

    * I navigate to Home
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 10 to 15 seconds
    And I navigate to customers page
    * I think for 20 to 25 seconds
    * I select customer by ID
    * I think for 15 to 20 seconds
    And I navigate to policy
    * I think for 10 to 15 seconds
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    * I save "Renewal" transaction 1 premium for comparison
    * I save "Renewal" transaction 1 total premium for comparison

    And I select a transaction "Renewal"
    * I go to summary and click update renewal

    * I navigate to "Application" page
    * I think for 10 to 15 seconds

    * I get current object ID for sql query
    * I execute the query and verify job status
      | query    | column | status | expectedRequests | parameter |
      | coherent | STATUS | 0      | 1                | OBJECT_ID |

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI

    When I navigate to Home Surplus Lines Policy Page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium

    * I think for 10 to 15 seconds
    * I compare premiums on premium summary

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P26  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_01 FL_001 NFM | Verify that  Automated Renewal Triggers Rating via Coherent (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
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
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_01 FL_001 Palomar | Verify that  Automated Renewal Triggers Rating via Coherent (Palomar) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

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
#    When I navigate to location page
#
    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_01 FL_001 PSE | Verify that  Automated Renewal Triggers Rating via Coherent (PSE) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_01 FL_001 ASIC | Verify that  Automated Renewal Triggers Rating via Coherent (Accredited) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |


  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_02 FL_001 NFM | Verify that Automated Renewal Triggers Rating via Coherent (NFM) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_02 FL_001 Palomar | Verify that  Automated Renewal Triggers Rating via Coherent (Palomar) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underwriting_Company_Manager_Override" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_02 FL_001 PSE | Verify that  Automated Renewal Triggers Rating via Coherent (PSE) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_02 FL_001 ASIC | Verify that  Automated Renewal Triggers Rating via Coherent (Accredited) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set Effective Date 310 days in the past

    * I set "Risk_Addresses_Contents" to "4700000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "Underwriting_Company_Manager_Override" to "No"


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
    * I navigate to location page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Accredited Specialty Insurance Company"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_03 FL_001 NFM | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
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
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_03 FL_001 Palomar | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (Palomar) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

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
#    When I navigate to location page
#
    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_03 FL_001 PSE | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (PSE) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_03 FL_001 ASIC | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (Accredited) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P12  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_04 FL_001 NFM | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (NFM) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_04 FL_001 Palomar | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction  (Palomar) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

    * I set "Underwriting_Company_Manager_Override" to "No"
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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_04 FL_001 PSE | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction (PSE) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past

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

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_04 FL_001 ASIC | Verify that  Automated Renewal has the correct premium displayed on transaction list - renewal transaction (Accredited) - Condo/Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 310 days in the past
    * I set "Risk_Addresses_Contents" to "4700000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "Underwriting_Company_Manager_Override" to "No"


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
    * I navigate to location page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Accredited Specialty Insurance Company"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    Examples:
      | user | AddressLine                  | City            | Zip   |
      | P16  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |


  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_05 FL_001 NFM |  Verify that Automated Renewal Triggers Rating via Coherent on 2nd renewal - Homeowner (NFM) - Homeowner

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 654 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
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
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I create a renewal
    And I select a transaction "Renewal"
    Then I navigate to policy image page

    * I fill out HS quote application page

    * I review changes
    * I click renewed premium

    * I navigate to underwriting alerts tab
    * I click "accept"

    Then I click process renewal

    * I navigate to transactions or endorsements

    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |

  @US52879 @Disabled @TestPolicyRenewalBatch
  Scenario Outline: TP_06 FL_001 NFM |  Verify that Automated Renewal Triggers Rating via Coherent on 2nd renewal - Homeowner (NFM) - Condo

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 654 days in the past

    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"
    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page

    * I navigate to Home Surplus Lines Policy Page

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I select created policy
    * I navigate to transactions or endorsements

    * I create a renewal
    And I select a transaction "Renewal"
    Then I navigate to policy image page
    * I fill out HS quote application page

    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I click "accept"
    Then I click process renewal

    * I navigate to transactions or endorsements


    Examples:
      | user | AddressLine                | City            | Zip   |
      | P12  | 1234 Palm Beach Lakes Blvd | West Palm Beach | 33401 |