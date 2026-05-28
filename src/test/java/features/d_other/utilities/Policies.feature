Feature: PF Admitted - Policies

  @QuotesHOBillTeam
  Scenario Outline: HO - "<state>"
    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "08/06/2025"
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_QA" to "Milan Josifljevic"
    * I set "Advisor_Servicer_AWS_QA" to "Milan Josifljevic"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "1000"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"
    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "Yes"

    When I am logged in to Pure as Field
    * I create a new "HO" quote for a new customer
    * I click save changes button

#    Then I rate a quote
#    * I navigate to underwriting referrals page
#    * I accept underwriting referrals
#    * I bind a quote
#    * I override subjectivities

    Examples:
      | state  |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

  @PoliciesHOMil
  Scenario Outline: HO - "<state>"
    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Effective_Date" to "07/22/2025"
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_QA" to "Milan Josifljevic"
    * I set "Advisor_Servicer_AWS_QA" to "Milan Josifljevic"
    * I set "Residence_Type" to "<residence>"
    * I set "Replacement_Cost" to "<replacement>"
    * I set "Other_Structures" to "<structures>"
    * I set "Contents" to "<contents>"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "1000"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"
    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "Yes"

    When I am logged in to Pure as Field
    * I create a new "HO" quote for a new customer

    Then I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | state  | residence   | replacement | contents | structures |
      | IL_001 | Homeowner   | 2350000     | 550000   | 220000     |
      | IL_001 | Condo/Co-op |             | 1220000  |            |
      | IL_001 | Tenants     |             | 1070000  |            |
      | CO_001 | Homeowner   | 1650000     | 550000   | 220000     |
      | CO_001 | Condo/Co-op |             | 980000   |            |
      | CO_001 | Tenants     |             | 840000   |            |

  @FSPolicies
  Scenario Outline: FS - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "07/01/2025"
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_STG" to "Milan Josifljevic"
    * I set "Advisor_Servicer_AWS_STG" to "Milan Josifljevic"

    When I am logged in to Pure as Field
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote

    Examples:
      | state  |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | NC_001 |

  @FSQuotes
  Scenario Outline: FS - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "07/01/2025"
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_STG" to "Milan Josifljevic"
    * I set "Advisor_Servicer_AWS_STG" to "Milan Josifljevic"

    When I am logged in to Pure as Field
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote

    Examples:
      | state  |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | NC_001 |

  @FSStaging
  Scenario Outline: FS - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_STG" to "<producer>"
    * I set "Advisor_Servicer_AWS_STG" to "Milan Josifljevic"
    * I set "Effective_Date" to "<date>"
    * I set "Endorsement_Effective_Date_END" to "<endorsement>"

    When I am logged in to Pure as Field
    * I create a new "PF" quote for a new customer

    * I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote

    * I navigate to policy
    * I navigate to "transactions/endorsements" tab
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Examples:
      | state  | date       | endorsement | producer          |
      | NY_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | MA_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | TX_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | GA_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | CT_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | AR_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | VA_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | IL_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | CO_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | CA_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | LA_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
      | MS_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
      | MO_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
      | AL_001 | 10/04/2025 | 10/06/2025  | Patty1 Clement    |
      | KY_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |

  @NewWorkflowFS
  Scenario Outline: FS - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_QA" to "Milan Josifljevic"
    * I set "Advisor_Servicer_AWS_QA" to "Milan Josifljevic"

    When I am logged in to Pure as Field
    * I create a new "PF" quote for a new customer
    * I rate and bind an FS quote

    Examples:
      | state  |
      | MA_001 |

  @FSNBCancRewr
  Scenario Outline: FS - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_STG" to "<producer>"
    * I set "Advisor_Servicer_AWS_STG" to "Milan Josifljevic"
    * I set "Effective_Date" to "<date>"
    * I set "Endorsement_Effective_Date_END" to "<endorsement>"

    When I am logged in to Pure as Field
    * I create a new "PF" quote for a new customer

    * I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote

    * I navigate to policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I review changes
    * I click ">>> rate" button
    * I complete rewrite transaction
    * I navigate to transactions or endorsements
    * I select new business rewrite transaction
    * I navigate to subjectivities
    * I click manual bind

    Examples:
      | state  | date       | endorsement | producer          |
      | NY_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
#      | MA_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
#      | TX_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
#      | GA_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
#      | CT_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
#      | AR_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
#      | VA_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
#      | IL_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
#      | CO_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
#      | CA_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
#      | LA_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
#      | MS_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
#      | MO_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
#      | AL_001 | 10/04/2025 | 10/06/2025  | Patty1 Clement    |
#      | KY_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |

  @FSNBRnwOOSEnd
  Scenario Outline: FS - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_STG" to "<producer>"
    * I set "Advisor_Servicer_AWS_STG" to "Milan Josifljevic"
    * I set "Effective_Date" to "<date>"
    * I set "Endorsement_Effective_Date_END" to "<endorsement>"

    When I am logged in to Pure as Field
    * I create a new "PF" quote for a new customer

    * I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I create a renewal
#    * I click "update renewal" button
    * I review changes
    * I click renewed premium
    * I click "process policy extension" button

    * I initiate new oos endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Examples:
      | state  | date       | endorsement | producer          |
      | NY_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | MA_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | TX_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | GA_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | CT_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | AR_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | VA_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | IL_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | CO_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | CA_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | LA_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
      | MS_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
      | MO_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
      | AL_001 | 10/04/2025 | 10/06/2025  | Patty1 Clement    |
      | KY_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |

  @FSNBEndRnw
  Scenario Outline: FS - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_STG" to "<producer>"
    * I set "Advisor_Servicer_AWS_STG" to "Milan Josifljevic"
    * I set "Effective_Date" to "<date>"
    * I set "Endorsement_Effective_Date_END" to "<endorsement>"

    When I am logged in to Pure as Field
    * I create a new "PF" quote for a new customer

    * I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote

    * I navigate to policy
    * I navigate to "transactions/endorsements" tab
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    * I create a renewal
    # update renewal removed for some countries
#    * I click "update renewal" button
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I click "process policy extension" button

    Examples:
      | state  | date       | endorsement | producer          |
      | NY_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | MA_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | TX_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | GA_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | CT_001 | 07/04/2025 | 07/06/2025  | Milan Josifljevic |
      | AR_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | VA_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | IL_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | CO_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | CA_001 | 04/04/2025 | 04/06/2025  | Milan Josifljevic |
      | LA_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
      | MS_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
      | MO_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |
      | AL_001 | 10/04/2025 | 10/06/2025  | Patty1 Clement    |
      | KY_001 | 10/04/2025 | 10/06/2025  | Milan Josifljevic |

  @StriataAndrew
  Scenario Outline: FS Striata - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/08/2025"
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_STG" to "Milan Josifljevic"
    * I set "Advisor_Servicer_AWS_STG" to "Milan Josifljevic"
    * I set "Policy_Delivery_Option" to "agencyDelivery"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | IL_001 |
      | CO_001 |

  @HOFSENDCANC
  Scenario Outline: FS - "<state>" - NB/END/CANC

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "AGENCY_NAME" to "<agency>"
    * I set "AGENCY_ID" to "<agencyId>"
    * I set "Licensed_Producer_AWS_STG" to "<STGproducer>"
    * I set "Advisor_Servicer_AWS_STG" to "<STGadvisor>"
    * I set "Licensed_Producer_AWS_QA" to "<QAproducer>"
    * I set "Advisor_Servicer_AWS_QA" to "<QAadvisor>"
    * I set "Effective_Date" to "11/11/2025"
    * I set "Endorsement_Effective_Date_END" to "02/02/2026"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HO" quote
    * I rate and bind an FS quote

    Then I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    When I navigate to "Flood Surplus Lines Policy" page
    * I type "350,000" to "Dwelling" input field
    * I click save changes button
    * I review changes FS
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I create and process cancellation transaction on a specific date
      | by      | date       | notes             | method   | reason               | MEP | reason |
      | Company | 05/05/2026 | Cancellation test | Pro-Rate | Underwriting Reasons |     |        |

    Examples:
      | state  | agency                          | agencyId  | STGproducer       | STGadvisor        | QAadvisor         | QAproducer        |
      | PA_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |
      | MA_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | RI_001 | Holmes Murphy & Associates, Inc | 458740200 | Ana Vasic         | Ana Vasic         | Milan Josifljevic |Milan Josifljevic |
      | GA_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | CT_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | AR_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | VA_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | IL_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | CO_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | CA_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | LA_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | MS_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | MO_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | AL_001 | Underc0de                       | 800391600 | Patty1 Clement    | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | KY_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | NJ_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | FL_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |
      | NC_001 | Underc0de                       | 800391600 | Milan Josifljevic | Milan Josifljevic | Milan Josifljevic |Milan Josifljevic |