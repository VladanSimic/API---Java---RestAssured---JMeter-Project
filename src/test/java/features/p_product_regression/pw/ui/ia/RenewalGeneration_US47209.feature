@US47209 @US @IA @PersonalWatercraft @Watercraft @PW @PCRegression @2025 @January @RenewalGeneration
Feature: US47209 - IA Renewal Generation - PW

  @Scenario1 @90Days @PreProd
  Scenario: IA Renewal Generation PW - Renewal Image is created 90 days
    Given I use "IA_001" regression test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 275 days in the past
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

  @Scenario2 @65Days @PreProd
  Scenario: IA Renewal Generation PW - Renewal is processed 65 days
    Given I use "IA_001" regression test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 301 days in the past
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

  @Scenario3 @65Days @PreProd
  Scenario: IA Renewal Generation PW - Pending Renewal 65 days
    Given I use "IA_001" regression test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 301 days in the past
    * I set "Hull_And_Machinery_Limit_Agreed_Value" to "1000001"
    * I set "AOP_Deductible" to "5%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements