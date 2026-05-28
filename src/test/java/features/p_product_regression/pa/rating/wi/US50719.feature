@US50719 @TC100708 @TC100754 @US @WI @PersonalAuto @Auto @PA @PCRegression @2025 @APR @Rating @P1 @PCTeam2Regression
Feature: US50719: WI - Auto - Base Rate, Factors, Structural

  @NB @NewBusiness
  Scenario: WI Auto: Base Rate, Factors, Structural - NB

    Given I use "WI_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "5/15/2025"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "01/01/1935"
    * I set "Driver_Details_Additional_Driver_Marital_Status_1" to "Single"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "WI"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_1" to "No"

    * I set "Driver_Incidents" to "001,002,003"
    * I set "Incidents_Source_1" to "PURE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_1" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Acc_Or_Conviction_Date_1" to "12/10/2024"

    * I set "Incidents_Source_2" to "Broker/CLUE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_2" to "Speeding >15 mph over limit"
    * I set "Incidents_Acc_Or_Conviction_Date_2" to "08/17/2023"

    * I set "Incidents_Source_3" to "Insured/Applicant"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_3" to "Defective Equipment"
    * I set "Incidents_Acc_Or_Conviction_Date_3" to "02/03/2024"

    * I set "Additional_Operator_Incidents_1" to "001,002,003"
    * I set "Incidents_Additional_Driver_Source_1_1" to "Broker/CLUE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_1" to "Speeding >15 mph over limit"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_1" to "01/27/2024"

    * I set "Incidents_Additional_Driver_Source_1_2" to "Broker/MVR"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_2" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_2" to "02/19/2023"

    * I set "Incidents_Additional_Driver_Source_1_3" to "PURE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_3" to "Defective Equipment"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_3" to "02/19/2023"

    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_1" to "17840"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_2" to "45000"

    * I set "Additional_Vehicles" to "001,002"
    * I set additional vehicles for NB
      | type              | override | trim_level | vin               | model           | make              | year | mileage | comp  | coll  | option     |
      | Private Passenger | No       |            | 1NXAE04B1SZ335339 | COROLLA         | TOYOTA            | 1995 | 8,000   | 1,000 | 1,000 | Full Glass |
      | Motor Home        | No       |            | 5VBBA37A8GA116483 | Inc Allegro Bus | Tiffin Motorhomes | 2016 | 2,300   | 1,000 | 1,000 | Full Glass |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject              | coverage                                      | factor                          | factorValue | method |
      | 1995 Toyota COROLLA        | Bodily Injury                                 | Base Rate 3.1                   | 393         | +      |
      | 1995 Toyota COROLLA        | Property Damage                               | Base Rate 3.1                   | 180         | +      |
      | 1995 Toyota COROLLA        | Medical Payments                              | Base Rate 3.1                   | 65          | +      |
      | 1995 Toyota COROLLA        | Uninsured Motorists                           | Base Rate 3.1                   | 87          | +      |
      | 1995 Toyota COROLLA        | Underinsured Motorists                        | Base Rate 3.1                   | 22          | +      |
      | 1995 Toyota COROLLA        | Comprehensive                                 | Base Rate 3.1                   | 134         | +      |
      | 1995 Toyota COROLLA        | Collision                                     | Base Rate 3.1                   | 330         | +      |
      | 2016 Tiffin Motorhomes Inc | Bodily Injury                                 | Base Rate - Misc - (Auto 3.2)   | 424         | +      |
      | 2016 Tiffin Motorhomes Inc | Property Damage                               | Base Rate - Misc - (Auto 3.2)   | 182         | +      |
      | 2016 Tiffin Motorhomes Inc | Medical Payments                              | Base Rate - Misc - (Auto 3.2)   | 79          | +      |
      | 2016 Tiffin Motorhomes Inc | Uninsured Motorists                           | Base Rate - Misc - (Auto 3.2)   | 78          | +      |
      | 2016 Tiffin Motorhomes Inc | Underinsured Motorists                        | Base Rate - Misc - (Auto 3.2)   | 26          | +      |
      | 2016 Tiffin Motorhomes Inc | Comprehensive                                 | Base Rate - Misc - (Auto 3.2)   | 73          | +      |
      | 2016 Tiffin Motorhomes Inc | Collision                                     | Base Rate - Misc - (Auto 3.2)   | 238         | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - BI         | Primary Driver Class - Auto 3.0 | 1.451       | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - PD         | Primary Driver Class - Auto 3.0 | 1.451       | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - MP         | Primary Driver Class - Auto 3.0 | 1.461       | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - Coll       | Primary Driver Class - Auto 3.0 | 1.35        | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - Comp       | Primary Driver Class - Auto 3.0 | 1.651       | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - UMBI/UIMBI | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Aoperator One              | Composite Driver Factor Coverage - BI         | Primary Driver Class - Auto 3.0 | 2.28        | +      |
      | Aoperator One              | Composite Driver Factor Coverage - PD         | Primary Driver Class - Auto 3.0 | 2.28        | +      |
      | Aoperator One              | Composite Driver Factor Coverage - MP         | Primary Driver Class - Auto 3.0 | 2.038       | +      |
      | Aoperator One              | Composite Driver Factor Coverage - Coll       | Primary Driver Class - Auto 3.0 | 1.74        | +      |
      | Aoperator One              | Composite Driver Factor Coverage - Comp       | Primary Driver Class - Auto 3.0 | 0.79        | +      |
      | Aoperator One              | Composite Driver Factor Coverage - UMBI/UIMBI | Primary Driver Class - Auto 3.0 | 1           | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness @RC @RenewalConversion
  Scenario: WI - Auto - Base Rate, Factors, Structural - RC

    Given I use "WI_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2024"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "01/01/1955"
    * I set "Driver_Details_Additional_Driver_Marital_Status_1" to "Single"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "WI"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_1" to "No"

    * I set "Driver_Incidents" to "001,002,003"
    * I set "Incidents_Source_1" to "PURE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_1" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Acc_Or_Conviction_Date_1" to "12/10/2024"

    * I set "Incidents_Source_2" to "Broker/CLUE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_2" to "Speeding >15 mph over limit"
    * I set "Incidents_Acc_Or_Conviction_Date_2" to "08/17/2023"

    * I set "Incidents_Source_3" to "Insured/Applicant"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_3" to "Defective Equipment"
    * I set "Incidents_Acc_Or_Conviction_Date_3" to "02/03/2024"

    * I set "Additional_Operator_Incidents_1" to "001,002,003"
    * I set "Incidents_Additional_Driver_Source_1_1" to "Broker/CLUE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_1" to "Speeding >15 mph over limit"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_1" to "01/27/2024"

    * I set "Incidents_Additional_Driver_Source_1_2" to "Broker/MVR"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_2" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_2" to "02/19/2023"

    * I set "Incidents_Additional_Driver_Source_1_3" to "PURE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_3" to "Defective Equipment"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_3" to "02/19/2023"

    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_1" to "17840"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_2" to "45000"

    * I set "Additional_Vehicles" to "001,002"
    * I set additional vehicles for NB
      | type              | override | trim_level | vin               | model           | make              | year | mileage | comp  | coll  | option     |
      | Private Passenger | No       |            | 1NXAE04B1SZ335339 | COROLLA         | TOYOTA            | 1995 | 8,000   | 1,000 | 1,000 | Full Glass |
      | Motor Home        | No       |            | 5VBBA37A8GA116483 | Inc Allegro Bus | Tiffin Motorhomes | 2016 | 2,300   | 1,000 | 1,000 | Full Glass |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject              | coverage                                      | factor                          | factorValue | method |
      | Aoperator One              | Composite Driver Factor Coverage - BI         | Primary Driver Class - Auto 3.0 | 1.109       | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - BI         | Primary Driver Class - Auto 3.0 | 1.572       | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - PD         | Primary Driver Class - Auto 3.0 | 1.572       | +      |
      | Aoperator One              | Composite Driver Factor Coverage - PD         | Primary Driver Class - Auto 3.0 | 1.109       | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - MP         | Primary Driver Class - Auto 3.0 | 1.461       | +      |
      | Aoperator One              | Composite Driver Factor Coverage - MP         | Primary Driver Class - Auto 3.0 | 1.36        | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - Coll       | Primary Driver Class - Auto 3.0 | 1.444       | +      |
      | Aoperator One              | Composite Driver Factor Coverage - Coll       | Primary Driver Class - Auto 3.0 | 1.06        | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - Comp       | Primary Driver Class - Auto 3.0 | 1.692       | +      |
      | Aoperator One              | Composite Driver Factor Coverage - Comp       | Primary Driver Class - Auto 3.0 | 0.845       | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - UMBI/UIMBI | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Aoperator One              | Composite Driver Factor Coverage - UMBI/UIMBI | Primary Driver Class - Auto 3.0 | 1           | +      |
      | 2016 Tiffin Motorhomes Inc | Bodily Injury                                 | Base Rate - Misc - (Auto 3.2)   | 267.41      | +      |
      | 1995 Toyota COROLLA        | Bodily Injury                                 | Base Rate 3.1                   | 247.89      | +      |
      | 2016 Tiffin Motorhomes Inc | Property Damage                               | Base Rate - Misc - (Auto 3.2)   | 164.66      | +      |
      | 1995 Toyota COROLLA        | Property Damage                               | Base Rate 3.1                   | 163.34      | +      |
      | 2016 Tiffin Motorhomes Inc | Medical Payments                              | Base Rate - Misc - (Auto 3.2)   | 70.73       | +      |
      | 1995 Toyota COROLLA        | Medical Payments                              | Base Rate 3.1                   | 58.88       | +      |
      | 1995 Toyota COROLLA        | Uninsured Motorists                           | Base Rate 3.1                   | 84.06       | +      |
      | 2016 Tiffin Motorhomes Inc | Uninsured Motorists                           | Base Rate - Misc - (Auto 3.2)   | 76          | +      |
      | 2016 Tiffin Motorhomes Inc | Underinsured Motorists                        | Base Rate - Misc - (Auto 3.2)   | 24.62       | +      |
      | 1995 Toyota COROLLA        | Underinsured Motorists                        | Base Rate 3.1                   | 21.57       | +      |
      | 1995 Toyota COROLLA        | Comprehensive                                 | Base Rate 3.1                   | 128.26      | +      |
      | 2016 Tiffin Motorhomes Inc | Comprehensive                                 | Base Rate - Misc - (Auto 3.2)   | 69.72       | +      |
      | 1995 Toyota COROLLA        | Collision                                     | Base Rate 3.1                   | 298.02      | +      |
      | 2016 Tiffin Motorhomes Inc | Collision                                     | Base Rate - Misc - (Auto 3.2)   | 214.56      | +      |
      | Jonny Bravo                | Secondary Driver Class                        | Prior PURE Activity - AAF       | 1           | *      |
      | Jonny Bravo                | Secondary Driver Class                        | Prior PURE Activity - AFB       | 1           | *      |
      | Jonny Bravo                | Secondary Driver Class                        | Prior PURE Activity - CPA       | 1           | *      |
      | Jonny Bravo                | Secondary Driver Class                        | Prior PURE Activity - SPD       | 1.3         | *      |
      | Aoperator One              | Secondary Driver Class                        | Prior PURE Activity - AAF       | 1           | *      |
      | Aoperator One              | Secondary Driver Class                        | Prior PURE Activity - AFB       | 1.15        | *      |
      | Aoperator One              | Secondary Driver Class                        | Prior PURE Activity - CPA       | 1           | *      |
      | Aoperator One              | Secondary Driver Class                        | Prior PURE Activity - SPD       | 1.3         | *      |


    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    When I create a renewal
    And I navigate to policy image page
    * I review changes
    * I click renewed premium
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject              | coverage                                      | factor                          | factorValue | method |
      | Jonny Bravo                | Composite Driver Factor Coverage - BI         | Primary Driver Class - Auto 3.0 | 1.451       | +      |
      | Aoperator One              | Composite Driver Factor Coverage - BI         | Primary Driver Class - Auto 3.0 | 1.13        | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - PD         | Primary Driver Class - Auto 3.0 | 1.451       | +      |
      | Aoperator One              | Composite Driver Factor Coverage - PD         | Primary Driver Class - Auto 3.0 | 1.13        | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - MP         | Primary Driver Class - Auto 3.0 | 1.461       | +      |
      | Aoperator One              | Composite Driver Factor Coverage - MP         | Primary Driver Class - Auto 3.0 | 1.36        | +      |
      | Aoperator One              | Composite Driver Factor Coverage - Coll       | Primary Driver Class - Auto 3.0 | 1.07        | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - Coll       | Primary Driver Class - Auto 3.0 | 1.35        | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - Comp       | Primary Driver Class - Auto 3.0 | 1.651       | +      |
      | Aoperator One              | Composite Driver Factor Coverage - Comp       | Primary Driver Class - Auto 3.0 | 0.84        | +      |
      | Aoperator One              | Composite Driver Factor Coverage - UMBI/UIMBI | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Jonny Bravo                | Composite Driver Factor Coverage - UMBI/UIMBI | Primary Driver Class - Auto 3.0 | 1           | +      |
      | 2016 Tiffin Motorhomes Inc | Bodily Injury                                 | Base Rate - Misc - (Auto 3.2)   | 424         | +      |
      | 1995 Toyota COROLLA        | Bodily Injury                                 | Base Rate 3.1                   | 393         | +      |
      | 1995 Toyota COROLLA        | Property Damage                               | Base Rate 3.1                   | 180         | +      |
      | 2016 Tiffin Motorhomes Inc | Property Damage                               | Base Rate - Misc - (Auto 3.2)   | 182         | +      |
      | 2016 Tiffin Motorhomes Inc | Medical Payments                              | Base Rate - Misc - (Auto 3.2)   | 79          | +      |
      | 1995 Toyota COROLLA        | Medical Payments                              | Base Rate 3.1                   | 65          | +      |
      | 2016 Tiffin Motorhomes Inc | Uninsured Motorists                           | Base Rate - Misc - (Auto 3.2)   | 78          | +      |
      | 1995 Toyota COROLLA        | Uninsured Motorists                           | Base Rate 3.1                   | 87          | +      |
      | 2016 Tiffin Motorhomes Inc | Underinsured Motorists                        | Base Rate - Misc - (Auto 3.2)   | 26          | +      |
      | 1995 Toyota COROLLA        | Underinsured Motorists                        | Base Rate 3.1                   | 22          | +      |
      | 2016 Tiffin Motorhomes Inc | Comprehensive                                 | Base Rate - Misc - (Auto 3.2)   | 73          | +      |
      | 1995 Toyota COROLLA        | Comprehensive                                 | Base Rate 3.1                   | 134         | +      |
      | 2016 Tiffin Motorhomes Inc | Collision                                     | Base Rate - Misc - (Auto 3.2)   | 238         | +      |
      | 1995 Toyota COROLLA        | Collision                                     | Base Rate 3.1                   | 330         | +      |
      | Aoperator One              | Secondary Driver Class                        | Prior PURE Activity - AAF       | 1           | *      |
      | Aoperator One              | Secondary Driver Class                        | Prior PURE Activity - AFB       | 1.3         | *      |
      | Aoperator One              | Secondary Driver Class                        | Prior PURE Activity - CPA       | 1           | *      |
      | Aoperator One              | Secondary Driver Class                        | Prior PURE Activity - SPD       | 1.31        | *      |
      | Jonny Bravo                | Secondary Driver Class                        | Prior PURE Activity - AAF       | 1           | *      |
      | Jonny Bravo                | Secondary Driver Class                        | Prior PURE Activity - AFB       | 1           | *      |
      | Jonny Bravo                | Secondary Driver Class                        | Prior PURE Activity - CPA       | 1           | *      |
      | Jonny Bravo                | Secondary Driver Class                        | Prior PURE Activity - SPD       | 1.31        | *      |

    And I click exit button
    Then I review and accept referrals on renewal if any
    * I process a renewal