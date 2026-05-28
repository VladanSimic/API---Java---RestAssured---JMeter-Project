@PrimaryFlood @Admitted @US51897
Feature: PF Admitted - Copy Storm Surge block to Newly Created Flood Node - CO

  @TC100761
  Scenario: US51897 - Verify that the 'storm surge' block is added to Flood node below 'flood information' block for HO CO state (NB/END scenario)
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - NB"

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 5646 Jellison Street | Arvada | CO    | 80002 | Condo/Co-op   | 7500000 |           | 10,000 | 5%         | 2 |
    * I navigate to "Arvada CO" 2 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - NB new location"

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1          | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 9350 Grandview Avenue | Arvada | CO    | 80002 | Tenants       | 7500000 |           | 10,000 | 5%         | 3 |
    * I navigate to "Arvada CO" 3 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - END"

  @TC100762
  Scenario: US51897 - Verify that the 'storm surge' block is added to Flood node below 'flood information' block for HO CO state (NB/REN scenario)
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - NB"

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 5646 Jellison Street | Arvada | CO    | 80002 | Condo/Co-op   | 7500000 |           | 10,000 | 5%         | 2 |
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - NB new location"

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1          | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 9350 Grandview Avenue | Arvada | CO    | 80002 | Tenants       | 7500000 |           | 10,000 | 5%         | 3 |
    * I navigate to "Arvada CO" 3 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - RNW"

  @TC100763
  Scenario: US51897 - Verify that the 'storm surge' block is added to Flood node below 'flood information' block for HO CO state on Renewal transaction
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2024"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal

    * I navigate to policy image page
    * I navigate to "Arvada CO" 1 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - RNW"

    * I navigate to policy image page
    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 5646 Jellison Street | Arvada | CO    | 80002 | Condo/Co-op   | 7500000 |           | 10,000 | 5%         | 2 |
    * I navigate to "Arvada CO" 2 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - RNW"

  @TC100768
  Scenario: US51897 - Verify that the 'storm surge' block is added to Flood node below 'flood information' block for HO CO state on Midterm Endorsement for newly added locations
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1         | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 5646 Jellison Street | Arvada | CO    | 80002 | Condo/Co-op   | 7500000 |           | 10,000 | 5%         | 2 |
    * I navigate to "Arvada CO" 2 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - END"

    When I fill out HO Flood Coverage page for additional location
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I issue an endorsement
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Arvada CO" 1 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - RNW"

  @TC100766
  Scenario: US51897 - Verify that the 'storm surge' block is not moved from Location page for HO CO state before NB PD Filing date
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "storm surge - NB"

  @TC100767
  Scenario: US51897 - Verify that the 'storm surge' block is not moved from Location page for HO CO state before REN PD Filing date
    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "02/09/2024"
    * I set "Address_Line_1_Txt" to "5235 Dover Street"
    * I set "City_Name_Txt" to "Arvada"
    * I set "Zip_Code" to "80002"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Arvada CO" 1 page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - NB"