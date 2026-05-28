Feature: Claims scenario 3 - Multiple TERMS Collection Policies for testing Trust based claims

  @ClaimsScenario3 @ClaimsScenario3.1
  Scenario Outline: Claims Scenario 3.1 - Backdated Collection policy with multiple terms - multiple scheduled and
  blanket jewelry on the policy and other classes - "<thread>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorCO" for "CO" LOB
    * I set "Effective_Date" to "10/10/2022"
    When I login with OKTA user "<OKTA_User>"
#    * I am logged in to Pure as Field
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I logout

    @ClaimsScenario3.1
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

  @Scenario3 @Scenario3.2
  Scenario Outline: Claims Scenario 3.2 -
  - Backdated Collection policy with multiple terms - few items value of item individually is < $35.0000
  - Backdated Collection policy with multiple terms - few items value of item individually is > $35.0000

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

    @ClaimsScenario3.2
    Examples:
      | TC_ID      | OKTA_User |
      | 3_2_KY_001 | A6        |
      | 3_2_ID_001 | A17       |
      | 3_2_CA_001 | A19       |
      | 3_2_FL_001 | A6        |
      | 3_2_NY_001 | A17       |
      | 3_2_TX_001 | A19       |
      | 3_2_KY_001 | A6        |
      | 3_2_ID_001 | A17       |
      | 3_2_CA_001 | A19       |
      | 3_2_FL_001 | A6        |
      | 3_2_NY_001 | A17       |
      | 3_2_TX_001 | A19       |
      | 3_2_KY_001 | A6        |
      | 3_2_ID_001 | A17       |
      | 3_2_CA_001 | A19       |
      | 3_2_FL_001 | A6        |
      | 3_2_NY_001 | A17       |
      | 3_2_TX_001 | A19       |


  @Scenario3 @Scenario3.3
  Scenario Outline: Claims Scenario 3.3 -
  - Backdated Collection policy with multiple terms - all items value of scheduled for one class is < $35.0000
  - Backdated Collection policy with multiple terms - all items value of scheduled for one class is > $35.0000

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

    @ClaimsScenario3.3
    Examples:
      | TC_ID      | OKTA_User |
      | 3_3_KY_001 | A6        |
      | 3_3_ID_001 | A17       |
      | 3_3_CA_001 | A19       |
      | 3_3_FL_001 | A6        |
      | 3_3_NY_001 | A17       |
      | 3_3_TX_001 | A19       |
      | 3_3_KY_001 | A6        |
      | 3_3_ID_001 | A17       |
      | 3_3_CA_001 | A19       |
      | 3_3_FL_001 | A6        |
      | 3_3_NY_001 | A17       |
      | 3_3_TX_001 | A19       |
      | 3_3_KY_001 | A6        |
      | 3_3_ID_001 | A17       |
      | 3_3_CA_001 | A19       |
      | 3_3_FL_001 | A6        |
      | 3_3_NY_001 | A17       |
      | 3_3_TX_001 | A19       |

  @Scenario3 @Scenario3.4
  Scenario Outline: Claims Scenario 3.4 - Backdated Collection policy with only Blanket Jewelery / no scheduled items
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

    @ClaimsScenario3.4
    Examples:
      | TC_ID      | OKTA_User |
      | 3_4_KY_001 | A6        |
      | 3_4_ID_001 | A17       |
      | 3_4_CA_001 | A19       |
      | 3_4_FL_001 | A6        |
      | 3_4_NY_001 | A17       |
      | 3_4_TX_001 | A19       |
      | 3_4_KY_001 | A6        |
      | 3_4_ID_001 | A17       |
      | 3_4_CA_001 | A19       |
      | 3_4_FL_001 | A6        |
      | 3_4_NY_001 | A17       |
      | 3_4_TX_001 | A19       |
      | 3_4_KY_001 | A6        |
      | 3_4_ID_001 | A17       |
      | 3_4_CA_001 | A19       |
      | 3_4_FL_001 | A6        |
      | 3_4_NY_001 | A17       |
      | 3_4_TX_001 | A19       |