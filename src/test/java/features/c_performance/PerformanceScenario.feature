Feature: Performance Scenario testing
  As a user I should be able to initiate multiple threads at the same time with pre-defined scenarios. As an output
  we should get the User Session Id per thread which will be used to generate reports

  Scenario Outline: Performance Tests Scenario - "<TC_ID>"
  As a user I should be able to initiate multiple threads at the same time with pre-defined scenarios. As an output
  we should get the User Session Id per thread which will be used to generate reports

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I login with OKTA user "<OKTAuser>"
    * I create performance execution record ID "130" with defined scenario ID "23"
    And I navigate to quotes page
    * I initiate a new quote
    * I get customer ID, store to DB and return to Policy Info Page
    * I create a new "CO" quote

    @PerformanceDEV
    Examples:
      | TC_ID  | OKTAuser               |
      | TN_001 | Pureonlineautomation1  |
      | NY_001 | Pureonlineautomation17 |
      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
#      | TN_001 | Pureonlineautomation1  |
#      | NY_001 | Pureonlineautomation17 |
#      | FL_001 | Pureonlineautomation6  |
#      | CA_001 | Pureonlineautomation19 |
#      | ID_005 | Pureonlineautomation6  |
