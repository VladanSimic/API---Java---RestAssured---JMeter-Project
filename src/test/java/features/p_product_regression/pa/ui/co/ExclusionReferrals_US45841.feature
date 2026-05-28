@US45841 @TC95497 @US @CO @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @UWReferrals @P1 @PCTeam2Regression
Feature: US45841: [Continued] CO Auto 3.1 UI, UW Referral & Forms changes

  @NB @NewBusiness
  Scenario: CO Auto 3.1 UI, UW Referral & Forms changes - NB

    Given I use "CO_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
    * I set "Additional_Operators_Additional_Driver_Exclude_1" to "Yes"
    * I set "Additional_Operators_Additional_Driver_License_State_1_1" to "CO"
    * I set "Additional_Operators_Additional_Driver_License_State_1_2" to "CO"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "17,840"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_2" to "61,740"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_3" to "81,790"
    * I set "Ownership_Ownership_1" to "Financed"
    * I set "Vehicle_Details_Loss_Payee_1" to "001,"
    * I set "Loss_Payee_Additional_Interest_Interest_Type_1_1" to "Additional Insured"
    * I set "Loss_Payee_Additional_Interest_LLC_Trust_1_1" to "No"
    * I set "Loss_Payee_Additional_Interest_Loss_Payee_Additional_Interest_Name_1_1" to "Test Name"
    * I set "Loss_Payee_Additional_Interest_Street_Address_1_1" to "3291 Garland St"
    * I set "Loss_Payee_Additional_Interest_City_1_1" to "Wheat Ridge"
    * I set "Loss_Payee_Additional_Interest_State_1_1" to "CO"
    * I set "Loss_Payee_Additional_Interest_ZIP_1_1" to "80033"

    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model      | make    | year | mileage | comp  | coll  | option             |
      | Private Passenger      | No       |            | 1NXAE04B1SZ335339 | COROLLA    | TOYOTA  | 1995 | 8,000   | 1,000 | 1,000 | without Full Glass |
      | Motor Home             | No       |            | 5VBBA37A8GA116483 | Motorhomes | Tiffin  | 2016 | 8,000   | 1,000 | 1,000 | with Full Glass    |
      | Antique Collectors Car | No       |            | 242076P339510     | GTO        | Pontiac | 1966 | 8,000   | 1,000 | 1,000 | with Full Glass    |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to Operators and Vehicles Page
    * I verify that the UI change for the "Checkbox" type with the specified "Operators manually added / added from active household quotes & policies" block "Exclude" is "Displayed" on the UI
    * I rate a quote
    When I navigate to premium details page
    * I verify that "Aoperator Two" factor should not rated
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                               | triggeredOrNot |
      | A driver is listed as an 'excluded operator'. Please refer to Underwriting. Note - a signed 'Driver Exclusion Notice' would be required if we agree to release a quote. | Triggered      |

    And I accept underwriting referrals
    And I bind a quote

  @NB @NewBusiness @PreBind
  Scenario: CO Auto 3.1 UI, UW Referral & Forms changes - Pre-Bind

    Given I use "CO_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
    * I set "Additional_Operators_Additional_Driver_Exclude_1" to "Yes"
    * I set "Additional_Operators_Additional_Driver_License_State_1_1" to "CO"
    * I set "Additional_Operators_Additional_Driver_License_State_1_2" to "CO"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "17,840"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_2" to "61,740"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_3" to "81,790"
    * I set "Ownership_Ownership_1" to "Financed"
    * I set "Vehicle_Details_Loss_Payee_1" to "001,"
    * I set "Loss_Payee_Additional_Interest_Interest_Type_1_1" to "Additional Insured"
    * I set "Loss_Payee_Additional_Interest_LLC_Trust_1_1" to "No"
    * I set "Loss_Payee_Additional_Interest_Loss_Payee_Additional_Interest_Name_1_1" to "Test Name"
    * I set "Loss_Payee_Additional_Interest_Street_Address_1_1" to "3291 Garland St"
    * I set "Loss_Payee_Additional_Interest_City_1_1" to "Wheat Ridge"
    * I set "Loss_Payee_Additional_Interest_State_1_1" to "CO"
    * I set "Loss_Payee_Additional_Interest_ZIP_1_1" to "80033"

    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model      | make    | year | mileage | comp  | coll  | option             |
      | Private Passenger      | No       |            | 1NXAE04B1SZ335339 | COROLLA    | TOYOTA  | 1995 | 8,000   | 1,000 | 1,000 | without Full Glass |
      | Motor Home             | No       |            | 5VBBA37A8GA116483 | Motorhomes | Tiffin  | 2016 | 8,000   | 1,000 | 1,000 | with Full Glass    |
      | Antique Collectors Car | No       |            | 242076P339510     | GTO        | Pontiac | 1966 | 8,000   | 1,000 | 1,000 | with Full Glass    |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to Operators and Vehicles Page
    * I rate a quote