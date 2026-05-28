@CourseOfConstruction @US33710
Feature:  US33710 - MT State Specific Forms - SmartCOMM

  As an Underwriter I want to be able to generate supplementary forms
  for accounts with Montana Course of Construction so that we can share
  important information with insureds and brokers

  Scenario Outline: I create and rate a "<TC_ID>" quote

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Examples:
      | TC_ID  |
      | MT_001 |
      | MT_001 |
      | MT_001 |
      | MT_001 |
      | MT_001 |
      | MT_001 |
      | MT_001 |
      | MT_001 |
      | MT_001 |
      | MT_001 |