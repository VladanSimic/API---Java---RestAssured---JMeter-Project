@US53131 @TC103579 @US @CO @PersonalAuto @Auto @PA @PCRegression @2025 @JUNE @Rating @P1 @PCTeam2Regression
Feature: US53131: CO - Auto - Territory mapping changes

  @NB @NewBusiness
  Scenario: CO - Auto - Territory mapping changes -  New Business

    Given I use "CO_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "7/1/2025"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","
    * I set "Additional_Vehicles" to "001,002,003,004,005"
    * I set "Vehicle_Details_Garaging_Zip_Code_1" to "80023"
    * I set "Vehicle_Details_Garaging_Zip_Code_2" to "80650"
    * I set "Vehicle_Details_Garaging_Zip_Code_3" to "80023"
    * I set "Vehicle_Details_Garaging_Zip_Code_4" to "80023"
    * I set "Vehicle_Details_Garaging_Zip_Code_5" to "80927"
    * I set "Vehicle_Details_Cost_New_4" to "5000"
    * I set "Vehicle_Details_Engine_Size_4" to "100"
    * I set additional vehicles for NB
      | type                        | override | vin               | model   | make        | year | mileage | comp  | coll  | option             | towing |
      | Private Passenger           | No       | 3MVDMBCL7LM105089 | CX-30   | Mazda       | 2020 | 8,000   | 1,000 | 1,000 | without Full Glass | 350    |
      | Private Passenger           | No       | 3C6UR5FL8PG637799 | PICKUP  | Dodge       | 2023 | 8,000   | 1,000 | 1,000 | with Full Glass    | 350    |
      | Private Passenger           | No       | 1GYKNARS2JZ209669 | XT5     | CADILLAC    | 2018 | 8,000   | 1,000 | 1,000 | with Full Glass    | 350    |
      | Motorcycles/Mopeds/Scooters | No       | JYARN23Y1EA004111 | Yzf-R1c | Yamaha      | 2014 | 8,000   | 1,000 | 1,000 | with Full Glass    |        |
      | Classic Collectors Car      | No       | 242076P3395191122 | R100    | Rolls-Royce | 2000 | 8,000   | 1,000 | 1,000 | with Full Glass    |        |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I navigate to vehicle 1 details page
    * I pause for "3" seconds
    * I verify territory factors garaging location terr is "104"
    * I navigate to vehicle 2 details page
    * I pause for "3" seconds
    * I verify territory factors garaging location terr is "10"
    * I navigate to vehicle 3 details page
    * I pause for "3" seconds
    * I verify territory factors garaging location terr is "104"
    * I navigate to vehicle 4 details page
    * I pause for "3" seconds
    * I verify territory factors garaging location terr is "104"
    * I navigate to vehicle 5 details page
    * I pause for "3" seconds
    * I verify territory factors garaging location terr is "104"
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
