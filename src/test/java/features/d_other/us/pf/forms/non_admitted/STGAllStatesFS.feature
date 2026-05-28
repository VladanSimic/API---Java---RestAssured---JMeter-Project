@PrimaryFlood @NonAdmitted @FSFormsSTG
Feature: FS - NonAdmitted -  Forms
# //span[text()='rate'] for STG
  @FSReinstatementHomeownerSTG
  Scenario Outline: NB/END - "<state>" - Homeowner

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "07/24/2025"
    * I set "Endorsement_Effective_Date_END" to "07/25/2025"
    * I set "Does_The_Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "1,000"

    * I set "PF_Coverage_Contents_Limit" to "0"
    * I set "Sublimit_Basement_Contents" to "0"
    * I set "PF_Coverage_Dwelling_Limit" to "1,500,000"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "50,000"
    * I set "Sublimit_Basement_Improvements" to "50,000"
    * I set "PF_Coverage_Other_Structures_Limit" to "0"
    * I set "Sublimit_Landscaping" to "0"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "11,000"
    * I set "Sublimit_Loss_Avoidance" to "12,000"
    * I set "Sublimit_Loss_Assessment" to "0"
    * I set "Sublimit_Rebuilding_To_Code" to "0"
    * I set "Sublimit_Hardscapes" to "0"
    * I set "PF_Coverage_Deductible_Limit" to "10,000"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page
    * I type "10,000" to "Deductible" input field
    * I click save changes button

    Then I navigate to Additional Interests page and fill additional interests details
      | Type                | LLC_Trust | Name  | Address_Line_1  | City  | State | ZIP   | Loan  | Mortgage_Type  |
      | Additional Insured  | No        | Test1 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Additional Interest | No        | Test2 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Loss Payee          | No        | Test3 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Mortgagee           | No        | Test4 | 101 Main Street | Olean | NY    | 14760 | 10000 | First Mortgage |
      | Mortgagee           | No        | Test5 | 101 Main Street | Olean | NY    | 14760 | 20000 | Third Mortgage |
      | Others              | No        | Test6 | 101 Main Street | Olean | NY    | 14760 |       |                |

    When I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    * I set "Location_Coverage_Replacement_Cost_Limit" to ""
    * I set "Location_Coverage_Contents_Limit" to ""
    * I set "Location_Coverage_Loss_Of_Use_Limit" to ""
    * I set "Location_Coverage_Other_Structures_Limit" to ""
    * I set "Location_Coverage_AOP_Deductible_Limit" to ""

    * I set "PF_Coverage_Contents_Limit" to "170,000"
    * I set "Sublimit_Basement_Contents" to "120,000"
    * I set "PF_Coverage_Dwelling_Limit" to "1,400,000"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "150,000"
    * I set "Sublimit_Basement_Improvements" to "55,000"
    * I set "PF_Coverage_Other_Structures_Limit" to "6,000"
    * I set "Sublimit_Landscaping" to "12,000"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "13,000"
    * I set "Sublimit_Loss_Avoidance" to "14,000"
    * I set "Sublimit_Loss_Assessment" to "43,000"
    * I set "Sublimit_Rebuilding_To_Code" to "63,000"
    * I set "Sublimit_Hardscapes" to "11,000"
    * I set "PF_Coverage_Deductible_Limit" to "25,000"

    * I fill out FS Primary Flood Coverage block

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

#    Then I create cancellation transaction
#      | by      | date     | notes             | method   | reason                        | MEP | reason |
#      | Company | Tomorrow | Cancellation test | Pro-Rate | Cancel Policy to be Rewritten |     |        |
#
#    * I create reinstatement transaction
#      | description        | notes | losses | reason               |
#      | Reinstatement test | Notes | No     | Underwriting Reasons |

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
#      | NY_001 | not in scope for phase 1
#      | TX_001 | not in scope for phase 1
#      | VA_001 | not in scope for phase 1

  @FSReinstatementCondoSTG
  Scenario Outline: NB/END - "<state>" - Condo

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "07/24/2025"
    * I set "Endorsement_Effective_Date_END" to "07/25/2025"
    * I set "Does_The_Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "1,000"

    * I set "PF_Coverage_Contents_Limit" to "0"
    * I set "Sublimit_Basement_Contents" to "0"
    * I set "Sublimit_Rebuilding_To_Code" to "0"
    * I set "Sublimit_Hardscapes" to "0"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "250,000"
    * I set "Sublimit_Landscaping" to "11,000"
    * I set "Sublimit_Loss_Avoidance" to "0"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "12,000"
    * I set "Sublimit_Loss_Assessment" to "320,000"
    * I set "PF_Coverage_Deductible_Limit" to "1,000"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page
    * I type "1,000" to "Deductible" input field
    * I click save changes button

    Then I navigate to Additional Interests page and fill additional interests details
      | Type                | LLC_Trust | Name  | Address_Line_1  | City  | State | ZIP   | Loan  | Mortgage_Type  |
      | Additional Insured  | No        | Test1 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Additional Interest | No        | Test2 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Loss Payee          | No        | Test3 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Mortgagee           | No        | Test4 | 101 Main Street | Olean | NY    | 14760 | 10000 | First Mortgage |
      | Mortgagee           | No        | Test5 | 101 Main Street | Olean | NY    | 14760 | 20000 | Third Mortgage |
      | Others              | No        | Test6 | 101 Main Street | Olean | NY    | 14760 |       |                |

    When I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    * I set "Location_Coverage_Replacement_Cost_Limit" to ""
    * I set "Location_Coverage_Contents_Limit" to ""
    * I set "Location_Coverage_Loss_Of_Use_Limit" to ""
    * I set "Location_Coverage_Other_Structures_Limit" to ""
    * I set "Location_Coverage_AOP_Deductible_Limit" to ""

    * I set "PF_Coverage_Contents_Limit" to "180,000"
    * I set "Sublimit_Basement_Contents" to "115,000"
    * I set "Sublimit_Rebuilding_To_Code" to "62,000"
    * I set "Sublimit_Hardscapes" to "12,000"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "150,000"
    * I set "Sublimit_Landscaping" to "13,000"
    * I set "Sublimit_Loss_Avoidance" to "14,000"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "11,000"
    * I set "Sublimit_Loss_Assessment" to "330,000"
    * I set "PF_Coverage_Deductible_Limit" to "10,000"

    * I fill out FS Primary Flood Coverage block

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

#    Then I create cancellation transaction
#      | by      | date     | notes             | method   | reason                        | MEP | reason |
#      | Company | Tomorrow | Cancellation test | Pro-Rate | Cancel Policy to be Rewritten |     |        |
#
#    * I create reinstatement transaction
#      | description        | notes | losses | reason               |
#      | Reinstatement test | Notes | No     | Underwriting Reasons |

    Examples:
      | state  |
      | MA_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |
#      | NY_002 | not in scope for phase 1
#      | TX_002 | not in scope for phase 1
#      | VA_002 | not in scope for phase 1

  @FSRewriteHomeownerSTG
  Scenario Outline: NB/CANC/REWRITE - "<state>" - Homeowner

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "07/24/2025"
    * I set "Endorsement_Effective_Date_END" to "07/25/2025"

    * I set "PF_Coverage_Contents_Limit" to "200,000"
    * I set "Sublimit_Basement_Contents" to "100,000"
    * I set "PF_Coverage_Dwelling_Limit" to "0"
    * I set "Sublimit_Basement_Improvements" to "0"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "250,000"
    * I set "PF_Coverage_Other_Structures_Limit" to "5,000"
    * I set "Sublimit_Landscaping" to "11,000"
    * I set "Sublimit_Hardscapes" to "12,000"
    * I set "Sublimit_Rebuilding_To_Code" to "65,000"
    * I set "Sublimit_Loss_Assessment" to "45,000"
    * I set "Sublimit_Loss_Avoidance" to "0"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "0"
    * I set "PF_Coverage_Deductible_Limit" to "2,500"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page
    * I type "2,500" to "Deductible" input field
    * I click save changes button

    Then I navigate to Additional Interests page and fill additional interests details
      | Type                | LLC_Trust | Name  | Address_Line_1  | City  | State | ZIP   | Loan  | Mortgage_Type  |
      | Additional Insured  | No        | Test1 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Additional Interest | No        | Test2 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Loss Payee          | No        | Test3 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Mortgagee           | No        | Test4 | 101 Main Street | Olean | NY    | 14760 | 10000 | First Mortgage |
      | Mortgagee           | No        | Test5 | 101 Main Street | Olean | NY    | 14760 | 20000 | Third Mortgage |
      | Others              | No        | Test6 | 101 Main Street | Olean | NY    | 14760 |       |                |

    When I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote
    * I navigate to policy
    * I navigate to transactions or endorsements

    When I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    Then I review changes
    * I click ">>> rate" button
    * I complete rewrite transaction
    * I navigate to transactions or endorsements
    * I select new business rewrite transaction
    * I navigate to subjectivities
    * I click manual bind

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
#      | NY_001 | not in scope for phase 1
#      | TX_001 | not in scope for phase 1
#      | VA_001 | not in scope for phase 1

  @FSRewriteCondoSTG
  Scenario Outline: NB/CANC/REWRITE - "<state>" - Condo

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "07/24/2025"
    * I set "Endorsement_Effective_Date_END" to "07/25/2025"

    * I set "PF_Coverage_Contents_Limit" to "200,000"
    * I set "Sublimit_Basement_Contents" to "100,000"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "50,000"
    * I set "Sublimit_Loss_Assessment" to "0"
    * I set "Sublimit_Landscaping" to "0"
    * I set "Sublimit_Hardscapes" to "11,000"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "0"
    * I set "Sublimit_Loss_Avoidance" to "13,000"
    * I set "Sublimit_Rebuilding_To_Code" to "60,000"
    * I set "PF_Coverage_Deductible_Limit" to "5,000"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page
    * I type "5,000" to "Deductible" input field
    * I click save changes button

    Then I navigate to Additional Interests page and fill additional interests details
      | Type                | LLC_Trust | Name  | Address_Line_1  | City  | State | ZIP   | Loan  | Mortgage_Type  |
      | Additional Insured  | No        | Test1 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Additional Interest | No        | Test2 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Loss Payee          | No        | Test3 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Mortgagee           | No        | Test4 | 101 Main Street | Olean | NY    | 14760 | 10000 | First Mortgage |
      | Mortgagee           | No        | Test5 | 101 Main Street | Olean | NY    | 14760 | 20000 | Third Mortgage |
      | Others              | No        | Test6 | 101 Main Street | Olean | NY    | 14760 |       |                |

    When I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote
    * I navigate to policy
    * I navigate to transactions or endorsements

    When I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    Then I review changes
    * I click ">>> rate" button
    * I complete rewrite transaction
    * I navigate to transactions or endorsements
    * I select new business rewrite transaction
    * I navigate to subjectivities
    * I click manual bind

    Examples:
      | state  |
      | MA_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |
#      | NY_002 | not in scope for phase 1
#      | TX_002 | not in scope for phase 1
#      | VA_002 | not in scope for phase 1