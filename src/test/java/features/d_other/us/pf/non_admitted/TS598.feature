@PrimaryFlood @NonAdmitted @TS598
Feature: FS - Regression - TS598

  @TC103637RO
  Scenario Outline: US54177 - Verify Construction Type field and its values - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    * I click on the "Construction Type" dropdown after scrolling "down"

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

    Examples:
      | state  |
      | MS_001 |

  @TC103609RO
  Scenario Outline: US54177 - Verify Construction Type field and its values - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    When I click on the "Construction Type" dropdown after scrolling "down"

    Then I verify dropdown size is 8
    * I verify dropdown values
      | values                     |
      | - Select -                 |
      | Frame                      |
      | Brick - Veneer             |
      | Brick                      |
      | Fire Resistive             |
      | Masonry                    |
      | Reinforced Poured Concrete |
      | Steel Moment Frame         |

    * I verify following options are not present in the "Construction Type" dropdown
      | values                       |
      | Synthetic Stucco             |
      | Log Home                     |
      | Frame - Stucco/EIFS Covering |

    * I take screenshot "Construction Type dropdown values"

    Examples:
      | state  |
      | CA_001 |

  @TC103595RF
  Scenario Outline: US54177 - Verify Construction Type field and its values - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

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

    Examples:
      | state  |
      | MA_001 |

  @TC103608RF
  Scenario Outline: US54177 - Verify Construction Type field and its values - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    When I click on the "Construction Type" dropdown after scrolling "down"

    Then I verify dropdown size is 9
    * I verify dropdown values
      | values                     |
      | - Select -                 |
      | Frame                      |
      | Brick - Veneer             |
      | Brick                      |
      | Fire Resistive             |
      | Masonry                    |
      | Reinforced Poured Concrete |
      | Log Home                   |
      | Steel Moment Frame         |

    * I verify following options are not present in the "Construction Type" dropdown
      | values                       |
      | Synthetic Stucco             |
      | Frame - Stucco/EIFS Covering |

    * I take screenshot "Construction Type dropdown values"

    Examples:
      | state  |
      | CO_001 |

  @TC100196RO @TC100198RO
  Scenario Outline: US51758 - Verify flood information block and its fields for - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    When I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I take screenshot "Flood information block"

    Examples:
      | state  |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |
#      | NY_001 | not in scope for phase 1
#      | TX_001 | not in scope for phase 1
#      | VA_001 | not in scope for phase 1

  @TC100196RF @TC100198RF
  Scenario Outline: US51758 - Verify flood information block and its fields for - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    When I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify block "flood information" is "visible" on page
    * I verify input field "Flood Zone" is "visible" in "flood information" block
    * I verify read only field "RiskMeter Flood Zone" is "visible" in "flood information" block
    * I take screenshot "Flood information block"

    Examples:
      | state  |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | IL_001 |
      | CO_001 |

  @TC106108RO @TC106113RO
  Scenario Outline: US54149 - Verify question, labels and Current Primary Flood Insurance Carrier dropdown changes - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    When I navigate to "Flood Surplus Lines Policy" page

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

    Examples:
      | state  |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |
#      | NY_001 | not in scope for phase 1
#      | TX_001 | not in scope for phase 1
#      | VA_001 | not in scope for phase 1

  @TC106108RF @TC106113RF
  Scenario Outline: US54149 - Verify question, labels and Current Primary Flood Insurance Carrier dropdown changes - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    When I navigate to "Flood Surplus Lines Policy" page

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

    Examples:
      | state  |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | IL_001 |
      | CO_001 |

  @TC104978RO @TC104980RO @TC104981RO
  Scenario Outline: US54727 - Verify LOB, Underwriting Company and Product Name - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    Then I verify page "Flood Surplus Lines Policy" is "visible" in tree
    * I verify page "Home Surplus Lines Policy" is "not visible" in tree
    * I take screenshot "Flood Surplus Lines Policy visibility"

    When I navigate to "Flood Surplus Lines Policy" page

    Then I verify "Underwriting Company" input 1 has value "National Fire & Marine Insurance Company"
    * I verify "Underwriting Company" value "Flood Underwriting Company" is not displayed in "underwriting company" block
    * I take screenshot "Underwriting Company Name"

    When I rate an FS quote

    Then I verify value "<value>" is "visible" for "Product" field
    * I take screenshot "Premium page - Product name"

    When I navigate to quote summary page

    Then I verify value "<value>" is "visible" for "Product" field
    * I take screenshot "Summary page - Product name"

    Examples:
      | state  | value                                |
      | CA_001 | Flood Surplus Lines - California     |
      | FL_001 | Flood Surplus Lines - Florida        |
      | LA_001 | Flood Surplus Lines - Louisiana      |
      | NC_001 | Flood Surplus Lines - North Carolina |
      | MO_001 | Flood Surplus Lines - Missouri       |
      | AL_001 | Flood Surplus Lines - Alabama        |
      | KY_001 | Flood Surplus Lines - Kentucky       |
      | MS_001 | Flood Surplus Lines - Mississippi    |
      | AR_001 | Flood Surplus Lines - Arkansas       |
