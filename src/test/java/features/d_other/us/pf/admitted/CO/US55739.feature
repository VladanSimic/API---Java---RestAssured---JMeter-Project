@PrimaryFlood @Admitted @US55739
Feature: PF Admitted - Update Excess Flood block - UI - CO
  As a product manager, I want to update Excess Flood coverage block placement is consistent on the Flood node with the rest of the states.

  @TC108422
  Scenario: US55739 - 1. Verify that Excess Flood Block is updated (Homeowners/Condo, NB/END) - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
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
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for label "Do you wish to include excess flood coverage?"
    * I click save changes button

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

  @TC108423
  Scenario: US55739 - 2. Verify that Excess Flood Block is updated (Homeowners/Tenants, NB/RNW) - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
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
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 7490 Devinney Ct | Arvada | CO    | 80005 | Tenants       | 7500000 | Unlimited | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Arvada CO" page
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

  @TC108424
  Scenario: US55739 - 3. Verify that Excess Flood Block is updated (Homeowners, NB/RNW) - 09/07/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
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

  @TC108425
  Scenario: US55739 - 4. Verify that Excess Flood Block is updated (Homeowners, NB/END) - 02/08/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "02/08/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Wheat Ridge CO" page

    Then I verify block "excess flood" is "visible" on page
    * I scroll to the bottom of the page
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