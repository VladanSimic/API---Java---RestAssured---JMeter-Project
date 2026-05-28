Feature: DEVELOPMENT Feature

  Scenario Outline: DEVELOPMENT Feature - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
#    * I open OKTA and select tile with "<OKTA_User>"
    And I navigate to quotes page
#    * I set "System Validation Only LLC" as Agency Name and "14673900" as Agency ID
#    * I initiate a new quote
#    * I create a new "EX" quote
#    * I get credit score results
#    * I rate a quote
#    * I navigate to underwriting referrals page
#    * I accept underwriting referrals
#    * I bind a quote
#    * I override subjectivities
#    * I navigate to transactions or endorsements
#    * I initiate new endorsement
#    * I review changes
#    * I rate an endorsement
#    * I issue an endorsement
#    * I create a renewal without process

    @DEV1
    Examples:
      | TC_ID  | OKTA_User |
      | FL_001 | A1        |