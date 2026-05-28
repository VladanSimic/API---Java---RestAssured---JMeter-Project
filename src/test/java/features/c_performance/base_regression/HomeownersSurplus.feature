@BaseRegressionPerformance @HS
Feature: Homeowners surplus regression

  Scenario Outline: Regression - HS - "<TC_ID>" - New Business

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | TC_ID  |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | FL_001 |
      | CO_001 |

