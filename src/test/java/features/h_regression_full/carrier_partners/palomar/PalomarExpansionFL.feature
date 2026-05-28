@HomeSurplus @PalomarExpansion
Feature: Palomar Excess and Surplus Company FL
  As a user I should be able to verify Carrier Partner defaulting to Palomar Excess and Surplus Insurance Company

  @PalomarExpansion @HS @US46670
  Scenario Outline: TC_1: HS FL - After PD - NB Defaults to NFM with TIV in range and has qualifications

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
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
    * I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"
    * I write text to "Distance to Coast override" and value is "<DTC>"

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"
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
      | user | AddressLine                  | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr             | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd         | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir          | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd               | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr             | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr             | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way           | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave           | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A      | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St                 | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd        | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St                 | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St             | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir         | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd             | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St          | Monticello        | 32344 |                 |
#      Specific counties (NFM, Accredited, PSE)
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach   | 33411 |                 |
      | P18  | 6600 W 2nd Ct #24            | Hialeah           | 33012 |                 |
      | P19  | 1049 Blossom Drive           | Sebastian         | 32958 |                 |
      | P20  | 1511 Logan Ct                | Naples            | 34116 |                 |
#      Other counties (NFM, PSE)
      | P21  | 7190 Harding St              | Hollywood         | 33024 |                 |
      | P22  | 1235 Stadt Rd NW             | Palm Bay          | 32907 |                 |
      | P23  | 19259 Wood Sage Dr           | Tampa             | 33647 |                 |
      | P24  | 663 Crossfield Cir           | Venice            | 34293 |                 |

    @FullRegression_DreamTeam @Disabled
    Examples:
      | user | AddressLine      | City      | Zip   | DTC |
      | P98  | 529 Long Lake Dr | Pensacola | 32506 |     |


  @PalomarExpansion @HS @US46670
  Scenario Outline: TC_2: HS FL - After PD - NB Defaults to Palomar Excess and Surplus Company if TIV <10M  and NFM is not qualified

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2012"
    * I set "Wind_Mitigation_Roof_Covering" to "Wood Shake"
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
      | PPHV-OTH-GEN-005 (05/2021) |

    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine          | City | Zip   | DTC       |
      | P90  | 1752 Annie Penton Rd | Jay  | 32565 | > 5 miles |

  @PalomarExpansion @HS @US46670
  Scenario Outline: TC_3: HS FL - After PD - NB TIV > 10M, override to Palomar and verify validations are triggered.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"

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
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    * I navigate to quotes detail page
    * I rate a quote
    * I think for 10 to 15 seconds
    * I rate a quote
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine         | City              | Zip   | DTC |
      | P91  | 317 Northampton Cir | Fort Walton Beach | 32547 |     |

  @PalomarExpansion @HS @US46564
  Scenario Outline: TC_4: HS FL - Removal of hard stop for Palomar Excess and Surplus Company NB

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"

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
    * I verify if element with message "COC should be selected with this carrier partner. Please include COC to enable binding" is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine                  | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr             | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd         | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir          | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd               | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr             | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr             | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way           | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave           | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A      | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St                 | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd        | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St                 | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St             | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir         | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd             | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St          | Monticello        | 32344 |                 |
#  Specific counties (NFM, Accredited, PSE)
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach   | 33411 |                 |
      | P18  | 6600 W 2nd Ct #24            | Hialeah           | 33012 |                 |
      | P19  | 1049 Blossom Drive           | Sebastian         | 32958 |                 |
      | P20  | 1511 Logan Ct                | Naples            | 34116 |                 |
#      Other counties (NFM, PSE)
      | P21  | 7190 Harding St              | Hollywood         | 33024 |                 |
      | P22  | 1235 Stadt Rd NW             | Palm Bay          | 32907 |                 |
      | P23  | 19259 Wood Sage Dr           | Tampa             | 33647 |                 |
      | P24  | 663 Crossfield Cir           | Venice            | 34293 |                 |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine      | City    | Zip   | DTC |
      | P5   | 2714 Sherwood Dr | Bonifay | 32425 |     |


  @US46670
  Scenario Outline: TC_5: HS FL - Before PD - Verify carrier defaults to NFM

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "12/23/2024"

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
    * I verify carrier partner "National Fire & Marine Insurance Company"
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
    * I verify carrier partner on "Renewal"

    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |


  @US46973
  Scenario Outline: TC_6: HS FL - After PD - Verify carrier defaults to NFM on NB and RN

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "12/24/2024"

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
    * I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"
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
    * I verify carrier partner on "Renewal"

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
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

  @PalomarExpansion @HS @US46973
  Scenario Outline: TC_7: HS FL - After PD - Verify carrier defaults to Palomar on NB and RN

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

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
      | PPHV-OTH-GEN-005 (05/2021) |

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
    Then I process renewal or navigate to policy image and review changes and process renewal

    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-005 (05/2021) |

    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine      | City    | Zip   | DTC |
      | P95  | 2714 Sherwood Dr | Bonifay | 32425 |     |

  @PalomarExpansion @HS @US46973
  Scenario Outline: TC_8: HS FL -After PD filing date with TIV < $10M, verify the carrier partner defaults to 'Select' due to Inflation on RN transactions.
  Override to Palomar Excess and Surplus Insurance Company

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"
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
    * I create a renewal
    * I navigate to policy image page without save

    * I verify carrier partner "- Select -"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"
    * I override underwriting company to "Palomar Excess and Surplus Insurance Company"

    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page

    * I verify carrier partner on "Renewal"
    * I write text to "Hurricane Deductible" and value is "5%"


    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Displayed" on the UI
    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    Then I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine      | City   | Zip   | DTC             |
      | P96  | 2730 Traverse Dr | Vernon | 32462 | 1mile - 5 miles |

  @US46973
  Scenario Outline: TC_9: HS FL - After PD filing date with TIV < $10M, verify the carrier partner defaults to 'Select' due to Inflation on RN transactions.
  Override to PURE Specialty Exchange

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "12/24/2024"
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
      | PPHV-OTH-GEN-005 (05/2021) |

    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page without save

    * I verify carrier partner "- Select -"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"
    * I override underwriting company to "PURE Specialty Exchange"

    * I upload and sign required forms
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    * I navigate to policy image page without save
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I verify carrier partner on "Renewal"
    * I write text to "Hurricane Deductible" and value is "5%"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I click process renewal

    * I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-007 (02/2022) |

    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |


  @PalomarExpansion @HS @US46973
  Scenario Outline: TC_10: HS FL - After PD filing date with TIV < $10M, verify the carrier partner defaults to 'Select' and Carrier Assignment referral is triggered

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "7980000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
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
    * I navigate to underwriting alerts tab
    * I verify if element with message "Please refer to underwriting for consideration - Carrier Partner Assignment" is "Displayed" on the UI
    * I verify that the referral "Please refer to underwriting for consideration - Carrier Partner Assignment" is "Not Approvable"


    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine        | City        | Zip   | DTC |
      | P97  | 7266 Shady Oak Way | Panama City | 32409 |     |

  @PalomarExpansion @HS @US46973
  Scenario Outline: TC_11: HS FL - After PD Filing, verify that changes to TIV from EN are reflected in RN.
  Update TIV from < $10M to ≥ $10M on EN and confirm underwriting company defaults to "Select" on RN.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
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

#    * I set "Endorsement_Effective_Date_END" to "02/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I write text to "Replacement Cost" and value is "10000000"
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I write text to "Hurricane Deductible" and value is "5%"

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
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"
    * I override underwriting company to "Palomar Excess and Surplus Insurance Company"

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
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

    @FullRegression_DreamTeam @ReRun
    Examples:
      | user | AddressLine        | City   | Zip   | DTC |
      | P98  | 475 Grand Mesa Ave | Alford | 32420 |     |

  @US46973
  Scenario Outline: TC_12: HS FL - After PD with TIV > $10M, override to Palomar, verify validations trigger on RN, OOS EN, and RN roll forward.

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "12/24/2024"

    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"

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
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
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
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Displayed" on the UI
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    * I initiate new oos endorsement 4 months ahead
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"

    * I review changes
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
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
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |


  @US46973
  Scenario Outline: TC_13: HS FL - After PD with TIV < $10M, default to Palomar, on RN, change Year Roof Replaced and verify carrier stays with Palomar

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "12/24/2024"

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
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
    * I navigate to location page
    * I write text to "Year Roof Replaced" and value is "2022"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I write text to "Hurricane Deductible" and value is "5%"

    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I accept underwriter referrals on endorsement and renewal temp
    * I think for 10 to 15 seconds
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

  @US46973
  Scenario Outline: TC_14: HS FL - After PD with TIV < $10M, default to NFM, on RN, change Year Roof Replaced and verify carrier stays with NFM

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "12/24/2024"

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2015"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"
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

    * I set "Application_And_Mandatory_Forms_Block_Roof_Replacement_Document" to "Yes"

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"
    * I navigate to location page
    * I write text to "Year Roof Replaced" and value is "2007"
    * I fill out HS quote application page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"
    * I write text to "Hurricane Deductible" and value is "5%"

    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I accept underwriter referrals on endorsement and renewal temp
    * I think for 10 to 15 seconds
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

  @US46670
  Scenario Outline: TC_15: HS FL - After PD filing Validate if optional coverages for Primary Home default on Palomar

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "12/24/2024"

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
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
      | Dwelling Replacement Cost Coverage  | No      |
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
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

  @US46670
  Scenario Outline: TC_16: HS FL - After PD filing Validate if optional coverages for Seasonal Home / Secondary default on Palomar

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "12/24/2024"
    * I set "Usage_Is_This_A_Primary_Residence" to "No"


    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
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
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

  @US46670
  Scenario Outline: TC_17: HS FL - After PD filing Validate if optional coverages for Rented To Others default on Palomar

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "12/24/2024"
    * I set "Usage_Part_Of_The_Residence_Rented" to "Yes"

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
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
      | Dwelling Replacement Cost Coverage  | Yes     |
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
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |

  @US46670
  Scenario Outline: TC_18: HS FL - After PD filing Validate if optional coverages for Vacant Residence default on Palomar

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Effective_Date" to "12/24/2024"
    * I set "Usage_Is_The_Residence_Vacant" to "Yes"

    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
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
      | Dwelling Replacement Cost Coverage  | Yes     |
      | Elimination of Waiver of Deductible | Yes     |
      | Premises Liability Limitation       | Yes     |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine             | City              | Zip   | DTC             |
#      General Counties (NFM, Palomar, PSE)|
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |
      | P2   | 1752 Annie Penton Rd    | Jay               | 32565 | > 5 miles       |
      | P3   | 317 Northampton Cir     | Fort Walton Beach | 32547 |                 |
      | P4   | 72 Oakplace Rd          | Freeport          | 32439 |                 |
      | P5   | 2714 Sherwood Dr        | Bonifay           | 32425 |                 |
      | P6   | 2730 Traverse Dr        | Vernon            | 32462 | 1mile - 5 miles |
      | P7   | 7266 Shady Oak Way      | Panama City       | 32409 |                 |
      | P8   | 475 Grand Mesa Ave      | Alford            | 32420 |                 |
      | P9   | 24740 County Road 73 #A | Altha             | 32421 |                 |
      | P10  | 408 S 2nd St            | Wewahitchka       | 32465 | > 5 miles       |
      | P11  | 13761 NW Pea Ridge Rd   | Bristol           | 32321 |                 |
      | P12  | 606 W 3rd St            | Carrabelle        | 32322 | < 1000 ft       |
      | P13  | 275 N Bolivar St        | Chattahoochee     | 32324 |                 |
      | P14  | 1753 Copperfield Cir    | Tallahassee       | 32312 |                 |
      | P15  | 893 Rehwinkel Rd        | Crawfordville     | 32327 |                 |
      | P16  | 480 W Washington St     | Monticello        | 32344 |                 |


  @PalomarExpansion @HS @US46564
  Scenario Outline: TC_9: HS FL - Verify that Palomar ( non COC) can write  business in the following counties (TIV is <$10M): Miami Dade,Indian River, Collier and Palm Beach and NFMI assignment criteria remains the same

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"

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
    * I verify if element with message "COC should be selected with this carrier partner. Please include COC to enable binding" is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine                  | City            | Zip   | DTC |
#  Specific counties (NFM, Accredited, PSE)
      | P17  | 9754 Galleon Drive UNIT 9754 | West Palm Beach | 33411 |     |
      | P18  | 6600 W 2nd Ct #24            | Hialeah         | 33012 |     |
      | P19  | 1049 Blossom Drive           | Sebastian       | 32958 |     |
      | P20  | 1511 Logan Ct                | Naples          | 34116 |     |
#      Other counties (NFM, PSE)
      | P21  | 7190 Harding St              | Hollywood       | 33024 |     |
      | P22  | 1235 Stadt Rd NW             | Palm Bay        | 32907 |     |
      | P23  | 19259 Wood Sage Dr           | Tampa           | 33647 |     |
      | P24  | 663 Crossfield Cir           | Venice          | 34293 |     |