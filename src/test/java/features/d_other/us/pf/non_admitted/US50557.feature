@PrimaryFlood @NonAdmitted @US50557
Feature: PF - Cover page UI - Add Primary Flood Coverage block
  As a Product Manager I would like to make Cover page available for the new Flood Solutions LOB
  so we can start offering this new flood product to our members.

  @TC100393
  Scenario Outline: US50557 - Verify Cover page - Primary Flood Coverage block - "<state>" - 01/01/2025

    # default values changed through US59938, names of the coverages changed through US54149 - covered through TS598
    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown
    # renamed to Is the basement/Do you have.... and covered through TS598
    * I click "No" radio button for label "Does the residence have a basement?"
    * I click save changes button

    Then I verify dropdown "Basement Finish is" is hidden
    * I verify dropdown "Basement Finish Quality is" is hidden
    * I verify input "Total Basement square Footage Area" is hidden

    * I verify block "primary flood coverage" is "visible" on page
    # section renamed to Primary Flood Coverage Limits through US52446
    * I verify section "Selected Primary Flood Limits" is "visible" in "primary flood coverage" block
    * I verify section "Sublimits" is "visible" in "primary flood coverage" block
    * I verify "Dwelling" value "250,000" is displayed in "primary flood coverage" block
    * I verify "Other Structures" with index 1 value "25,000" is displayed in "primary flood coverage" block
    * I verify "Contents" with index 1 value "100,000" is displayed in "primary flood coverage" block
    * I verify "Loss of Use" with index 1 value "50,000" is displayed in "primary flood coverage" block
    * I verify "Deductible" value "5,000" is displayed in "primary flood coverage" block
    * I verify input field "TIV" is read only with value "425,000"

    When I click on the "Deductible" dropdown after scrolling "down"

    Then I verify dropdown size is 8
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |

    * I take screenshot "Deductible dropdown values"
    * I verify "Basement Coverage - Improvements" value "30,000" is displayed in "primary flood coverage" block
    * I verify "Basement Coverage - Contents" value "15,000" is displayed in "primary flood coverage" block
    * I verify "Landscaping" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Hardscapes" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Pools, Hot Tubs, and Spas" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Loss Avoidance" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Debris Removal" value "350,000" is displayed in "primary flood coverage" block
    * I verify "Rebuilding to Code" value "75,000" is displayed in "primary flood coverage" block
    * I verify "Loss Assessments" value "50,000" is displayed in "primary flood coverage" block
    * I take screenshot "Selected primary flood limits and Sublimits sections - No selected for basement"
    * I delete value from "Basement Coverage - Improvements" input field
    * I delete value from "Basement Coverage - Contents" input field

    When I click "Yes" radio button for label "Does the residence have a basement?"
    * I click save changes button

    Then I verify dropdown "Basement Finish is" is displayed
    * I verify dropdown "Basement Finish Quality is" is displayed
    * I verify input "Total Basement square Footage Area" is displayed

    When I click on the "Basement Finish is" dropdown after scrolling "down"

    Then I verify dropdown size is 4
    * I verify dropdown values
      | values                                                |
      | - Select -                                            |
      | Unfinished                                            |
      | Partially finished (<50% of the basement is finished) |
      | Fully finished (>=50% of the basement is finished)    |

    * I take screenshot "Basement Finish is - dropdown values"

    When I click on the "Basement Finish Quality is" dropdown after scrolling "down"

    Then I verify dropdown size is 4
    * I verify dropdown values
      | values                           |
      | - Select -                       |
      | Lower than the rest of the home  |
      | Same as the rest of the home     |
      | Higher than the rest of the home |

    * I verify input "Total Basement square Footage Area" is empty
    * I verify "Dwelling" value "250,000" is displayed in "primary flood coverage" block
    * I verify "Other Structures" with index 1 value "25,000" is displayed in "primary flood coverage" block
    * I verify "Contents" with index 1 value "100,000" is displayed in "primary flood coverage" block
    * I verify "Loss of Use" with index 1 value "50,000" is displayed in "primary flood coverage" block
    * I verify "Deductible" value "5,000" is displayed in "primary flood coverage" block
    * I verify input field "TIV" is read only with value "425,000"

    * I verify "Basement Coverage - Improvements" value "250,000" is displayed in "primary flood coverage" block
    * I verify "Basement Coverage - Contents" value "100,000" is displayed in "primary flood coverage" block
    * I verify "Landscaping" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Hardscapes" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Pools, Hot Tubs, and Spas" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Loss Avoidance" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Debris Removal" value "350,000" is displayed in "primary flood coverage" block
    * I verify "Rebuilding to Code" value "75,000" is displayed in "primary flood coverage" block
    * I verify "Loss Assessments" value "50,000" is displayed in "primary flood coverage" block
    * I take screenshot "Selected primary flood limits and Sublimits sections - Yes selected for basement"

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

