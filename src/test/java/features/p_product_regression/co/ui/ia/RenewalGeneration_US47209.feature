@US47209 @US @IA @Collection @Collections @CO @PCRegression @2025 @January @RenewalGeneration
Feature: US47209 - IA Renewal Generation - CO

  @Scenario1 @90Days @PreProd
  Scenario: IA Renewal Generation CO - Renewal Image is created 90 days
    Given I use "IA_001" regression test data from "QuoteCreatorCO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 275 days in the past
    * I set "SJC_Has_Appraised_2_Years" to "No"
    * I set "SJBVC_Has_Appraised_2_Years" to "No"
    * I set "FACC_Has_Appraised_2_Years" to "No"
    * I set "CC_Has_Appraised_2_Years" to "No"
    * I set "CSSF_Has_Appraised_2_Years" to "No"
    * I set "Wine_Has_Appraised_2_Years" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

  @Scenario2 @65Days @PreProd
  Scenario: IA Renewal Generation CO - Renewal is processed 65 days
    Given I use "IA_001" regression test data from "QuoteCreatorCO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 301 days in the past
    * I set "SJC_Has_Appraised_2_Years" to "No"
    * I set "SJBVC_Has_Appraised_2_Years" to "No"
    * I set "FACC_Has_Appraised_2_Years" to "No"
    * I set "CC_Has_Appraised_2_Years" to "No"
    * I set "CSSF_Has_Appraised_2_Years" to "No"
    * I set "Wine_Has_Appraised_2_Years" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

  @Scenario3 @65Days @PreProd
  Scenario: IA Renewal Generation CO - Pending Renewal 65 days
    Given I use "IA_001" regression test data from "QuoteCreatorCO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date to Today
    * I set Effective Date 301 days in the past
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements