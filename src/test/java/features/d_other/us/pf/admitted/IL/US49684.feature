@PrimaryFlood @Admitted @US49684
Feature: PF Admitted - Removing Flood information block from Location Coverage Screen - IL
  As a product manager, I want to Update Optional Flood Coverage Section on the UI.
  Removing Flood Information block from Location Coverage Screen and moving it
  to newly created Flood Coverage tree.

  @TC97813
  Scenario: US49684 - Verify Flood information block for multiple locations NB and END - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Condo/Co-op   | 7500000 |           | 10,000 |            |
    * I navigate to "Chicago IL" page

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - END"

  @TC97814
  Scenario: US49684 - Verify Flood information block for multiple locations NB and RNW - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Tenants       | 7500000 |           | 10,000 |            |
    * I navigate to "Chicago IL" page
    * I click order property details button

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - RNW"

  @TC97815
  Scenario: US49684 - Verify Flood information block for multiple locations NB and END - IL_001  - 09/06/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Condo/Co-op   | 7500000 |           | 10,000 |            |
    * I navigate to "Chicago IL" page

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - END"

  @TC97816
  Scenario: US49684 - Verify Flood information block for multiple locations NB and RNW - IL_001 - 09/07/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Tenants       | 7500000 |           | 10,000 |            |
    * I navigate to "Chicago IL" page
    * I click order property details button

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - RNW"

    When I navigate to "Gurnee IL" page

    Then I verify block "flood information" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

  @TC97817
  Scenario: US49684 - Verify Flood information block for NB, END and RNW - IL_001 - 01/09/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "01/09/2024"
    * I set "Endorsement_Effective_Date_END" to "01/11/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "Gurnee IL" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Gurnee IL" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - RNW"

  @TC97818
  Scenario Outline: US49684 - Verify Flood information block is visible  - "<state>" not in scope - 09/07/2025

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "<locationPageName>" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "<locationPageName>" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "<locationPageName>" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block - RNW"

    Examples:
      | state  | locationPageName    |
      | AK_001 | North Pole AK       |
      | AZ_001 | Cornville AZ        |
      | DC_001 | Washington DC       |
      | IA_001 | Marion IA           |
      | IN_001 | Fairmount IN        |
      | KS_001 | Fort Leavenworth KS |
      | MN_001 | Lakeland MN         |
      | MT_001 | Butte MT            |
      | ND_001 | Fargo ND            |
      | NE_001 | La Vista NE         |
      | NH_001 | Manchester NH       |
      | NM_001 | Tularosa NM         |
      | NV_001 | Mesquite NV         |
      | OH_001 | Upper Sandusky OH   |
      | OK_001 | Enid OK             |
      | OR_001 | North Plains OR     |
      | PA_001 | Scranton PA         |
      | RI_001 | Coventry RI         |
      | SD_001 | Hot Springs SD      |
      | TN_001 | Gatlinburg TN       |
      | UT_001 | Kanab UT            |
      | VT_001 | Burlington VT       |
      | WA_001 | Ridgefield WA       |
      | WI_001 | Williams Bay WI     |
      | WY_001 | Cody WY             |
      | HI_001 | Haleiwa HI          |
      | MD_001 | Woodbine MD         |
      | ME_001 | Mount Vernon ME     |
      | SC_001 | Moore SC            |
      | MI_001 | Whitmore Lake MI    |
      | ID_001 | Boise ID            |
      | DE_001 | New Castle DE       |
      | WV_001 | Rivesville WV       |