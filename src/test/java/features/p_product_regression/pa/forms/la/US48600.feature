@US48600 @TC95498 @US @LA @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @Forms @P1 @PCTeam2Regression
Feature: US48600: [Continued] LA Multiple LOB - Notice of Premium Discounts - Form

  @NB @NewBusiness
  Scenario: LA Multiple LOB - Notice of Premium Discounts - Form - New Business

    Given I use "LA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
    * I set "Additional_Vehicles" to "001,002"
    * I set "Driver_Details_Additional_Driver_Active_Military_Personnel_1" to "No"
    * I set "Additional_Operators_Driver_License_State_1" to "LA"
    * I set additional vehicles for NB
      | type              | override | trim_level | vin               | model            | make                | year | mileage   | comp  | coll  | option             | UMPD        |
      | Private Passenger | No       |            | 1NXAE04B1SZ335339 | COROLLA          | TOYOTA              | 1995 | 8,000     | 1,000 | 1,000 | without Full Glass | No Coverage |
      | Golf Carts        | No       |            | A4PUTVKD6NBA00322 | L5 - SIDE X SIDE | AMERICAN LANDMASTER | 2000 | 0 - 3,000 | 1,000 | 1,000 | with Full Glass    | No Coverage |
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