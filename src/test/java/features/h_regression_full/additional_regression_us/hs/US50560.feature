@US50560 @Iteration5 @MarchPostPROD
Feature:Programs - Palomar HS - Excess Flood Default

  Scenario Outline: TC_1: HS FL - When Palomar is the carrier, Excess Flood is defaulted to "No" and cannot be added. NB>EN>RN

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today
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

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to location page
    * I write text to "Distance to Coast override" and value is "<DTC>"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

#    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |

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
      | user | AddressLine             | City              | Zip   | DTC             |
      | P1   | 529 Long Lake Dr        | Pensacola         | 32506 |                 |

  Scenario: TC_2: HS MA - When Palomar is the carrier, Excess Flood is defaulted to "No" and cannot be added. NB>EN>RN


    Given I use "MA_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"
    * I set "City_Name_Txt" to "Abington"


    When I am logged in to Pure as "P78"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "02/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |


  Scenario: TC_3: HS NC - When Palomar is the carrier, Excess Flood is defaulted to "No" and cannot be added. NB>EN>RN

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    When I am logged in to Pure as "P82"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "02/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |

  Scenario Outline: TC_4: HS NY - When Palomar is the carrier, Excess Flood is defaulted to "No" and cannot be added. NB>EN>RN

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

#    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |

    Examples:
      | user | AddressLine       | City       | Zip   |
#    Suffolk N.E.
      | P84  | 410 Fishel Avenue | Riverhead  | 11901 |
    #  Nassau N
      | P88  | 0 Welwyn Road #1D | Great Neck | 11021 |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine       | City       | Zip   |
      | P84  | 410 Fishel Avenue | Riverhead  | 11901 |

  Scenario: TC_5: HS SC - When Palomar is the carrier, Excess Flood is defaulted to "No" and cannot be added. NB>EN>RN

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    When I am logged in to Pure as "P82"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Optional Coverages Page
    * I think for 10 to 15 seconds
    * I verify radio buttons are disabled
      | Field                                         | Option |
      | Do you wish to include excess flood coverage? | Yes    |
      | Do you wish to include excess flood coverage? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Do you wish to include excess flood coverage? | No      |


  Scenario Outline: Home Surplus "<TC_ID>":  When Palomar is the carrier, Excess Flood is defaulted to "No" and cannot be added. NB RWT

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set Effective Date to Today
    * I set "Construction_Details_Year_Built" to "2005"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2007"
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote

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

    * I click save changes button
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I navigate to location page
    * I verify radio buttons are disabled
      | Field                                              | Option |
      | Is the residence under construction or renovation? | Yes    |
      | Is the residence under construction or renovation? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                       | YesOrNo |
      | Is the residence under construction or renovation? | No      |

    Examples:
      | TC_ID  | user | AddressLine             | City      | Zip   |
      | FL_001 | P12  | 529 Long Lake Dr        | Pensacola | 32506 |
      | MA_001 | P7   | HELEN DR 204            | Abington  | 02351 |
      | NY_001 | P97  | 410 Fishel Avenue       | Riverhead | 11901 |
      | SC_001 | P8   | 221 James L Taylor Road | Ridgeland | 29936 |
      | NC_001 | P10  | 111 North Corcoran St   | Durham    | 27701 |

    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user | AddressLine             | City      | Zip   |
      | SC_001 | P8   | 221 James L Taylor Road | Ridgeland | 29936 |