#      | NY_001 | Flood Surplus Lines - New York       |not in scope for phase 1
#      | VA_001 | Flood Surplus Lines - Virginia       |not in scope for phase 1
#      | TX_001 | Flood Surplus Lines - Texas          |not in scope for phase 1

  @TC104978RF @TC104980RF @TC104981RF
  Scenario Outline: US54727 - Verify LOB, Underwriting Company and Product Name - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    Then I verify page "Flood Surplus Lines Policy" is "visible" in tree
    * I verify page "Home Surplus Lines Policy" is "not visible" in tree
    * I take screenshot "Flood Surplus Lines Policy visibility"

    When I navigate to "Flood Surplus Lines Policy" page

    Then I verify "Underwriting Company" input 1 has value "National Fire & Marine Insurance Company"
    * I verify "Underwriting Company" value "Flood Underwriting Company" is not displayed in "underwriting company" block
    * I take screenshot "Underwriting Company Name"

    When I rate an FS quote

    Then I verify value "<value>" is "visible" for "Product" field
    * I take screenshot "Premium page - Product name"

    When I navigate to quote summary page

    Then I verify value "<value>" is "visible" for "Product" field
    * I take screenshot "Summary page - Product name"

    Examples:
      | state  | value                               |
      | MA_001 | Flood Surplus Lines - Massachusetts |
      | GA_001 | Flood Surplus Lines - Georgia       |
      | CT_001 | Flood Surplus Lines - Connecticut   |
      | NJ_001 | Flood Surplus Lines - New Jersey    |
      | IL_001 | Flood Surplus Lines - Illinois      |
      | CO_001 | Flood Surplus Lines - Colorado      |

  @TC100456RO
  Scenario Outline: US50516 - Verify Cover page UI and function - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I navigate to quotes detail page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll "up" the page

    Then I verify "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?" is defaulted to "No"
    * I verify "Is this Primary Flood policy replacing existing primary flood coverage?" is defaulted to "No"
    * I take screenshot "Default values"

    When I click "Yes" radio button for label "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?"
    * I click save changes button

    Then I verify question "Is this Primary Flood policy replacing existing primary flood coverage?" with Yes and No answers is hidden in "policy information" block
    * I verify "Term" value "12 Months" is displayed in "policy information" block
    * I verify "Effective Date" value "09/07/2025" is displayed in "policy information" block
    * I verify input field "Expiration Date" is read only with value "09/07/2026"
    * I verify "Named Insured Type" value "Individual" is displayed in "policy information" block

    * I verify "Current Primary Flood Insurance Carrier" value "- Select -" is displayed in "insurance information" block

    * I type "09/07/2026" to "Flood Expiration Date" date field
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
    * I take screenshot "Risk address block"

    Examples:
      | state  |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |
#      | NY_001 | not in scope for phase 1
#      | TX_001 | not in scope for phase 1
#      | VA_001 | not in scope for phase 1

  @TC100456RF
  Scenario Outline: US50516 - Verify Cover page UI and function - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I navigate to quotes detail page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll "up" the page

    Then I verify "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?" is defaulted to "No"
    * I verify "Is this Primary Flood policy replacing existing primary flood coverage?" is defaulted to "No"
    * I take screenshot "Default values"

    When I click "Yes" radio button for label "If issued, will the effective date of this Primary Flood policy match the effective date of a PURE homeowner policy (new business or renewal)?"
    * I click save changes button

    Then I verify question "Is this Primary Flood policy replacing existing primary flood coverage?" with Yes and No answers is hidden in "policy information" block
    * I verify "Term" value "12 Months" is displayed in "policy information" block
    * I verify "Effective Date" value "09/07/2025" is displayed in "policy information" block
    * I verify input field "Expiration Date" is read only with value "09/07/2026"
    * I verify "Named Insured Type" value "Individual" is displayed in "policy information" block

    * I verify "Current Primary Flood Insurance Carrier" value "- Select -" is displayed in "insurance information" block

    * I type "09/07/2026" to "Flood Expiration Date" date field
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
    * I take screenshot "Risk address block"

    Examples:
      | state  |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | IL_001 |
      | CO_001 |

  @TC100393RO
  Scenario Outline: US50557 - Verify Cover page - Primary Flood Coverage block - "<state>"

    # default values changed through US59938, names of the coverages changed through US54149
    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    When I navigate to "Flood Surplus Lines Policy" page
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

    Examples:
      | state  |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |
#      | NY_001 | not in scope for phase 1
#      | TX_001 | not in scope for phase 1
#      | VA_001 | not in scope for phase 1

  @TC100393RF
  Scenario Outline: US50557 - Verify Cover page - Primary Flood Coverage block - "<state>"

    # default values changed through US59938, names of the coverages changed through US54149
    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    When I navigate to "Flood Surplus Lines Policy" page
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

    Examples:
      | state  |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | IL_001 |
      | CO_001 |