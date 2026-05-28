@US47766 @HomeSurplus @NFM @US46973
Feature: National Fire & Marines FL
  As a user I should be able to verify Carrier Partner defaulting to National Fire & Marine Insurance Company for condo

  @NFM @US47766 @HomeSurplus @NFM
  Scenario Outline: TC_1: HS FL - Verify that for FL HS quote where residence type = Condo/Co-op, with eff date =>02/07/2025 and TIV<  $5M defaults to "NFM" carrier partner

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "02/07/2025"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    * I select created policy

    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-FL-006 (07/2021) |

    Examples:
      | user | AddressLine               | City         | Zip   | DTC       |
#      General Counties (NFM, Palomar, PSE)||
      | P1   | 1215 Northwest 7th Avenue | Florida City | 33034 | > 5 miles |


  @US47766 @HomeSurplus @NFM
  Scenario Outline: TC_2: HS FL - Verify that for FL HS quote where residence type = Condo/ Co-op, with eff date < 02/07/2025 and TIV<  $5M carrier partner field remains blank /select
  and carrier partner assignment referral is triggered.

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "02/06/2025"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "- Select -"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I verify if element with message "Please refer to underwriting for consideration - Carrier Partner Assignment" is "Displayed" on the UI
    * I verify that the referral "Please refer to underwriting for consideration - Carrier Partner Assignment" is "Not Approvable"
    * I navigate to quotes detail page
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"
    * I override underwriting company to "National Fire & Marine Insurance Company"
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I verify if element with message "Wind coverage is not available for Condos with NFM-FL. Please select Ex-Wind or update the Carrier Partner." is "Displayed" on the UI


    Examples:
      | user | AddressLine          | City | Zip   | DTC       |
#      General Counties (NFM, Palomar, PSE)|
      | P2   | 1752 Annie Penton Rd | Jay  | 32565 | > 5 miles |

  @FullRegression_DreamTeam @NFM @HS @US47766 @RerunCarrier1
  Scenario Outline: TC_3: HS FL - Verify that for FL HS quote where residence type = Condo/ Co-op, with eff date =>02/07/2025 and TIV=> $5M
  and carrier partner overridden to NFM then an Underwriting Alert and Validation/Warning Banner are triggered on NB

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"


    * I set "Risk_Addresses_Contents" to "4500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "700000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I think for 10 to 15 seconds
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    * I bind a quote for surplus

    Examples:
      | user | AddressLine         | City              | Zip   |
#      General Counties (NFM, Palomar, PSE)|
      | P85  | 317 Northampton Cir | Fort Walton Beach | 32547 |

  @US47766 @HomeSurplus @NFM
  Scenario Outline: TC_4: HS FL - After PD filing Validate if optional coverages for Primary Home default on NFM for Condo/ Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "02/07/2025"
    * I set "Underwriting_Company_Manager_Override" to "No"



    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                        | YesOrNo |
#      | Dwelling Replacement Cost Coverage  | No      |
      | Elimination of Waiver of Deductible | No      |
      | Loss of Use - Fair Rental Value     | No      |
      | Premises Liability Limitation       | No      |
      | Tenant Animal Liability Exclusion   | No      |
      | Special Water Damage Deductible     | No      |
      | Primary Flood Dec Page Received?    | No      |
      | Roof Exclusion                      | No      |
      | Roof Reconstruction Cost Schedule   | No      |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US47766 @HomeSurplus @NFM
  Scenario Outline: TC_5: HS FL - After PD filing Validate if optional coverages for Seasonal Home / Secondary default on NFM for Condo/ Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "02/07/2025"
    * I set "Usage_Is_This_A_Primary_Residence" to "No"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                  | YesOrNo |
      | Premises Liability Limitation | Yes     |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US47766 @HomeSurplus @NFM
  Scenario Outline: TC_6: HS FL - After PD filing Validate if optional coverages for Rented To Others default on NFM for Condo/ Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "02/07/2025"
    * I set "Usage_Part_Of_The_Residence_Rented" to "Yes"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                        | YesOrNo |
#      | Dwelling Replacement Cost Coverage  | Yes     |
      | Elimination of Waiver of Deductible | Yes     |
      | Loss of Use - Fair Rental Value     | Yes     |
      | Premises Liability Limitation       | Yes     |
      | Tenant Animal Liability Exclusion   | Yes     |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US47766 @HomeSurplus @NFM
  Scenario Outline: TC_7: HS FL - After PD filing Validate if optional coverages for Vacant Residence default on NFM for Condo/ Co-op

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "02/07/2025"
    * I set "Usage_Is_The_Residence_Vacant" to "Yes"
    * I set "Underwriting_Company_Manager_Override" to "No"



    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                        | YesOrNo |
#      | Dwelling Replacement Cost Coverage  | Yes     |
      | Elimination of Waiver of Deductible | Yes     |
      | Premises Liability Limitation       | Yes     |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |

  @US47766 @HomeSurplus @NFM
  Scenario Outline: TC_8: HS FL - Before PD filing date TIV = 3M, cancel the policy and make NB rwt effective 02/07 TIV < 5M - verify its NFM

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/06/2025"
    * I set "Risk_Addresses_Contents" to "2500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

#     #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I click save changes button
    * I verify carrier partner "National Fire & Marine Insurance Company"
    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    Examples:
      | user | AddressLine                  | City            | Zip   | DTC |
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |     |
      | P18  | 6600 W 2nd Ct #24            | Hialeah         | 33012 |     |
      | P19  | 1049 Blossom Drive           | Sebastian       | 32958 |     |
      | P20  | 1511 Logan Ct                | Naples          | 34116 |     |

  @FullRegression_DreamTeam @NFM @HS @US47775 @RerunCarrier1
  Scenario Outline: TC_9: HS FL - After PD - Verify carrier defaults to NFM on NB and RN for condo

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-FL-006 (07/2021) |

    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    * I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds

    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-FL-006 (07/2021) |

    Examples:
      | user | AddressLine               | City         | Zip   | DTC       |
      | P86  | 1215 Northwest 7th Avenue | Florida City | 33034 | > 5 miles |

  @FullRegression_DreamTeam @NFM @HS @US47775 @RerunCarrier1
  Scenario Outline: TC_10: HS FL -  Verify that a FL Condo policy written with NFMI, eff date >02/01/25 and TIV $4.990,000 on REN transaction, due to inflation,  carrier partner defaults to 'select '

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Contents" to "4000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "990000"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2012"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-FL-006 (07/2021) |

    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page without save

    * I verify carrier partner "- Select -"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"
    * I override underwriting company to "National Fire & Marine Insurance Company"

    * I approve uw referrals if visible and navigate back to policy image page

    * I verify carrier partner on "Renewal"
    * I write text to "Hurricane Deductible" and value is "5%"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Displayed" on the UI
    * I think for 10 to 15 seconds
    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    * I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-FL-006 (07/2021) |

    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
#      General Counties (NFM, Palomar, PSE)|
      | P87  | 529 Long Lake Dr | Pensacola | 32506 |     |

  @FullRegression_DreamTeam @NFM @HS @US47775 @RerunCarrier1
  Scenario Outline: TC_11: HS FL -  Verify that  a condo policy with  NB eff date >02/07/25 ,NFMI,
  where TIV is <$5M  and TIV is increased =>$5M on END tranaction , on REN the carrier partner defaults to 'select'

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Contents" to "3500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2015"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

#    * I set "Endorsement_Effective_Date_END" to "02/10/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I write text to "Contents" and value is "5000000"
    * I verify carrier partner "National Fire & Marine Insurance Company"
    * I write text to "Hurricane Deductible" and value is "5%"
    * I click save changes button
    * I think for 10 to 15 seconds
    * I review changes
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page without save

    * I verify carrier partner "- Select -"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"
    * I override underwriting company to "National Fire & Marine Insurance Company"

    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page

    * I verify carrier partner on "Renewal"
    * I write text to "Hurricane Deductible" and value is "5%"

    * I fill out HS quote application page

    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Displayed" on the UI
    * I think for 10 to 15 seconds
    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I accept underwriter referrals on endorsement and renewal temp
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal


    Examples:
      | user | AddressLine          | City | Zip   | DTC       |
#      General Counties (NFM, Palomar, PSE)|
      | P88  | 1752 Annie Penton Rd | Jay  | 32565 | > 5 miles |


  @US46973 @HomeSurplus @NFM
  Scenario Outline: TC_12: HS FL -  Verify that on RF Ren Transaction( NB defaults to NFMI, REN with NFMI, OOS endorsement, RF renewal)
  in case of OOS endorsement the same carrier partner is displayed -NFMI

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "02/07/2025"

    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote

    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I verify if element with message "TIV Ineligible for current carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    * I navigate to quotes detail page
    * I rate a quote
    * I think for 10 to 15 seconds
    * I rate a quote
    Then I bind a quote for surplus
    * I select created policy

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"
    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    * I initiate new oos endorsement 4 months ahead
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"

    * I review changes
    * I verify if element with message "TIV Ineligible for current carrier." is "Not Displayed" on the UI
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I issue an endorsement

    * I click roll forward
    * I think for 10 to 15 seconds

    And I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"


    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr | Pensacola | 32506 |     |


  @US47775 @HomeSurplus @NFM
  Scenario Outline: TC_13: HS FL - Before PD - Verify carrier defaults to Accredited on NB and RN for condo if TIV is > $2.5M and < $10M

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "02/06/2025"
    * I set "Risk_Addresses_Contents" to "4700000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I click process renewal

    Examples:
      | user | AddressLine                  | City            | Zip   | DTC |
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |     |
      | P18  | 6600 W 2nd Ct #24            | Hialeah         | 33012 |     |
      | P19  | 1049 Blossom Drive           | Sebastian       | 32958 |     |
      | P20  | 1511 Logan Ct                | Naples          | 34116 |     |

  @US47775 @HomeSurplus @NFM
  Scenario Outline: TC_14: HS FL - After PD - Verify carrier defaults to Accredited on NB and RN for condo if TIV >= $5M

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "02/07/2025"
    * I set "Risk_Addresses_Contents" to "4500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "600000"
    * I set "Underwriting_Company_Manager_Override" to "No"


    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Accredited Specialty Insurance Company"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | user | AddressLine                  | City            | Zip   | DTC |
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |     |
      | P18  | 6600 W 2nd Ct #24            | Hialeah         | 33012 |     |
      | P19  | 1049 Blossom Drive           | Sebastian       | 32958 |     |
      | P20  | 1511 Logan Ct                | Naples          | 34116 |     |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine   | City   | Zip   | DTC |
      | P89  | 1511 Logan Ct | Naples | 34116 |     |

  @US47775 @HomeSurplus @NFM
  Scenario Outline: TC_15: HS FL - After PD filing date with TIV < $10M, verify the carrier partner defaults to 'Select' and Carrier Assignment referral is triggered

    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Contents" to "10000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page without save
    * I verify carrier partner "- Select -"
    * I navigate to Home Surplus Lines Policy Page
    * I verify if element with message "Please refer to underwriting for consideration - Carrier Partner Assignment" is "Displayed" on the UI
    * I verify that the referral "Please refer to underwriting for consideration - Carrier Partner Assignment" is "Not Approvable"

    Examples:
      | user | AddressLine                  | City            | Zip   | DTC |
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |     |
