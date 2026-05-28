@Collections
Feature: Collections line of business
  As a user I should be able to create collections line of business quotes and policies.

  @SmokeQA2 @SmokeDEV2
  Scenario: Smoke Collections - NY_001
  As a user I should be able to create and rate collections line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "NY_001" smoke test data from "QuoteCreatorCO" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    And I create a new "CO" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    Then I navigate to transactions or endorsements
    * I create a renewal without process

  @SmokeQA2 @SmokeDEV2
  Scenario: Smoke Collections - FL_001
  As a user I should be able to create and rate collections line of business quote for FL state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "FL_001" smoke test data from "QuoteCreatorCO" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    And I create a new "CO" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    Then I navigate to transactions or endorsements
    * I create a renewal without process


  @SmokeQA2 @SmokeDEV2
  Scenario: Smoke Collections - TX_001
  As a user I should be able to create and rate collections line of business quote for TX state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "TX_001" smoke test data from "QuoteCreatorCO" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    And I create a new "CO" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    Then I navigate to transactions or endorsements
    * I create a renewal without process