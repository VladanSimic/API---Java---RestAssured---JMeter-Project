@US51002 @TC99959 @TC99960 @TC95496 @US @NE @PersonalAuto @Auto @PA @PCRegression @2025 @APR @Forms @P1 @PCTeam2Regression
Feature: US51002: [Continued] NE - Auto - Rates & Comp deductible full glass changes - Forms

  @NB @NewBusiness
  Scenario: NE Auto: Rates & Comp deductible full glass changes - Forms - NB

    Given I use "NE_Forms_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "5/15/2025"
    * I set "Additional_Operators" to ","
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"
    * I set "Vehicle_Details_Current_Term_Override_Value_2" to "61,740"
    * I set "Vehicle_Details_Current_Term_Override_Value_3" to "81,790"
    * I set "Select_Coverage_Combined_Or_Split_Limits" to "No Coverage"
    * I set "Additional_Vehicles" to "001,002,003,004,005"
    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model   | make    | year | mileage | comp        | coll        | option             | towing      | UMPD      |
      | Private Passenger      | No       |            | 1NXAE04B1SZ335339 | COROLLA | TOYOTA  | 1995 | 8,000   | 1,000       | 1,000       | without Full Glass |             |           |
      | Private Passenger      | No       |            | 5J8TC2H37KL011921 | RDX     | Acura   | 2019 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |           |
      | Antique Collectors Car | No       |            | 242076P339510     | GTO     | Pontiac | 1966 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |           |
      | Exotic Collectors Car  | No       |            | 242076P3395221122 | GTO     | Ford    | 1996 | 8,000   | No Coverage | No Coverage | No Coverage        | No Coverage |           |
      | Private Passenger      | No       |            | JTJJM7FX0C5038645 | GX 460  | Lexus   | 2012 | 8,000   | No Coverage | No Coverage | No Coverage        | No Coverage | Rejection |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
#    When I navigate to premium details page
#    Then I validate premium details page table
#
#    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness @QuoteProposal
  Scenario: NE Auto: Rates & Comp deductible full glass changes - Forms -  NB

    Given I use "NE_Forms_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "5/15/2025"
    * I set "Additional_Operators" to ","
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"
    * I set "Vehicle_Details_Current_Term_Override_Value_2" to "61,740"
    * I set "Vehicle_Details_Current_Term_Override_Value_3" to "81,790"
    * I set "Select_Coverage_Combined_Or_Split_Limits" to "No Coverage"
    * I set "Additional_Vehicles" to "001,002,003,004,005"
    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model   | make    | year | mileage | comp        | coll        | option             | towing      | UMPD      |
      | Private Passenger      | No       |            | 1NXAE04B1SZ335339 | COROLLA | TOYOTA  | 1995 | 8,000   | 1,000       | 1,000       | without Full Glass |             |           |
      | Private Passenger      | No       |            | 5J8TC2H37KL011921 | RDX     | Acura   | 2019 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |           |
      | Antique Collectors Car | No       |            | 242076P339510     | GTO     | Pontiac | 1966 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |           |
      | Exotic Collectors Car  | No       |            | 242076P3395221122 | GTO     | Ford    | 1996 | 8,000   | No Coverage | No Coverage | No Coverage        | No Coverage |           |
      | Private Passenger      | No       |            | JTJJM7FX0C5038645 | GX 460  | Lexus   | 2012 | 8,000   | No Coverage | No Coverage | No Coverage        | No Coverage | Rejection |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
#    When I navigate to premium details page
#    Then I validate premium details page table
#
#    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities