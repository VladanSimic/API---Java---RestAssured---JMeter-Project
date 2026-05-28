@CourseOfConstruction @US34557 @RegressionUS
Feature: US34557 - Wildfire Algorithm

  As a Product Analyst I want to make updates to the Wildfire Algorithm
  so that we're calculating Wildfire appropriately

  Scenario Outline: Create policies and verify Wildfire Algorithm for - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US34557" in sheet "QuoteCreatorCC" for "CC" LOB
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I think for 10 to 20 seconds
    * I navigate to quotes detail page
    * I navigate to "Risk Model Information" page

    Then I verify wildfire premium is calculated

    Examples:
      | TC_ID  |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | ID_001 |
      | MT_001 |
      | ME_001 |
      | OR_001 |
      | UT_001 |
      | WA_001 |
      | WY_001 |