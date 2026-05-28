@PrimaryFlood @Admitted @US57702
Feature: Create Workflow - HO to FS

  @FromFloodCoveragePage
  Scenario Outline: Create Workflow - HO to FS - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
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
      | state  |
      | CO_001 |
      | GA_001 |
      | CT_001 |
      | MA_001 |
      | NJ_001 |
      | IL_001 |

  @FromOptionalCoveragesPage
  Scenario Outline: Create Workflow - HO to FS - "<state>"

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
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
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
      | KY_001 |
      | MS_001 |
      | AR_001 |
      | MO_001 |

  @NBENDOptionalCoverages
  Scenario Outline: HO optional coverage node to FS Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"
    * I set "Policy_Delivery_Option" to "PrintByPure"

    When I am logged in to Pure as "Field"
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
      | state  |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |
      | MO_001 |

  @NBENDFloodCoverage
  Scenario Outline: HO flood node to FS Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"
    * I set "Policy_Delivery_Option" to "PrintByPure"

    When I am logged in to Pure as "Field"
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
      | state  |
      | CO_001 |
      | GA_001 |
      | CT_001 |
      | MA_001 |
      | NJ_001 |
      | IL_001 |