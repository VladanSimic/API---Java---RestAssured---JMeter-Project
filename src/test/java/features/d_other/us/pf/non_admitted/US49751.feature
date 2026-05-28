@PrimaryFlood @NonAdmitted @US49751
Feature: [Continued] FS - NonAdmitted - UI - Manuscript Endorsements UI & Function

  @TC110050 @TC110051
  Scenario Outline: US49751 - 1.2. Verify "Type" options and Manual Premium sync between Manuscript Endorsements Node and its subnode - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Manuscript Endorsements" page
    * I click add manuscript endorsement

    Then I click dropdown "Type"
    * I verify dropdown size is 2
    * I verify dropdown values
      | values             |
      | - Select -         |
      | Premium Adjustment |
    * I take screenshot "Type - dropdown options"

    When I select dropdown value "Premium Adjustment" for "Type"
    * I type "Test" to "Title" input field
    * I type "10,000" to "Manual Premium" input field
    * I click save changes button

    Then I navigate to "Test" page
    * I verify input field "Type" is read only with value "Premium Adjustment"
    * I verify "Title" value "Test" is displayed on page
    * I verify "Manual Premium" value "$ 10,000.00" is displayed on page
    * I take screenshot "Subnode - field values"

    When I set manuscript endorsement sub page endorsement text to "Test Rationale"
    * I click save changes button
    * I type "Test 1" to "Title" input field
    * I type "20,000" to "Manual Premium" input field
    * I click save changes button

    Then I verify page "Test 1" is "visible" in tree
    * I take screenshot "Renamed subnode visibility"

    When I navigate to "Manuscript Endorsements" page

    Then I verify "Title" value "Test 1" is displayed on page
    * I verify "Manual Premium" value "$ 20,000.00" is displayed on page
    * I take screenshot "Updated values for title and premium"

    When I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds

    Then I rate a quote
    * I bind a quote

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |

  @TC110052
  Scenario Outline: US49751 - 3. Verify that Manuscript Endorsements can be successfully added and removed using the Add and Delete buttons - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Manuscript Endorsements" page
    * I click add manuscript endorsement

    Then I verify page "Manuscript Endorsements_1" is "visible" in tree
    * I take screenshot "Manuscript endorsement subnode 1 visibility"

    When I select dropdown value "Premium Adjustment" for "Type"
    * I type "Test 1" to "Title" input field
    * I click save changes button

    Then I verify page "Test 1" is "visible" in tree
    * I take screenshot "Renamed subnode visibility"

    When I type "10,000" to "Manual Premium" input field
    * I click add manuscript endorsement

    Then I verify page "Manuscript Endorsements_2" is "visible" in tree
    * I take screenshot "Manuscript endorsement subnode 2 visibility"

    When I type "Premium Adjustment" to "Type" field with index 2
    * I type "Test 2" to "Title" field with index 2
    * I click save changes button

    Then I verify page "Test 2" is "visible" in tree
    * I take screenshot "Renamed subnode visibility"

    When I type "20,000" to "Manual Premium" field with index 2
    * I click add manuscript endorsement

    Then I verify page "Manuscript Endorsements_3" is "visible" in tree
    * I take screenshot "Manuscript endorsement subnode 3 visibility"

    When I type "Premium Adjustment" to "Type" field with index 3
    * I type "Test 3" to "Title" field with index 3
    * I type "30,000" to "Manual Premium" field with index 3

    Then I click "delete" button index 2
    * I verify page "Test 2" is "not visible" in tree
    * I take screenshot "Test 2 subnode removed"

    When I click "delete" button index 1

    Then I verify page "Test 1" is "not visible" in tree
    * I take screenshot "Test 1 subnode removed"

    When I navigate to "Test 3" page
    * I set manuscript endorsement sub page endorsement text to "Test Rationale"
    * I click save changes button

    Then I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds
    * I rate a quote
    * I bind a quote

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

  @TC110066
  Scenario Outline: US49751 - 4. Verify that Manual Premium values from the Manuscript Endorsement node are accurately displayed on the Premium Detail page listed separately if multiple values are present - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I click "BHSI rate" button
    * I think for 13 to 20 seconds
    * I rate a quote

    Then I navigate to premium details page
    * I verify coverage "Premium Adjustment" factor "Manuscript Endorsements Premium" is not present
    * I take screenshot "Premium adjustment - not visible"

    When I click "return to premium summary page" button
    * I navigate to "quote details" tab

    Then I navigate to "Manuscript Endorsements" page
    * I click add manuscript endorsement
    * I select dropdown value "Premium Adjustment" for "Type"
    * I type "Test 1" to "Title" input field
    * I type "10,000" to "Manual Premium" input field
    * I click save changes button

    When I navigate to "Test 1" page
    * I set manuscript endorsement sub page endorsement text to "Test Rationale"
    * I click save changes button
    * I rate a quote
    * I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                    | coverage           | factor                          | value  |
      | Premium Adjustment - Test 1 | Premium Adjustment | Manuscript Endorsements Premium | 10,000 |
    * I take screenshot "Premium adjustment coverage visibility"

    When I click "return to premium summary page" button
    * I navigate to "quote details" tab

    Then I navigate to "Manuscript Endorsements" page
    * I click add manuscript endorsement
    * I type "Premium Adjustment" to "Type" field with index 2
    * I type "Test 2" to "Title" field with index 2
    * I type "20,000" to "Manual Premium" field with index 2
    * I click save changes button

    When I navigate to "Test 2" page
    * I set manuscript endorsement sub page endorsement text to "Test Rationale"
    * I click save changes button
    * I rate a quote
    * I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                    | coverage           | factor                          | value  |
      | Premium Adjustment - Test 1 | Premium Adjustment | Manuscript Endorsements Premium | 10,000 |
      | Premium Adjustment - Test 2 | Premium Adjustment | Manuscript Endorsements Premium | 20,000 |
    * I take screenshot "Premium adjustment coverages"

    When I click "return to premium summary page" button
    * I navigate to "quote details" tab
    * I rate a quote
    * I bind a quote

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
