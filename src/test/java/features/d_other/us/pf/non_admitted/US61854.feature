@PrimaryFlood @US61854
Feature: FS - Turning on VA - QA Test Only 10/19/2025

  #FS Scenarios added 09/29 by Milan and Diana

  @TC118446 @FS #TC103593
  Scenario: TC118446 - Verify Construction Type field and its values - VA_001 - 10/19/2025

    Given I use "VA_001" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HO" quote
    * I rate and bind an FS quote
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    Then I navigate to "Flood Surplus Lines Policy" page

    When I click on the "Construction Type" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values                     |
      | - Select -                 |
      | Frame                      |
      | Brick - Veneer             |
      | Brick                      |
      | Fire Resistive             |
      | Masonry                    |
      | Reinforced Poured Concrete |

    * I verify following options are not present in the "Construction Type" dropdown
      | values                       |
      | Steel Moment Frame           |
      | Synthetic Stucco             |
      | Log Home                     |
      | Frame - Stucco/EIFS Covering |

    * I take screenshot "Construction Type dropdown values"

  @TC118512 @FS #TC100393
  Scenario: TC118512 - Verify Cover page - Primary Flood Coverage block - VA_001 - 10/19/2025

    # default values changed through US59938, names of the coverages changed through US54149 - covered through TS598
    Given I use "VA_001" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"
    * I set "Endorsement_Effective_Date_END" to "10/20/2025"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HO" quote
    * I rate and bind an FS quote
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to "Flood Surplus Lines Policy" page
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I click save changes button

    Then I verify dropdown "Basement Finish is" is hidden
    * I verify dropdown "Basement Finish Quality is" is hidden
    * I verify input "Total Basement square Footage Area" is hidden

    * I verify block "primary flood coverage" is "visible" on page
    * I verify section "Primary Flood Coverage Limits" is "visible" in "primary flood coverage" block
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
    * I verify "Basement Improvements" value "0" is displayed in "primary flood coverage" block
    * I verify "Basement Contents" value "0" is displayed in "primary flood coverage" block
    * I verify "Landscaping" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Hardscapes" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Pools, Hot Tubs, and Spas" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Loss Avoidance" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Debris Removal" value "350,000" is displayed in "primary flood coverage" block
    * I verify "Rebuilding to Code" value "75,000" is displayed in "primary flood coverage" block
    * I verify "Loss Assessment" value "50,000" is displayed in "primary flood coverage" block
    * I take screenshot "Selected primary flood limits and Sublimits sections - No selected for basement"

    When I click "Yes" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I delete value from "Basement Improvements" input field
    * I delete value from "Basement Contents" input field
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

    * I verify "Basement Improvements" value "250,000" is displayed in "primary flood coverage" block
    * I verify "Basement Contents" value "100,000" is displayed in "primary flood coverage" block
    * I verify "Landscaping" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Hardscapes" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Pools, Hot Tubs, and Spas" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Loss Avoidance" value "10,000" is displayed in "primary flood coverage" block
    * I verify "Debris Removal" value "350,000" is displayed in "primary flood coverage" block
    * I verify "Rebuilding to Code" value "75,000" is displayed in "primary flood coverage" block
    * I verify "Loss Assessment" value "50,000" is displayed in "primary flood coverage" block
    * I take screenshot "Selected primary flood limits and Sublimits sections - Yes selected for basement"

  @TC118522 @FS #TC100455
  Scenario: TC118522 - Verify Cover page blocks and cells for - VA_001 - 10/19/2025

    Given I use "VA_001" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HO" quote
    * I navigate to "Flood Surplus Lines Policy" page

    Then I verify block "policy information" is "visible" on page
#  * I verify the "Is this Primary Flood policy being quoted concurrently with a PURE or PURE Programs new business policy or renewal offer?" label with "Yes" and "No" radio buttons is "visible" in "policy information" block
    # replaced with below question US54727
    * I verify the "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?" label with "Yes" and "No" radio buttons is "visible" in "policy information" block
    * I verify the "Is this Primary Flood policy replacing existing primary flood coverage?" label with "Yes" and "No" radio buttons is "visible" in "policy information" block
    * I verify checkbox "Does or will the member insure the balance of their account with PURE?" is "not visible" on page

    * I verify block "insurance information" is "visible" on page
    * I verify input field "Current Primary Flood Insurance Carrier" is "visible" in "insurance information" block
    * I verify input field "Flood Expiration Date" is "visible" in "insurance information" block
    * I click on the "Current Primary Flood Insurance Carrier" dropdown after scrolling "up"
    * I verify dropdown size is 12
    * I verify dropdown values
      | values      |
      | - Select -  |
      | NFIP        |
      | PURE        |
      | Neptune     |
      | Chubb       |
      | Berkley One |
      | Cincinnati  |
      | AIG         |
      | AON         |
      | Selective   |
      | Not Insured |
      | Other       |

    * I verify following options are not present in the "Current Primary Flood Insurance Carrier" dropdown
      | values      |
      | Undisclosed |

    When I type "Other" to "Current Primary Flood Insurance Carrier" dropdown
    * I click save changes button
    * I scroll "up" the page

    Then I verify input field "Carrier Name" is "visible" in "insurance information" block
    * I verify block "underwriting company" is "visible" on page
    * I verify input field "Underwriting Company" is "visible" in "underwriting company" block

    * I verify block "credit score/ tiers" is "not visible" on page

    * I verify block "named insured" is "visible" on page
    * I take screenshot "Policy and insurance information, Underwriting Company and Named Insured"
    * I scroll "down" the page

    * I verify block "risk address" is "visible" on page
    * I verify input field "Named Storm Deductible" is "not visible" in "risk address" block
    * I verify input field "Hail Deductible" is "not visible" in "risk address" block
    * I verify checkbox is "not visible" for label "Hail Deductible UW Override" in "risk address" block
    * I verify that "FAC Reinsurance Required?" label with "Yes" and "No" radio buttons is "not visible" on page

    * I verify block "liability coverages" is "not visible" on page

    * I take screenshot "Risk address and liability coverage"

  @TC118523 @FS #TC100456
  Scenario: TC118523 - Verify Cover page UI and function - VA_001 - 10/19/2025

    Given I use "VA_001" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "10/19/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new FS quote from new "HO" quote
    * I navigate to quotes detail page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll "up" the page

#    Then I verify "Is this Primary Flood policy being quoted concurrently with a PURE or PURE Programs new business policy or renewal offer?" is defaulted to "No"
  #    replaced with question below - US54727
    Then I verify "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?" is defaulted to "No"
    * I verify "Is this Primary Flood policy replacing existing primary flood coverage?" is defaulted to "No"
    * I take screenshot "Default values"

    When I click "Yes" radio button for label "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?"
    * I click save changes button

    Then I verify question "Is this Primary Flood policy replacing existing primary flood coverage?" with Yes and No answers is hidden in "policy information" block
    * I verify "Term" value "12 Months" is displayed in "policy information" block
    * I verify "Effective Date" value "10/19/2025" is displayed in "policy information" block
    * I verify input field "Expiration Date" is read only with value "10/19/2026"
    * I verify "Named Insured Type" value "Individual" is displayed in "policy information" block

    * I verify "Current Primary Flood Insurance Carrier" value "- Select -" is displayed in "insurance information" block

    # dropdown values changed through US54727 - covered through TS598
    When I click on the "Current Primary Flood Insurance Carrier" dropdown after scrolling "up"

    Then I verify dropdown size is 12
    * I verify dropdown values
      | values      |
      | - Select -  |
      | NFIP        |
      | PURE        |
      | Neptune     |
      | Chubb       |
      | Berkley One |
      | Cincinnati  |
      | AIG         |
      | AON         |
      | Selective   |
      | Not Insured |
      | Other       |

    * I verify following options are not present in the "Current Primary Flood Insurance Carrier" dropdown
      | values      |
      | Undisclosed |

    * I type "01/01/2026" to "Flood Expiration Date" date field
    * I verify input field "Current Premium" is empty
    * I verify input field "Underwriting Company" is read-only in "underwriting company" block

    * I get text from row 1 cell 1 in "named insured" block and verify "Named Insured" field has a value
    * I get text from row 1 cell 3 in "named insured" block and verify "First Name" field has a value
    * I get text from row 1 cell 5 in "named insured" block and verify "Last Name" field has a value
    * I take screenshot "Policy and Insurance Information, Underwriting Company and Named Insured"
    * I scroll "down" the page

    * I verify input field "Address Line 1" in "risk address" block is read only and has value
    * I verify input field "City" in "risk address" block is read only and has value
    * I verify input field "State" in "risk address" block is read only and has value
    * I verify input field "ZIP" in "risk address" block is read only and has value
    * I scroll "down" the page
    * I take screenshot "Risk address block"

  @TC118565 @FS #TC100196
  Scenario: TC118565 - Verify that flood information block is added to the Cover Page for - VA_001 - 10/19/2025

    Given I use "VA_001" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "10/19/2025"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HO" quote
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "Homeowner" to "Residence Type" dropdown

    Then I verify block "flood information" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Flood information block visibility"

  @TC118642 @FS #TC106108
  Scenario: TC118642 - Verify question, labels and Current Primary Flood Insurance Carrier dropdown changes - VA_001 - 10/19/2025

    Given I use "VA_001" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "10/19/2025"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HO" quote
    * I navigate to "Flood Surplus Lines Policy" page

    Then I verify the "Is this Primary Flood policy being quoted concurrently with a PURE or PURE Programs new business policy or renewal offer?" label with "Yes" and "No" radio buttons is "not visible" in "policy information" block
    * I verify the "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?" label with "Yes" and "No" radio buttons is "visible" in "policy information" block
    * I scroll "up" the page
    * I take screenshot "Verifying question change in Policy Information block"

    When I click on the "Current Primary Flood Insurance Carrier" dropdown after scrolling "up"

    Then I verify dropdown size is 12
    * I verify dropdown values
      | values      |
      | - Select -  |
      | NFIP        |
      | PURE        |
      | Neptune     |
      | Chubb       |
      | Berkley One |
      | Cincinnati  |
      | AIG         |
      | AON         |
      | Selective   |
      | Not Insured |
      | Other       |

    * I verify following options are not present in the "Current Primary Flood Insurance Carrier" dropdown
      | values      |
      | Undisclosed |

    * I take screenshot "Current Primary Flood Insurance Carrier dropdown values"

    When I scroll to the bottom of the page

    Then I verify input field "Basement Coverage - Improvements" is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Improvements" is "visible" in "primary flood coverage" block
    * I verify input field "Basement Coverage - Contents" is "not visible" in "primary flood coverage" block
    * I verify input field "Basement Contents" is "visible" in "primary flood coverage" block
    * I verify input field "Loss Assessments" is "not visible" in "primary flood coverage" block
    * I verify input field "Loss Assessment" is "visible" in "primary flood coverage" block
    * I take screenshot "Primary flood coverage and flood information blocks - renamed labels and position"