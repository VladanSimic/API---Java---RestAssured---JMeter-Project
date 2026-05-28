@US48801 @TC96560 @US @IN @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @Rating @P1 @PCTeam2Regression
Feature: US48801: IN Auto - Base Rate, Factors Changes

  @NB @NewBusiness
  Scenario: IN Auto - Base Rate, Factors Changes - NB

    Given I use "IN_015" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "IN"
    * I set "Additional_Operators_Additional_Driver_License_State_2" to "IN"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_2" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_2" to "No"

    * I set "Additional_Operator_Incidents_1" to "001,002,003"
    * I set "Incidents_Additional_Driver_Source_1_1" to "Broker/CLUE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_1" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_1" to "01/27/2025"

    * I set "Incidents_Additional_Driver_Source_1_2" to "Broker/MVR"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_2" to "At-fault accident >=$1000"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_2" to "02/19/2024"

    * I set "Incidents_Additional_Driver_Source_1_3" to "Insured/Applicant"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_3" to "Speeding >15 mph over limit"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_3" to "02/19/2023"
    * I set "Additional_Vehicles" to "001,002"
    * I set additional vehicles for NB
      | type                        | override | trim_level | vin               | model   | make   | year | mileage   | comp   | coll  | option     |
      | Private Passenger           | No       |            | 3MVDMBCL7LM105089 | CX-30   | Mazda  | 2020 | 4,999     | 2,500  | 1,000 | Full Glass |
      | Motorcycles/Mopeds/Scooters | No       |            | JYARN23Y1EA004111 | Yzf-R1c | Yamaha | 2014 | 0 - 3,000 | 10,000 | 2,500 | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                  | factor                              | factorValue | method |
      | 2020 Mazda CX-30    | Bodily Injury             | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2020 Mazda CX-30    | Property Damage           | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2020 Mazda CX-30    | Medical Payments          | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2020 Mazda CX-30    | Uninsured Motorists BI    | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2020 Mazda CX-30    | Underinsured Motorists BI | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2020 Mazda CX-30    | Uninsured Motorists PD    | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2020 Mazda CX-30    | Comprehensive             | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2020 Mazda CX-30    | Collision                 | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2020 Mazda CX-30    | Bodily Injury             | Base Rate                           | 484         | +      |
      | 2020 Mazda CX-30    | Property Damage           | Base Rate                           | 369         | +      |
      | 2020 Mazda CX-30    | Medical Payments          | Base Rate                           | 56          | +      |
      | 2020 Mazda CX-30    | Uninsured Motorists BI    | Base Rate                           | 14          | +      |
      | 2020 Mazda CX-30    | Underinsured Motorists BI | Base Rate                           | 25          | +      |
      | 2020 Mazda CX-30    | Uninsured Motorists PD    | Base Rate                           | 11          | +      |
      | 2020 Mazda CX-30    | Comprehensive             | Base Rate                           | 107         | +      |
      | 2020 Mazda CX-30    | Collision                 | Base Rate                           | 325         | +      |
      | 2014 Yamaha Yzf-R1c | Bodily Injury             | Base Rate - Misc (Auto 3.2)         | 403         | +      |
      | 2014 Yamaha Yzf-R1c | Property Damage           | Base Rate - Misc (Auto 3.2)         | 260         | +      |
      | 2014 Yamaha Yzf-R1c | Medical Payments          | Base Rate - Misc (Auto 3.2)         | 68          | +      |
      | 2014 Yamaha Yzf-R1c | Uninsured Motorists BI    | Base Rate - Misc (Auto 3.2)         | 19          | +      |
      | 2014 Yamaha Yzf-R1c | Underinsured Motorists BI | Base Rate - Misc (Auto 3.2)         | 34          | +      |
      | 2014 Yamaha Yzf-R1c | Uninsured Motorists PD    | Base Rate - Misc (Auto 3.2)         | 19          | +      |
      | 2014 Yamaha Yzf-R1c | Comprehensive             | Base Rate - Misc (Auto 3.2)         | 59          | +      |
      | 2014 Yamaha Yzf-R1c | Collision                 | Base Rate - Misc (Auto 3.2)         | 183         | +      |
      | Aoperator One       | Secondary Driver Class    | Prior PURE Activity - AAF           | 1.67        | *      |
      | Aoperator One       | Secondary Driver Class    | Prior PURE Activity - AFB           | 1.27        | *      |
      | Aoperator One       | Secondary Driver Class    | Prior PURE Activity - CPA           | 1           | *      |
      | Aoperator One       | Secondary Driver Class    | Prior PURE Activity - SPD           | 1.27        | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities