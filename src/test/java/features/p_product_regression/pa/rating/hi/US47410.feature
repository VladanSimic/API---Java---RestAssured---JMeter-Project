@US47410 @TC94110 @US @HI @PersonalAuto @Auto @PA @PCRegression @2025 @JAN @Rating @P2 @PCTeam2Regression
Feature: US47410: HI Auto - Base Rate, Factors, Structural

  @NB @NewBusiness
  Scenario: HI Auto: Base Rate, Factor & Structural -  New Business

    Given I use "HI_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","

    * I set "Additional_Vehicles" to "001,002,003"
    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"
    * I set "Vehicle_Details_Current_Term_Override_2" to "Yes"
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
      | type                        | override | vin               | model | make   | year | mileage   | comp | coll  | option     |
      | Private Passenger           | No       | JTJJM7FX0C5038645 | GX    | LEXUS  | 2012 | 8,000     | 250  | 250   | Full Glass |
      | Private Passenger           | No       | 5J8TC2H37KL011921 | RDX   | ACURA  | 2019 | 8,000     | 500  | 1,000 | Full Glass |
      | Motorcycles/Mopeds/Scooters | No       | JYARN23Y1EA004111 | Inc   | Yamaha | 2019 | 0 - 3,000 | 100  | 1,000 | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject   | coverage                              | factor                | factorValue | method |
      | 2012 Lexus GX   | Bodily Injury                         | Base Rate             | 328         | *      |
      | 2019 Acura RDX  | Bodily Injury                         | Base Rate             | 328         | *      |
      | 2019 Yamaha Inc | Bodily Injury                         | Base Rate             | 328         | *      |
      | 2012 Lexus GX   | Property Damage                       | Base Rate             | 235         | *      |
      | 2019 Yamaha Inc | Property Damage                       | Base Rate             | 235         | *      |
      | 2019 Acura RDX  | Property Damage                       | Base Rate             | 235         | *      |
      | 2019 Acura RDX  | Personal Injury Protection            | Base Rate             | 192         | *      |
      | 2012 Lexus GX   | Personal Injury Protection            | Base Rate             | 192         | *      |
      | 2019 Yamaha Inc | Uninsured Motorists BI - Unstacked    | Base Rate - Unstacked | 56          | *      |
      | 2012 Lexus GX   | Uninsured Motorists BI - Unstacked    | Base Rate - Unstacked | 56          | *      |
      | 2019 Acura RDX  | Uninsured Motorists BI - Unstacked    | Base Rate - Unstacked | 56          | *      |
      | 2012 Lexus GX   | Underinsured Motorists BI - Unstacked | Base Rate - Unstacked | 130         | *      |
      | 2019 Yamaha Inc | Underinsured Motorists BI - Unstacked | Base Rate - Unstacked | 130         | *      |
      | 2019 Acura RDX  | Underinsured Motorists BI - Unstacked | Base Rate - Unstacked | 130         | *      |
      | 2019 Yamaha Inc | Comprehensive                         | Base Rate             | 169         | *      |
      | 2012 Lexus GX   | Comprehensive                         | Base Rate             | 169         | *      |
      | 2019 Acura RDX  | Comprehensive                         | Base Rate             | 169         | *      |
      | 2019 Yamaha Inc | Collision                             | Base Rate             | 522         | *      |
      | 2012 Lexus GX   | Collision                             | Base Rate             | 522         | *      |
      | 2019 Acura RDX  | Collision                             | Base Rate             | 522         | *      |
      | 2012 Lexus GX   | Bodily Injury                         | Annual Mileage Factor | 1           | *      |
      | 2019 Acura RDX  | Bodily Injury                         | Annual Mileage Factor | 1           | *      |
      | 2012 Lexus GX   | Property Damage                       | Annual Mileage Factor | 1           | *      |
      | 2019 Acura RDX  | Property Damage                       | Annual Mileage Factor | 1           | *      |
      | 2019 Acura RDX  | Personal Injury Protection            | Annual Mileage Factor | 1           | *      |
      | 2012 Lexus GX   | Personal Injury Protection            | Annual Mileage Factor | 1           | *      |
      | 2012 Lexus GX   | Uninsured Motorists BI - Unstacked    | Annual Mileage Factor | 1           | *      |
      | 2019 Acura RDX  | Uninsured Motorists BI - Unstacked    | Annual Mileage Factor | 1           | *      |
      | 2012 Lexus GX   | Underinsured Motorists BI - Unstacked | Annual Mileage Factor | 1           | *      |
      | 2019 Acura RDX  | Underinsured Motorists BI - Unstacked | Annual Mileage Factor | 1           | *      |
      | 2012 Lexus GX   | Comprehensive                         | Annual Mileage Factor | 1           | *      |
      | 2019 Acura RDX  | Comprehensive                         | Annual Mileage Factor | 1           | *      |
      | 2012 Lexus GX   | Collision                             | Annual Mileage Factor | 1           | *      |
      | 2019 Acura RDX  | Collision                             | Annual Mileage Factor | 1           | *      |
      | 2019 Acura RDX  | Bodily Injury                         | Symbol Factor LPMP    | 0.45        | *      |
      | 2012 Lexus GX   | Bodily Injury                         | Symbol Factor LPMP    | 0.15        | *      |
      | 2012 Lexus GX   | Property Damage                       | Symbol Factor LPMP    | 0.15        | *      |
      | 2019 Acura RDX  | Property Damage                       | Symbol Factor LPMP    | 0.45        | *      |
      | 2019 Acura RDX  | Personal Injury Protection            | Symbol Factor LPMP    | 0.45        | *      |
      | 2012 Lexus GX   | Personal Injury Protection            | Symbol Factor LPMP    | 0.15        | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities