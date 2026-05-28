@PrimaryFlood @NonAdmitted @FSFormsQASpecialCondo
Feature: FS - NonAdmitted -  Forms

  @FSNbEndCancReinstCondoSTGOptional
  Scenario Outline: NB/END/CANC/REINST - "<state>" - Condo

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_QA" to "Milan Josifljevic"
    * I set "Advisor_Servicer_AWS_QA" to "Milan Josifljevic"
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I set "Primary_Flood_Policy" to "Yes"
    * I set "Current_Primary_Flood_Insurance_Carrier" to "PURE"
    * I set "Existing_Agency_Client" to "No"
    * I set "Non_Renewed_Or_Declined_Coverage" to "No"
    * I set "Dangerous_Dogs" to "No"
    * I set "Policy_Delivery_Option" to "AgencyDelivery"
    * I set "Optional_Coverages_Earthquake_HO3254" to "5%"
    * I set "AOP_Ded" to "100,000"
    * I set "Deductible" to "100,000"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Business_Property_Increase" to ""
    * I set "Residence_Have_Basement" to "Yes"

    * I set "PF_Coverage_Contents_Limit" to "0"
    * I set "Sublimit_Basement_Contents" to "0"
    * I set "Sublimit_Rebuilding_To_Code" to "0"
    * I set "Sublimit_Hardscapes" to "0"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "250,000"
    * I set "Sublimit_Landscaping" to "11,000"
    * I set "Sublimit_Loss_Avoidance" to "0"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "12,000"
    * I set "Sublimit_Loss_Assessment" to "320,000"
    * I set "PF_Coverage_Deductible_Limit" to "5,000"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
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

    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

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

    Then I review changes FS
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I create cancellation transaction
      | by      | date     | notes             | method   | reason                        | MEP | reason |
      | Company | Tomorrow | Cancellation test | Pro-Rate | Cancel Policy to be Rewritten |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    Examples:
      | state  | producer          |
      | CA_001 | Milan Josifljevic |
      | FL_001 | Milan Josifljevic |
      | LA_001 | Milan Josifljevic |
      | NC_001 | Milan Josifljevic |
      | AL_001 | Patty1 Clement    |
      | KY_001 | Milan Josifljevic |
      | MS_001 | Milan Josifljevic |
