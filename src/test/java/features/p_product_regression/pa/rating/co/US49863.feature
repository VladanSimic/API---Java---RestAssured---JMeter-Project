@US49863 @TC99114 @US @CO @PersonalAuto @Auto @PA @PCRegression @2025 @APR @Rating @P1 @PCTeam2Regression
Feature: US49863: [Continued] CO - Auto - CAPTA Assessment changes

  @NB @NewBusiness
  Scenario: CO Auto: CAPTA Assessment changes - NB

    Given I use "CO_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "01/01/1999"
    * I set "Driver_Details_Additional_Driver_Marital_Status_1" to "Single"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "CO"
    * I set "Additional_Vehicles" to "001,002,003,004"

    * I set additional vehicles for NB
      | type                 | vin               | model   | make         | year | comp  | coll  | option          |
      | Collectors Trailer   | 5SFGF36226E001019 | Bighorn | Heartland    | 1960 | 250   | 250   | with Full Glass |
      | Recreational Trailer | 5ZT2TRTB5HB511042 | Tracer  | Forest River | 2017 | 1,000 | 1,000 | with Full Glass |
      | Snowmobiles          | 2BPSUFMA0MV000215 | e       | Ski-Doo      | 2021 | 250   | 500   | with Full Glass |
      | Dune Buggies         | MI0508A189L083091 | Buggy   | Volkswagen   | 1991 | 100   | 250   | with Full Glass |
     # | All Terrain Vehicles | LWGMHWZ64FA000283 | Cat     | Arctic       | 2017 | 500   | 500   | with Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject            | coverage                       | factor                              | factorValue | method |
      | 2017 Forest River Tracer | State Mandated Fee Per Vehicle | State Mandated Fee per each Vehicle | 0           | +      |
      | 1960 Heartland Bighorn   | State Mandated Fee Per Vehicle | State Mandated Fee per each Vehicle | 0           | +      |
      | 1991 Volkswagen Buggy    | State Mandated Fee Per Vehicle | State Mandated Fee per each Vehicle | 0           | +      |
      | 2021 Ski-Doo e           | State Mandated Fee Per Vehicle | State Mandated Fee per each Vehicle | 0           | +      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities