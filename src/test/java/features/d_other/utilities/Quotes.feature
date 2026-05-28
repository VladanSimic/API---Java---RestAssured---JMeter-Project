@quotes
Feature: PF NonAdmitted - Quotes

  Scenario Outline: Creating quotes
    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as Field
    * I create a new "PF" quote for a new customer

    Then I click save changes button

#    Then I rate a quote

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |