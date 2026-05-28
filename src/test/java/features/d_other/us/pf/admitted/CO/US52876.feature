@PrimaryFlood @Admitted @US52876
Feature: PF Admitted - Add Non-Admitted FS Quoting Section to Primary Flood Coverage Block - UI - CO Home & Condo
  As a product manager, I want to add the ability to quote non-admitted Flood Solutions to the Primary Flood Coverage block

  @TC104529
  Scenario: US52876 - Verify that the new Quoting Section is placed just below "Elevated Risk Credit (internal only" and "High PML Load (internal only)" fields of the "primary flood coverage" block - CO (NB/END) - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify Selection information text is displayed
    * I verify input field "Dwelling" is "visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Deductible" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "TIV" is "visible" in "primary flood coverage" block

    * I verify input field "Replacement Cost" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 4 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" with index 2 is "visible" in "primary flood coverage" block
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "primary flood coverage" block
    * I take screenshot "Quoting section fields (Homeowners) - NB"
    * I type "1" to "How many floors does the location have above grade?" input field
    * I choose "No" for "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    When I rate, bind and initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button

    When I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify Selection information text is displayed
    * I verify input field "Dwelling" is "visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Deductible" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "TIV" is "visible" in "primary flood coverage" block

    * I verify input field "Replacement Cost" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 4 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 3 is "visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" with index 2 is "visible" in "primary flood coverage" block
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "visible" in "primary flood coverage" block
    * I take screenshot "Quoting section fields (Condo) - END"

  @TC104564
  Scenario: US52876 - Verify limits in the new Quoting Section CO NB Homeowners, RNW Condo - CO (NB/RNW) - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify "Dwelling" value "250,000" is displayed on page
    * I verify "Contents" with index 2 value "100,000" is displayed in "primary flood coverage" block
    * I verify "Loss of Use" with index 3 value "50,000" is displayed in "primary flood coverage" block
    * I verify "Other Structures" with index 2 value "25,000" is displayed in "primary flood coverage" block and it is read only
    * I verify "Deductible" with index 2 value "5,000" is displayed in "primary flood coverage" block
    * I verify "TIV" with index 1 value "425,000" is displayed in "primary flood coverage" block and it is read only

    * I verify input field "Replacement Cost" with index 2 in "primary flood coverage" block is read only and has value
    * I verify input field "Contents" with index 3 in "primary flood coverage" block is read only and has value
    * I verify input field "Loss of Use" with index 4 in "primary flood coverage" block is read only and has value
    * I verify input field "Other Structures" with index 3 in "primary flood coverage" block is read only and has value
    * I verify input field "AOP Deductible" with index 2 in "primary flood coverage" block is read only and has value
    * I take screenshot "Quoting section limits (Homeowners) - NB"
    * I type "1" to "How many floors does the location have above grade?" input field
    * I choose "No" for "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    When I rate, bind and initiate new renewal

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button

    When I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify "Dwelling" field with index 1 is read only and empty in "primary flood coverage" block
    * I verify "Contents" with index 2 value "250,000" is displayed in "primary flood coverage" block
    * I verify "Loss of Use" with index 3 value "50,000" is displayed in "primary flood coverage" block
    * I verify "Other Structures" field with index 2 is read only and empty in "primary flood coverage" block
    * I verify "Deductible" with index 2 value "2,500" is displayed in "primary flood coverage" block
    * I verify "TIV" with index 1 value "300,000" is displayed in "primary flood coverage" block and it is read only

    * I verify "Replacement Cost" field with index 2 is read only and empty in "primary flood coverage" block
    * I verify input field "Contents" with index 3 in "primary flood coverage" block is read only and has value
    * I verify input field "Loss of Use" with index 4 in "primary flood coverage" block is read only and has value
    * I verify "Other Structures" field with index 3 is read only and empty in "primary flood coverage" block
    * I verify input field "AOP Deductible" with index 2 in "primary flood coverage" block is read only and has value
    * I take screenshot "Quoting section limits (Condo) - RNW"

  @TC104565
  Scenario: US52876 - Verify that the Quoting Section is not displayed on the UI if Residence Type is "Tenants" - CO (NB) - 09/07/2025

    Given I use "CO_003" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page
    * I navigate to "Flood Coverage" page
    * I scroll to the bottom of the page

    Then I verify the "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?" distant label with "Yes" and "No" radio buttons is "not visible"
    * I verify input field "Dwelling" is "not visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 3 is "not visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "Deductible" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "TIV" is "not visible" in "primary flood coverage" block

    * I verify input field "Replacement Cost" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "Contents" with index 3 is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 4 is "not visible" in "primary flood coverage" block
    * I verify input field "Other Structures" with index 3 is "not visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" with index 2 is "not visible" in "primary flood coverage" block
    * I verify button "Click here to create a Non-Admitted Primary Flood quote" is "not visible" in "primary flood coverage" block
    * I take screenshot "Quoting section limits (Tenants) - NB"

    When I rate a quote
    * I bind a quote

    Then I override subjectivities
