@US43064 @TC85993 @US @UT @PersonalAuto @Auto @PA @PCRegression @2024 @Sept @Rating @P3 @PCTeam2Regression
Feature: US43064: UT Auto Base Rate, Factors, Structural

  @NB @NewBusiness
  Scenario: UT Auto Base Rate, Factors, Structural - New Business

    Given I use "UT_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "10/01/2024"
    * I set "Additional_Operators" to ","
    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "13200"

    * I set additional vehicles for NB
      | type              | override | vin               | model      | make              | year | mileage | comp  | coll  | option     |
      | Private Passenger | No       | JM1GL1VM5M1605414 | MAZDA6     | Mazda             | 2021 | 12,000  | 5,000 | 5,000 | Full Glass |
      | Motor Home        | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 1,000 | 1,000 | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                | coverage                                | factor                          | factorValue | method |
      | 2016 Tiffin Motorhomes Motor | Bodily Injury                           | Base Rate - Misc (Auto 3.1)     | 591         | +      |
      | 2021 Mazda MAZDA6            | Bodily Injury                           | Base Rate                       | 434         | *      |
      | 2016 Tiffin Motorhomes Motor | Property Damage                         | Base Rate - Misc (Auto 3.1)     | 294         | +      |
      | 2021 Mazda MAZDA6            | Property Damage                         | Base Rate                       | 244         | *      |
      | 2016 Tiffin Motorhomes Motor | Personal Injury Protection              | Base Rate - Misc (Auto 3.1)     | 149         | +      |
      | 2021 Mazda MAZDA6            | Personal Injury Protection              | Base Rate                       | 108         | *      |
      | 2021 Mazda MAZDA6            | Uninsured Motorists BI                  | Base Rate                       | 37          | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists BI                  | Base Rate - Misc (Auto 3.1)     | 28          | +      |
      | 2021 Mazda MAZDA6            | Underinsured Motorists BI               | Base Rate                       | 47          | *      |
      | 2016 Tiffin Motorhomes Motor | Underinsured Motorists BI               | Base Rate - Misc (Auto 3.1)     | 35          | +      |
      | 2021 Mazda MAZDA6            | Uninsured Motorist PD                   | Base Rate                       | 3           | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorist PD                   | Base Rate - Misc (Auto 3.1)     | 2           | +      |
      | 2021 Mazda MAZDA6            | Comprehensive                           | Base Rate                       | 105         | *      |
      | 2016 Tiffin Motorhomes Motor | Comprehensive                           | Base Rate - Misc (Auto 3.1)     | 46          | +      |
      | 2016 Tiffin Motorhomes Motor | Collision                               | Base Rate - Misc (Auto 3.1)     | 191         | +      |
      | 2021 Mazda MAZDA6            | Collision                               | Base Rate                       | 223         | *      |
      | Jonny Bravo                  | Composite Driver Factor Coverage - Comp | Primary Driver Class - Auto 3.0 | 1           | +      |
      | 2021 Mazda MAZDA6            | Collision                               | Family Vehicle Adjustment       | 1           | *      |
      | 2021 Mazda MAZDA6            | Bodily Injury                           | Annual Mileage Factor           | 1.126       | *      |
      | 2021 Mazda MAZDA6            | Property Damage                         | Annual Mileage Factor           | 1.126       | *      |
      | 2021 Mazda MAZDA6            | Personal Injury Protection              | Annual Mileage Factor           | 1.126       | *      |
      | 2021 Mazda MAZDA6            | Uninsured Motorists BI                  | Annual Mileage Factor           | 1.126       | *      |
      | 2021 Mazda MAZDA6            | Underinsured Motorists BI               | Annual Mileage Factor           | 1.126       | *      |
      | 2021 Mazda MAZDA6            | Uninsured Motorist PD                   | Annual Mileage Factor           | 1.126       | *      |
      | 2021 Mazda MAZDA6            | Comprehensive                           | Annual Mileage Factor           | 1.126       | *      |
      | 2021 Mazda MAZDA6            | Collision                               | Annual Mileage Factor           | 1.126       | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
