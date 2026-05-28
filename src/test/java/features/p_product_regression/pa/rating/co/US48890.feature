@US48890 @TC95636 @US @CO @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @Rating @P1 @PCTeam2Regression
Feature: US48890: CO Auto - COMP Deductible w/o Full Glass Changes

  @NB @NewBusiness
  Scenario: CO Auto - Full Glass Coverage -  NewBusiness

    Given I use "CO_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "17,840"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_2" to "61,740"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_3" to "81,790"

    * I set additional vehicles for NB
      | type              | override | trim_level | vin               | model  | make  | year | mileage | comp  | coll  | option             |
      | Private Passenger | No       |            | 3C6UR5FL8PG637799 | PICKUP | Dodge | 2023 | 8,000   | 1,000 | 1,000 | with Full Glass    |
      | Private Passenger | No       |            | 3MVDMBCL7LM105089 | CX-30  | Mazda | 2020 | 8,000   | 500   | 1,000 | without Full Glass |



    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject     | coverage                         | factor                               | factorValue | method |
      | 2020 Mazda CX-30  | Comprehensive Without Full Glass | Deductible Factor without Full Glass | 1.162       | *      |
      | 2023 Dodge 2500   | Comprehensive With Full Glass    | Deductible with Full Glass           | 0.935       | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities