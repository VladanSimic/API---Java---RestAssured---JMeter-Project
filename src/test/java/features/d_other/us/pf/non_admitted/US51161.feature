@PrimaryFlood @NonAdmitted @US51161
Feature: FS - NonAdmitted - UI - Cover Page -  Add Primary Flood Block - Condo only
  As a Product Manager I would like to scope in condo and make the cover page available
  for the new Flood Surplus LOB so we can start offering this new flood product to our members.

  @TC101262
  Scenario Outline: US51161 - Verify Primary Flood Coverage block - Primary Flood Coverage Limits Section - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Condo/Co-op" to "Residence Type" dropdown
    * I click "No" radio button for label "Does the residence have a basement?"
    * I click save changes button

    Then I verify block "primary flood coverage" is "visible" on page
    * I verify section "Primary Flood Coverage Limits" is "visible" in "primary flood coverage" block
    * I verify "Contents" with index 1 value "250,000" is displayed in "primary flood coverage" block
    * I verify "Loss of Use" with index 1 value "50,000" is displayed in "primary flood coverage" block
    * I verify "Deductible" value "2,500" is displayed in "primary flood coverage" block
    * I verify input field "TIV" is read only with value "300,000"

    When I click on the "Loss of Use" dropdown after scrolling "down"

    Then I verify dropdown size is 4
    * I verify dropdown values
      | values     |
      | - Select - |
      | 50,000     |
      | 150,000    |
      | 250,000    |
    * I take screenshot "Loss of Use dropdown values"

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

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |

  @TC101263
  Scenario Outline: US51161 - Verify Primary Flood Coverage block - Sublimits Section with basement set to No - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Condo/Co-op" to "Residence Type" dropdown
    * I click "No" radio button for label "Does the residence have a basement?"
    * I click save changes button

    Then I verify section "Sublimits" is "visible" in "primary flood coverage" block
    * I verify "Basement Coverage - Improvements" value "30,000" is displayed in "primary flood coverage" block
    * I verify "Basement Coverage - Contents" value "15,000" is displayed in "primary flood coverage" block
    * I verify "Landscaping" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Hardscapes" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Pools, Hot Tubs, and Spas" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Loss Avoidance" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Debris Removal" value "350,000" is displayed in "primary flood coverage" block
    * I verify "Rebuilding to Code" value "75,000" is displayed in "primary flood coverage" block
    * I verify "Loss Assessments" value "350,000" is displayed in "primary flood coverage" block
    * I scroll to the bottom of the page
    * I take screenshot "Sublimits sections - No selected for basement question"

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |

  @TC101264
  Scenario Outline: US51161 - Verify Primary Flood Coverage block - Sublimits Section with basement set to Yes - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Condo/Co-op" to "Residence Type" dropdown
    * I click "Yes" radio button for label "Does the residence have a basement?"
    * I click save changes button

    Then I verify "Basement Coverage - Improvements" value "250,000" is displayed in "primary flood coverage" block
    * I verify "Basement Coverage - Contents" value "100,000" is displayed in "primary flood coverage" block
    * I verify "Landscaping" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Hardscapes" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Pools, Hot Tubs, and Spas" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Loss Avoidance" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Debris Removal" value "350,000" is displayed in "primary flood coverage" block
    * I verify "Rebuilding to Code" value "75,000" is displayed in "primary flood coverage" block
    * I verify "Loss Assessments" value "350,000" is displayed in "primary flood coverage" block
    * I scroll to the bottom of the page
    * I take screenshot "Sublimits sections - Yes selected for basement question"

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |

  @TC101265
  Scenario Outline: US51161 - Verify Primary Flood Coverage block - Blank and greyed out fields - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Condo/Co-op" to "Residence Type" dropdown
    * I click "No" radio button for label "Does the residence have a basement?"
    * I click save changes button

    Then I verify input field "Dwelling" in "primary flood coverage" block is read only and empty
    * I verify "Other Structures" field with index 1 is read only and empty in "primary flood coverage" block
    * I verify input field "Replacement Cost" in "primary flood coverage" block is read only and empty
    * I verify "Other Structures" field with index 2 is read only and empty in "primary flood coverage" block
    * I scroll to the bottom of the page
    * I take screenshot "Primary flood coverage block - blank and greyed out fields"

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |

  @TC101266
  Scenario Outline: US51161 - Verify that Condo defaulted values are not applied to Homeowner quote - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown
    * I click "No" radio button for label "Does the residence have a basement?"
    * I click save changes button

    Then I verify "Dwelling" value "250,000" is displayed in "primary flood coverage" block
    * I verify "Other Structures" with index 1 value "25,000" is displayed in "primary flood coverage" block
    * I verify "Contents" with index 1 value "100,000" is displayed in "primary flood coverage" block
    * I verify "Deductible" value "5,000" is displayed in "primary flood coverage" block
    * I verify input field "TIV" is read only with value "425,000"
    * I scroll to the bottom of the page
    * I take screenshot "Homeowners - defaulted values"

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |