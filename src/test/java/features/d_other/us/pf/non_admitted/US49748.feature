@PrimaryFlood @NonAdmitted @US49748
Feature: PF - Additional Interests page
  As a Product Manager I would like to Additional Interests page available for the new Flood Solutions LOB
  so we can start offering this new flood product to our members.

  @TC97850
  Scenario Outline: US49748 - Verify Additional interest page - UI and function - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I navigate to "Flood Surplus Lines Policy" page
    * I navigate to "Additional Interests" page
    * I click add additional interests
    * I click on cell 1 in row 1

    Then I verify dropdown size is 6
    * I verify dropdown values
      | values              |
      | - Select -          |
      | Additional Insured  |
      | Additional Interest |
      | Loss Payee          |
      | Mortgagee           |
      | Others              |

    * I delete all additional interests

    When I navigate to Additional Interests page and fill additional interests details
      | Additional_Interests_Type | Additional_Interests_LLC_Trust | Additional_Interests_Name | Additional_Interests_Address_Line_1 | Additional_Interests_City | Additional_Interests_State | Additional_Interests_ZIP |
      | Additional Insured        | No                             | Test1                     | 101 Main Street                     | Olean                     | NY                         | 14760                    |
      | Additional Interest       | No                             | Test2                     | 101 Main Street                     | Olean                     | NY                         | 14760                    |
      | Loss Payee                | No                             | Test3                     | 101 Main Street                     | Olean                     | NY                         | 14760                    |
      | Mortgagee                 | No                             | Test4                     | 101 Main Street                     | Olean                     | NY                         | 14760                    |
      | Others                    | Yes                            | Test5                     | 101 Main Street                     | Olean                     | NY                         | 14760                    |
    
    * I fill out the Trust LLC other legal entity page for PF LOB

    Then I take screenshot "Trust LLC Other Legal Entity"

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