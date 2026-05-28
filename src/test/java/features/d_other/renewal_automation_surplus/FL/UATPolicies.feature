Feature: UAT


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