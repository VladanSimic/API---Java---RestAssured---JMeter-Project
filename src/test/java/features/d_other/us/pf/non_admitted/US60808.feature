@PrimaryFlood @NonAdmitted @US60808
Feature: FS - Non-Admitted Flood - make underlying Home Characteristics/Coverages/Deductibles editable on FS Endorsements

  Scenario Outline: US60808 - Verify that the underlying Replacement Cost, Contents, Loss of Use, Other Structures, AOP Deductible fields are editable on the FS Endorsement for "<state>" state from HS

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HS" quote
    * I navigate to "Flood Surplus Lines Policy" page
    * I pause for "10" seconds
    * I scroll to the bottom of the page

    Then I take screenshot "FS New Business - read only"

    When I rate and bind an FS quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I pause for "10" seconds

    Then I take screenshot "FS Endorsement 1"

    When I type "5,000,001" to "Replacement Cost" input field
    * I type "2,500,001" to "Contents" field with index 2
    * I type "5,000,001" to "Loss of Use" field with index 2
    * I type "1,000,001" to "Other Structures" field with index 2
    * I type "5,001" to "AOP Deductible" input field
    * I click save changes button
    * I pause for "10" seconds
    * I scroll to the bottom of the page

    Then I take screenshot "FS Endorsement 1 - with saved changes"

    When I review changes FS
    * I rate an endorsement
    * I issue an endorsement
    * I select the first endorsement transaction
    * I navigate to policy image page
    * I pause for "10" seconds
    * I scroll to the bottom of the page

    Then I take screenshot "FS Endorsement 1 - processed"

    When I click exit button
    * I initiate new endorsement
    * I scroll to the bottom of the page

    Then I take screenshot "FS Endorsement 2"

    Examples:
      | state  |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | NC_001 |
      | MS_001 |
      | CO_001 |
      | FL_001 |
      | LA_001 |
      | AL_001 |

  Scenario Outline: US60808 - Verify that the underlying Replacement Cost, Contents, Loss of Use, Other Structures, AOP Deductible fields are editable on the FS Endorsement for "<state>" state from HO

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HO" quote
    * I navigate to "Flood Surplus Lines Policy" page
    * I pause for "10" seconds
    * I scroll to the bottom of the page

    Then I take screenshot "FS New Business - read only"

    When I rate and bind an FS quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I pause for "10" seconds

    Then I take screenshot "FS Endorsement 1"

    When I type "5,000,001" to "Replacement Cost" input field
    * I type "2,500,001" to "Contents" field with index 2
    * I type "5,000,001" to "Loss of Use" field with index 2
    * I type "1,000,001" to "Other Structures" field with index 2
    * I type "5,001" to "AOP Deductible" input field
    * I click save changes button
    * I pause for "10" seconds
    * I scroll to the bottom of the page

    Then I take screenshot "FS Endorsement 1 - with saved changes"

    When I review changes FS
    * I rate an endorsement
    * I issue an endorsement
    * I select the first endorsement transaction
    * I navigate to policy image page
    * I pause for "10" seconds
    * I scroll to the bottom of the page

    Then I take screenshot "FS Endorsement 1 - processed"

    When I click exit button
    * I initiate new endorsement
    * I scroll to the bottom of the page

    Then I take screenshot "FS Endorsement 2"

    Examples:
      | state  |
      | IL_001 |
      | CA_001 |
      | MO_001 |
      | KY_001 |
      | AR_001 |

  Scenario Outline: US60808 - Verify that the underlying Replacement Cost, Contents, Loss of Use, Other Structures, AOP Deductible fields are editable on the FS NBRW for "<state>" state from HS

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HS" quote
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I take screenshot "FS New Business - read only"

    When I rate and bind an FS quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |
    * I pause for "10" seconds
    * I scroll to the bottom of the page

    Then I take screenshot "FS Rewrite 1"

    When I type "5,000,001" to "Replacement Cost" input field
    * I type "2,500,001" to "Contents" field with index 2
    * I type "5,000,001" to "Loss of Use" field with index 2
    * I type "1,000,001" to "Other Structures" field with index 2
    * I type "5,001" to "AOP Deductible" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "FS Rewrite 1 - with saved changes"

    When I review changes FS
    * I rate a quote
    * I complete rewrite transaction
    * I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    * I navigate to policy image page
    * I scroll to the bottom of the page

    Then I take screenshot "FS Rewrite - processed"

    Examples:
      | state  |
      | MA_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | MS_001 |
      | CO_001 |
      | FL_001 |
      | LA_001 |
      | AL_001 |

    @TC116125 @TC116126 @TC116128 @TC116129 @TC116127
    Examples:
      | state  |
      | NC_001 |

  Scenario Outline: US60808 - Verify that the underlying Replacement Cost, Contents, Loss of Use, Other Structures, AOP Deductible fields are editable on the FS NBRW for "<state>" state from HO

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new FS quote from new "HO" quote
    * I navigate to "Flood Surplus Lines Policy" page
    * I scroll to the bottom of the page

    Then I take screenshot "FS New Business - read only"

    When I rate and bind an FS quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |
    * I pause for "10" seconds
    * I scroll to the bottom of the page

    Then I take screenshot "FS Rewrite 1"

    When I type "5,000,001" to "Replacement Cost" input field
    * I type "2,500,001" to "Contents" field with index 2
    * I type "5,000,001" to "Loss of Use" field with index 2
    * I type "1,000,001" to "Other Structures" field with index 2
    * I type "5,001" to "AOP Deductible" input field
    * I click save changes button
    * I scroll to the bottom of the page

    Then I take screenshot "FS Rewrite 1 - with saved changes"

    When I review changes FS
    * I rate a quote
    * I complete rewrite transaction
    * I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    * I navigate to policy image page
    * I scroll to the bottom of the page

    Then I take screenshot "FS Rewrite - processed"

    Examples:
      | state  |
      | CA_001 |
      | MO_001 |
      | KY_001 |

    @TC116154 @TC116153 @TC116152 @TC116151 @TC116150
    Examples:
      | state  |
      | AR_001 |

    @TC116095 @TC116096 @TC116097 @TC116098 @TC116099
    Examples:
      | state  |
      | IL_001 |