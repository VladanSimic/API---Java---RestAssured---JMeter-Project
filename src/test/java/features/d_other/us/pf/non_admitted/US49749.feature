@PrimaryFlood @NonAdmitted @US49749
Feature: FS - NonAdmitted - UI - Member Info UI & Function
  As a Product Manager, I would want to make Member information page
  available for the new Flood Solutions LOB so we can start offering
  this new flood product to our members.

  @TC97867
  Scenario Outline: US49749 - Verify Member information page blocks and cells for - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I expand cover page tree
    * I expand location page tree
    * I navigate to "Member Information" page

    Then I verify block "member information" is "visible" on page

    * I verify input field "Member Occupation" is "visible" in "member information" block
    * I verify input field "Member Occupation" is read only with value "Occupation"

    * I verify input field "Member Employer" is "visible" in "member information" block
    * I verify input field "Member Employer" is read only with value "Employer"

    * I verify link "View Customer Details" is "visible" in "member information" block

    * I verify the "Existing Agency Client?" label with "Yes" and "No" radio buttons is "visible" in "member information" block
    * I verify "Existing Agency Client?" has no default answer

    * I verify the "Has coverage been non-renewed or cancelled?" label with "Yes" and "No" radio buttons is "visible" in "member information" block
    * I verify "Has coverage been non-renewed or cancelled?" has no default answer

    * I verify the "Does the insured keep one or more dangerous dogs?" label with "Yes" and "No" radio buttons is "visible" in "member information" block
    * I verify "Does the insured keep one or more dangerous dogs?" has no default answer

    Then I verify block "appraisal information" is "not visible" on page
    * I take screenshot "Member Information Page"

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