@US47209 @US @IA @Homeowners @HO @PCRegression @2025 @January @RenewalGeneration
Feature: US47209 - IA Renewal Generation - HO

  @Scenario1 @90Days @PreProd
  Scenario: IA Renewal Generation HO - Renewal Image is created 90 days
    Given I use "IA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 275 days in the past
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

  @Scenario2 @65Days @PreProd
  Scenario: IA Renewal Generation HO - Renewal is processed 65 days
    Given I use "IA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 301 days in the past
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

  @Scenario3 @65Days @PreProd
  Scenario: IA Renewal Generation HO - Pending Renewal 65 days
    Given I use "IA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 301 days in the past
    * I set "Manuscript_Endorsements" to "001"
    * I set "Manuscript_Endorsements_Type_1" to "Premium Adjustment"
    * I set "Manuscript_Endorsements_Title_1" to "title"
    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "22000"
    * I set "Manuscript_Endorsements_Premium_Rationale_1" to "test"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements