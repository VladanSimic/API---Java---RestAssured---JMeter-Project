@US50894 @TC100852 @US @MA @PersonalAuto @Auto @PA @PCRegression @2025 @APR @Forms @P1 @PCTeam2Regression
Feature: US50894: MA - Auto - Form Change

  @NB @NewBusiness
  Scenario: MA Auto: Amendment of Private Fleet Automobile Provisions form change - NB

    Given I use "MA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"
    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type                   | vin               | model           | make              | year | mileage | OTC_DED             | COLL_DED | COLL_Option | Waiver_COLL_DED |
      | Private Passenger      | 1NXAE04B1SZ335339 | COROLLA         | TOYOTA            | 1995 | 8,000   | $1,000 w/Full Glass | 1,000    | Standard    | Yes             |
      | Motor Home             | 5VBBA37A8GA116483 | Inc Allegro Bus | Tiffin Motorhomes | 2016 | 8,000   | 500                 | 500      | Standard    | Yes             |
      | Classic Collectors Car | 242076P3395191122 | R100            | rolls royce       | 2000 | 8,000   | 1,000               | 500      | Limited     |                 |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities