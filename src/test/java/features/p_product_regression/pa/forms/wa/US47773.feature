@US47773 @TC93860  @US @WA @PersonalAuto @Auto @PA @PCRegression @2025 @JAN @Forms @P2 @PCTeam2Regression
Feature: US47773: WA Auto - Full Glass Coverage Changes - Forms

  @NB @NewBusiness
  Scenario: WA Auto - Full Glass Coverage - Forms - New Business

    Given I use "WA_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Additional_Vehicles" to "001,002,003,004,005,006"
    * I set additional vehicles for NB
      | type                   | override | vin               | model      | make              | year | mileage | comp        | coll        | option             | towing      |
      | Private Passenger      | No       | 19UDE4H69PA027805 | INTEGRA    | ACURA             | 2023 | 12,000  | 5,000       | 5,000       | with Full Glass    | 350         |
      | Private Passenger      | No       | WBAGV8C02NCH01929 | 8          | BMW               | 2022 | 11,000  | 10,000      | 10,000      | without Full Glass | 350         |
      | Private Passenger      | No       | WAU92BF22RN025744 | A6         | AUDI              | 2024 | 13,000  | No Coverage | No Coverage | No Coverage        | No Coverage |
      | Antique Collectors Car | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000  | 1,000       | 1,000       | with Full Glass    | No Coverage |
      | Exotic Collectors Car  | No       | 242076P3395221122 | GTO        | FORD              | 1996 | 15,900  | No Coverage | No Coverage | No Coverage        | No Coverage |
      | Motor Home             | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 500         | 500         | with Full Glass    | No Coverage |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities
