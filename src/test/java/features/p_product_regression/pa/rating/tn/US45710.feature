@US45710 @TC91613 @P2 @TC91616 @TC91617 @US @TN @PersonalAuto @Auto @PA @PCRegression @2024 @DEC @Rating  @PCTeam2Regression
Feature: US45710: TN Auto -  Base Rate, Factor & Structural

  @NB @NewBusiness
  Scenario: TN Auto: Base Rate, Factor & Structural -  New Business

    Given I use "TN_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "1/1/2025"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","

    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"

    * I set additional vehicles for NB
      | type              | override | vin               | model            | make                | year | mileage   | comp  | coll  | option     |
      | Private Passenger | No       | 1NXAE04B1SZ335339 | COROLLA          | TOYOTA              | 1995 | 8,000     | 1,000 | 1,000 | Full Glass |
      | Golf Carts        | No       | A4PUTVKD6NBA00322 | L5 - SIDE X SIDE | AMERICAN LANDMASTER | 2022 | 0 - 3,000 | 500   | 1,000 | Full Glass |

    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Split limits"
    * I set "Select_Coverage_BI_Limits" to "250,000/500,000"
    * I set "Select_Coverage_UMBI_Limit" to "25,000/50,000"
    * I set "Select_Coverage_UMPD" to "15,000"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject               | coverage                                | factor                          | factorValue | method |
      | 1995 Toyota COROLLA         | Bodily Injury                           | Base Rate 3.1                   | 353         | +      |
      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury                           | Base Rate - Misc                | 353         | +      |
      | 2022 AMERICAN LANDMASTER L5 | Property Damage                         | Base Rate - Misc                | 321         | +      |
      | 1995 Toyota COROLLA         | Property Damage                         | Base Rate 3.1                   | 321         | +      |
      | 1995 Toyota COROLLA         | Medical Payments                        | Base Rate 3.1                   | 25          | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorist PD                   | Base Rate 3.1                   | 6           | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorists BI                  | Base Rate 3.1                   | 59          | +      |
      | 1995 Toyota COROLLA         | Comprehensive                           | Base Rate 3.1                   | 105         | +      |
      | 1995 Toyota COROLLA         | Collision                               | Base Rate 3.1                   | 410         | +      |
      | 1995 Toyota COROLLA         | Collision                               | Family Vehicle Adjustment       | 1           | *      |
      | Jonny Bravo                 | Composite Driver Factor Coverage - BI   | Primary Driver Class - Auto 3.0 | 1.121       | +      |
      | Jonny Bravo                 | Composite Driver Factor Coverage - PD   | Primary Driver Class - Auto 3.0 | 1.121       | +      |
      | Jonny Bravo                 | Composite Driver Factor Coverage - MP   | Primary Driver Class - Auto 3.0 | 0.912       | +      |
      | Jonny Bravo                 | Composite Driver Factor Coverage - Coll | Primary Driver Class - Auto 3.0 | 1.012       | +      |
      | Jonny Bravo                 | Composite Driver Factor Coverage - Comp | Primary Driver Class - Auto 3.0 | 1           | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities


  @NB @NewBusiness @RC @RenewalConversion
  Scenario: TN Auto: Base Rate, Factor & Structural -  Renewal Conversion

    Given I use "TN_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "2/15/2024"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","

    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"

    * I set additional vehicles for NB
      | type              | override | vin               | model            | make                | year | mileage   | comp  | coll  | option     |
      | Private Passenger | No       | 1NXAE04B1SZ335339 | COROLLA          | TOYOTA              | 1995 | 8,000     | 1,000 | 1,000 | Full Glass |
      | Golf Carts        | No       | A4PUTVKD6NBA00322 | L5 - SIDE X SIDE | AMERICAN LANDMASTER | 2022 | 0 - 3,000 | 500   | 1,000 | Full Glass |

    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Split limits"
    * I set "Select_Coverage_BI_Limits" to "250,000/500,000"
    * I set "Select_Coverage_UMBI_Limit" to "25,000/50,000"
    * I set "Select_Coverage_UMPD" to "15,000"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject               | coverage                                | factor                          | factorValue | method |
      | 1995 Toyota COROLLA         | Bodily Injury                           | Base Rate 3.1                   | 323         | +      |
      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury                           | Base Rate - Misc                | 323         | +      |
      | 2022 AMERICAN LANDMASTER L5 | Property Damage                         | Base Rate - Misc                | 292         | +      |
      | 1995 Toyota COROLLA         | Property Damage                         | Base Rate 3.1                   | 292         | +      |
      | 1995 Toyota COROLLA         | Medical Payments                        | Base Rate 3.1                   | 25          | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorist PD                   | Base Rate 3.1                   | 6           | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorists BI                  | Base Rate 3.1                   | 59          | +      |
      | 1995 Toyota COROLLA         | Comprehensive                           | Base Rate 3.1                   | 95          | +      |
      | 1995 Toyota COROLLA         | Collision                               | Base Rate 3.1                   | 363         | +      |
      | Jonny Bravo                 | Composite Driver Factor Coverage - Comp | Primary Driver Class - Auto 3.0 | 1.073       | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    When I create a renewal
    And I navigate to policy image page
    * I review changes
    * I click renewed premium
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject               | coverage                                | factor                          | factorValue | method |
      | 1995 Toyota COROLLA         | Bodily Injury                           | Base Rate 3.1                   | 353         | +      |
      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury                           | Base Rate - Misc                | 353         | +      |
      | 2022 AMERICAN LANDMASTER L5 | Property Damage                         | Base Rate - Misc                | 321         | +      |
      | 1995 Toyota COROLLA         | Property Damage                         | Base Rate 3.1                   | 321         | +      |
      | 1995 Toyota COROLLA         | Medical Payments                        | Base Rate 3.1                   | 25          | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorist PD                   | Base Rate 3.1                   | 6           | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorists BI                  | Base Rate 3.1                   | 59          | +      |
      | 1995 Toyota COROLLA         | Comprehensive                           | Base Rate 3.1                   | 105         | +      |
      | 1995 Toyota COROLLA         | Collision                               | Base Rate 3.1                   | 410         | +      |
      | 1995 Toyota COROLLA         | Collision                               | Family Vehicle Adjustment       | 1           | *      |
      | Jonny Bravo                 | Composite Driver Factor Coverage - Comp | Primary Driver Class - Auto 3.0 | 1           | +      |

    And I click exit button
    Then I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @DayPrior
  Scenario: TN Auto: Base Rate, Factor & Structural -  Day Prior

    Given I use "TN_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "12/31/2024"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","

    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"

    * I set additional vehicles for NB
      | type              | override | vin               | model            | make                | year | mileage   | comp  | coll  | option     |
      | Private Passenger | No       | 1NXAE04B1SZ335339 | COROLLA          | TOYOTA              | 1995 | 8,000     | 1,000 | 1,000 | Full Glass |
      | Golf Carts        | No       | A4PUTVKD6NBA00322 | L5 - SIDE X SIDE | AMERICAN LANDMASTER | 2022 | 0 - 3,000 | 500   | 1,000 | Full Glass |

    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Split limits"
    * I set "Select_Coverage_BI_Limits" to "250,000/500,000"
    * I set "Select_Coverage_UMBI_Limit" to "25,000/50,000"
    * I set "Select_Coverage_UMPD" to "15,000"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject               | coverage                                | factor                          | factorValue | method |
      | 1995 Toyota COROLLA         | Bodily Injury                           | Base Rate 3.1                   | 323         | +      |
      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury                           | Base Rate - Misc                | 323         | +      |
      | 2022 AMERICAN LANDMASTER L5 | Property Damage                         | Base Rate - Misc                | 292         | +      |
      | 1995 Toyota COROLLA         | Property Damage                         | Base Rate 3.1                   | 292         | +      |
      | 1995 Toyota COROLLA         | Medical Payments                        | Base Rate 3.1                   | 25          | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorist PD                   | Base Rate 3.1                   | 6           | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorists BI                  | Base Rate 3.1                   | 59          | +      |
      | 1995 Toyota COROLLA         | Comprehensive                           | Base Rate 3.1                   | 95          | +      |
      | 1995 Toyota COROLLA         | Collision                               | Base Rate 3.1                   | 363         | +      |
      | Jonny Bravo                 | Composite Driver Factor Coverage - Comp | Primary Driver Class - Auto 3.0 | 1.053       | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
