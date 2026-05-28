@PrimaryFlood @PFHS @US52835
Feature: Change Request: HS - Update Location Coverage Page with Excess Flood Block - UI & Function - NJ
  As a product manager, I want to move Excess Flood block from the "Optional Coverages" page to "Location Coverage" page of the HS LOB

  @TC105737
  Scenario: US52835 - Verify that the 'excess flood' block is placed just below "flood information" block on the Location Coverage page (NB/END) - NJ_001 - 09/07/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Budd Lake NJ" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - NB"

    When I rate, bind and initiate new endorsement
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - END"

  @TC105738
  Scenario: US52835 - Verify that the 'excess flood' block is placed just below "flood information" block on the Location Coverage page (NB/RNW) - NJ_001 - 09/07/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Residence_Type" to "Condo/Co-op"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Budd Lake NJ" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - NB"

    When I rate, bind and initiate new renewal
    * I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - RNW"

  @TC105739
  Scenario: US52835 - Verify that the 'excess flood' block is just below "flood information" block on the Location Coverage page (RNW) - NJ_001 - 09/07/2024

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to "Budd Lake NJ" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility (first location) - RNW"

    When I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility (second location) - RNW"

  @TC105740
  Scenario: US52835 - Verify that the 'excess flood' block is placed just below "flood information" block on the Location Coverage page (NB/END) - NJ_001 - 09/06/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Manual_Subjectivities" to ""
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I navigate to "Budd Lake NJ" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility (first location) - END"

    When I navigate to Home Surplus Lines Policy page and add new risk location with basic details only
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1229 Spray Avenue | Beachwood | NJ    | 08722 | Homeowner     | 7500000 |           | 10,000 | 2%         |
    * I click order property details button
    * I navigate to "Beachwood NJ" page

    Then I verify block "flood information" is at position 9 on page
    * I verify block "excess flood" is at position 10 on page
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block visibility - END"

  @TC105981
  Scenario: US52835 - Verify that the 'excess flood' block is not read-only when UW Company is Palomar NB - NJ_001 - 09/07/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to Home Surplus Lines Policy Page

    Then I click "Manager Override" checkbox in "underwriting company" block
    * I type "Palomar Excess and Surplus Insurance Company" to "Underwriting Company" dropdown

    When I navigate to "Budd Lake NJ" page

    Then I verify the "Do you wish to include excess flood coverage?" question with yes and no radio buttons is "not disabled" in "excess flood" block
    * I verify the "Refer Rate:" question with yes and no radio buttons is "not disabled" in "excess flood" block
    * I scroll to the bottom of the page
    * I take screenshot "Excess flood block fields enabled - NB"

  @TC105983
  Scenario: US52835 - Verify that the 'excess flood' block is not on the Location page before NB PD Filing date - NJ_001 - 09/06/2025

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I navigate to "Budd Lake NJ" page
    * I click "flood information" block
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block invisibility (Location page)"

    When I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood block visibility (Optional coverages page)"

  @TC105985
  Scenario: US52835 - Verify that the 'excess flood' block is not on the Location page before REN PD Filing date (NB/RNW) - NJ_001 - 02/09/2024

    Given I use "NJ_001" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "02/09/2024"
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HS" quote for a new customer
    * I rate, bind and initiate new renewal
    * I navigate to "Budd Lake NJ" page
    * I click "flood information" block
    * I scroll to the bottom of the page

    Then I verify block "excess flood" is "not visible" on page
    * I take screenshot "Excess flood block invisibility (Location page) - RNW"

    When I navigate to "Optional Coverages" page

    Then I verify block "excess flood" is "visible" on page
    * I take screenshot "Excess flood block visibility (Optional coverages page) - RNW"