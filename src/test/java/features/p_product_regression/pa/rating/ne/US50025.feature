@US50025 @TC99288 @TC99289 @US @NE @PersonalAuto @Auto @PA @PCRegression @2025 @APR @Rating @P1 @PCTeam2Regression
Feature: US50025: [Continued] NE - Auto - Rates & Comp deductible full glass changes

  @NB @NewBusiness
  Scenario: NE Auto: Base rates/Primary Use class factors/ Incidents(PURE/Prior Pure Activity)  - NB

    Given I use "NE_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "5/15/2025"

    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "03/03/2005"
    * I set "Driver_Details_Additional_Driver_Marital_Status_1" to "Single"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_2" to "05/05/1975"
    * I set "Driver_Details_Additional_Driver_Marital_Status_2" to "Single"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "NE"
    * I set "Additional_Operators_Additional_Driver_License_State_2" to "NE"

    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_1" to "No"

    * I set "Driver_Incidents" to "001,002,003"

    * I set "Incidents_Source_1" to "PURE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_1" to "At-fault accident >=$1000"
    * I set "Incidents_Acc_Or_Conviction_Date_1" to "03/03/2024"

    * I set "Incidents_Source_2" to "Broker/CLUE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_2" to "Comprehensive claim >=$1000"
    * I set "Incidents_Acc_Or_Conviction_Date_2" to "04/04/2023"

    * I set "Incidents_Source_3" to "Broker/MVR"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_3" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Acc_Or_Conviction_Date_3" to "02/03/2024"

    * I set "Additional_Operator_Incidents_1" to "001,"
    * I set "Incidents_Additional_Driver_Source_1_1" to "Broker/CLUE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_1" to "Comprehensive claim >=$1000"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_1" to "01/27/2024"

    * I set "Additional_Operator_Incidents_2" to "001,"
    * I set "Incidents_Additional_Driver_Source_2_1" to "Broker/MVR"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_2_1" to "Speeding >15 mph over limit"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_2_1" to "02/02/2025"


    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_1" to "17840"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_2" to "45000"

    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type                        | vin               | model   | make   | year | mileage | comp  | coll  | option     |
      | Private Passenger           | 1NXAE04B1SZ335339 | COROLLA | TOYOTA | 1995 | 8,000   | 1,000 | 1,000 | Full Glass |
      | Private Passenger           | JTHBK1EG0B2456665 | ES 350  | LEXUS  | 2011 | 8,000   | 1,000 | 1,000 | Full Glass |
      | Motorcycles/Mopeds/Scooters | JYARN23Y1EA004111 | Yzf-R1c | Yamaha | 2014 | 8,000   | 1,000 | 1,000 | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                                        | factor                          | factorValue | method |
      | 2011 Lexus ES       | Bodily Injury                                   | Base Rate (Auto 3.2)            | 355         | +      |
      | 1995 Toyota COROLLA | Bodily Injury                                   | Base Rate (Auto 3.2)            | 355         | +      |
      | 2014 Yamaha Yzf-R1c | Bodily Injury                                   | Base Rate - Misc (Auto 3.2)     | 326         | +      |
      | 2014 Yamaha Yzf-R1c | Property Damage                                 | Base Rate - Misc (Auto 3.2)     | 223         | +      |
      | 1995 Toyota COROLLA | Property Damage                                 | Base Rate (Auto 3.2)            | 249         | +      |
      | 2011 Lexus ES       | Property Damage                                 | Base Rate (Auto 3.2)            | 249         | +      |
      | 1995 Toyota COROLLA | Medical Payments                                | Base Rate (Auto 3.2)            | 44          | +      |
      | 2011 Lexus ES       | Medical Payments                                | Base Rate (Auto 3.2)            | 44          | +      |
      | 2014 Yamaha Yzf-R1c | Medical Payments                                | Base Rate - Misc (Auto 3.2)     | 46          | +      |
      | 2011 Lexus ES       | Uninsured Motorists BI/Underinsured Motorist BI | Base Rate (Auto 3.2)            | 30          | +      |
      | 1995 Toyota COROLLA | Uninsured Motorists BI/Underinsured Motorist BI | Base Rate (Auto 3.2)            | 30          | +      |
      | 2014 Yamaha Yzf-R1c | Uninsured Motorists BI/Underinsured Motorist BI | Base Rate - Misc (Auto 3.2)     | 21          | +      |
      | 1995 Toyota COROLLA | Comprehensive With Full Glass                   | Base Rate (Auto 3.2)            | 257         | +      |
      | 2014 Yamaha Yzf-R1c | Comprehensive                                   | Base Rate - Misc (Auto 3.2)     | 139         | +      |
      | 2011 Lexus ES       | Comprehensive With Full Glass                   | Base Rate (Auto 3.2)            | 257         | +      |
      | 2014 Yamaha Yzf-R1c | Collision                                       | Base Rate - Misc (Auto 3.2)     | 166         | +      |
      | 1995 Toyota COROLLA | Collision                                       | Base Rate (Auto 3.2)            | 270         | +      |
      | 2011 Lexus ES       | Collision                                       | Base Rate (Auto 3.2)            | 270         | +      |
      | Jonny Bravo         | Secondary Driver Class                          | Prior PURE Activity - AAF       | 1.67        | *      |
      | Jonny Bravo         | Secondary Driver Class                          | Prior PURE Activity - AFB       | 1.3         | *      |
      | Jonny Bravo         | Secondary Driver Class                          | Prior PURE Activity - CPA       | 1.13        | *      |
      | Jonny Bravo         | Secondary Driver Class                          | Prior PURE Activity - SPD       | 1           | *      |
      | Aoperator One       | Secondary Driver Class                          | Prior PURE Activity - AAF       | 1           | *      |
      | Aoperator One       | Secondary Driver Class                          | Prior PURE Activity - AFB       | 1           | *      |
      | Aoperator One       | Secondary Driver Class                          | Prior PURE Activity - CPA       | 1.13        | *      |
      | Aoperator One       | Secondary Driver Class                          | Prior PURE Activity - SPD       | 1           | *      |
      | Aoperator Two       | Secondary Driver Class                          | Prior PURE Activity - AAF       | 1           | *      |
      | Aoperator Two       | Secondary Driver Class                          | Prior PURE Activity - AFB       | 1           | *      |
      | Aoperator Two       | Secondary Driver Class                          | Prior PURE Activity - CPA       | 1           | *      |
      | Aoperator Two       | Secondary Driver Class                          | Prior PURE Activity - SPD       | 1.31        | *      |
      | Aoperator One       | Composite Driver Factor Coverage - Comp         | Primary Driver Class - Auto 3.0 | 2.166       | +      |
      | Aoperator Two       | Composite Driver Factor Coverage - Comp         | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Jonny Bravo         | Composite Driver Factor Coverage - Comp         | Primary Driver Class - Auto 3.0 | 1           | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness
  Scenario: NE Auto:  Comp deductible full glass changes - NB

    Given I use "NE_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "5/15/2025"
    * I set "Additional_Operators" to ","
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"
    * I set "Vehicle_Details_Current_Term_Override_Value_2" to "61,740"
    * I set "Vehicle_Details_Current_Term_Override_Value_3" to "81,790"

    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type              | vin               | model    | make      | year | mileage | comp  | coll  | option             |
      | Private Passenger | 1NXAE04B1SZ335339 | COROLLA  | TOYOTA    | 1995 | 8,000   | 500   | 500   | without Full Glass |
      | Private Passenger | JTHBK1EG0B2456665 | ES 350   | LEXUS     | 2011 | 8,000   | 1,000 | 1,000 | without Full Glass |
      | Private Passenger | 1GNSCAKC9LR120982 | TAHOE LS | CHEVROLET | 2020 | 8,000   | 2,500 | 2,500 | Full Glass         |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject        | coverage                         | factor                               | factorValue | method |
      | 1995 Toyota COROLLA  | Comprehensive Without Full Glass | Deductible Factor without Full Glass | 0.968       | *      |
      | 2011 Lexus ES        | Comprehensive Without Full Glass | Deductible Factor without Full Glass | 0.878       | *      |
      | 2020 Chevrolet TAHOE | Comprehensive With Full Glass    | Deductible with Full Glass           | 0.774       | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities