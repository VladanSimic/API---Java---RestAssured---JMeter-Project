@PrimaryFlood @Admitted @US51214
Feature: PF Admitted - Flood Node - Optional Flood Coverage Block - Update - Function - IL
  As a product manager, I would want to make Optional Flood Coverage available
  only for the existing policies/locations with Flood Advantage or Flood Extension coverage
  and behave in certain way when we can start offering primary flood endorsement to our members.

  @TC98982
  Scenario Outline: US51214 - Verify that Optional coverage Block is available on NB/END for internal user - "<user>" - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I fill out HO Flood Coverage page
    * I click save changes button

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "optional flood coverage block - NB"

    When I navigate to "Elevation Certificate" page
    * I fill out HO quote elevation certificate details page
    * I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 |           | 10,000 | 5%         |
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click save changes button

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "optional flood coverage block - END"

    Examples:
      | user |
      | A1   |

  @TC98984
  Scenario Outline: US51214 - Verify that Optional coverage Block is not available on NB/RNW for internal user - "<user>" - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "PRP - B/C/X"
    * I click save changes button

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "optional flood coverage block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 7500000 |           | 10,000 | 5%         |
    * I navigate to "Flood Coverage" page
    * I set the check manager flood zone override to "Yes"
    * I set the flood zone to "PRP - B/C/X"
    * I click save changes button

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "optional flood coverage block - END"

    Examples:
      | user |
      | A1   |

  @TC98986
  Scenario: US51214 - Verify that the Flood Advantage is present on the Optional coverage page before PD Filling dates, all transactions (NB/END/RNWL)

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "Effective_Date" to "02/09/2024"
    * I set "Endorsement_Effective_Date_END" to "09/07/2024"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block

    When I rate, bind and initiate new endorsement
    * I navigate to "Optional Coverages" page

    Then I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block

    When I review changes
    * I rate an endorsement
    * I issue an endorsement
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Optional Coverages" page

    Then I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block

  @TC98987
  Scenario Outline: US51214 - Verify that the Flood Advantage is present on the Optional coverage page after PD Filling dates, all transactions (NB/END/RNWL), for the states that are not in the scope of the project

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "Effective_Date" to "09/08/2025"
    * I set "Endorsement_Effective_Date_END" to "02/12/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block

    When I rate, bind and initiate new endorsement
    * I navigate to "Optional Coverages" page

    Then I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block

    When I review changes
    * I rate an endorsement
    * I issue an endorsement
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Optional Coverages" page

    Then I verify the "Flood Advantage" label with "Yes" and "No" radio buttons is "visible" in "optional flood coverage" block

    Examples:
      | state  |
#     | AK_001 | doesn't have that coverage
      | AZ_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | MN_001 |
      | MT_001 |
      | ND_001 |
      | NE_001 |
#      | NH_001 | doesn't have that coverage
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
      | WY_001 |
#      | HI_001 | doesn't have that coverage
      | MD_001 |
      | ME_001 |
      | SC_001 |
      | MI_001 |
      | ID_001 |
#      | DE_001 | doesn't have that coverage
#      | WV_001 | doesn't have that coverage

  @TC98991
  Scenario: US51214 - Verify that for Authority lower than RUM, Optional coverage block is not visible after the PD Filling dates

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as Underwriter1
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "optional flood coverage block - NB"
