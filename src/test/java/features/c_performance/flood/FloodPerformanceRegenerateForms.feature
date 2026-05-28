@Flood @Performance @RegenerateForms
Feature: FS Performance

  Scenario Outline: Scenario 1 - HO flood node to FS New Business - Regenerate forms - "<state>"

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

    * I navigate to policy
    * I navigate to transactions or endorsements
    * I navigate to New Business summary page
    * I navigate to documents tab
    * I click "regenerate forms" button
    * I think for 20 to 30 seconds

    Examples:
      | state  | user |
      | IL_001 | P100 |
      | IL_001 | P101 |
      | IL_001 | P102 |
      | IL_001 | P103 |
      | IL_001 | P104 |
      | IL_001 | P105 |
      | IL_001 | P106 |
      | IL_001 | P107 |
      | IL_001 | P108 |
      | IL_001 | P109 |
      | IL_001 | P110 |
      | IL_001 | P111 |
      | IL_001 | P112 |
      | IL_001 | P113 |
      | IL_001 | P114 |
      | IL_001 | P115 |
      | IL_001 | P116 |
      | IL_001 | P117 |
      | IL_001 | P118 |
      | IL_001 | P119 |
      | IL_001 | P120 |
      | IL_001 | P121 |
      | IL_001 | P122 |
      | IL_001 | P123 |
      | IL_001 | P124 |
      | IL_001 | P125 |
      | IL_001 | P126 |
      | IL_001 | P127 |
      | IL_001 | P128 |
      | IL_001 | P129 |
      | IL_001 | P130 |
      | IL_001 | P131 |