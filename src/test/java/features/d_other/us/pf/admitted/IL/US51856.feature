@PrimaryFlood @Admitted @US51856
Feature: PF Admitted - Copy Storm Surge block to Newly Created Flood Node - IL

  @TC100724
  Scenario: US51856 - Verify that the 'storm surge' block is added to Flood node below 'flood information' block for HO IL state (NB/END scenario)
    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "1202 W Huron St"
    * I set "City_Name_Txt" to "Chicago"
    * I set "Zip_Code" to "60642"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - NB"

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 938 N Noble St | Chicago | IL    | 60642 | Condo/Co-op   | 7500000 |           | 10,000 |            | 2 |
    * I navigate to "Chicago IL" 2 page
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
      | addressLine1      | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 1457 W Erie St #3 | Chicago | IL    | 60642 | Tenants       | 7500000 |           | 10,000 |            | 3 |
    * I navigate to "Chicago IL" 3 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - END"

  @TC100755
  Scenario: US51856 - Verify that the 'storm surge' block is added to Flood node below 'flood information' block for HO IL state (NB/REN scenario)
    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Address_Line_1_Txt" to "1202 W Huron St"
    * I set "City_Name_Txt" to "Chicago"
    * I set "Zip_Code" to "60642"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - NB"

    When I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 938 N Noble St | Chicago | IL    | 60642 | Condo/Co-op   | 7500000 |           | 10,000 |            | 2 |
    * I navigate to "Chicago IL" 2 page
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
      | addressLine1      | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 1457 W Erie St #3 | Chicago | IL    | 60642 | Tenants       | 7500000 |           | 10,000 |            | 3 |
    * I navigate to "Chicago IL" 3 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - RNW"

  @TC100756
  Scenario: US51856 - Verify that the 'storm surge' block is added to Flood node below 'flood information' block for HO IL state on Renewal transaction
    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2024"
    * I set "Address_Line_1_Txt" to "1202 W Huron St"
    * I set "City_Name_Txt" to "Chicago"
    * I set "Zip_Code" to "60642"

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
    * I navigate to "Chicago IL" 1 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - RNW"

    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 1457 W Erie St #3 | Chicago | IL    | 60642 | Condo/Co-op   | 7500000 |           | 10,000 |            | 2 |
    * I navigate to "Chicago IL" 2 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - RNW"

  @TC100757
  Scenario: US51856 - Verify that the 'storm surge' block is added to Flood node below 'flood information' block for HO IL state on Midterm Endorsement for newly added locations
    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Address_Line_1_Txt" to "1202 W Huron St"
    * I set "City_Name_Txt" to "Chicago"
    * I set "Zip_Code" to "60642"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to "Chicago IL" 1 page
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location
    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 938 N Noble St | Chicago | IL    | 60642 | Condo/Co-op   | 7500000 |           | 10,000 |            | 2 |
    * I navigate to "Chicago IL" 2 page
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
    * I navigate to "Chicago IL" 1 page
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - RNW"

  @TC100759
  Scenario: US51856 - Verify that the 'storm surge' block is not moved from Location page for HO IL state before NB PD Filing date
    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Address_Line_1_Txt" to "1202 W Huron St"
    * I set "City_Name_Txt" to "Chicago"
    * I set "Zip_Code" to "60642"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page

    Then I verify block "storm surge" is "not visible" on page
    * I take screenshot "storm surge - NB"

  @TC100760
  Scenario: US51856 - Verify that the 'storm surge' block is not moved from Location page for HO IL state before REN PD Filing date
    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I set "Effective_Date" to "02/09/2024"
    * I set "Address_Line_1_Txt" to "1202 W Huron St"
    * I set "City_Name_Txt" to "Chicago"
    * I set "Zip_Code" to "60642"

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
    * I navigate to "Chicago IL" 1 page

    Then I verify block "storm surge" is "visible" on page
    * I take screenshot "storm surge - NB"