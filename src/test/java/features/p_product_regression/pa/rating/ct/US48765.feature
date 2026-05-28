@US48765 @TC95651 @US @CT @PersonalAuto @Auto @PA @PCRegression @2025 @Mar @Rating @P1 @PCTeam2Regression
Feature: US48765: [Continued] CT – Auto - Base Rates & Incident Rating revisions

  @NB @NewBusiness @UM_Standard
  Scenario: CT – Auto - Base Rates & Incident Rating revisions UM Standard - NB

    Given I use "CT_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "01/01/1955"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "CT"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_1" to "No"
    * I set "Driver_Incidents" to "001,002,003"
    * I set "Incidents_Source_1" to "PURE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_1" to "At-fault acc > $1,000"
    * I set "Incidents_Acc_Or_Conviction_Date_1" to "12/10/2024"

    * I set "Incidents_Source_2" to "Broker/CLUE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_2" to "Speeding >15 mph over limit"
    * I set "Incidents_Acc_Or_Conviction_Date_2" to "08/17/2023"

    * I set "Incidents_Source_3" to "Insured/Applicant"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_3" to "Defective Equipment"
    * I set "Incidents_Acc_Or_Conviction_Date_3" to "02/03/2024"

    * I set "Additional_Operator_Incidents_1" to "001,002,003"
    * I set "Incidents_Additional_Driver_Source_1_1" to "Broker/CLUE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_1" to "At-fault acc > $1,000"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_1" to "01/27/2024"

    * I set "Incidents_Additional_Driver_Source_1_2" to "Broker/MVR"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_2" to "Speeding >15 mph over limit"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_2" to "02/19/2023"

    * I set "Incidents_Additional_Driver_Source_1_3" to "PURE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_3" to "Defective Equipment"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_3" to "02/19/2023"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_1" to "17840"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_2" to "45000"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_3" to "55000"
    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model           | make              | year | mileage | comp | coll  | option             |
      | Private Passenger      | No       |            | 1NXAE04B1SZ335339 | COROLLA         | TOYOTA            | 1995 | 8,000   | 100  | 1,000 | without Full Glass |
      | Antique Collectors Car | No       |            | 242076P339510     | GTO             | Pontiac           | 1966 | 5,600   | 500  | 500   | Full Glass         |
      | Motor Home             | No       |            | 5VBBA37A8GA116483 | Inc Allegro Bus | Tiffin Motorhomes | 2016 | 2,300   | 500  | 500   | Full Glass         |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject              | coverage                             | factor                    | factorValue | method |
      | Aoperator Two              | Secondary Driver Class               | Prior PURE Activity - AAF | 1.35        | *      |
      | Aoperator Two              | Secondary Driver Class               | Prior PURE Activity - AFB | 1           | *      |
      | Aoperator Two              | Secondary Driver Class               | Prior PURE Activity - MIN | 1.09        | *      |
      | Aoperator Two              | Secondary Driver Class               | Prior PURE Activity - SPD | 1.09        | *      |
      | 1995 Toyota COROLLA        | Bodily Injury                        | Base Rate Auto 3.0        | 490.84      | *      |
      | 2016 Tiffin Motorhomes Inc | Bodily Injury                        | Base Rate Auto 3.0        | 490.84      | *      |
      | 1995 Toyota COROLLA        | Property Damage                      | Base Rate Auto 3.0        | 463.75      | *      |
      | 2016 Tiffin Motorhomes Inc | Property Damage                      | Base Rate Auto 3.0        | 463.75      | *      |
      | 2016 Tiffin Motorhomes Inc | Medical Payments                     | Base Rate Auto 3.0        | 98.3        | *      |
      | 1995 Toyota COROLLA        | Medical Payments                     | Base Rate Auto 3.0        | 98.3        | *      |
      | 2016 Tiffin Motorhomes Inc | UM/UIM Split Limit Standard Coverage | Base Rate Auto 3.0        | 105.98      | +      |
      | 1995 Toyota COROLLA        | UM/UIM Split Limit Standard Coverage | Base Rate Auto 3.0        | 105.98      | +      |
      | 2016 Tiffin Motorhomes Inc | Comprehensive                        | Base Rate Auto 3.0        | 133.77      | *      |
      | 1995 Toyota COROLLA        | Comprehensive                        | Base Rate Auto 3.0        | 133.77      | *      |
      | 1995 Toyota COROLLA        | Collision                            | Base Rate Auto 3.0        | 651.3       | *      |
      | 2016 Tiffin Motorhomes Inc | Collision                            | Base Rate Auto 3.0        | 651.3       | *      |
      |                            | Bodily Injury (Collection)           | Base Rate(Collection)     | 490.84      | +      |
      |                            | Property Damage (Collection)         | Base Rate(Collection)     | 463.75      | +      |
      |                            | Medical Payments (Collection)        | Base Rate(Collection)     | 98.3        | +      |
      | 1966 Pontiac GTO           | Comprehensive (Collection)           | Base Rate Auto 3.0        | 133.77      | *      |
      | 1966 Pontiac GTO           | Collision (Collection)               | Base Rate Auto 3.0        | 651.3       | *      |
      |                            | UM/UIM Split Limit Standard Coverage | Base Rate(Collection)     | 105.98      | +      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness @UM_Conversion
  Scenario: CT – Auto - Base Rates & Incident Rating revisions UM Conversion - NB

    Given I use "CT_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Select_Coverage_UM_UIM_Split_Limit_Coverage_Selection" to "UM/UIM Split Limit Conversion"
    * I set "Select_Coverage_UM_UIM_Split_Limit_Coverage_Limits" to "500/500"
    * I set "Additional_Vehicles" to "001,"
    * I set additional vehicles for NB
      | type              | override | trim_level | vin               | model   | make   | year | mileage | comp | coll  | option             |
      | Private Passenger | No       |            | 1NXAE04B1SZ335339 | COROLLA | TOYOTA | 1995 | 8,000   | 100  | 1,000 | without Full Glass |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject | coverage | factor | factorValue | method |
#
#    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities