@PrimaryFlood @Admitted @US49692
Feature: PF Admitted - Removing Optional Flood Coverage block from Optional Coverage Screen - IL
  As a product manager, I want to Update Optional Flood Coverage Section on the UI.
  Removing Optional Flood Coverage block from Optional Coverage Screen and moving it
  to newly created Flood Coverage tree

  @TC97701
  Scenario: US49692 - Verify Optional flood coverage block for multiple locations NB and END - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Condo/Co-op   | 7500000 |           | 10,000 |            |
    * I navigate to "Chicago IL" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - END"

  @TC97702
  Scenario: US49692 - Verify Optional flood coverage block for multiple locations NB and RNW - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Tenants       | 7500000 |           | 10,000 |            |
    * I navigate to "Chicago IL" page
    * I click order property details button
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - RNW"

  @TC97703
  Scenario: US49692 - Verify Optional flood coverage block for multiple locations NB and END - IL_001 - 02/08/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "02/08/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Condo/Co-op   | 7500000 |           | 10,000 |            |
    * I navigate to "Chicago IL" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - END"

  @TC97704
  Scenario: US49692 - Verify Optional flood coverage block for multiple locations NB and RNW - IL_001 - 09/07/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Tenants       | 7500000 |           | 10,000 |            |
    * I navigate to "Chicago IL" page
    * I click order property details button
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - RNW"

    When I navigate to "Gurnee IL" page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "not visible" on page
    * I take screenshot "Optional flood coverage block - NB"

  @TC97705
  Scenario: US49692 - Verify Optional flood coverage block for NB, END and RNW - IL_001 - 09/06/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2024"
    * I set "Endorsement_Effective_Date_END" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - RNW"

  @TC97706
  Scenario Outline: US49692 - Verify Optional flood coverage block is visible  - "<state>" not in scope - 09/07/2025

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - END"

    When I review changes
    * I rate an endorsement
    * I issue an endorsement

    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Optional Coverages" page

    Then I verify block "optional flood coverage" is "visible" on page
    * I take screenshot "Optional flood coverage block - RNW"

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
      | WY_001 |
      | HI_001 |
      | MD_001 |
      | ME_001 |
      | SC_001 |
      | MI_001 |
      | ID_001 |