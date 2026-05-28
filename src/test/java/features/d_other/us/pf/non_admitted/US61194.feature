@PrimaryFlood @NonAdmitted @US61194
Feature: [Continued] Change Request: FS NonAdmitted - Update Defaulting Limits for Loss Assessment - Condo

  Scenario Outline: US61194 - "<state>" - Verify Loss Assessment limit is defaulted to $250,000, and doesn't default to $250,000 after user edits the limits

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no

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

    Then I verify "Loss Assessment" value "250,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment default value - NB"

    When I type "249,000" to "Loss Assessment" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Loss assessment changed value - NB"

    When I rate and bind an FS quote
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    * I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "249,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after bind"

    When I navigate to policy bread crumb
    * I initiate new endorsement
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "248,000" to "Loss Assessment" input field
    * I click save changes button

    Then I scroll to the bottom of the page
    * I take screenshot "Loss assessment changed value - END"

    When I review changes FS
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement
    * I select a transaction "Endorsement"
    * I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "248,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after issuing endorsement"

    @TC115021
    Examples:
      | state  |
      | MA_002 |

    @TC115025
    Examples:
      | state  |
      | GA_002 |

    @TC115026
    Examples:
      | state  |
      | CT_002 |

  Scenario Outline: US61194 - "<state>" - Verify Loss Assessment limit is defaulted to $250,000, and doesn't default to $250,000 after user edits the limits

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    When I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "250,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment default value - NB"

    When I type "249,000" to "Loss Assessment" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Loss assessment changed value - NB"

    When I rate and bind an FS quote
    * I navigate to FS policy
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    * I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "249,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after bind"

    When I navigate to policy bread crumb
    * I initiate new endorsement
    * I navigate to "Flood Surplus Lines Policy" page
    * I type "248,000" to "Loss Assessment" input field
    * I click save changes button

    Then I scroll to the bottom of the page
    * I take screenshot "Loss assessment changed value - END"

    When I review changes FS
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement
    * I select a transaction "Endorsement"
    * I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "248,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after issuing endorsement"

    @TC115027
    Examples:
      | state  |
      | NJ_002 |

    @TC115028
    Examples:
      | state  |
      | IL_002 |

    @TC115037
    Examples:
      | state  |
      | CO_002 |

  Scenario Outline: US61194 - "<state>" - Verify Loss Assessment limit is defaulted to $250,000, and doesn't default to $250,000 after user edits the limits

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
#    * I set "Section_II_Liability" to ""
#    * I set "Optional_Coverages_Liability_Extension_Premises" to ""
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"
    * I set "Sublimit_Basement_Contents" to "10,000"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I navigate to "Optional Coverages" page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    When I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "250,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment default value - NB"

    When I type "249,000" to "Loss Assessment" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Loss assessment changed value - NB"

    When I rate and bind an FS quote
    * I navigate to FS policy
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    * I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "249,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after bind"

    When I navigate to policy bread crumb
    * I initiate new endorsement
    * I navigate to "Flood Surplus Lines Policy" page
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"
    * I type "248,000" to "Loss Assessment" input field
    * I click save changes button

    Then I scroll to the bottom of the page
    * I take screenshot "Loss assessment changed value - END"

    When I review changes FS
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement
    * I select a transaction "Endorsement"
    * I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page

    Then I scroll to the bottom of the page
    * I verify "Loss Assessment" value "248,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after issuing endorsement"

    @TC115038
    Examples:
      | state  |
      | CA_002 |

    @TC115039
    Examples:
      | state  |
      | FL_002 |

    @TC115040
    Examples:
      | state  |
      | LA_002 |

    @TC115041
    Examples:
      | state  |
      | NC_002 |

  Scenario Outline: US61194 - "<state>" - Verify Loss Assessment limit is defaulted to $250,000, and doesn't default to $250,000 after user edits the limits

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"
    * I set "Do_You_Have_Basement_Or_Any_Area_Of_The_Unit" to "No"
    * I set "Sublimit_Basement_Contents" to "10,000"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new renewal
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I navigate to "Optional Coverages" page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    When I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "250,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment default value - NB"

    When I type "249,000" to "Loss Assessment" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Loss assessment changed value - NB"

    When I rate and bind an FS quote
    * I navigate to FS policy
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    * I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "249,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after bind"

    When I navigate to policy bread crumb
    * I set "Effective_Date" to "09/07/2026"

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    When I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I navigate to "Flood Surplus Lines Policy" page
    * I type "248,000" to "Loss Assessment" input field
    * I click save changes button

    Then I scroll to the bottom of the page
    * I take screenshot "Loss assessment changed value - rewrite"

    When I rate a quote
    * I review changes
    * I click ">>> rate" button
    * I click ">>> complete rewrite transaction"
    * I navigate to transactions or endorsements

    Then I select a transaction "New Business Rewrite"

    When I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "248,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after rewrite processing"

    @TC115042
    Examples:
      | state  |
      | MO_002 |

    @TC115044
    Examples:
      | state  |
      | KY_002 |

    @TC115046
    Examples:
      | state  |
      | AR_002 |

  Scenario Outline: US61194 - "<state>" - Verify Loss Assessment limit is defaulted to $250,000, and doesn't default to $250,000 after user edits the limits

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set "Manuscript_Endorsements" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Effective_Date" to "09/07/2025"
    * I set "Would_You_Like_Non_Admitted_PF_Quote" to "No"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Sublimit_Basement_Contents" to "10,000"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to location page
    * I set would you like non admitted primary flood quote to "Yes"
    * I click "No" radio button for label "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?"
    * I click save changes button
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote

    When I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "250,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment default value - NB"

    When I type "249,000" to "Loss Assessment" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "Loss assessment changed value - NB"

    When I rate and bind an FS quote
    * I navigate to FS policy
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    * I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "249,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after bind"

    When I navigate to policy bread crumb
    * I set "Effective_Date" to "09/07/2026"

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    When I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I navigate to "Flood Surplus Lines Policy" page
    * I type "248,000" to "Loss Assessment" input field
    * I click save changes button

    Then I scroll to the bottom of the page
    * I take screenshot "Loss assessment changed value - rewrite"

    When I rate a quote
    * I review changes
    * I click ">>> rate" button
    * I click ">>> complete rewrite transaction"
    * I navigate to transactions or endorsements

    Then I select a transaction "New Business Rewrite"

    When I navigate to policy image page
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I verify "Loss Assessment" value "248,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment changed value after rewrite processing"

    @TC115043
    Examples:
      | state  |
      | AL_002 |

    @TC115045
    Examples:
      | state  |
      | MS_002 |

  Scenario Outline: US61194 - "<state>" - Verify Loss Assessment limit is defaulted to $50,000 - Homeowners

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no

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

    Then I verify "Loss Assessment" value "50,000" is displayed in "primary flood coverage" block
    * I take screenshot "Loss assessment default value - homeowners"

    @TC115047
    Examples:
      | state  |
      | IL_001 |