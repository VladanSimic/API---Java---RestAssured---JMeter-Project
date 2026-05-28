@PrimaryFlood @Admitted @US50189
Feature: PF Admitted - Removing Flood information and Excess flood blocks from Location Coverage Screen - CO
  As a product manager, I want to update Flood Information and Excess Flood section of the Location Screen
  as we can start offering primary flood endorsement to our clients as an optional coverage.

  @TC99543
  Scenario: US50189 - Verify Flood information and Excess flood blocks for multiple locations NB and END - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "flood information" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks removal - NB"

    When I navigate to "Flood Coverage" page

    Then I verify block "flood information" is at position 1 on page
    * I verify block "excess flood" is at position 3 on page
    * I take screenshot "Flood information and excess flood blocks visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Denver CO" page

    Then I verify block "flood information" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks removal - END"

    When I navigate to "Flood Coverage" page

    Then I verify block "flood information" is at position 1 on page
    * I verify block "excess flood" is at position 3 on page
    * I take screenshot "Flood information and excess flood blocks visibility - END"

  @TC99544
  Scenario: US50189 - Verify Flood information and Excess flood blocks for multiple locations NB and RNW - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "flood information" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks removal - NB"

    When I navigate to "Flood Coverage" page

    Then I verify block "flood information" is at position 1 on page
    * I verify block "excess flood" is at position 3 on page
    * I take screenshot "Flood information and excess flood blocks visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Tenants       | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Denver CO" page

    Then I verify block "flood information" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks removal - RNW"

    When I navigate to "Flood Coverage" page

    Then I verify block "flood information" is at position 1 on page
    * I verify block "excess flood" is at position 3 on page
    * I take screenshot "Flood information and excess flood blocks visibility - RNW"

  @TC99545
  Scenario: US50189 - Verify Flood information and Excess blocks for multiple locations NB and END - CO_001  - 02/08/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "02/08/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Denver CO" page

    Then I verify block "flood information" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks removal - END"

    When I navigate to "Flood Coverage" page

    Then I verify block "flood information" is at position 1 on page
    * I verify block "excess flood" is at position 3 on page
    * I take screenshot "Flood information and excess flood blocks visibility - END"

  @TC99546
  Scenario: US50189 - Verify Flood information and Excess blocks for multiple locations NB and RNW - CO_001 - 09/07/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Tenants       | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Denver CO" page

    Then I verify block "flood information" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks removal - RNW"

    When I navigate to "Flood Coverage" page

    Then I verify block "flood information" is at position 1 on page
    * I verify block "excess flood" is at position 3 on page
    * I take screenshot "Flood information and excess flood blocks visibility - RNW"

    When I navigate to "Wheat Ridge CO" page

    Then I verify block "flood information" is "not visible" on page
    * I verify block "excess flood" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks removal - NB location"

    When I navigate to "Flood Coverage" page

    Then I verify block "flood information" is at position 1 on page
    * I verify block "excess flood" is at position 3 on page
    * I take screenshot "Flood information and excess flood blocks visibility - NB location"

  @TC99547
  Scenario: US50189 - Verify Flood information and Excess flood blocks for NB, END and RNW - CO_001 - 01/09/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "01/09/2024"
    * I set "Endorsement_Effective_Date_END" to "01/11/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks visibility - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information and excess flood blocks visibility - RNW"

  @TC99548
  Scenario Outline: US50189 - Verify Flood information block is visible  - "<state>" not in scope - 09/07/2025

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "<locationPageName>" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "<locationPageName>" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block visibility - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "<locationPageName>" page

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block visibility - RNW"

    Examples:

      | state  | locationPageName    |
      | AK_001 | North Pole AK       |
      | AR_001 | Helena AR           |
      | AZ_001 | Cornville AZ        |
      | DC_001 | Washington DC       |
      | IA_001 | Marion IA           |
      | IN_001 | Fairmount IN        |
      | KS_001 | Fort Leavenworth KS |
      | KY_001 | Upton KY            |
      | MN_001 | Lakeland MN         |
      | MO_001 | Dexter MO           |
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
      | WV_001 | Rivesville WV       |
      | WY_001 | Cody WY             |
      | AL_001 | Gadsden AL          |
      | CA_001 | Orange CA           |
      | DE_001 | New Castle DE       |
      | HI_001 | Haleiwa HI          |
      | LA_001 | Slidell LA          |
      | MD_001 | Woodbine MD         |
      | ME_001 | Mount Vernon ME     |
      | MS_001 | Pheba MS            |
      | NC_001 | Clemmons NC         |
      | SC_001 | Moore SC            |
      | FL_001 | Winter Garden FL    |
      | MI_001 | Whitmore Lake MI    |
      | ID_001 | Boise ID            |

  @TC99549
  Scenario Outline: US50189 - Verify Excess flood block is visible  - "<state>" not in scope - 09/07/2025

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "<locationPageName>" page

    Then I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "<locationPageName>" page

    Then I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "<locationPageName>" page

    Then I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - RNW"

    Examples:

      | state  | locationPageName |
      | WV_001 | Rivesville WV    |
      | DE_001 | New Castle DE    |
      | NC_001 | Clemmons NC      |
      | FL_001 | Winter Garden FL |
