@US43066 @TC86132 @US @NH @PersonalAuto @Auto @PA @PCRegression @2024 @SEPT @Rating @P3 @PCTeam2Regression
Feature: US43066: NH Auto Factors - LPMP

  @NB @NewBusiness
  Scenario: NH Auto Factors - LPMP - New Business

    Given I use "NH_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "10/01/2024"
    * I set "Additional_Operators" to ","
    * I set "Additional_Vehicles" to "001,002,003"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "13,200"
    * I set "Vehicle_Details_Current_Term_Override_Value_2" to "21,790"

    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_1" to "215"
    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_2" to "245"
    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_3" to "999"

    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_1" to "415"
    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_2" to "445"
    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_3" to "999"

    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_1" to "20"
    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_2" to "30"
    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_3" to "10"

    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_1" to "20"
    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_2" to "30"
    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_3" to "10"

    * I set additional vehicles for NB
      | type                        | override | vin               | model  | make       | year | mileage   | comp        | coll        | option      | UMPD  | towing      |
      | Private Passenger           | No       | JM1GL1VM5M1605414 | MAZDA6 | Mazda      | 2021 | 12,000    | 5,000       | 5,000       | Full Glass  |       | 350         |
      | Private Passenger           | No       | 3VWC57BU4MM035678 | JETTA  | VOLKSWAGEN | 2021 | 12,000    | No Coverage | No Coverage | No Coverage | 3,500 | No Coverage |
      | Motorcycles/Mopeds/Scooters | No       | JYARN23Y1EA004111 | Inc    | Yamaha     | 2019 | 0 - 3,000 | 100         | 1,000       | Full Glass  |       |             |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject         | coverage         | factor             | factorValue | method |
      | 2021 Mazda MAZDA6     | Bodily Injury    | Symbol Factor LPMP | 0.15        | *      |
      | 2021 Volkswagen JETTA | Bodily Injury    | Symbol Factor LPMP | 0.45        | *      |
      | 2021 Mazda MAZDA6     | Property Damage  | Symbol Factor LPMP | 0.15        | *      |
      | 2021 Volkswagen JETTA | Property Damage  | Symbol Factor LPMP | 0.45        | *      |
      | 2021 Volkswagen JETTA | Medical Payments | Symbol Factor LPMP | 0.45        | *      |
      | 2021 Mazda MAZDA6     | Medical Payments | Symbol Factor LPMP | 0.15        | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
