@CourseOfConstruction @US36394 @RegressionUS
Feature: US36394 - Distance to Coast Override

  As an underwriter I want to be able to set the Distance to Coast override
  for a location so that if the reports don't come back or come back
  with an inaccurate DTC I can add more accurate information

  Scenario Outline: Distance to Coast override for - "<TC_ID>"

    Given I use "<TC_ID>" regression test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out the policy page for CC line of business
    * I navigate via action button next
    * I set the distance to coast override to "<distanceToCoast>"
    * I click save changes button

    Then I should see distance to coast override value is "<distanceToCoast>"

    Examples:
      | TC_ID  | distanceToCoast |
      | NY_001 | Inland          |
      | MA_001 | > 5 Miles       |
      | FL_001 | > 5 miles       |
      | AZ_001 | > 5 miles       |
      | CA_001 | > 5 miles       |
      | CO_001 | > 5 miles       |
      | CT_001 | > 5 miles       |
      | DE_001 | > 5 miles       |
      | HI_001 | > 1000 ft       |
      | ID_001 | > 5 miles       |
      | IL_001 | > 5 miles       |
      | ME_001 | N/A             |
      | MD_001 | 1mile - 5 miles |
      | MT_001 | > 5 miles       |
      | NC_001 | Inland          |
      | NJ_001 | > 5 Miles       |
      | NM_001 | > 5 miles       |
      | NV_001 | > 5 miles       |
      | RI_001 | 1mile - 5 miles |
      | SC_001 | Inland          |
      | OR_001 | > 5 miles       |
      | UT_001 | > 5 miles       |
      | WA_001 | > 5 miles       |
      | WY_001 | > 5 miles       |