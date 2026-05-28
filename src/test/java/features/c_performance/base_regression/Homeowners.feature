@BaseRegressionPerformance @HO
Feature: Homeowners regression


  Scenario Outline: Homeowners single location new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
#    * I open OKTA and select tile with "A1"
    * I load random user data
    * I am logged in to Pure as "<user>"
#    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
#    * I set "Is_There_Mortgage" to "Yes"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

#    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | AK_001 | P76  |
      | AR_001 | P77  |
      | AZ_001 | P78  |
      | CO_001 | P79  |
      | DC_001 | P80  |
      | IA_001 | P81  |
      | IL_001 | P82  |
      | IN_001 | P82  |
      | KS_001 | P83  |
      | KY_001 | P84  |
      | MN_001 | P85  |
      | MO_001 | P86  |
      | MT_001 | P87  |
      | ND_001 | P88  |
      | NE_001 | P89  |
      | NH_001 | P90  |
      | NM_001 | P91  |
      | NV_001 | P92  |
      | OH_001 | P93  |