#  @TC98548 - previous version
#  Scenario Outline: US50557 - Verify Cover page - Primary Flood Coverage block - "<state>" - 01/01/2025
#
#    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
#
#    * I load random user data
#    * I set "Effective_Date" to "01/01/2025"
#
#    When I am logged in to Pure as "Field"
#    * I initiate a new quote for a new customer
#    * I navigate to "Home Surplus Lines Policy" page
#    * I type "Homeowner" to "Residence Type" dropdown
#    * I click "No" radio button for label "Does the residence have a basement?"
#    * I click save changes button
#
#    Then I verify dropdown "Basement Finish is" is hidden
#    * I verify dropdown "Basement Finish Quality is" is hidden
#    * I verify input "Total Basement square Footage Area" is hidden
#
#    * I verify block "primary flood coverage" is "visible" on page
#    * I verify section "Selected Primary Flood Limits" is "visible" in "primary flood coverage" block
#    * I verify section "Sublimits" is "visible" in "primary flood coverage" block
#    * I verify "Replacement Cost" value "250,000" is displayed in "primary flood coverage" block
#    * I verify "Other Structures" value "25,000" is displayed in "primary flood coverage" block
#    * I verify "Contents" value "100,000" is displayed in "primary flood coverage" block
#    * I verify "Loss of Use" value "50,000" is displayed in "primary flood coverage" block
#    * I verify "Deductible" value "5,000" is displayed in "primary flood coverage" block
#    * I verify input field "TIV" is read only with value "425,000"
#
#    When I click on the "Deductible" dropdown after scrolling "down"
#
#    Then I verify dropdown size is 8
#    * I verify dropdown values
#      | values     |
#      | - Select - |
#      | 500        |
#      | 1,000      |
#      | 2,500      |
#      | 5,000      |
#      | 10,000     |
#      | 25,000     |
#      | 50,000     |
#
#    * I take screenshot "Deductible dropdown values"
#    * I verify "Basement Coverage - Improvements" value "30,000" is displayed in "primary flood coverage" block
#    * I verify "Basement Coverage - Contents" value "15,000" is displayed in "primary flood coverage" block
#    * I verify "Landscaping" value "10,000" is displayed in "primary flood coverage" block
#    * I verify "Hardscapes" value "10,000" is displayed in "primary flood coverage" block
#    * I verify "Pools, Hot Tubs, and Spas" value "10,000" is displayed in "primary flood coverage" block
#    * I verify "Loss Avoidance" value "10,000" is displayed in "primary flood coverage" block
#    * I verify "Debris Removal" value "350,000" is displayed in "primary flood coverage" block
#    * I verify "Rebuilding to Code" value "75,000" is displayed in "primary flood coverage" block
#    * I verify "Loss Assessments" value "50,000" is displayed in "primary flood coverage" block
#    * I take screenshot "Selected primary flood limits and Sublimits sections - No selected for basement"
#    * I delete value from "Basement Coverage - Improvements" input field
#    * I delete value from "Basement Coverage - Contents" input field
#
#    When I click "Yes" radio button for label "Does the residence have a basement?"
#    * I click save changes button
#
#    Then I verify dropdown "Basement Finish is" is displayed
#    * I verify dropdown "Basement Finish Quality is" is displayed
#    * I verify input "Total Basement square Footage Area" is displayed
#
#    When I click on the "Basement Finish is" dropdown after scrolling "down"
#
#    Then I verify dropdown size is 4
#    * I verify dropdown values
#      | values                                                |
#      | - Select -                                            |
#      | Unfinished                                            |
#      | Partially finished (<50% of the basement is finished) |
#      | Fully finished (>=50% of the basement is finished)    |
#
#    * I take screenshot "Basement Finish is - dropdown values"
#
#    When I click on the "Basement Finish Quality is" dropdown after scrolling "down"
#
#    Then I verify dropdown size is 4
#    * I verify dropdown values
#      | values                           |
#      | - Select -                       |
#      | Lower than the rest of the home  |
#      | Same as the rest of the home     |
#      | Higher than the rest of the home |
#
#    * I verify input "Total Basement square Footage Area" is empty
#    * I verify "Replacement Cost" value "250,000" is displayed in "primary flood coverage" block
#    * I verify "Other Structures" value "25,000" is displayed in "primary flood coverage" block
#    * I verify "Contents" value "100,000" is displayed in "primary flood coverage" block
#    * I verify "Loss of Use" value "50,000" is displayed in "primary flood coverage" block
#    * I verify "Deductible" value "5,000" is displayed in "primary flood coverage" block
#    * I verify input field "TIV" is read only with value "425,000"
#
#    * I verify "Basement Coverage - Improvements" value "250,000" is displayed in "primary flood coverage" block
#    * I verify "Basement Coverage - Contents" value "100,000" is displayed in "primary flood coverage" block
#    * I verify "Landscaping" value "10,000" is displayed in "primary flood coverage" block
#    * I verify "Hardscapes" value "10,000" is displayed in "primary flood coverage" block
#    * I verify "Pools, Hot Tubs, and Spas" value "10,000" is displayed in "primary flood coverage" block
#    * I verify "Loss Avoidance" value "10,000" is displayed in "primary flood coverage" block
#    * I verify "Debris Removal" value "350,000" is displayed in "primary flood coverage" block
#    * I verify "Rebuilding to Code" value "75,000" is displayed in "primary flood coverage" block
#    * I verify "Loss Assessments" value "50,000" is displayed in "primary flood coverage" block
#    * I take screenshot "Selected primary flood limits and Sublimits sections - Yes selected for basement"
#
#    Examples:
#      | state  |
#      | NY_001 |
#      | MA_001 |
#      | TX_001 |
#      | GA_001 |
#      | CT_001 |
#      | NJ_001 |
#      | VA_001 |
#      | IL_001 |
#      | CO_001 |
#      | CA_001 |
#      | FL_001 |
#      | LA_001 |
#      | NC_001 |
#      | MO_001 |
#      | AL_001 |
#      | KY_001 |
#      | MS_001 |
#      | AR_001 |