#      | AR_001 | Milan Josifljevic |
#      | NY_001 | not in scope for phase 1
#      | TX_001 | not in scope for phase 1
#      | VA_001 | not in scope for phase 1
  #####################################FLOOD COVERAGE PAGE########################################################################################################
  @GAFormsCondo
  Scenario Outline: NB/END/CANC/REINST - "<state>" - Condo

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_QA" to "<producer>"
    * I set "Advisor_Servicer_AWS_QA" to "Milan Josifljevic"
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "178 Springfield Blvd"
    * I set "City_Name_Txt" to "Macon"
    * I set "Zip_Code" to "31210"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I set "Primary_Flood_Policy" to "Yes"
    * I set "Current_Primary_Flood_Insurance_Carrier" to "PURE"
    * I set "Existing_Agency_Client" to "No"
    * I set "Non_Renewed_Or_Declined_Coverage" to "No"
    * I set "Dangerous_Dogs" to "No"
    * I set "Policy_Delivery_Option" to "AgencyDelivery"
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "No"
    * I set "Optional_Coverages_Earthquake_HO3254" to "5%"
    * I set "AOP_Ded" to "100,000"
    * I set "Residence_Type" to "Condo/Co-op"

    * I set "PF_Coverage_Contents_Limit" to "0"
    * I set "Sublimit_Basement_Contents" to "0"
    * I set "Sublimit_Rebuilding_To_Code" to "0"
    * I set "Sublimit_Hardscapes" to "0"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "250,000"
    * I set "Sublimit_Landscaping" to "11,000"
    * I set "Sublimit_Loss_Avoidance" to "0"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "12,000"
    * I set "Sublimit_Loss_Assessment" to "320,000"
    * I set "PF_Coverage_Deductible_Limit" to "5,000"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
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

    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

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

    * I rate a quote
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I create cancellation transaction
      | by      | date     | notes             | method   | reason                        | MEP | reason |
      | Company | Tomorrow | Cancellation test | Pro-Rate | Cancel Policy to be Rewritten |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    Examples:
      | state  | producer          |
      | GA_001 | Milan Josifljevic |

  @CTFormsCondo
  Scenario Outline: NB/END/CANC/REINST - "<state>" - Condo

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_STG" to "<producer>"
    * I set "Advisor_Servicer_AWS_STG" to "Milan Josifljevic"
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "123 Five Field Rd"
    * I set "City_Name_Txt" to "Madison"
    * I set "Zip_Code" to "06443"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I set "Primary_Flood_Policy" to "Yes"
    * I set "Current_Primary_Flood_Insurance_Carrier" to "PURE"
    * I set "Existing_Agency_Client" to "No"
    * I set "Non_Renewed_Or_Declined_Coverage" to "No"
    * I set "Dangerous_Dogs" to "No"
    * I set "Policy_Delivery_Option" to "AgencyDelivery"
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "No"
    * I set "Optional_Coverages_Earthquake_HO3254" to "5%"
    * I set "AOP_Ded" to "100,000"
    * I set "Residence_Type" to "Condo/Co-op"

    * I set "PF_Coverage_Contents_Limit" to "0"
    * I set "Sublimit_Basement_Contents" to "0"
    * I set "Sublimit_Rebuilding_To_Code" to "0"
    * I set "Sublimit_Hardscapes" to "0"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "250,000"
    * I set "Sublimit_Landscaping" to "11,000"
    * I set "Sublimit_Loss_Avoidance" to "0"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "12,000"
    * I set "Sublimit_Loss_Assessment" to "320,000"
    * I set "PF_Coverage_Deductible_Limit" to "5,000"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
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

    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

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

    * I rate a quote
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I create cancellation transaction
      | by      | date     | notes             | method   | reason                        | MEP | reason |
      | Company | Tomorrow | Cancellation test | Pro-Rate | Cancel Policy to be Rewritten |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    Examples:
      | state  | producer          |
      | CT_001 | Milan Josifljevic |

  @MAFormsCondo
  Scenario Outline: NB/END/CANC/REINST - "<state>" - Condo

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_QA" to "<producer>"
    * I set "Advisor_Servicer_AWS_QA" to "Milan Josifljevic"
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "25 Allied Dr"
    * I set "City_Name_Txt" to "Dedham"
    * I set "Zip_Code" to "02026"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I set "Primary_Flood_Policy" to "Yes"
    * I set "Current_Primary_Flood_Insurance_Carrier" to "PURE"
    * I set "Existing_Agency_Client" to "No"
    * I set "Non_Renewed_Or_Declined_Coverage" to "No"
    * I set "Dangerous_Dogs" to "No"
    * I set "Policy_Delivery_Option" to "AgencyDelivery"
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "No"
    * I set "Optional_Coverages_Earthquake_HO3254" to "5%"
    * I set "AOP_Ded" to "100,000"
    * I set "Residence_Type" to "Condo/Co-op"

    * I set "PF_Coverage_Contents_Limit" to "0"
    * I set "Sublimit_Basement_Contents" to "0"
    * I set "Sublimit_Rebuilding_To_Code" to "0"
    * I set "Sublimit_Hardscapes" to "0"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "250,000"
    * I set "Sublimit_Landscaping" to "11,000"
    * I set "Sublimit_Loss_Avoidance" to "0"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "12,000"
    * I set "Sublimit_Loss_Assessment" to "320,000"
    * I set "PF_Coverage_Deductible_Limit" to "5,000"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
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

    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

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

    * I rate a quote
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I create cancellation transaction
      | by      | date     | notes             | method   | reason                        | MEP | reason |
      | Company | Tomorrow | Cancellation test | Pro-Rate | Cancel Policy to be Rewritten |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    Examples:
      | state  | producer          |
      | MA_001 | Milan Josifljevic |

  @CONJILFormsCondo
  Scenario Outline: NB/END/CANC/REINST - "<state>" - Condo

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_QA" to "<producer>"
    * I set "Advisor_Servicer_AWS_QA" to "Milan Josifljevic"
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I set "Primary_Flood_Policy" to "Yes"
    * I set "Current_Primary_Flood_Insurance_Carrier" to "PURE"
    * I set "Existing_Agency_Client" to "No"
    * I set "Non_Renewed_Or_Declined_Coverage" to "No"
    * I set "Dangerous_Dogs" to "No"
    * I set "Policy_Delivery_Option" to "AgencyDelivery"
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "No"
    * I set "Optional_Coverages_Earthquake_HO3254" to "5%"
    * I set "AOP_Ded" to "100,000"
    * I set "Residence_Type" to "Condo/Co-op"

    * I set "PF_Coverage_Contents_Limit" to "0"
    * I set "Sublimit_Basement_Contents" to "0"
    * I set "Sublimit_Rebuilding_To_Code" to "0"
    * I set "Sublimit_Hardscapes" to "0"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "250,000"
    * I set "Sublimit_Landscaping" to "11,000"
    * I set "Sublimit_Loss_Avoidance" to "0"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "12,000"
    * I set "Sublimit_Loss_Assessment" to "320,000"
    * I set "PF_Coverage_Deductible_Limit" to "5,000"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
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

    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

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

    * I rate a quote
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I create cancellation transaction
      | by      | date     | notes             | method   | reason                        | MEP | reason |
      | Company | Tomorrow | Cancellation test | Pro-Rate | Cancel Policy to be Rewritten |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    Examples:
      | state  | producer          |
      | CO_001 | Milan Josifljevic |
      | NJ_001 | Milan Josifljevic |
      | IL_001 | Milan Josifljevic |

  @MOFormsCondo
  Scenario Outline: NB/END/CANC/REINST - "<state>" - Condo

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "AGENCY_NAME" to "Underc0de"
    * I set "AGENCY_ID" to "800391600"
    * I set "Licensed_Producer_AWS_QA" to "<producer>"
    * I set "Advisor_Servicer_AWS_QA" to "Milan Josifljevic"
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "119 Stone Ledge Dr"
    * I set "City_Name_Txt" to "Saint Clair"
    * I set "Zip_Code" to "63077"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I set "Primary_Flood_Policy" to "Yes"
    * I set "Current_Primary_Flood_Insurance_Carrier" to "PURE"
    * I set "Existing_Agency_Client" to "No"
    * I set "Non_Renewed_Or_Declined_Coverage" to "No"
    * I set "Dangerous_Dogs" to "No"
    * I set "Policy_Delivery_Option" to "AgencyDelivery"
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "No"
    * I set "Optional_Coverages_Earthquake_HO3254" to "5%"
    * I set "AOP_Ded" to "100,000"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Optional_Coverages_Business_Property_Increase" to ""

    * I set "PF_Coverage_Contents_Limit" to "0"
    * I set "Sublimit_Basement_Contents" to "0"
    * I set "Sublimit_Rebuilding_To_Code" to "0"
    * I set "Sublimit_Hardscapes" to "0"
    * I set "PF_Coverage_Loss_Of_Use_Limit" to "250,000"
    * I set "Sublimit_Landscaping" to "11,000"
    * I set "Sublimit_Loss_Avoidance" to "0"
    * I set "Sublimit_Pools_Hot_Tubs_Spas" to "12,000"
    * I set "Sublimit_Loss_Assessment" to "320,000"
    * I set "PF_Coverage_Deductible_Limit" to "5,000"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
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

    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

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

    * I rate a quote
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I create cancellation transaction
      | by      | date     | notes             | method   | reason                        | MEP | reason |
      | Company | Tomorrow | Cancellation test | Pro-Rate | Cancel Policy to be Rewritten |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    Examples:
      | state  | producer          |
      | MO_001 | Milan Josifljevic |