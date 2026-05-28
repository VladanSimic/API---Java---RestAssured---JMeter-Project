Feature: Claims scenario 1 - Policy Creation

  @ClaimsScenario1 @ClaimsScenario4.1
  Scenario Outline: Claims Scenario 4.1 - NB PA Policies - Multiple vehicles and operators - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorPA" for "PA" LOB
    * I load random user data
    * I load random additional operators data
    * I set "Effective_Date" to "10/10/2022"
    * I am logged in to Pure as "P1"
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
      | TC_ID  |
      | KY_101 |
      | ID_101 |
      | CA_101 |
      | FL_101 |
      | NY_101 |
      | TX_101 |
      | AK_101 |
      | IA_101 |
      | LA_101 |
      | MA_101 |