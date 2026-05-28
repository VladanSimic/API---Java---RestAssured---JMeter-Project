@PrimaryFlood @Admitted @US54262
Feature: [Continued] PF Admitted - Primary Flood Coverage Block for RUM Authority - Function - IL

  @TC105288
  Scenario Outline: US54262/TC105288 - "<user>" - Verify that Manager Primary Flood Override is displayed on the UI when PURE Flood endorsement is ineligible for all internal users

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "<user>"
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify checkbox "Manager Primary Flood Override" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Manager Override"

    Examples:
      | user                       |
      | Field                      |
      | Zonal                      |
      | RUM                        |
      | Specialist1                |
      | Specialist2                |
      | SeniorUnderwriter          |
      | Underwriter1               |
      | Underwriter2               |
      | Analyst                    |
      | UWSA1                      |
      | UWSA2                      |
      | UWSSA                      |
      | UWSRM                      |
      | SeniorUWManagementRole     |
      | UWManagerRole              |
      | UnderwriterRole            |
      | UnderwritingTechnicianRole |
      | SeniorUWTechnicianRole     |

  @TC105289
  Scenario: US54262/TC105289 - Broker - Verify that Manager Primary Flood Override is not displayed on the UI when PURE Flood endorsement is ineligible for Brokers

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "Agent2"
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify checkbox "Manager Primary Flood Override" is "not visible" on page
    * I take screenshot "Manager Override"

  @TC105290
  Scenario Outline: US54262/TC105290 - "<user>" - Verify that Manager Primary Flood Override is not displayed on the UI when PURE Flood endorsement is eligible for all internal users

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "No"
    * I set base flood elevation to "10000"
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "<user>"
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify checkbox "Manager Primary Flood Override" is "not visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "Manager Override"

    Examples:
      | user                       |
      | Field                      |
      | Zonal                      |
      | RUM                        |
      | Specialist1                |
      | Specialist2                |
      | SeniorUnderwriter          |
      | Underwriter1               |
      | Underwriter2               |
      | Analyst                    |
      | UWSA1                      |
      | UWSA2                      |
      | UWSSA                      |
      | UWSRM                      |
      | SeniorUWManagementRole     |
      | UWManagerRole              |
      | UnderwriterRole            |
      | UnderwritingTechnicianRole |
      | SeniorUWTechnicianRole     |

  @TC105291
  Scenario Outline: US54262/TC105291 - "<user>" - Verify that Manager Primary Flood Override can be checked for RUM Authority level and above

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "<user>"
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify checkbox "Manager Primary Flood Override" is "visible" on page
    * I verify checkbox "Manager Primary Flood Override" is "enabled"
    * I take screenshot "Manager Override"

    Examples:
      | user  |
      | Field |
      | Zonal |
      | RUM   |

  @TC105292
  Scenario Outline: US54262/TC105292 - "<user>" - Verify that Manager Primary Flood Override can't be checked for below RUM Authority level

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "<user>"
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify checkbox "Manager Primary Flood Override" is "visible" on page
    * I verify checkbox "Manager Primary Flood Override" is "not enabled"
    * I take screenshot "Manager Override"

    Examples:
      | user                       |
      | Specialist1                |
      | Specialist2                |
      | SeniorUnderwriter          |
      | Underwriter1               |
      | Underwriter2               |
      | Analyst                    |
      | UWSA1                      |
      | UWSA2                      |
      | UWSSA                      |
      | UWSRM                      |
      | SeniorUWManagementRole     |
      | UWManagerRole              |
      | UnderwriterRole            |
      | UnderwritingTechnicianRole |
      | SeniorUWTechnicianRole     |

  @TC105293
  Scenario: US54262/TC105293 - Field - Verify that when Manager Primary Flood Override is checked question "Do you want to add PURE Flood Endorsement?" is not read-only anymore

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"

    Then I verify "Do you want to add the PURE Primary Flood Endorsement?" question is "enabled"
    * I take screenshot "PURE Primary Flood Endorsement"

  @TC105294
  Scenario: US54262/TC105294 - Field - Verify that when Manager Primary Flood Override is checked and question "Do you want to add PURE Flood Endorsement?" is answered YES additional 'Primary Flood Coverage Limits' section is displayed

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "Yes" for "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Primary Flood Coverage Limits" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "PURE Primary Flood Endorsement"

  @TC105295
  Scenario: US54262/TC105295 - Field - Verify that when Manager Primary Flood Override is checked and question "Do you want to add PURE Flood Endorsement?" is answered NO additional 'Primary Flood Coverage Limits' section is not displayed

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "No" for "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Primary Flood Coverage Limits" is "not visible" on page
    * I take screenshot "PURE Primary Flood Endorsement"

  @TC105296
  Scenario Outline: US54262/TC105296 - "<user>" - Verify that when Manager Primary Flood Override is checked and question "Do you want to add PURE Flood Endorsement?" is answered YES Elevated Risk Credit and High PML Load fields are visible for all internal roles

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "Yes" for "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "<user>"
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify "Elevated Risk Credit" is "visible" on page
    * I verify "High PML Load" is "visible" on page
    * I scroll to the bottom of the page
    * I take screenshot "PURE Primary Flood Endorsement"

    Examples:
      | user                       |
      | Field                      |
      | Zonal                      |
      | RUM                        |
      | Specialist1                |
      | Specialist2                |
      | SeniorUnderwriter          |
      | Underwriter1               |
      | Underwriter2               |
      | Analyst                    |
      | UWSA1                      |
      | UWSA2                      |
      | UWSSA                      |
      | UWSRM                      |
      | SeniorUWManagementRole     |
      | UWManagerRole              |
      | UnderwriterRole            |
      | UnderwritingTechnicianRole |
      | SeniorUWTechnicianRole     |

  @TC105297
  Scenario: US54262/TC105297 - Field - Verify that validation message appears when Elevated Risk Credit is below limit

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "Yes" for "Do you want to add the PURE Primary Flood Endorsement?"
    * I type "0.74" to "Elevated Risk Credit" input field

    Then I verify validation message "Elevated Risk Credit Factor Range for this field should be between 1.00 - 0.75" is displayed

  @TC105298
  Scenario: US54262/TC105298 - Field - Verify that validation message appears when Elevated Risk Credit is above limit

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "Yes" for "Do you want to add the PURE Primary Flood Endorsement?"
    * I type "1.01" to "Elevated Risk Credit" input field

    Then I verify validation message "Elevated Risk Credit Factor Range for this field should be between 1.00 - 0.75" is displayed

  @TC105299
  Scenario: US54262/TC105299 - Field - Verify that validation message appears when High PML Load is below limit

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "Yes" for "Do you want to add the PURE Primary Flood Endorsement?"
    * I type "0.99" to "High PML Load" input field

    Then I verify validation message "High PML Load Factor Range for this field should be between 1.00 - 1.25" is displayed

  @TC105300
  Scenario: US54262/TC105300 - Field - Verify that validation message appears when High PML Load is above limit

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "Yes" for "Do you want to add the PURE Primary Flood Endorsement?"
    * I type "1.26" to "High PML Load" input field

    Then I verify validation message "High PML Load Factor Range for this field should be between 1.00 - 1.25" is displayed

  @TC106957
  Scenario: US54262/TC106957 - Broker - Verify that when Manager Primary Flood Override is checked and question "Do you want to add PURE Flood Endorsement?" is answered YES Elevated Risk Credit and High PML Load fields are not visible for Brokers

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "Yes" for "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "Agent2"
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify "Elevated Risk Credit" is "not visible" on page
    * I verify "High PML Load" is "not visible" on page
    * I take screenshot "PURE Primary Flood Endorsement"

  @TC106958
  Scenario Outline: US54262/TC106958 - "<user>" - Verify that when Manager Primary Flood Override is checked and question "Do you want to add PURE Flood Endorsement?" is answered YES Elevated Risk Credit and High PML Load fields cannot be updated with Authority Level below RUM

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet

    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "919 Hill Road"
    * I set "City_Name_Txt" to "Winnetka"
    * I set "Zip_Code" to "60093"
    * I set "Manager_Flood_Zone_Override" to "Yes"
    * I set "Flood_Information_Flood_Zone" to "AE/A1-A30/A Unnumbered"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I click override flood zone
    * I set the flood zone to "AE/A1-A30/A Unnumbered"
    * I set the is home in CBRA zone to "Yes"
    * I check checkbox "Manager Primary Flood Override"
    * I choose "Yes" for "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I exit quote

    When I am logged in to Pure as "<user>"
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to quotes detail page
    * I navigate to "Flood Coverage" page

    Then I verify input field "Elevated Risk Credit" is read only
    * I verify input field "High PML Load" is read only
    * I take screenshot "PURE Primary Flood Endorsement"

    Examples:
      | user                       |
      | Specialist1                |
      | Specialist2                |
      | SeniorUnderwriter          |
      | Underwriter1               |
      | Underwriter2               |
      | Analyst                    |
      | UWSA1                      |
      | UWSA2                      |
      | UWSSA                      |
      | UWSRM                      |
      | SeniorUWManagementRole     |
      | UWManagerRole              |
      | UnderwriterRole            |
      | UnderwritingTechnicianRole |
      | SeniorUWTechnicianRole     |
