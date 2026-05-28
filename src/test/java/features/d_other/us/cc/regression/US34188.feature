@CourseOfConstruction @US34188 @RegressionUS
Feature: US34188 - Run Insurance Score Ordering Logic

  As a user I want to be able to run insurance score for COC product
  so we can capture financial responsibility

  Scenario Outline: I create and rate a "<testCaseDataId>" quote

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US34188" in sheet "QuoteCreatorCC" for "CC" LOB
    * I set "Date_Of_Birth" to "<dob>"
    * I set "First_Name" to "<firstName>"
    * I set "MI" to "<mi>"
    * I set "Last_Name" to "<lastName>"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I navigate to "Home Surplus Lines Policy" page

    Then I verify that the insurance score for rating is "<insuranceScoreForRating>"

    When I rate a quote
    * I navigate to premium details page

    Then I verify base rates "<financialResponsibilityFactor>"

    Examples:
      | testCaseDataId | dob        | firstName | mi | lastName    | insuranceScoreForRating | financialResponsibilityFactor                                                                                     |
      | AZ_001         | 9/22/1970  | PASS      |    | VELEDNITSKY | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1,Financial Responsibility Factor/1             |
      | CO_001         | 1/1/1937   | IRIS      |    | COOK        | pulled                  | Financial Responsibility Factor/0.855,Financial Responsibility Factor/0.855,Financial Responsibility Factor/0.855 |
      | CT_001         | 3/25/1939  | CHARLES   |    | BEGANSKY    | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1                                               |
      | DE_001         | 5/20/1973  | VIOLET    |    | BENNETTE    | pulled                  | Financial Responsibility Factor/0.87,Financial Responsibility Factor/0.87                                         |
      | ID_001         | 12/28/1960 | GEORGE    | J  | MORSE       | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1,Financial Responsibility Factor/1             |
      | IL_001         | 6/29/1958  | WILLIAM   | J  | TOTIRE      | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1                                               |
      | ME_001         | 4/16/1950  | DANA      | L  | BEAL        | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1                                               |
      | MT_001         | 1/1/1964   | VICKIE    | S  | PEARSON     | pulled                  | Financial Responsibility Factor/1.255,Financial Responsibility Factor/1.255,Financial Responsibility Factor/1.255 |
      | NC_001         | 12/31/1969 | LOIS      |    | WAGNER      | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1                                               |
      | NJ_001         | 7/27/1959  | TAMMY     | S  | AL          | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1                                               |
      | NM_001         | 1/1/1916   | ROBIN     | G  | WATERMAN    | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1,Financial Responsibility Factor/1             |
      | NV_001         | 2/5/1964   | BURT      | W  | KUMPE       | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1,Financial Responsibility Factor/1             |
      | RI_001         | 11/20/1947 | MICHAEL   |    | WOOD        | pulled                  | Financial Responsibility Factor/0.87,Financial Responsibility Factor/0.87                                         |
      | SC_001         | 7/19/1945  | JOHN      |    | MCCRORY     | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1                                               |
      | OR_001         | 5/18/1976  | MATY      | M  | GRASMICK    | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1,Financial Responsibility Factor/1             |
      | UT_001         | 4/15/1943  | JASON     | W  | MOSER       | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1                                               |
      | VA_001         | 1/1/1946   | BRININGER |    | CLARK       | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1                                               |
      | WY_001         | 1/1/1932   | JOHN      |    | WALKER      | pulled                  | Financial Responsibility Factor/1,Financial Responsibility Factor/1,Financial Responsibility Factor/1             |
      | FL_001         | 10/4/1972  | MATTHEW   |    | BODENCHAK   | pulled                  | Financial Responsibility Factor/0.89,Financial Responsibility Factor/0.89                                         |
      | NY_001         | 6/6/1943   | MARILYN   | L  | RICHARDS    | pulled                  | Financial Responsibility Factor/0.87,Financial Responsibility Factor/0.87                                         |
      | CA_001         | 6/22/1971  | MARY      |    | BASFORD     | not pulled              |                                                                                                                   |
      | HI_001         | 3/31/1970  | LINDA     |    | BERGMANNF   | not pulled              |                                                                                                                   |
      | WA_001         | 9/17/1971  | ERMA      |    | EVANS       | pulled                  |                                                                                                                   |
      | MA_001         | 3/28/1970  | AVONA     |    | OROURKE     | pulled                  |                                                                                                                   |
      | MD_001         | 1/8/1960   | ERNEST    |    | BROWNHOLTZ  | not pulled              |                                                                                                                   |