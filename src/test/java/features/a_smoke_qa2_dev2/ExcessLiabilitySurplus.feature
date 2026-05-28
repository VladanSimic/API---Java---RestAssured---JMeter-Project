Feature: Excess liability surplus line of business
  As a user I should be able to create excess liability surplus line of business quotes and policies.

  @SmokeQA2 @SmokeDEV2
  Scenario: Smoke Excess Liability Surplus - "NY_001"
  As a user I should be able to create and rate excess liability surplus line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "NY_001" smoke test data from "QuoteCreatorES" sheet
    And I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    And I bind a quote
    * I override subjectivities

    Then I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes

    And I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    Then I create a renewal without process

  @SmokeQA2 @SmokeDEV2
  Scenario: Smoke Excess Liability Surplus - "FL_001"
  As a user I should be able to create and rate excess liability surplus line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "FL_001" smoke test data from "QuoteCreatorES" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    And I bind a quote
    * I override subjectivities

    Then I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes

    And I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    Then I create a renewal without process