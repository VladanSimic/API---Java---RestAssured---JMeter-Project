@HomePageActions @ExtendedSmoke
Feature: Home Page Actions

  @ITVTool @LocationSearch
  Scenario: General Guidance Tool And Location Search
  As a user I should be able to validate General Guidance Tool and navigate to Location page where I can perform
  Household search according to the provided address

    When I am logged in to Pure as "P73" unless is PROD then "A1"
    And I navigate to Locations tab
    Then I search and verify data is returned using Location Search Tool
      | address           | city            | state | zip   |
      | 3493 Molokai Road | West Sacramento | CA    | 95691 |

    When I navigate to Home
    And I navigate to General Guidance Tool Page
    Then I search and verify data is returned using General Guidance Tool
      | street               | zip   | city     | squareFootage | yearBuilt |
      | 270 W 17th St APT 6H | 10011 | New York | 585           | 1989      |