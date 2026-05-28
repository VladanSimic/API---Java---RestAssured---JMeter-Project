@PrimaryFlood @NonAdmitted @US49745
Feature: FS -  UI - Remove Location Coverage Page
  As a Product Manager I want to remove Location Coverage node from the UI
  as all the required fields and blocks from this node is now part of Cover
  Page as we start offering this new flood product to our members.

  @TC99946
  Scenario Outline: US49745 - Verify that Location page is removed from the UI for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page

    Then I verify page "<locationPageName>" is "not visible" in tree
    * I take screenshot "Location Coverage Page visibility"

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