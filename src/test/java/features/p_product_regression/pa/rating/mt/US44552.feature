@US44552 @TC88982 @US @MT @PersonalAuto @Auto @PA @PCRegression @2024 @OCT @Forms @P3 @PCTeam2Regression
Feature: US44552: MT Auto Base Rate, Symbols, Com Ded for Glass

  @NB @NewBusiness
  Scenario: MT Auto Base Rate, Symbols, Com Ded for Glass - New Business

    Given I use "MT_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "11/15/2024"
    * I set "Additional_Vehicles" to "001,002,003,004"
    * I set "Additional_Operator_Incidents_1" to ","
    * I set "Additional_Operators" to ","
    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "30,000"

    * I set "Vehicle_Details_Current_Term_Override_2" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_2" to "180,000"

    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_1" to "215"
    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_2" to "999"
    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_3" to "245"
    * I set "Symbols_Underwriter_Symbol_Override_Liability_Symbol_4" to "999"

    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_1" to "415"
    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_2" to "999"
    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_3" to "445"
    * I set "Symbols_Underwriter_Symbol_Override_MP_Symbol_4" to "999"

    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_1" to "20"
    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_2" to "10"
    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_3" to "10"
    * I set "Symbols_Underwriter_Symbol_Override_COLL_Symbol_4" to "10"

    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_1" to "20"
    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_2" to "10"
    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_3" to "10"
    * I set "Symbols_Underwriter_Symbol_Override_COMP_Symbol_4" to "10"

    * I set additional vehicles for NB
      | type                   | override | vin               | model      | make              | year | mileage | comp        | coll        | UMPD     | option             | towing      |
      | Private Passenger      | No       | 1FMJK1K50AEA94152 | EXPEDITION | Ford              | 2010 | 11,000  | No Coverage | No Coverage | Rejected | No Coverage        | No Coverage |
      | Private Passenger      | No       | 1Z7HC28K79S731347 | RAIDER     | MITSUBISHI        | 2009 | 11,000  | 2,500       | 2,500       | 150      | without Full Glass | 350         |
      | Motor Home             | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 500         | 500         | 150      | with Full Glass    | No Coverage |
      | Antique Collectors Car | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000  | 1,000       | 1,000       | 150      | with Full Glass    | No Coverage |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                | coverage                         | factor                               | factorValue | method |
      | 2010 Ford EXPEDITION         | Bodily Injury                    | Base Rate                            | 710         | *      |
      | 2009 Mitsubishi RAIDER       | Bodily Injury                    | Base Rate                            | 710         | *      |
      | 2016 Tiffin Motorhomes Motor | Bodily Injury                    | Base Rate - Misc                     | 710         | +      |
      | 2010 Ford EXPEDITION         | Property Damage                  | Base Rate                            | 381         | *      |
      | 2016 Tiffin Motorhomes Motor | Property Damage                  | Base Rate - Misc                     | 381         | +      |
      | 2009 Mitsubishi RAIDER       | Property Damage                  | Base Rate                            | 381         | *      |
      | 2010 Ford EXPEDITION         | Medical Payments                 | Base Rate                            | 98          | *      |
      | 2009 Mitsubishi RAIDER       | Medical Payments                 | Base Rate                            | 0           | *      |
      | 2016 Tiffin Motorhomes Motor | Medical Payments                 | Base Rate - Misc                     | 98          | +      |
      | 2010 Ford EXPEDITION         | Uninsured Motorists              | Base Rate                            | 44          | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists              | Base Rate - Misc                     | 44          | +      |
      | 2009 Mitsubishi RAIDER       | Uninsured Motorists              | Base Rate                            | 0           | *      |
      | 2016 Tiffin Motorhomes Motor | Underinsured Motorists           | Base Rate - Misc                     | 135         | +      |
      | 2009 Mitsubishi RAIDER       | Underinsured Motorists           | Base Rate                            | 0           | *      |
      | 2010 Ford EXPEDITION         | Underinsured Motorists           | Base Rate                            | 135         | *      |
      | 2009 Mitsubishi RAIDER       | Comprehensive Without Full Glass | Base Rate                            | 46          | *      |
      | 2016 Tiffin Motorhomes Motor | Comprehensive                    | Base Rate - Misc                     | 46          | +      |
      | 2016 Tiffin Motorhomes Motor | Collision                        | Base Rate - Misc                     | 216         | +      |
      | 2009 Mitsubishi RAIDER       | Collision                        | Base Rate                            | 216         | *      |
      | 2009 Mitsubishi RAIDER       | Comprehensive Without Full Glass | Deductible Factor without Full Glass | 0.754       | *      |
      | 2016 Tiffin Motorhomes Motor | Comprehensive                    | Deductible with Full Glass           | 1.13        | *      |
      | 2016 Tiffin Motorhomes Motor | Bodily Injury                    | Territory Factor - Misc              | 1           | *      |
      | 2016 Tiffin Motorhomes Motor | Property Damage                  | Territory Factor - Misc              | 1           | *      |
      | 2016 Tiffin Motorhomes Motor | Medical Payments                 | Territory Factor - Misc              | 1           | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists              | Territory Factor - Misc              | 1           | *      |
      | 2016 Tiffin Motorhomes Motor | Underinsured Motorists           | Territory Factor - Misc              | 1           | *      |
      | 2016 Tiffin Motorhomes Motor | Comprehensive                    | Territory Factor - Misc              | 1           | *      |
      | 2016 Tiffin Motorhomes Motor | Collision                        | Territory Factor - Misc              | 1           | *      |
      | 2009 Mitsubishi RAIDER       | Bodily Injury                    | Symbol Factor LPMP                   | 1           | *      |
      | 2010 Ford EXPEDITION         | Bodily Injury                    | Symbol Factor LPMP                   | 0.8         | *      |
      | 2009 Mitsubishi RAIDER       | Property Damage                  | Symbol Factor LPMP                   | 1           | *      |
      | 2010 Ford EXPEDITION         | Property Damage                  | Symbol Factor LPMP                   | 0.8         | *      |
      | 2009 Mitsubishi RAIDER       | Medical Payments                 | Symbol Factor LPMP                   | 1           | *      |
      | 2010 Ford EXPEDITION         | Medical Payments                 | Symbol Factor LPMP                   | 0.8         | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities