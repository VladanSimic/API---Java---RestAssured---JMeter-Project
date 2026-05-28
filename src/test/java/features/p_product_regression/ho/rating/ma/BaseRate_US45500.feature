@US45500 @US @MA @Homeowners @HO @BaseRate @PCRegression @2024 @December @Rating
Feature: US45500 - MA Home Base Rate

  @Zone1 @Homeowner @Export @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: MA Base Rate Change - Zone 1 Homeowner
    Confirm that Base Rate for Zone 1 is changed to $3,535 on NB/END/RN

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "205 East Stahl Road"
    * I set "City_Name_Txt" to "Ashley Falls"
    * I set "Zip_Code" to "01222"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/3,535"
    Then I save coverage factor and value for "MA_Zone1" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    And I verify base rate "Base Rate/3,535"
    Then I save coverage factor and value for "MA_Zone1" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I navigate to premium details page
    Then I verify base rate "Base Rate/3,535"
    Then I save coverage factor and value for "MA_Zone1" in "STG/US45500" in "Base_Rates" excel file for "Renewal"
    When I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Zone34 @Homeowner @Export
  Scenario: MA Base Rate Change - Zone 34 Homeowner

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "14 Church St"
    * I set "City_Name_Txt" to "South Easton"
    * I set "Zip_Code" to "02375"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "10%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/3,428"
    Then I save coverage factor and value for "MA_Zone34" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    And I verify base rate "Base Rate/3,428"
    Then I save coverage factor and value for "MA_Zone34" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I navigate to premium details page
    Then I verify base rate "Base Rate/3,428"
    Then I save coverage factor and value for "MA_Zone34" in "STG/US45500" in "Base_Rates" excel file for "Renewal"
    When I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Zone63 @Homeowner @Export
  Scenario: MA Base Rate Change - Zone 63 Homeowner

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "25 Broadway"
    * I set "City_Name_Txt" to "Nantucket"
    * I set "Zip_Code" to "02554"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "10%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/10,138"
    Then I save coverage factor and value for "MA_Zone63" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    And I verify base rate "Base Rate/10,138"
    Then I save coverage factor and value for "MA_Zone63" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I navigate to premium details page
    Then I verify base rate "Base Rate/10,138"
    Then I save coverage factor and value for "MA_Zone63" in "STG/US45500" in "Base_Rates" excel file for "Renewal"
    When I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Zone10 @Condo @Coop @Export
  Scenario: MA Base Rate Change - Zone 10 Condo

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "155 Warner Ave"
    * I set "City_Name_Txt" to "Worcester"
    * I set "Zip_Code" to "01604"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Condo/Co-op"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,753"
    Then I save coverage factor and value for "MA_Zone10" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    And I verify base rate "Base Rate/2,753"
    Then I save coverage factor and value for "MA_Zone10" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I navigate to premium details page
    Then I verify base rate "Base Rate/2,753"
    Then I save coverage factor and value for "MA_Zone10" in "STG/US45500" in "Base_Rates" excel file for "Renewal"
    When I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Zone44 @Tenants @Export
  Scenario: MA Base Rate Change - Zone 44 Tenants

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "24 Windswept Dr"
    * I set "City_Name_Txt" to "West Wareham"
    * I set "Zip_Code" to "02576"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Tenants"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,923"
    Then I save coverage factor and value for "MA_Zone44T" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    Then I verify base rate "Base Rate/2,923"
    Then I save coverage factor and value for "MA_Zone44T" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I navigate to premium details page
    Then I verify base rate "Base Rate/2,923"
    Then I save coverage factor and value for "MA_Zone44T" in "STG/US45500" in "Base_Rates" excel file for "Renewal"
    When I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Zone10 @Condo @Coop @Export @RC @RenewalConversion
  Scenario: MA Base Rate Change - Renewal Conversion Zone 10 Condo

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "155 Warner Ave"
    * I set "City_Name_Txt" to "Worcester"
    * I set "Zip_Code" to "01604"
    * I set "Effective_Date" to "02/15/2024"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Condo/Co-op"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,546"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I navigate to premium details page
    Then I verify base rate "Base Rate/2,753"
    Then I save coverage factor and value for "MA_Zone10_RC" in "STG/US45500" in "Base_Rates" excel file for "Renewal"
    When I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Zone1 @Homeowner @Export @RC @RenewalConversion
  Scenario: MA Base Rate Change - Renewal Conversion Zone 1 Homeowner

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "205 E Stahl Rd"
    * I set "City_Name_Txt" to "Ashley Falls"
    * I set "Zip_Code" to "01222"
    * I set "Effective_Date" to "02/15/2024"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,984"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I navigate to premium details page
    Then I verify base rate "Base Rate/3,535"
    Then I save coverage factor and value for "MA_Zone1_RC" in "STG/US45500" in "Base_Rates" excel file for "Renewal"
    When I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Zone44 @Tenants @Export @RC @RenewalConversion
  Scenario: MA Base Rate Change - Renewal Conversion Zone 44 Tenants

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "24 Windswept Dr"
    * I set "City_Name_Txt" to "West Wareham"
    * I set "Zip_Code" to "02576"
    * I set "Effective_Date" to "02/15/2024"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Tenants"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,468"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I navigate to premium details page
    Then I verify base rate "Base Rate/2,923"
    Then I save coverage factor and value for "MA_Zone44T_RC" in "STG/US45500" in "Base_Rates" excel file for "Renewal"
    When I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Zone1 @Homeowner @Export @NB @END @RN @NewBusiness @Endorsement @PreProdNew
  Scenario: MA Base Rate Change - Zone 1 Homeowner PreProd
  Confirm that Base Rate for Zone 1 is changed to $3,535 on NB/END/RN

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "205 East Stahl Road"
    * I set "City_Name_Txt" to "Ashley Falls"
    * I set "Zip_Code" to "01222"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/3,535"
    Then I save coverage factor and value for "MA_Zone1PP" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    And I verify base rate "Base Rate/3,535"
    Then I save coverage factor and value for "MA_Zone1PP" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Zone34 @Homeowner @Export @NewBusiness @Endorsement @PreProdNew
  Scenario: MA Base Rate Change - Zone 34 Homeowner PreProd

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "14 Church St"
    * I set "City_Name_Txt" to "South Easton"
    * I set "Zip_Code" to "02375"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "10%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/3,428"
    Then I save coverage factor and value for "MA_Zone34" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    And I verify base rate "Base Rate/3,428"
    Then I save coverage factor and value for "MA_Zone34" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Zone63 @Homeowner @Export @NewBusiness @Endorsement @PreProdNew
  Scenario: MA Base Rate Change - Zone 63 Homeowner PreProd

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "25 Broadway"
    * I set "City_Name_Txt" to "Nantucket"
    * I set "Zip_Code" to "02554"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "10%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/10,138"
    Then I save coverage factor and value for "MA_Zone63PP" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    And I verify base rate "Base Rate/10,138"
    Then I save coverage factor and value for "MA_Zone63PP" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Zone10 @Condo @Coop @Export @NewBusiness @Endorsement @PreProdNew
  Scenario: MA Base Rate Change - Zone 10 Condo PreProd

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "155 Warner Ave"
    * I set "City_Name_Txt" to "Worcester"
    * I set "Zip_Code" to "01604"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Condo/Co-op"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,753"
    Then I save coverage factor and value for "MA_Zone10PP" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    And I verify base rate "Base Rate/2,753"
    Then I save coverage factor and value for "MA_Zone10PP" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Zone44 @Tenants @Export @NewBusiness @Endorsement @PreProdNew
  Scenario: MA Base Rate Change - Zone 44 Tenants PreProd

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "24 Windswept Dr"
    * I set "City_Name_Txt" to "West Wareham"
    * I set "Zip_Code" to "02576"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Tenants"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,923"
    Then I save coverage factor and value for "MA_Zone44TPP" in "STG/US45500" in "Base_Rates" excel file for "New Business"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    Then I verify base rate "Base Rate/2,923"
    Then I save coverage factor and value for "MA_Zone44TPP" in "STG/US45500" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Zone63 @Homeowner @Export @NewBusiness @Endorsement @Rewrite @PreProd
  Scenario: MA Base Rate Change - Zone 63 Homeowner Rewrite

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "25 Broadway"
    * I set "City_Name_Txt" to "Nantucket"
    * I set "Zip_Code" to "02554"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "10%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/10,138"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

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
    When I navigate to premium details page
    Then I verify base rate "Base Rate/10,138"
    * I click exit button
    * I complete rewrite transaction

  @Zone10 @Condo @Coop @Export @NewBusiness @Endorsement @Rewrite @PreProd
  Scenario: MA Base Rate Change - Zone 10 Condo Rewrite

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "155 Warner Ave"
    * I set "City_Name_Txt" to "Worcester"
    * I set "Zip_Code" to "01604"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Condo/Co-op"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,753"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 01/01/2025 |
    Then I review changes
    * I rate an endorsement
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,753"
    * I click exit button
    * I complete rewrite transaction

  @Zone44 @Tenants @Export @NewBusiness @Endorsement @Rewrite @PreProd
  Scenario: MA Base Rate Change - Zone 44 Tenants Rewrite

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "24 Windswept Dr"
    * I set "City_Name_Txt" to "West Wareham"
    * I set "Zip_Code" to "02576"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/10/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Tenants"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,923"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

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
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,923"
    * I click exit button
    * I complete rewrite transaction

  @Zone63 @Homeowner @Export @DayPrior @PreProd
  Scenario: MA Base Rate Change - Zone 63 Homeowner DayPrior

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "25 Broadway"
    * I set "City_Name_Txt" to "Nantucket"
    * I set "Zip_Code" to "02554"
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "10%"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/9,843"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    Then I verify base rate "Base Rate/9,843"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Zone10 @Condo @Coop @Export @DayPrior @PreProd
  Scenario: MA Base Rate Change - Zone 10 Condo DayPrior

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "155 Warner Ave"
    * I set "City_Name_Txt" to "Worcester"
    * I set "Zip_Code" to "01604"
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Condo/Co-op"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,546"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    And I verify base rate "Base Rate/2,546"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Zone44 @Tenants @Export @DayPrior @PreProd
  Scenario: MA Base Rate Change - Zone 44 Tenants DayPrior

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "24 Windswept Dr"
    * I set "City_Name_Txt" to "West Wareham"
    * I set "Zip_Code" to "02576"
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    * I set "Residence_Type" to "Tenants"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I verify base rate "Base Rate/2,468"
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I navigate to premium details page
    Then I verify base rate "Base Rate/2,468"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @CompareBaseRates
  Scenario Outline: I compare Base Rates recorded on 11/01/2024 "<file1>" and new "<file2>" base rates

    Then I compare "<file1>" with "<file2>" base rates in "STG/US45500/"

    Examples:
      | file1                    | file2                             |
      | MA_Zone1_Base.xlsx       | Base_Rates_MA_Zone1_null.xlsx     |
      | MA_Zone34_Base.xlsx      | Base_Rates_MA_Zone34_null.xlsx    |
      | MA_Zone63_Base.xlsx      | Base_Rates_MA_Zone63_null.xlsx    |
      | MA_Zone10_RC_Base.xlsx   | Base_Rates_MA_Zone10_RC_null.xlsx |
      | MA_Zone1_RC_Base.xlsx    | Base_Rates_MA_Zone1_RC_null.xlsx  |
      | MA_Zone44T_Base.xlsx     | Base_Rates_MA_Zone44T_null.xlsx    |
      | MA_Zone44T_RC_Base.xlsx  | Base_Rates_MA_Zone44T_RC_null.xlsx|
