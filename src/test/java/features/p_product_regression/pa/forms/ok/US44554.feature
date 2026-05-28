@US44554 @TC88683  @US @OK @PersonalAuto @Auto @PA @PCRegression @2024 @OCT @Forms @P2 @PCTeam2Regression
Feature: US44554: OK Auto Full Glass Coverage - Forms

  @NB @NewBusiness @RC @RenewalConversion
  Scenario: OK Auto - Full Glass Coverage - Forms - Renewal Conversion

    Given I use "OK_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "1/1/2024"
    * I set "Additional_Vehicles" to "001,002,003,004,005,006"
    * I set additional vehicles for NB
      | type                   | override | vin               | model      | make              | year | mileage | comp        | coll        | UMPD   | option             | towing      |
      | Private Passenger      | No       | WBAGV8C02NCH01929 | 8          | BMW               | 2022 | 11,000  | 2,500       | 2,500       |        | without Full Glass | 350         |
      | Private Passenger      | No       | 19UDE4H69PA027805 | INTEGRA    | ACURA             | 2023 | 12,000  | 1,000       | 1,000       |        | with Full Glass    | 350         |
      | Private Passenger      | No       | WAU92BF22RN025744 | A6         | AUDI              | 2024 | 13,000  | No Coverage | No Coverage | 10,000 | No Coverage        | No Coverage |
      | Antique Collectors Car | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000  | 1,000       | 1,000       |        | without Full Glass | No Coverage |
      | Exotic Collectors Car  | No       | 242076P3395221122 | GTO        | FORD              | 1996 | 15,900  | No Coverage | No Coverage | 25,000 | No Coverage        | No Coverage |
      | Motor Home             | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 500         | 500         |        | with Full Glass    | No Coverage |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities
    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    Then I review changes
    And I click renewed premium
    When I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process a renewal