@BaseRegressionPerformance @EX
Feature: Excess liability regression

  Scenario Outline: Excess liability new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  | user |
      | AK_001 | P26  |
      | AR_001 | P27  |
      | AZ_001 | P28  |
      | CO_001 | P29  |
      | DC_001 | P30  |
      | IA_001 | P31  |
      | IL_001 | P32  |
      | IN_001 | P33  |
      | KS_001 | P34  |
      | KY_001 | P35  |
      | MN_001 | P36  |
      | MO_001 | P37  |
      | MT_001 | P38  |
      | ND_001 | P39  |
      | NE_001 | P40  |
      | NH_001 | P41  |
      | NM_001 | P42  |
      | NV_001 | P43  |
      | OH_001 | P44  |
      | OK_001 | P45  |
      | OR_001 | P46  |
      | PA_001 | P47  |
      | RI_001 | P48  |
      | SD_001 | P49  |
      | TN_001 | P50  |
      | UT_001 | P26  |
      | VT_001 | P27  |
      | WA_001 | P28  |
      | WI_001 | P29  |
      | WV_001 | P30  |
      | WY_001 | P31  |
