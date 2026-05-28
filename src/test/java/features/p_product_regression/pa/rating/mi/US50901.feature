@US50901 @TC99952 @US @MI @PersonalAuto @Auto @PA @PCRegression @2025 @APR @Rating @P1 @PCTeam2Regression
Feature: US50901: MI Auto - MCCA Assessment Factors Update

  @NB @NewBusiness
  Scenario: MI Auto: MCCA Assessment Factors Update - NB

    Given I use "MI_015" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"
    * I set "Additional_Vehicles" to "001,002,003,004,005,006,007"
    * I set additional vehicles for NB
      | type                        | vin               | model            | make                | year | mileage   | comp  | coll  | option     |
      | Private Passenger           | 1NXAE04B1SZ335339 | COROLLA          | TOYOTA              | 1995 | 8,000     | 2,500 | 2,500 | Full Glass |
      | Exotic Collectors Car       | 242076P3395221256 | GTO              | FORD                | 1996 | 8,000     | 500   | 500   | Full Glass |
      | Motor Home                  | 5VBBA37A8GA116483 | Inc Allegro Bus  | Tiffin Motorhomes   | 2016 | 8,000     | 1,000 | 1,000 | Full Glass |
      | Motorcycles/Mopeds/Scooters | JYARN23Y1EA004111 | Yzf-R1c          | Yamaha              | 2014 | 0 - 3,000 | 5,000 | 2,500 | Full Glass |
      | Antique Collectors Car      | 242076P339510     | GTO              | Ponatic             | 1966 | 8,000     | 1,000 | 500   | Full Glass |
      | Classic Collectors Car      | 242076P3395191122 | R100             | rolls royce         | 2000 | 8,000     | 1,000 | 5,000 | Full Glass |
      | Golf Carts                  | A4PUTVKD6NBA00322 | L5 - SIDE X SIDE | AMERICAN LANDMASTER | 2022 | 0 - 3,000 | 250   | 500   | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject               | coverage                                                           | factor                        | factorValue | method |
      | 2014 Yamaha Yzf-R1c         | Catastrophic Claims Association Assessment (per vehicle)           | MCCA per Vehicle 2025         | 59          | +      |
      | 2022 AMERICAN LANDMASTER L5 | Catastrophic Claims Association Assessment (per vehicle)           | MCCA per Vehicle 2025         | 0           | +      |
      | 1996 FORD GTO               | Catastrophic Claims Association Assessment (per vehicle)           | MCCA per Vehicle 2025         | 59          | +      |
      | 1995 Toyota COROLLA         | Catastrophic Claims Association Assessment (per vehicle)           | MCCA per Vehicle 2025         | 59          | +      |
      | 2016 Tiffin Motorhomes Inc  | Catastrophic Claims Association Assessment (per vehicle)           | MCCA per Vehicle 2025         | 59          | +      |
      | 2000 rolls royce R100       | Catastrophic Claims Association Assessment (per vehicle)           | MCCA per Vehicle 2025         | 59          | +      |
      | 1966 Ponatic GTO            | Catastrophic Claims Association Assessment (per vehicle)           | MCCA per Vehicle 2025         | 11.8        | +      |
      | 2000 rolls royce R100       | Catastrophic Claims Association Assessment - Deficit (per vehicle) | MCCA Deficit per Vehicle 2025 | 23          | +      |
      | 2022 AMERICAN LANDMASTER L5 | Catastrophic Claims Association Assessment - Deficit (per vehicle) | MCCA Deficit per Vehicle 2025 | 0           | +      |
      | 2014 Yamaha Yzf-R1c         | Catastrophic Claims Association Assessment - Deficit (per vehicle) | MCCA Deficit per Vehicle 2025 | 23          | +      |
      | 1995 Toyota COROLLA         | Catastrophic Claims Association Assessment - Deficit (per vehicle) | MCCA Deficit per Vehicle 2025 | 23          | +      |
      | 1996 FORD GTO               | Catastrophic Claims Association Assessment - Deficit (per vehicle) | MCCA Deficit per Vehicle 2025 | 23          | +      |
      | 1966 Ponatic GTO            | Catastrophic Claims Association Assessment - Deficit (per vehicle) | MCCA Deficit per Vehicle 2025 | 4.6         | +      |
      | 2016 Tiffin Motorhomes Inc  | Catastrophic Claims Association Assessment - Deficit (per vehicle) | MCCA Deficit per Vehicle 2025 | 23          | +      |


    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities