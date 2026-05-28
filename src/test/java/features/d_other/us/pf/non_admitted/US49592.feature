@PrimaryFlood @NonAdmitted @US49592
Feature: [Continued] PF - Non-Admitted: Quote Creation Workflow Changes
  As a Developer I want to make changes to the Quote Creation Workflow
  so that we are able to create quotes with the new nodes for Primary Flood

  @TC96484
  Scenario Outline: US49592 - Verify primary flood is visible for - "<state>" on PDF date - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I navigate to quotes page
    * I click new quote button
    * I search and select an agency
    * I partially fill out quote basic information page

    Then I verify checkbox "Primary Flood" is "visible" on page
    * I take screenshot "Primary Flood LOB - visible"

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
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

  @TC96485
  Scenario Outline: US49592 - Verify tree nodes pages for - "<state>" - 01/01/2025
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

    Then I verify page "Home Surplus Lines Policy" is "visible" in tree
    * I verify page "<locationPageName>" is "visible" in tree
    * I verify page "Previous Claim/Losses" is "visible" in tree
    * I verify page "Additional Interests" is "visible" in tree
    * I verify page "Mandatory Forms" is "visible" in tree
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