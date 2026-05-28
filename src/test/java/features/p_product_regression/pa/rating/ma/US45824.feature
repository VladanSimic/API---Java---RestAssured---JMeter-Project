@US45824 @TC90565 @TC90568 @US @MA @PersonalAuto @Auto @PA @PCRegression @2024 @DEC @Rating @P2 @PCTeam2Regression
Feature: US45824: [Continued] MA Auto - Base Rate

  @NB @NewBusiness
  Scenario: MA Auto - Base Rate -  New Business

    Given I use "MA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "1/1/2025"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","

    * I set "Additional_Vehicles" to "001,002,003"
    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"

    * I set additional vehicles for NB
      | type              | override | vin               | model            | make                | year | mileage   | OTC_DED              | COLL_DED | COLL_Option | Waiver_COLL_DED |
      | Private Passenger | No       | 1NXAE04B1SZ335339 | COROLLA          | TOYOTA              | 1995 | 8,000     | $500 w/Full Glass    | 5,000    | Standard    | Yes             |
      | Private Passenger | No       | 3MVDMBCL7LM105089 | CX-30            | Mazda               | 2020 | 8,000     | $10,000 w/Full Glass | 2,500    | Limited     |                 |
      | Golf Carts        | No       | A4PUTVKD6NBA00322 | L5 - SIDE X SIDE | AMERICAN LANDMASTER | 2022 | 0 - 3,000 | 250                  | 250      | Standard    | Yes             |

    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Split limits"
    * I set "Select_Coverage_BI_Limits" to "250,000/500,000"
    * I set "Select_Coverage_PIP_Deductible" to "Full Coverage"
    * I set "Select_Coverage_MedPay_Limits" to "10,000"
    * I set "Select_Coverage_UMBI" to "250,000/500,000"
    * I set "Select_Coverage_UIMBI" to "250,000/500,000"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject               | coverage                   | factor                      | factorValue | method |
      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury              | Base Rate - Misc (Auto 3.1) | 376.33      | +      |
      | 1995 Toyota COROLLA         | Bodily Injury              | Base Rate                   | 376.33      | *      |
      | 2020 Mazda CX-30            | Bodily Injury              | Base Rate                   | 376.33      | *      |
      | 2022 AMERICAN LANDMASTER L5 | Property Damage            | Base Rate - Misc (Auto 3.1) | 382.8       | +      |
      | 2020 Mazda CX-30            | Property Damage            | Base Rate                   | 382.8       | *      |
      | 1995 Toyota COROLLA         | Property Damage            | Base Rate                   | 382.8       | *      |
      | 2020 Mazda CX-30            | Medical Payments           | Base Rate                   | 20.25       | *      |
      | 1995 Toyota COROLLA         | Medical Payments           | Base Rate                   | 20.25       | *      |
      | 2020 Mazda CX-30            | Personal Injury Protection | Base Rate                   | 57.62       | *      |
      | 1995 Toyota COROLLA         | Personal Injury Protection | Base Rate                   | 57.62       | *      |
      | 2020 Mazda CX-30            | Uninsured Motorists BI     | Base Rate                   | 34.5        | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorists BI     | Base Rate                   | 34.5        | +      |
      | 1995 Toyota COROLLA         | Underinsured Motorists BI  | Base Rate                   | 140.67      | +      |
      | 2020 Mazda CX-30            | Underinsured Motorists BI  | Base Rate                   | 140.67      | +      |
      | 1995 Toyota COROLLA         | Comprehensive              | Base Rate                   | 109.66      | *      |
      | 2020 Mazda CX-30            | Comprehensive              | Base Rate                   | 109.66      | *      |
      | 2020 Mazda CX-30            | Collision                  | Base Rate                   | 47.51       | *      |
      | 1995 Toyota COROLLA         | Collision                  | Base Rate                   | 480.27      | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness @RC @RenewalConversion
  Scenario: MA Auto - Base Rate -  Renewal Conversion
    Given I use "MA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "2/15/2024"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","

    * I set "Additional_Vehicles" to "001,002,003"
    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"

    * I set additional vehicles for NB
      | type              | override | vin               | model            | make                | year | mileage   | OTC_DED              | COLL_DED | COLL_Option | Waiver_COLL_DED |
      | Private Passenger | No       | 1NXAE04B1SZ335339 | COROLLA          | TOYOTA              | 1995 | 8,000     | $500 w/Full Glass    | 5,000    | Standard    | Yes             |
      | Private Passenger | No       | 3MVDMBCL7LM105089 | CX-30            | Mazda               | 2020 | 8,000     | $10,000 w/Full Glass | 2,500    | Limited     |                 |
      | Golf Carts        | No       | A4PUTVKD6NBA00322 | L5 - SIDE X SIDE | AMERICAN LANDMASTER | 2022 | 0 - 3,000 | 250                  | 250      | Standard    | Yes             |

    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Split limits"
    * I set "Select_Coverage_BI_Limits" to "250,000/500,000"
    * I set "Select_Coverage_PIP_Deductible" to "Full Coverage"
    * I set "Select_Coverage_MedPay_Limits" to "10,000"
    * I set "Select_Coverage_UMBI" to "250,000/500,000"
    * I set "Select_Coverage_UIMBI" to "250,000/500,000"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject               | coverage                   | factor                      | factorValue | method |
      | 1995 Toyota COROLLA         | Bodily Injury              | Base Rate                   | 342.43      | *      |
      | 2020 Mazda CX-30            | Bodily Injury              | Base Rate                   | 342.43      | *      |
      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury              | Base Rate - Misc (Auto 3.1) | 342.43      | +      |
      | 1995 Toyota COROLLA         | Property Damage            | Base Rate                   | 348.32      | *      |
      | 2022 AMERICAN LANDMASTER L5 | Property Damage            | Base Rate - Misc (Auto 3.1) | 348.32      | +      |
      | 2020 Mazda CX-30            | Property Damage            | Base Rate                   | 348.32      | *      |
      | 1995 Toyota COROLLA         | Medical Payments           | Base Rate                   | 18.43       | *      |
      | 2020 Mazda CX-30            | Medical Payments           | Base Rate                   | 18.43       | *      |
      | 2020 Mazda CX-30            | Personal Injury Protection | Base Rate                   | 52.43       | *      |
      | 1995 Toyota COROLLA         | Personal Injury Protection | Base Rate                   | 52.43       | *      |
      | 2020 Mazda CX-30            | Uninsured Motorists BI     | Base Rate                   | 31.39       | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorists BI     | Base Rate                   | 31.39       | +      |
      | 1995 Toyota COROLLA         | Underinsured Motorists BI  | Base Rate                   | 128         | +      |
      | 2020 Mazda CX-30            | Underinsured Motorists BI  | Base Rate                   | 128         | +      |
      | 1995 Toyota COROLLA         | Comprehensive              | Base Rate                   | 99.78       | *      |
      | 2020 Mazda CX-30            | Comprehensive              | Base Rate                   | 99.78       | *      |
      | 2020 Mazda CX-30            | Collision                  | Base Rate                   | 43.23       | *      |
      | 1995 Toyota COROLLA         | Collision                  | Base Rate                   | 437.01      | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    Then I review changes
    And I click renewed premium

    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject               | coverage                   | factor                      | factorValue | method |
      | 2020 Mazda CX-30            | Bodily Injury              | Base Rate                   | 376.33      | *      |
      | 1995 Toyota COROLLA         | Bodily Injury              | Base Rate                   | 376.33      | *      |
      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury              | Base Rate - Misc (Auto 3.1) | 376.33      | +      |
      | 2022 AMERICAN LANDMASTER L5 | Property Damage            | Base Rate - Misc (Auto 3.1) | 382.8       | +      |
      | 2020 Mazda CX-30            | Property Damage            | Base Rate                   | 382.8       | *      |
      | 1995 Toyota COROLLA         | Property Damage            | Base Rate                   | 382.8       | *      |
      | 1995 Toyota COROLLA         | Medical Payments           | Base Rate                   | 20.25       | *      |
      | 2020 Mazda CX-30            | Medical Payments           | Base Rate                   | 20.25       | *      |
      | 2020 Mazda CX-30            | Personal Injury Protection | Base Rate                   | 57.62       | *      |
      | 1995 Toyota COROLLA         | Personal Injury Protection | Base Rate                   | 57.62       | *      |
      | 2020 Mazda CX-30            | Uninsured Motorists BI     | Base Rate                   | 34.5        | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorists BI     | Base Rate                   | 34.5        | +      |
      | 1995 Toyota COROLLA         | Underinsured Motorists BI  | Base Rate                   | 140.67      | +      |
      | 2020 Mazda CX-30            | Underinsured Motorists BI  | Base Rate                   | 140.67      | +      |
      | 1995 Toyota COROLLA         | Comprehensive              | Base Rate                   | 109.66      | *      |
      | 2020 Mazda CX-30            | Comprehensive              | Base Rate                   | 109.66      | *      |
      | 1995 Toyota COROLLA         | Collision                  | Base Rate                   | 480.27      | *      |
      | 2020 Mazda CX-30            | Collision                  | Base Rate                   | 47.51       | *      |

    * I click exit button
    When I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process a renewal
