@US47209 @US @IA @ExcessLiability @EX @PCRegression @2025 @January @RenewalGeneration
Feature: US47209 - IA Renewal Generation - EX

  @Scenario1 @90Days @PreProd
  Scenario: IA Renewal Generation EX - Renewal Image is created 90 days
    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 275 days in the past
    * I set "Household_Own_Recreational_Vehicle" to ""
    * I set "Household_Own_Motorcycle_Moped_Scooter" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

  @Scenario2 @65Days @PreProd
  Scenario: IA Renewal Generation EX - Renewal is processed 65 days
    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 667 days in the past
    * I set "Household_Own_Recreational_Vehicle" to ""
    * I set "Household_Own_Motorcycle_Moped_Scooter" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    Then I process a renewal

  @Scenario3 @65Days @PreProd
  Scenario: IA Renewal Generation EX - Pending Renewal 65 days
    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 301 days in the past
    * I set "Household_Own_Recreational_Vehicle" to ""
    * I set "Household_Own_Motorcycle_Moped_Scooter" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements