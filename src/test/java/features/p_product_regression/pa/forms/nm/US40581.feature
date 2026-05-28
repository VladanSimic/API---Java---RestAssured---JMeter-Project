@US40581 @TC82985 @TC84192 @US @NM @PersonalAuto @Auto @PA @PCRegression @2024 @JUNE @Forms @P1 @PCTeam2Regression
Feature: US40581: NM Auto 3.1

  @NB @NewBusiness
  Scenario:NM Auto 3.1 - Forms - New Business

    Given I use "NM_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2024"
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

  @DayPrior @NB @NewBusiness
  Scenario:NM Auto 3.1 - Forms - Day Prior

    Given I use "NM_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "06/30/2024"
    * I set "Additional_Operators_Driver_Exclude" to "No"
    * I set "Additional_Operators_Additional_Driver_Exclude_1" to "No"
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

  @PreBindForms
  Scenario:NM Auto 3.1 - Forms - PreBindForms

    Given I use "NM_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2024"
    * I set "Additional_Operators_Driver_Exclude" to "No"
    * I set "Additional_Operators_Additional_Driver_Exclude_1" to "Yes"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I get customer account ID and Quote Name
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote