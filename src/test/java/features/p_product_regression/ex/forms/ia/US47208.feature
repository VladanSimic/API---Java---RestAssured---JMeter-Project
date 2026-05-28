@US47208 @US @IA @ExcessLiability @EX @PCRegression @2025 @January @Forms
Feature: US47208 - IA Excess Liability Special Provisions Form

  @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: IA Excess Liability Special Provisions Forms - NB/END/RN

    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @RN @NewBusiness @Renewal @RenewalConversion @RC
  Scenario: IA Excess Liability Special Provisions Forms - Renewal Conversion

    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/19/2024"
    * I set "Household_Own_Recreational_Vehicle" to ""
    * I set "Household_Own_Motorcycle_Moped_Scooter" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @NewBusiness @Endorsement @DayBefore @DayBeforePD @PreProd
  Scenario: IA Excess Liability Special Provisions Forms - Day Before PD

    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2025"
    * I set "Endorsement_Effective_Date_END" to "02/15/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @NB @NewBusiness @DayBefore @DayBeforeRB
  Scenario: IA Excess Liability Special Provisions Forms - Day Before RB

    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/18/2024"
    * I set "Household_Own_Recreational_Vehicle" to ""
    * I set "Household_Own_Motorcycle_Moped_Scooter" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite @PreProd @2
  Scenario: IA Excess Liability Special Provisions Forms - Rewrite

    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 02/15/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @NB @NewBusiness @Reinstatement @PreProd @2
  Scenario: IA Excess Liability Special Provisions Forms - Reinstatement

    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

  @NB @END @RN @NewBusiness @Endorsement @Renewal @PreProdNew @2
  Scenario: IA Excess Liability Special Provisions Forms - NB/END PreProd

    Given I use "IA_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement
