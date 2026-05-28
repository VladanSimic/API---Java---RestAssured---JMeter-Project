@US43058  @TC86105 @US @LA @PersonalAuto @Auto @PA @PCRegression @2024 @SEPT @Rating @P3 @PCTeam2Regression
Feature: US43058: LA Auto Base Rate

  @NB @NewBusiness
  Scenario: LA Auto Base Rate - New Business

    Given I use "LA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "10/01/2024"
    * I set "Additional_Operators" to ","
    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "13200"

    * I set additional vehicles for NB
      | type              | override | vin               | model  | make       | year | mileage | comp        | coll        | option      | UMPD  | towing      |
      | Private Passenger | No       | JM1GL1VM5M1605414 | MAZDA6 | Mazda      | 2021 | 12,000  | 5,000       | 5,000       | Full Glass  |       | 350         |
      | Private Passenger | No       | 3VWC57BU4MM035678 | JETTA  | VOLKSWAGEN | 2021 | 12,000  | No Coverage | No Coverage | No Coverage | 3,500 | No Coverage |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject         | coverage               | factor        | factorValue | method |
      | 2021 Mazda MAZDA6     | Bodily Injury          | Base Rate 3.1 | 2,625       | +      |
      | 2021 Volkswagen JETTA | Bodily Injury          | Base Rate 3.1 | 2,625       | +      |
      | 2021 Mazda MAZDA6     | Property Damage        | Base Rate 3.1 | 584         | +      |
      | 2021 Volkswagen JETTA | Property Damage        | Base Rate 3.1 | 584         | +      |
      | 2021 Mazda MAZDA6     | Medical Payments       | Base Rate 3.1 | 60          | +      |
      | 2021 Volkswagen JETTA | Medical Payments       | Base Rate 3.1 | 60          | +      |
      | 2021 Mazda MAZDA6     | Uninsured Motorists BI | Base Rate 3.1 | 406         | +      |
      | 2021 Volkswagen JETTA | Uninsured Motorists BI | Base Rate 3.1 | 406         | +      |
      | 2021 Mazda MAZDA6     | Comprehensive          | Base Rate 3.1 | 452         | +      |
      | 2021 Mazda MAZDA6     | Collision              | Base Rate 3.1 | 674         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
