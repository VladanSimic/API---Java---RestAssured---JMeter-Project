@JenkinsTestNotifier
Feature: TestNotifier

  Scenario: Testing Notifier 1
    Given I use "TX_001" smoke test data from "QuoteCreatorEX" sheet
    And I load random user data
    When I am logged in to Pure as "P73" unless is PROD then "A1"
    And I navigate to quotes page
    * I add changes on "EX" endorsement

  Scenario: Testing Notifier 2
    Given I use "NM_001" smoke test data from "QuoteCreatorEX" sheet
    And I load random user data
    When I am logged in to Pure as "P73" unless is PROD then "A1"
    And I navigate to quotes page
    * I verify if there are 2 OFAC referrals


  Scenario: Testing Notifier 3
    Given I use "FL_001" smoke test data from "QuoteCreatorEX" sheet
    And I load random user data
    When I am logged in to Pure as "P73" unless is PROD then "A1"
    And I navigate to quotes page
    * I verify that ISO Report is pulled

