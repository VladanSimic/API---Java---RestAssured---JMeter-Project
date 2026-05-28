Feature: Homeowners line of business
  As a user I should be able to create homeowners line of business quotes and policies.

  @SmokeQA2 @SmokeDEV2
  Scenario: Smoke Homeowners - "CA_001"
  As a user I should be able to create and rate homeowners line of business quote for CA state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "CA_001" smoke test data from "QuoteCreatorHO" sheet
    And I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HO" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    * I rate a quote
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
  Scenario: Smoke Homeowners - "NY_001"
  As a user I should be able to create and rate homeowners line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "NY_001" smoke test data from "QuoteCreatorHO" sheet
    And I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HO" quote
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
  Scenario: Smoke Homeowners - "TX_001"
  As a user I should be able to create and rate homeowners line of business quote for TX state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "TX_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HO" quote
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