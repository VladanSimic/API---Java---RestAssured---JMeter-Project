@HomeownersSurplus @US45587 @TF107 @TF1153 @TF1157
Feature: PSE
  As a Programs Executive I want to be able to write PSE policies for NY and TX
  so that we can continue to offer HS coverage to clients in those states

  @TC89438 @TC89440 @TC89441 @TC89443
  Scenario Outline: Verify that PSE Carrier is available in the dropdown on the UI and it can be manually assigned for NY/TX HS policies on - New Business - Endorsement - after 01/01/2025 - Renewal - after 02/05/2025

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/25"
    * I set "Endorsement_Effective_Date_END" to "02/30/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page

    Then I verify "Underwriting Company" input 1 has value "PURE Specialty Exchange"

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    * I navigate to policy image page

    Then I verify "Underwriting Company" input 1 has value "PURE Specialty Exchange"

    When I click exit button
    * I initiate new endorsement

    Then I verify "Underwriting Company" input 1 has value "PURE Specialty Exchange"

    When I review changes
    * I rate a quote
    * I issue an endorsement
    * I select a transaction "Endorsement"
    * I navigate to policy image page

    Then I verify "Underwriting Company" input 1 has value "PURE Specialty Exchange"

    When I navigate to transactions or endorsements
    * I click exit button
    * I create a renewal
    * I navigate to policy image page

    Then I verify "Underwriting Company" input 1 has value "PURE Specialty Exchange"


    Examples:
      | TC_ID  | Company                 |
      | NY_001 | PURE Specialty Exchange |
      | TX_001 | PURE Specialty Exchange |


  @TC89444 @TC89445
  Scenario Outline: Verify that PSE Carrier is not available in the dropdown on the UI for NY/TX HS before 02/15/2025.

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "01/15/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I navigate to quotes page
    * I initiate a new quote
    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page

    Then I verify "Underwriting Company" input has no value "PURE Specialty Exchange"

    Examples:
      | TC_ID  | Company                 |
      | NY_001 | PURE Specialty Exchange |
      | TX_001 | PURE Specialty Exchange |