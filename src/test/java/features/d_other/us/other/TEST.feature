@JenkinsTest
Feature: TEST

  @JenkinsTest
  Scenario: TEST1

    Given I use "TX_001" smoke test data from "QuoteCreatorEX" sheet
    And I load random user data

    When I am logged in to Pure as "P73" unless is PROD then "A1"
    And I navigate to quotes page

#    * I initiate a new quote
#    * I create a new "EX" quote

  @JenkinsTest2
  Scenario: TEST1

    Given I use "TX_001" smoke test data from "QuoteCreatorEX" sheet
    And I load random user data

    When I am logged in to Pure as "P73" unless is PROD then "A1"
    And I navigate to quotes page


  @JenkinsTest2
  Scenario: TEST2

    Given I use "TX_001" smoke test data from "QuoteCreatorEX" sheet
    And I load random user data

    When I am logged in to Pure as "P73" unless is PROD then "A1"
    And I navigate to quotes page

  @JenkinsTest2
  Scenario: TEST3

    Given I use "TX_001" smoke test data from "QuoteCreatorEX" sheet
    And I load random user data

    When I am logged in to Pure as "P73" unless is PROD then "A1"
    And I navigate to quotes page
    And I verify "test" field is displayed