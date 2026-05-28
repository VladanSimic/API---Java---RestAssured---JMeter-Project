@US47049 @US @FL @HomeSurplus @HS @PCRegression @2024 @December @Forms @PostProd
Feature: US47049 - FL HS LLDW Form Fix

  @Homeowner @NB @NewBusiness @END @Endorsement @RN @Renewal @PreProd
  Scenario: FL HS LLDW Fix - Homeowner NB/END/RN
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "08/15/2023"
    * I set "Endorsement_Effective_Date_END" to "08/16/2023"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"
    * I set "Optional_Coverages_Rebuilding_To_Code_Increase" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    * I fill out HS RNW application page
    * I review changes
    Then I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

  @Condo @Coop @NB @NewBusiness @END @Endorsement @RN @Renewal @PreProd
  Scenario: FL HS LLDW Fix - Condo/Co-op NB/END/RN
    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "08/15/2023"
    * I set "Endorsement_Effective_Date_END" to "08/16/2023"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"
    * I set "Optional_Coverages_Rebuilding_To_Code_Increase" to ""
    * I set "Underwriting_Company_Manager_Override" to "No"
    * I set "Construction_Details_The_Floor_On_Which_The_Risk_Is_Located" to "1"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    * I fill out HS RNW application page
    * I review changes
    Then I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

  @Condo @Coop @Rewrite @PreProd
  Scenario: FL HS LLDW Fix - Condo Rewrite
    Given I use "FL_003" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "08/14/2023"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"
    * I set "Optional_Coverages_Rebuilding_To_Code_Increase" to ""
    * I set "Underwriting_Company_Manager_Override" to "No"
    * I set "Construction_Details_The_Floor_On_Which_The_Risk_Is_Located" to "1"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date       | notes             | method    | reason         | MEP | reason |
      | Company | 08/14/2023 | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 08/15/2023 |
    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @Homeowner @RC @RenewalConversion @PreProd
  Scenario: FL HS LLDW Fix - Homeowner Renewal Conversion
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/25/2023"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"
    * I set "Optional_Coverages_Rebuilding_To_Code_Increase" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create a renewal

    And I navigate to policy image page
    * I fill out HS RNW application page
    * I review changes
    Then I click renewed premium
    And I review and accept referrals on renewal if any
    * I process a renewal

  @Homeowner @DayPrior @DayPriorPD @PreProd
  Scenario: FL HS LLDW Fix - Homeowner One Day Prior PD
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "08/14/2023"
    * I set "Endorsement_Effective_Date_END" to "08/15/2023"
    * I set "Risk_Addresses_Hurricane_Deductible" to "Ex-Wind"
    * I set "Optional_Coverages_Rebuilding_To_Code_Increase" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    And I initiate new endorsement

    Then I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    And I issue an endorsement

  @Homeowner @NB @NewBusiness @PreProd @OutOfScope
  Scenario: FL HS LLDW Fix - Out of Scope (SC)
    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "08/15/2023"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

