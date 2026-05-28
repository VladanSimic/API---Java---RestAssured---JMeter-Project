@PrimaryFlood @PFHS @US57014
Feature: Change Request: HS Update Rule for New Elevation Certificate - NC
  As a product manager, I want to "elevation certificate" page to be updated on the HS LOB

  @TC110336
  Scenario: US57014 - 1. Verify new questions are optional to rate and mandatory to bind for new HS NC policies, and mandatory to rate for added risk locations on existing policies (NB/END) - 09/07/2025

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"
    * I set "Elevation_Certificate_Lowest_Adjacent_Finished_Grade" to ""
    * I set "Elevation_Certificate_Highest_Adjacent_Finished_Grade" to ""
    * I set "Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions (rate) - NB"

    When I fill out HS quote elevation certificate details page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I scroll to the bottom of the page

    Then I take screenshot "Elevation questions"
    * I type "1" to "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I type "1" to "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I type "1" to "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field

    When I rate, bind and initiate new endorsement
    * I navigate to "Elevation Certificate" page

    * I delete value from "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I delete value from "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I delete value from "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions - END"

  @TC110337
  Scenario: US57014 - 2. Verify new questions are optional to rate and mandatory to bind for new HS NC policies, and mandatory for added risk locations on existing ones (NB/RNW) - 09/07/2025

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Manual_Subjectivities" to ""
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"
    * I set "Elevation_Certificate_Lowest_Adjacent_Finished_Grade" to ""
    * I set "Elevation_Certificate_Highest_Adjacent_Finished_Grade" to ""
    * I set "Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button

    When I navigate to "Elevation Certificate" page
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions (rate) - NB"

    When I fill out HS quote elevation certificate details page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I scroll to the bottom of the page

    Then I take screenshot "Elevation questions"
    * I type "1" to "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I type "1" to "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I type "1" to "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field

    When I rate, bind and initiate new renewal
    * I navigate to "Elevation Certificate" page

    * I delete value from "f) Lowest adjacent (finished) grade next to building (LAG)?" input field
    * I delete value from "g) Highest adjacent (finished) grade next to building (HAG)?" input field
    * I delete value from "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions - RNW"

  @TC110338
  Scenario: US57014 - 3. Verify new questions are not mandatory to rate existing locations on Endorsements after NB PD Filing date for HS NC (NB/END) - 09/06/2025

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button
    * I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new endorsement
    * I navigate to "Elevation Certificate" page
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions - END"

  @TC110339
  Scenario: US57014 - 4. Verify new questions are not mandatory to rate existing locations on Renewal after the RNW PD filing date for HS NC (NB/RNW) - 09/07/2024

    Given I use "NC_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "650"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Durham NC" page

    Then I click "Manager Flood Zone override" checkbox in "flood information" block
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I click "No" radio button for label "Is the home in CBRA Zone?"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "No" radio button for label "Do you purchase an NFIP policy with maximum limits?"
    * I click save changes button
    * I fill out HS quote elevation certificate details page

    When I rate, bind and initiate new renewal
    * I navigate to "Elevation Certificate" page
    * I scroll to the bottom of the page

    Then I verify "f) Lowest adjacent (finished) grade next to building (LAG)?" field is "not mandatory"
    * I verify "g) Highest adjacent (finished) grade next to building (HAG)?" field is "not mandatory"
    * I verify "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" field is "not mandatory"
    * I take screenshot "Elevation not mandatory questions - RNW"