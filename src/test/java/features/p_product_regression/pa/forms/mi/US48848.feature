@US48848 @TC96290 @US @MI @PersonalAuto @Auto @PA @PCRegression @2025 @March @Forms @P1 @PCTeam2Regression
Feature: US48848: MI Auto - PIP Coverage Form Change

  @NB @NewBusiness
  Scenario: MI Auto - Personal Injury Protection Coverage - New Business

    Given I use "MI_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
    * I set "Additional_Vehicles" to "001,002"
    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model      | make        | year | mileage | comp  | coll  | option             |
      | Private Passenger      | No       |            | 1NXAE04B1SZ335339 | COROLLA    | TOYOTA      | 1995 | 8,000   | 1,000 | 1,000 | without Full Glass |
      | Classic Collectors Car | No       |            | 242076P3395191114 | R100       | Rolls-Royce | 2000 | 8,000   | 1,000 | 1,000 | with Full Glass    |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    When I navigate to premium details page
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities