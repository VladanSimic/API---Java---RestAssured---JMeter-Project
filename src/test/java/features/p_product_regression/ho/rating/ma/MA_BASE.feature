@MA @Base @BaseRate @BaseRates
Feature: MA Home - Base Rates Validation

  @Zone1 @Homeowner @Condo @Tenants @Homeowners
  Scenario: MA Homeowners Base Rate - Zone 1

    Given I use "MA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I load base rate validation file "MA" sheet "Homeowners"
    * I set Effective Date from Base Rate validation data
    * I set expected base rates for HO lob zone "1"
    * I set "Address_Line_1_Txt" to "205 East Stahl Road"
    * I set "City_Name_Txt" to "Ashley Falls"
    * I set "Zip_Code" to "01222"
    * I set "Hurricane_And_Named_Storm_Ded" to "Not Available"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate homeowners base rate factors based on base rate excel file data
    | address             | residenceType      |
    | 205 East Stahl Road | Homeowner          |
    | 206 East Stahl Road | CCT                |
    | 207 East Stahl Road | CCT                |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
