@PrimaryFlood @Admitted @US49618
Feature: PF - Admitted - Primary Flood Coverage Block - Function - IL
  As a product manager, I want to make Primary Flood Coverage screen available
  and behave in certain way as we start offering primary flood endorsement to our clients

  @TC105919
  Scenario: US49618 - Verify that when location is eligible question  "Do you want to add the PURE Primary Flood Endorsement?" is mandatory and internal message is displayed “This home is eligible for admitted primary flood coverage.” (NB/END) - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    * I set "Address_Line_1_Txt" to "101 Main Street"
    * I set "City_Name_Txt" to "Evanston"
    * I set "Zip_Code" to "60202"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out all pages except Flood Coverage page
    * I navigate to "Flood Coverage" page

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I verify textbox "Eligibility Response" has value "This home is eligible for admitted primary flood coverage."
    * I verify label "Do you want to add the PURE Primary Flood Endorsement?" is bold
    * I verify label "Eligibility Response" is bold
    * I take screenshot "Endorsement question and eligibility response"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I take screenshot "UW and basement questions"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button
    * I scroll to the bottom of the page

    Then I verify input field "Dwelling & Other Structures (Up to $2M)" is "visible" in "primary flood coverage" block
    * I verify input field "Contents (Up to $1M)" is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 1 is "visible" in "primary flood coverage" block
    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "visible" in "primary flood coverage" block
    * I verify input field "Deductible" is "visible" in "primary flood coverage" block
    * I verify input field "Replacement Cost" is "visible" in "primary flood coverage" block
    * I verify input field "Contents" is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" is "visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" is "visible" in "primary flood coverage" block
    * I take screenshot "Limits visibility"

    When I click "Yes" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I click save changes button

    Then I verify "Basement Improvements Sublimit ($30K - $250K)" value "250,000" is displayed on page
    * I verify "Basement Contents Sublimit ($15K - $100K)" value "100,000" is displayed on page
    * I scroll to the bottom of the page
    * I take screenshot "Basement limits - default values"

    When I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"
    * I click "No" radio button for label "Refer Rate:"

    Then I rate, bind and initiate new endorsement

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 1820 N Delany Rd 510 | Gurnee | IL    | 60031 | Condo/Co-op   | 7500000 |           | 10,000 |            | 1 |
    * I click order property details button
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I take screenshot "Endorsement question - mandatory"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block

    When I click "Yes" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" is defaulted to "No"
    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "not visible" in "primary flood coverage" block
    * I verify input field "Contents (Up to $1M)" is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 1 is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "not visible" in "primary flood coverage" block
    * I verify input field "Deductible" is "not visible" in "primary flood coverage" block
    * I verify input field "Replacement Cost" is "not visible" in "primary flood coverage" block
    * I verify input field "Contents" is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "Other Structures" is "not visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" is "not visible" in "primary flood coverage" block
    * I verify textbox "Eligibility Response" has value "This home is ineligible for admitted primary flood coverage due to its loss history and/or residence elevation."
    * I take screenshot "Limits invisibility and ineligible response"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button

    Then I verify the "Do you want to add the PURE Primary Flood Endorsement?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I take screenshot "Endorsement question - enabled"

  @TC105971
  Scenario: US49618 - Verify that when location is eligible question  "Do you want to add the PURE Primary Flood Endorsement?" is mandatory and internal message is displayed “This home is eligible for admitted primary flood coverage,” and sunken question is No (NB/RNW) - IL_001 - 09/07/2025
    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    * I set "Address_Line_1_Txt" to "101 South Main Street"
    * I set "City_Name_Txt" to "Lombard"
    * I set "Zip_Code" to "60148"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer

    Then I fill out all pages except Flood Coverage page
    * I navigate to "Flood Coverage" page

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I click save changes button

    Then I verify input field "Basement Improvements Sublimit ($30K - $250K)" is read only with value "0"
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is read only with value "0"
    * I scroll to the bottom of the page
    * I take screenshot "Basement limits - default values"

    When I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for distant label "Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"
    * I click "No" radio button for label "Refer Rate:"

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 1820 N Delany Rd 510 | Gurnee | IL    | 60031 | Homeowner     | 7500000 |           | 10,000 |            | 1 |
    * I click order property details button
    * I navigate to "Gurnee IL" page

    Then I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" label with "Yes" and "No" radio buttons is "not visible" in "primary flood coverage" block
    * I take screenshot "Basement question - not visible"

  @TC105972
  Scenario: US49618 - Verify that when location is eligible question  "Do you want to add the PURE Primary Flood Endorsement?" is mandatory and internal message is displayed “This home is eligible for admitted primary flood coverage.” Tenants (NB/RNW) - IL_003 - 09/07/2025

    Given I use "IL_003" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    * I set "Address_Line_1_Txt" to "101 Main Street"
    * I set "City_Name_Txt" to "Park Forest"
    * I set "Zip_Code" to "60466"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out all pages except Flood Coverage page
    * I navigate to "Flood Coverage" page

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I verify textbox "Eligibility Response" has value "This home is eligible for admitted primary flood coverage."
    * I take screenshot "Eligibility response"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I take screenshot "UW questions visibility"

    When I click "Yes" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" is defaulted to "No"
    * I verify the "Do you want to add the PURE Primary Flood Endorsement?" question with yes and no radio buttons is "disabled" in "primary flood coverage" block
    * I verify textbox "Eligibility Response" has value "This home is ineligible for admitted primary flood coverage due to its loss history and/or residence elevation."
    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "not visible" in "primary flood coverage" block
    * I verify input field "Contents (Up to $1M)" is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 1 is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "not visible" in "primary flood coverage" block
    * I verify input field "Deductible" is "not visible" in "primary flood coverage" block
    * I verify input field "Replacement Cost" is "not visible" in "primary flood coverage" block
    * I verify input field "Contents" is "not visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 2 is "not visible" in "primary flood coverage" block
    * I verify input field "Other Structures" is "not visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" is "not visible" in "primary flood coverage" block
    * I take screenshot "Endorsement question, eligibility response and limits"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button

    Then I verify the "Do you want to add the PURE Primary Flood Endorsement?" question with yes and no radio buttons is "not disabled" in "primary flood coverage" block
    * I take screenshot "Endorsement question enabled"

    When I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"
    * I click "No" radio button for label "Refer Rate:"

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 101 Main Street | West Chicago | IL    | 60185 | Tenants       | 7500000 |           | 10,000 |            | 1 |
    * I click order property details button
    * I navigate to "West Chicago IL" page
    * I navigate to "Flood Coverage" page

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "mandatory"
    * I verify textbox "Eligibility Response" has value "This home is eligible for admitted primary flood coverage."
    * I take screenshot "Endorsement question and eligibility response"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I take screenshot "UW questions - visibility"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button

    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "visible" in "primary flood coverage" block
    * I verify input field "Contents (Up to $1M)" is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 1 is "visible" in "primary flood coverage" block
    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "visible" in "primary flood coverage" block
    * I verify input field "Deductible" is "visible" in "primary flood coverage" block
    * I verify input field "Replacement Cost" is "visible" in "primary flood coverage" block
    * I verify input field "Contents" is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" is "visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" is "visible" in "primary flood coverage" block
    * I scroll to the bottom of the page
    * I take screenshot "Limits visibility"

  @TC104997
  Scenario: US49618 - Verify Flood Coverage function for inforce renewals (NB/RNW) - IL_001 - 09/07/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    * I set "Address_Line_1_Txt" to "1820 N Delany Rd 510"
    * I set "City_Name_Txt" to "Gurnee"
    * I set "Zip_Code" to "60031"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new renewal

    When I navigate to "Gurnee IL" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    Then I verify textbox "Eligibility Response" has value "This home is eligible for admitted primary flood coverage."
    * I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "not mandatory"
    * I take screenshot "Eligibility response"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify the "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I verify the "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" label with "Yes" and "No" radio buttons is "visible" in "primary flood coverage" block
    * I take screenshot "UW questions - visibility"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click save changes button

    * I verify input field "Dwelling & Other Structures (Up to $2M)" is "visible" in "primary flood coverage" block
    * I verify input field "Contents (Up to $1M)" is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 1 is "visible" in "primary flood coverage" block
    * I verify input field "Basement Improvements Sublimit ($30K - $250K)" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Contents Sublimit ($15K - $100K)" is "visible" in "primary flood coverage" block
    * I verify input field "Deductible" is "visible" in "primary flood coverage" block
    * I verify input field "Replacement Cost" is "visible" in "primary flood coverage" block
    * I verify input field "Contents" is "visible" in "primary flood coverage" block
    * I verify input field "Loss of Use" with index 2 is "visible" in "primary flood coverage" block
    * I verify input field "Other Structures" is "visible" in "primary flood coverage" block
    * I verify input field "AOP Deductible" is "visible" in "primary flood coverage" block
    * I scroll to the bottom of the page
    * I take screenshot "Limits visibility"