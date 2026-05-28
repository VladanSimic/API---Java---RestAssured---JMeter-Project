@BaseRegressionPerformance @PW
Feature: Personal watercraft regression

  Scenario Outline: Personal watercraft new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationPW" in sheet "QuoteCreatorPW" for "PW" LOB
#    * I open OKTA and select tile with "A1"
    * I load random user data
    * I am logged in to Pure as "<user>"
#    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
#    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | AK_001 | P151 |
      | AR_001 | P152 |
      | AZ_001 | P153 |
      | CO_001 | P154 |
      | DC_001 | P155 |
      | IA_001 | P156 |
      | IL_001 | P157 |
      | IN_001 | P158 |
      | KS_001 | P159 |
      | KY_001 | P160 |
      | MN_001 | P161 |
      | MO_001 | P162 |
      | MT_001 | P163 |
      | ND_001 | P164 |
      | NE_001 | P165 |
      | NH_001 | P166 |
      | NM_001 | P167 |
      | NV_001 | P168 |
      | NV_001 | P169 |
      | OH_001 | P170 |
      | OK_001 | P171 |
      | OR_001 | P172 |
      | PA_001 | P173 |
      | RI_001 | P174 |
      | SD_001 | P175 |
