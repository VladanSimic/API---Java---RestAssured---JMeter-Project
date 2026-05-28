@US45511 @US @RI @Homeowners @HO @PCRegression @2024 @December @Forms
Feature: US45511 - RI Home - LLDW & LPB - Forms

  @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: RI Home - LLDW & LPB Forms - NB/END/RN

    Given I use "RI_007" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "6 Acre Avenue"
    * I set risk address 1 city to "Barrington"
    * I set risk address 1 state to "RI"
    * I set risk address 1 zip to "02806"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "500000"
    * I set risk address 1 AOP Ded to "50,000"
    * I set risk address 1 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6 Acre Avenue"
    * I set "City_Name_Txt" to "Barrington"
    * I set "Zip_Code" to "02806"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "61 Ledge Rd APT H"
    * I set risk address 2 city to "Newport"
    * I set risk address 2 state to "RI"
    * I set risk address 2 zip to "02840"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "1,000"
    * I set risk address 2 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Newport"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "36 Pine Crest Drive"
    * I set risk address 3 city to "East Providence"
    * I set risk address 3 state to "RI"
    * I set risk address 3 zip to "02915"
    * I set risk address 3 residence type to "Condo/Co-op"
    * I set risk address 3 contents to "653400"
    * I set risk address 3 AOP Ded to "5,000"
    * I set risk address 3 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "East Providence"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    * I navigate to Homeowner Policy Page
    And I click delete 3 additional risk address
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @RN @NewBusiness @Renewal @RC @RenewalConversion
  Scenario: RI Home - LLDW & LPB Forms - Renewal Conversion

    Given I use "RI_007" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    * I set "Additional_Interests" to "1,2,3,4,5,6"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "6 Acre Avenue"
    * I set risk address 1 city to "Barrington"
    * I set risk address 1 state to "RI"
    * I set risk address 1 zip to "02806"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "500000"
    * I set risk address 1 AOP Ded to "50,000"
    * I set risk address 1 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6 Acre Avenue"
    * I set "City_Name_Txt" to "Barrington"
    * I set "Zip_Code" to "02806"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "61 Ledge Rd APT H"
    * I set risk address 2 city to "Newport"
    * I set risk address 2 state to "RI"
    * I set risk address 2 zip to "02840"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "1,000"
    * I set risk address 2 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Newport"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "36 Pine Crest Drive"
    * I set risk address 3 city to "East Providence"
    * I set risk address 3 state to "RI"
    * I set risk address 3 zip to "02915"
    * I set risk address 3 residence type to "Condo/Co-op"
    * I set risk address 3 contents to "653400"
    * I set risk address 3 AOP Ded to "5,000"
    * I set risk address 3 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "East Providence"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    * I navigate to Homeowner Policy Page
    And I click delete 3 additional risk address
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @NewBusiness @Endorsement @DayPrior @PreProd
  Scenario: RI Home - LLDW & LPB Forms - Day Prior

    Given I use "RI_007" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "6 Acre Avenue"
    * I set risk address 1 city to "Barrington"
    * I set risk address 1 state to "RI"
    * I set risk address 1 zip to "02806"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "500000"
    * I set risk address 1 AOP Ded to "50,000"
    * I set risk address 1 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6 Acre Avenue"
    * I set "City_Name_Txt" to "Barrington"
    * I set "Zip_Code" to "02806"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "61 Ledge Rd APT H"
    * I set risk address 2 city to "Newport"
    * I set risk address 2 state to "RI"
    * I set risk address 2 zip to "02840"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "1,000"
    * I set risk address 2 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Newport"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "36 Pine Crest Drive"
    * I set risk address 3 city to "East Providence"
    * I set risk address 3 state to "RI"
    * I set risk address 3 zip to "02915"
    * I set risk address 3 residence type to "Condo/Co-op"
    * I set risk address 3 contents to "653400"
    * I set risk address 3 AOP Ded to "5,000"
    * I set risk address 3 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "East Providence"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @NB@RN @NewBusiness @Renewal @DayBefore @PreProd
  Scenario: RI Home - LLDW & LPB Forms - Day Before RB

    Given I use "RI_007" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2024"
    * I set "Additional_Interests" to "1,2,3,4,5,6"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "6 Acre Avenue"
    * I set risk address 1 city to "Barrington"
    * I set risk address 1 state to "RI"
    * I set risk address 1 zip to "02806"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "500000"
    * I set risk address 1 AOP Ded to "50,000"
    * I set risk address 1 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6 Acre Avenue"
    * I set "City_Name_Txt" to "Barrington"
    * I set "Zip_Code" to "02806"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "61 Ledge Rd APT H"
    * I set risk address 2 city to "Newport"
    * I set risk address 2 state to "RI"
    * I set risk address 2 zip to "02840"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "1,000"
    * I set risk address 2 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Newport"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @Rewrite @PreProd
  Scenario: RI Home - LLDW & LPB Forms - Rewrite

    Given I use "RI_007" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "6 Acre Avenue"
    * I set risk address 1 city to "Barrington"
    * I set risk address 1 state to "RI"
    * I set risk address 1 zip to "02806"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "500000"
    * I set risk address 1 AOP Ded to "50,000"
    * I set risk address 1 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6 Acre Avenue"
    * I set "City_Name_Txt" to "Barrington"
    * I set "Zip_Code" to "02806"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "61 Ledge Rd APT H"
    * I set risk address 2 city to "Newport"
    * I set risk address 2 state to "RI"
    * I set risk address 2 zip to "02840"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "1,000"
    * I set risk address 2 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Newport"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 01/01/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @NB @NewBusiness @Reinstatement @PreProd
  Scenario: RI Home - LLDW & LPB Forms - Reinstatement

    Given I use "RI_007" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "6 Acre Avenue"
    * I set risk address 1 city to "Barrington"
    * I set risk address 1 state to "RI"
    * I set risk address 1 zip to "02806"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "500000"
    * I set risk address 1 AOP Ded to "50,000"
    * I set risk address 1 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6 Acre Avenue"
    * I set "City_Name_Txt" to "Barrington"
    * I set "Zip_Code" to "02806"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "61 Ledge Rd APT H"
    * I set risk address 2 city to "Newport"
    * I set risk address 2 state to "RI"
    * I set risk address 2 zip to "02840"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "1,000"
    * I set risk address 2 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Newport"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

  @NB @NewBusiness @Cancellation @PreProd
  Scenario: RI Home - LLDW & LPB Forms - Cancellation

    Given I use "RI_007" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "6 Acre Avenue"
    * I set risk address 1 city to "Barrington"
    * I set risk address 1 state to "RI"
    * I set risk address 1 zip to "02806"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "500000"
    * I set risk address 1 AOP Ded to "50,000"
    * I set risk address 1 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6 Acre Avenue"
    * I set "City_Name_Txt" to "Barrington"
    * I set "Zip_Code" to "02806"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "61 Ledge Rd APT H"
    * I set risk address 2 city to "Newport"
    * I set risk address 2 state to "RI"
    * I set risk address 2 zip to "02840"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "1,000"
    * I set risk address 2 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Newport"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |


  @NB @END @NewBusiness @Endorsement @PreProdNew
  Scenario: RI Home - LLDW & LPB Forms - PreProd

    Given I use "RI_007" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "6 Acre Avenue"
    * I set risk address 1 city to "Barrington"
    * I set risk address 1 state to "RI"
    * I set risk address 1 zip to "02806"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "500000"
    * I set risk address 1 AOP Ded to "50,000"
    * I set risk address 1 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6 Acre Avenue"
    * I set "City_Name_Txt" to "Barrington"
    * I set "Zip_Code" to "02806"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "61 Ledge Rd APT H"
    * I set risk address 2 city to "Newport"
    * I set risk address 2 state to "RI"
    * I set risk address 2 zip to "02840"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "1000000"
    * I set risk address 2 AOP Ded to "1,000"
    * I set risk address 2 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Newport"
    * I set "Residence_Type" to "Tenants"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    And I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 3 address line 1 to "36 Pine Crest Drive"
    * I set risk address 3 city to "East Providence"
    * I set risk address 3 state to "RI"
    * I set risk address 3 zip to "02915"
    * I set risk address 3 residence type to "Condo/Co-op"
    * I set risk address 3 contents to "653400"
    * I set risk address 3 AOP Ded to "5,000"
    * I set risk address 3 calendar year hurricane ded to "Not Available"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "East Providence"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I navigate to Location Details Page
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote additional interests coverages page
    * I fill out HO quote member information page

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement
