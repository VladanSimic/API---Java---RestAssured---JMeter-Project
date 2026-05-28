@PrimaryFlood @NonAdmitted @US53413
Feature: FS - NonAdmitted - UI - Clone Member flag Page UI & Function
  As a Product Manager I want to clone Member flag page to the new non-admitted
  flood surplus LOB, as we start offering Flood product to our members.

  @TC102328
  Scenario Outline: US53413 - Verify that the Member Flag page is visible on the UI and contains 'Flag Types' and 'Flag History Log' blocks - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page

    Then I verify that "member flag" tab is "visible" on page
    * I take screenshot "Member flag visibility"

    When I navigate to member flag tab

    Then I verify block "Flag Types" is "visible" on page
    * I verify block "Flag History Log" is "visible" on page
    * I take screenshot "Member flag blocks visibility"


    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

  @TC102329 @TC102330
  Scenario Outline: US53413 - Verify that the 'save changes' button on the Member Flag page is saving Notes for all available Flag Types - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to member flag tab

    And I check checkbox "UW Concerns - Admitted"
    * I click save changes button

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "Validation message appearance"

    When I type to textarea "test1"
    * I click on the footer
    * I click save changes button

    Then I verify that ">>>member flag<<<" tab is "visible" on page
    * I get text from row 1 cell 1 in "Flag History Log" block and verify it has "Flag Type UW Concerns - Admitted is set" value
    * I get text from row 1 cell 2 in "Flag History Log" block and verify it has "test1" value
    * I get text from row 1 cell 3 in "Flag History Log" block and verify it has "FieldTest" value
    * I get text from row 1 cell 4 in "Flag History Log" block and verify "Date/Time" field has a value

    When I check checkbox "UW Concerns - PURE Programs"
    * I type to textarea "test2"
    * I click on the footer
    * I click save changes button

    Then I get text from row 1 cell 1 in "Flag History Log" block and verify it has "Flag Type UW Concerns - PURE Programs is set" value
    * I get text from row 1 cell 2 in "Flag History Log" block and verify it has "test2" value
    * I get text from row 1 cell 3 in "Flag History Log" block and verify it has "FieldTest" value
    * I get text from row 1 cell 4 in "Flag History Log" block and verify "Date/Time" field has a value

    When I check checkbox "Service Issues"
    * I type to textarea "test3"
    * I click on the footer
    * I click save changes button

    Then I get text from row 1 cell 1 in "Flag History Log" block and verify it has "Flag Type Service Issues is set" value
    * I get text from row 1 cell 2 in "Flag History Log" block and verify it has "test3" value
    * I get text from row 1 cell 3 in "Flag History Log" block and verify it has "FieldTest" value
    * I get text from row 1 cell 4 in "Flag History Log" block and verify "Date/Time" field has a value

    When I check checkbox "Payment Concern"
    * I type to textarea "test4"
    * I click on the footer
    * I click save changes button

    Then I get text from row 1 cell 1 in "Flag History Log" block and verify it has "Flag Type Payment Concern is set" value
    * I get text from row 1 cell 2 in "Flag History Log" block and verify it has "test4" value
    * I get text from row 1 cell 3 in "Flag History Log" block and verify it has "FieldTest" value
    * I get text from row 1 cell 4 in "Flag History Log" block and verify "Date/Time" field has a value

    When I check checkbox "VIP Account"
    * I type to textarea "test5"
    * I click on the footer
    * I click save changes button

    Then I get text from row 1 cell 1 in "Flag History Log" block and verify it has "Flag Type VIP Account is set" value
    * I get text from row 1 cell 2 in "Flag History Log" block and verify it has "test5" value
    * I get text from row 1 cell 3 in "Flag History Log" block and verify it has "FieldTest" value
    * I get text from row 1 cell 4 in "Flag History Log" block and verify "Date/Time" field has a value

    When I check checkbox "Family Account"
    * I type to textarea "test6"
    * I click on the footer
    * I click save changes button

    Then I get text from row 1 cell 1 in "Flag History Log" block and verify it has "Flag Type Family Account is set" value
    * I get text from row 1 cell 2 in "Flag History Log" block and verify it has "test6" value
    * I get text from row 1 cell 3 in "Flag History Log" block and verify it has "FieldTest" value
    * I get text from row 1 cell 4 in "Flag History Log" block and verify "Date/Time" field has a value

    When I check checkbox "Appraisal Requires Review"
    * I type to textarea "test7"
    * I click on the footer
    * I click save changes button

    Then I get text from row 1 cell 1 in "Flag History Log" block and verify it has "Flag Type Appraisal Requires Review is set" value
    * I get text from row 1 cell 2 in "Flag History Log" block and verify it has "test7" value
    * I get text from row 1 cell 3 in "Flag History Log" block and verify it has "FieldTest" value
    * I get text from row 1 cell 4 in "Flag History Log" block and verify "Date/Time" field has a value

    When I check checkbox "Partnership"
    * I type to textarea "test8"
    * I click on the footer
    * I click save changes button

    Then I get text from row 1 cell 1 in "Flag History Log" block and verify it has "Flag Type Partnership is set" value
    * I get text from row 1 cell 2 in "Flag History Log" block and verify it has "test8" value
    * I get text from row 1 cell 3 in "Flag History Log" block and verify it has "FieldTest" value
    * I get text from row 1 cell 4 in "Flag History Log" block and verify "Date/Time" field has a value

    When I check checkbox "Member Engagement"
    * I type "Event Participation" to "Member Engagement Sub Type" dropdown
    * I type to textarea "test9"
    * I click on the footer
    * I click save changes button

    Then I get text from row 1 cell 1 in "Flag History Log" block and verify it has "Flag Type Member Engagement is set,Flag Type Member Engagement Subtype Event Participation is set" value
    * I get text from row 1 cell 2 in "Flag History Log" block and verify it has "test9" value
    * I get text from row 1 cell 3 in "Flag History Log" block and verify it has "FieldTest" value
    * I get text from row 1 cell 4 in "Flag History Log" block and verify "Date/Time" field has a value
    * I take screenshot "Member flag page"

    When I click exit button

    Then I verify that the system navigates to the "quotes" page
    * I take screenshot "Quotes page visibility"

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |