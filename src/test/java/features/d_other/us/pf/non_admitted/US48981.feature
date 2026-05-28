@PrimaryFlood @NonAdmitted @US48981
Feature: [Continued] PF - Previous Claims/Losses Tree
  As a Product Owner I would like to introduce a Previous Claims/Losses tree
  to the Primary Flood Product based on elements from the Texas HC product and HS product

  @TC96481
  Scenario Outline: US48981 - Verify tree nodes pages for - "<state>" - 01/01/2025
  As a user I want to make changes to the Quote Creation Workflow so that
  we are able to create quotes with the new nodes for Primary Flood

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I expand cover page tree
    * I expand location page tree

    Then I verify page "Previous Claim/Losses" is "visible" in tree
    * I take screenshot "Primary Flood Pages - visible"

    Examples:
      | state  | locationPageName   |
      | NY_001 | New York NY        |
      | MA_001 | Abington MA        |
      | TX_001 | Montgomery TX      |
      | GA_001 | Bethlehem GA       |
      | CT_001 | New Haven CT       |
      | NJ_001 | Budd Lake NJ       |
      | VA_001 | Aylett VA          |
      | IL_001 | Gurnee IL          |
      | CO_001 | Arvada CO          |
      | CA_001 | San Luis Obispo CA |
      | FL_001 | Fleming Island FL  |
      | LA_001 | Baton Rouge LA     |
      | NC_001 | Durham NC          |
      | MO_001 | Dexter MO          |
      | AL_001 | Homewood AL        |
      | KY_001 | Upton KY           |
      | MS_001 | Starkville MS      |
      | AR_001 | Helena AR          |