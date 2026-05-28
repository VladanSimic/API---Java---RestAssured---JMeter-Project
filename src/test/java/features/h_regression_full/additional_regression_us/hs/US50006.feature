@US50006 @Iteration4
Feature: Preventing Course of Construction risks from being able to be written on the Home Surplus product

  Scenario Outline: Home Surplus "<TC_ID>": Verify CC option is disabled on NB

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Effective_Date" to "03/08/2025"

    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<YesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
    * I verify radio buttons are disabled
      | Field                                              | Option |
      | Is the residence under construction or renovation? | Yes    |
      | Is the residence under construction or renovation? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Is the residence under construction or renovation? | No      |


    Examples:
      | TC_ID  | user | YesOrNo |
      | AL_001 | P3   |         |
      | AZ_001 | P16  |         |
      | CA_001 | P4   |         |
      | CO_001 | P15  |         |
      | FL_001 | P12  | No      |
      | GA_001 | P5   |         |
      | HI_001 | P20  |         |
      | LA_001 | P6   |         |
      | MA_001 | P7   |         |
      | MS_001 | P2   |         |
      | MT_001 | P17  |         |
      | NJ_001 | P9   |         |
      | NY_001 | P97  |         |
      | SC_001 | P8   |         |
      | NC_001 | P10  |         |
      | TX_001 | P11  |         |
      | UT_001 | P18  |         |
      | WY_001 | P19  |         |
  @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user | YesOrNo |
      | FL_001 | P12  | No      |
      | NY_001 | P97  |         |

  Scenario Outline: Home Surplus "<TC_ID>": Verify CC option is disabled on NB RWT

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Effective_Date" to "03/08/2025"

    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<YesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

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
    * I navigate to location page
    * I verify radio buttons are disabled
      | Field                                              | Option |
      | Is the residence under construction or renovation? | Yes    |
      | Is the residence under construction or renovation? | No     |
    * I verify that the options for fields are selected
      | CoverageType                                  | YesOrNo |
      | Is the residence under construction or renovation? | No      |

    Examples:
      | TC_ID  | user | YesOrNo |
      | AL_001 | P3   |         |
      | AZ_001 | P16  |         |
      | CA_001 | P4   |         |
      | CO_001 | P15  |         |
      | FL_001 | P12  | No      |
      | GA_001 | P5   |         |
      | HI_001 | P20  |         |
      | LA_001 | P6   |         |
      | MA_001 | P7   |         |
      | MS_001 | P2   |         |
      | MT_001 | P17  |         |
      | NJ_001 | P9   |         |
      | NY_001 | P97  |         |
      | SC_001 | P8   |         |
      | NC_001 | P10  |         |
      | TX_001 | P11  |         |
      | UT_001 | P18  |         |
      | WY_001 | P19  |         |

  @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user | YesOrNo |
      | CA_001 | P4   |         |
      | TX_001 | P8   |         |
