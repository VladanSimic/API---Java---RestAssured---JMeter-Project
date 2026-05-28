Feature: Carfax API

  @ReachCarfaxLimit
  Scenario Outline: Mileage and values

    Given I send get request to carfax "https://sandboxsocket.carfaxbig.com/vc/v2?uid=D00027159&vin=KMHC85LJ4LU069970"
    Then I should get 200 response status code

    Examples:
      | 1  |
      | 2  |
      | 3  |
      | 4  |
      | 5  |
      | 6  |
      | 7  |
      | 8  |
      | 9  |
      | 10 |