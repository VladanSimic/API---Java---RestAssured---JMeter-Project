@Flood @Performance @USAppendix
Feature: FS Performance

  Scenario Outline: Scenario 1 - HO optional coverage node to FS New Business - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no

    When I am logged in to Pure as "<user>"
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

    * I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | CA_001 | P100 |
      | FL_001 | P101 |

  Scenario Outline: Scenario 2 - HO flood node to FS New Business - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "<user>"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | MA_001 | P127 |

  Scenario Outline: Scenario 3 - HS location node to FS New Business - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Manuscript_Endorsements" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "<user>"
    * I initiate a new quote for a new customer
    * I fill out HS quote cover page
    * I fill out HS quote basic location coverage details page
    * I fill out HS quote optional coverages page
    * I fill out HS previous claim losses page
    * I fill out HS quote earthquake details page
    * I fill out HS quote wildfire details page
    * I fill out HS quote member information page
    * I navigate to location page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | CA_001 | P145 |
      | FL_001 | P146 |
      | LA_001 | P147 |

  Scenario Outline: Scenario 4 - HO optional coverage node to FS Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I navigate to "Optional Coverages" page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | CA_001 | P190 |

  Scenario Outline: Scenario 5 - HO flood node to FS Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | MA_001 | P208 |

  Scenario Outline: Scenario 6 - HS location node to FS Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "Manuscript_Endorsements" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_Non_Admitted_PF_Quote" to "No"

    When I am logged in to Pure as "<user>"
    * I create a new "HS" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I navigate to location page
    * I set would you like non admitted primary flood quote to "Yes"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I click save changes button
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | CA_001 | P220 |
      | FL_001 | P221 |