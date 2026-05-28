@US48783 @TC96427 @US @PA @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @Rating @P1 @PCTeam2Regression
Feature: US48783: PA-Auto-Revising Driver class Factors

  @NB @NewBusiness
  Scenario:  PA Auto - Revising Driver Class Factors - NB

    Given I use "PA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "PA"
    * I set "Additional_Operators_Additional_Driver_License_State_2" to "PA"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "10/18/2001"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "01/10/1984"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                | factor                          | factorValue | method |
      | Jonny Bravo   | Composite Driver Factor Coverage - Comp | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Aoperator One | Composite Driver Factor Coverage - Comp | Primary Driver Class - Auto 3.0 | 1           | +      |
      | Aoperator Two | Composite Driver Factor Coverage - Comp | Primary Driver Class - Auto 3.0 | 1           | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities