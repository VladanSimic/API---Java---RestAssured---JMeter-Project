@PrimaryFlood @Admitted @US56586
Feature: Create Workflow - HS to FS

  @HSFromLocationPage
  Scenario Outline: Create Workflow - HS to FS "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HS quote cover page
    * I fill out HS quote basic location coverage details page
    * I fill out HS quote optional coverages page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HS previous claim losses page
    * I fill out HS quote member information page
    * I navigate to location page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | AL_001 |
      | MS_001 |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | CO_001 |

  @NBENDHS
  Scenario Outline: HS location node to FS Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "Manuscript_Endorsements" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_Non_Admitted_PF_Quote" to "No"
    * I set "Policy_Delivery_Option" to "PrintByPure"

    When I am logged in to Pure as "Field"
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
      | state  |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | AL_001 |
      | MS_001 |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | CO_001 |