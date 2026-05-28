Feature: Homeowners surplus line of business
  As a user I should be able to create homeowners surplus line of business quotes and policies.

  @SmokeQA2 @SmokeDEV2
  Scenario: Smoke Homeowners Surplus - "FL_001"
  As a user I should be able to create and rate homeowners surplus line of business quote for FL state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "FL_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    And I set Effective Date to Today
    * I navigate to quotes page

    Then I initiate a new quote
    * I create a new "HS" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I click request bind

    And I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    Then I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I review referrals
    * I accept underwriting referrals
    * I process a renewal

  @SmokeQA2 @SmokeDEV2
  Scenario: Smoke Homeowners Surplus - "TX_001"
  As a user I should be able to create and rate homeowners surplus line of business quote for TX state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "TX_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "HS" quote
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

    Then I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I review referrals
    * I accept underwriting referrals
    * I process a renewal