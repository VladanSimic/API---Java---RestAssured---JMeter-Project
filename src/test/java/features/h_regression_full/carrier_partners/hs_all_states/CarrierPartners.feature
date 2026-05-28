@FullRegression @HS @HomeSurplus @CarrierPartnersRegression @FullRegression_DreamTeam

Feature: Regression - Carrier Partner All states
  As a user I should be able to verify Carrier Partner defaulting on all transactions

  @HS @CC @Disabled
  Scenario Outline: Home Surplus "<TC_ID>":  Carrier default to Palomar if CoC is selected Yes

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"
    * I set Effective Date to Today

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Location Details Page
    * I select "<YesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | TC_ID  | user | YesOrNo |
      | NY_001 | P97  |         |
      | MS_001 | P2   |         |
      | AL_001 | P3   |         |
      | CA_001 | P4   |         |
      | GA_001 | P5   |         |
      | LA_001 | P6   |         |
      | MA_001 | P7   |         |
      | SC_001 | P8   |         |
      | NJ_001 | P9   |         |
      | NC_001 | P10  |         |
      | TX_001 | P11  |         |
      | FL_001 | P12  | No      |
#  PSE is only carrier available for below states
#      | CO_001 | P15  ||                        |
#      | AZ_001 | P16  ||                        |
#      | MT_001 | P17  ||                        |
#      | UT_001 | P18  ||                        |
#      | WY_001 | P19  ||                        |
#      | HI_001 | P20  ||                        |

  @HS @FL @Accredited
  Scenario: Home Surplus FL:  Carrier default to Accredited Specialty Insurance Company

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "1215 NW 7th Ave"
    * I set "City_Name_Txt" to "Florida City"
    * I set "Zip_Code" to "33034"
    * I set "Risk_Addresses_Replacement_Cost" to "3000000"
    * I set Effective Date to Today
#    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
#    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_And_Named_Storm_Deductible" to "5%"

    When I am logged in to Pure as "P99" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "< 1000 ft"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @FL @NFM
  Scenario Outline: Home Surplus FL:  Carrier default to National Fire & Marine Insurance Company

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "<RepCost>"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set Effective Date to Today


    * I set "Construction_Details_Year_Built" to "<YearBuilt>"
    * I set "Wind_Mitigation_Roof_Covering" to "<Construction>"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "<YearBuilt>"
    * I set "Construction_Details_Year_Renovated" to "<YearBuilt>"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<YesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I navigate to location page
    * I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine     | City         | Zip   | RepCost | YearBuilt | Construction                             | YesOrNo | DTC       |
#      Specific Counties (NFM, Palomar, PSE)
      | P1   | 1215 NW 7th Ave | Florida City | 33034 | 1000000 | 2015      | Metal Sheathing With Concealed Fasteners |         | < 1000 ft |
      | P2   | 1215 NW 7th Ave | Florida City | 33034 | 1000000 | 2016      | Wood Shake                               |         | < 1000 ft |
#      General Counties
      | P3   | 520 N 6th Ave   | Pensacola    | 32501 | 1000000 | 2016      | Wood Shake                               | No      |           |
      | P4   | 1215 NW 7th Ave | Pensacola    | 32501 | 1000000 | 2015      | Metal Sheathing With Concealed Fasteners | No      |           |
    #  Other Counties
      | P5   | 7190 Harding St | Hollywood    | 33024 | 5000000 | 2016      | Wood Shake                               | No      |           |
      | P6   | 7190 Harding St | Hollywood    | 33024 | 5000000 | 2013      | Metal Sheathing With Concealed Fasteners | No      |           |

  @HS @FL @NFM @PSE @Disabled
  Scenario Outline: Home Surplus FL:  Carrier default to PSE if NFM doesn't meet qualifications

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "<RepCost>"
    * I set Effective Date to Today

#    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Construction_Details_Year_Built" to "<YearBuilt>"
    * I set "Wind_Mitigation_Roof_Covering" to "<Construction>"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "<YearBuilt>"
    * I set "Construction_Details_Year_Renovated" to "<YearBuilt>"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<YesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

#    PSE is not defaulting at this moment
    Examples:
      | user | AddressLine     | City         | Zip   | RepCost | YearBuilt | Construction                             | YesOrNo | DTC             |
#      Specific Counties (NFM, Accredited, PSE)
      | P1   | 1215 NW 7th Ave | Florida City | 33034 | 1000000 | 2008      | Metal Sheathing With Concealed Fasteners | No      | 1mile - 5 miles |
      | P2   | 1215 NW 7th Ave | Florida City | 33034 | 1000000 | 2013      | Wood Shake                               | NO      | 1mile - 5 miles |
    #  Other Counties
      | P5   | 7190 Harding St | Hollywood    | 33024 | 5000000 | 2013      | Wood Shake                               | No      |                 |
      | P6   | 7190 Harding St | Hollywood    | 33024 | 5000000 | 2008      | Metal Sheathing With Concealed Fasteners | No      |                 |

  @HS @FL @PSE @Disabled
  Scenario Outline: Home Surplus FL:  Carrier default to PSE

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "<RepCost>"
    * I set Effective Date to Today

#    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"

    * I set "Construction_Details_Year_Built" to "<YearBuilt>"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "<YearBuilt>"
    * I set "Construction_Details_Year_Renovated" to "<YearBuilt>"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<YesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    #    PSE is not defaulting at this moment
    Examples:
      | user | AddressLine     | City         | Zip   | RepCost  | YearBuilt | YesOrNo | DTC             |
#      Specific Counties (NFM, Accredited, PSE)
      | P1   | 1215 NW 7th Ave | Florida City | 33034 | 10000000 | 2020           | No      | 1mile - 5 miles |
#      General Counties (Panhandle)
      | P3   | 520 N 6th Ave   | Pensacola    | 32501 | 10000000 | 2020            | No      |                 |
    #  Other Counties (NFM, PSE)
      | P5   | 7190 Harding St | Hollywood    | 33024 | 10000000 | 2020              | No      |                 |

  @HS @FL @Palomar
  Scenario Outline: Home Surplus FL:  Carrier default to Palomar Excess and Surplus Insurance Company if TIV < 10M

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Replacement_Cost" to "<RepCost>"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Hurricane_And_Named_Storm_Deductible" to "5%"
    * I set Effective Date to Today

    * I set "Construction_Details_Year_Built" to "<YearBuilt>"
    * I set "Wind_Mitigation_Roof_Covering" to "Wood Shake"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "<YearBuilt>"
    * I set "Construction_Details_Year_Renovated" to "<YearBuilt>"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<YesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    Examples:
      | user | AddressLine   | City      | Zip   | RepCost | YearBuilt | YesOrNo |
      | P3   | 520 N 6th Ave | Pensacola | 32501 | 5000000 | 2010      | No      |

  @HS @NY @Accredited
  Scenario: Home Surplus NY:  Carrier default to Accredited Specialty Insurance Company

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today

    When I am logged in to Pure as "P76" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @CA @PSE
  Scenario: Home Surplus CA:  Carrier default to PURE Specialty Exchange

    Given I use "CA_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_WF_Deductible" to "5%"
    * I set Effective Date to Today

#    * I set "Address_Line_1_Txt" to "503 Avery Sheep Ranch Rd"
#    * I set "City_Name_Txt" to "Avery"
#    * I set "Zip_Code" to "95224"

    When I am logged in to Pure as "P77" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus


  @HS @MA @PSE
  Scenario: Home Surplus MA:  Carrier default to PURE Specialty Exchange if TIV >= 10M

    Given I use "MA_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "382 Bedford St"
    * I set "City_Name_Txt" to "Lakeville"
    * I set "Zip_Code" to "02347"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    When I am logged in to Pure as "P78" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus


