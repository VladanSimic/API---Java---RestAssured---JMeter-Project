@US48794 @TC96694 @US @IA @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @Rating @P1 @PCTeam2Regression
Feature: US48794: [Continued] IA Auto - Base Rate and Factor Changes

  @NB @NewBusiness
  Scenario:  IA Auto - Base Rate and Factor Changes - NB

    Given I use "IA_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "IA"
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

    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_1" to "No"
    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type                        | override | trim_level | vin               | model      | make   | year | mileage   | comp   | coll  | option     |
      | Private Passenger           | No       |            | 3MVDMBCL7LM105089 | CX-30      | Mazda  | 2020 | 4,999     | 2,500  | 1,000 | Full Glass |
      | Private Passenger           | No       |            | 3C6UR5FL8PG637799 | PICKUP VIN | Dodge  | 2023 | 9,100     | 5,000  | 5,000 | Full Glass |
      | Motorcycles/Mopeds/Scooters | No       |            | JYARN23Y1EA004111 | Yzf-R1c    | Yamaha | 2014 | 0 - 3,000 | 10,000 | 2,500 | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                        | factor                              | factorValue | method |
      | 2020 Mazda CX-30    | Bodily Injury                   | Base Rate                           | 192         | +      |
      | 2014 Yamaha Yzf-R1c | Bodily Injury                   | Base Rate - Misc (Auto 3.2)         | 184         | +      |
      | 2023 Dodge 2500     | Bodily Injury                   | Base Rate                           | 192         | +      |
      | 2020 Mazda CX-30    | Property Damage                 | Base Rate                           | 132         | +      |
      | 2014 Yamaha Yzf-R1c | Property Damage                 | Base Rate - Misc (Auto 3.2)         | 125         | +      |
      | 2023 Dodge 2500     | Property Damage                 | Base Rate                           | 132         | +      |
      | 2014 Yamaha Yzf-R1c | Medical Payments                | Base Rate - Misc (Auto 3.2)         | 28          | +      |
      | 2020 Mazda CX-30    | Medical Payments                | Base Rate                           | 25          | +      |
      | 2023 Dodge 2500     | Medical Payments                | Base Rate                           | 25          | +      |
      | 2014 Yamaha Yzf-R1c | Uninsured Motorists BI (CSL)    | Base Rate - Misc (Auto 3.2)         | 16          | +      |
      | 2020 Mazda CX-30    | Uninsured Motorists BI (CSL)    | Base Rate                           | 14          | +      |
      | 2023 Dodge 2500     | Uninsured Motorists BI (CSL)    | Base Rate                           | 14          | +      |
      | 2020 Mazda CX-30    | Underinsured Motorists BI (CSL) | Base Rate                           | 18          | +      |
      | 2023 Dodge 2500     | Underinsured Motorists BI (CSL) | Base Rate                           | 18          | +      |
      | 2014 Yamaha Yzf-R1c | Underinsured Motorists BI (CSL) | Base Rate - Misc (Auto 3.2)         | 20          | +      |
      | 2023 Dodge 2500     | Comprehensive                   | Base Rate                           | 242         | +      |
      | 2020 Mazda CX-30    | Comprehensive                   | Base Rate                           | 242         | +      |
      | 2014 Yamaha Yzf-R1c | Comprehensive                   | Base Rate - Misc (Auto 3.2)         | 137         | +      |
      | 2023 Dodge 2500     | Collision                       | Base Rate                           | 245         | +      |
      | 2014 Yamaha Yzf-R1c | Collision                       | Base Rate - Misc (Auto 3.2)         | 146         | +      |
      | 2020 Mazda CX-30    | Collision                       | Base Rate                           | 245         | +      |
      | Aoperator Two       | Secondary Driver Class          | Prior PURE Activity - AAF           | 1.67        | *      |
      | Aoperator Two       | Secondary Driver Class          | Prior PURE Activity - AFB           | 1.27        | *      |
      | Aoperator Two       | Secondary Driver Class          | Prior PURE Activity - SPD           | 1.27        | *      |
      | 2020 Mazda CX-30    | Bodily Injury                   | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2023 Dodge 2500     | Bodily Injury                   | Annual Mileage Factor (with Carfax) | 1.03        | *      |
      | 2020 Mazda CX-30    | Property Damage                 | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2023 Dodge 2500     | Property Damage                 | Annual Mileage Factor (with Carfax) | 1.03        | *      |
      | 2020 Mazda CX-30    | Medical Payments                | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2023 Dodge 2500     | Medical Payments                | Annual Mileage Factor (with Carfax) | 1.03        | *      |
      | 2020 Mazda CX-30    | Uninsured Motorists BI (CSL)    | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2023 Dodge 2500     | Uninsured Motorists BI (CSL)    | Annual Mileage Factor (with Carfax) | 1.03        | *      |
      | 2020 Mazda CX-30    | Underinsured Motorists BI (CSL) | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2023 Dodge 2500     | Underinsured Motorists BI (CSL) | Annual Mileage Factor (with Carfax) | 1.03        | *      |
      | 2023 Dodge 2500     | Comprehensive                   | Annual Mileage Factor (with Carfax) | 1.03        | *      |
      | 2020 Mazda CX-30    | Comprehensive                   | Annual Mileage Factor (with Carfax) | 0.858       | *      |
      | 2023 Dodge 2500     | Collision                       | Annual Mileage Factor (with Carfax) | 1.03        | *      |
      | 2020 Mazda CX-30    | Collision                       | Annual Mileage Factor (with Carfax) | 0.858       | *      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities