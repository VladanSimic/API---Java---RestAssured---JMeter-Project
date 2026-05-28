@US38246 @TC85100 @US @CA @PersonalAuto @Auto @PA @PCRegression @2024 @JULY @Rating @P3 @PCTeam2Regression
Feature: US38246: CA Auto Base Rate

  @NB @NewBusiness
  Scenario: CA - Auto - CA Auto Base Rate - New Business

    Given I use "CA_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "10/28/2024"
    * I set "Additional_Operators" to ","
    * I set "Additional_Vehicles" to "001,002,003,004"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "13200"
    * I set "Vehicle_Details_Cost_New_2" to "5000"
    * I set "Vehicle_Details_Engine_Size_2" to "100"
    * I set "Vehicle_Details_Year_First_Licensed_To_Operate_Motorcycle_2" to "2024"

    * I set additional vehicles for NB
      | type                        | override | vin               | model      | make              | year | mileage | comp        | coll        | option      | UMPD  | towing      |
      | Private Passenger           | No       | JM1GL1VM5M1605414 | MAZDA6     | Mazda             | 2021 | 12,000  | 5,000       | 5,000       | Full Glass  |       | 350         |
      | Motorcycles/Mopeds/Scooters | No       | 5ZT2TRTB5HB511042 | Yzf-R1c    | Yamaha            | 2014 | 14,000  | 1,000       | 1,000       | Full Glass  |       |             |
      | Motor Home                  | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 1,000       | 1,000       | Full Glass  |       |             |
      | Private Passenger           | No       | 3VWC57BU4MM035678 | JETTA      | VOLKSWAGEN        | 2021 | 12,000  | No Coverage | No Coverage | No Coverage | 3,500 | No Coverage |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                | coverage                     | factor                 | factorValue | method |
      | 2021 Mazda MAZDA6            | Bodily Injury                | Base Rate - PPA        | 2,092       | *      |
      | 2021 Volkswagen JETTA        | Bodily Injury                | Base Rate - PPA        | 2,092       | *      |
      | 2016 Tiffin Motorhomes Motor | Bodily Injury                | Base Rate - Misc2      | 1,786       | +      |
      | 2014 Yamaha Yzf-R1c          | Bodily Injury                | Base Rate - Motorcycle | 2,180       | *      |
      | 2021 Volkswagen JETTA        | Property Damage              | Base Rate - PPA        | 1,190       | *      |
      | 2016 Tiffin Motorhomes Motor | Property Damage              | Base Rate - Misc2      | 1,048       | +      |
      | 2014 Yamaha Yzf-R1c          | Property Damage              | Base Rate - Motorcycle | 1,232       | *      |
      | 2021 Mazda MAZDA6            | Property Damage              | Base Rate - PPA        | 1,190       | *      |
      | 2021 Volkswagen JETTA        | Medical Payments             | Base Rate - PPA        | 119         | *      |
      | 2016 Tiffin Motorhomes Motor | Medical Payments             | Base Rate - Misc2      | 100         | +      |
      | 2014 Yamaha Yzf-R1c          | Medical Payments             | Base Rate - Motorcycle | 124         | *      |
      | 2021 Mazda MAZDA6            | Medical Payments             | Base Rate - PPA        | 119         | *      |
      | 2016 Tiffin Motorhomes Motor | Comprehensive                | Base Rate - Misc2      | 227         | +      |
      | 2021 Mazda MAZDA6            | Comprehensive                | Base Rate - PPA        | 264         | *      |
      | 2014 Yamaha Yzf-R1c          | Comprehensive                | Base Rate - Motorcycle | 274         | *      |
      | 2016 Tiffin Motorhomes Motor | Collision                    | Base Rate - Misc2      | 1,184       | +      |
      | 2014 Yamaha Yzf-R1c          | Collision                    | Base Rate - Motorcycle | 1,566       | *      |
      | 2021 Mazda MAZDA6            | Collision                    | Base Rate - PPA        | 1,485       | *      |
      | 2021 Mazda MAZDA6            | Uninsured Motorists BI (CSL) | Base Rate - PPA        | 188         | *      |
      | 2021 Volkswagen JETTA        | Uninsured Motorists BI (CSL) | Base Rate - PPA        | 188         | *      |
      | 2014 Yamaha Yzf-R1c          | Uninsured Motorists BI (CSL) | Base Rate - Motorcycle | 198         | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists BI (CSL) | Base Rate - Misc2      | 163         | +      |
      | 2021 Volkswagen JETTA        | Uninsured Motorist PD        | Base Rate - PPA        | 245         | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
