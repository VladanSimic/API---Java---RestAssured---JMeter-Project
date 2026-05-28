@PrimaryFlood @Admitted @US53558
Feature: PF - Admitted - Primary Flood Coverage Block - Cosmetic Updates - Home & Condo/Tenants - IL &  CO
  As a product manager, I want to update the labeling of some of the fields to match the Flood Forms

  @TC104414
  Scenario: US53558 - Verify that labels mentioned in the US are updated for the residence type Homeowners, Condos and Tenants (IL state, NB/END) - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

#    Then I verify checkbox is "visible" for label "Manager Primary Flood Override" in "primary flood coverage" block - commented out since it depends on location eligibility
    Then I verify checkbox is "not visible" for label "UW Manager Override" in "primary flood coverage" block

    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "visible" in "primary flood coverage" block
    * I verify input field "Dwelling & Other Structures Limit (Up to $2M)" is "not visible" in "primary flood coverage" block

    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Dwelling Sublimit (Up to $250K)" is "not visible" in "primary flood coverage" block

    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit (Up to $100K)" is "not visible" in "primary flood coverage" block

    * I verify input field "Deductible" is "visible" in "primary flood coverage" block
    * I verify input field "Primary Flood Deductible" is "not visible" in "primary flood coverage" block
    * I take screenshot "Primary flood coverage block (Homeowners) - NB"

    When I rate, bind and initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Condo/Co-op   | 7500000 |           | 10,000 |            |
    * I click order property details button

    When I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page
    * I click save changes button
    * I scroll to the bottom of the page

#    Then I verify checkbox is "visible" for label "Manager Primary Flood Override" in "primary flood coverage" block - commented out since it depends on location eligibility
    Then I verify checkbox is "not visible" for label "UW Manager Override" in "primary flood coverage" block

    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "visible" in "primary flood coverage" block
    * I verify input field "Dwelling & Other Structures Limit (Up to $2M)" is "not visible" in "primary flood coverage" block

    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Dwelling Sublimit (Up to $250K)" is "not visible" in "primary flood coverage" block

    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit (Up to $100K)" is "not visible" in "primary flood coverage" block

    * I verify input field "Deductible" is "visible" in "primary flood coverage" block
    * I verify input field "Primary Flood Deductible" is "not visible" in "primary flood coverage" block
    * I take screenshot "Primary flood coverage block (Condo) - END"

  @TC104421
  Scenario: US53558 - Verify that labels mentioned in the US are updated for the residence type Homeowners, Condos and Tenants (IL state, NB/RNW) - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

#    Then I verify checkbox is "visible" for label "Manager Primary Flood Override" in "primary flood coverage" block - commented out since it depends on location eligibility
    Then I verify checkbox is "not visible" for label "UW Manager Override" in "primary flood coverage" block

    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "visible" in "primary flood coverage" block
    * I verify input field "Dwelling & Other Structures Limit (Up to $2M)" is "not visible" in "primary flood coverage" block

    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Dwelling Sublimit (Up to $250K)" is "not visible" in "primary flood coverage" block

    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit (Up to $100K)" is "not visible" in "primary flood coverage" block

    * I verify input field "Deductible" is "visible" in "primary flood coverage" block
    * I verify input field "Primary Flood Deductible" is "not visible" in "primary flood coverage" block
    * I take screenshot "Primary flood coverage block (Homeowners) - NB"

    When I rate, bind and initiate new renewal

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Tenants       | 7500000 |           | 10,000 |            |
    * I click order property details button

    When I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page
    * I click save changes button
    * I scroll to the bottom of the page

#    Then I verify checkbox is "visible" for label "Manager Primary Flood Override" in "primary flood coverage" block - commented out since it depends on location eligibility
    Then I verify checkbox is "not visible" for label "UW Manager Override" in "primary flood coverage" block

    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "visible" in "primary flood coverage" block
    * I verify input field "Dwelling & Other Structures Limit (Up to $2M)" is "not visible" in "primary flood coverage" block

    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Dwelling Sublimit (Up to $250K)" is "not visible" in "primary flood coverage" block

    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit (Up to $100K)" is "not visible" in "primary flood coverage" block

    * I verify input field "Deductible" is "visible" in "primary flood coverage" block
    * I verify input field "Primary Flood Deductible" is "not visible" in "primary flood coverage" block
    * I take screenshot "Primary flood coverage block (Tenants) - RNW"