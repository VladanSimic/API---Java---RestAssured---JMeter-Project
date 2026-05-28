@US53066 @TC105261 @US @CA @PersonalAuto @Auto @PA @PCRegression @2025 @JUNE @Rating @P1 @PCTeam2Regression
Feature: US53066: CA - Auto - Removing discounts from excess vehicles

  @NB @NewBusiness
  Scenario: CA - Auto - Removing discounts from excess vehicles - New Business

    Given I use "CA_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "9/16/2025"

    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "07/15/1995"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_2" to "03/21/1988"
    * I set "Driver_Details_Additional_Driver_Marital_Status_1" to "Married"
    * I set "Driver_Details_Additional_Driver_Marital_Status_2" to "Married"

    * I set "Driver_Details_Additional_Driver_Marital_Status_1" to "Married"
    * I set "Driver_Details_Additional_Driver_Marital_Status_2" to "Married"
    * I set "Additional_Operators_Additional_Driver_Gender_1" to "Female"

    * I set "Additional_Operators_Additional_Driver_Relationship_To_Insured_1" to "Spouse"
    * I set "Additional_Operators_Additional_Driver_Relationship_To_Insured_2" to "Son"

    * I set "Additional_Operators_Additional_Driver_License_State_1" to "CA"
    * I set "Additional_Operators_Additional_Driver_License_State_2" to "CA"
    * I set "Driver_Details_Additional_Driver_Has_License_Been_Suspended_1" to "No"
    * I set "Driver_Details_Additional_Driver_Has_License_Been_Suspended_2" to "No"
    * I set "Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_1" to "2022"
    * I set "Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_2" to "2022"
    * I set "Driver_Details_Additional_Driver_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years_1" to "No"
    * I set "Driver_Details_Additional_Driver_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years_2" to "No"

    * I set "Additional_Vehicles" to "001,002,003,004,005"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "13200"
    * I set "Vehicle_Details_Current_Term_Override_Value_2" to "24400"
    * I set "Vehicle_Details_Current_Term_Override_Value_3" to "18000"

    * I set additional vehicles for NB
      | type                   | override | vin               | model      | make              | year | mileage | comp  | coll  | option     |
      | Private Passenger      | No       | WBAGV8C02NCH01929 | 8          | BMW               | 2022 | 11,000  | 2,500 | 2,500 | Full Glass |
      | Private Passenger      | No       | JM1GL1VM5M1605414 | MAZDA6     | Mazda             | 2021 | 12,000  | 5,000 | 5,000 | Full Glass |
      | Private Passenger      | No       | 3MVDMBCL7LM105089 | CX-30      | MAZDA             | 2020 | 12,000  | 1,000 | 1,000 | Full Glass |
      | Antique Collectors Car | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000  | 500   | 500   | Full Glass |
      | Motor Home             | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 1,000 | 1,000 | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject                | coverage                                | factor                               | factorValue | method |
#
#    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
# 753698954896