@BaseRegressionPerformance @PA
Feature: Personal auto regression

  Scenario Outline: Personal auto new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationPA" in sheet "QuoteCreatorPA" for "PA" LOB
#    * I open OKTA and select tile with "A1"
    * I load random user data
    * I am logged in to Pure as "<user>"
#    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
#    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | AK_001 | P126 |
      | AR_001 | P127 |
      | AZ_001 | P128 |
      | CO_001 | P129 |
      | DC_001 | P130 |
      | IA_001 | P131 |
      | IL_001 | P132 |
      | IN_001 | P133 |
      | KS_001 | P134 |
      | KY_001 | P135 |
      | MN_001 | P136 |
      | MO_001 | P137 |
      | MT_001 | P138 |
      | ND_001 | P139 |
      | NE_001 | P140 |
      | NH_001 | P141 |
      | NM_001 | P142 |
      | NV_001 | P143 |
      | OH_001 | P144 |

