@US50904 @TC99839 @US @NC @PersonalAuto @Auto @PA @PCRegression @2025 @APR @Forms @P1 @PCTeam2Regression
Feature: US50904: NC Auto - Base Rate, Factors, UI - Form Changes

  @NB @NewBusiness
  Scenario: NC Auto - Base Rate, Factors, UI - Form Changes - New Business

    Given I use "NC_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"
    * I set "Additional_Operators" to "001,"
    * I set "Additional_Operators_Additional_Driver_Relationship_To_Insured_1" to "Spouse"
    * I set "Additional_Operators_Additional_Driver_Gender_1" to "Female"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "07/14/1983"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "NC"
    * I set "Additional_Operators_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_Canada_Or_PuertoRico_1" to "2008"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "NO"

    * I set "Additional_Vehicles" to "001,002,003"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "61,500"
    * I set "Vehicle_Details_Stated_Amount_2" to "15,500"
    * I set additional vehicles for NB
      | type                   | vin               | model  | make                | year | mileage | comp          | coll  | option             |
      | Private Passenger      | 3FMCR9B61NRD14784 | BRONCO | FORD                | 2022 | 8,000   | 1,000         | 1,000 | without Full Glass |
      | Classic Collectors Car | 242076P3395191114 | R100   | Rolls-Royce         | 2000 | 8,000   | 1,000         | 1,000 | with Full Glass    |
      | Golf Carts             | A4PUTVKD6NBA00322 | L5     | AMERICAN LANDMASTER | 2021 | 8,000   | Full Coverage | 100   | with Full Glass    |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    When I navigate to premium details page
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities