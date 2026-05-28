@US43063 @TC86659 @US @MS @PersonalAuto @Auto @PA @PCRegression @2024 @SEPT @Forms @P3 @PCTeam2Regression
Feature: US43063: MS Auto Base Rate, Factors, Structural

  @NB @NewBusiness
  Scenario: MS Auto Base Rate, Factors, Structural

    Given I use "MS_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "10/01/2024"
    * I set "Additional_Vehicles" to "001,002,003"

    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "30,000"

    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_1" to "999"
    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_2" to "999"
    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_3" to "999"

    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_1" to "999"
    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_2" to "999"
    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_3" to "999"

    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_1" to "20"
    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_2" to "30"
    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_3" to "10"

    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_1" to "20"
    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_2" to "30"
    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_3" to "10"

    * I set additional vehicles for NB
      | type                   | override | vin               | model      | make              | year | mileage | comp  | coll  | UMPD | option             | towing      |
      | Private Passenger      | No       | 3VWC57BU4MM035678 | JETTA      | VOLKSWAGEN        | 2021 | 11,000  | 2,500 | 2,500 | 150  | without Full Glass | 350         |
      | Antique Collectors Car | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000  | 1,000 | 1,000 | 150  | with Full Glass    | No Coverage |
      | Motor Home             | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 500   | 500   | 150  | with Full Glass    | No Coverage |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                | coverage               | factor                               | factorValue | method |
      | 2021 Volkswagen JETTA        | Bodily Injury          | Base Rate (Auto 3.2)                 | 456.74      | +      |
      | 2016 Tiffin Motorhomes Motor | Bodily Injury          | Base Rate - Misc (Auto 3.2)          | 456.74      | +      |
      | 2021 Volkswagen JETTA        | Property Damage        | Base Rate (Auto 3.2)                 | 231.73      | +      |
      | 2016 Tiffin Motorhomes Motor | Property Damage        | Base Rate - Misc (Auto 3.2)          | 231.73      | +      |
      | 2021 Volkswagen JETTA        | Medical Payments       | Base Rate (Auto 3.2)                 | 48.27       | +      |
      | 2016 Tiffin Motorhomes Motor | Medical Payments       | Base Rate - Misc (Auto 3.2)          | 48.27       | +      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists BI | Base Rate - Misc (Auto 3.2)          | 127.07      | +      |
      | 2021 Volkswagen JETTA        | Uninsured Motorists BI | Base Rate (Auto 3.2)                 | 127.07      | +      |
      | 2021 Volkswagen JETTA        | Uninsured Motorists PD | Base Rate (Auto 3.2)                 | 14.6        | +      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists PD | Base Rate - Misc (Auto 3.2)          | 14.6        | +      |
      | 2021 Volkswagen JETTA        | Comprehensive          | Base Rate (Auto 3.2)                 | 205.24      | +      |
      | 2016 Tiffin Motorhomes Motor | Comprehensive          | Base Rate - Misc (Auto 3.2)          | 205.24      | +      |
      | 2021 Volkswagen JETTA        | Collision              | Base Rate (Auto 3.2)                 | 336.87      | +      |
      | 2016 Tiffin Motorhomes Motor | Collision              | Base Rate - Misc (Auto 3.2)          | 336.87      | +      |
      | 2016 Tiffin Motorhomes Motor | Comprehensive          | Deductible with Full Glass           | 1.21        | *      |
      | 2021 Volkswagen JETTA        | Comprehensive          | Deductible Factor without Full Glass | 0.49        | *      |
      | 2021 Volkswagen JETTA        | Bodily Injury          | Symbol Factor LPMP                   | 1           | *      |
      | 2021 Volkswagen JETTA        | Property Damage        | Symbol Factor LPMP                   | 1           | *      |
      | 2021 Volkswagen JETTA        | Medical Payments       | Symbol Factor LPMP                   | 1           | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities