@US45515 @US @UT @Homeowners @HO @PCRegression @2024 @December @UI @Rating
Feature: US45515 - UT Home EQ Extension

  @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: UT Home EQ Extension - NB/END/RN
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "5%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Optional Coverages Page
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 410 N Main St | Beaver | UT    | 84713 | Condo/Co-op   | 3000000 |           | 10,000 |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 139 Hillside Dr | Moab | UT    | 84532 | Tenants       | 1000000 |           | 10,000 |            |

    * I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage              | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension  |       | 5%         |         |
      | 410 N Main St   | !Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | !Earthquake Extension |       | 5%         |         |
    When I navigate to quotes detail page
    And I navigate to Optional Coverages Page
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set "City_Name_Txt" to "Beaver"
    When I navigate to quotes detail page
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 5%         |         |
      | 410 N Main St   | Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | Earthquake Extension |       | 5%         |         |
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "10%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    Then I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    Then I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "15%"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 541 E 500 S  | Provo | UT    | 84606 | Condo/Co-op   | 2000000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer

    And I review changes
    * I rate an endorsement
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 15%        |         |
      | 410 N Main St   | Earthquake Extension |       | 20%        |         |
      | 139 Hillside Dr | Earthquake Extension |       | 10%        |         |
      | 541 E 500 S     | Earthquake Extension |       | 5%         |         |
    And I review and accept referrals on renewal if any
    Then I issue an endorsement
    * I navigate to transactions or endorsements
    And I create a renewal
    Then I navigate to policy image page
    And I review changes
    * I click renewed premium
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 15%        |         |
      | 410 N Main St   | Earthquake Extension |       | 20%        |         |
      | 139 Hillside Dr | Earthquake Extension |       | 10%        |         |
      | 541 E 500 S     | Earthquake Extension |       | 5%         |         |
    And I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @NewBusiness @Endorsement @PreProd
  Scenario: UT Home EQ Extension - Change deductible to lower on Endorsement and validate referrals
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "5%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Optional Coverages Page
    And I click earthquake extension deductible dropdown
    * I click on the footer

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 410 N Main St | Beaver | UT    | 84713 | Condo/Co-op   | 3000000 |           | 10,000 |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 139 Hillside Dr | Moab | UT    | 84532 | Tenants       | 1000000 |           | 10,000 |            |

    When I navigate to quotes detail page
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    * I set "City_Name_Txt" to "Beaver"
    When I navigate to quotes detail page
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 5%         |         |
      | 410 N Main St   | Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | Earthquake Extension |       | 5%         |         |
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I set "City_Name_Txt" to "Moab"
    And I navigate to Location Details Page
    * I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "2%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    And I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "2%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    And I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "2%"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 541 E 500 S  | Provo | UT    | 84606 | Tenants       | 2000000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer

    And I review changes
    * I rate an endorsement
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 2%         |         |
      | 410 N Main St   | Earthquake Extension |       | 2%         |         |
      | 139 Hillside Dr | Earthquake Extension |       | 2%         |         |
      | 541 E 500 S     | Earthquake Extension |       | 5%         |         |
    And I navigate to underwriting alerts tab
    * I verify if element with message "The Earthquake Deductible cannot be reduced mid-policy period. Please amend deductible or refer to underwriting." is displayed 3 times
    * I accept underwriting referrals
    Then I issue an endorsement

  @RenewalConversion @RC
  Scenario: UT Home EQ Extension - Renewal Conversion
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    * I set "Optional_Coverages_Earthquake_Extension" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Optional Coverages Page
    * I verify if element with message "Earthquake Extension" is "not displayed" on the UI
    * I set "City_Name_Txt" to "Beaver"
    When I navigate to quotes detail page
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I verify if element with message "Earthquake Extension" is "not displayed" on the UI
    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage              | limit | deductible | premium |
      | 4375 Redcliffs  | !Earthquake Extension |       | 5%         |         |
      | 410 N Main St   | !Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | !Earthquake Extension |       | 5%         |         |
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    When I review changes
    And I click renewed premium
    Then I validate Premium Summary Table on "Renewal" transaction
      | location        | coverage              | limit | deductible | premium |
      | 4375 Redcliffs  | !Earthquake Extension |       | 5%         |         |
      | 410 N Main St   | !Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | !Earthquake Extension |       | 5%         |         |
    And I click more changes button
    * I think for 12 to 15 seconds
    And I navigate to Location Details Page
    Then I navigate via action button next

    And I set earthquake extension radio button to "Yes"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    Then I navigate via action button next
    And I set earthquake extension radio button to "Yes"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    Then I navigate via action button next
    And I set earthquake extension radio button to "Yes"
    And I set earthquake extension deductible to "25%"
    * I set "City_Name_Txt" to "Moab"
    Then I navigate to Location Details Page
    Then I navigate via action button next
    And I set earthquake extension radio button to "Yes"

    Then I review changes
    And I click renewed premium
    Then I validate Premium Summary Table on "Renewal" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 25%        |         |
      | 410 N Main St   | Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | Earthquake Extension |       | 5%         |         |
    And I review and accept referrals on renewal if any
    * I process a renewal

  @DayPriorPD @DayPrior @END @Endorsement @PreProd
  Scenario: UT Home EQ Extension - Day Prior PD Filling
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "25%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Optional Coverages Page
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage              | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension  |       | 25%        |         |
      | 410 N Main St   | !Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | !Earthquake Extension |       | 5%         |         |
    When I navigate to quotes detail page
    And I navigate to Optional Coverages Page
    * I verify if element with message "Earthquake Extension" is "not displayed" on the UI
    * I set "City_Name_Txt" to "Beaver"
    When I navigate to quotes detail page
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I verify if element with message "Earthquake Extension" is "not displayed" on the UI
    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage              | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension  |       | 25%        |         |
      | 410 N Main St   | !Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | !Earthquake Extension |       | 5%         |         |
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Extension" is "not displayed" on the UI

    * I set "City_Name_Txt" to "Beaver"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Extension" is "not displayed" on the UI

    And I review changes
    * I rate an endorsement
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location        | coverage              | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension  |       | 25%        |         |
      | 410 N Main St   | !Earthquake Extension |       | 20%        |         |
      | 139 Hillside Dr | !Earthquake Extension |       | 10%        |         |
    And I review and accept referrals on renewal if any
    Then I issue an endorsement

  @NB @NewBusiness @Endorsement @Cancel @Cancellation @PreProd
  Scenario: UT Home EQ Extension - Cancellation
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "5%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Optional Coverages Page
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage              | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension  |       | 5%         |         |
      | 410 N Main St   | !Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | !Earthquake Extension |       | 5%         |         |
    When I navigate to quotes detail page
    And I navigate to Optional Coverages Page
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set "City_Name_Txt" to "Beaver"
    When I navigate to quotes detail page
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 5%         |         |
      | 410 N Main St   | Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | Earthquake Extension |       | 5%         |         |
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

  @NB @NewBusiness @Endorsement @Rewrite @PreProd
  Scenario: UT Home EQ Extension - Rewrite
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "25%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Optional Coverages Page
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage              | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension  |       | 25%        |         |
      | 410 N Main St   | !Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | !Earthquake Extension |       | 5%         |         |
    When I navigate to quotes detail page
    And I navigate to Optional Coverages Page
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set "City_Name_Txt" to "Beaver"
    When I navigate to quotes detail page
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 25%        |         |
      | 410 N Main St   | Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | Earthquake Extension |       | 5%         |         |
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 01/01/2025 |
    And I navigate to Homeowner Policy Page
    * I set "City_Name_Txt" to "Kanab"
    * I navigate to Location Details Page
    * I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Beaver"
    * I navigate to Location Details Page
    * I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "15%"
    * I set "City_Name_Txt" to "Moab"
    * I navigate to Location Details Page
    * I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "10%"
    * I review changes
    * I rate an endorsement
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "Rewrite" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 20%        |         |
      | 410 N Main St   | Earthquake Extension |       | 15%        |         |
      | 139 Hillside Dr | Earthquake Extension |       | 10%        |         |
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @NB @END @RN @NewBusiness @Endorsement @Renewal @PreProdNew
  Scenario: UT Home EQ Extension - NB/END PreProd
    Given I use "UT_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Optional_Coverages_Earthquake_Extension_Deductible" to "5%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Optional Coverages Page
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "410 N Main St"
    * I set risk address 1 city to "Beaver"
    * I set risk address 1 state to "UT"
    * I set risk address 1 zip to "84713"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Beaver"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "139 Hillside Dr"
    * I set risk address 2 city to "Moab"
    * I set risk address 2 state to "UT"
    * I set risk address 2 zip to "84532"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Moab"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage              | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension  |       | 5%         |         |
      | 410 N Main St   | !Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | !Earthquake Extension |       | 5%         |         |
    When I navigate to quotes detail page
    And I navigate to Optional Coverages Page
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set "City_Name_Txt" to "Beaver"
    When I navigate to quotes detail page
    Then I navigate to Location Details Page
    And I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 5%         |         |
      | 410 N Main St   | Earthquake Extension |       | 5%         |         |
      | 139 Hillside Dr | Earthquake Extension |       | 5%         |         |
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I navigate to Location Details Page
    * I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "10%"
    * I set "City_Name_Txt" to "Beaver"
    Then I navigate to Location Details Page
    Then I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "20%"
    * I set "City_Name_Txt" to "Kanab"
    Then I navigate to Location Details Page
    Then I navigate via action button next
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I set earthquake extension deductible to "15%"

    Then I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "541 E 500 S"
    * I set risk address 3 city to "Provo"
    * I set risk address 3 state to "UT"
    * I set risk address 3 zip to "84606"
    * I set risk address 3 residence type to "Condo/Co-op"
    * I set risk address 3 contents to "2000000"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Provo"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I set earthquake extension radio button to "Yes"
    And I click earthquake extension deductible dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values     |
      | - Select - |
      | 2%         |
      | 5%         |
      | 10%        |
      | 15%        |
      | 20%        |
      | 25%        |
    * I click on the footer
    * I fill out HO quote wildfire details page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location        | coverage             | limit | deductible | premium |
      | 4375 Redcliffs  | Earthquake Extension |       | 15%        |         |
      | 410 N Main St   | Earthquake Extension |       | 20%        |         |
      | 139 Hillside Dr | Earthquake Extension |       | 5%         |         |
      | 541 E 500 S     | Earthquake Extension |       | 5%         |         |
    And I review and accept referrals on renewal if any
    Then I issue an endorsement
    * I navigate to transactions or endorsements