@BaseRegressionPerformance @ES
Feature: Excess Surplus regression


  Scenario Outline: Excess surplus new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
#    * I open OKTA and select tile with "A1"
    * I load random user data
    * I am logged in to Pure as "<user>"
#    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
#    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | NY_001 | P51  |
      | CA_001 | P52  |
      | CT_001 | P53  |
      | MA_001 | P54  |
      | TX_001 | P55  |
      | FL_001 | P56  |
      | NY_001 | P57  |
      | CA_001 | P58  |
      | CT_001 | P59  |
      | MA_001 | P60  |
      | TX_001 | P61  |
      | FL_001 | P62  |
      | NY_001 | P63  |
      | CA_001 | P64  |
      | CT_001 | P65  |
      | MA_001 | P66  |
      | TX_001 | P67  |
      | FL_001 | P68  |
      | NY_001 | P69  |
