Feature: Bind quote with customer ID

  Scenario Outline: Bind PA quote for "<customerID>"

    * I am logged in to Pure as "P1"
    * I navigate to customers page
    * I select customer by ID "<customerID>"
    * I open quote under customer
    * I bind a quote
    * I override subjectivities

    Examples:
      | customerID   |
      | 743934749339 |
      | 743934759319 |
      | 743934749859 |
      | 743934749429 |
      | 743934695029 |
      | 743934749249 |
      | 743934697299 |
      | 743934694159 |
      | 743934748659 |
      | 743934697029 |