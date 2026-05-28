@PrimaryFlood @Admitted @US50284
Feature: PF Admitted - Copy Flood Blocks to Newly Created Flood Node - CO
  As a product manager, I want to copy some of the flood related blocks,
  fields from several screens to the newly created flood node
  so we can start offering Primary Flood endorsements to our members.

  @TC97503 @TC97504
  Scenario: US50284 - Verify flood tree node for multiple locations new business - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I verify flood coverage page is "visible"

    When I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page

    Then I verify flood coverage page is "visible"

    When I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page

  @TC97504A
  Scenario: US50284 - Verify flood tree node for multiple locations endorsement - CO_001 - 09/06/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I verify flood coverage page is "not visible"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page

    Then I verify flood coverage page is "visible"

    When I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page

  @TC97504
  Scenario: US50284 - Verify flood tree node for multiple locations renewal - CO_001 - 02/09/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I verify flood coverage page is "not visible"

    When I rate, bind and initiate new renewal
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify flood coverage page is "visible"
    * I verify block "optional flood coverage" is "visible" on page
    * I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page

    Then I verify flood coverage page is "visible"

    When I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"

    Then I verify block "optional flood coverage" is "visible" on page
    * I verify block "flood information" is "visible" on page
    * I verify block "excess flood" is "visible" on page

  Scenario Outline: US50284 - Verify flood tree node is not visible  - "<state>" - "<effectiveDate>"

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as "Field"
    * I navigate to quotes page
    * I initiate a new quote

    Then I verify flood coverage page is "not visible"

    @TC97505
    Examples:
      | state  | effectiveDate |
      | AK_001 | 09/07/2025    |
      | AZ_001 | 09/07/2025    |
      | DC_001 | 09/07/2025    |
      | IA_001 | 09/07/2025    |
      | IN_001 | 09/07/2025    |
      | KS_001 | 09/07/2025    |
      | MN_001 | 09/07/2025    |
      | MT_001 | 09/07/2025    |
      | ND_001 | 09/07/2025    |
      | NE_001 | 09/07/2025    |
      | NH_001 | 09/07/2025    |
      | NM_001 | 09/07/2025    |
      | NV_001 | 09/07/2025    |
      | OH_001 | 09/07/2025    |
      | OK_001 | 09/07/2025    |
      | OR_001 | 09/07/2025    |
      | PA_001 | 09/07/2025    |
      | RI_001 | 09/07/2025    |
      | SD_001 | 09/07/2025    |
      | TN_001 | 09/07/2025    |
      | UT_001 | 09/07/2025    |
      | VT_001 | 09/07/2025    |
      | WA_001 | 09/07/2025    |
      | WI_001 | 09/07/2025    |
      | WV_001 | 09/07/2025    |
      | WY_001 | 09/07/2025    |
      | DE_001 | 09/07/2025    |
      | HI_001 | 09/07/2025    |
      | MD_001 | 09/07/2025    |
      | ME_001 | 09/07/2025    |
      | SC_001 | 09/07/2025    |
      | MI_001 | 09/07/2025    |
      | ID_001 | 09/07/2025    |

    @TC97506
    Examples:
      | state  | effectiveDate |
      | IL_001 | 09/06/2025    |
      | CO_001 | 09/06/2025    |
      | NY_001 | 09/06/2025    |
      | MA_001 | 09/06/2025    |
      | TX_001 | 09/06/2025    |
      | GA_001 | 09/06/2025    |
      | CT_001 | 09/06/2025    |
      | NJ_001 | 09/06/2025    |
      | VA_001 | 09/06/2025    |