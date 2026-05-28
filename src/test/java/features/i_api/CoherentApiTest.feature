@Coherent
Feature: Coherent API Test

  Scenario Outline: Coherent API Test - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "MappingTestCoherent"

    When I send execute POST request

    Then I verify response status code is 200
    * I verify response grand total premium is not zero
    * I verify response grand total premium is not empty
    * I verify response error is null
    * I verify response warning 1 message is "Output results include Excel errors in the following outputs: LocationPremiums"

    Examples:
      | TC_ID  |
      | TC_001 |
      | TC_002 |