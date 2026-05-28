@PrimaryFlood @Admitted @US57017
Feature: Change Request: PF Admitted - Update FS Quoting section on Primary Flood Coverage block - IL & CO
  As a product manager, I want to add few new questions to the FS Quoting section of the HO LOB on the Primary Flood Coverage block

  @TC110133
  Scenario: US57017 - 5. Verify HO CO additional questions become mandatory when 'Quote a Non-Admitted Flood Primary' is 'Yes', and the floor count field accepts only values within the valid range (NB/END) - 09/07/2025

    Given I use "CO_002" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to ""
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to ""
    * I set "Floors_Above_Grade" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify that "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "visible" on page

    When I click "rate" button

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "Basement question - visible and mandatory"

    When I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "No"
    * I fill out HO Flood Coverage page

    Then I rate, bind and initiate new endorsement

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 101 Main Street | Platteville | CO    | 80651 | Homeowner     | 7500000 |           | 10,000 | 2%         |

    Then I navigate to "Platteville CO" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify input field "How many floors does the location have above grade?" is "visible" in "primary flood coverage" block

    When I review changes
    * I review and accept referrals on endorsement if any

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "Floors above grade question - visible and mandatory"

    When I type "0" to "How many floors does the location have above grade?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Value of 0 - acceptable"

    When I type "-1" to "How many floors does the location have above grade?" input field
    * I click save changes button

    Then I verify validation message "The integer \"-1\" is too low, the minimum value is 0." is displayed
    * I take screenshot "Negative value - unacceptable"

    When I type "200" to "How many floors does the location have above grade?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Value of 200 - acceptable"

    When I type "201" to "How many floors does the location have above grade?" input field
    * I click save changes button

    Then I verify validation message "The integer \"201\" is too high, the maximum value is 200." is displayed
    * I take screenshot "Value of 201 - unacceptable"

    When I type "156" to "How many floors does the location have above grade?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Value of 156 - acceptable"

  @TC110134
  Scenario: US57017 - 6. Verify HO CO additional questions are not displayed when 'Quote a Non-Admitted Flood Primary' is 'No' (NB/RNW) - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to ""
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to ""
    * I set "Floors_Above_Grade" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify input field "How many floors does the location have above grade?" is "not visible" in "primary flood coverage" block
    * I take screenshot "Floors above grade question - not visible"

    When I fill out HO Flood Coverage page

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 101 Main Street | Platteville | CO    | 80651 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |

    Then I navigate to "Platteville CO" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify that "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "not visible" on page
    * I take screenshot "Basement question - not visible"

  @TC110135
  Scenario: US57017 - 7. Verify that after HO CO post-PD endorsement, new questions appear and are mandatory when 'Yes', hidden when 'No', and that the floor count field accepts only valid values - 09/06/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to ""
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to ""
    * I set "Floors_Above_Grade" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new endorsement
    * I navigate to "Denver CO" page
    * I click order property details button

    When I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify input field "How many floors does the location have above grade?" is "visible" in "primary flood coverage" block

    When I review changes
    * I review and accept referrals on endorsement if any

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "Floors above grade question - visible and mandatory"

    When I type "0" to "How many floors does the location have above grade?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Value of 0 - acceptable"

    When I type "-3" to "How many floors does the location have above grade?" input field
    * I click save changes button

    Then I verify validation message "The integer \"-3\" is too low, the minimum value is 0." is displayed
    * I take screenshot "Negative value - unacceptable"

    When I type "200" to "How many floors does the location have above grade?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Value of 200 - acceptable"

    When I type "205" to "How many floors does the location have above grade?" input field
    * I click save changes button

    Then I verify validation message "The integer \"205\" is too high, the maximum value is 200." is displayed
    * I take screenshot "Value of 205 - unacceptable"

    When I type "2" to "How many floors does the location have above grade?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Value of 2 - acceptable"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 101 Main Street | Platteville | CO    | 80651 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |

    Then I navigate to "Platteville CO" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify that "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "not visible" on page
    * I take screenshot "Basement question - not visible"

  @TC110136
  Scenario: US57017 - 8. Verify that after HO CO post-PD RNW, the new questions are displayed and mandatory when 'Yes' is selected, and are not displayed when 'No' is selected - 09/07/2024

    Given I use "CO_002" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to ""
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to ""
    * I set "Floors_Above_Grade" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new renewal
    * I navigate to "Denver CO" page
    * I click order property details button

    When I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify that "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" label with "Yes" and "No" radio buttons is "visible" on page
    * I take screenshot "Basement question - visible"

    When I review changes
    * I review and accept referrals on renewal if any

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "Validation message"
    * I choose "Yes" for "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 101 Main Street | Platteville | CO    | 80651 | Homeowner     | 7500000 |           | 10,000 | 2%         |

    Then I navigate to "Platteville CO" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I scroll to the bottom of the page

    Then I verify input field "How many floors does the location have above grade?" is "not visible" in "primary flood coverage" block
    * I take screenshot "Floors above grade question - not visible"