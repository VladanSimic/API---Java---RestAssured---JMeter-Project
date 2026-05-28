@PrimaryFlood @NonAdmitted @US48980
Feature: PF - Location Tree
  As a Product Owner I would like to introduce a new location tree
  for the Primary Flood Product based on elements from the Texas HC product and HS product

  @TC96482
  Scenario Outline: US48980 - Verify tree nodes pages for - "<state>" - 01/01/2025
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

    Then I verify page "<locationPageName>" is "visible" in tree
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

  Scenario Outline: US48980 - Verify primary flood is not visible for - "<state>" on PDF date - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I navigate to quotes page
    * I click new quote button
    * I search and select an agency
    * I partially fill out quote basic information page

    Then I verify checkbox "Primary Flood" is "not visible" on page
    * I take screenshot "Primary Flood LOB - not visible"

    Examples:
      | state  |
      | AK_001 |
      | AZ_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | MN_001 |
      | MT_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | NM_001 |
      | NV_001 |
      | OH_001 |
      | OK_001 |
      | OR_001 |
      | PA_001 |
      | RI_001 |
      | SD_001 |
      | TN_001 |
      | UT_001 |
      | VT_001 |
      | WA_001 |
      | WI_001 |
      | WV_001 |
      | WY_001 |
      | DE_001 |
      | HI_001 |
      | MD_001 |
      | ME_001 |
      | SC_001 |
      | MI_001 |
      | ID_001 |

  Scenario Outline: US48980 - Verify primary flood is not visible for - "<state>" before PDF date - 12/31/2024

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "12/31/2024"

    When I am logged in to Pure as "Field"
    * I navigate to quotes page
    * I click new quote button
    * I search and select an agency
    * I partially fill out quote basic information page

    Then I verify checkbox "Primary Flood" is "not visible" on page
    * I take screenshot "Primary Flood LOB - not visible"

    Examples:
      | state  |
      | AK_001 |
      | AZ_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | MN_001 |
      | MT_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | NM_001 |
      | NV_001 |
      | OH_001 |
      | OK_001 |
      | OR_001 |
      | PA_001 |
      | RI_001 |
      | SD_001 |
      | TN_001 |
      | UT_001 |
      | VT_001 |
      | WA_001 |
      | WI_001 |
      | WV_001 |
      | WY_001 |
      | DE_001 |
      | HI_001 |
      | MD_001 |
      | ME_001 |
      | SC_001 |
      | MI_001 |
      | ID_001 |
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