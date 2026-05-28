@BaseRegressionPerformance @CO
Feature: Collections regression


  Scenario Outline: Collections new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  | user |
      | AK_001 | P1   |
      | AR_001 | P2   |
      | AZ_001 | P3   |
      | CO_001 | P4   |
      | DC_001 | P5   |
      | IA_001 | P6   |
      | IL_001 | P7   |
      | IN_001 | P8   |
      | KS_001 | P9   |
      | KY_001 | P10  |
      | MN_001 | P11  |
      | MO_001 | P12  |
      | MT_001 | P13  |
      | ND_001 | P14  |
