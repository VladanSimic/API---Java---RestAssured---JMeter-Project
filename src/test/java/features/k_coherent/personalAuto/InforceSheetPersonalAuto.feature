@PersonalAuto
Feature: Personal auto Coherent

  @InforceSheetPA
  Scenario Outline: Coherent - PA - NC - "<TC_ID>" - New Business

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/inforce_data/pa/QuoteCreationInforcePA_NC" in sheet "QuoteCreatorPA" for "PA_NB" LOB
    * I load random user data

    When I am logged in to Pure as Field
    * I set "Last_Name" to "PA-<TC_ID>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote

    Then I verify error message is not shown "Rating failed. Please re-rate or contact underwriter for review. "
    * I save the premium in Excel "src/test/test_data/dragon/coherent/inforce_data/pa/Test_Data_PA-NC.xlsx" in sheet "Results" for "<TC_ID>" "<state>" and policy number "<policyNum>" with expected premium "<expectedPremium>"

    Examples:
      | TC_ID  | state | policyNum | expectedPremium |
      | NC_001 | NC    | HS2518254 | $ 5,764.40      |
      | NC_002 | NC    | HS2518254 | $ 5,764.40      |
      | NC_003 | NC    | HS2518254 | $ 5,764.40      |
      | NC_005 | NC    | HS2518254 | $ 5,764.40      |
      | NC_008 | NC    | HS2518254 | $ 5,764.40      |
      | NC_013 | NC    | HS2518254 | $ 5,764.40      |
