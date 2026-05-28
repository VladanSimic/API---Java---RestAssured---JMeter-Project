@PrimaryFlood @NonAdmitted @US54727
Feature: FS - NonAdmitted - UI - Update LOB in Quote/Policy Tree title, Carrier Partner Name, Policy Prefix, and Product Name
  As a Product Manager I want to update the name of the title of LOB in the quote/policy tree for the new Flood Surplus LOB

  @TC104978 @TC104980 @TC104981
  Scenario Outline: US54727 - Verify LOB, Underwriting Company and Product Name - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer

    Then I verify page "Flood Surplus Lines Policy" is "visible" in tree
    * I verify page "Home Surplus Lines Policy" is "not visible" in tree
    * I take screenshot "Flood Surplus Lines Policy visibility"

    When I navigate to "Flood Surplus Lines Policy" page

    Then I verify "Underwriting Company" input 1 has value "National Fire & Marine Insurance Company"
    * I verify "Underwriting Company" value "Flood Underwriting Company" is not displayed in "underwriting company" block
    * I take screenshot "Underwriting Company Name"

    When I click "rate" button

    Then I verify value "<value>" is "visible" for "Product" field
    * I take screenshot "Premium page - Product name"

    When I navigate to quote summary page

    Then I verify value "<value>" is "visible" for "Product" field
    * I take screenshot "Summary page - Product name"

    Examples:
      | state  | value                                |
      | NY_001 | Flood Surplus Lines - New York       |
      | MA_001 | Flood Surplus Lines - Massachusetts  |
      | TX_001 | Flood Surplus Lines - Texas          |
      | GA_001 | Flood Surplus Lines - Georgia        |
      | CT_001 | Flood Surplus Lines - Connecticut    |
      | NJ_001 | Flood Surplus Lines - New Jersey     |
      | VA_001 | Flood Surplus Lines - Virginia       |
      | IL_001 | Flood Surplus Lines - Illinois       |
      | CO_001 | Flood Surplus Lines - Colorado       |
      | CA_001 | Flood Surplus Lines - California     |
      | FL_001 | Flood Surplus Lines - Florida        |
      | LA_001 | Flood Surplus Lines - Louisiana      |
      | NC_001 | Flood Surplus Lines - North Carolina |
      | MO_001 | Flood Surplus Lines - Missouri       |
      | AL_001 | Flood Surplus Lines - Alabama        |
      | KY_001 | Flood Surplus Lines - Kentucky       |
      | MS_001 | Flood Surplus Lines - Mississippi    |
      | AR_001 | Flood Surplus Lines - Arkansas       |