Feature: Homeowners surplus line of business
  As a user I should be able to create homeowners surplus line of business quotes and policies.

  @PrimaryFlood @Smoke @FL
  Scenario: Smoke Primary Flood - "FL_001"
  As a user I should be able to create and rate primary flood line of business quote for FL state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "FL_001" smoke test data from "QuoteCreatorFS" sheet
    And I load random user data

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "PF" quote