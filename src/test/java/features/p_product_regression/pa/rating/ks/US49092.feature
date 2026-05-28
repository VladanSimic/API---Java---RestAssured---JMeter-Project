@US49092 @TC95699 @TC95700 @US @KS @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @Rating @P1 @PCTeam2Regression
Feature: US49092: KS Auto - Base Rate, Factors, Structural Changes - Part 2

  @NB @NewBusiness
  Scenario:  KS Auto - Base Rate, Factors, Structural Changes - NB

    Given I use "KS_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
    * I set "Date_Of_Birth" to "07/20/1991"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "KS"
    * I set "Additional_Operator_Incidents_1" to "001,002,003"
    * I set "Incidents_Additional_Driver_Source_1_1" to "Broker/CLUE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_1" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_1" to "01/27/2025"

    * I set "Incidents_Additional_Driver_Source_1_2" to "Broker/MVR"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_2" to "At-fault accident >=$1000"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_2" to "02/19/2024"

    * I set "Incidents_Additional_Driver_Source_1_3" to "Insured/Applicant"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_3" to "Speeding - 30-54 MPH Zone"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_3" to "02/19/2023"

    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_1" to "No"
    * I set "Additional_Vehicles" to "001,002"
    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model | make          | year | mileage | comp  | coll  | option     |
      | Private Passenger      | No       |            | 3MVDMBCL7LM105089 | CX-30 | Mazda         | 2020 | 4,999   | 2,500 | 1,000 | Full Glass |
      | Classic Collectors Car | No       |            | 242076P3395191122 | R100  | Rolls - Royce | 2000 | 9,100   | 5,000 | 5,000 | Full Glass |

    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Combined Single Limit (CSL)"
    * I set "Select_Coverage_CSL_Limits" to "500,000"
    * I set "Select_Coverage_UMBI_CSL_Limit" to "60,000"
    * I set "Select_Coverage_MedPay_Limits" to "10,000"
    * I set "Select_Coverage_APIP_Medical_Expense_Rehabilitation_Expense_Funeral_Expense_Work_Loss_Essential_Service_Expense" to "Option 2 - $27,500 /$27,500 /$2,500 /$1,250 /$25"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                                                                                        | factor                          | factorValue | method |
      | 2020 Mazda CX-30 | Bodily Injury                                                                                   | Base Rate 3.1                   | 500         | +      |
      | 2020 Mazda CX-30 | Property Damage                                                                                 | Base Rate 3.1                   | 300         | +      |
      | 2020 Mazda CX-30 | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate 3.1                   | 95          | +      |
      | 2020 Mazda CX-30 | Uninsured Motorists BI (CSL)                                                                    | Base Rate 3.1                   | 71          | +      |
      | 2020 Mazda CX-30 | Comprehensive With Full Glass                                                                   | Base Rate 3.1                   | 255         | +      |
      | 2020 Mazda CX-30 | Collision                                                                                       | Base Rate 3.1                   | 407         | +      |
      |                  | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate - Collector(Auto 3.1) | 70.15       | +      |
      | Aoperator Two    | Secondary Driver Class                                                                          | Prior PURE Activity - AAF       | 1.67        | *      |
      | Aoperator Two    | Secondary Driver Class                                                                          | Prior PURE Activity - AFB       | 1.27        | *      |
      | Aoperator Two    | Secondary Driver Class                                                                          | Prior PURE Activity - CPA       | 1           | *      |
      | Aoperator Two    | Secondary Driver Class                                                                          | Prior PURE Activity - INT       | 1           | *      |
      | Aoperator Two    | Secondary Driver Class                                                                          | Prior PURE Activity - SPD       | 1.27        | *      |
      | Jonny Bravo      | Composite Driver Factor Coverage - BI                                                           | Primary Driver Class - Auto 3.0 | 1.121       | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - BI                                                           | Primary Driver Class - Auto 3.0 | 1.121       | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - PD                                                           | Primary Driver Class - Auto 3.0 | 1.121       | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - PD                                                           | Primary Driver Class - Auto 3.0 | 1.121       | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - PIP                                                          | Primary Driver Class - Auto 3.0 | 1.022       | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - PIP                                                          | Primary Driver Class - Auto 3.0 | 1.022       | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - Coll                                                         | Primary Driver Class - Auto 3.0 | 1.012       | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - Coll                                                         | Primary Driver Class - Auto 3.0 | 1.012       | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - Comp                                                         | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - Comp                                                         | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - UM/UIM                                                       | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - UM/UIM                                                       | Primary Driver Class - Auto 3.0 | 1           | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @PriorNB @PriorNewBusiness
  Scenario:  KS Auto - Base Rate, Factors, Structural Changes - Prior NB

    Given I use "KS_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "03/31/2025"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "KS"
    * I set "Additional_Operator_Incidents_1" to "001,002,003"
    * I set "Incidents_Additional_Driver_Source_1_1" to "Broker/CLUE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_1" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_1" to "01/27/2025"

    * I set "Incidents_Additional_Driver_Source_1_2" to "Broker/MVR"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_2" to "At-fault accident >=$1000"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_2" to "02/19/2024"

    * I set "Incidents_Additional_Driver_Source_1_3" to "Insured/Applicant"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_3" to "Speeding - 30-54 MPH Zone"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_3" to "02/19/2023"

    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_1" to "No"
    * I set "Additional_Vehicles" to "001,002"
    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model | make          | year | mileage | comp  | coll  | option     |
      | Private Passenger      | No       |            | 3MVDMBCL7LM105089 | CX-30 | Mazda         | 2020 | 4,999   | 2,500 | 1,000 | Full Glass |
      | Classic Collectors Car | No       |            | 242076P3395191122 | R100  | Rolls - Royce | 2000 | 9,100   | 5,000 | 5,000 | Full Glass |

    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Combined Single Limit (CSL)"
    * I set "Select_Coverage_CSL_Limits" to "500,000"
    * I set "Select_Coverage_UMBI_CSL_Limit" to "60,000"
    * I set "Select_Coverage_MedPay_Limits" to "10,000"
    * I set "Select_Coverage_APIP_Medical_Expense_Rehabilitation_Expense_Funeral_Expense_Work_Loss_Essential_Service_Expense" to "Option 2 - $27,500 /$27,500 /$2,500 /$1,250 /$25"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                                                                                        | factor                          | factorValue | method |
      | 2020 Mazda CX-30 | Bodily Injury                                                                                   | Base Rate 3.1                   | 296.74      | +      |
      | 2020 Mazda CX-30 | Property Damage                                                                                 | Base Rate 3.1                   | 264.25      | +      |
      | 2020 Mazda CX-30 | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate 3.1                   | 85.14       | +      |
      | 2020 Mazda CX-30 | Uninsured Motorists BI (CSL)                                                                    | Base Rate 3.1                   | 41.06       | +      |
      | 2020 Mazda CX-30 | Comprehensive                                                                                   | Base Rate 3.1                   | 245.1       | +      |
      | 2020 Mazda CX-30 | Collision                                                                                       | Base Rate 3.1                   | 406.16      | +      |
      |                  | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate - Collector(Auto 3.1) | 70.15       | +      |
      | Aoperator Two    | Secondary Driver Class                                                                          | Prior PURE Activity - AAF       | 1.5         | *      |
      | Aoperator Two    | Secondary Driver Class                                                                          | Prior PURE Activity - AFB       | 1.1         | *      |
      | Aoperator Two    | Secondary Driver Class                                                                          | Prior PURE Activity - INT       | 1           | *      |
      | Aoperator Two    | Secondary Driver Class                                                                          | Prior PURE Activity - SPD       | 1.25        | *      |
      | Jonny Bravo      | Composite Driver Factor Coverage - BI                                                           | Primary Driver Class - Auto 3.0 | 1.121       | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - PD                                                           | Primary Driver Class - Auto 3.0 | 1.05        | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - PD                                                           | Primary Driver Class - Auto 3.0 | 1.121       | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - PIP                                                          | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - PIP                                                          | Primary Driver Class - Auto 3.0 | 1.022       | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - Coll                                                         | Primary Driver Class - Auto 3.0 | 0.972       | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - Coll                                                         | Primary Driver Class - Auto 3.0 | 1.012       | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - Comp                                                         | Primary Driver Class - Auto 3.0 | 1.053       | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - Comp                                                         | Primary Driver Class - Auto 3.0 | 0.993       | +      |
      | Aoperator Two    | Composite Driver Factor Coverage - UM/UIM                                                       | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Jonny Bravo      | Composite Driver Factor Coverage - UM/UIM                                                       | Primary Driver Class - Auto 3.0 | 1           | +      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities