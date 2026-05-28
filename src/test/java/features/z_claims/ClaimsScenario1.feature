Feature: Claims scenario 1 - Policy Creation

  @ClaimsScenario1 @ClaimsScenario1.1
  Scenario Outline: Claims Scenario 1.1 - Policy Creation - PA - "<thread>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "10/10/2022"
    When I login with OKTA user "<OKTA_User>"
#    * I am logged in to Pure as Field
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I logout

    @ClaimsScenario1.1
    Examples:
      | TC_ID  | OKTA_User |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | AK_001 | A6        |
      | IA_001 | A17       |
      | LA_001 | A19       |
      | MA_001 | A6        |

  @Scenario1 @Scenario1.2
  Scenario Outline: Claims Scenario 1.2 - Policy Creation - HO - "<thread>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorHO" for "HO" LOB
    * I set "Effective_Date" to "10/10/2022"
    When I login with OKTA user "<OKTA_User>"
#    * I am logged in to Pure as Field
    * I navigate to quotes
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I logout

    @ClaimsScenario1.2
    Examples:
      | TC_ID  | OKTA_User |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | AK_001 | A6        |
      | IA_001 | A17       |
      | LA_001 | A19       |
      | MA_001 | A6        |


  @Scenario1 @Scenario1.3
  Scenario Outline: Claims Scenario 1.3 - Policy Creation - CO - "<thread>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorCO" for "CO" LOB
    * I set "Effective_Date" to "10/10/2022"
    When I login with OKTA user "<OKTA_User>"
#    * I am logged in to Pure as Field
    * I navigate to quotes
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I logout

    @ClaimsScenario1.3
    Examples:
      | TC_ID  | OKTA_User |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | AK_001 | A6        |
      | IA_001 | A17       |
      | LA_001 | A19       |
      | MA_001 | A6        |

  @Scenario1 @Scenario1.4
  Scenario Outline: Claims Scenario 1.4 - Policy Creation - PW - With HULL - "<thread>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorPW" for "PW" LOB
    * I set "Effective_Date" to "10/10/2022"
    When I login with OKTA user "<OKTA_User>"
#    * I am logged in to Pure as Field
    * I navigate to quotes
    * I initiate a new quote
    * I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I logout

    @ClaimsScenario1.4
    Examples:
      | TC_ID  | OKTA_User |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | AK_001 | A6        |
      | IA_001 | A17       |
      | LA_001 | A19       |
      | MA_001 | A6        |

  @Scenario1 @Scenario1.5
  Scenario Outline: Claims Scenario 1.5 - Policy Creation - PW - Without HULL - "<thread>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorPW" for "PW" LOB
    * I set "Effective_Date" to "10/10/2022"
    When I login with OKTA user "<OKTA_User>"
#    * I am logged in to Pure as Field
    * I navigate to quotes
    * I initiate a new quote
    * I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I logout

    @ClaimsScenario1.5
    Examples:
      | TC_ID  | OKTA_User |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | AK_001 | A6        |
      | IA_001 | A17       |
      | LA_001 | A19       |
      | MA_001 | A6        |

  @Scenario1 @Scenario1.6
  Scenario Outline: Claims Scenario 1.6 - Policy Creation - EX - "<thread>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorEX" for "EX" LOB
    * I set "Effective_Date" to "10/10/2022"
    When I login with OKTA user "<OKTA_User>"
#    * I am logged in to Pure as Field
    * I navigate to quotes
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I logout

    @ClaimsScenario1.6
    Examples:
      | TC_ID  | OKTA_User |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | KY_001 | A6        |
      | ID_001 | A17       |
      | CA_001 | A19       |
      | FL_001 | A6        |
      | NY_001 | A17       |
      | TX_001 | A19       |
      | AK_001 | A6        |
      | IA_001 | A17       |
      | LA_001 | A19       |
      | MA_001 | A6        |