@PrimaryFlood @Admitted @US55008
Feature: PF Admitted - Update Excess Flood block - UI - IL
  As a product manager, I want to update Excess Flood coverage block placement is consistent on the Flood node with the rest of the states.

  @TC107085
  Scenario: US55008 - 1. Verify that Excess Flood Block is updated (Homeowners/Condo, NB/END) - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for label "Do you wish to include excess flood coverage?"

    Then I verify "Who is providing your underlying primary flood coverage?" label is "visible" in "excess flood" block

    When I click on the "Who is providing your underlying primary flood coverage?" dropdown after scrolling "down"

    Then I verify dropdown size is 5
    * I verify dropdown values
      | values                          |
      | - Select -                      |
      | NFIP                            |
      | PURE Primary Flood Endorsement  |
      | PURE Non-Admitted Primary Flood |
      | Other                           |

    * I take screenshot "Who is providing your underlying primary flood coverage dropdown values"
    * I verify "What Excess Flood coverage limits do you want to purchase?" label is "visible" in "excess flood" block
    * I verify input field "Primary Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Dwelling Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Dwelling Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Dwelling Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Dwelling Options dropdown values"
    * I verify read only field "Excess Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify input field "Primary Flood Contents Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Contents Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Contents Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Contents Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Contents Options dropdown values"
    * I verify read only field "Excess Flood Contents Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Contents Limit" is "visible" in "excess flood" block
    * I verify checkbox is "visible" for label "Manager Excess Flood Override" in "excess flood" block
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block - NB"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"

    When I rate, bind and initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Condo/Co-op   | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for label "Do you wish to include excess flood coverage?"

    Then I verify "Who is providing your underlying primary flood coverage?" label is "visible" in "excess flood" block

    When I click on the "Who is providing your underlying primary flood coverage?" dropdown after scrolling "down"

    Then I verify dropdown size is 5
    * I verify dropdown values
      | values                          |
      | - Select -                      |
      | NFIP                            |
      | PURE Primary Flood Endorsement  |
      | PURE Non-Admitted Primary Flood |
      | Other                           |

    * I take screenshot "Who is providing your underlying primary flood coverage dropdown values"
    * I verify "What Excess Flood coverage limits do you want to purchase?" label is "visible" in "excess flood" block
    * I verify input field "Primary Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Dwelling Limit" label is "visible" in "excess flood" block
#    * I verify input field "Excess Flood Dwelling Options" is read only with value "- Select -"
    * I verify input field "Excess Flood Dwelling Options" is "visible" in "excess flood" block

    * I verify read only field "Excess Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify input field "Primary Flood Contents Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Contents Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Contents Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Contents Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Contents Options dropdown values"
    * I verify read only field "Excess Flood Contents Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Contents Limit" is "visible" in "excess flood" block
    * I verify checkbox is "visible" for label "Manager Excess Flood Override" in "excess flood" block
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block - END"

  @TC107094
  Scenario: US55008 - 2. Verify that Excess Flood Block is updated (Homeowners/Tenants, NB/RNW) - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for label "Do you wish to include excess flood coverage?"

    Then I verify "Who is providing your underlying primary flood coverage?" label is "visible" in "excess flood" block

    When I click on the "Who is providing your underlying primary flood coverage?" dropdown after scrolling "down"

    Then I verify dropdown size is 5
    * I verify dropdown values
      | values                          |
      | - Select -                      |
      | NFIP                            |
      | PURE Primary Flood Endorsement  |
      | PURE Non-Admitted Primary Flood |
      | Other                           |

    * I take screenshot "Who is providing your underlying primary flood coverage dropdown values"
    * I verify "What Excess Flood coverage limits do you want to purchase?" label is "visible" in "excess flood" block
    * I verify input field "Primary Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Dwelling Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Dwelling Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Dwelling Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Dwelling Options dropdown values"
    * I verify read only field "Excess Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify input field "Primary Flood Contents Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Contents Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Contents Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Contents Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Contents Options dropdown values"
    * I verify read only field "Excess Flood Contents Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Contents Limit" is "visible" in "excess flood" block
    * I verify checkbox is "visible" for label "Manager Excess Flood Override" in "excess flood" block
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block - NB"
    * I click "No" radio button for label "Do you wish to include excess flood coverage?"

    When I rate, bind and initiate new renewal
    * I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Tenants       | 7500000 | Unlimited | 10,000 |            |
    * I click order property details button
    * I navigate to "Chicago IL" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for label "Do you wish to include excess flood coverage?"

    Then I verify "Who is providing your underlying primary flood coverage?" label is "visible" in "excess flood" block

    When I click on the "Who is providing your underlying primary flood coverage?" dropdown after scrolling "down"

    Then I verify dropdown size is 5
    * I verify dropdown values
      | values                          |
      | - Select -                      |
      | NFIP                            |
      | PURE Primary Flood Endorsement  |
      | PURE Non-Admitted Primary Flood |
      | Other                           |

    * I take screenshot "Who is providing your underlying primary flood coverage dropdown values"
    * I verify "What Excess Flood coverage limits do you want to purchase?" label is "visible" in "excess flood" block
    * I verify input field "Primary Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Dwelling Limit" label is "visible" in "excess flood" block
#    * I verify input field "Excess Flood Dwelling Options" is read only with value "- Select -"
    * I verify input field "Excess Flood Dwelling Options" is "visible" in "excess flood" block

    * I verify read only field "Excess Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify input field "Primary Flood Contents Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Contents Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Contents Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Contents Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Contents Options dropdown values"
    * I verify read only field "Excess Flood Contents Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Contents Limit" is "visible" in "excess flood" block
    * I verify checkbox is "visible" for label "Manager Excess Flood Override" in "excess flood" block
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block - RNW"

  @TC107095
  Scenario: US55008 - 3. Verify that Excess Flood Block is updated (Homeowners, NB/RNW) - 09/07/2024

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Location page - NB"

    When I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Optional coverages page - NB"

    When I rate, bind and initiate new renewal
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for label "Do you wish to include excess flood coverage?"

    Then I verify "Who is providing your underlying primary flood coverage?" label is "visible" in "excess flood" block

    When I click on the "Who is providing your underlying primary flood coverage?" dropdown after scrolling "down"

    Then I verify dropdown size is 5
    * I verify dropdown values
      | values                          |
      | - Select -                      |
      | NFIP                            |
      | PURE Primary Flood Endorsement  |
      | PURE Non-Admitted Primary Flood |
      | Other                           |

    * I take screenshot "Who is providing your underlying primary flood coverage dropdown values"
    * I verify "What Excess Flood coverage limits do you want to purchase?" label is "visible" in "excess flood" block
    * I verify input field "Primary Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Dwelling Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Dwelling Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Dwelling Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Dwelling Options dropdown values"
    * I verify read only field "Excess Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify input field "Primary Flood Contents Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Contents Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Contents Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Contents Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Contents Options dropdown values"
    * I verify read only field "Excess Flood Contents Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Contents Limit" is "visible" in "excess flood" block
    * I verify checkbox is "visible" for label "Manager Excess Flood Override" in "excess flood" block
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block - RNW"

  @TC107147
  Scenario: US55008 - 4. Verify that Excess Flood Block is updated (Homeowners, NB/END) - 02/08/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "02/08/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Gurnee IL" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Location page - NB"

    When I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Optional coverages page - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for label "Do you wish to include excess flood coverage?"

    Then I verify "Who is providing your underlying primary flood coverage?" label is "visible" in "excess flood" block

    When I click on the "Who is providing your underlying primary flood coverage?" dropdown after scrolling "down"

    Then I verify dropdown size is 5
    * I verify dropdown values
      | values                          |
      | - Select -                      |
      | NFIP                            |
      | PURE Primary Flood Endorsement  |
      | PURE Non-Admitted Primary Flood |
      | Other                           |

    * I take screenshot "Who is providing your underlying primary flood coverage dropdown values"
    * I verify "What Excess Flood coverage limits do you want to purchase?" label is "visible" in "excess flood" block
    * I verify input field "Primary Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Dwelling Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Dwelling Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Dwelling Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Dwelling Options dropdown values"
    * I verify read only field "Excess Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Dwelling Limit" is "visible" in "excess flood" block
    * I verify input field "Primary Flood Contents Limit" is "visible" in "excess flood" block
    * I verify "Primary Flood Contents Limit" label is "visible" in "excess flood" block
    * I verify input field "Excess Flood Contents Options" is "visible" in "excess flood" block

    When I click on the "Excess Flood Contents Options" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values       |
      | - Select -   |
      | 10%          |
      | 25%          |
      | 50%          |
      | 75%          |
      | Full Limits  |
      | Other Limits |

    * I take screenshot "Excess Flood Contents Options dropdown values"
    * I verify read only field "Excess Flood Contents Limit" is "visible" in "excess flood" block
    * I verify read only field "Total Flood Contents Limit" is "visible" in "excess flood" block
    * I verify checkbox is "visible" for label "Manager Excess Flood Override" in "excess flood" block
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block - END"