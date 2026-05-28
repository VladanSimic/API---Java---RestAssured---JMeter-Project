@US53064 @TC104935 @TC104936 @TC104937 @US @TX @PersonalAuto @Auto @PA @PCRegression @2025 @JUNE @Rating @P1 @PCTeam2Regression
Feature: US53064: TX - Auto - Base Rate, 2nd Use Class/ Tier Factor for Claims, Comp PPA Deductible W/O full glass

  @NB @NewBusiness
  Scenario: TX - Auto - Base Rate - New Business

    Given I use "TX_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "7/1/2025"

    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "06/06/2003"

    * I set "Driver_Incidents" to "001,002,003"
    * I set "Incidents_Source_1" to "PURE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_1" to "At-fault accident"
    * I set "Incidents_Acc_Or_Conviction_Date_1" to "01/01/2024"

    * I set "Incidents_Source_2" to "Broker/CLUE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_2" to "At-fault accident"
    * I set "Incidents_Acc_Or_Conviction_Date_2" to "02/02/2024"

    * I set "Incidents_Source_3" to "Insured/Applicant"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_3" to "At-fault accident"
    * I set "Incidents_Acc_Or_Conviction_Date_3" to "03/03/2024"

    * I set "Incidents_Source_4" to "Broker/MVR"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_4" to "At-fault accident"
    * I set "Incidents_Acc_Or_Conviction_Date_4" to "04/04/2024"

    * I set "Additional_Operator_Incidents_1" to "001,002,003"
    * I set "Incidents_Additional_Driver_Source_1_1" to "Broker/CLUE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_1" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_1" to "06/06/2024"

    * I set "Incidents_Additional_Driver_Source_1_2" to "Broker/MVR"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_2" to "At-fault acc <$1000, no injuries"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_2" to "07/07/2024"

    * I set "Incidents_Additional_Driver_Source_1_3" to "PURE"
    * I set "Incidents_Additional_Driver_Accident_Or_Violation_Within_Last_5_Years_1_3" to "Comprehensive claim >$1000"
    * I set "Incidents_Additional_Driver_Acc_Or_Conviction_Date_1_3" to "08/08/2024"

    * I set "Additional_Vehicles" to "001,002,003,004"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "132000"
    * I set "Vehicle_Details_Current_Term_Override_Value_2" to "244000"


    * I set additional vehicles for NB
      | type                   | override | vin               | model      | make              | year | mileage | OTC_DED | coll  | option             |
      | Private Passenger      | No       | WBAGV8C02NCH01929 | M850       | BMW               | 2022 | 11,000  | 2,500   | 2,500 | without Full Glass |
      | Private Passenger      | No       | 19UDE4H69PA027805 | INTEGRA    | ACURA             | 2023 | 12,000  | 5,000   | 5,000 | with Full Glass    |
      | Antique Collectors Car | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000  | 500     | 500   | with Full Glass    |
      | Motor Home             | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 1,000   | 1,000 | with Full Glass    |

    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Split limits"
    * I set "Select_Coverage_PIP_Limits" to "5,000"
    * I set "Select_Coverage_MedPay_Limits" to "2,000"
    * I set "Select_Coverage_Automobile_Death_Indemnity_And_Total_Disability_Coverage" to "$10,000 per person/ $60 per Week"
    * I set "Select_Coverage_BI_Limits" to "1,000,000/1,000,000"
    * I set "Select_Coverage_UM_Limit" to "500,000/1,000,000"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                | coverage                                | factor                               | factorValue | method |
      | 2022 BMW M850                | Bodily Injury                           | Base Rate                            | 706.75      | *      |
      | 2023 Acura INTEGRA           | Bodily Injury                           | Base Rate                            | 706.75      | *      |
      | 2016 Tiffin Motorhomes Motor | Bodily Injury                           | Base Rate - Misc Auto 3.0            | 134.64      | +      |
      | 2016 Tiffin Motorhomes Motor | Property Damage                         | Base Rate - Misc Auto 3.0            | 259.05      | +      |
      | 2022 BMW M850                | Property Damage                         | Base Rate                            | 390.59      | *      |
      | 2023 Acura INTEGRA           | Property Damage                         | Base Rate                            | 390.59      | *      |
      | 2022 BMW M850                | Medical Payments                        | Base Rate                            | 7.5         | *      |
      | 2016 Tiffin Motorhomes Motor | Medical Payments                        | Base Rate - Misc Auto 3.0            | 10.68       | +      |
      | 2023 Acura INTEGRA           | Medical Payments                        | Base Rate                            | 7.5         | *      |
      | 2023 Acura INTEGRA           | Personal Injury Protection              | Base Rate                            | 27.59       | *      |
      | 2016 Tiffin Motorhomes Motor | Personal Injury Protection              | Base Rate - Misc Auto 3.0            | 38.04       | +      |
      | 2022 BMW M850                | Personal Injury Protection              | Base Rate                            | 27.59       | *      |
      | 2022 BMW M850                | Uninsured Motorists                     | Base Rate                            | 80.65       | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists                     | Base Rate - Misc Auto 3.0            | 52.34       | +      |
      | 2023 Acura INTEGRA           | Uninsured Motorists                     | Base Rate                            | 80.65       | *      |
      | 2016 Tiffin Motorhomes Motor | Comprehensive                           | Base Rate - Misc Auto 3.0            | 183.53      | +      |
      | 2022 BMW M850                | Comprehensive Without Full Glass        | Base Rate                            | 198.66      | *      |
      | 2023 Acura INTEGRA           | Comprehensive With Full Glass           | Base Rate                            | 198.66      | *      |
      | 2022 BMW M850                | Collision                               | Base Rate                            | 447.23      | *      |
      | 2016 Tiffin Motorhomes Motor | Collision                               | Base Rate - Misc Auto 3.0            | 739.89      | +      |
      | 2023 Acura INTEGRA           | Collision                               | Base Rate                            | 447.23      | *      |
      |                              | Personal Injury Protection (Collection) | Base Rate - Collector Auto 3.0       | 38.04       | +      |
      |                              | Medical Payments (Collection)           | Base Rate - Collector Auto 3.0       | 10.68       | +      |
      | 2016 Tiffin Motorhomes Motor | Comprehensive                           | Deductible with Full Glass           | 0.99        | *      |
      | 2022 BMW M850                | Comprehensive Without Full Glass        | Deductible Factor without Full Glass | 0.614       | *      |
      | 2023 Acura INTEGRA           | Comprehensive With Full Glass           | Deductible with Full Glass           | 0.447       | *      |
      | Jonny Bravo                  | Secondary Driver Class                  | Prior PURE Activity - AAF            | 5.46        | *      |
      | Aoperator One                | Secondary Driver Class                  | Prior PURE Activity - AAF            | 1           | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
