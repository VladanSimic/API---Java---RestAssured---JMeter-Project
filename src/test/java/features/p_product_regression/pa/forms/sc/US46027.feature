@US46027 @TC91988 @TC91989 @US @SC @PersonalAuto @Auto @PA @PCRegression @2024 @DEC @Forms @P1 @PCTeam2Regression
Feature: US46027 - SC Auto 3.1 Forms changes

  @NB @NewBusiness
  Scenario: SC Auto 3.1 Forms changes - New Business

    Given I use "SC_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "01/01/2025"
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
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities

  @NB @NewBusiness @RC @RenewalConversion
  Scenario: SC Auto 3.1 Forms changes - Renewal Conversion

    Given I use "SC_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "2/15/2024"
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
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities
#    * I navigate to policies
#    * I select a policy by ID "PA260748600"
    * I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    * I navigate to Operators and Vehicles Page
    * I set driver excluded to yes for driver 1
    Then I review changes
    And I click renewed premium
    When I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process a renewal


  @PreBindForms
  Scenario: SC Auto 3.1 Forms changes - PreBindForms

    Given I use "SC_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "01/01/2025"
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
