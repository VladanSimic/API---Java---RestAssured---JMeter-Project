@PrimaryFlood @Admitted @US53557
Feature: Change Request: PF - Admitted Update Primary Flood Display on Premium Summary Screen - IL & CO

  @TC105506
  Scenario: US53557 - Verify Primary Flood Endorsement coverage limits, deductibles and premium details are displayed in the "Optional Coverages" section of the Premium Summary Screen.(NB Home/END Condo) - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
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
#    * I check checkbox "Manager Primary Flood Override"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    * I click "No" radio button for label "Would you like to quote Non-Admitted Primary Flood"

    Then I verify "Dwelling & Other Structures (Up to $2M)" input "1" has value "250,000"
    * I verify "Contents (Up to $1M)" input "1" has value "100,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - NB"

    When I click save changes button
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I verify coverage "Dwelling & Other Structures" 1 on premium details is "250,000"
    * I verify coverage "Contents" 2 on premium details is "100,000"
    * I verify coverage "Loss of Use" 2 on premium details is "250,000"
    * I take screenshot "Premium summary - NB"

    When I navigate to quotes detail page
    * I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 1820 N Delany Rd 510 | Gurnee | IL    | 60031 | Condo/Co-op   | 7500000 |           | 10,000 |            | 1 |
    * I click order property details button
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page

    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"
    * I click "No" radio button for label "Would you like to quote Non-Admitted Primary Flood"

    Then I verify "Contents (Up to $1M)" input "1" has value "250,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - END"

    When I click save changes button
    * I review changes
    * I rate an endorsement

    Then I verify coverage "Contents" 4 on premium details is "250,000" on end
    * I verify coverage "Loss of Use" 4 on premium details is "250,000" on end
    * I take screenshot "Premium summary - END"

  @TC105514
  Scenario: US53557 - Verify Primary Flood Endorsement coverage limits, deductibles and premium details are displayed in the "Optional Coverages" section of the Premium Summary Screen.(NB Home/END Condo) - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out all pages except Flood Coverage page
    * I navigate to "Flood Coverage" page
#    * I check checkbox "Manager Primary Flood Override"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    * I click "No" radio button for label "Would you like to quote Non-Admitted Primary Flood"

    Then I verify "Dwelling & Other Structures (Up to $2M)" input "1" has value "250,000"
    * I verify "Contents (Up to $1M)" input "1" has value "100,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - NB"

    When I click save changes button
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I verify coverage "Dwelling & Other Structures" 1 on premium details is "250,000"
    * I verify coverage "Contents" 2 on premium details is "100,000"
    * I verify coverage "Loss of Use" 2 on premium details is "250,000"
    * I take screenshot "Premium summary - NB"

    When I navigate to quotes detail page
    * I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         | 1 |
    * I click order property details button
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page

    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    * I click "No" radio button for label "Would you like to quote Non-Admitted Primary Flood"

    Then I verify "Contents (Up to $1M)" input "1" has value "250,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - END"

    When I click save changes button
    * I review changes
    * I rate an endorsement

    Then I verify coverage "Contents" 4 on premium details is "100,000" on end
    * I verify coverage "Loss of Use" 4 on premium details is "250,000" on end
    * I take screenshot "Premium summary - END"

  @TC105507
  Scenario: US53557 - Verify Primary Flood Endorsement coverage limits, deductibles and premium details are displayed in the "Optional Coverages" section of the Premium Summary Screen.(NB Home/RNWL Tenants) - IL_001 - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
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
#    * I check checkbox "Manager Primary Flood Override"
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    * I click "No" radio button for label "Would you like to quote Non-Admitted Primary Flood"

    Then I verify "Dwelling & Other Structures (Up to $2M)" input "1" has value "250,000"
    * I verify "Contents (Up to $1M)" input "1" has value "100,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - NB"

    When I click save changes button
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I verify coverage "Dwelling & Other Structures" 1 on premium details is "250,000"
    * I verify coverage "Contents" 2 on premium details is "100,000"
    * I verify coverage "Loss of Use" 2 on premium details is "250,000"
    * I take screenshot "Premium summary - NB"

    When I navigate to quotes detail page
    * I rate, bind and initiate new renewal
    * I set "Construction_Type" to "Frame"
    * I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 1820 N Delany Rd 510 | Gurnee | IL    | 60031 | Tenants       | 7500000 |           | 10,000 |            | 1 |
    * I click order property details button
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify "Contents (Up to $1M)" input "1" has value "250,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - RNW"

    When I click save changes button
    * I review changes
    * I click renewed premium

    Then I verify coverage "Contents" 4 on premium details is "100,000" on end
    * I verify coverage "Loss of Use" 4 on premium details is "250,000" on end
    * I take screenshot "Premium summary - RNW"

  @TC105515
  Scenario: US53557 - Verify Primary Flood Endorsement coverage limits, deductibles and premium details are displayed in the "Optional Coverages" section of the Premium Summary Screen.(NB Home/RNWL Tenants) - CO_001 - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out all pages except Flood Coverage page
    * I navigate to "Flood Coverage" page
#    * I check checkbox "Manager Primary Flood Override"
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"

    * I click "No" radio button for label "Would you like to quote Non-Admitted Primary Flood"

    Then I verify "Dwelling & Other Structures (Up to $2M)" input "1" has value "250,000"
    * I verify "Contents (Up to $1M)" input "1" has value "100,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - NB"

    When I click save changes button
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I verify coverage "Dwelling & Other Structures" 1 on premium details is "250,000"
    * I verify coverage "Contents" 2 on premium details is "100,000"
    * I verify coverage "Loss of Use" 2 on premium details is "250,000"
    * I take screenshot "Premium summary - NB"

    When I navigate to quotes detail page
    * I rate, bind and initiate new renewal
    * I set "Construction_Type" to "Frame"
    * I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Tenants       | 7500000 |           | 10,000 | 2%         | 1 |
    * I click order property details button
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify "Contents (Up to $1M)" input "1" has value "250,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - RNW"

    When I click save changes button
    * I review changes
    * I click renewed premium

    Then I verify coverage "Contents" 4 on premium details is "100,000" on end
    * I verify coverage "Loss of Use" 4 on premium details is "250,000" on end
    * I take screenshot "Premium summary - RNW"

  @TC105528
  Scenario: US53557 - Verify that Primary Flood Endorsement coverage limits, deductibles and premium details are not displayed in the "Optional Coverages" section of the Premium Summary Screen before 09/07/2025.(NB/END/RNWL) - IL_001 - 02/08/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "02/08/2024"
    * I set "Endorsement_Effective_Date_END" to "02/09/2024"
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
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I verify coverage "Primary Flood" 1 on premium details is "not visible"

    When I navigate to quotes detail page
    * I rate, bind and initiate new endorsement
    * I review changes
    * I rate an endorsement

    Then I verify coverage "Primary Flood" 1 on premium details is "not visible" on end

    When I issue an endorsement
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I review changes
    * I click renewed premium

    Then I verify coverage "Primary Flood" 1 on premium details is "not visible" on rnw

  @TC105529
  Scenario: US53557 - Verify that Primary Flood Endorsement coverage limits, deductibles and premium details are not displayed in the "Optional Coverages" section of the Premium Summary Screen before 09/07/2025.(NB/END/RNWL) - CO_001 - 02/08/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "02/08/2024"
    * I set "Endorsement_Effective_Date_END" to "02/09/2024"
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I verify coverage "Primary Flood" 1 on premium details is "not visible"

    * I navigate to quotes detail page
    * I rate, bind and initiate new endorsement
    * I review changes
    * I rate an endorsement

    Then I verify coverage "Primary Flood" 1 on premium details is "not visible" on end

    When I issue an endorsement
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I review changes
    * I click renewed premium

    Then I verify coverage "Primary Flood" 1 on premium details is "not visible" on rnw

  @TC105530
  Scenario: US53557 - Verify that Primary Flood Endorsement coverage limits, deductibles and premium details are not displayed in the "Optional Coverages" section of the Premium Summary Screen before 09/07/2025 for NB, and visible on the RNWL after 09/07/2025 - IL_001 - 09/06/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
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
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I verify coverage "Primary Flood" 1 on premium details is "not visible"
    * I take screenshot "Premium summary - NB"

    When I navigate to quotes detail page
    * I rate, bind and initiate new renewal
    * I set "Construction_Type" to "Frame"
    * I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 1820 N Delany Rd 510 | Gurnee | IL    | 60031 | Tenants       | 7500000 |           | 10,000 |            | 1 |
    * I click order property details button
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page
    * I click "No" radio button for label "Does this location have a PURE NFIP Flood policy with maximum limits?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify "Contents (Up to $1M)" input "1" has value "250,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - RNW"

    When I click save changes button
    * I review changes
    * I click renewed premium

    Then I verify coverage "Contents" 3 on premium details is "250,000" on rnw
    * I verify coverage "Loss of Use" 3 on premium details is "250,000" on rnw
    * I take screenshot "Premium summary - RNW"

  @TC105531
  Scenario: US53557 - Verify that Primary Flood Endorsement coverage limits, deductibles and premium details are not displayed in the "Optional Coverages" section of the Premium Summary Screen before 09/07/2025 for NB, and visible on the END after 09/07/2025 - CO_001 - 09/06/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I verify coverage "Primary Flood" 1 on premium details is "not visible"
    * I take screenshot "Premium summary - NB"

    When I navigate to quotes detail page
    * I rate, bind and initiate new endorsement
    * I set "Construction_Type" to "Frame"
    * I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         | 1 |
    * I click order property details button
    * I navigate to "Gurnee IL" page
    * I navigate to "Flood Coverage" page
    * I click "No" radio button for label "Does the location have a PURE NFIP Flood Policy?"
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"

    Then I verify "Contents (Up to $1M)" input "1" has value "250,000"
    * I verify "Primary Flood Coverage Limits" "Loss of Use" input "1" has value "250,000"
    * I take screenshot "Primary Flood deductibles - END"

    When I click save changes button
    * I review changes
    * I rate an endorsement

    Then I verify coverage "Contents" 3 on premium details is "250,000" on end
    * I verify coverage "Loss of Use" 3 on premium details is "250,000" on end
    * I take screenshot "Premium summary - END"