#    Effective after 01/18/2025
  @HS @MA @Palomar
  Scenario: Home Surplus MA:  Carrier default to Palomar Excess and Surplus Insurance Company if TIV < 10M

    Given I use "MA_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "382 Bedford St"
    * I set "City_Name_Txt" to "Lakeville"
    * I set "Zip_Code" to "02347"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "1000000"

    When I am logged in to Pure as "P79" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @MS @PSE
  Scenario: Home Surplus MS:  Carrier default to PURE Specialty Exchange

    Given I use "MS_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "1224 Highway 2"
    * I set "City_Name_Txt" to "Corinth"
    * I set "Zip_Code" to "38834"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "1000000"

    When I am logged in to Pure as "P80" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @NC @PSE
  Scenario: Home Surplus NC:  Carrier default to PURE Specialty Exchange if TIV >= 10M

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "409 S Dogwood Ave"
    * I set "City_Name_Txt" to "Siler City"
    * I set "Zip_Code" to "27344"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "10000000"

    When I am logged in to Pure as "P81" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @NC @Palomar
  Scenario: Home Surplus NC:  Carrier default to Palomar Excess and Surplus Insurance Company if TIV < 10M

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "409 S Dogwood Ave"
    * I set "City_Name_Txt" to "Siler City"
    * I set "Zip_Code" to "27344"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "1000000"

    When I am logged in to Pure as "P82" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus


  @HS @SC @PSE
  Scenario: Home Surplus SC:  Carrier default to PURE Specialty Exchange if TIV >= 10M

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "125 Patton Street"
    * I set "City_Name_Txt" to "Fountain Inn"
    * I set "Zip_Code" to "29644"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Risk_Addresses_Hurricane_And_Named_Storm_Deductible" to "N/A - AOP Ded Applies"

    When I am logged in to Pure as "P83" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus


  @HS @SC @Palomar
  Scenario: Home Surplus SC:  Carrier default to Palomar Excess and Surplus Insurance Company if TIV < 10M

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "125 Patton Street"
    * I set "City_Name_Txt" to "Fountain Inn"
    * I set "Zip_Code" to "29644"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Risk_Addresses_Hurricane_And_Named_Storm_Deductible" to "N/A - AOP Ded Applies"

    When I am logged in to Pure as "P84" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @NJ @PSE
  Scenario: Home Surplus NJ:  Carrier default to PURE Specialty Exchange

    Given I use "NJ_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "51 Aberdeen Road"
    * I set "City_Name_Txt" to "Matawan"
    * I set "Zip_Code" to "07747"
    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "1000000"

    When I am logged in to Pure as "P85" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @GA @PSE
  Scenario: Home Surplus GA:  Carrier default to PURE Specialty Exchange

    Given I use "GA_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "10040 Lake Forest Way"
    * I set "City_Name_Txt" to "Roswell"
    * I set "Zip_Code" to "30076"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set Effective Date to Today


    When I am logged in to Pure as "P86" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @LA @PSE
  Scenario: Home Surplus LA:  Carrier default to PURE Specialty Exchange

    Given I use "LA_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Risk_Addresses_Named_Storm_Ded" to "5%"
    * I set Effective Date to Today


    When I am logged in to Pure as "P87" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus


  @HS @AL @PSE
  Scenario: Home Surplus AL:  Carrier default to PURE Specialty Exchange

    Given I use "AL_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "492 Wildwood Cir N"
    * I set "City_Name_Txt" to "Homewood"
    * I set "Zip_Code" to "35209"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set Effective Date to Today


    When I am logged in to Pure as "P88" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @AZ @PSE
  Scenario: Home Surplus AZ:  Carrier default to PURE Specialty Exchange

    Given I use "AZ_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "781 E Indian Wells Pl"
    * I set "City_Name_Txt" to "Chandler"
    * I set "Zip_Code" to "85249"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set Effective Date to Today


    When I am logged in to Pure as "P89" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @CO @PSE
  Scenario: Home Surplus CO:  Carrier default to PURE Specialty Exchange

    Given I use "CO_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Address_Line_1_Txt" to "5130 Bluestem Dr"
    * I set "City_Name_Txt" to "Colorado Springs"
    * I set "Zip_Code" to "80917"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set Effective Date to Today


    When I am logged in to Pure as "P90" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @HI @PSE
  Scenario: Home Surplus HI:  Carrier default to PURE Specialty Exchange

    Given I use "HI_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set Effective Date to Today


    When I am logged in to Pure as "P91" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @MT @PSE
  Scenario: Home Surplus MT:  Carrier default to PURE Specialty Exchange

    Given I use "MT_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set Effective Date to Today

    When I am logged in to Pure as "P92" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @UT @PSE
  Scenario: Home Surplus UT:  Carrier default to PURE Specialty Exchange

    Given I use "UT_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set Effective Date to Today


    When I am logged in to Pure as "P93" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @WY @PSE
  Scenario: Home Surplus WY:  Carrier default to PURE Specialty Exchange

    Given I use "WY_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set Effective Date to Today


    When I am logged in to Pure as "P94" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @TX @Accredited
  Scenario: Home Surplus TX:  Carrier default to Accredited Specialty Insurance Company

    Given I use "TX_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set Effective Date to Today


    When I am logged in to Pure as "P95" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

