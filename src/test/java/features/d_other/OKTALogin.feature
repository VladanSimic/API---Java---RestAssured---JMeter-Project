Feature: Performance OKTA testing
  As a user I should be able to initiate multiple OKTA logins with random user behaviors

  Scenario Outline: Collections Base Policy Creation using data from "<workbook>" workbook, "<sheet>" sheet in row "<row>"
  As a user I should be able to initiate multiple OKTA logins with random user behaviors

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I login with OKTA user "<OKTAuser>"
    And I navigate to quotes page
    * I initiate a new quote
    * I "<LogoutOrCloseOKTA>" OKTA

    Examples:
      | TC_ID  | OKTAuser               | LogoutOrCloseOKTA |
      | TN_001 | Pureonlineautomation1  | Close             |
      | MI_001 | Pureonlineautomation6  | Logout            |
      | OK_001 | Pureonlineautomation17 | Logout            |
      | CO_001 | Pureonlineautomation19 | Logout            |
      | KY_001 | Pureonlineautomation1  | Logout            |
      | NV_001 | Pureonlineautomation6  | Logout            |
      | TN_001 | Pureonlineautomation1  | Logout            |
      | MI_001 | Pureonlineautomation6  | Logout            |
      | OK_001 | Pureonlineautomation17 | Logout            |
      | CO_001 | Pureonlineautomation19 | Logout            |
      | KY_001 | Pureonlineautomation1  | Logout            |
      | NV_001 | Pureonlineautomation6  | Logout            |
      | TN_001 | Pureonlineautomation1  | Close             |
      | MI_001 | Pureonlineautomation6  | Logout            |
      | OK_001 | Pureonlineautomation17 | Logout            |
      | CO_001 | Pureonlineautomation19 | Logout            |
      | KY_001 | Pureonlineautomation1  | Logout            |
      | NV_001 | Pureonlineautomation6  | Logout            |
      | TN_001 | Pureonlineautomation1  | Logout            |
      | OK_001 | Pureonlineautomation17 | Logout            |